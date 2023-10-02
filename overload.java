public class overload {
    public static void main(String[] args){
double t = add(6,7,9);
int o = add(6);
int i = add(6,7);
int p = add(6,7,9,2);
        System.out.println("Area of the Trapezium is: "+t);
        System.out.println("Area of the Square is: "+o);
        System.out.println("Area of the Rectangle is: "+i);
        System.out.println("The perimeter of the Square is: "+p);
    }
    static int add(int w){
        return w*w;
    }
    static int add(int w,int r){
        return w*r;
    }
    static int add(int w,int r,int j,int k){
        return w+r+j+k;
    }
    static double add(int w,int r, int y){
        return 0.5*(w+r)*y;
    }
}
