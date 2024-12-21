import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int max = (2*a) - 1;
        int fibot = max / 2;

        for(int i =0; i < max; i++){
            for(int j = 0; j < max; j++){
                if(i <= fibot){
                    if(j < fibot - i) System.out.print(' ');
                    else if (j <= fibot + i) System.out.print('*');
                    else break;
                } else {
                    if(j <= fibot - (max-i)) System.out.print(' ');
                    else if(j < fibot + (max-i)) System.out.print('*');
                    else break;
                }
            }
            System.out.println();
        }
    }
}