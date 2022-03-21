package Siniflar.OBS_1;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        System.out.println("==========");
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkSozlu(int sozNote1, int sozNote2, int sozNote3) {
        if (sozNote1 >= 0 && sozNote1 <= 100) {
            this.c1.sozNote = sozNote1;
        }
        if (sozNote2 >= 0 && sozNote2 <= 100) {
            this.c2.sozNote = sozNote2;
        }
        if (sozNote3 >= 0 && sozNote3 <= 100) {
            this.c3.sozNote = sozNote3;
        }
    }


    void printNote() {
        System.out.println(c1.name + " Notu\t:" + this.c1.note);
        System.out.println(c2.name + " Notu\t:" + this.c2.note);
        System.out.println(c3.name + " Notu\t:" + this.c3.note);
        System.out.println(c1.name + " Sözlü Notu\t" + this.c1.sozNote);
        System.out.println(c2.name + " Sözlü Notu\t" + this.c2.sozNote);
        System.out.println(c3.name + " Sözlü Notu\t" + this.c3.sozNote);
        System.out.println("Ortalamanız : " + this.avarage);
    }

    void isPass() {
        this.avarage = ((this.c1.note + this.c2.note + this.c3.note) * 0.8 +
                (this.c1.sozNote + this.c2.sozNote + this.c3.sozNote) * 0.20) / 3.0;
        printNote();
        if (this.avarage >= 55) {
            System.out.println("Hababam Sınıfı Uyanıyor ! ");
            this.isPass = true;
        } else {
            System.out.println("Hababam Sınıfı Sınıfta Kaldı !");
            this.isPass = false;
        }
    }

}