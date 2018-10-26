package cl.compad.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cl.service.dto.TestDTO;


@Mapper
public interface TestDao {
	
	@Select("select * from persona")
	List<TestDTO> list ();

}
