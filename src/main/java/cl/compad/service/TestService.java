package cl.compad.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cl.service.dto.TestDTO;


public interface TestService {
	
	
	

	List<TestDTO> list ();

}
