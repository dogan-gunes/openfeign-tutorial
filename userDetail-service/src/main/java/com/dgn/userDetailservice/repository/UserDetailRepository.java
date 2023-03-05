package com.dgn.userDetailservice.repository;

import com.dgn.userDetailservice.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {
}
