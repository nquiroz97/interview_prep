package concepts_java.objects;

//Objects do all the work(have certain attributes and behavior/methods)
public class Humans {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //Constructor: must always have the same name as class
    public Humans(String name, String eyeColor, int age, int height){
        super();
        //'this' keyword points to the current object being contstructed
        this.age = age;
        this.eyeColor = eyeColor;
        this.heightInInches = height;
        this.name = name;
    }

    public void speak(){
        System.out.println("Hello my name is " + name);
        System.out.println("Hello my age is " + age);
        System.out.println("Hello my height is " + heightInInches + " inches tall");
        System.out.println("Hello my eye color is " + eyeColor);
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void walking(){
        System.out.println("I am walking");
    }
}
