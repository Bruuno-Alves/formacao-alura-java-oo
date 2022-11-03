import java.util.Scanner;


public class SomaFatoriais {


    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
        int n = Integer.parseInt(scan.nextLine());
        int indexMax = 0;
        int[] d = new int[n + 1];
        int minQuadPerf = n;

        for (int i = 0; i < d.length; i++ ) {
          int numQuad = (i + 1) * (i + 1);
          if ( numQuad <= n) {
            d[i] = numQuad;
            indexMax = i;
          }
          else {
            break;
          }
        }
        
        for (int k = indexMax; k >= 0; k--) {
          int auxMinQP = 0;
          int soma = 0;


          for (int i = k; i >= 0; i--) {
            while (d[i] + soma <= n) {
              soma += d[i];
              auxMinQP += 1;
            }
          }
          
          if (auxMinQP < minQuadPerf) {
            minQuadPerf = auxMinQP;
          }
        }
        
        System.out.println(minQuadPerf);
    }
}