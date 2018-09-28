package com.trio.zookeeper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MonitorZookeeperIsOnline {
	private static ZookeeperServiceStatusTest zkt = new ZookeeperServiceStatusTest();
	public static void main(String[] args) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
		Boolean result = false;		
		int count = 0;	
		
		while(!result) {			
			try {														
				count ++ ;				
				System.out.println(sdf.format(new Date()) + "--循环执行第" + count + "次");
				openMonitor();
//				if (count == 3) {					
//					result = true;					
//					break ;				
//					}	
				//设置暂停的时间 5 秒	
				Thread.sleep(15 * 1000); 
				} catch (InterruptedException e) {				
					e.printStackTrace();			
				}  		
			}	
		}
	
	public static void openMonitor() throws IOException {
		zkt.serverStatus();
	}
}
			



	

