import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer>[] stacks = new Stack<Integer>().toArray(new Stack[board[0].length]);
        Stack<Integer> basket = new Stack<>();
        for(int i = 0; i <board[0].length;i++){
            stacks[i] = new Stack<>();
            for(int j =board[0].length-1; j>=0; j--){
                stacks[i].push(board[j][i]);
            }
        }
        for(int  i = 0; i <moves.length ; i++){
            if(!stacks[moves[i]-1].empty()){
                while(true){
                    int num = stacks[moves[i]-1].pop();
                    if(num==0 && stacks[moves[i]-1].empty()){
                        break;
                    }
                    if(num!=0){
                        if(!basket.empty()){
                            int temp = basket.pop();
                            if(temp==num){
                                answer = answer+2;
                            }else{
                                basket.push(temp);
                                basket.push(num);
                            }
                            break;
                        }else{
                            basket.push(num);
                            break;
                        }
                    }
                }
            }else{
            }

        }
        return answer;
    }
}
