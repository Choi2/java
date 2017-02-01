import java.util.Scanner;
import biz.NewsBiz;
import biz.NewsBizlmpl;


public class NewsMain {

	final int LISTVIEW = 1;
	final int ADDNEWS = 2;
	
	Scanner input = new Scanner(System.in);
	NewsBiz newsBiz = new NewsBizlmpl();
	private int selectedNum;

	public void start() {

		while (true) {
			
			((NewsBizlmpl) newsBiz).initView();
			selectedNum = input.nextInt();
			//input.nextInt();
			
			if (selectedNum == LISTVIEW) newsBiz.queryAllNews();
			else if (selectedNum == ADDNEWS) newsBiz.addNewNews();
			else break;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewsMain().start();
	}

}
