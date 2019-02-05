package com.eatery.dao;

import com.eatery.vo.DomainsVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DomainDAOImpl extends JdbcAdapter implements DomainDAO {

    public List<DomainsVO> getAll() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<DomainsVO> Doms = null;
        try {
            pst = con.prepareStatement(getAll);
            rs = pst.executeQuery();
            Doms = new ArrayList<>();
            while (rs.next()) {
                DomainsVO Dom = new DomainsVO();
                Dom.setId(Dom.getId());

                Doms.add(Dom);
            }
            if (!Doms.isEmpty()) {
                return Doms;
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

    public DomainsVO getStatus(Integer stat) throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<DomainsVO> Doms = null;
        try {
            pst = con.prepareStatement(getStatus);
            pst.setInt(1, stat);
            rs = pst.executeQuery();
            Doms = new ArrayList<>();
            DomainsVO Dom = new DomainsVO();
            while (rs.next()) {
                Dom.setId(rs.getInt("value"));
                Dom.setValue(Dom.getValue());
                Doms.add(Dom);
            }
            if (!Doms.isEmpty()) {
                return Dom;
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
