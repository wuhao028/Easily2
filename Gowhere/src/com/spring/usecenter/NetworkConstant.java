package com.spring.usecenter;

public class NetworkConstant {

	/** 登录的地址 */
	public static final String LOGIN_SVR = "https://openapi.boc.cn";//dtp  api
	/** 注册调用的Html5界面的地址 */
	public static final String SIGNUP_URL = "https://open.boc.cn/wap/register.php";
	
	public static String CONSUMER_KEY = "196";
	public static String CONSUMER_SECRET = "8875ce3e8d3bfe616a8bbe0cac94d6fac4e9d8d5bd7ff88848";
	
	/** 登录端口 */
	public static final int HTTPS_PORT = 443;
	/**编码*/
	public static final String ENCODE = "utf-8";
	/** 登录成功产生的token */
	public static  String access_token;
	/** 登录的用户名 */
	public static  String userid;
}
