package com.mailer;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String message = "<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n"
				+ "<head>\r\n"
				+ "	<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">\r\n"
				+ "  	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0;\">\r\n"
				+ " 	<meta name=\"format-detection\" content=\"telephone=no\"/>\r\n"
				+ "\r\n"
				+ "	<!-- Responsive Mobile-First Email Template by Konstantin Savchenko, 2015.\r\n"
				+ "	https://github.com/konsav/email-templates/  -->\r\n"
				+ "\r\n"
				+ "	<style>\r\n"
				+ "/* Reset styles */ \r\n"
				+ "body { margin: 0; padding: 0; min-width: 100%; width: 100% !important; height: 100% !important;}\r\n"
				+ "body, table, td, div, p, a { -webkit-font-smoothing: antialiased; text-size-adjust: 100%; -ms-text-size-adjust: 100%; -webkit-text-size-adjust: 100%; line-height: 100%; }\r\n"
				+ "table, td { mso-table-lspace: 0pt; mso-table-rspace: 0pt; border-collapse: collapse !important; border-spacing: 0; }\r\n"
				+ "img { border: 0; line-height: 100%; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; }\r\n"
				+ "#outlook a { padding: 0; }\r\n"
				+ ".ReadMsgBody { width: 100%; } .ExternalClass { width: 100%; }\r\n"
				+ ".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div { line-height: 100%; }\r\n"
				+ "\r\n"
				+ "/* Rounded corners for advanced mail clients only */ \r\n"
				+ "@media all and (min-width: 560px) {\r\n"
				+ "	.container { border-radius: 8px; -webkit-border-radius: 8px; -moz-border-radius: 8px; -khtml-border-radius: 8px;}\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Set color for auto links (addresses, dates, etc.) */ \r\n"
				+ "a, a:hover {\r\n"
				+ "	color: #127DB3;\r\n"
				+ "}\r\n"
				+ ".footer a, .footer a:hover {\r\n"
				+ "	color: #999999;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ " 	</style>\r\n"
				+ "\r\n"
				+ "	<!-- MESSAGE SUBJECT -->\r\n"
				+ "	<title>Get this responsive email template</title>\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<!-- BODY -->\r\n"
				+ "<!-- Set message background color (twice) and text color (twice) -->\r\n"
				+ "<body topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" leftmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" width=\"100%\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; width: 100%; height: 100%; -webkit-font-smoothing: antialiased; text-size-adjust: 100%; -ms-text-size-adjust: 100%; -webkit-text-size-adjust: 100%; line-height: 100%;\r\n"
				+ "	background-color: #F0F0F0;\r\n"
				+ "	color: #000000;\"\r\n"
				+ "	bgcolor=\"#F0F0F0\"\r\n"
				+ "	text=\"#000000\">\r\n"
				+ "\r\n"
				+ "<!-- SECTION / BACKGROUND -->\r\n"
				+ "<!-- Set message background color one again -->\r\n"
				+ "<table width=\"100%\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; width: 100%;\" class=\"background\"><tr><td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0;\"\r\n"
				+ "	bgcolor=\"#F0F0F0\">\r\n"
				+ "\r\n"
				+ "<!-- WRAPPER -->\r\n"
				+ "<!-- Set wrapper width (twice) -->\r\n"
				+ "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\"\r\n"
				+ "	width=\"560\" style=\"border-collapse: collapse; border-spacing: 0; padding: 0; width: inherit;\r\n"
				+ "	max-width: 560px;\" class=\"wrapper\">\r\n"
				+ "\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%;\r\n"
				+ "			padding-top: 20px;\r\n"
				+ "			padding-bottom: 20px;\">\r\n"
				+ "\r\n"
				+ "			<!-- PREHEADER -->\r\n"
				+ "			<!-- Set text color to background color -->\r\n"
				+ "			<div style=\"display: none; visibility: hidden; overflow: hidden; opacity: 0; font-size: 1px; line-height: 1px; height: 0; max-height: 0; max-width: 0;\r\n"
				+ "			color: #F0F0F0;\" class=\"preheader\">\r\n"
				+ "				Available on&nbsp;GitHub and&nbsp;CodePen. Highly compatible. Designer friendly. More than 50%&nbsp;of&nbsp;total email opens occurred on&nbsp;a&nbsp;mobile device&nbsp;— a&nbsp;mobile-friendly design is&nbsp;a&nbsp;must for&nbsp;email campaigns.</div>\r\n"
				+ "\r\n"
				+ "			<!-- LOGO -->\r\n"
				+ "			<!-- Image text color should be opposite to background color. Set your url, image src, alt and title. Alt text should fit the image size. Real image size should be x2. URL format: http://domain.com/?utm_source={{Campaign-Source}}&utm_medium=email&utm_content=logo&utm_campaign={{Campaign-Name}} -->\r\n"
				+ "			<a target=\"_blank\" style=\"text-decoration: none;\"\r\n"
				+ "				href=\"https://github.com/konsav/email-templates/\"><img border=\"0\" vspace=\"0\" hspace=\"0\"\r\n"
				+ "				src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/logo-black.png\"\r\n"
				+ "				width=\"100\" height=\"30\"\r\n"
				+ "				alt=\"Logo\" title=\"Logo\" style=\"\r\n"
				+ "				color: #000000;\r\n"
				+ "				font-size: 10px; margin: 0; padding: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: block;\" /></a>\r\n"
				+ "\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "<!-- End of WRAPPER -->\r\n"
				+ "</table>\r\n"
				+ "\r\n"
				+ "<!-- WRAPPER / CONTEINER -->\r\n"
				+ "<!-- Set conteiner background color -->\r\n"
				+ "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\"\r\n"
				+ "	bgcolor=\"#FFFFFF\"\r\n"
				+ "	width=\"560\" style=\"border-collapse: collapse; border-spacing: 0; padding: 0; width: inherit;\r\n"
				+ "	max-width: 560px;\" class=\"container\">\r\n"
				+ "\r\n"
				+ "	<!-- HEADER -->\r\n"
				+ "	<!-- Set text color and font family (\"sans-serif\" or \"Georgia, serif\") -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%; font-size: 24px; font-weight: bold; line-height: 130%;\r\n"
				+ "			padding-top: 25px;\r\n"
				+ "			color: #000000;\r\n"
				+ "			font-family: sans-serif;\" class=\"header\">\r\n"
				+ "				Get this responsive email template\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "	\r\n"
				+ "	<!-- SUBHEADER -->\r\n"
				+ "	<!-- Set text color and font family (\"sans-serif\" or \"Georgia, serif\") -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-bottom: 3px; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%; font-size: 18px; font-weight: 300; line-height: 150%;\r\n"
				+ "			padding-top: 5px;\r\n"
				+ "			color: #000000;\r\n"
				+ "			font-family: sans-serif;\" class=\"subheader\">\r\n"
				+ "				Available on&nbsp;GitHub and&nbsp;CodePen\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- HERO IMAGE -->\r\n"
				+ "	<!-- Image text color should be opposite to background color. Set your url, image src, alt and title. Alt text should fit the image size. Real image size should be x2 (wrapper x2). Do not set height for flexible images (including \"auto\"). URL format: http://domain.com/?utm_source={{Campaign-Source}}&utm_medium=email&utm_content={{Ìmage-Name}}&utm_campaign={{Campaign-Name}} -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0;\r\n"
				+ "			padding-top: 20px;\" class=\"hero\"><a target=\"_blank\" style=\"text-decoration: none;\"\r\n"
				+ "			href=\"https://github.com/konsav/email-templates/\"><img border=\"0\" vspace=\"0\" hspace=\"0\"\r\n"
				+ "			src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/hero-wide.png\"\r\n"
				+ "			alt=\"Please enable images to view this content\" title=\"Hero Image\"\r\n"
				+ "			width=\"560\" style=\"\r\n"
				+ "			width: 100%;\r\n"
				+ "			max-width: 560px;\r\n"
				+ "			color: #000000; font-size: 13px; margin: 0; padding: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: block;\"/></a></td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- PARAGRAPH -->\r\n"
				+ "	<!-- Set text color and font family (\"sans-serif\" or \"Georgia, serif\"). Duplicate all text styles in links, including line-height -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%; font-size: 17px; font-weight: 400; line-height: 160%;\r\n"
				+ "			padding-top: 25px; \r\n"
				+ "			color: #000000;\r\n"
				+ "			font-family: sans-serif;\" class=\"paragraph\">\r\n"
				+ "				More than 50%&nbsp;of&nbsp;total email opens occurred on&nbsp;a&nbsp;mobile device&nbsp;— a&nbsp;mobile-friendly design is&nbsp;a&nbsp;must for&nbsp;email campaigns.\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- BUTTON -->\r\n"
				+ "	<!-- Set button background color at TD, link/text color at A and TD, font family (\"sans-serif\" or \"Georgia, serif\") at TD. For verification codes add \"letter-spacing: 5px;\". Link format: http://domain.com/?utm_source={{Campaign-Source}}&utm_medium=email&utm_content={{Button-Name}}&utm_campaign={{Campaign-Name}} -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%;\r\n"
				+ "			padding-top: 25px;\r\n"
				+ "			padding-bottom: 5px;\" class=\"button\"><a\r\n"
				+ "			href=\"https://github.com/konsav/email-templates/\" target=\"_blank\" style=\"text-decoration: underline;\">\r\n"
				+ "				<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"max-width: 240px; min-width: 120px; border-collapse: collapse; border-spacing: 0; padding: 0;\"><tr><td align=\"center\" valign=\"middle\" style=\"padding: 12px 24px; margin: 0; text-decoration: underline; border-collapse: collapse; border-spacing: 0; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; -khtml-border-radius: 4px;\"\r\n"
				+ "					bgcolor=\"#E9703E\"><a target=\"_blank\" style=\"text-decoration: underline;\r\n"
				+ "					color: #FFFFFF; font-family: sans-serif; font-size: 17px; font-weight: 400; line-height: 120%;\"\r\n"
				+ "					href=\"https://github.com/konsav/email-templates/\">\r\n"
				+ "						Get the template\r\n"
				+ "					</a>\r\n"
				+ "			</td></tr></table></a>\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- LINE -->\r\n"
				+ "	<!-- Set line color -->\r\n"
				+ "	<tr>	\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%;\r\n"
				+ "			padding-top: 25px;\" class=\"line\"><hr\r\n"
				+ "			color=\"#E0E0E0\" align=\"center\" width=\"100%\" size=\"1\" noshade style=\"margin: 0; padding: 0;\" />\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- LIST -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%;\" class=\"list-item\"><table align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width: inherit; margin: 0; padding: 0; border-collapse: collapse; border-spacing: 0;\">\r\n"
				+ "			\r\n"
				+ "			<!-- LIST ITEM -->\r\n"
				+ "			<tr>\r\n"
				+ "\r\n"
				+ "				<!-- LIST ITEM IMAGE -->\r\n"
				+ "				<!-- Image text color should be opposite to background color. Set your url, image src, alt and title. Alt text should fit the image size. Real image size should be x2 -->\r\n"
				+ "				<td align=\"left\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0;\r\n"
				+ "					padding-top: 30px;\r\n"
				+ "					padding-right: 20px;\"><img\r\n"
				+ "				border=\"0\" vspace=\"0\" hspace=\"0\" style=\"padding: 0; margin: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: block;\r\n"
				+ "					color: #000000;\"\r\n"
				+ "					src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/list-item.png\"\r\n"
				+ "					alt=\"H\" title=\"Highly compatible\"\r\n"
				+ "					width=\"50\" height=\"50\"></td>\r\n"
				+ "\r\n"
				+ "				<!-- LIST ITEM TEXT -->\r\n"
				+ "				<!-- Set text color and font family (\"sans-serif\" or \"Georgia, serif\"). Duplicate all text styles in links, including line-height -->\r\n"
				+ "				<td align=\"left\" valign=\"top\" style=\"font-size: 17px; font-weight: 400; line-height: 160%; border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0;\r\n"
				+ "					padding-top: 25px;\r\n"
				+ "					color: #000000;\r\n"
				+ "					font-family: sans-serif;\" class=\"paragraph\">\r\n"
				+ "						<b style=\"color: #333333;\">Highly compatible</b><br/>\r\n"
				+ "						Tested on the most popular email clients for web, desktop and mobile. Checklist included.\r\n"
				+ "				</td>\r\n"
				+ "\r\n"
				+ "			</tr>\r\n"
				+ "\r\n"
				+ "			<!-- LIST ITEM -->\r\n"
				+ "			<tr>\r\n"
				+ "\r\n"
				+ "				<!-- LIST ITEM IMAGE -->\r\n"
				+ "				<!-- Image text color should be opposite to background color. Set your url, image src, alt and title. Alt text should fit the image size. Real image size should be x2 -->\r\n"
				+ "				<td align=\"left\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0;\r\n"
				+ "					padding-top: 30px;\r\n"
				+ "					padding-right: 20px;\"><img\r\n"
				+ "				border=\"0\" vspace=\"0\" hspace=\"0\" style=\"padding: 0; margin: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: block;\r\n"
				+ "					color: #000000;\"\r\n"
				+ "					src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/list-item.png\"\r\n"
				+ "					alt=\"D\" title=\"Designer friendly\"\r\n"
				+ "					width=\"50\" height=\"50\"></td>\r\n"
				+ "\r\n"
				+ "				<!-- LIST ITEM TEXT -->\r\n"
				+ "				<!-- Set text color and font family (\"sans-serif\" or \"Georgia, serif\"). Duplicate all text styles in links, including line-height -->\r\n"
				+ "				<td align=\"left\" valign=\"top\" style=\"font-size: 17px; font-weight: 400; line-height: 160%; border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0;\r\n"
				+ "					padding-top: 25px;\r\n"
				+ "					color: #000000;\r\n"
				+ "					font-family: sans-serif;\" class=\"paragraph\">\r\n"
				+ "						<b style=\"color: #333333;\">Designer friendly</b><br/>\r\n"
				+ "						Sketch app resource file and a&nbsp;bunch of&nbsp;social media icons are&nbsp;also included in&nbsp;GitHub repository.\r\n"
				+ "				</td>\r\n"
				+ "\r\n"
				+ "			</tr>\r\n"
				+ "\r\n"
				+ "		</table></td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- LINE -->\r\n"
				+ "	<!-- Set line color -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%;\r\n"
				+ "			padding-top: 25px;\" class=\"line\"><hr\r\n"
				+ "			color=\"#E0E0E0\" align=\"center\" width=\"100%\" size=\"1\" noshade style=\"margin: 0; padding: 0;\" />\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- PARAGRAPH -->\r\n"
				+ "	<!-- Set text color and font family (\"sans-serif\" or \"Georgia, serif\"). Duplicate all text styles in links, including line-height -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%; font-size: 17px; font-weight: 400; line-height: 160%;\r\n"
				+ "			padding-top: 20px;\r\n"
				+ "			padding-bottom: 25px;\r\n"
				+ "			color: #000000;\r\n"
				+ "			font-family: sans-serif;\" class=\"paragraph\">\r\n"
				+ "				Have a&nbsp;question? <a href=\"mailto:support@ourteam.com\" target=\"_blank\" style=\"color: #127DB3; font-family: sans-serif; font-size: 17px; font-weight: 400; line-height: 160%;\">support@ourteam.com</a>\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "<!-- End of WRAPPER -->\r\n"
				+ "</table>\r\n"
				+ "\r\n"
				+ "<!-- WRAPPER -->\r\n"
				+ "<!-- Set wrapper width (twice) -->\r\n"
				+ "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\"\r\n"
				+ "	width=\"560\" style=\"border-collapse: collapse; border-spacing: 0; padding: 0; width: inherit;\r\n"
				+ "	max-width: 560px;\" class=\"wrapper\">\r\n"
				+ "\r\n"
				+ "	<!-- SOCIAL NETWORKS -->\r\n"
				+ "	<!-- Image text color should be opposite to background color. Set your url, image src, alt and title. Alt text should fit the image size. Real image size should be x2 -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%;\r\n"
				+ "			padding-top: 25px;\" class=\"social-icons\"><table\r\n"
				+ "			width=\"256\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"border-collapse: collapse; border-spacing: 0; padding: 0;\">\r\n"
				+ "			<tr>\r\n"
				+ "\r\n"
				+ "				<!-- ICON 1 -->\r\n"
				+ "				<td align=\"center\" valign=\"middle\" style=\"margin: 0; padding: 0; padding-left: 10px; padding-right: 10px; border-collapse: collapse; border-spacing: 0;\"><a target=\"_blank\"\r\n"
				+ "					href=\"https://raw.githubusercontent.com/konsav/email-templates/\"\r\n"
				+ "				style=\"text-decoration: none;\"><img border=\"0\" vspace=\"0\" hspace=\"0\" style=\"padding: 0; margin: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: inline-block;\r\n"
				+ "					color: #000000;\"\r\n"
				+ "					alt=\"F\" title=\"Facebook\"\r\n"
				+ "					width=\"44\" height=\"44\"\r\n"
				+ "					src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/social-icons/facebook.png\"></a></td>\r\n"
				+ "\r\n"
				+ "				<!-- ICON 2 -->\r\n"
				+ "				<td align=\"center\" valign=\"middle\" style=\"margin: 0; padding: 0; padding-left: 10px; padding-right: 10px; border-collapse: collapse; border-spacing: 0;\"><a target=\"_blank\"\r\n"
				+ "					href=\"https://raw.githubusercontent.com/konsav/email-templates/\"\r\n"
				+ "				style=\"text-decoration: none;\"><img border=\"0\" vspace=\"0\" hspace=\"0\" style=\"padding: 0; margin: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: inline-block;\r\n"
				+ "					color: #000000;\"\r\n"
				+ "					alt=\"T\" title=\"Twitter\"\r\n"
				+ "					width=\"44\" height=\"44\"\r\n"
				+ "					src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/social-icons/twitter.png\"></a></td>				\r\n"
				+ "\r\n"
				+ "				<!-- ICON 3 -->\r\n"
				+ "				<td align=\"center\" valign=\"middle\" style=\"margin: 0; padding: 0; padding-left: 10px; padding-right: 10px; border-collapse: collapse; border-spacing: 0;\"><a target=\"_blank\"\r\n"
				+ "					href=\"https://raw.githubusercontent.com/konsav/email-templates/\"\r\n"
				+ "				style=\"text-decoration: none;\"><img border=\"0\" vspace=\"0\" hspace=\"0\" style=\"padding: 0; margin: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: inline-block;\r\n"
				+ "					color: #000000;\"\r\n"
				+ "					alt=\"G\" title=\"Google Plus\"\r\n"
				+ "					width=\"44\" height=\"44\"\r\n"
				+ "					src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/social-icons/googleplus.png\"></a></td>		\r\n"
				+ "\r\n"
				+ "				<!-- ICON 4 -->\r\n"
				+ "				<td align=\"center\" valign=\"middle\" style=\"margin: 0; padding: 0; padding-left: 10px; padding-right: 10px; border-collapse: collapse; border-spacing: 0;\"><a target=\"_blank\"\r\n"
				+ "					href=\"https://raw.githubusercontent.com/konsav/email-templates/\"\r\n"
				+ "				style=\"text-decoration: none;\"><img border=\"0\" vspace=\"0\" hspace=\"0\" style=\"padding: 0; margin: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: inline-block;\r\n"
				+ "					color: #000000;\"\r\n"
				+ "					alt=\"I\" title=\"Instagram\"\r\n"
				+ "					width=\"44\" height=\"44\"\r\n"
				+ "					src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/social-icons/instagram.png\"></a></td>\r\n"
				+ "\r\n"
				+ "			</tr>\r\n"
				+ "			</table>\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "	<!-- FOOTER -->\r\n"
				+ "	<!-- Set text color and font family (\"sans-serif\" or \"Georgia, serif\"). Duplicate all text styles in links, including line-height -->\r\n"
				+ "	<tr>\r\n"
				+ "		<td align=\"center\" valign=\"top\" style=\"border-collapse: collapse; border-spacing: 0; margin: 0; padding: 0; padding-left: 6.25%; padding-right: 6.25%; width: 87.5%; font-size: 13px; font-weight: 400; line-height: 150%;\r\n"
				+ "			padding-top: 20px;\r\n"
				+ "			padding-bottom: 20px;\r\n"
				+ "			color: #999999;\r\n"
				+ "			font-family: sans-serif;\" class=\"footer\">\r\n"
				+ "\r\n"
				+ "				This email template was sent to&nbsp;you becouse we&nbsp;want to&nbsp;make the&nbsp;world a&nbsp;better place. You&nbsp;could change your <a href=\"https://github.com/konsav/email-templates/\" target=\"_blank\" style=\"text-decoration: underline; color: #999999; font-family: sans-serif; font-size: 13px; font-weight: 400; line-height: 150%;\">subscription settings</a> anytime.\r\n"
				+ "\r\n"
				+ "				<!-- ANALYTICS -->\r\n"
				+ "				<!-- https://www.google-analytics.com/collect?v=1&tid={{UA-Tracking-ID}}&cid={{Client-ID}}&t=event&ec=email&ea=open&cs={{Campaign-Source}}&cm=email&cn={{Campaign-Name}} -->\r\n"
				+ "				<img width=\"1\" height=\"1\" border=\"0\" vspace=\"0\" hspace=\"0\" style=\"margin: 0; padding: 0; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic; border: none; display: block;\"\r\n"
				+ "				src=\"https://raw.githubusercontent.com/konsav/email-templates/master/images/tracker.png\" />\r\n"
				+ "\r\n"
				+ "		</td>\r\n"
				+ "	</tr>\r\n"
				+ "\r\n"
				+ "<!-- End of WRAPPER -->\r\n"
				+ "</table>\r\n"
				+ "\r\n"
				+ "<!-- End of SECTION / BACKGROUND -->\r\n"
				+ "</td></tr></table>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>";
		

		String subject = "Test Email Message.";
		String to = "ashutoshparasadarsh@gmail.com";
		String from = "ashutoshparasadarsh@gmail.com";
		sendEmail(message, subject, to, from);
	}

	private static void sendEmail(String message, String subject, String to, String from) {

		// get the system proterties
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.ssl.enable", "true");
		properties.setProperty("mail.smtp.auth", "true");

		// create the session and override the getPasswordAuthentication()
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ashutoshparasadarsh@gmail.com", "ashubade1219061992");
			}
		});
		session.setDebug(true);
		// compose the message

		MimeMessage m = new MimeMessage(session);
		try {
			// adding from
			m.setFrom(from);

			// adding recipient
			m.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// adding subject
			m.setSubject(subject);

			// add message
			m.setContent(message, "text/html");

			// send the message using transport class
			Transport.send(m);
			
			System.out.println("Message Send successfully ......");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}