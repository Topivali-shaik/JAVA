package DATATYPES;

public class Objects {

     public static void main (String[] args){

            Employee person = new Employee("topi",20);
            Employee person2=new Employee("shaik",21);
            person2.name = "Shaik";
            person2.age=20;
            person2.displayInfo();

            person.displayInfo();
    
}
}



class Employee{
            
            String name;
            int age;


            Employee(String name,int age){
            this.name=name;
            this.age=age;
            }
        void displayInfo(){


            

        System.out.println("Name: "+ name +", Age: "+ age);




    }
        }



