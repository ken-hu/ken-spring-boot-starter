package pers.ken.starter.storage.provider;

import com.aliyun.oss.*;
import pers.ken.starter.storage.ObjectStorageService;
import pers.ken.starter.storage.autoconfigure.StorageProperties;
import pers.ken.starter.storage.exception.StorageErrorCodes;
import pers.ken.starter.storage.exception.StorageException;

import java.io.File;
import java.io.InputStream;
import java.util.Objects;

/**
 * @className: OssStorageService
 * @CreatedAt: 2026/1/22
 * @Author ken
 */
public class OssStorageService implements ObjectStorageService {
    private final StorageProperties.OSS props;
    private final OSS ossClient;

    public OssStorageService(StorageProperties storageProperties) {
        this.props = storageProperties.getOss();

        ClientBuilderConfiguration config = new ClientBuilderConfiguration();
        if (Objects.nonNull(this.props.getProxyHost()) && Objects.nonNull(this.props.getProxyPort())) {
            config.setProxyHost(this.props.getProxyHost());
            config.setProxyPort(this.props.getProxyPort());
        }

        OSS ossClient = new OSSClientBuilder().build(
                this.props.getEndpoint(),
                this.props.getAccessKey(),
                this.props.getSecretKey(),
                config
        );

        if (ossClient.doesBucketExist(this.props.getBucket())) {
            ossClient.createBucket(this.props.getBucket());
        }
        this.ossClient = ossClient;
    }

    @Override
    public Boolean fileExists(String fileKey) {
        return ossClient.doesObjectExist(this.props.getBucket(), fileKey);
    }

    @Override
    public void setAcl(String fileKey, String acl) {

    }

    @Override
    public void createDir(String directoryName) {

    }

    @Override
    public void uploadFile(File file) {

    }

    @Override
    public void uploadFile(File file, InputStream is) {

    }

    @Override
    public void uploadFile(String fileKey, InputStream is) {
        try {
            this.ossClient.putObject(this.props.getBucket(), fileKey, is);
        } catch (OSSException | ClientException e) {
            throw new StorageException(StorageErrorCodes.UPLOAD_FAILED, "Upload file " + fileKey + "to OSS failed", e);
        }
    }

    @Override
    public void deleteFile(String fileKey) {
        try {
            ossClient.deleteObject(this.props.getBucket(), fileKey);
        } catch (OSSException | ClientException e) {
            throw new StorageException(StorageErrorCodes.DELETE_FAILED, "Delete file " + fileKey + " failed", e);
        }
    }

    @Override
    public void downloadFileToLocal(String fileKey, String localPath) {

    }

    @Override
    public InputStream downloadFileStream(String fileKey) {
        return null;
    }
}
