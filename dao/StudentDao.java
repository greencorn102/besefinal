package stu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import stu.entity.Years;

public interface StudentDao extends JpaRepository<Years, Long> {

}
