package examples.regresion;


import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SlrAgent extends Agent {
    protected void setup() {
        System.out.println("Agent " + getLocalName() + " started.");

        addBehaviour(new Regresion());
    }

    private class Regresion extends OneShotBehaviour {
        public void action() {
            float[] xArray = {1,2,3,4,5,6,7,8,9,10};
            float[] yArray = {2,4,6,8,10,12,14,16,18,20};
            LinearRegression agent1 = new LinearRegression(xArray, yArray);
            agent1.CalcularRegresion();
            System.out.println(agent1.b1 + " + " + agent1.b0 + " Adversiting");

        }

    }

}
