package 示例1;
import java.util.Scanner;
public class Price {
	public static void main(String[] args) {
		String name = "";
		double price = 0.0;
		int goodsNo = 0;
		int amount = 0;
		double total = 0.0;
		double payment = 0.0;
		double discount = 0.8;
		System.out.println("Myshopping管理系统 > 购物结算\n");
		System.out.println("***************************");
		System.out.print("请选择购买的商品编号：");
		System.out.println("1.T恤  2.网球鞋  3.网球拍");
		System.out.println("***************************");
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while("y".equals(answer)) {
			System.out.print("请输入编号：");
			goodsNo = input.nextInt();
			switch(goodsNo) {
			case 1:
				name = "T恤";
				price = 245.0;
				break;
			case 2:
				name = "网球鞋";
				price = 570.0;
				break;
			case 3:
				name = "网球拍";
				price = 320.0;
				break;
			default:
				System.out.println("暂无此商品，请重新选择");
			}
			//System.out.println(name+"\t￥"+price);
			//System.out.print("是否继续(y/n)");
			//answer = input.next();
			System.out.print("请选择购买数量：");
			amount = input.nextInt();
			System.out.println(name+"￥"+price+"\t"+"数量"+amount+"\t"+"合计￥"+price*amount);
			System.out.print("是否继续(y/n)");
			answer = input.next();
		}
		System.out.println("\n折扣："+discount);
		total = (price*amount)*discount;
		System.out.println("应付金额："+total);
		payment = 400;
		System.out.println("实付金额："+(int)payment);
		System.out.println("找钱："+(payment-total));
	}
		
}
