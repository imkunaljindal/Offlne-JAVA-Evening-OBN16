package practice;

public class ComplexNumber {

    private int real;
    private int img;

    public ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void print() {
        System.out.println(this.real + " + i"+this.img);
    }

    public void add(ComplexNumber c) {
        this.real = this.real + c.real;
        this.img = this.img + c.img;
    }

    public void subtract(ComplexNumber c) {
        this.real = this.real - c.real;
        this.img = this.img - c.img;
    }
}
