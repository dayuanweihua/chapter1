package org.smart4j.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*使用WebServlet注解并配置请求路径，对外发布Servlet服务；
    不需要再web.xml添加任何servlet配置*/
@WebServlet("/hello")
/*继承HttpServlet，让它成为一个Servlet类
* */
public class HelloServlet extends HttpServlet {

    /*覆盖doGEt方法获取系统当前时间；
    并将其放入HttpServletRequest对象中，最后转发到/WEB-INF/jsp/hello.jsp页面*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime=dateFormat.format(new Date());
        req.setAttribute("currentTime",currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);


    }

}


