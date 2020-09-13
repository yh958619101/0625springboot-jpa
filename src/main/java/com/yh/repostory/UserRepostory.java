package com.yh.repostory;

import com.yh.entuty.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

public interface UserRepostory  extends JpaRepository<User,Integer> {

}
