class Outer1
{
   void outerMethod()
   {
      final int age = 98;
      System.out.println("inside outerMethod");
      class Inner
      {
         void innerMethod() {
            System.out.println("age= "+age);
         }
      }
      Inner y = new Inner();
      y.innerMethod();
   }
}
class MethodLocalInnerClass {
   public static void main(String[] args) {
      Outer1 x=new Outer1();
      x.outerMethod();
   }
}
