package com.rays.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dao.StudentDAOInt;
import com.rays.dao.TimeTableDAOInt;
import com.rays.dto.StudentDTO;
import com.rays.dto.SubjectDTO;
import com.rays.dto.TimeTableDTO;

/**
 * Session facade of TimeTable Service. It is transactional, apply declarative
 * transactions with help of Spring AOP.
 * 
 * If unchecked exception is propagated from a method then transaction is rolled
 * back.
 * 
 * Default propagation value is Propagation.REQUIRED and readOnly = false
 * @author bhupendra patidar
 *
 */
@Service
@Transactional
public class TimeTableServiceImpl extends BaseServiceImpl<TimeTableDTO, TimeTableDAOInt> implements TimeTableServiceInt {

	
	@Override
	public TimeTableDTO findByName(String name, UserContext context) {

	TimeTableDTO dto=baseDao.findByUniqueKey(name, name, context);
	return dto;
	}

	
}
