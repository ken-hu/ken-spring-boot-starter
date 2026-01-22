package pers.ken.starter.storage.exception;

import lombok.Getter;

/**
 * @className: StorageException
 * @CreatedAt: 2026/1/22
 * @Author ken
 */
public class StorageException extends RuntimeException {
    @Getter
    private final String errorCode;

    public StorageException(String message, Throwable cause) {
        this(StorageErrorCodes.STORAGE_ERROR, message, cause);
    }

    public StorageException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }
}
