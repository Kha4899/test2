public class Rectangle {
    private int length; // Chiều dài
    private int width;  // Chiều rộng

    // Hàm khởi tạo không tham số
    public Rectangle() {
    }

    // Hàm khởi tạo có tham số
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getter và Setter cho chiều dài
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter và Setter cho chiều rộng
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Tính diện tích
    public int getArea() {
        return this.length * this.width;
    }

    // Tính chu vi
    public int getPerimeter() {
        return (this.length + this.width) * 2;
    }

    // Hiển thị thông tin hình chữ nhật
    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}
