
public class mySubClass extends mySuperClass
{
    
    public mySubClass(String ob){
        super(ob); 
    }
        
    public static void classMethod (){
        System.out.println("this is subClasss classMethod - hides superClass classMethod");
    }
    
    public void instanceMethod () {
        System.out.println("this is subClass instanceMethod - overrides superClass instanceMethod");
    }
    
}

