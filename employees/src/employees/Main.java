package employees;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee(70000);
        HRManager mgr = new HRManager(50000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();

	}

}
