package com.example.demo.mbg.domain;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author
 * @Des TODO
 * @Date 2022/11/23 10:53
 **/
@Component
public class Schedul {
    @Scheduled(cron = "10 0 10 * * 3")
//    @Scheduled(cron = "* * * * * *")
    public void login(){
        String url = "https://oa.cnki.net/api/amimanage/EatOrder/EatOrderAddUp";
        String token = "9be18a8b4cae4d3fb65ed23eeb036efc";
        String cookie = "ASP.NET_SessionId=tdl3oofdwpnxkctzojcv4sny; BID=251f25a52380419584340b539b07f492; capt=e82f6f56808c2368; TTKNOA.SSO.V1.0.0=9be18a8b4cae4d3fb65ed23eeb036efc; ttknoa_user=%7b%22ID%22%3a%2218304%22%2c%22Name%22%3a%22%e5%bc%a0%e4%b8%bd%e5%90%9b%22%2c%22DepNum%22%3a%22101201033040201%22%2c%22DepName%22%3a%22%e6%95%99%e8%82%b2%e6%9c%ac%e9%83%a8%e5%ad%a6%e7%a7%91%e7%9b%91%e6%b5%8b%e7%a0%94%e5%8f%91%e9%83%a8%22%2c%22PlaceName%22%3a%22Java%e7%a0%94%e5%8f%91%e5%b7%a5%e7%a8%8b%e5%b8%88%22%2c%22HandPhone%22%3a%2215612160464%22%2c%22OfficePhoneSplit%22%3a%22%22%2c%22EmailMain%22%3a%22zlj14589%40cnki.net%22%2c%22Avatar%22%3a%22457146EC-3B7D-4194-ABA9-2AD98C7A7DF7%22%2c%22UserNum%22%3a%2214589%22%2c%22HigherMan%22%3a%22%e8%96%9b%e5%88%a9%e8%b6%85%22%2c%22HigherManID%22%3a%221232%22%2c%22OfficePlace%22%3a%22%22%7d; .TTKNOA=3EB2BADA3E932D95B8BB1C806C7726C45CB963B776D3D3921CCF4426273EAA2125B3BBDE0AC38D2533EEC195C4751A234DD56C5C9D531ED6929D9ABDD5F8B0B1A48D14B59A906A3F87028BFDF098FF505A6230F90512218E8A9DE083B6E324D37CE1AF07CCD45D697E404FDEF6DCFF87D2C50169F08C249F5BDF07836224BE6DCB27BA407B6A311FBF893713E6E3E131A2EAEE44AF3502540B10F797C1E31B6AEF7BE820F8ED0655C9A13D1C5F26EF54804821E393F409CB1C07D31CED9A7AA15445C5DD3455AF6D07A72C5D840F98EDB4B2436D4ADB139ECA732918B296A2F6864656C92924B3DCFF744EBEF6512D65090A7DC36903913C84A82DCABB653C4CF4008D5F447C9E8D3E8C2FC9DFA52BB7B22273C6742B445EF8F5D5BB78C9E3C0D148B11D407679D89A9CF9719350C8C0D0A6A0B040F2D6D494D71F22C5681BE839F8CED214BBB7BAB3F9FF44EDA1864B61366C721E7AC6E47C25A56FB902827D1978AB440D66978041B5A9BC6119B77CD18A53BEFC2A981AA3042E176DBD939BD56DA09B5675BA7CC082C2BAEF8D34D2";
        
        
        DateTime dateTime = DateUtil.beginOfWeek(DateUtil.nextWeek());
        String day1 = DateUtil.format(dateTime, DatePattern.NORM_DATE_PATTERN);
        String day2 = DateUtil.format(DateUtil.offsetDay(dateTime, 1), DatePattern.NORM_DATE_PATTERN);
        String day3 = DateUtil.format(DateUtil.offsetDay(dateTime, 2), DatePattern.NORM_DATE_PATTERN);
        String day4 = DateUtil.format(DateUtil.offsetDay(dateTime, 3), DatePattern.NORM_DATE_PATTERN);
        String day5 = DateUtil.format(DateUtil.offsetDay(dateTime, 4), DatePattern.NORM_DATE_PATTERN);
        List<String> dayList = new ArrayList<>();
        Collections.addAll(dayList, day1, day2, day3, day4, day5);
        
        
        JSONObject param = new JSONObject();
        param.put("OrderGUID", "6C36B38A4C9C4A6896C45C35F9DCB674");
        param.put("Place", "北领地B2楼");
        JSONArray manOrderDetail = new JSONArray();
        dayList.parallelStream().forEach(it -> {
            JSONObject food = new JSONObject();
            food.put("WorkDate", it);
            food.put("EatType", "面食");
            food.put("EatzcType", "B");
            food.put("ZaoCanNum", 1);
            manOrderDetail.add(food);
        });
        param.put("ManOrderDetail", manOrderDetail);
        HttpRequest post1 = HttpUtil.createPost(url);
        post1.header("accessToken", token);
        post1.header("Cookie", cookie);
        post1.body(param.toString());
        HttpResponse execute = post1.execute();
        System.out.println("execute.isOk() = " + execute.isOk());
        System.out.println(System.currentTimeMillis());
    }
}
