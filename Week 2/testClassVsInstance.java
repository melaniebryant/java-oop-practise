public class testClassVsInstance
{
    private int instanceVariable;
    private static int classVariable;
    
    public static void classMethod () {
        int localVariable = 0;
        
        //instanceVariable = 0; //compile error
        //instanceMethod(); //compile error
        //testClassWvInstance ts = new testClassVsInstance();
        //ts.instanceMethod();
        
        (new testClassVsInstance()).instanceMethod();
    }
    
    public void instanceMethod() {
      classVariable = 0;
      //classMethod();
    }

}
        
        
