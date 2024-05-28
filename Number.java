public class Number {
    double x;
    double y;
    Number(double x,double y){
        this.x=x;
        this.y=y;

    }
    void Compare(){
        if (x==y) {
            System.out.println("The numbers are equal");
        }
        else{
            System.out.println("The numbers are not equal");
        }
    }
}
