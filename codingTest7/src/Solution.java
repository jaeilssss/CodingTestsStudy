public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String day = "FRI";
        for(int i = 1; i<=a ; i++){
            int temp = 1;
            while(true){
                if(i==1 || i ==3 || i==5 ||i==7||i==8||i==10||i==12){
                    if(temp==32){
                        break;
                    }
                }else{
                    if(temp==31){
                        break;
                    }
                }
                if(i==2 && temp==30){
                    break;
                }else if(i==a && temp==b){
                    answer = day;
                    break;
                }else{
                    temp++;
                    if(day.equals("SUN")){
                        day = "MON";
                    }else if(day.equals("MON")){
                        day = "TUE";
                    }else if(day.equals("TUE")){
                        day = "WED";
                    }else if(day.equals("WED")){
                        day = "THU";
                    }else if(day.equals("THU")){
                        day = "FRI";
                    }else if(day.equals("FRI")){
                        day = "SAT";
                    }else {
                        day = "SUN";
                    }
                }
            }

            if(answer.length()>0){
                return answer;
            }
        }
        return answer;
    }
}