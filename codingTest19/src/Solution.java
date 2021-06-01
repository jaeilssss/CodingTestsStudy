
import sun.jvm.hotspot.memory.Universe;

import java.util.ArrayList;

class Solution {
    int position ;
    public int solution(int[] priorities, int location) {
        int answer= location+1;
        position = location;

       merge(0,priorities.length-1,priorities);
        for(int i =0; i<priorities.length ; i++){
            System.out.println(priorities[i]);
        }
        System.out.println(" ");
        return position;
    }
    public int [] merge(int start, int end ,int [] priorities){
        if(start<end){
            int mid = (start+end)/2;
            priorities = merge(start,mid,priorities);
            System.out.println("first "+ position);
            priorities = merge(mid+1,end,priorities);
            System.out.println("second " + position);
            priorities = sort(start,mid,end,priorities);
            System.out.println("third "+ position);
        }

        return priorities;
    }
    public int [] sort(int start , int mid , int end , int [] priorities){
        int leftStart = start;
        int rightStart = mid+1;
        int i = start;
        int [] temp = new int[priorities.length];
        while (true){
            if(priorities[leftStart]<priorities[rightStart]){
                temp[i++] = priorities[rightStart];
                if(rightStart==position){
                    position = i-1;
                    rightStart++;
                }else{
                    rightStart++;
                }
            }else if(priorities[leftStart]>=priorities[rightStart]){
                temp[i++] = priorities[leftStart];
                if(leftStart==position){
                    position=i-1;
                    leftStart++;
                }else{
                    leftStart++;
                }
            }if(leftStart>mid){
                for(int num = rightStart ;num<=end;num++){
                    if(num==position){
                        position=i;
                    }
                    temp[i++] = priorities[num];
                }
                for(int num = start ; num<=end ; num++){
                    priorities[num] = temp[num];
                }
                return priorities;
            }else if(rightStart>end){
                for(int  num = leftStart ; num <=mid;num++){
                    if(num==position){
                        position=i;
                    }

                    temp[i++] = priorities[num];
                }
                for(int num = start; num<=end; num++){
                    priorities[num] = temp[num];
                }
                return priorities;
            }
        }

    }

}
