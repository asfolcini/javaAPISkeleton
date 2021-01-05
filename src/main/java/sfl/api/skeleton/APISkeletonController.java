package sfl.api.skeleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APISkeletonController {
	

	@GetMapping("/status")
	public String status(@RequestParam(value = "service", defaultValue = "ALL") String service) {
	
		String status = "KO";
		switch (service){
			case "ALL": 
						status = "ALL OK!";
						break;
			default: 
					status = "OK";
					break;
		}
		
		return "Service status is "+status;
	}

	
	@GetMapping("/v1/apiname/{id}")
    public String single(@PathVariable String id) {
        // Implement GET method
		return "!!To be implemented!!, GET single object {" + id + "}";
    }
	
	
	@GetMapping("/v1/apiname/")
	public String list() {
		return "!!To be implemented!!, GET list of objects";
	}
	

	@GetMapping("/error")
	public String error() {
		return "Error fallback to be implemented!!";
	}

	
}
