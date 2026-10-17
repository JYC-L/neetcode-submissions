class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        operators = ['+', '-', '*', '/'] 

        for i in range(len(tokens)):
            if tokens[i] in operators:
                second = int(stack.pop())
                first = int(stack.pop())
                if tokens[i] == '+':
                    stack.append(first + second)
                elif tokens[i] == '-':
                    stack.append(first - second)
                elif tokens[i] == '*':
                    stack.append(first * second)
                elif tokens[i] == '/':
                    stack.append(first / second)
            else:
                stack.append(tokens[i])
        return int(stack.pop())  