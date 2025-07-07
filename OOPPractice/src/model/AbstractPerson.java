package model;
//抽象類別(父類)
//不能new,只能被繼承
public abstract class AbstractPerson {
    private String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //抽象方法 -> 沒有實作,子類別必須實作
    public abstract void introduce();
}
