package examples.mlr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class mlrAgent extends Agent {
    protected void setup() {
        System.out.println("Agent " + getLocalName() + " started.");

        addBehaviour(new Regresion());
    }

    private class Regresion extends OneShotBehaviour {
        public void action() {
            double[] x1Array = {41.9,43.4,43.9,44.5,47.3,47.5,47.9,50.2,52.8,53.2,56.7,57,63.5,65.3,71.1,77,77.8};
            double[] x2Array = {29.1,29.3,29.5,29.7,29.9,30.3,30.5,30.7,30.8,30.9,31.5,31.7,31.9,32,32.1,32.5,32.9};
            double[] yArray ={ 251.3,251.3,248.3,267.5,273,276.5,270.3,274.9,285,290,297,302.5,304.5,309.3,321.7,330.7,349};
            MultipleLinearRegresion agent1 = new MultipleLinearRegresion(x1Array,x2Array,yArray);
           agent1.mlr();
            System.out.println("Sales = b0:" +agent1.b0 +
                    " b1:"+agent1.b1+" b2:"+agent1.b2);


        }

    }

}
