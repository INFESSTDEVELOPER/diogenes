package cl.compad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.compad.dao.TestDao;
import cl.service.dto.TestDTO;

@Service
public class TestServiceImpl implements TestService{

	
	
	@Autowired
	private TestDao testDao;
	@Override
	public List<TestDTO> list() {
		// TODO Auto-generated method stub
		return testDao.list();
	}
	
	
	
	

}
