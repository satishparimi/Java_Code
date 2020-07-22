package com.host.java8.hascodeandequals;

public class Student {

	public String id;
	public String name;
	public String std;
	
	public Student(String id, String name, String std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((std == null) ? 0 : std.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (std == null) {
			if (other.std != null)
				return false;
		} else if (!std.equals(other.std))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStd() {
		return std;
	}
	
	public void setStd(String std) {
		this.std = std;
	}
	
	
	
	
	
	
	
	
	
}
