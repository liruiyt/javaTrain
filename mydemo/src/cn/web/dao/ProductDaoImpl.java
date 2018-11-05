package cn.web.dao;
import cn.web.model.*;

public class ProductDaoImpl extends BaseDao {

	public int save (Product product)
	{
		String sql="insert into Product (name,price,remark) values (?,?,?)";
		return super.update(sql, new Object[] {product.getName(),product.getPrice(),product.getRemark()});
	}
	
	public int delete(int id)
	{
		String sql="delete from Product where id=?";
		return super.update(sql, new Object[] {id});
	}
	
	public int update(Product product)
	{
		String sql="update product set name=?, price=?,remark=? where id=?";
		return super.update(sql, new Object[] {product.getName(),product.getPrice(),product.getRemark(),product.getId()});
	}
}
