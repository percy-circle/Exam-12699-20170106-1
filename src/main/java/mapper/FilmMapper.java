package mapper;

import java.util.List;

import po.Film;
import po.FilmCustom;
import po.Page;

public interface FilmMapper {
    int deleteByPrimaryKey(Short filmId) throws Exception;

    int insert(Film record);

    Film selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(Film record);
    
    List<FilmCustom> findFilmList();
    
    Long getFilmCount();
    
    List<FilmCustom> getFilmByPage(Page page);
    
    Film findFilmById(short id);
}