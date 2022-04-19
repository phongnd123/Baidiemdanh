abstract class Animal{
    abstract void run ();
    abstract void eat();
    abstract void sleep();
    abstract void walk();
    abstract void roar();
}
class tiger extends Animal{
   void run (){
       System.out.println("running safely ..");
   }
public static void print(){
Bike obj = new tiger();
obj.run();
}
}