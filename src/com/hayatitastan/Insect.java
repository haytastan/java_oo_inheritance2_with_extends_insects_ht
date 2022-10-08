public class Insect {
   int age;
   int numberOfLegs;
   public Insect(int age, int numberOfLegs) {
      this.age = age;
      this.numberOfLegs = numberOfLegs;
   }
   public void says() {
      System.out.println("I am an insect and saying: ...");
   }
   public void crawl() {
      System.out.println("I am an insect and can crawl\n");
   }
}
