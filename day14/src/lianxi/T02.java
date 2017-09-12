package lianxi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class T02 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(1250);
		byte [] arr= new byte [1024];
		DatagramPacket dp=new DatagramPacket(arr, arr.length);
		
		ds.receive(dp);
		ds.close();
		System.out.println(arr.length);
		System.out.println(new String(arr));
		System.out.println(new String(arr).trim().length());
	}
}
