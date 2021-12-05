package services;

import java.util.List;

import models.ArticlesApprovisionnement;

public interface ApprovisionServices {
	public void add(ArticlesApprovisionnement e);
	public void delete(int id);
	public ArticlesApprovisionnement edit(ArticlesApprovisionnement e);
	public List<ArticlesApprovisionnement> findAll();
	public ArticlesApprovisionnement findById(int id); 
}
