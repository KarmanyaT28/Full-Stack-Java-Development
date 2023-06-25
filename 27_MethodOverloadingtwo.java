class MethodOverloadingtwo {
    public static void main(String[] args) {
        System.out.println("1+2"+sum(1,4));
        System.out.println("1+2.5"+sum(1,2.5F));
        System.out.println("1.3+2.5"+sum(1.3,2.5));

    }
    public static int sum(int x , int y){
        System.out.println("Adding 2 int entities");
        return x+y;
    }
    public static float sum(int x , float y){
        System.out.println("Adding 1 int and 1 float entity");
        return x+y;
    }
    public static double sum(double x , double y){
        System.out.println("Adding 1 double and 1 double entity");
        return x+y;
    }
    public static int sum(int x , int y ,int z){
        System.out.println("Adding 3 int entities");
        return x+y+z;
    }
}
