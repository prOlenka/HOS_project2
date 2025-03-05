package project2.HOS_project2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import project2.HOS_project2.database.UniversityItem;
import project2.HOS_project2.models.UniversityService;


@RequestMapping
@Controller
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @RequestMapping("/")
    public String start() {
        return "start";
    }

    @GetMapping("/{id}")
    public String getUniversityItem(@PathVariable String id, Model model) {
        UniversityItem item = universityService.findItemById(id);
        model.addAttribute("item", item);
        return "university";
    }
}
