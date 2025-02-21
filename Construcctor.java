package DATATYPES;

public class Construcctor {

    public static void main(String[] args) {

        Topi obj = new Topi();
        Topi obj2 = new Topi();
        Topi Onj3 = new Topi();
        obj.print();
        obj.print2();
        System.out.println(  obj.print()+" :  "+ obj.print2());

    }
}








class Topi {

    /**
     *
     */
    // private int A;
    // private String B;

    public Topi(){

        A = 10;
        B= "TopiVali";

        
    }
    private int A;
    private String B;

    public int print() {

        return A;
        // return B;

        // System.out.println( "String" + B + "INT" + A);
        // return A;
        // return B;
    }

    public String print2() {

        return B;
    }

}