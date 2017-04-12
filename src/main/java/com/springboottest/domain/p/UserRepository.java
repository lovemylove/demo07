package com.springboottest.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wyh on 2017/4/12.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
