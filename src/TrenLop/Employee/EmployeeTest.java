package TrenLop.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();
            employees[i].inputData();
            employees[i].calSalary();
        }

        for (int i = 0; i < 5; i++) {
            employees[i].displayData();
        }
    }
}
