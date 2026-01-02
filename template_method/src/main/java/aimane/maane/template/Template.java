package aimane.maane.template;

public abstract class Template {
    public double calculate(double a, double b) {
        double data=a*b;
        double param=detail1(data);
        double somme=b;
        for (int i = 0; i < param; i++) {
            double value=detail2(a,b,param) ;
            somme+=value;
        }
        return somme;
    }

    protected abstract double detail1(double data);
    protected abstract double detail2(double a, double b, double param);
}
