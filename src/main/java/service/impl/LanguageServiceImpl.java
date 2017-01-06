package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mapper.LanguageMapper;
import po.Language;
import service.LanguageService;

public class LanguageServiceImpl implements LanguageService {
   @Autowired
   private LanguageMapper languageMapper;

	public List<Language> getlanguageList() {
		// TODO Auto-generated method stub
		return languageMapper.getlanguageList();
	}

}
