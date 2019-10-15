package clue.services.floor;


/**
 * @author songaimin@outlook.com
 */
public class RedisRuntimeException extends RuntimeException {

    public RedisRuntimeException(String message) {
        super(message);
    }

    public RedisRuntimeException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public RedisRuntimeException(Throwable throwable) {
        super(throwable);
    }
}
