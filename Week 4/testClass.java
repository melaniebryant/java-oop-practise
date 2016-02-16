
/**
testClass
 */
public class testClass
{
   public static void main(String[] args){

    
    //edit to test polymorphism, substitution principle, dynamic binding, instanceof, type casting:
    
    //polymorphism
    MySuperclass ob1 = new MySubclass2();
    ob1.myBehaviour();
    
    //substitution principle, 1 object of type superclass that can use overided methods in subclass1, then lost, then 1 object defined as subclass2
    MySuperclass ob2 = new MySubclass1();
    
    ob2 = new MySubclass2(); //then can lose that object and create another of same name with access to MySubClass2 methods
    
    ob2.myBehaviour(); 
    //ob2.myBehaviourNotInherited();
    
    // type casting, ob2 is of type superclass, then creating new object caled sub that points to same location but is of type subclass2
    MySubclass2 subob2 = (MySubclass2) ob2;
        subob2.myBehaviourNotInherited();
        
    //instance of
    if(ob2 instanceof MySubclass1) {
        MySubclass2 sub = (MySubclass2) ob2;
        sub.myBehaviourNotInherited();
    }
    
    //dynamic binding + substitution principle
    MySuperclass s=(Math.random()>0.5)? s=new MySubclass1():new MySubclass2();
    
    }
}
