package services;

import java.util.List;

import models.ArticlesStock;

public interface ArticlesStockServices {
	public int add(ArticlesStock e);
	public void delete(Integer id);
	public ArticlesStock edit(ArticlesStock e);
	public List<ArticlesStock> findAll();
	public ArticlesStock findById(Integer id); 
}
