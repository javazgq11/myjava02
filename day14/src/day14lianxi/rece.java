package day14lianxi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class rece {
	public static void main(String[] args) throws IOException {
		System.out.println("�Ǹ��ö��");
		byte []buf=new byte[1024];
		System.out.println(new String(buf)+"�Ǹ��ö��");
		DatagramPacket redp=new DatagramPacket(buf, buf.length);
		DatagramSocket reds=new DatagramSocket(1701);
				reds.receive(redp);
				System.out.println(new String(buf)+"�Ǹ��ö��");
				System.out.println(redp.getAddress().getHostAddress()+"___"+redp.getPort()+"____"+new String(buf));
				System.out.println(reds.getPort()+"gh");
				reds.close();
	}
}
