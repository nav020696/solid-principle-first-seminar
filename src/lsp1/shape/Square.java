package lsp1.shape;

public class Square extends Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public void setSide(int sideA) {
        this.side = sideA;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
