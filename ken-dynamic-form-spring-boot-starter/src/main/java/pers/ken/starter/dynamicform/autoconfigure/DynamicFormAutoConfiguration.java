package pers.ken.starter.dynamicform.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.ken.starter.dynamicform.service.FormDefinitionService;
import pers.ken.starter.dynamicform.service.impl.DefaultFormDefinitionService;

/**
 * @className: DynamicFormConfiguration
 * @CreatedAt: 2026/1/21
 * @Author ken
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(DynamicFormProperties.class)
public class DynamicFormAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public FormDefinitionService formDefinitionService() {
        return new DefaultFormDefinitionService();
    }
}
