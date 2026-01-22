package pers.ken.starter.dynamicform.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: DynamicFormProperties
 * @CreatedAt: 2026/1/21
 * @Author ken
 */
@Data
@ConfigurationProperties("ken-dynamic-form")
public class DynamicFormProperties {
    private boolean enabled = true;
    private String apiPrefix = "/api/dynamic-form";
}
