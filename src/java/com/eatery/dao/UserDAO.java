package com.eatery.dao;

public interface UserDAO {

    String getAll = " select * from ey_users ";
//    String getId = " select id from ey_users ";
//    String getUsername = " select username from ey_locations ";
//    String getPassword = " select password from ey_locations ";
//    String getType = " select user_type from ey_locations ";
//    String getStatus = " select user_status from ey_locations ";
//    String getEmail = " select Email from ey_locations ";
//    String getAddress = " select Address from ey_locations ";
//    String getCity = " select City from ey_locations ";
//    String getZip_Code = " select Zip_Code from ey_locations ";
//    String getFirst = " select First_Name from ey_locations ";
//    String getLast = " select Last_Name from ey_locations ";
//    String getPhone = " select phone from ey_locations ";
//    String getWebsite = " select website from ey_locations ";
//    String getBio= " select BIO from ey_users ";
      String getById = " select * from ey_users where id = ? ";
      
}
