import reflection.SomeInterface;
import reflection.SomeOtherInterface;

class SomeBean {
  
   @AutoInjectable
   private SomeInterface field1;

   @AutoInjectable
   private SomeOtherInterface field2;

   public SomeBean() {}

   public void foo() {

      field1.doSome();
      field2.doSome();

   }

}
