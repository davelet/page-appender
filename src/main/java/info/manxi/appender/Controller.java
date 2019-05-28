package info.manxi.appender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private DemoInfoRepository demoInfoRepository;

    @GetMapping("list")
    public Object list() {
        return demoInfoRepository.findAll();
    }

    @GetMapping("init")
    public void init() {
        for (int i = 1; i <= 30; i++) {
            DemoInfo entity = new DemoInfo();
            entity.setId(i);
            entity.setContent("content" + i);
            demoInfoRepository.save(entity);
        }
    }
}