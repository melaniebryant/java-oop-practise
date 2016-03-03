
public class mySuperClass
{
    private String obName;
    
    public mySuperClass(String ob){
        obName = ob; 
    }
        
    public static void classMethod (){
        System.out.println("this is superClass classMethod");
    }
    
    public void instanceMethod () {
        System.out.println("this is superClass instanceMethod");
    }
    
}
