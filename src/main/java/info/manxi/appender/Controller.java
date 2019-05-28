package info.manxi.appender;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private DemoInfoRepository demoInfoRepository;

    @GetMapping("list")
    public Object list() {
        System.err.println("list");
        return demoInfoRepository.findAll();
    }
}