package day14kuozhanT01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * ��дUDP����
  	Ҫ��:
���Ͷ˼�����������,����һ��,���͵����ն�
        �������������� over �ͽ�������
        ���ն˽�������,�����յ�������ת�ɴ�д���������̨
        ������յ�over,��������������
 */
public class send {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		DatagramSocket sendds=new DatagramSocket();
		while(true){
			System.out.println("������һ��");
			String s=sc.nextLine();
			DatagramPacket senddp=new DatagramPacket(s.getBytes(),
					s.getBytes().length, InetAddress.getByName("127.0.0.1"), 4215);
			sendds.send(senddp);
			if("over".equals(s)){
				System.out.println("��������");
				sendds.close();
				break;
			}
		}
		
	}
}
