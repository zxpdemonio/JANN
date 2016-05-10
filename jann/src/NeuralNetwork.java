import java.util.ArrayList;
import java.lang.Math;
/**
 * Created by CullenGao on 5/10/16.
 */
public class NeuralNetwork {
}

class Neuron {
    public double output, bias, error, biasDiff;
    public int numInputs;
    public ArrayList<Double> inputWeights = new ArrayList<>();
    public ArrayList<Double> wDiff = new ArrayList<>();
}
