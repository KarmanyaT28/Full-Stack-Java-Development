class MethodParameters {
    public static void main(String[] args) {
        System.out.println("Area of rectangle with length = 5.4 and width = 3.2");
        double area = areaRectangle(5.4 , 3.2);
    }
//    public static void areaRectangle(double length , double width){
//        System.out.println(length*width);
//    }
    public static double areaRectangle(double length , double width){
        return (length*width);
    }
}
