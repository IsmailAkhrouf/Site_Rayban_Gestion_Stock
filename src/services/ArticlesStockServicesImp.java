package services;

import java.util.List;

import models.ArticlesStock;
import models.ArticlesStockDAO;
import models.ArticlesStockDAOImp;

public class ArticlesStockServicesImp implements ArticlesStockServices {

	ArticlesStockDAO arts = new ArticlesStockDAOImp();
	@Override
	public int add(ArticlesStock e) {
		return arts.add(e);
	}

	@Override
	public void delete(Integer id) {
		arts.delete(id);
	}

	@Override
	public ArticlesStock edit(ArticlesStock e) {
		return arts.edit(e);
	}

	@Override
	public List<ArticlesStock> findAll() {
		return arts.findAll();
	}

	@Override
	public ArticlesStock findById(Integer id) {
		return arts.findById(id);
	}

	
	
}
