package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.Service.PostService;
import technicalBlog.Service.PostServiceTwo;
import technicalBlog.model.Post;

import javax.persistence.Entity;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostServiceTwo postService;

    @RequestMapping("/posts")
    public  String  getUserPosts(Model model)
    {
        List<Post> posts=postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "posts";

    }
}
