package service;

import java.util.List;

import mapper.LanguageMapper;
import po.Language;

public interface LanguageService extends LanguageMapper{
	   public List<Language> getlanguageList();
}
