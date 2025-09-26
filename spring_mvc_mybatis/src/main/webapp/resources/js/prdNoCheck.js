$(document).ready(function(){
	$('#prdNoCheckBtn').on('click',function(){
		event.preventDefault();
		
		let prdNo = $('#prdNo').val();
		
		if(prdNo == ""){
			alert("상품번호를 입력하세요");
			return false;
		}else{ //서버측에 상품번호 중복 확인 요청
			$.ajax({
				type:"post",
				url:'/mybatis/product/prdNoCheck' ,
				data: {"prdNo" :prdNo},
				dataType: "text" ,
				success: function(result){
					if(result=="available"){
						alert("사용 가능한 번호입니다")
					}else{
						alert("사용 불가능한 번호입니다")
					}
				},
				error: function(data, textStatus){
					alert("전송실패");
				} ,
				complete: function(){
				
				}
				
			
			
			});
		}
	
	
	
	});//on 메소드 종료
});//ready 종료