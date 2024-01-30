import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int i=0;
        FileWriter writer = new FileWriter("employees.txt",true);
        String[] namesArray = {"Julia", "Federico", "Martina", "Abril", "Camila", "Susana", "Lucia","Agustin", "Sara", "Laura"};
        byte[] agesArray = {15,24,50,22,30,31,26, 21, 19, 27};
        int[] salariesArray = {1000, 2500, 30000, 500, 25000, 3200, 4000, 63678, 40005, 5678, 1234};

        while(i<10){
            try{
                Intern newIntern = new Intern(namesArray[i],"test@test.com",agesArray[i],salariesArray[i]);
                System.out.println(newIntern.salary);
                System.out.println(newIntern.name);
                System.out.println(newIntern.age);

                writer.write(newIntern.name+" "+newIntern.email+" "+newIntern.age+" "+newIntern.salary+"\n");
                }
            catch(Exception e){
                System.out.println(e);
            }
            i++;

        }

        writer.close();

    }
}
