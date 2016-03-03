
/**
MySubclass2
 */
public class MySubclass2 extends MySuperclass implements MyInterface {

    MySubclass2(){
        super("state subclass 2");
    }
        
   void myBehaviour(){
    super.myBehaviour();
    System.out.println("overriding superclass behaviour with subclass2 behaviour");
    }
        
    void myBehaviourNotInherited(){
        System.out.println("something my superclass can't do");
    }
    
    
}
