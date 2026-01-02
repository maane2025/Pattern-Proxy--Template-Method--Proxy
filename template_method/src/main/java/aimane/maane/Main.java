package aimane.maane;

import aimane.maane.template.Template;
import aimane.maane.template.TemplateImpl1;
import aimane.maane.template.TemplateImpl2;

public class Main {
    public static void main(String[] args) {
        Template template = new TemplateImpl1();
        double result = template.calculate(4, 5);
        System.out.println("Result 1: " + result);
        template=new TemplateImpl2();
        result = template.calculate(4, 5);
        System.out.println("Result 2: " + result);
    }
}