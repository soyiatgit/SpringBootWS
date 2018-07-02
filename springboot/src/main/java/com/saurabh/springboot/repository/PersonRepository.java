package com.saurabh.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurabh.springboot.models.Person;

/**
 * extending JPARepository brings in a whole lot of pre-defined methods.
 * We can also add our custom methods if required.
 * @author Saurabh Tiwari
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
