package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.FavourableDao;
import com.w.domain.Favourable;
import com.w.service.FavourableService;

/**
 * @ClassName FavourableServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("favouService")
public class FavourableServiceImpl implements FavourableService {

	@Autowired
	private FavourableDao favourableDao;
	
	@Override
	public int addFavourable(Favourable favourable) {
		int result = favourableDao.addFavourable(favourable);
		return result;
	}

	@Override
	public int deleteFavourable(int favourableID) {
		int result = favourableDao.deleteFavourable(favourableID);
		return result;
	}

	@Override
	public int updateFavourable(Favourable favourable) {
		int result = favourableDao.updateFavourable(favourable);
		return result;
	}

	@Override
	public List<Favourable> findAllFavourable() {
		
		return favourableDao.findAllFavourable();
	}

	@Override
	public Favourable findOneByID(int favourableId) {
		
		return (Favourable) favourableDao.findFavourableByID(favourableId);
	}

}
