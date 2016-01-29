public class TestString
{
public static String encr(String message){
for (int i=(int)'z';i>=(int)'a';i--){
message=message.replace((char)i,(char)(i+1));
}
System.out.println(message);
return message;
}

public static String decr(String message){
for (int i=(int)'a';i<=(int)'z';i++){
message=message.replace((char)i,(char)(i-1));
}
System.out.println(message);
return message;
}

public static void removeHTMLtags(){
String text = "< some html tag> aa <some html tag> cc< some html tag> <li class=\"li4\">2015 papers: <ul>";
System.out.println(text);
text = text.replaceAll("\\<.*?\\>", ""); // use of regular expressions
System.out.println(text);
}

public static void splitString(){
String text="a simple string; we want to take; apart";
String[] items=text.split(" ");
for (String item:items){
System.out.println(item);
}
}

public static void exampleStartsWith(String[] items,String s){
for (String item:items){
if (item.startsWith(s)){
System.out.println("this word starts with that string: "+item);
}
}

}

public static void fewStringMethods(){
String str1 = "Not another lecture";
int index, index1, index2, l;
index = str1.indexOf("ot");
index1 = str1.indexOf("prwq");
index2 = str1.indexOf("ot", index + 1);
l = str1.length();
String str2;
str2 = str1.toUpperCase();
str2 = str1 + " at 11";
System.out.println(index+" "+ index1+" "+ index2+" "+ l);
System.out.println(str1+" "+str2);
}
}