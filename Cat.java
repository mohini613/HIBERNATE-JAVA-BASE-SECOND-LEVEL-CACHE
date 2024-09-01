package com.SecondLevelCache;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;
@Entity
@Data
//@Table(name = "Cat")

@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Cat {
	
@Id
	private int CatId;
    
	public String CatBreed;
    
	public  String CatFood;
	
	
	
}
