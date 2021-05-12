package examples.mlr;

public class MultipleLinearRegresion {
    double x1Array[];
    double x2Array[];
    double yArray[];
    double b0, b1, b2;
    double DeterSys = 0;

    public MultipleLinearRegresion(double[] x1Array, double[] x2Array, double[] yArray) {
        this.x1Array = x1Array;
        this.x2Array = x2Array;
        this.yArray = yArray;
        this.b0 = 0;
        this.b1 = 0;
        this.b2 = 0;

    }

    void mlr() {

        CalcularDsys();
        DeterSys = CalcularDsys();

        CalcularB0();
        CalcularB1();
        CalcularB2();

    }

    double CalcularB0() {
        Sumatoria sum = new Sumatoria(x1Array, x2Array, yArray);
        double db0 = 0;
        db0 = ((sum.sumy* sum.sumx1pow2 * sum.sumx2pow2) +
                (sum.sumx1 * sum.sumx1x2 * sum.sumx2y) +
                (sum.sumx2 * sum.sumx1y * sum.sumx1x2) -
                (sum.sumx2y * sum.sumx1pow2 * sum.sumx2) -
                (sum.sumx1x2 * sum.sumx1x2 * sum.sumy) -
                (sum.sumx2pow2 * sum.sumx1y * sum.sumx1));
        b0 = db0 / DeterSys;
        return b0;

    }
    double CalcularB1() {
        Sumatoria sum = new Sumatoria(x1Array, x2Array, yArray);
        double db1 = 0;
        db1 = ((x2Array.length* sum.sumx1y * sum.sumx2pow2) +
                (sum.sumy * sum.sumx1x2 * sum.sumx2) +
                (sum.sumx2 * sum.sumx1 * sum.sumx2y) -
                (sum.sumx2 * sum.sumx1y* sum.sumx2) -
                (sum.sumx2y * sum.sumx1x2 * x1Array.length) -
                (sum.sumx2pow2 * sum.sumx1 * sum.sumy));
        b1 = db1 / DeterSys;
        return b1;

    }
    double CalcularB2() {
        Sumatoria sum = new Sumatoria(x1Array, x2Array, yArray);
        double db2 = 0;
        db2 = ((sum.x1Array.length * sum.sumx1pow2 * sum.sumx2y) +
                (sum.sumx1 * sum.sumx1y * sum.sumx2) +
                (sum.sumy * sum.sumx1 * sum.sumx1x2) -
                (sum.sumx2 * sum.sumx1pow2 * sum.sumy) -
                (sum.sumx1x2 * sum.sumx1y * sum.x2Array.length) -
                (sum.sumx2y * sum.sumx1 * sum.sumx1));
        b2 = db2 / DeterSys;
        return b2;

    }
    double CalcularDsys() {
        Sumatoria sum = new Sumatoria(x1Array, x2Array, yArray);

        DeterSys = ((sum.x1Array.length * sum.sumx1pow2 * sum.sumx2pow2) +
                (sum.sumx1 * sum.sumx1x2 * sum.sumx2) +
                (sum.sumx2 * sum.sumx1 * sum.sumx1x2) -
                (sum.sumx2 * sum.sumx1pow2 * sum.sumx2) -
                (sum.sumx1x2 * sum.sumx1x2 * sum.x2Array.length) -
                (sum.sumx2pow2 * sum.sumx1 * sum.sumx1));
        return DeterSys;
    }

}
