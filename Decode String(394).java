class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> stack = new Stack<>();
        String sub = "";
        int index = 0;
      
        while (index < s.length()) {
            //Checks if its digit
            if (Character.isDigit(s.charAt(index))) {
                int amount = 0;
                //Calculates the whole digit
                while(Character.isDigit(s.charAt(index))) {
                    amount = 10 * amount + (s.charAt(index) - '0'); 
                    index++;
                }
                count.push(amount); 
              //Open bracket = push current substring in stack
            } else if (s.charAt(index) == '[') {
                stack.push(sub);
                sub = "";
                index++;
              //Closing bracket means pop from stack and append the number of time from count stack
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(stack.pop());
                int repeat = count.pop();
                for(int i = 0; i < repeat; i++) {
                    temp.append(sub);
                }
                sub = temp.toString();
                index++;
              //if regular letter, just add to string
            } else {
                sub += s.charAt(index);
                index++;
            }
        }
        return sub;
    }
}
