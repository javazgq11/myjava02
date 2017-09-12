package day14kuozhanT01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * 编写UDP程序
  	要求:
发送端键盘输入内容,输入一行,发送到接收端
        如果键盘输入的是 over 就结束发送
        接收端接收输入,将接收到的内容转成大写输出到控制台
        如果接收到over,就输出程序结束了
 */
public class send {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		DatagramSocket sendds=new DatagramSocket();
		while(true){
			System.out.println("请输入一行");
			String s=sc.nextLine();
			DatagramPacket senddp=new DatagramPacket(s.getBytes(),
					s.getBytes().length, InetAddress.getByName("127.0.0.1"), 4215);
			sendds.send(senddp);
			if("over".equals(s)){
				System.out.println("结束程序");
				sendds.close();
				break;
			}
		}
		
	}
}
