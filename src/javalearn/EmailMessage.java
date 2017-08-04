package javalearn;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeBodyPart;

public class EmailMessage {
	/*
	 * 创建邮件
	 * @param session
	 *
	 */
	private static String EMAIL="442638790@qq.com";
	private static String TITLE="this is the title";
	private static String SMTP="smtp.qq.com";
	public static void CreateEmail(Session session){
//		//创建一封邮件
//		MimeMessage emailMessage=new MimeMessage(session);
//		//设置发件人
//		emailMessage.setFrom(new InternetAddress(EMAIL,"GangSta","UTF-8"));
//		//设置收件人
//		emailMessage.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(receiveMail, "云盘用户", "UTF-8"));
//		//邮件主题
//		emailMessage.setSubject("用户验证码验证", "UTF-8");
//		
//		//用于保存最终的正文
//		MimeBodyPart contentBody=new MimeBodyPart();
//		//用于组合文本和图片，“related”型的MimeMultipart对象
//		MimeMultipart contentMulti=new MimeMultipart("related");
//		//正文文字部分
//		MimeBodyPart textBody=new MimeBodyPart();
//		textBody.setContent("该文件自动发送，~~~","text/html;charset=utf-8");
//		contentMulti.addBodyPart(textBody);
//		//创建一个图片的额表示
//		MimeBodyPart img = new MimeBodyPart();
		
	}
}
