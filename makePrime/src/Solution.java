public class Solution {
    public boolean Checkprime(int num){
        for(int i= 2; i<num;i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i<nums.length ; i++){
            for(int j =i+1; j<nums.length ; j++){
                for(int k = j+1 ; k<nums.length;k++){
                    int temp = nums[i]+nums[j]+nums[k];
                    if(Checkprime(temp)){
                        answer++;
                    }
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}