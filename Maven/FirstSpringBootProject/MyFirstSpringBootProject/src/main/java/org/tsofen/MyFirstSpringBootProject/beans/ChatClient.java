package org.tsofen.MyFirstSpringBootProject.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ChatClient
{
	@Value("${ip}") // Load values from the application.properties file
	private String ip;
	@Value("${port}")
	private int port;
	public ChatClient(String ip, int port)
	{
		super();
		this.ip = ip;
		this.port = port;
	}
	public ChatClient()
	{
		super();
	}
	public void sendMessage(String msg)
	{
		System.out.println("Sending message: " + msg + " from " + ip + ":" + port);
	}
	public String getIp()
	{
		return ip;
	}
	public void setIp(String ip)
	{
		this.ip = ip;
	}
	public int getPort()
	{
		return port;
	}
	public void setPort(int port)
	{
		this.port = port;
	}
	
}
