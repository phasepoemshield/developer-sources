package sky.core.util.drag;

public final class TargetHudDrag {
    private float width = 96.0F;
    private float height = 32.0F;
    private float x;
    private float y;
    private boolean initialized;

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public void setSize(float width, float height) {
        this.width = Math.max(48.0F, width);
        this.height = Math.max(20.0F, height);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void ensureInitialized(float screenWidth, float screenHeight) {
        if (!this.initialized) {
            this.x = (screenWidth - this.width) / 2.0F;
            this.y = screenHeight / 2.0F + 36.0F - this.height / 2.0F;
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
                && renderY >= this.y && renderY <= this.y + this.height;
    }
}
