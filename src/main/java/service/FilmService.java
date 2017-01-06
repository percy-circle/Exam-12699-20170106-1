package service;

import java.util.List;

import mapper.FilmMapper;
import po.Film;
import po.FilmCustom;
import po.Page;
import utils.PageBean;

public interface FilmService extends FilmMapper{
	   public List<FilmCustom> findFilmList();
	   public  int insert(Film record);
	   public List<FilmCustom> getFilmByPage(Page page);
	   public void setPageBean(PageBean<FilmCustom> pageBean);
	   Film findFilmById(short id);
}
