package com.objectClass;

import java.util.Objects;

public class _Object {
	
	private int id;
	private String name;
	
	public _Object(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public _Object() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "_Object [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		
		_Object o=new _Object(1,"Abhi");
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		System.out.println(o.equals(o));
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_Object other = (_Object) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
