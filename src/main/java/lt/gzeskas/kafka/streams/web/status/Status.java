package lt.gzeskas.kafka.streams.web.status;

public class Status {
    private final int code;
    private final String message;

    public Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Status ok() {
        return new Status(200, "UP");
    }

}
