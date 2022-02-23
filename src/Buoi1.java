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
        //3 : Toán tử
//        int a = 5;
//        a = a + 1;
//        a += 1;
//        int b = ++a;
//        System.out.println("Giá trị b = " + b);
//        System.out.println("Giá trị a = " + a);

//        int a = 5;
//        int b = 5;
//
//        int ketQua = a++ - b-- - --b + a-- + ++a;
        // 5 - b-- - --b + a-- + ++a; a = 6 , b =5
        // 5 - 5 - --b + a-- + ++a; a = 6 , b = 4
        // 5 - 5 - 3 + a-- + ++a; a = 6 , b = 3
        // 5 - 5 - 3 + 6 + ++a; a = 5 , b = 3
        // 5 - 5 - 3 + 6 + 6; a = 6 , b = 3
        // 9 ; a = 6 , b = 3
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);
//        System.out.println("Kết quả = " + ketQua);

        int a = 10;
        int b = 5;

        int ketQua = --a - --b - a-- + --b - b-- + a-- + b-- + a--;
        //In giá trị a , b , ket quả
    }
}
