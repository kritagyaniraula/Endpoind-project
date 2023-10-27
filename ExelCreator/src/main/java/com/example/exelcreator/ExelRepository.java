package com.example.exelcreator;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.exelcreator.ExelModel;

import java.io.Serializable;

public interface ExelRepository extends JpaRepository<ExelModel, Serializable> {

}
