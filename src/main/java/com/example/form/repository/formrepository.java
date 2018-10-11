package com.example.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.form.entity.Form;

public interface formrepository extends JpaRepository<Form,Integer>{

}
