import java.util.ArrayList;

class Soluction{
public int[] Soluction(int[] answers) {
        int[] answer = {};
        int [] student1 = {1,2,3,4,5};
        int [] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] student3 = {3,3,1,1,2,2,4,4,5,5};
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        for(int i = 0; i< answers.length ; i++) {
        if (student1[i % student1.length] == answers[i]) {
        score1++;
        }
        if (student2[i % student2.length] == answers[i]) {
        score2++;
        }
        if (student3[i % student3.length] == answers[i]) {
        score3++;
        }
        }
        int max = Math.max(Math.max(score1, score2),score3);
        ArrayList<Integer> list = new ArrayList<>();
        if(score1==max) list.add(1);
        if(score2==max) list.add(2);
        if(score3==max) list.add(3);


        answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
        answer[j]=list.get(j);
        }

        return answer;
        }
        }
