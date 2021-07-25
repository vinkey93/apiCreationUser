package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	 private int id;
	    private String username;
	    private String pwd;

	    public User() {
	    }

	    public User(int id, String username, String lastName) {
	        this.id = id;
	        this.username = username;
	        this.pwd = lastName;
	    }
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public int getId() {
	        return id;
	    }
	    
	    
	
	    
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public void setId(Integer id2) {
			// TODO Auto-generated method stub
			id=id2;
		}
	
}
