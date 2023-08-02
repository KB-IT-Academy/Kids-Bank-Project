package service;

import dto.ChildDto;
import dto.ParentDto;

public interface joinService {
	public void CreateChild(ChildDto dto);
	
	public void updateChild(ChildDto dto);
	
	public void createParent(ParentDto dto, String registNum);
	
	public void updateParent(ParentDto dto);
}
