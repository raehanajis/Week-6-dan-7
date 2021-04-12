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
public class course {
        //Mhsname = CourseName
        
        
        private ArrayList<String> mhs = new ArrayList<>();
        private int jumMhs = 0;
        private String Mhsname;
        
        course(String Mhsname){
            this.Mhsname = Mhsname;
        }
        
        //mendaptkan nama mahasiswa
        public String getMhsname(){
            return Mhsname;
        }
        
        //untuk menghapus mahasiswa
        public void remove(String student){
            for(int i=0; i<jumMhs; i++ ){
                if(mhs.get(i).equals(student)){
                    mhs.remove(i);
                    jumMhs--;
                    break;
                }
            }
        }
        //Menambahkan mahasiswa
        public void addStudent(String Student){
            mhs.add(Student);
            jumMhs++;
        }

        //array list untuk menambahkan element pada mhs (addstudent)
    public ArrayList<String> getStudents() {
        return mhs;
    }
    //mendapatkan jumlah mahsiswa
    public int getNumberStuden() {
        return jumMhs;
    }

}
