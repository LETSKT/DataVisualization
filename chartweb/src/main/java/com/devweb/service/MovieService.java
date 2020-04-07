package com.devweb.service;

import java.util.List;
 
import com.devweb.vo.MovieVO;
 
public interface MovieService {
    
    public List<MovieVO> selectMovie() throws Exception;
}