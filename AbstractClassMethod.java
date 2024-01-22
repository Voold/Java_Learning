package firstStep;

public abstract class AbstractClassMethod { // По сути класс, который описывает основу дочених классов
    // на его основе можно создать объект, но только выделяя память по дочерний класс
    // Transport(abstract) BMW = new CAR() - Транспорт абстрактный класс, память выделяется под дочерний класс CAR

    public abstract void SomeMethod(); // просто напоминание
    public abstract boolean SomeMethod1(boolean SomeVar);// что у очерних классов
    public abstract void SomeMethod2();// должны быть эти методы !!С разныйм функционалом во всех!! (типо передвижения в транспорте)

}
