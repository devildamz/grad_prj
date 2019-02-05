
package com.eatery.bus;

import com.eatery.dao.UserDAOImpl;
import com.eatery.vo.UserVO;
import java.sql.SQLException;
import java.util.List;

public class UserHandler {
    public List<UserVO> getAll() throws SQLException, ClassNotFoundException{
        UserDAOImpl dao = new UserDAOImpl();
        return dao.getAll();
    }
    public UserVO getById() throws SQLException, ClassNotFoundException{
        UserDAOImpl dao = new UserDAOImpl();
        UserVO user= new UserVO();
        return dao.getById(user.getId());
    }
}

