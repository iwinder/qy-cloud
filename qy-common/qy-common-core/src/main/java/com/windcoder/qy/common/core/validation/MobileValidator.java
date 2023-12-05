package com.windcoder.qy.common.core.validation;

import cn.hutool.core.util.StrUtil;
import com.windcoder.qy.common.core.utils.QyValidationUtil;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * 手机号验证注解实现类
 */
public class MobileValidator implements ConstraintValidator<Mobile, String> {

    /**
     * 验证器的初始化方法，保留空方法即可
     * @param constraintAnnotation annotation instance for a given constraint declaration
     */
    @Override
    public void initialize(Mobile constraintAnnotation) {
    }

    /**
     *  验证的逻辑所在地方
     * @param value object to validate
     * @param context context in which the constraint is evaluated
     *
     * @return
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 如果手机号为空，默认不校验，即校验通过
        if (StrUtil.isEmpty(value)) {
            return true;
        }
        // 校验手机
        return QyValidationUtil.isMobile(value);
    }
}
