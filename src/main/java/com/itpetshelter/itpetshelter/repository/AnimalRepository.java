package com.itpetshelter.itpetshelter.repository;

import com.itpetshelter.itpetshelter.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

//JpaRepository<엔터티클래스명(T), PK 타입(ID)> 은 기본적인 쿼리 메소드 만들어줌 CRUD
public interface AnimalRepository extends JpaRepository<Animal, Long> {
//    @Query("select a from Animal where a.") 쿼리문 자동으로 만들어줌..


}
