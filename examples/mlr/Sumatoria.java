package examples.mlr;

public class Sumatoria {
    double[]x1Array;
    double[]x2Array;
    double[]yArray;
double sumx1,sumx2,sumy,sumx1x2,sumx1y,sumx2y,sumx2pow2,sumx1pow2;
    public Sumatoria(double []x1Array,double[] x2Array, double[]yArray){
        this.x1Array=x1Array;
        this.x2Array=x2Array;
        this.yArray=yArray;
        CalcularSumatorias(x1Array,x2Array,yArray);

    }
    void CalcularSumatorias(double[] x1Array,double[] x2Array, double[]yArray) {
        for (int i=0;i<yArray.length;i++){
            sumx1+=x1Array[i];
            sumx2+=x2Array[i];
            sumy+=yArray[i];
            sumx1x2+=x1Array[i]*x2Array[i];
            sumx1pow2+=Math.pow(x1Array[i],2);
            sumx2pow2+=Math.pow(x2Array[i],2);
            sumx1y+=x1Array[i]*yArray[i];
            sumx2y+=x2Array[i]*yArray[i];
        }
    }

}

