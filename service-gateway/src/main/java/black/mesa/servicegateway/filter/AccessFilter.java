package black.mesa.servicegateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("entering `service-gateway` interceptors.");

        RequestContext ctx = RequestContext.getCurrentContext();
        String accessToken = ctx.getRequest().getParameter("access-token");
        System.out.println(String.format("Intercepted access token is : %s", accessToken));

        //// set false to intercepted this request and not forward for this route.
//        ctx.setSendZuulResponse(false);
//        ctx.setResponseStatusCode(401);

        return null;
    }
}
