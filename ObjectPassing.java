package DATATYPES;


class Box{


double width;
double height;
double depth;




Box(double width,double height,double depth){

    this.width=width;
    this.height=height;
    this.depth=depth;

}

    double volume(){

            // System.out.println(width*height*depth);
            return width*height*depth;

    }


    double islargerThan(Box box3){

         double value2=volume() + box3.volume();

         return value2;
        
    }


}






public class ObjectPassing {


    public static void main(String[] args){

            Box box1=new Box(2,3,2);
            Box box2 = new Box(2,4,2);

            double value= box1.volume();
            System.out.println(" When the volume method is called the output is  "+  value);
            double value3 = box2.islargerThan(box2);
            System.out.println( "  " + value3);



            if (box1.islargerThan(box2) >= 28){

System.out.println("is larger");

            }

            else if (box1.islargerThan(box2) < 28) {

                System.out.println("is less than");
                
            } else {


                System.out.println("error");
                
            }




    }
    
}
