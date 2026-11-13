public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 1;
        for (int i = 1; i < Integer.parseInt(args[0]); i++) {
            approxPi += (1.0 / (1 + 2 * i)) * Math.pow(-1, i);
        }
        approxPi *= 4;

        System.out.println(approxPi + " " + actualPi);
    }
}
