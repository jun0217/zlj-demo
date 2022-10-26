package com.example.demo.controller;

import com.example.demo.common.annotation.OpLog;
import com.example.demo.common.util.VerifyUtil;
import com.example.demo.mbg.service.impl.LoginServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author
 * @Des TODO
 * @Date 2022/9/29 16:04
 **/
@Api(tags = "LoginController", description = "登录类管理")
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;
    
        /*@ApiOperation(value = "验证码")
        @GetMapping("/verifyCode")
        public void verifyCode(HttpServletRequest request, HttpServletResponse response) {
            IVerifyCodeGen iVerifyCodeGen = new SimpleCharVerifyCodeGenImpl();
            try {
//设置长宽
                VerifyCode verifyCode = iVerifyCodeGen.generate(80, 28);
                String code = verifyCode.getCode();
                LOGGER.info(code);
//将VerifyCode绑定session
                request.getSession().setAttribute("VerifyCode", code);
//设置响应头
                response.setHeader("Pragma", "no-cache");
//设置响应头
                response.setHeader("Cache-Control", "no-cache");
//在代理服务器端防止缓冲
                response.setDateHeader("Expires", 0);
//设置响应内容类型
                response.setContentType("image/jpeg");
                response.getOutputStream().write(verifyCode.getImgBytes());
                response.getOutputStream().flush();
            } catch (IOException e) {
                LOGGER.info("", e);
            }
        }*/
    
    @ApiOperation(value = "验证码")
    @GetMapping("/verifyCode")
    @OpLog(type = "login")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) {
        Object[] verify = VerifyUtil.createimage();
        request.getSession().setAttribute("verifyCode", verify[0]);
        //设置响应头
        response.setHeader("Pragma", "no-cache");
        //设置响应头
        response.setHeader("Cache-Control", "no-cache");
        //在代理服务器端防止缓冲
        response.setDateHeader("Expires", 0);
        //设置响应内容类型
        response.setContentType("image/png");
        try {
            OutputStream outputStream = response.getOutputStream();
            //ImageOutputStream imageOutput = ImageIO.createImageOutputStream(outputStream);
            ImageIO.write((RenderedImage) verify[1], "png", outputStream);
            
            response.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Object a = VerifyUtil.createimage();
    }
}
