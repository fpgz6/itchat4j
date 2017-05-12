package cn.zhouyafeng.itchat4j.service;

/**
 * 登陆服务接口
 * 
 * @author https://github.com/yaphone
 * @date 创建时间：2017年5月13日 上午12:07:21
 * @version 1.0
 *
 */
public interface ILoginService {

	/**
	 * 登陆
	 * 
	 * @author https://github.com/yaphone
	 * @date 2017年5月13日 上午12:14:07
	 * @return
	 */
	boolean login(String qrPath);

	/**
	 * 获取UUID
	 * 
	 * @author https://github.com/yaphone
	 * @date 2017年5月13日 上午12:21:40
	 * @param qrPath
	 * @return
	 */
	String getUuid();

	/**
	 * 获取二维码图片
	 * 
	 * @author https://github.com/yaphone
	 * @date 2017年5月13日 上午12:13:51
	 * @param qrPath
	 * @return
	 */
	boolean getQR(String qrPath);

	/**
	 * web初始化
	 * 
	 * @author https://github.com/yaphone
	 * @date 2017年5月13日 上午12:14:13
	 * @return
	 */
	boolean webWxInit();

	/**
	 * 微信状态通知
	 * 
	 * @author https://github.com/yaphone
	 * @date 2017年5月13日 上午12:14:24
	 */
	void wxStatusNotify();

	/**
	 * 接收消息
	 * 
	 * @author https://github.com/yaphone
	 * @date 2017年5月13日 上午12:14:37
	 */
	void startReceiving();

}
