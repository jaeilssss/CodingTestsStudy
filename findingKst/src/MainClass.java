public class MainClass {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution.solution(array, commands);
        for (int i = 0; i < commands.length; i++) {
            System.out.println(result[i]);
        }
    }
}
