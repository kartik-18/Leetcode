class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s = new Stack<Integer>();
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("+")){
                int x =s.pop();
                int store = s.peek() + x;
                s.push(x);
                s.push(store);
            }
            
            else if(operations[i].equals("D")){
                s.push(s.peek() *2);
            }
            
            else if(operations[i].equals("C")){
                s.pop();
            }
            
            else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(s.isEmpty() == false){
             sum = sum + s.pop();
        }
        return sum;
    }
}