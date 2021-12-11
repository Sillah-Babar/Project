package application;

import java.util.ArrayList;

public class ProductCatalog {
private static ArrayList<ProductDescription> productcatalog;
public ProductCatalog()
{
productcatalog=new	ArrayList<ProductDescription>();
}
public static void setProductDescription(ProductDescription p)
{
productcatalog.add(p);	
}
public static void RemoveProductDescription(String n)
{
	for(int i=0 ; i<productcatalog.size() ; i++)
	{
		if(productcatalog.get(i).getName()==n)
			productcatalog.remove(i);
	}
}

public static String getProductDescription(String n)
{
	String Description=null;
	for(int i=0 ; i<productcatalog.size() ; i++)
	{
		if(productcatalog.get(i).getName()==n)
			Description=productcatalog.get(i).getDescription();
	}
	return Description;
}

}
