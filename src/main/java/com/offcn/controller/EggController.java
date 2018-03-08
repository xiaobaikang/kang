package com.offcn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.pojo.Egg;
import com.offcn.service.EggService;

@Controller
public class EggController {

	@Autowired
	private EggService eggService;
	
	@RequestMapping("getListEgg")
	@ResponseBody
	public List<Egg> getListEgg(){
		List<Egg> list=eggService.getListEgg();
		System.out.println(list);
		return list;
	}
}
