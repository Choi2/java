package dao;

import java.util.ArrayList;
import java.util.List;
import vo.NewsVO;

public class NewsDaolmpl implements NewsDao{

	private List<NewsVO> NewsList;
	
	public NewsDaolmpl(){ NewsList = new ArrayList<NewsVO>(); }
	
	@Override
	public List<NewsVO> queryAllNews() {return NewsList;}

	@Override
	public void addNewNews(NewsVO newsVO) { 
		NewsList.add(newsVO);
	}
	
}
