package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.DanhMuc;

@Repository
public interface CategoryRepo extends JpaRepository<DanhMuc, String> {

}
