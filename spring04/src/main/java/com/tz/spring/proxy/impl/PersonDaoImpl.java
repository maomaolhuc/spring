package com.tz.spring.proxy.impl;

import com.tz.spring.proxy.PersonDao;

public class PersonDaoImpl implements PersonDao {

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		System.out.println("添加人类的数据....");
	}

	@Override
	public void updatePerson() {
		// TODO Auto-generated method stub
		System.out.println("修改人类的数据....");
	}

}
