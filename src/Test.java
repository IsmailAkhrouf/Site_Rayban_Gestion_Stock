
import java.util.List;

import models.ArticlesStock;
import services.*;
public class Test {
	public static void main(String[] arg) {
		
		
		ArticlesStockServices b = new ArticlesStockServicesImp();
		List<ArticlesStock> c = b.findAll();
		
		for(int g=0;g<c.size();g++)
			System.out.println(c.get(g).getNomArt());
		
	}
}
