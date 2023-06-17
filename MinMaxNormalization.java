import java.util.Arrays;

public class MinMaxNormalization {

    public static void main(String[] args) {
        double[] data = {10, 20, 30, 40, 50}; // sample data

        // call the normalization method
        double[] normalizedData = normalize(data);

        // print the normalized data
        System.out.println(Arrays.toString(normalizedData));
    }

    public static double[] normalize(double[] data) {
        double[] normalizedData = new double[data.length];

        // find the minimum and maximum values in the data array
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double value : data) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        // normalize the data using the formula (x - min) / (max - min)
        for (int i = 0; i < data.length; i++) {
            normalizedData[i] = (data[i] - min) / (max - min);
        }
        return normalizedData;
    }
}