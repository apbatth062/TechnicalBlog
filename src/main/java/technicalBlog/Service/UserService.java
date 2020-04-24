package technicalBlog.Service;

import technicalBlog.dao.Userdao;
import technicalBlog.model.User;

public class UserService {


    private static Userdao userDAO=new Userdao();

    public static boolean isValidUser(User user)
    {
        return userDAO.isValidUser(user);
    }

}
