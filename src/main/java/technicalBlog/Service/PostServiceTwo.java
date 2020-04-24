package technicalBlog.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import technicalBlog.Repositry.PostRepository;
import technicalBlog.model.Post;

import java.util.List;

@Repository
public class PostServiceTwo {
    @Autowired
    private PostRepository repository;
    public List<Post> getAllPosts(){
        return repository.getAllPosts();
    }
    public Post getOnePost()
    {
        return repository.getLatestPost();
    }
}
