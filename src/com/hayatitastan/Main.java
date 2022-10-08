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

import java.awt.*;
import java.lang.Math;
import java.util.Random;
public class Main {
   public static void main(String[] args) {
      Insect insect = new Insect(5, 6);
      Spider spider = new Spider(13, true);
      Cricket cricket = new Cricket(2, 1.25);
      
      insect.says();
      insect.crawl();
      
      spider.says();
      spider.crawl();
      
      cricket.says();
      cricket.crawl();
      
      if (spider instanceof Insect && spider instanceof Spider) {
         System.out.println("Spider is an insect and a spider");
      }
      if (spider instanceof Insect && spider.isPoisonous) {
         System.out.println("Spider is an poisonous insect.");
      }
   }
}
