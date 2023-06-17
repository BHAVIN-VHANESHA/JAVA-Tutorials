import java.util.Arrays;

public class ZScoreNormalization {

    public static void main(String[] args) {
        double[] data = {10, 20, 30, 40, 50}; // sample data

        // call the normalization method
        double[] normalizedData = normalize(data);

        // print the normalized data
        System.out.println(Arrays.toString(normalizedData));
    }

    public static double[] normalize(double[] data) {
        double[] normalizedData = new double[data.length];

        // find the mean and standard deviation of the data array
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        double mean = sum / data.length;

        double sumSquaredDeviations = 0;
        for (double value : data) {
            sumSquaredDeviations += (value - mean) * (value - mean);
        }
        double standardDeviation = Math.sqrt(sumSquaredDeviations / data.length);

        // normalize the data using the formula (x - mean) / standard deviation
        for (int i = 0; i < data.length; i++) {
            normalizedData[i] = (data[i] - mean) / standardDeviation;
        }
        return normalizedData;
    }
}