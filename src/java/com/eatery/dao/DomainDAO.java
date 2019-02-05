package com.eatery.dao;

public interface DomainDAO {

    String getAll = " select * from ey_domains ";
    String getStatus = " select value from ey_domains where domain_type= 'ey_status'  "; //getStatus
    String getType = " select value from ey_domains where value= 'ey_type'  "; //getType
    String getuserType = " select domain_type from ey_domains where value= 'ey_user_type' "; //getDomain
    String getDomain = " select domain_type from ey_domains ";
}
