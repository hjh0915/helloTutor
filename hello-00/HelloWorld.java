public class HelloWorld {
    public static void main(String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        HelloWorld x = new HelloWorld();
        System.out.println(x);

        Class c = x.getClass();
        System.out.println(c);

        if (x instanceof HelloWorld) {
            System.out.println("我是HelloWorld类实例");
        }

        HelloWorld y = (HelloWorld)Class.forName("HelloWorld").newInstance();
        System.out.println(y);
    }

    @Override
    public String toString() {
        return "我的对象:" + this.hashCode();
    }
 }