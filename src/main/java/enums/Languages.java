package enums;

public enum Languages {
    RU("/ru"),
    EN("/en"),
    UA("/");

    private final String title;

    Languages(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
