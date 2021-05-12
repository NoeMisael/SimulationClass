package examples.regresion;


public class LinearRegression {
    float xArray[];
    float yArray[];
    float b0, b1;

    public LinearRegression(float[] xArray, float[] yArray) {
        this.xArray = xArray;
        this.yArray = yArray;
        this.b1 = b1;
        this.b0 = b0;
    }

    void CalcularRegresion() {

        float[] sum = CalcularSum(xArray, yArray);
        b0 = Calcularb0(sum[0], sum[1], sum[2], sum[3]);
        b1 = Calcularb1(b0, sum[0], sum[1]);
    }

    public float[] CalcularSum(float[] xArray, float[] yArray) {
        float sumX = 0;
        float sumY = 0;
        float sumXY = 0;
        float sumx_2 = 0;

        for (int i = 0; i < xArray.length; i++) {
            sumX += xArray[i];
            sumY += yArray[i];
            sumXY += xArray[i] * yArray[i];
            sumx_2 += xArray[i] * xArray[i];
        }
        return new float[]{sumX, sumY, sumXY, sumx_2};
    }

    float Calcularb0(float sumX, float sumY, float sumXY, float sumx_2) {
        float b0 = 0;
        float n = xArray.length;
        b0 = (((n * sumXY) - (sumX * sumY)) / ((n * sumx_2) - (sumX * sumX)));
        return b0;
    }

    float Calcularb1(float b0, float sumX, float sumY) {
        float b1 = 0;
        b1 = ((sumY - (sumX * b0)) / xArray.length);
        return b1;
    }

}
