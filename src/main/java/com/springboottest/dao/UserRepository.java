package com.springboottest.dao;

import com.springboottest.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 除了通过解析方法名来创建查询外，它也提供通过使用@Query 注解来创建查询，
 * 您只需要编写JPQL语句，并通过类似“:name”来映射@Param指定的参数，就像例子中的第三个findUser函数一样。
 */
public interface UserRepository extends JpaRepository<Student,Long> {
    Student findByName(String name);
    Student findByNameAndAge(String name, Integer age);
    @Query("from Student s where s.name=:name ")
    Student findStudent(@Param("name") String name);
}
