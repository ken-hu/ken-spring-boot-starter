package pers.ken.starter.storage;

import java.io.File;
import java.io.InputStream;

/**
 * @className: ObjectStorageService
 * @CreatedAt: 2026/1/22
 * @Author ken
 */
public interface ObjectStorageService {
    Boolean fileExists(String fileKey);

    void setAcl(String fileKey, String acl);

    void createDir(String directoryName);

    void uploadFile(File file);

    void uploadFile(File file, InputStream is);

    void uploadFile(String fileKey, InputStream is);

    void deleteFile(String fileKey);

    void downloadFileToLocal(String fileKey, String localPath);

    InputStream downloadFileStream(String fileKey);
}
