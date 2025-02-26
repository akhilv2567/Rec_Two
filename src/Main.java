import java.util.Scanner;
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name= name;
        this.age= age;
    }
    public void introduce(){
        System.out.println("My name is "+ name + " My age is "+age);
    }
}
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a person");
        String name1=sc.nextLine();
        System.out.println("Enter your age");
        int age1=sc.nextInt();
        Person person1= new Person(name1,age1);
        System.out.println("The Introduction");
        person1.introduce();
        sc.close();
    }
}