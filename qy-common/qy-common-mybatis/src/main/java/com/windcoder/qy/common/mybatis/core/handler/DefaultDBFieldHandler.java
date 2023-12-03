package com.windcoder.qy.common.mybatis.core.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.windcoder.qy.common.mybatis.core.entity.BaseDO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;
import java.util.Objects;

@Slf4j
public class DefaultDBFieldHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.debug("mybatis plus start insert fill default field....");
        // 非空为true 且类型为 BaseDO
        if (Objects.nonNull(metaObject) && metaObject.getOriginalObject() instanceof BaseDO){
            LocalDateTime now = LocalDateTime.now();
            BaseDO baseDO = (BaseDO) metaObject.getOriginalObject();
            if (Objects.isNull(baseDO.getCreateTime())) {
                baseDO.setCreateTime(now);
            }
            if (Objects.isNull(baseDO.getUpdateTime())) {
                baseDO.setUpdateTime(now);
            }
            // TODO: 人员等集成 security 再补充

        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object updateTime = getFieldValByName("updateTime",metaObject);
        if (Objects.isNull(updateTime)) {
            setFieldValByName("updateTime",LocalDateTime.now(),metaObject);
        }
        // TODO: 人员等集成 security 再补充

    }
}
