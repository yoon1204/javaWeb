package prj0831_;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/team")
public class TeamServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
		//이름목록 준비하기 : 배열이 아닌 ArrayList로 준비함, 삭제를 편리하게 하기 위함
		//조원으로 선택된 이름은 제거되어야 함  ( 똑같은 사람은 다른 조에 또 편성되면 안됨)
         ArrayList<String > names= new ArrayList<>();
         /*
          * 
          * 곽단야
김민규
김민지
김병진
김재열
김현수
문나정
박태민
서예진
이윤
이윤정
이정훈
조은경
표준태
허재혁
허재화

          * 
          */
         names.add("곽단야");
         names.add("김민규");
         names.add("김민지");
         names.add("김병진");
         names.add("김재열");
         names.add("김현수");
         names.add("문나정");
         names.add("박태민");
         names.add("서예진");
         names.add("이윤");
         names.add("이윤정");
         names.add("이정훈");
         names.add("조은경");
         names.add("표준태");
         names.add("허재혁");
         names.add("허재화");
       
     
		
		  /*
		   * 0. Hashmap생성하기 (4개조를 담을  Map생성:  각 조 정보  set을 여러개 담기 위함  )
		   * 1.반복
		   *   1.1 조원이름을 담을 각 Hashset 생성 (중복되는 이름이 담기지 않도록 set사용)
		   *   1.2 반복(4명의 조원이 담길 때 까지)
		   *      - 난수발생
		   *      - 이름목록에서 난수번째 이름을 set에 담는다
		   *      - 이름목록에서 이름 삭제함		    
		   *   1.3 각 조원명단을 map에 저장
		   * 
		   * 
		   */
         
		
		 Random r = new Random();		 
		 HashMap<Integer , HashSet<String>> teams  = new HashMap<>(); // key -value 값을 저장할 수 있음 (검색에 용이함)
		
		 //4개조 
		 for( int i=1; i<=4 ;i++) { 
			 // 각 조원이름을 담을 HashSet 생성
			 HashSet<String>  teamNames = new HashSet<>();	
			 while(teamNames.size() <4) {   //4명이 담길때 까지 반복한다
			 	int index  =r.nextInt( names.size());		
			 	teamNames.add(names.get(index));
			 	names.remove(index);
			 }
			 teams.put(i, teamNames);
		 }
		 
		 System.out.println( teams);
		 
		 //만들어진 Map정보 ( 각 조원들의 명단 정보를 view로 forword함)		  
		 request.setAttribute("result", teams);
		 request.getRequestDispatcher("WEB-INF/views/teamResult.jsp").forward(request, response); 
		
		
	}
	
}
