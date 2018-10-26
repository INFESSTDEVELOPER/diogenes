package cl.compad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.compad.service.TestService;
import cl.service.dto.TestDTO;

@Controller
public class SaludoController {

	
	@Autowired
	private TestService testService;
    @GetMapping("/saludo")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Desgraciados jeje") String name, Model model) {
        model.addAttribute("name", name);
        
        for(  TestDTO dto: testService.list() ) {
        	
        	System.out.println(dto.getNombre());
        }
        model.addAttribute("list", testService.list() );
        return "saludo";
    }

}
