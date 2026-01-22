package pers.ken.starter.storage.provider;

import pers.ken.starter.storage.ObjectStorageService;

import java.io.File;
import java.io.InputStream;

/**
 * @className: ObsStorageService
 * @CreatedAt: 2026/1/22
 * @Author ken
 */
public class ObsStorageService implements ObjectStorageService {
    @Override
    public Boolean fileExists(String fileKey) {
        return null;
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

    }

    @Override
    public void deleteFile(String fileKey) {
    }

    @Override
    public void downloadFileToLocal(String fileKey, String localPath) {

    }

    @Override
    public InputStream downloadFileStream(String fileKey) {
        return null;
    }
}
