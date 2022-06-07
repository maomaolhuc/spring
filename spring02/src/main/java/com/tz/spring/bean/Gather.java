package com.tz.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试集合属性的注入
 * @author Administrator
 *
 */
public class Gather {
	
	private String strVal;
	
	private int intVal;
	
	private List<String> listVal;
	
	private Set<String> setVal;
	
	private Map mapVal;

	public String getStrVal() {
		return strVal;
	}

	public void setStrVal(String strVal) {
		this.strVal = strVal;
	}

	public int getIntVal() {
		return intVal;
	}

	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}

	public List<String> getListVal() {
		return listVal;
	}

	public void setListVal(List<String> listVal) {
		this.listVal = listVal;
	}

	public Set<String> getSetVal() {
		return setVal;
	}

	public void setSetVal(Set<String> setVal) {
		this.setVal = setVal;
	}

	public Map getMapVal() {
		return mapVal;
	}

	public void setMapVal(Map mapVal) {
		this.mapVal = mapVal;
	}

}
