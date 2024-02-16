package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.setSide(4);
        square.setSide(5);
        System.out.printf("In a shape side A = %d, side B = %d\n", square.getSide(), square.getSide());
        ShapeView view = new ShapeView(square);
        view.showArea();
    }
}
