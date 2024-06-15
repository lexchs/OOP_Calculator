package Presenter;

import View.UI;
import impl.ComplexNumber;
import impl.functions.*;

public class Presenter<T extends ComplexOp> {

    UI v;
    T model;

    public Presenter(UI v, T model) {
        this.model = model;
        this.v = v;
    }

    public void run(){
        int choise = v.getChoise();
        Double real;
        Double imaginary;

        switch (choise){
            case 1:
                Summarize sum = new Summarize();
                real = v.inputX("Введите Действительную часть первого числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть первого числа >>> ");
                ComplexNumber num1_sum = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите Действительную часть второго числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть второго числа >>> ");
                ComplexNumber num2_sum = new ComplexNumber(real, imaginary);
                sum.function(num1_sum, num2_sum);
                System.out.println(sum);
                break;
            case 2:
                Substract sub = new Substract();
                real = v.inputX("Введите Действительную часть первого числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть первого числа >>> ");
                ComplexNumber num1_sub = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите Действительную часть второго числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть второго числа >>> ");
                ComplexNumber num2_sub = new ComplexNumber(real, imaginary);
                sub.function(num1_sub, num2_sub);
                System.out.println(sub);
                break;
            case 3:
                Multiply multi = new Multiply();
                real = v.inputX("Введите Действительную часть первого числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть первого числа >>> ");
                ComplexNumber num1_multi = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите Действительную часть второго числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть второго числа >>> ");
                ComplexNumber num2_multi = new ComplexNumber(real, imaginary);
                multi.function(num1_multi, num2_multi);
                System.out.println(multi);
                break;
            case 4:
                Divide div = new Divide();
                real = v.inputX("Введите Действительную часть первого числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть первого числа >>> ");
                ComplexNumber num1_div = new ComplexNumber(real, imaginary);
                real = v.inputX("Введите Действительную часть второго числа >>> ");
                imaginary = v.inputY("Введите Мнимую часть второго числа >>> ");
                ComplexNumber num2_div = new ComplexNumber(real, imaginary);
                div.function(num1_div, num2_div);
                System.out.println(div);
                break;
        }
    }
}