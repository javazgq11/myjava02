package lianxi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Send {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket (4700);
		Socket s=ss.accept();
		System.out.println(s);
		InputStream ips=s.getInputStream();
		byte [] arr=new byte[1024];
		
		int a=ips.read(arr);
		System.out.println(new String(arr,0,a));
		OutputStream out=s.getOutputStream();
		out.write(" ÷µΩ¡À".getBytes());
		out.close();
		s.close();
		ss.close();
	
	}
}
