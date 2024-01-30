public class Intern extends Employee {
    private final int SALARY_LIMIT = 20000;
    public Intern(String name, String email, byte age, int salary) {
        super(name, email, age, salary);
    }

    public void setSalary(int salary){
        validateSalaryLimit(salary);
    }
    private void validateSalaryLimit(int salary){

        if(salary > SALARY_LIMIT){
            throw new IllegalArgumentException("Intern's salary exceeds the limit");
        }else{
            super.setSalary(salary);
        }
    }
}
