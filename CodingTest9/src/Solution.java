import java.util.HashMap;

class Solution {
    public HashMap<Integer , Integer> setting(HashMap<Integer,Integer> map , int num){
       if(num==2){
           map.put(1,1);
           map.put(4,2);
           map.put(7,3);
           map.put(3,1);
           map.put(6,2);
           map.put(9,3);
           map.put(5,1);
           map.put(8,2);
           map.put(2,0);
           map.put(0,3);
           map.put(10,4);
           map.put(11,4);
       }else if(num==5){
           map.put(1,2);
           map.put(4,1);
           map.put(7,2);
           map.put(3,2);
           map.put(6,1);
           map.put(9,2);
           map.put(2,1);
           map.put(8,1);
           map.put(5,0);
           map.put(0,2);
           map.put(10,3);
           map.put(11,3);
       }else if(num==8){
           map.put(1,3);
           map.put(4,2);
           map.put(7,1);
           map.put(3,3);
           map.put(6,2);
           map.put(8,0);
           map.put(9,1);
           map.put(2,2);
           map.put(5,1);
           map.put(0,1);
           map.put(10,2);
           map.put(11,2);
       }else{
           map.put(1,4);
           map.put(4,3);
           map.put(7,2);
           map.put(3,4);
           map.put(6,3);
           map.put(9,2);
           map.put(2,3);
           map.put(5,2);
           map.put(8,1);
           map.put(0,0);
           map.put(10,1);
           map.put(11,1);
       }
       return map;
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";
        HashMap<Integer,Integer> two = new HashMap<>();
        HashMap<Integer,Integer> five = new HashMap<>();
        HashMap<Integer,Integer> eight = new HashMap<>();
        HashMap<Integer,Integer> zero = new HashMap<>();
       two = setting(two,2);
        five = setting(five,5);
        eight = setting(eight,8);
        zero = setting(zero,0);

        int right = 10;
        int left = 11;
        for(int i =0 ; i<numbers.length ; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer = answer.concat("L");
                left = numbers[i];
            }else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                answer = answer.concat("R");
                right = numbers[i];
            }else{
                 if(numbers[i]==2){
                     if(two.get(left).equals(two.get(right))){
                         if(hand.equals("right")){
                             right = numbers[i];
                             answer = answer.concat("R");
                         }else{
                             answer = answer.concat("L");
                             left = numbers[i];
                         }
                     }
                    else if(two.get(left)>two.get(right)){
                        answer = answer.concat("R");
                        right = numbers[i];
                    }else {
                        answer = answer.concat("L");
                        left = numbers[i];
                    }
                }else  if(numbers[i]==5){
                     if(five.get(left).equals(five.get(right))){
                         if(hand.equals("right")){
                             right = numbers[i];
                             answer = answer.concat("R");
                         }else{
                             answer = answer.concat("L");
                             left = numbers[i];
                         }
                     } else if(five.get(left)>five.get(right)){
                        answer = answer.concat("R");
                        right = numbers[i];
                    }else{
                        answer = answer.concat("L");
                        left = numbers[i];
                    }
                }else if(numbers[i]==8){
                     if(eight.get(left).equals(eight.get(right))){
                         if(hand.equals("right")){
                             right = numbers[i];
                             answer = answer.concat("R");
                         }else{
                             answer = answer.concat("L");
                             left = numbers[i];
                         }
                     } else if(eight.get(left)>eight.get(right)){
                        answer = answer.concat("R");
                        right = numbers[i];
                    }else{
                        answer = answer.concat("L");
                        left = numbers[i];
                    }
                }else if(numbers[i]==0){
                     if(zero.get(left).equals(zero.get(right))){
                         if(hand.equals("right")){
                             right = numbers[i];
                             answer = answer.concat("R");
                         }else{
                             answer = answer.concat("L");
                             left = numbers[i];
                         }
                     } else if(zero.get(left)>zero.get(right)){
                        answer = answer.concat("R");
                        right = numbers[i];
                    }else{
                        answer = answer.concat("L");
                        left = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}