package com.lwhtarena.enterprise.core.annotation;

import java.lang.annotation.*;

/**
 * 用于注解类或属性的元数据，这些元数据可用于代码生成或运行时动态内容生成
 * @author lwh
 * @folder com.lwhtarena.enterprise.core.annotation
 * @date 2016/11/30.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PACKAGE})
public @interface MetaData {

    /**
     * 简要注解或属性的元数据，这些元数据可用于代码生成或运行时动态内容生成
     * @return
     */
    String value();

    /**
     * 提示信息：一般对应表单项的提示说明，支持以HTML格式
     * @return
     */
    String tooltips() default "";

    /**
     * 注释说明：用于描述代码内部用法说明，一般不用于前端UI显示
     * @return
     */
    String comments() default "";

    /**
     * 标识属性是否出现在版本比较列表
     * @see PersistableController#getRevisionFields()
     * @return
     */
    boolean comparable() default true;

}
