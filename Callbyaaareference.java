package DATATYPES;

public class Callbyaaareference {

    public static void main(String[] args) {

        Person person = new Person("Alice");
        Topi topi = new Topi("Shaik");

        System.out.println("Before Change    :" + person.name);
        System.out.println("Before Change    :" + topi.name2);

        modifyname(person , topi);

        System.out.println("after modify    :"+ person.name);

        // modifyname(topi);
        System.out.println("for the class TOPI    :"  + topi.name2);
    }

    // static void modifyname2(Topi p){
    //     p.changeName2("Vali");
    // }
    static void modifyname(Person p,Topi T){

        p.changeName("bob");
        T.changeName("vali");
    }
}

    class Person {

        String name;

        Person(String name){

            this.name = name;
        }

        void changeName(String newName) {

            name = newName;

        }

    }


    class Topi{

        String name2;

        public Topi(String name2 ){

            this.name2=name2;

        }

        void changeName(String newName){

            name2=newName;
        }

    }
   
