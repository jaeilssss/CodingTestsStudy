public class MainClass {

    public static void main(String [] args){
        Solution solution = new Solution();
            int [] result = solution.solution(new int[]{1, 5, 10, 12, 7},5);
            for(int i=0; i<result.length ; i++){
                System.out.println(result[i]);
            }
    }
}
