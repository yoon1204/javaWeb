package prj0824;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/divisor0")
public class DivisorServlet0  extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
		
		int su=10;  // 임의의 수를 정한다
		int[] nums  = new int[10];
		int index =0;
		
		for( int i=1 ; i<=su ; i++) {
			 if( su % i  ==0) {
				 nums[index]=i;
			 }
		}		 
		 
		
		PrintWriter out  = response.getWriter();
		out.println(  Arrays.toString(nums) );
		
		
		
	}

}


/*
 
1. 두 수를 사용자로 부터 입력 받아 사칙연산해서 제공하기
2. 3단 제공하기 (3단 제공하는 서비스)
3. 원하는단 제공하기 (원하는단을 제공하는 서비스)
4. 학생성적을 처리하기 위한 Score class를 만든것처럼
자신이 처리하고 싶은 자료에 대한 class를 만들고 그 정보를 제공하기 (응답해 주기)
예) 책정보:Book class 
5. 원하는 수만큼의 별을 출력하기 ( 원하는 수만큼 별을 출력하는 서비스제공하기)
6. 수를 사용자로부터 받으면 입력한 수에 대한 약수를 구해서 제공하기
(약수를 구해주는 서비스)
7. 화이팅메시지 제공하기
8. 랜덤한 화이팅메시지 제공하기
9. 귀여운이미지 제공하기
10. 랜덤한 귀여운이미지 제공하기


*/