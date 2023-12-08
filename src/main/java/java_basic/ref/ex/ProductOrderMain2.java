package java_basic.ref.ex;

import java_basic.ref.ex.ProductOrder;

public class ProductOrderMain2 {
    public static void main(String[] args) {
//        // 여러 상품의 주문 정보를 담는 배열 생성
//        java_basic.ref.ex.ProductOrder[] productOrders = new java_basic.ref.ex.ProductOrder[3];
//
//        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
//        java_basic.ref.ex.ProductOrder productOrder1 = new java_basic.ref.ex.ProductOrder();
//        productOrder1.productName = "두부";
//        productOrder1.price = 2000;
//        productOrder1.quantity = 2;
//
//        java_basic.ref.ex.ProductOrder productOrder2 = new java_basic.ref.ex.ProductOrder();
//        productOrder2.productName = "김치";
//        productOrder2.price = 5000;
//        productOrder2.quantity = 1;
//
//        java_basic.ref.ex.ProductOrder productOrder3 = new java_basic.ref.ex.ProductOrder();
//        productOrder3.productName = "콜라";
//        productOrder3.price = 1500;
//        productOrder3.quantity = 2;
//
//        productOrders[0] = productOrder1;
//        productOrders[1] = productOrder2;
//        productOrders[2] = productOrder3;
//
//        // 상품 주문 정보와 최종 금액 출력
//        int sum = 0;
//        for (ProductOrder p : productOrders) {
//            System.out.println("상품명: " + p.productName + " 가격: " + p.price + " 수량: " + p.quantity);
//            sum += p.price * p.quantity;
//        }
//        System.out.println("총 결제 금액: " + sum);

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        ProductOrder tufu = createOrder("두부", 2000, 2);
        ProductOrder kimchi = createOrder("김치", 5000, 1);
        ProductOrder cola = createOrder("콜라", 1500, 2);
        productOrders[0] = tufu;
        productOrders[1] = kimchi;
        productOrders[2] = cola;

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(productOrders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(productOrders);

        // 총 결제 금액 출력
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