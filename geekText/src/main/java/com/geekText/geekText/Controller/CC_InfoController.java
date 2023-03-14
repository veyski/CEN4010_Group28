package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.CC_Info;
import com.geekText.geekText.Service.CC_InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC_InfoController {

    @Autowired
    private CC_InfoService cc_infoService;


    @PostMapping("/addCC_Info")
    public CC_Info postDetails(@RequestBody CC_Info cc_info) {
        return cc_infoService.saveDetails(cc_info);

    }

}
