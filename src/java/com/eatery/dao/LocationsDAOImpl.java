package com.eatery.dao;

import com.eatery.vo.LocationsVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocationsDAOImpl extends JdbcAdapter implements LocationsDAO {

    public List<LocationsVO> getAll() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<LocationsVO> locations = null;
        try {
            pst = con.prepareStatement(getAll);
            rs = pst.executeQuery();
            locations = new ArrayList<>();
            while (rs.next()) {
                LocationsVO location = new LocationsVO();
                location.setId(location.getId());
                location.setName(location.getName());
                location.setStatus(location.getStatus());
                location.setPhone(location.getPhone());
                location.setWebsite(location.getWebsite());
                location.setSmokingArea(location.getSmokingArea());
                location.setShisha(location.getShisha());
                location.setPrice_Range(location.getPrice_Range());
                location.setLongitude(location.getLongitude());
                location.setLatitude(location.getLatitude());
                location.setWIFI(location.getWIFI());
                location.setShisha(location.getShisha());

                locations.add(location);
            }
            if (!locations.isEmpty()) {
                return locations;
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

    public LocationsVO getInfoById() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        LocationsVO location = new LocationsVO();
        try {
            pst = con.prepareStatement(getInfo);
            rs = pst.executeQuery();
            pst.setInt(1, location.getId());
            if (rs.next()) {
                location.setName(location.getName());
                location.setPhone(location.getPhone());
                location.setWebsite(location.getWebsite());
                location.setPrice_Range(location.getPrice_Range());
                location.setLatitude(location.getLatitude());
                location.setLongitude(location.getLongitude());
            }

        } catch (SQLException ex) {

        }

        return location;
    }
    
    
   
}
