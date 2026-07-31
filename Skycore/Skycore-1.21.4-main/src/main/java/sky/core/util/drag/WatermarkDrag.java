package sky.core.util.drag;

public final class WatermarkDrag {
    private static final float HEIGHT = 24.0F;
    private static final float DEFAULT_WIDTH = 180.0F;

    private float width = DEFAULT_WIDTH;
    private float x;
    private float y = 7.0F;
    private boolean initialized;

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return HEIGHT;
    }

    public void setWidth(float width) {
        this.width = Math.max(48.0F, width);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void ensureInitialized(float screenWidth) {
        if (!this.initialized) {
            this.x = (screenWidth - this.width) / 2.0F;
            this.initialized = true;
        }
    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
        this.initialized = true;
    }

    public boolean contains(float renderX, float renderY) {
        return renderX >= this.x && renderX <= this.x + this.width
                && renderY >= this.y && renderY <= this.y + HEIGHT;
    }
}
