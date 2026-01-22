package pers.ken.starter.storage.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.ken.starter.storage.ObjectStorageService;
import pers.ken.starter.storage.provider.OssStorageService;

/**
 * @className: StorageAutoConfiguration
 * @CreatedAt: 2026/1/22
 * @Author ken
 */
@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class StorageAutoConfiguration {
    @Bean
    @ConditionalOnProperty(name = "ken-storage.provider", havingValue = "oss")
    public ObjectStorageService aliyunStorageService(StorageProperties storageProperties) {
        return new OssStorageService(storageProperties);
    }
}
