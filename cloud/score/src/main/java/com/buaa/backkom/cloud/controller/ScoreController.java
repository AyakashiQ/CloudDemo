package com.buaa.backkom.cloud.controller;

import com.buaa.backkom.cloud.entities.Class;
import com.buaa.backkom.cloud.entities.CommonResult;
import com.buaa.backkom.cloud.entities.User;
import com.buaa.backkom.cloud.entities.Score;
import com.buaa.backkom.cloud.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class ScoreController
{
    @Resource
    private ScoreService scoreService;
    @Value("${server.port}")
    private String serverPort;
    
    //@GetMapping("/user/get/{id}")
    //@PostMapping("/user/login")
    @RequestMapping("/user/login")
    public CommonResult create(@RequestParam(value="id",required=true) Long id, @RequestParam(value="password",required=true) String password) {
        User user = scoreService.getUserById(id);
        log.info("********查询结果:"+user);
        if (user!=null && user.getPassword().equals(password)) {
            return new CommonResult(200,"登录成功"+serverPort,user);
        }else {
            return new CommonResult(444,"登录失败");
        }
    }

    @RequestMapping("/teacher/get_class")
    public CommonResult create(@RequestParam(value="id",required=true) Long id) {
        List<Class> class_list = scoreService.getClassById(id);
        log.info("********查询结果:"+class_list.size());
        if (class_list!=null && class_list.size()>0) {
            return new CommonResult(200,"查询成功"+serverPort,class_list);
        }else {
            return new CommonResult(444,"查询失败");
        }
    }

    @RequestMapping("/teacher/get_score")
    public CommonResult create2(@RequestParam(value="id",required=true) Long id) {
        List<Score> score_list = scoreService.getScoreByClass(id);
        log.info("********查询结果:"+score_list.size());
        if (score_list!=null && score_list.size()>0) {
            return new CommonResult(200,"查询成功"+serverPort,score_list);
        }else {
            return new CommonResult(444,"查询失败");
        }
    }

    @RequestMapping("/teacher/update_score")
    public CommonResult create2(@RequestParam(value="stu_id",required=true) Long stu_id, @RequestParam(value="class_id",required=true) Long class_id, @RequestParam(value="score",required=true) Double score) {
        Long res = scoreService.updateScore(stu_id, class_id, score);
        log.info("********查询结果:"+res);
        if (res>0) {
            return new CommonResult(200,"查询成功"+serverPort,res);
        }else {
            return new CommonResult(444,"查询失败");
        }
    }

    @RequestMapping("/student/get_score")
    public CommonResult create3(@RequestParam(value="id",required=true) Long id) {
        List<Score> score_list = scoreService.getScoreByScore(id);
        log.info("********查询结果:"+score_list.size());
        if (score_list!=null && score_list.size()>0) {
            return new CommonResult(200,"查询成功"+serverPort,score_list);
        }else {
            return new CommonResult(444,"查询失败");
        }
    }
}
