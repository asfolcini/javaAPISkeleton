package sfl.api.skeleton;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FooService implements IService{

	List<Object> obj = new ArrayList();
	
	public FooService() {
		for(int i=0;i<10;i++)
			obj.add("Object "+i);
	}
	
	@Override
	public List getList() {
		return obj;
	}

	@Override
	public Object getById(String id) {
		return obj.get(1);
	}

	@Override
	public Object create(Object obj) {
		this.obj.add(obj);
		return obj;
	}

	@Override
	public Object update(String id, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String id) {
		this.obj.remove(obj);
		return id;
	}

}
