
public class Reservation {

	private String space[] = 
		{ 
		  "☐☐☐☐☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐☐☐☐☐" 
		};
	private boolean isReserve;
	private boolean isCancel;

	public void initView() {
		
		System.out.println("---------------------");
		
		for(int i = 0; i < space.length; i ++)
			System.out.println(space[i]);
		
		System.out.println("---------------------");

		System.out.println("1.예약");
		System.out.println("2.예약 취소");
		System.out.println("3.프로그램 종료");
	}

	public void ReservationCancelation(int colNum, int rowNum) {
		
		String temp = space[colNum - 1];
		char tempChar[] = temp.toCharArray();
		
		
		if(tempChar[rowNum - 1] == '■')
		{
			if(isCancel)
				tempChar[rowNum - 1] = '☐';
			
			else
				System.out.println("이미 그 좌석은 예매하셨습니다.");
		}
		
		else if(tempChar[rowNum - 1] == '☐' && isReserve)
			tempChar[rowNum - 1] = '■';
		
		
		this.space[colNum - 1] = String.copyValueOf(tempChar);
		
		System.out.println();
	
	}

	public boolean isReserve() {return isReserve;}
	public void setReserve(boolean isReserve) {this.isReserve = isReserve;}
	
	public boolean isCancel() {return isCancel;}
	public void setCancel(boolean isCancel) {this.isCancel = isCancel;}
	
	
}
