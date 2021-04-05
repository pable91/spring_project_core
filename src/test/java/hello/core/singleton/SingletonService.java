package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자를 private로 선언해서, 외부에서 new할수 없게 설정
    private SingletonService() {

    }
}
