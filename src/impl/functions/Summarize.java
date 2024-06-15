package impl.functions;

import impl.ComplexNumber;

public class Summarize extends ComplexOp_2 {
    private double newReal;
    private double newImaginary;

    public Summarize() {
    }

    @Override
    public ComplexNumber function(ComplexNumber num1, ComplexNumber num2) {
        newReal = num1.getReal() + num2.getReal();
        newImaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber (newReal, newImaginary);
    }

    @Override
    public String toString() {
        return "Summarize: " +
                newReal +
                " + " +
                newImaginary + "i";
    }
}