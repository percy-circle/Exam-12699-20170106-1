package controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import po.Film;
import po.FilmCustom;
import po.Language;
import service.FilmService;
import service.LanguageService;
import utils.PageBean;
@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;
    @Autowired
    private LanguageService languageService;
    @RequestMapping("/findFilmList")
    @ResponseBody
    public PageBean<FilmCustom> findFilmList(int page,int pageSize){
    	
    	PageBean<FilmCustom> pageBean=new PageBean<FilmCustom>();
    	pageBean.setMaxResult(pageSize);
    	pageBean.setCurrent(page);
    	filmService.setPageBean(pageBean);
		return pageBean;
    }
    @RequestMapping("/add")
    public String to_insertSelective(Film film){
    	filmService.insert(film);
		return "redirect:filmlist.html";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(short id){
    	System.out.println(id);
    	try {
			filmService.deleteByPrimaryKey(id);
		} catch (Exception e) {
			System.out.println(12312);
			return "123";
		}
		return "";
    }
    @RequestMapping("/update")
    public  String update(Film film){
        filmService.updateByPrimaryKeySelective(film);
    	return "redirect:filmlist.html";
    }
    @RequestMapping("/findFilmById")
    @ResponseBody
   public Film findFilmById(short id){
	return filmService.findFilmById(id);
    }
    @RequestMapping("/getlanguageList")
    @ResponseBody
   public List<Language> getlanguageList(){
	return languageService.getlanguageList();
    }
}
