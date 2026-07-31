package sky.core.util.drag;

public final class NotificationsDrag {
    private static final float DEFAULT_WIDTH = 100.0F;
    private static final float HEIGHT = 19.0F;

    private float width = DEFAULT_WIDTH;
    private float x;
    private float y;
    private float hitHeight = HEIGHT;
    private boolean initialized;

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return HEIGHT;
    }

    public void setWidth(float width) {
        this.width = Math.max(44.0F, width);
    }

    public void setHitHeight(float hitHeight) {
        this.hitHeight = Math.max(HEIGHT, hitHeight);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void ensureInitialized(float screenWidth, float screenHeight) {
        this.ensureInitialized(screenWidth, screenHeight, HEIGHT);
    }

    public void ensureInitialized(float screenWidth, float screenHeight, float elementHeight) {
        if (!this.initialized) {
            this.syncCenterX(screenWidth);
            this.y = (screenHeight - elementHeight) / 2.0F;
            this.initialized = true;
        }
    }

    public float getCenterX() {
        return this.x + this.width / 2.0F;
    }

    public void syncCenterX(float screenWidth) {
        this.x = (screenWidth - this.width) / 2.0F;
    }

    public void setAnchorY(float y, float screenWidth) {
        this.syncCenterX(screenWidth);
        this.y = y;
        this.initialized = true;
    }

    public void loadAnchorY(float y) {
        this.y = y;
        this.initialized = true;
    }

    public boolean contains(float renderX, float renderY) {
        return renderX >= this.x && renderX <= this.x + this.width
                && renderY >= this.y && renderY <= this.y + this.hitHeight;
    }
}
