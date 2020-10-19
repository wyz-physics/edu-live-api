package com.macro.mall.tiny;

import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourse;
import com.macro.mall.tiny.modules.lms.service.LmsLiveCourseService;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LiveCourseTest {
    @Autowired
    private LmsLiveCourseService liveCourseService;

//    @Test
//    public void run() {
//        List<Map<String, Object>> maps = liveCourseService.queryList(1L, null, null, null, 1, 1);
//        maps.forEach(System.out::println);
//    }

}
