// 클래스를 선언하는 방법
class Person{}
// 생성자
// 1.주생성자
//    - 클래스 이름 옆에 괄호로 둘러싸인 코드
//    - 클래스를 통해서 객체를 만드는데 필요한 재료를 적어 준다
//        - 재료이름(변수명): 재료타입(변수타입)
//    - 반드시 한개만 존ㄴ재할 수 있다
//    - constructor 키워드를 생략할수 있다

// 1.주생성자 -> 풀버전 ( 생략이 없는 버전)
class User1 constructor(name: String){ // 클래스 네이밍은 대문자로 시작된다
    val userName: String // 클래스 변수(프로퍼티, property) 은 init블록에서 초기화 된다

    init { // 클래스가 생성될때(클래스를 통해서 객체를 만들때) 호출된다
        println(name)
        userName = name
    }
}
// 클래스를 호출하는 방법 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화 (Instance)
// 객체 -> Object, Instance
val user = User1("홍길동")

// 2.주생성자 ->  init 을 생략하는 방법
class User2 constructor(name: String){ // 클래스 네이밍은 대문자로 시작된다
    val userName : String = name
}
val user = User2("홍길동")

// 3. 주생성자 -> constructor를 생략하는 방법
class User3 (name: String){ // 클래스 네이밍은 대문자로 시작된다
    val userName : String = name
}
val user = User3("홍길동")

// 4. 주생성자 -> 생략할수 있는 모든걸 생략하는 방법
class User3_1 (val userName: String){ // 클래스 네이밍은 대문자로 시작된다
}

// 주생성자 -> 기본값 (kotlin 스타일)
class User4(name:String = "김아무개"){
    val userName: String = name
}
val user = User4()

// 생성자에서 받는 속성이 복수개인 경우 (java 스타일)
class User5 constructor(age: Int, name: String){
    val age: Int
    val name : String

    init {
        this.age = age // this 는 클래스 자체를 의미한다(User5)
        this.name = name
    }
}

// .의 의미
// -> ~의
val user5 = User5(20, "홍길동")
println(user5.age)
// - user5.age -> user5의 age
// - user5.기능 -> user5의 기능
// -> .은 객체의 속성이나 기능을 사용할때 사용한다

















