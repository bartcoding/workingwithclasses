package be.intecbrussel.graphics;

public class Rectangle {

    private int height;
    public int width;
    public int x;
    public int y;

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void grow(int d){
        width = width + d;
        height += d;
    }

    public int getArea(){
       return width * height;
    }

    public int getPerimeter(){
        return height * 2 + width * 2;
    }
}
