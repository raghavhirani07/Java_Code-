package com.code;
//? This is abtract class

 abstract class Vegatable{
    String colour;
    Vegatable(String colour){
        this.colour=colour;
    }
}
class  Potato extends  Vegatable{

    Potato(String colour) {
        super (colour);
    }
    void PrintColour(){
        System.out.println ("colour is "+colour);
    }
}
class  onion extends  Vegatable{

   onion(String colour) {
        super (colour);
    }
    void PrintColour(String colour){
        System.out.println ("colour is "+colour);
    }
}

public class Abstract_class {
    public static void main(String[] args) {
        Potato p = new Potato ("red");
        p.PrintColour ();
        onion o =new onion ("Green");
        o.PrintColour (o.colour);


    }
}