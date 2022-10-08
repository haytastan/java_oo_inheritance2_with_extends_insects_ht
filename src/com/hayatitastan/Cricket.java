/*
Inheritance is when one class acquires the methods and fields of another
The class which inherits the properties of the other is known as a subclass (or derived class, parent class)
Every object in Java inherits from the Object class implicitly
For inheritence the keyword extends is used.
Uses of a class extend to inherit the properties of another class

Advantages of inheritance
•	Minimize duplication of code
Disadvantages of inheritance
•	Superclass and subclass can be tightly coupled
•	Increased effort to jump through levels of abstraction to get appropriate functionality
 */

class Cricket extends Insect {
   double length;
   public Cricket(int age, double length) {
      super (age,6);
      //System.out.println(super.age);
      this.length = length;
   }
   // overriding the method says() in super-class Insect
   public void says(){
      System.out.println("I am a cricket and saying: CHIRP");
   }
   // overriding the method crawl() in super-class Insect
   public void crawl() {
      System.out.println("I am a cricket and can crawl and jump!");
   }
}

