package biz;

import java.util.List;
import java.util.Scanner;

import dao.NewsDao;
import dao.NewsDaolmpl;
import vo.NewsVO;

public class NewsBizlmpl implements NewsBiz {

	private NewsDao newsDao;
	private Scanner input;

	public void initView() {
		System.out.println("---------------------------------");
		System.out.println("1. 전체 뉴스 목록보기");
		System.out.println("2. 뉴스 추가하기");
		System.out.println("3. 종료");
		System.out.println("---------------------------------");

	}

	public NewsBizlmpl() {
		newsDao = new NewsDaolmpl();
		input = new Scanner(System.in);
	}

	@Override
	public void queryAllNews() {

		List<NewsVO> getResult = newsDao.queryAllNews();
		
		if(getResult.isEmpty())
		{
			System.out.println("등록된 뉴스가 없어용");
			return ;
		}
			
		System.out.println("신문 제목       언론사        리포터");
		for (int i = 0; i < getResult.size(); i++) {
			System.out.print(getResult.get(i).getTitle() + "         ");
			System.out.print(getResult.get(i).getPress() + "         ");
			System.out.print(getResult.get(i).getReporterName());
			System.out.println();
		}

		System.out.println();
	}

	@Override
	public void addNewNews() {
		NewsVO newsVO = new NewsVO();
		System.out.println("신문 제목을 작성하세요.");
		String titletmp = input.nextLine();
		newsVO.setTitle(titletmp);

		System.out.println("언론사를 작성하세요.");
		String presstmp = input.nextLine();
		newsVO.setPress(presstmp);

		System.out.println("리포터 성함을 작성하세요.");
		String reporterNametmp = input.nextLine();
		newsVO.setReporterName(reporterNametmp);

		newsDao.addNewNews(newsVO);
	}

}
