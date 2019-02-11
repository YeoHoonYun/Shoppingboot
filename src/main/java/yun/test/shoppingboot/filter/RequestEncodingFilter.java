package yun.test.shoppingboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by cjswo9207u@gmail.com on 2019-01-20
 * Github : https://github.com/YeoHoonYun
 */
@WebFilter(filterName="RequestEncodingFilter", urlPatterns = {"/*"})
public class RequestEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("RequestEncodingFilter init!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
//        System.out.println("RequestEncodingFilter doFilter start!!");
        filterChain.doFilter(servletRequest, servletResponse); // 다음 필터를 호출
        // 서블릿 응답후
//        System.out.println("RequestEncodingFilter doFilter end!!");
    }

    @Override
    public void destroy() {
        System.out.println("RequestEncodingFilter destroy!");
    }
}
