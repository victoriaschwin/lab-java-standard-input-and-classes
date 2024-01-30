public class Employee {
    protected String name;
    protected String email;
    protected byte age;
    protected int salary;

    public Employee(String name, String email, byte age, int salary){
        this.name = name;
        this.email = email;
        this.age = age;
        setSalary(salary);
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public byte getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

    public void setName(){
        this.name = name;
    }

    public void setEmail(){
        this.email = email;
    }

    public void setAge(){
        this.age = age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
