$(document).ready(function(){
	$('#prdSearchFrm1').on('submit', function(){
		event.preventDefault();//submit 이벤트 중지
	
	//폼에 입력된 여러 개의 값을 쿼리스트링 방식의 데이터로 변환 : serealize() 사용
	let formData = $(this).serialize();
	
	let keyword=$('#keyword').val();
	let type=$('#type').val();
	
	if(keyword==""||type==""){
		alert("검색 조건과 검색어를 입력하세요");
		//return false;
	}else{
	$.ajax({
			type:"post", //요청 방식 메소드
			url:"/mybatis/product/productSearch1", //요청 url
			data: formData, //요청시 전송될 파라미터, 파라미터명 
			//dataType:"text", //요청후 반환되는 데이터타입 - 확실하지 않아 적지 않음
			success: function(result){				
					console.log(result);	
			},
			error: function(data){
				alert("요청 실패");
			},
		});
	  } 	//else 끝
	}); //submit 종료
}); // ready 종료