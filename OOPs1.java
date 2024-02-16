public class OOPs1 {
    public static void main(String[]args){
        Fish shark = new Fish();
        shark.eat();
        shark.color="yellow";


    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }

    void breathe(){
        System.out.println("breathes");
    }
}


class Fish extends Animal{
    int fins;
    

    void swim(){
        System.out.println("Swims in water");
    }

}
