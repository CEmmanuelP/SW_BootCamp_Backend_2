# 3rd Week

- [x]  springboot 개발환경 설정

- [X]  통계 API를 위한 DB, Table 생성

- [X] 샘플 데이터 DB Table로 작성하고 table에 insert

- [ ] RestController를 활용한 간단 API구현(진행중)


-----

###RESTAPI

#### - REST(Representational State Transfer)

    REST란 자원을 이름으로 구분하여 해당 자원의 상태를 주고받는 것. 즉, 자원의 표현에 의한 상태 전달
    
#### - API(Application Programing Interface)

    소프트웨어가 다른 소프트웨어로부 지정된 형식으로 요청, 명령을 받을 수 있는 수단
    
#### - RESTAPI

    HTTP요청을 보낼 때, 어떤 URI에 어떤 메소드를 사용할 지(+기타) 개발자들 사이에 널리 지켜지는 약속(형식, 규칙)
    
#### - RESTful

    REST원리를 따르는 시스템
    
    이해하기 쉽고 사용하기 쉬운 REST API를 만드는 것이 목적
    
    
##### - URI(URL)

      URI는 Uniform Resource Identifier의 약자로 Resource를 식별하기 위한 식별자  

<img width="750" alt="Screen Shot 2020-09-18 at 10 39 56 AM" src="https://user-images.githubusercontent.com/47844536/93545444-5b959c00-f99b-11ea-8129-3664e1691b83.png">



-------    
###HTTP

    HTTP(HTTPS)는 Protocol. 그 중에서도 웹 통신을 정의한 프로토콜.
    
    HTTP는 사용자가 서버에 요청을 하는 Request와 사용자의 요청에 대한 서버의 응답인 Response로 이루어짐.
    
    
#####브라우저에 URL입력 후 요청하여 서버에서 응답하는 과정

<img width="750" alt="Screen Shot 2020-09-18 at 10 32 04 AM" src="https://user-images.githubusercontent.com/47844536/93545085-8a5f4280-f99a-11ea-8fde-d7e40994580c.png">

--------
###[Spring] @RestController

    컨트롤러 클래스에 @RestController만 붙이면 메서드에 @ResponseBody를 붙이지 않아도 문자열과 JSON등을 전송할 수 있습니다.
    
    @Controller는 View를 리턴하는 메서드들을 가지고 있고, @RestController는 문자열, 객체 등을 리턴하는 메서드들을 가지고 있습니다.
    
     






# 4rd Week

- [ ]  api 작성

- [ ]  api 문서 보완

- [ ]  poi library 이용해서 api결과 excel로 다운








