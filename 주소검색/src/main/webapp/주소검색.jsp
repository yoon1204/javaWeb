<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>우편번호 검색</title>
    <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</head>
<body>
    <button id="searchButton">우편번호 검색</button>
    <div id="postcodeContainer"></div>

    <script>
        // 우편번호 검색 팝업 띄우기
        document.getElementById('searchButton').addEventListener('click', function () {
            new daum.Postcode({
                oncomplete: function (data) {
                	console.log(data);
                    // 선택한 우편번호 정보를 출력
                    var fullAddress = data.address; // 전체 주소
                    var zonecode = data.zonecode; // 우편번호

                    // 결과를 원하는 곳에 출력하거나 활용하세요
                    document.getElementById('postcodeContainer').innerHTML = '우편번호: ' + zonecode + ', 주소: ' + fullAddress;
                }
            }).open();
        });
    </script>
</body>
</html>
