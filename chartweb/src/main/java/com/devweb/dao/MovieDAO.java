package com.devweb.dao;
 
import java.util.List;
 
import com.devweb.vo.MovieVO;
 
public interface MovieDAO {
    
    public List<MovieVO> selectMovie() throws Exception;
}