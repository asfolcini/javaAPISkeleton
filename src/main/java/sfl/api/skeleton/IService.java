package sfl.api.skeleton;

import java.util.List;

public interface IService {
	
	List getList();
	Object getById(String id);
	Object create(Object obj);
	Object update(String id, Object obj);
	String delete(String id);
}
