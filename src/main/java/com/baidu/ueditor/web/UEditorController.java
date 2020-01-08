package com.baidu.ueditor.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.ueditor.ActionEnter;

@RestController
@RequestMapping("/ueditor")
public class UEditorController {
    @RequestMapping(value = "/upload")
    public String editorUpload(HttpServletRequest request)  {
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        return new ActionEnter(request, rootPath).exec();
    }
}