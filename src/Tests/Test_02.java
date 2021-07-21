package Tests;

public class Test_02 {
       public class A{
       public void method1(){
                        B b = new B();
                       b.method2();
            /* code */
                    }
  }


  public class B{
       public void method2(){
                       C c = new C();
                        c.method3();
                        /* code */
                    }}


  public class C{
        public void method3(){
                        /* code */
                    }
   }



    public static void main(String[] args) {
//        A a = new A();
//        try{
//
//            a.method1();
//        }catch(Exception e){
//            System.out.println("an error occured");
//        }
    }
}
