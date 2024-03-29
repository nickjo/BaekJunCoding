package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex3078 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer>[] queues = new Queue[21];
        long count = 0;

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i=0; i < 21; i++){
            queues[i] = new LinkedList<>();
        }

        for (int j=0; j < N; j++){
            int length = br.readLine().trim().length();

            if (queues[length].isEmpty()){
                queues[length].offer(j);
            }else{
                while (j - queues[length].peek() > K){
                    //System.out.println("==j: " + j + ", peek: " + queues[length].peek() + ", length: " + length);
                    queues[length].poll();
                    if (queues[length].isEmpty()){
                        break;
                    }
                } // end while
                count += queues[length].size();
                queues[length].offer(j);
            } // end if
        } // end for

        System.out.println(count);
    }
}
