package com.offcn.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.EggDao;
import com.offcn.pojo.Egg;
import com.offcn.service.EggService;

@Service
public class EggServiceImple implements EggService{

	@Autowired
	private EggDao eggDao;
	
	public List<Egg> getListEgg() {
		// TODO Auto-generated method stub
		return eggDao.getListEgg();
	}
	

}
