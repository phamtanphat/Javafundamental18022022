import java.util.Scanner;

public class Buoi1 {

    public static void main(String[] args){
//         1 : Kiểu dữ liệu
//         Nhóm 1 : Kiểu dữ liệu nguyên thủy (Primitives type)
//         String (chuỗi)
//         int , long ( kiểu số nguyên)
//         float , double ( kiểu số thực hay được số có phần thập phân)
//         boolean (kiểu dữ liệu chỉ 2 miền giá trị là đúng hoặc sai)
//         char (kiểu ký tự)
//         Nhóm 2 : Kiểu dữ liệu đối tượng (Object type)
//
//         2 : Khai báo biến
//        char code = 'p';
//        String name = "Phạm Tấn Phát";
//        String phone = "0352408366";
//        String address = "Lý Thường Kiệt Quận 10";
//        int age = 27;
//
//         Phương thức
//         ctrl + p : kiểm tra kiểu dữ liệu truyền vào phương thức
//        System.out.println("Code : " + code);
//        System.out.println("Name : " + name);
//        System.out.println("Phone : " + phone);
//        System.out.println("Address : " + address);
//        System.out.println("Age : " + age);
//        3 : Toán tử
//        int a = 5;
//        a = a + 1;
//        a += 1;
//        int b = ++a;
//        System.out.println("Giá trị b = " + b);
//        System.out.println("Giá trị a = " + a);
//
//        int a = 5;
//        int b = 5;
//
//         a++
//        2 biểu thức
//        1 : lấy giá trị a gán trước
//        2 : tăng a  lên 1 đơn vị
//
//
//        int ketQua = a++ - b-- - --b + a-- + ++a;
//         5 - b-- - --b + a-- + ++a; a = 6 , b =5
//         5 - 5 - --b + a-- + ++a; a = 6 , b = 4
//         5 - 5 - 3 + a-- + ++a; a = 6 , b = 3
//         5 - 5 - 3 + 6 + ++a; a = 5 , b = 3
//         5 - 5 - 3 + 6 + 6; a = 6 , b = 3
//         9 ; a = 6 , b = 3
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);
//        System.out.println("Kết quả = " + ketQua);
//
//        int a = 10;
//        int b = 5;
//
//        int ketQua = --a - --b - a-- + --b - b-- + a-- + b-- + a--;
//        In giá trị a , b , ket quả
//         9 - --b - a-- + --b - b-- + a-- + b-- + a--; a = 9 , b = 5
//         9 - 4 - a-- + --b - b-- + a-- + b-- + a--; a = 9 , b = 4
//         9 - 4 - 9 + --b - b-- + a-- + b-- + a--; a = 8 , b = 4
//         9 - 4 - 9 + 3 - b-- + a-- + b-- + a--; a = 8 , b = 3
//         9 - 4 - 9 + 3 - 3 + a-- + b-- + a--; a = 8 , b = 2
//         9 - 4 - 9 + 3 - 3 + 8 + b-- + a--; a = 7 , b = 2
//         9 - 4 - 9 + 3 - 3 + 8 + 2 + a--; a = 7 , b = 1
//         9 - 4 - 9 + 3 - 3 + 8 + 2 + 7; a = 6 , b = 1
//         13 ; a = 6 , b = 1

//         4 : Câu điều kiện
//
//        int a = 5;
//        int b = 10;
//         A > b : A lớn hơn B
//         A < B : A bé hơn B
//         A == B : A bằng B
//
//        if (a > b){
//            System.out.println("A lơn hơn B");
//        }else if(a < b){
//            System.out.println("A bé hơn B");
//        }else{
//            System.out.println("A bằng B");
//        }
//
//         Nhập dữ liệu vào
//        System.out.print("Nhập chiều cao của bạn(m) : " );
//        Scanner scanner = new Scanner(System.in);
//        double height = scanner.nextDouble();
//
//        System.out.print("Nhập cân nặng của bạn(kg) : " );
//        double weight = scanner.nextDouble();
//
//        double bmi = weight / (height * height);
//
//        System.out.println("BMI : " + bmi);
//        if (bmi < 18.5){
//            System.out.println("Cân nặng thấp (gầy)");
//        }else if (bmi <= 24.9){
//            System.out.println("Bình thường");
//        }else if(bmi == 25){
//            System.out.println("Thừa cân");
//        }else if(bmi <= 29.9){
//            System.out.println("Tiền béo phì");
//        }else if(bmi <= 34.9){
//            System.out.println("Béo phì độ I");
//        }else if(bmi <= 39.9){
//            System.out.println("Béo phì độ II");
//        }else if (bmi >= 40){
//            System.out.println("Béo phì độ III");
//        }

        // Bài tập về nhà
        // Tồng tiền : 300000
        // Mã khách hàng :
        // Loại 1 : N => giảm 5 % trên tổng tiền
        // Loại 2 : O => giảm 7 % trên tổng tiền
        // Loại 3 : V => giảm 10 % trên tổng tiền

        // Nhập mẫu
        // Xin quý khách nhập vào tổng tiền :
        // Xin quý Khách nhập mã khách hàng :

        // In mẫu
        // Khách loại thuộc nhóm vip sẽ được giảm 10 %
        // Tổng tiền phải trả là 270000

        // 5 : Câu điều kiện switch case

//        int month = 10;
//        switch (month){
//            case 1 :
//            case 2 :
//            case 3 :
//                System.out.println("Là quý 1");
//                break;
//            case 4 :
//            case 5 :
//            case 6 :
//                System.out.println("Là quý 2");
//                break;
//            case 7 :
//            case 8 :
//            case 9 :
//                System.out.println("Là quý 3");
//                break;
//            case 10 :
//            case 11 :
//            case 12 :
//                System.out.println("Là quý 4");
//                break;
//            default:
//                System.out.println("Không thuộc quý nào");
//                break;
//        }

        // 5 : Mảng array

        // khai báo mảng khi biết kích thước
//        String[] arrNames = new String[10];

        // khai báo mảng và định nghĩa các phần tử
//        int[] arrNumbers = {10,20,30,40,50,60};

        // lấy kích thước mảng
        ///arrNumbers.length

        // lấy giá trị của phần tử trong mảng
//        System.out.println(arrNumbers[arrNumbers.length - 1]);

        // cập nhật giá trị cho phần tử
//        arrNames[0] = "Tèo";
//        arrNames[1] = "Tí";
//        arrNames[2] = "Tủn";

        // 6 : Vòng lặp for

//        for(int i = 10 ; i >= 0 ; i--){
//            System.out.println("Value : " + i);
//        }

        String[] arrNames = {"Tèo","Tý","Tủn","Đức","Tuấn","Hoa"};
    }
}
