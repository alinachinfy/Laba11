import java.util.Arrays;
import java.util.Scanner;

public class Spoki {
    int[] spo;
    int ki;
    Spoki(int ki){
        this.ki=ki;
        spo = new int[ki];
    }
    void inputSpo(){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < spo.length; i++) {
            this.spo[ki]= sc.nextInt();
        }
    }
    void outputSpo(){
        for (int value : spo) {
            System.out.println(value);
        }
    }
    void sortSpo(){
        Arrays.sort(spo);
    }
    void sortSpo1(){
        Arrays.sort(spo);
        for (int i=spo.length-1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if (spo[j] > spo[j+1]){
                    int gha = spo[j];
                    spo[j] = spo[j+1];
                    spo[j+1] = gha;
                }
            }
        }
    }
}
