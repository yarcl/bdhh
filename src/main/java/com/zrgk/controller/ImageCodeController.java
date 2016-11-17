package com.zrgk.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class ImageCodeController {
	
	@RequestMapping(value="ImageCode.do")
	public void getImageCode(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int width = 80;// 图片的宽度
		int height = 40;// 图片的高度

		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; // 62

		// 1.获取一张画布
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR); // RED

		// 2.获取一个画笔
		Graphics g = bi.getGraphics();
		
		// 3.给画布填充背景
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		
		// 4.生成边框
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width - 1, height - 1);

		
		// 5.往图片上写字
		Random r = new Random();
		
		//6.干扰线
		for(int i=0;i<6;i++){
			
			int x1=r.nextInt(width);
			int y1=r.nextInt(height);
			
			int x2=r.nextInt(width);
			int y2=r.nextInt(height);
			
			int red=r.nextInt(256);
			int green=r.nextInt(256);
			int blue=r.nextInt(256);
			Color color=new Color(red, green, blue);
			g.setColor(color);
			
			g.drawLine(x1, y1, x2, y2);
		}
		
		StringBuffer sb=new StringBuffer(); //字符串拼接
		
		//生成随机数
		for (int i = 0; i <= 3; i++) {
			int index = r.nextInt(62);
			
			String c=array[index]+"";
			sb.append(c);
			
			int red=r.nextInt(256);
			int green=r.nextInt(256);
			int blue=r.nextInt(256);
			Color color=new Color(red, green, blue);
			g.setColor(color);
			
			Font font=new Font("Arial",Font.BOLD , 20); //创建一个字体
			g.setFont(font);
			
			g.drawString(c, (width/6)*(i+1) , 20);
		}
		
		//System.out.println("系统生成的验证码是:"+sb.toString());
		
		HttpSession session = request.getSession();
		session.setAttribute("sysCode", sb.toString());
		
		// 7.输出图片
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(bi, "jpeg", out); // 输出图片
	}
	
}
