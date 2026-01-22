package pers.ken.starter.dynamicform.annotation;

import org.springframework.context.annotation.Import;
import pers.ken.starter.dynamicform.autoconfigure.DynamicFormWebConfiguration;

import java.lang.annotation.*;


/**
 * @className: Enable
 * @CreatedAt: 2026/1/21
 * @Author ken
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DynamicFormWebConfiguration.class)
public @interface EnableDynamicFormApi {
}
