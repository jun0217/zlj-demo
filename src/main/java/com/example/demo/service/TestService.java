package com.example.demo.service;

import com.example.demo.mbg.model.XkjcXk;
import com.example.demo.mbg.model.XkjcXkExample;
import com.example.demo.mbg.pojo.XkjcXKPOJO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public interface TestService {
    List<XkjcXk> selectByExample(XkjcXk xkjcXk);

    XkjcXk selectById(String id);

    void exportXk(HttpServletResponse response) throws IOException;

    List<XkjcXKPOJO> readExcel(MultipartFile file) throws IOException;
}