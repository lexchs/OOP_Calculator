import Presenter.Presenter;
import View.UI;
import impl.ComplexNumber;
import impl.functions.ComplexOp;
import impl.functions.ComplexOp_2;
import impl.functions.Summarize;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new UI(), new ComplexOp_2());
        presenter.run();
    }
}