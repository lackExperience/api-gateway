package com.lkf.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 过滤器
 * Created by likaifeng on 2017/10/19.
 */
public class AccessFilter extends ZuulFilter{

    private static final Logger LOGGER = LoggerFactory.getLogger(AccessFilter.class);

    /**
     *过滤器请求类型
     *@author: lkf
     *@Date: 2017/10/19 15:26
     */
    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
