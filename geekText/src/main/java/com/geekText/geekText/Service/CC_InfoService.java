package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.CC_Info;
import com.geekText.geekText.Repository.CC_InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CC_InfoService {

    @Autowired
    private CC_InfoRepo cc_infoRepo;

    public CC_Info saveDetails(CC_Info cc_info){

        return cc_infoRepo.save(cc_info);
    }
}