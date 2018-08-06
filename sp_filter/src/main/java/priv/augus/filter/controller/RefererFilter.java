package priv.augus.filter.controller;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * IntelliJ IDEA
 *
 * @author Augus
 * @date 2018/8/3
 */

//@Component
//@WebFilter(urlPatterns = "/user/*", filterName = "ref")
public class RefererFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("RefererFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        String referer = req.getHeader("Referer");
        if(referer==null){
            // 为空就滚去error
            res.sendRedirect("/error");
            return;
        }
        // 有值，就继续执行下一个过滤链
        filterChain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }
}
