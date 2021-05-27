class Solution {
    public String solution(int n) {
        return divide(n);
    }

    private String divide(int n){
        String result ="";
        if(n/3>3){
            if(n%3==0){
                result = result.concat(divide(n/3-1));
                result = result.concat(String.valueOf(4));
            }else{
                result = result.concat(divide(n/3));
                result = result.concat(String.valueOf(n%3));
            }
        }else {
            if(n==1 || n==2 || n==3){
                if(n==3){
                    result = result.concat(String.valueOf(4));
                }else{
                    result = result.concat(String.valueOf(n));
                }
            } else if(n/3==0){
                return result;
            }else if(n%3==0){
                result  = result.concat(String.valueOf((n/3)-1));
                result = result.concat(String.valueOf(4));
            }else {
                if (n / 3 == 3) {
                    result = result.concat(String.valueOf(n/3+1));
                    result = result.concat(String.valueOf(n%3));
                }else{
                    result = result.concat(String.valueOf(n/3));
                    result = result.concat(String.valueOf(n%3));
                }
            }
        }
        return result;
    }
}
