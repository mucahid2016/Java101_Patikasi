package Siniflar.Maas_Hesaplama_3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000, 45, 1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.toString2();
    }
}
