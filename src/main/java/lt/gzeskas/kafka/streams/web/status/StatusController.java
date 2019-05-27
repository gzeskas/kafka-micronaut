package lt.gzeskas.kafka.streams.web.status;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/status")
public class StatusController {

    @Get("/")
    public Status status() {
        return Status.ok();
    }

}
