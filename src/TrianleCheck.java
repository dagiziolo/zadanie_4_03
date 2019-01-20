public class TrianleCheck {


    private boolean isTriangle(Triangle triangle){
        boolean tmp;
        if ((triangle.getA() + triangle.getB() > triangle.getC())&&(triangle.getB()+ triangle.getC() > triangle.getA())
                &&(triangle.getA() + triangle.getC() > triangle.getB())){
         tmp = true; //pomocnicza
        }
        else {tmp=false;}
        return tmp;
    }

    public boolean isRightTriangle(Triangle triangle) {
        boolean tmp;
        if (isTriangle(triangle) == false) {
            tmp = false;}
        else
            {if (
                    ((triangle.getA() * triangle.getA()) == (triangle.getB()*triangle.getB() + triangle.getC()*triangle.getC()))||
                    ((triangle.getB() * triangle.getB()) == (triangle.getA()*triangle.getA() + triangle.getC()*triangle.getC()))||
                    ((triangle.getC() * triangle.getC()) == (triangle.getA()*triangle.getA() + triangle.getB()*triangle.getB()))
            ) {tmp = true;}
            else tmp = false;
            }
        return tmp;
    }


}
