
public class Reservation {
	
	private String space[] = 
		{ 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐", 
		  "☐☐☐☐☐☐☐☐" 
		};
	private boolean isReserve;
	private boolean isCancel;
	
	
	public void initView() {
		
		System.out.println("---------------------");
		
		for(int i = 0; i < space.length; i ++)
		{
			for(int j = 0; j < space[i].length(); j++)
			{
				if(j == 2 || j == 6)
					System.out.print("     ");
				
				System.out.print(space[i].charAt(j));
			}
			
			System.out.println();
		}
		
		System.out.println("---------------------");

		System.out.println("1.예약");
		System.out.println("2.예약 취소");
		System.out.println("3.프로그램 종료");
	}
	
public void ReservationCancelation(int colNum, int rowNum) {
		
		String temp = space[colNum - 1];
		char tempChar[] = temp.toCharArray();
		
		
		if(tempChar[rowNum - 1] == '■') //'예약'을 선택했지만,
		{
			if(isCancel) //유일하게 '취소' 할 때만 선택된 좌석만 바뀌게 되고
				tempChar[rowNum - 1] = '☐';
			
			else //이미 선택을 했다면 다음과 같은 메시지를 나타나게 만들었다.
				System.out.println("이미 그 좌석은 예매하셨습니다.");
		}
		
		else if(tempChar[rowNum - 1] == '☐' && isReserve)
			tempChar[rowNum - 1] = '■';
		
		
		this.space[colNum - 1] = String.copyValueOf(tempChar);
		
		System.out.println();
	
	}


	public void setReserve(boolean isReserve) {this.isReserve = isReserve;}
	public void setCancel(boolean isCancel) {this.isCancel = isCancel;}
	
	
}
