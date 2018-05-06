
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    public String str;
    
    static private Singleton obj = null;
    
    private Singleton(){
        
    }
    
    static Singleton getSingleInstance(){
        if(obj != null)
            return obj;
        obj = new Singleton();
        return obj;
    }
    
}