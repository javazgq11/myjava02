package day14lianxi;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class T01 {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println("over".equals(new String("over".getBytes())));
		/*System.out.println(InetAddress.getLocalHost());
		 InetAddress inet=InetAddress.getLocalHost();
		 System.out.println(inet.getHostName());
		 System.out.println(inet.getHostAddress());
		 //System.out.println(InetAddress.getByAddress("192.168.88.31"));
		 System.out.println("IPµÿ÷∑:"+InetAddress.getByName("DESKTOP-8G0AV4C").getHostAddress());*/
		  //byte[]arr={ -64,-88,88,53};
		 /*  byte [] ay={1,9,2,1,6,8,8,8,3,1};
		   for (byte b : ay) {
			System.out.println(b);
		}
		
		 InetAddress inet=InetAddress.getByAddress(ay);
		 System.out.println(inet.getHostName());
		 System.out.println(inet.getHostAddress());*/
		 InetAddress inet=InetAddress.getLocalHost();
		byte[]hu= inet.getAddress();
		
		 for (byte b : hu) {
			System.out.println(b);
		}
		 
		 byte a=(byte)192;
		 System.out.println(a);
		 //byte[]arr={ -64,-88,88,117};
		 String e="192.168.88.40";
		 System.out.println(InetAddress.getByName(e).getHostName()+"_____"+InetAddress.getByName(e).getHostAddress());
		
	}
	
}
