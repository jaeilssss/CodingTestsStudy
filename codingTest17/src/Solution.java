import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int start = 0;
        int step = 1;
        HashMap<Integer , Integer> map = new HashMap<>();
        while(true){
            for(int i = 0; i<progresses.length; i++){
                progresses[i] = progresses[i]+speeds[i];
                if(progresses[i]>100){
                    progresses[i]=100;
                }
                if(progresses[i]==100){
                    if(start==i){
                        if(map.get(step)==null){
                            map.put(step,1);
                        }else{
                            map.put(step,map.get(step)+1);
                        }
                        start++;
                    }
                }
            }
            if(start==progresses.length){
                break;
            }
     step++;
        }
        int i =0;
        int [] sorted= new int[map.keySet().size()];
        for(int k : map.keySet()){
            sorted[i++] = k;
        }
         Arrays.sort(sorted);
        i=0;
        answer = new int[map.keySet().size()];
        for(int k : sorted){
            answer[i++]=map.get(k);
        }
        return answer;
    }
}
