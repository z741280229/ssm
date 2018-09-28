package com.trio.zookeeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import org.junit.Test;

public class ZookeeperServiceStatusTest {

	private static final String HOST = "192.168.1.243";
	private static final Integer PORT = 2181;

	@Test
	public void serverStatus() throws IOException {
		Socket sock = null;
		BufferedReader reader = null;
		String cmd = "status";
		try {
			sock = new Socket(HOST, PORT);
			OutputStream outstream = sock.getOutputStream();
			// 通过Zookeeper的status命令获取服务器的状态
			outstream.write(cmd.getBytes());
			outstream.flush();
			sock.shutdownOutput();
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Zookeeper 地址:" + HOST + ":" + PORT + "连接失败" );
		} finally {
			if (sock != null) {
				sock.close();
			}
			if (reader != null) {
				reader.close();
			}
		}
	}


}
