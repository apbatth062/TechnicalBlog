package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.dao.Postdao;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private Postdao pd;

    @RequestMapping("posts")

    public String getAllPosts(Model model)
    {


        ArrayList<Post> data=pd.getAllPosts();


        model.addAttribute("posts",data);

        return "index";
    }

}
