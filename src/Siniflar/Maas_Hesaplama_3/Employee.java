package Siniflar.Maas_Hesaplama_3;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raiseSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (salary > 0 && salary < 1000) {
            this.tax = this.salary;
        } else {
            this.tax = this.salary * 0.03;
        }
    }

    void bonus() {
        if (workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        } else {
            this.bonus = 0;
        }
    }

    void raiseSalary() {
        if (2021 - hireYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (2021 - hireYear > 10 && 2021 - hireYear < 20) {
            this.raiseSalary = (this.salary * 0.10);
        } else {
            this.raiseSalary = (this.salary * 0.15);
        }
    }

    void toString2() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raiseSalary);
        System.out.println("Vergi ve Bonus Maaşlar ile birlikte maaşlar : " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam Maaş" + ((this.salary + this.bonus - this.tax) + (this.raiseSalary)));
    }
}
