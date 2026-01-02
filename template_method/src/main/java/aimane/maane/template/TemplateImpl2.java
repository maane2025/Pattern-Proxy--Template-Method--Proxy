package aimane.maane.template;

import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

public class TemplateImpl2 extends Template{
    @Override
    protected double detail1(double data) {

        return sqrt(data/2);
    }

    @Override
    protected double detail2(double a, double b, double param) {

        return cos(a*b/param);
    }
}
