public class Main {
    public static void main(String[] args) {
        // 1. Tạo một đối tượng Rectangle
        Rectangle rect = new Rectangle(10, 5);

        // 2. Hiển thị thông tin hình chữ nhật
        System.out.println("=== THÔNG TIN HÌNH CHỮ NHẬT BAN ĐẦU ===");
        rect.display();

        // 3. Thay đổi chiều dài và chiều rộng của hình chữ nhật đó
        rect.setLength(20);
        rect.setWidth(8);

        // 4. In ra màn hình diện tích và chu vi sau khi thay đổi
        System.out.println("\n=== THÔNG TIN SAU KHI THAY ĐỔI ===");
        System.out.println("Chiều dài mới: " + rect.getLength());
        System.out.println("Chiều rộng mới: " + rect.getWidth());
        System.out.println("Diện tích mới: " + rect.getArea());
        System.out.println("Chu vi mới: " + rect.getPerimeter());
    }
}
