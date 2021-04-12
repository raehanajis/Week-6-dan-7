/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author ASUS
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                int JumMhs = 8;
                int JumJb = 10;
        //Array 2 dimensi untuk jawaban masing masing mahasiswa
        char[][] KjMhs = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        
        //Array satu dimensi untuk Kunci jawaban
        char[] Kj = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] Nilai = new int[JumMhs]; // Array nilai dengan jumlah mahasiswa

        //memeriksan kunci jawaban mahasiswa dengan kunci jawaban
        for(int i=0; i<JumMhs; ++i) {
            int correct = 0;
            for(int j=0; j<JumJb; ++j) {
                if(KjMhs[i][j] == Kj[j]) {
                    correct++;
                }
            }
            Nilai[i] = correct;
        }
        
        //hasil
        System.out.println("jawaban benar dari masing-masing mahasiswa: \n");
        for(int i=0; i<JumMhs; ++i) {
            System.out.println("Mhs " + i + " jumlah jawaban benar adalah " + Nilai[i]+" dari 10 Soal");
        }
    }
    
}
