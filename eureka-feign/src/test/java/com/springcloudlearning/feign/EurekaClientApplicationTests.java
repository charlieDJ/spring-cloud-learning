package com.springcloudlearning.feign;

import com.springcloudlearning.feign.client.HiClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientApplicationTests {

    @Autowired
    private HiClient hiClient;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFeign(){
        System.out.println(hiClient.home("平安"));
    }

}
