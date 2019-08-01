package com.diksha.portal.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diksha.portal.entity.NewUserRegistration;

@Repository
public interface registerRepository extends JpaRepository<NewUserRegistration, Integer>{

}
