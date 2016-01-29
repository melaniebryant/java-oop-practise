public class testClassVsInstance
{
private int instanceVariable;
public static int classVariable;

public static void classMethod()
{ int localVariable=0;
//instanceVariable=0; //compile error
//instanceMethod(); //compile error
//testClassVsInstance ts=new testClassVsInstance();
//ts.instanceMethod();
(new testClassVsInstance()).instanceMethod();
}

public void instanceMethod()
{

classVariable=0;
classMethod();
}
}