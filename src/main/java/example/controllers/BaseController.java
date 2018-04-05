package example.controllers;

import common.models.Project;
import example.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {

    private final BaseService baseService;

    @Autowired
    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }

    @RequestMapping("/")
    public List<Project> index() {
        return this.baseService.getAllProjects();
    }
}
