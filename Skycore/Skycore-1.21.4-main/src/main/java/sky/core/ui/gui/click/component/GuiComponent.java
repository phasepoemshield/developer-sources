package sky.core.ui.gui.click.component;

import net.minecraft.client.util.math.MatrixStack;
import sky.core.util.render.RenderUtil;

public abstract class GuiComponent {
    protected float x;
    protected float y;
    protected float width;
    protected float height;

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public abstract void render(RenderUtil renderer, MatrixStack matrices, double mouseX, double mouseY, float alpha);

    public void mouseClicked(double mouseX, double mouseY, int button) {
    }

    public void mouseReleased(double mouseX, double mouseY, int button) {
    }

    public void mouseDragged(double mouseX, double mouseY, int button) {
    }
}
