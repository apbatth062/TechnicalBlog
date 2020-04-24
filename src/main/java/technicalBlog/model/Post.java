package technicalBlog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//pojo-->plain old java object
//classes that have variables and getter setter method
public class Post {

    private Integer id;
    private  String title;
    private String body;
    private Date date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }



}
