//
//
//The MallardDuck and RubberDuck derived classes extend the Duck base class. In the MallardDuck and RubberDuck derived classes, define an overridden method named getBehavior that returns the string "squeaks" and "flies", respectively.
//
//Write code in the derived class of RubberDuck.java that has the following method:
//
//getBehavior: an overridden method that returns the string "squeaks"
//
//Write code in the derived class of MallardDuck.java that has the following method:
//
//getBehavior: an overridden method that returns the string "flies"
//
//If the input is:
//
//Mallard Austin
//Rubber Squeaker
//
//the output when "Mallard" is the duck type, "Austin" is the duck name, "Rubber" is the duck type, and "Squeaker" is the duck name is:
//
//Duck Information:
//Austin the Mallard duck flies!
//Squeaker the Rubber duck squeaks!
//
//RubberDuck.java

public class RubberDuck extends Duck {

    //TODO: Define getBehavior() overridden method and return String "squeaks"
    @Override
    public String getBehavior() {
        return "squeaks";
    }

}


//MallardDuck.java

public class MallardDuck extends Duck{

    //TODO: Define getBehavior() overridden method and return String "flies"
    @Override
    public String getBehavior() {
        return "flies";
    }

}