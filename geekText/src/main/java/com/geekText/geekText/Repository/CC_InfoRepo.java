package com.geekText.geekText.Repository;

import com.geekText.geekText.Entity.CC_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CC_InfoRepo extends JpaRepository<CC_Info, Integer> {

}
