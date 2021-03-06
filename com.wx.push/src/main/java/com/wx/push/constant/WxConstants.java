package com.wx.push.constant;

public interface WxConstants {

    /**
     * 爱照护
     */
    public static final  String APPID = "";
    public static final  String APPSECRET = "";

    //获取调用凭证地址
    public final static String token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET ";

    //发送模板信息接口
    public final static String send_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

    //获得关注用户id
    public final static String userlist_url = " ";

    // 模板id
    public static final  String ce_template_id = "";

    //模板的链接 url
    public static final  String url = "";

}
