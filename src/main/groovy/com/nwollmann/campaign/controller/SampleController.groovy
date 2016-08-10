package com.nwollmann.campaign.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Nicholas on 8/9/2016.
 */
@RestController
class SampleController {

    @RequestMapping("/health")
    public String health(){
        "OK"
    }

}
