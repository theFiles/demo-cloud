package com.lidaye.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyZuulFilter extends ZuulFilter {
    /**
     * 过滤时机
     * pre     要用在路由映射的阶段是寻找路由映射表的
     * post    routing，error运行完后才会调用该过滤器，是在最后阶段的
     * error   一旦前面的过滤器出错了，会调用error过滤器。
     * route   具体的请求转发的时候会调用
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 优先级
     * @return      数值越小越优先级越大
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行过滤
     * @return      是或否
     */
    @Override
    public boolean shouldFilter() {
        // 检测前面是否有把 sendZuulResponse 设置为 false
        return RequestContext.getCurrentContext().sendZuulResponse();
    }

    /**
     * 核心逻辑
     * @return
     */
    @Override
    public Object run() {
        // 取 servlet 中的请求对象
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        // 获取头部 token 信息
        String access_token = request.getHeader("access_token");

        /*if(access_token == null || "".equals(access_token)){
            // 是否要转发请求
            requestContext.setSendZuulResponse(false);
            // 状态码
            requestContext.setResponseStatusCode(403);
            // 返回内容
            requestContext.setResponseBody("token is invalid");
        }*/

        return null;
    }
}
