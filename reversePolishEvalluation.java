/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

Note that division between two integers should truncate toward zero.

It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.

 

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
*/Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int operand1=stack.peek();
                stack.pop();
                int operand2=stack.peek();
                stack.pop();
                int newVal=operand1+operand2;
                stack.push(newVal);
            }else if(tokens[i].equals("-")){
                int operand1=stack.peek();
                stack.pop();
                int operand2=stack.peek();
                stack.pop();
                int newVal=operand2-operand1;
                stack.push(newVal);
            }else if(tokens[i].equals("*")){
                int operand1=stack.peek();
                stack.pop();
                int operand2=stack.peek();
                stack.pop();
                int newVal=operand1*operand2;
                stack.push(newVal);
            }else if(tokens[i].equals("/")){
                int operand1=stack.peek();
                stack.pop();
                int operand2=stack.peek();
                stack.pop();
                int newVal=operand2/operand1;
                stack.push(newVal);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            System.out.println(stack.peek());
        }
        return stack.peek();
    }
