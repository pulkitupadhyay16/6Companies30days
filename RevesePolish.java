class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st =new Stack<>();
        for(String op : tokens){
            if(op.equals("+")){
                int a =Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(String.valueOf(a+b));
            }else if(op.equals("-")){
                int b =Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                st.push(String.valueOf(a-b));

            }else if(op.equals("*")){
                int a =Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(String.valueOf(a*b));
            }else if(op.equals("/")){
                int b =Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                st.push(String.valueOf(a/b));


            }else{
                st.push(op);
            }
        }
        return Integer.parseInt(st.pop());
    }
}