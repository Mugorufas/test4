public class Array2d {
    public static void main(String[] args) {
        String[][]cars=new String[3][3];
        cars[0][0]="a";
        cars[0][1]="b";
        cars[0][2]="c";
        cars[1][0]="d";
        cars[1][1]="e";
        cars[1][2]="f";
        cars[2][0]="g";
        cars[2][1]="h";
        cars[2][2]="i";
        for(int i=0;i<cars.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(cars[i][j]+" ");
            }
        }

    }
}
