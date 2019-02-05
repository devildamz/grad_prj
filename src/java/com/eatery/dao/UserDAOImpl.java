
package com.eatery.dao;

import com.eatery.vo.UserVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devildamz
 */
public class UserDAOImpl extends JdbcAdapter implements UserDAO {

    public List<UserVO> getAll() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<UserVO> users = null;
        try {
            pst = con.prepareStatement(getAll);
            rs = pst.executeQuery();
            users = new ArrayList<>();
            while (rs.next()) {
                UserVO user = new UserVO();
                user.setId(user.getId());

                users.add(user);
            }
            if (!users.isEmpty()) {
                return users;
            }
        } catch (Exception ex) {

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException sqle) {

            }

        }
        return null;
    }

    public UserVO getById(Integer id) throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<UserVO> users = null;
        try {
            pst = con.prepareStatement(getById);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            users = new ArrayList<>();
            UserVO user = new UserVO();
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUserName(user.getUserName());
                user.setUserStatus(user.getUserStatus());
                user.setEmail(user.getEmail());
                user.setCity(user.getCity());
                user.setFirstName(user.getFirstName());
                user.setBio(user.getBio());
                users.add(user);
            }
            if (!users.isEmpty()) {
                return user;
            }
        } catch (SQLException e) {

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException sqle) {

            }

        }
        return null;
    }
}
