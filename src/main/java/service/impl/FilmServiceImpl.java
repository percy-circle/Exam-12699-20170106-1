package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mapper.FilmMapper;
import po.Film;
import po.FilmCustom;
import po.Page;
import service.FilmService;
import utils.PageBean;

public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmMapper filmMapper;

	public List<FilmCustom> findFilmList() {
		// TODO Auto-generated method stub
		return filmMapper.findFilmList();
	}

	public int insert(Film record) {
		// TODO Auto-generated method stub
		return filmMapper.insert(record);
	}

	public int deleteByPrimaryKey(Short filmId) throws Exception {
		// TODO Auto-generated method stub
			return filmMapper.deleteByPrimaryKey(filmId);
		
	}

	public Film selectByPrimaryKey(Short filmId) {
		// TODO Auto-generated method stub
		return filmMapper.selectByPrimaryKey(filmId);
	}

	public int updateByPrimaryKeySelective(Film record) {
		// TODO Auto-generated method stub
		return filmMapper.updateByPrimaryKeySelective(record);
	}

	public Long getFilmCount() {
		// TODO Auto-generated method stub
		return filmMapper.getFilmCount();
	}

	public List<FilmCustom> getFilmByPage(Page page) {
		// TODO Auto-generated method stub
		return filmMapper.getFilmByPage(page);
	}

	public void setPageBean(PageBean<FilmCustom> pageBean) {
		// 得到的总记录数
		int totalCount = this.getFilmCount().intValue();
		// 复制给我的pageBean
		pageBean.setTotal(totalCount);
		// 算出开始的条数
		int startIndex = (pageBean.getCurrent() - 1) * pageBean.getMaxResult();
         Page page=new Page();
         page.setCurrenPage(startIndex);
         page.setMaxResult(pageBean.getMaxResult());
		// 得到分页的数据
		List<FilmCustom> FilmCustoms = filmMapper.getFilmByPage(page);
		// 封装到pageBean
		pageBean.setList(FilmCustoms);
	}

	public Film findFilmById(short id) {
		// TODO Auto-generated method stub
		return filmMapper.findFilmById(id);
	}

}
