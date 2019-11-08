package com.xkit.ssm.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

        public class LoginInterceptor implements HandlerInterceptor {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
                Object object = request.getSession().getAttribute("loginUser");
                if (object == null){
                    request.setAttribute("msg","Œ¥ºÏ≤‚µΩ∑√Œ »®£°");
                    request.getRequestDispatcher("/Login.jsp").forward(request,response);
                    return false;
                }else {
                    return true;
                }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
