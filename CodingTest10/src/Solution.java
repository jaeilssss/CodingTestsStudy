
    class Solution {
        public String solution(String phone_number) {
            char [] array = phone_number.toCharArray();
            for(int i = phone_number.length()-1;i>=0;i--){
                if(phone_number.length()-i>4){
                    array[i] = '*';
                }
            }
            return String.valueOf(array);
        }
    }

