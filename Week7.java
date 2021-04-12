/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Week7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat course
        course matkul1 = new course("Multimedia system");
        course matkul2 = new course("Object O Programing");
        //list masiswa pada matkul1
        matkul1.addStudent("Peter jones");
        matkul1.addStudent("Kim Smith");
        matkul1.addStudent("Anne Kennedy");
        //list mahasiswa pada matkul2
        matkul2.addStudent("Peter Jones");
        matkul2.addStudent("steve Smith");
        
        
        System.out.println("Number of Student in matkul1: "+ matkul1.getNumberStuden());
        //menampilkan list pada mahasiswa yang mengikuti matkul1
        ArrayList<String> matkul1student = matkul1.getStudents();
        for(int i=0; i<matkul1student.size(); i++){
            System.out.println(matkul1student.get(i) );
        }
        System.out.println("\nNumber of Student in matkul2: "+ matkul2.getNumberStuden());
        //menampilkan list pada mahasiswa yang mengikuti matkul2
        ArrayList<String> matkul2student = matkul2.getStudents();
        for(int i=0; i<matkul2student.size(); i++){
            System.out.println(matkul2student.get(i) );
        }
        System.out.println("\nDrop Student in matkul1: ");
        System.out.println("-----------------------------\n");
        //menghapus mahasiswa dari list yang mengikuti matkul1
        matkul1.remove("Peter jones");
        System.out.println("Number of Students in matkul1: "+ matkul1.getNumberStuden());
        for(int i=0; i<matkul1student.size();i++){
            if(i == matkul1student.size() - 1){
                System.out.println(matkul1student.get(i));
            }else
                System.out.println(matkul1student.get(i));
        }
    }
    
}
