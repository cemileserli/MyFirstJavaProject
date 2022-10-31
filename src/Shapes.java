public class Shapes {
    public Shapes(){

    }

    public static void main(String[] args) {
        //Shapes filledRectangle1 = new Shapes();
        //filledRectangle1.drawFilledRectangle(4,6);
        //Shapes emptyRectangle1 = new Shapes();
        //emptyRectangle1.drawEmptyRectangle(6,15);
        Shapes emptyRectangle1 = new Shapes();
        emptyRectangle1.drawFilledTriangle(6);
    }

    public void drawFilledRectangle(int height, int width){
        for (int i=0; i<height;i++){
            for (int j=0; j<width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawEmptyRectangle(int height, int width){
        for (int i=0; i<height;i++){
            for (int j=0; j<width; j++){
                if(i==0 || i==(height-1))
                    System.out.print("*");
                else{
                    if(j==0 || j==width-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");

                    }
                }

            }
            System.out.println();
        }
    }
    public void drawFilledTriangle(int edge){
        for (int i=0; i<edge;i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
