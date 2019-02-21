package wang.moshu.mq.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 秒杀请求消息
 * 
 * @category 秒杀请求消息
 * @author xiangyong.ding@weimob.com
 * @since 2017年4月7日 下午5:34:13
 */
@ToString
public class MiaoshaRequestMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5810025604361901986L;

	/**
	 * 手机号，标识用户唯一身份
	 */
	@Setter
	@Getter
	private String mobile;

	/**
	 * 秒杀商品编号
	 */
	@Setter
	@Getter
	private String goodsRandomName;

	public MiaoshaRequestMessage()
	{
		super();
	}

	public MiaoshaRequestMessage(String mobile, String goodsRandomName) {
		super();
		this.mobile = mobile;
		this.goodsRandomName = goodsRandomName;
	}

}
