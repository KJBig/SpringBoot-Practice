# Info
- JAVA 17
- SpringBoot 3.1.3
- Spring Web
- Lombok
- MySQL
- Spring Data JPA

# DB연결 방법
- application.yml
<img width="627" alt="스크린샷 2023-09-01 오후 10 47 17" src="https://github.com/KJBig/SpringBoot-Practice/assets/101792740/b8c96df1-0838-4d96-9d2f-1c1b3df981a3">

1. {schemaName} -> database 이름. ex)test_DB
2. {mysql_username} -> MySQL user 이름. ex)root
3. {mysql_password} -> MySQL 비밀번호. ex)1234

# 실행마다 DB 초기화 방지하는 법.
- application.yml
<img width="240" alt="스크린샷 2023-09-01 오후 10 50 19" src="https://github.com/KJBig/SpringBoot-Practice/assets/101792740/a22f97ab-18fe-4752-9f1b-12768fea8d42">

1. 최초 실행시 JPA Entity에 맞게 DB가 생성됨.
2. 이후 ddl-auto를 create -> update로 변경. 혹은 ddl-auto를 삭제.
