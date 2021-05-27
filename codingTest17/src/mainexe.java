public class mainexe {
    public static void main(String []  args){
        Solution solution = new Solution();
        int [] answer = solution.solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1});
        for(int i =0 ; i<answer.length; i++){
            System.out.println(answer[i]);
        }

    }
}
