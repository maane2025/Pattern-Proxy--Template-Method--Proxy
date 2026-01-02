package aimane.maane.template;

public class TemplateImpl1 extends Template{
    @Override
    protected double detail1(double data) {
        return data/2;
    }

    @Override
    protected double detail2(double a, double b, double param) {
        return a*b/param;
    }
}
