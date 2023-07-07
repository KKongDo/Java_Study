package day_05;

import java.util.ArrayList;
import java.util.Collections;


public class BookStoreService {
	ArrayList<BookDto> bookList=new ArrayList<BookDto> (); //배열버전 : BookDto[] ba=new BookDto[1000]; , 배열버전에는 bookCount=0;를 넣어줘야 한다.
	ArrayList<MemberDto> memberList=new ArrayList<MemberDto>();
	ArrayList<SaleDto> saleList= new ArrayList<SaleDto>();
	
	public BookStoreService(){
		bookList.add(new BookDto("123","자바기본",20000));
		bookList.add(new BookDto("100","자바응용",25000));
		bookList.add(new BookDto("200","자바코딩테스트",30000));
		
		memberList.add(new MemberDto(100,"홍길동","111-222"));
		memberList.add(new MemberDto(200,"김길동","222-333"));
	
		saleList.add(new SaleDto(100,"100",3));
		saleList.add(new SaleDto(100,"200",1));
		saleList.add(new SaleDto(200,"200",2));
	}

	public MemberDto getMemeberDetail(int mno) { //단수형의 코딩스타일
//		for(int i=0; i<memberList.size(); i++) {
//			MemberDto m=memberList.get(i);
//			
//		} 해당 for문은 옛날방식. 밑에랑 기능은 똑같음.
		for (MemberDto memberDto : memberList) {
			if(mno==memberDto.getMno()) {
				return memberDto; //해당 찾으려는 회원번호의 참조값을 반환
			}
		}
		return null;
	}
	/** 특정 회원이 구매한 판매목록 */
	public ArrayList<SaleDto> getSaleList(int memberNo){ //복수형의 코딩스타일 (getAccontList(int userSeq) )해당하는 부분
		ArrayList<SaleDto> result=new ArrayList<SaleDto>();
		for (SaleDto s : saleList) {
			if(memberNo==s.getMno()) {
				result.add(s);
			}
		}
		return result;
	}

	public ArrayList<SaleDto> getSaleList() { //ArrayList<AccountDto> getAccountList()에 해당하는 부분
		return saleList;
	}

	public ArrayList<MemberDto> getMemberList() {
		return memberList;
	}

	public ArrayList<BookDto> getBookList() {
		return bookList;
	}

	public ArrayList<SaleDto> getSaleListSortByQuantity() {
		QuantityComparator qc=new QuantityComparator();
		
		Collections.sort(saleList, qc);
		return saleList;
	}
}
