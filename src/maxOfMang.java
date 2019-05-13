import java.util.Scanner;

public class maxOfMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử :");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Số lượng không được quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        for(i = 0; i < array.length; i ++) {
            System.out.println("Nhập số tiền của tỉ phú thứ " + (i + 1) );
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int j = 0;
        int index = 1;
        for (j = 1; j < array.length; j ++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("Giá trị lớn nhất là " + max + " ở vị trí thứ " + index);
    }
}
