package actions;

public class Actions {
    private static HeaderActions headerActions;

    public static HeaderActions headerActions(){
        if (headerActions == null){
            headerActions = new HeaderActions();
        }
        return headerActions;
    }
}
