package com.windcoder.qy.common.core.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 *  手机号验证注解
 *
 *  <p>jakarta.* 即是 原 javax.* 的校验 </p>
 *  可参考：
 *  <ul>
 *  <li><a href="https://docs.oracle.com/javaee/7/api/javax/validation/Constraint.html"> 旧版：javax.validation - Annotation Type Constraint</a></li>
 *  <li><a href="https://www.baeldung.com/javax-validation-method-constraints"> 新版：jakarta.validation - Annotation Type Constraint</a></li>
 *  </ul>
 */
@Target({
        ElementType.METHOD,  // 声明在一个类的方法前
        ElementType.FIELD,   // 声明在一个类的字段前
        ElementType.ANNOTATION_TYPE, // 声明在一个注解类型前
        ElementType.CONSTRUCTOR, // 声明在一个类的构造方法前
        ElementType.PARAMETER, // 声明在一个方法参数前
        ElementType.TYPE_USE // 声明能写在使用类型的任何语句中（例如：声明语句、泛型和强制转换语句中的类型）
})
@Constraint(validatedBy = MobileValidator.class) // 用来实现验证的类
@Documented // 生成javadoc时展示在文档中
@Retention(RetentionPolicy.RUNTIME) // 运行时注解
public @interface Mobile {
    // 如果出错，返回的数据
    String message() default "手机号格式不正确";

    // 指定约束分组，在某一个分组时才执行此约束验证
    Class<?>[] groups() default {};

    // 会在验证结果中携带此字段，比如：可以用于验证结果的严重等级分类
    Class<? extends Payload>[] payload() default {};
}
