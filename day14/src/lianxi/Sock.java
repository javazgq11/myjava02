package lianxi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Sock {
	public static void main(String[] args) throws Exception {
		System.out.println(InetAddress.getLocalHost());
		Socket so=new Socket(
				"127.0.0.1",4700);
		OutputStream ops=so.getOutputStream();
		ops.write("tcp–≠“È".getBytes());
		InputStream ips=so.getInputStream();
		byte [] arr=new byte [1024];
		int len=ips.read(arr);
		System.out.println(new String (arr,0,len));
		so.close();
	}
}
