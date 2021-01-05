package sfl.api.skeleton;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/apiname")
public class APISkeletonController {
	
	@Autowired
	private FooService service;

	@GetMapping
	public List<Object> getAll() {
		return service.getList();
	}

	@GetMapping("/{id}")
	public Object getById(@PathVariable("id") String id) {
		return service.getById(id);
	}

	@PostMapping
	public Object create(@RequestBody Object contact) {
		return service.create(contact);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable("id") String id, @RequestBody Object contact) {
		return service.update(id, contact);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") String id) {
		return service.delete(id);
	}

	
}
