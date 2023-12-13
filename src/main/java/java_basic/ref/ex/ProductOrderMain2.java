package java_basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int orderNum = scanner.nextInt();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[orderNum];

        for (int i = 0; i < orderNum; i++) {
            System.out.println(i + "번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            String productName = scanner.next();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);

        int totalAmount = getTotalAmount(productOrders);

        System.out.println("총 결제 금액: " + totalAmount);
    }

    private static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    private static void printOrders(ProductOrder[] orders){
        for (ProductOrder p : orders) {
            System.out.println("상품명: " + p.productName + " 가격: " + p.price + " 수량: " + p.quantity);
        }
    }

    private static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for (ProductOrder p : orders) {
            sum += p.price * p.quantity;
        }
        return sum;
    }
}