package ʾ��1;
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
		System.out.println("Myshopping����ϵͳ > �������\n");
		System.out.println("***************************");
		System.out.print("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��  2.����Ь  3.������");
		System.out.println("***************************");
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while("y".equals(answer)) {
			System.out.print("�������ţ�");
			goodsNo = input.nextInt();
			switch(goodsNo) {
			case 1:
				name = "T��";
				price = 245.0;
				break;
			case 2:
				name = "����Ь";
				price = 570.0;
				break;
			case 3:
				name = "������";
				price = 320.0;
				break;
			default:
				System.out.println("���޴���Ʒ��������ѡ��");
			}
			//System.out.println(name+"\t��"+price);
			//System.out.print("�Ƿ����(y/n)");
			//answer = input.next();
			System.out.print("��ѡ����������");
			amount = input.nextInt();
			System.out.println(name+"��"+price+"\t"+"����"+amount+"\t"+"�ϼƣ�"+price*amount);
			System.out.print("�Ƿ����(y/n)");
			answer = input.next();
		}
		System.out.println("\n�ۿۣ�"+discount);
		total = (price*amount)*discount;
		System.out.println("Ӧ����"+total);
		payment = 400;
		System.out.println("ʵ����"+(int)payment);
		System.out.println("��Ǯ��"+(payment-total));
	}
		
}
