package pers.ken.starter.storage.autoconfigure;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: StorageProperties
 * @CreatedAt: 2026/1/22
 * @Author ken
 */
@Data
@ConfigurationProperties("ken-storage")
public class StorageProperties {
    private String provider = "oss";
    private OSS oss = new OSS();
    private S3 s3 = new S3();
    private COS cos = new COS();
    private OBS obs = new OBS();

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class OSS extends BaseStorageProperties {
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class S3 extends BaseStorageProperties {
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class COS extends BaseStorageProperties {
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class OBS extends BaseStorageProperties {
    }
}
