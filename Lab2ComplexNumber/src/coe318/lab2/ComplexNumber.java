package coe318.lab2;

// @author Krunal Patel 501175325 

//public class known as ComplexNumber is created and two instance variables are declared
public class ComplexNumber {
    private double real;
    private double imaginary; 

    //A ComplexNumber is constructed with the real and imaginary parts 
    public ComplexNumber(double re, double im) {
    //Initialize the instance variables
    real = re; 
    imaginary = im;
    }
    
    //Gets and returns the real part of the complex number
    public double getReal() {
        return real;	
    }

    //Gets and returns the imaginary part of the complex number
    public double getImaginary() {
        return imaginary;	
    }

    //Returns the calculated negative of this complex number
    public ComplexNumber negate() {
        return new ComplexNumber(-real, -imaginary); 
    }

    //Another complex number is added to this one and the result is then returned
    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(real + z.getReal(), imaginary + z.getImaginary());	
    }

    //Another complex number is subtracted from this one and the result is then returned
    public ComplexNumber subtract(ComplexNumber z) {
        return new ComplexNumber(real - z.getReal(), imaginary - z.getImaginary());	
    }

    //This complex number is multiplied by another and the result is then returned
    public ComplexNumber multiply(ComplexNumber z) {
        double newReal = (real * z.getReal()) - (imaginary * z.getImaginary());
        double newImaginary = (real * z.getImaginary()) + (imaginary * z.getReal());
        return new ComplexNumber(newReal, newImaginary);	
    }
    // Calculates and then returns the reciprocal of this complex number
    public ComplexNumber reciprocal() {
        double denominator = (real * real) + (imaginary * imaginary);
        double newReal = real / denominator;
        double newImaginary = -imaginary / denominator;
        return new ComplexNumber(newReal, newImaginary);	
    }

    //Divides this complex number by another and then returns the following result
    public ComplexNumber divide(ComplexNumber z) {
        ComplexNumber reciprocalZ = z.reciprocal();
        return this.multiply(reciprocalZ);	
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
