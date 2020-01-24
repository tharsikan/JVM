import java.lang.reflect.Method;

class App {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class c = Class.forName("java.lang.reflect.Method"); // load this class
        Class d = Class.forName("java.lang.reflect.Method"); // load this class
        Hel s = new Hel(); 
        Hel v = new Hel(); 
        Class e = s.getClass();
        Class f = s.getClass();
        Method[] m = c.getMethods();

        for(Method mm: m){
            System.out.println(mm.getName());
        }
        System.out.println(s.hashCode());
        System.out.println(v.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
    }
}