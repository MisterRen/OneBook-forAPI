package com.api.web;

import com.api.common.WxConstants;
import com.api.entity.BookInfos;
import com.api.service.BookInfoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 豆瓣图书API
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2017年10月31日)
 * @version 1.0
 * @fileName DouBanBookApiController.java
 */
@Controller
public class DouBanBookApiController {

    @Autowired
    private BookInfoService bookInfoService;

    private RestTemplate restTemplate = new RestTemplate();



    @ResponseBody
    @RequestMapping(value = "/getBookInfo/{isbn}",method = RequestMethod.GET)
    public String getBookInfo(@PathVariable("isbn") String isbn){
        /**
         * isbn     图书条码
         */
        try {
            String uri = "https://api.douban.com/v2/book/isbn/:%s";
            uri = String.format(uri,isbn);
            String result = restTemplate.getForEntity(uri,String.class).getBody();
            //bookInfoService.findBookInfo(1);
            return result;
        }catch (Exception e){
            String str = "{\"msg\":\"book_not_found\",\"code\":6000,\"request\":\"GET /getBookInfo/"+isbn+".json\"}";
            return str;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getWxUserInfo/{code}",method = RequestMethod.GET)
    public String getWxUserInfo(@PathVariable("code")String code){
        String uri = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
        uri = String.format(uri,WxConstants.WX_APPID,WxConstants.WX_SECRET,code);
        String result = restTemplate.getForEntity(uri,String.class).getBody();
        return result;
    }

    /**
     * 关键字查询
     * @param q 关键字
     * @param s 起始位置
     * @param c 每次查询条数
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String search(String q,int s,int c){
        /**
         * q        查询关键字
         * tag      查询的tag
         * start    取结果的offset
         * count    取结果的条数
         */
        String uri = "https://api.douban.com/v2/book/search?q=%s&start=%s&count=%s";
        uri = String.format(uri,q,s,c);
        Gson gson = new Gson();
        String result = restTemplate.getForEntity(uri,String.class).getBody();
        //Type type = new TypeToken<BookInfos>(){}.getType();
        BookInfos list = gson.fromJson(result,BookInfos.class);
        return result;
    }

    @RequestMapping("/")
    public String index(){

        return "freemarker/index";
    }
    @RequestMapping("/socket")
    public String socket(){

        return "freemarker/socket";
    }
}
