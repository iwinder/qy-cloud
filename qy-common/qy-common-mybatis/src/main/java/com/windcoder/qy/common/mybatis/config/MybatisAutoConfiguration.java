package com.windcoder.qy.common.mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.windcoder.qy.common.mybatis.core.handler.DefaultDBFieldHandler;
import com.windcoder.qy.common.mybatis.core.plugins.QyPaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
@MapperScan("com.windcoder.qy.**.mapper")
public class MybatisAutoConfiguration {


    /**
     * 分页插件, 对于单一数据库类型来说,都建议配置该值,避免每次分页都去抓取数据库类型
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new QyPaginationInnerInterceptor());
        return interceptor;
    }

    /**
     * 审计字段自动填充
     * @return {@link MetaObjectHandler}
     */
    @Bean
    public MetaObjectHandler defaultMetaObjectHandler(){
        return new DefaultDBFieldHandler(); // 自动填充参数类
    }
}
