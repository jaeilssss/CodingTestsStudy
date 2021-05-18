class Solution {
    private long sum(int a , int b){
        long result = 0;
        for(int i = a ; i<=b;i++){
            result = result+i;
        }
        return result;
    }
    public long solution(int a, int b) {
        return a < b  ? sum(a,b): sum(b,a);
    }
}