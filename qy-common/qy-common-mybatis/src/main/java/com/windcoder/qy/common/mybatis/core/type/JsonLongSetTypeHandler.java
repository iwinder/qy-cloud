package com.windcoder.qy.common.mybatis.core.type;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;
import com.windcoder.qy.common.core.utils.JacksonUtil;


import java.util.HashSet;
import java.util.Set;

public class JsonLongSetTypeHandler extends AbstractJsonTypeHandler<Object> {

    @Override
    protected Object parse(String json) {
        Set<Long> list = null;
        if (json == null || json.isEmpty()) {
            list = new HashSet<Long>();
            return list;
        }
        list = JacksonUtil.ofJsonCollection(json,Set.class,Long.class);
        return list;
    }

    @Override
    protected String toJson(Object obj) {
        return JacksonUtil.toJson(obj);
    }
}
