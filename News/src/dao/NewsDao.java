package dao;

import java.util.List;
import vo.NewsVO;

public interface NewsDao {
	public List<NewsVO> queryAllNews();
	public void addNewNews(NewsVO newsVO);
}	
