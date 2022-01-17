package SingleTon;

public class SingleTonTest {
    public static void main(String[] args) {
     TestSingleTon  aObj1 = TestSingleTon.getInstance();
     TestSingleTon  aObj2 = TestSingleTon.getInstance();

     //we will get only one instance  in spring we always get one object
        System.out.println("aObj1"+aObj1.toString());
        System.out.println("aObj1"+aObj2.toString());
        //the reference of both objects will be same
    }
}

class TestSingleTon{
        //created static object
        static TestSingleTon aObject = new TestSingleTon();

        private TestSingleTon(){

        }
        public static  TestSingleTon getInstance(){
            return aObject;
        }
}