import javax.lang.model.util.AbstractTypeVisitor6;

public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int sum =0;
        int i = 10;
        while(true){
            if(temp==0){
                break;
            }else{
                sum = sum+(temp%i);
                temp=temp/i;

            }
        }
        System.out.println(sum);
        if(x%sum!=0) answer = false;
        return answer;
    }
}
