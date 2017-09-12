package lianxi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class T01 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket();
		byte[] arg="都会好的好吧苟富贵".getBytes();
		DatagramPacket dp=new DatagramPacket(arg,arg.length,InetAddress.getByName("192.168.88.25"),1250);
		ds.send(dp);
		ds.close();
	}
}
