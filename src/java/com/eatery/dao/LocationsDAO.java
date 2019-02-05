package com.eatery.dao;

public interface LocationsDAO {

    String getAll = " select * from ey_locations ";
    String getInfo = " select * from ey_locations where id = ?";
}
