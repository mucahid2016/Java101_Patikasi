package Siniflar.OBS_1;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "905071835000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "1453");
        Teacher t3 = new Teacher("Kül Yutmaz", "BIO", "2023");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji", "101", "BIO");
        bio.addTeacher(t3);

        Student st1 = new Student("İnek Şaban", "123", "4", tarih, fizik, bio);
        st1.addBulkExamNote(0, 0,0);
        st1.addBulkSozlu(100,100,100);
        st1.isPass();

        Student st2 = new Student("Güdük Necmi", "77", "4", tarih, fizik, bio);
//        st2.addBulkExamNote(80, 70, 30);
        st2.isPass();

    }
}
