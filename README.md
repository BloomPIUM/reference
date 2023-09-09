# reference


Git Bash

하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)
$ git add .

하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)
$ git commit -m"update2023"
On branch ejHA
nothing to commit, working tree clean

하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)
$ git push origin ejHA
remote: Permission to BloomPIUM/reference.git denied to ejHA.
fatal: unable to access 'https://github.com/BloomPIUM/reference.git/': The requested URL returned error: 403



브랜치 등록 완료 확인

하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)
$ git status
On branch ejHA
nothing to commit, working tree clean

하은지@LAPTOP-EFFNMEUQ MINGW64 /c/Dev/Workspace/reference (ejHA)
$ git remote -v
origin  https://github.com/BloomPIUM/reference.git (fetch)
origin  https://github.com/BloomPIUM/reference.git (push)


---------------------------------------------------
0910 01시 디버깅 완,,
스웨거 연결시 403 error가 계속 떴고 아무리 찾아도 문제를 모르겠어서
건주 오빠의 코드를 참고해서 고쳤습니다 DAO를 다 삭제했고 디펜던시도 한 번 더 점검하여 맞춰보았어요
코드는 문제가 없어보이나 스웨거 연결해서 POST 값 입력하면 500 error가 떴어요
콘솔에 like_cnt가 not null이어야한다 뭐 그런 에러가 떴길래
Integer로 넣어준 조회수 좋아요 값을 int로 수정해주고 (또,,, 뭘 했는지 모르겠는데)
200으로 잘 돌아갑니다... 데이터베이스에도 잘 들어 갑니다,,,,
