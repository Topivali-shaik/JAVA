package DATATYPES;

public class Classes {

    // int sum;
    public static void main(String[] args){

        Calculator calc = new Calculator();
        int result = calc.add(80);
        calc.add(20);
        System.out.println("sum :" + result);

    }
    
}



class Calculator{

    int sum;


    public int add(int sum ){

        this.sum = sum;
        System.out.println(sum);
        return sum;

    // return 0;


    }


}
