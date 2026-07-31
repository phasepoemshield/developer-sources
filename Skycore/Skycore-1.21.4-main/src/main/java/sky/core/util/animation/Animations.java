package sky.core.util.animation;

public final class Animations {
    public static final Animation LAYOUT_HINT = new Animation();
    public static final Animation DRAG_GRID = new Animation();

    private Animations() {
    }

    public static void updateAll() {
        LAYOUT_HINT.update();
        DRAG_GRID.update();
    }
}
