# reference

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

Git Bash

하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)

$ git add .


하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)

$ git commit -m"update2023"


하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)

$ git push origin ejHA


브랜치 등록 완료 확인


하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)

$ git remote -v

origin  https://github.com/BloomPIUM/reference.git (fetch)

origin  https://github.com/BloomPIUM/reference.git (push)
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

0910 01시 CRUD디버깅 완료,,

스웨거 연결시 403 error가 계속 떴고 아무리 찾아도 문제를 모르겠어서 
건주 오빠의 코드를 참고해서 고쳤습니다 DAO를 다 삭제했고 디펜던시도 한 번 더 점검하여 맞춰보았어요

코드는 문제가 없어보이나 스웨거 연결해서 POST 값 입력하면 500 error가 떴어요

콘솔에 like_cnt가 not null이어야한다 뭐 그런 에러가 떴길래
Integer로 넣어준 조회수 좋아요 값을 int로 수정해주고 (또 뭘 더 수정했는지 모르겠는데)
200으로 잘 돌아갑니다... 데이터베이스에도 잘 들어 갑니다

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

0910 18시 게시글 검색 기능 구현 완료

교재 (예제 advanced_jpa. 210p~) 참고하여 구현하였습니다.

BoardRepository에 쿼리 메서드 작성해서 제목(Title)으로 검색하도록 했고 기능 구현되는지 확인 위해
test에 BoardRepositoryTest 만들어서 @SpringBootTest 로 테스트 돌렸습니다.

부분 일치 키워드로 검색해도 잘 출력됩니다.

같은 방식으로 UserInfo 검색 기능도 구현했는데, 테스트하면서 UserInfo가 데이터베이스에 저장이 안되어서 오류가 뜨길래(UserInfo는 save. 기능 아직 구현하지 않아서로 추측)

데이터베이스에 따로 입력해주고 실행시켜도 오류. -> 실행시키면서 데이터 베이스 삭제 후 다시 만들어서(만들어지지않음 = 데이터베이스에 값 없음)로 생기는 오류로 추측되어

properties의 create를 update로 수정 후 데이터 베이스에 값 따로 입력해주고 user 검색 test 하니 

부분 일치 키워드까지 잘 검색이 됩니다.

