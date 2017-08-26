class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        if(s.length()%2 == 1 || s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')'){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == ']'){
                    char x = stack.pop();
                    if(x != '['){
                        return false;
                    }
                }
                if(s.charAt(i) == '}'){
                    char x = stack.pop();
                    if(x != '{'){
                        return false;
                    }
                }
                if(s.charAt(i) == ')'){
                    char x = stack.pop();
                    if(x != '('){
                        return false;
                    }
                }
            }
        }
        if(stack.size() != 0){
            return false;
        }
    return true;
    }
}