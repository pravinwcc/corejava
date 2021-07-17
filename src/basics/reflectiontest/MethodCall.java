package basics.reflectiontest;

import java.lang.reflect.Method;  
public class MethodCall{  
public static void main(String[] args)throws Exception{  
  
    Class c = Class.forName("basics.reflectiontest.PrivateMethod");  
    Object o= c.newInstance();  
    Method m =c.getDeclaredMethod("message", null);  
    m.setAccessible(true);  
    m.invoke(o, null);  
    
    Method m1 =c.getDeclaredMethod("add", int.class, int.class);  
    m1.setAccessible(true);  
    m1.invoke(o, 2,8); 
}  
}  