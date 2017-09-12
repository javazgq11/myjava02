package day14kuozhanT01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recei {
	public static void main(String[] args) throws IOException {
		DatagramSocket receds=new DatagramSocket(4215);
		while(true){
			byte []buf=new byte[1024];
			DatagramPacket recedp=new DatagramPacket(buf,  buf.length);
			receds.receive(recedp);
			 String st=new String(buf).trim();
			System.out.println("over".equals(st));
			if("over".equals(st)){
				System.out.println(st);
				System.out.println(new String(buf));
				break;
			}else{
				System.out.println(st.toUpperCase());
			}
		}
		receds.close();
	}
}
