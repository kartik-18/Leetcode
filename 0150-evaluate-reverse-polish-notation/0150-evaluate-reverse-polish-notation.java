class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int a =0;
        int b =0;
        for(String tok: tokens){
            switch(tok){
                case "+":
                    b = s.pop();
                    a = s.pop();
                    s.push(a+b);
                    break;
                case "*":
                    b = s.pop();
                    a = s.pop();
                    s.push(a*b);
                    break;
                case "-":
                    b = s.pop();
                    a = s.pop();
                    s.push(a-b);
                    break;
                case "/":
                    b = s.pop();
                    a = s.pop();
                    s.push(a/b);
                    break;
                default:
                    s.push(Integer.parseInt(tok));
                    break;
            }
        }
        return s.pop();
    }
}