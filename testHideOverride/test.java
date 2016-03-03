public class test
{
    public static void main (String[] param) {
        
        mySuperClass obA = new mySuperClass("obA");
        System.out.println("created mySuperClass obA = new mySuperClass();");
        obA.classMethod();
        obA.instanceMethod();
        
        mySuperClass obB = new mySubClass("obB");
        System.out.println("created mySuperClass obB = new mySubClass();");
        obB.classMethod();
        obB.instanceMethod();
        
        mySuperClass obC = new mySubClass2("obC");
        System.out.println("created mySuperClass obC = new mySubClass2();");
        obC.classMethod();
        obC.instanceMethod();
        
        mySubClass obD = new mySubClass("obD");
        System.out.println("created mySubClass obB = new mySubClass();");
        obD.classMethod();
        obD.instanceMethod();
        
        mySubClass2 obE = new mySubClass2("obE");
        System.out.println("created mySubClass2 obE = new mySubClass2();");
        obE.classMethod();
        obE.instanceMethod();
        
        System.exit(0);
    }
    
}
