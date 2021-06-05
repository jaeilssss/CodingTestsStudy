
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer= 1;
        int  num = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int  i : priorities){
            priorityQueue.offer(i);
        }
        while(!priorityQueue.isEmpty()){
            for(int  i = 0; i<priorities.length;i++){
                if(priorities[i]==priorityQueue.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
