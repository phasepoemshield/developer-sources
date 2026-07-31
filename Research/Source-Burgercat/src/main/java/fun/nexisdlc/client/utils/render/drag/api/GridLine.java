package fun.nexisdlc.client.utils.render.drag.api;

public class GridLine {
    public enum Type {
        HORIZONTAL,
        VERTICAL
    }

    public enum Align {
        EDGE,
        CENTER
    }

    private final Type type;
    private final Align align;
    private final float pos;
    private boolean active;

    public GridLine(Type type, Align align, float pos) {
        this.type = type;
        this.align = align;
        this.pos = pos;
    }

    public Type getType() {
        return type;
    }

    public Align getAlign() {
        return align;
    }

    public float getPos() {
        return pos;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
