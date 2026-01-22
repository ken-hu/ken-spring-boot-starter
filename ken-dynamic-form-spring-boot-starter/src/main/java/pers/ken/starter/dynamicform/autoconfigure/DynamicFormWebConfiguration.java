package pers.ken.starter.dynamicform.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.ken.starter.dynamicform.api.FormDefinitionController;

/**
 * @className: DynamicFormWebConfiguration
 * @CreatedAt: 2026/1/21
 * @Author ken
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class DynamicFormWebConfiguration {
    @Bean
    public FormDefinitionController formDefinitionController() {
        return new FormDefinitionController();
    }
}
