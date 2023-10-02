import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width; // khai báo chiều rộng
        float height; // khai báo chiều dài
        Scanner scanner = new Scanner(System.in); // khai báo đối tượng Scanner để nhập liệu
        System.out.println("Enter width :");
        width = scanner.nextFloat();
        System.out.println("Enter height :"); //
        height = scanner.nextFloat(); // nhập chiều cao
        float area = width*height;
        System.out.println("Area ="+area);

    }
}
