package FcamCh05;

public class OrderLisfofShoppingMall {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쇼핑몰에 주문이 들어 왔다.
			OrderList orderContent = new OrderList();
			orderContent.setOrderNumber("201907210001");
			orderContent.setOrderId("abc123");
			orderContent.setOrderDate("2019년 7월 21일 ");
			orderContent.setOrderName("홍길순");
			orderContent.setOrderProductNumber("PD0345-12");
			orderContent.setOrderAddress("서울시 영등포구 여의도동 20번지");
			
			System.out.println("주문 번호 : "+orderContent.getOrderNumber());
			System.out.println("주문자 아이디 : "+orderContent.getOrderId());
			System.out.println("주문 날짜 : "+orderContent.getOrderDate());
			System.out.println("주문자 이름 : "+orderContent.getOrderName());
			System.out.println("주문 상품 번호 : "+orderContent.getOrderProductNumber());
			System.out.println("배송 주소 : "+orderContent.getOrderAddress());
	}

}
