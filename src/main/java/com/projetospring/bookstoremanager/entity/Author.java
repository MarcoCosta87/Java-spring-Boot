package com.projetospring.bookstoremanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false)
	private Integer age;
	
	
	
	
}
