package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;


@RestController
class FallbackController {

    @GetMapping("/api/fallback")
    Single<String> getService1DownErrorMsg() {
        return Single.just("Service 1 down!")
    }

}
