
/**
MySuperclass
 */
public abstract class MySuperclass
{
    private String myState;
    
    MySuperclass(String b){
        myState=b;
    }
    void myBehaviour(){
    //do something    
    System.out.println(myState);
    }
}