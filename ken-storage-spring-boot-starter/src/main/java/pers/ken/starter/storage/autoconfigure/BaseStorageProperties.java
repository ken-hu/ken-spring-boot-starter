package pers.ken.starter.storage.autoconfigure;

import lombok.Data;

/**
 * @className: BaseStorageProperties
 * @CreatedAt: 2026/1/22
 * @Author ken
 */
@Data
public class BaseStorageProperties {
    private String endpoint;
    private String domain;
    private String bucket;
    private String cdnHost;
    private String accessKey;
    private String secretKey;
    private String proxyHost;
    private Integer proxyPort;
}
