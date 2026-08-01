package fun.nexisdlc.client.utils.render.drag.api;

import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.api.Function;
import lombok.Getter;
import net.minecraft.client.util.Window;

public class Dragging {
    private float xPos;
    private float yPos;

    public float initialXVal;
    public float initialYVal;

    private float startX, startY;
    private boolean dragging;
    private float width, height;

    private float closestVerticalLine = 0;
    private float closestHorizontalLine = 0;
    boolean showVerticalLine, showHorizontalLine;

    private String name;
    @Getter
    private final Function module;

    public Dragging() {
        this.module = null;
        this.name = "";
    }

    public Dragging(Function module, String name, float initialXVal, float initialYVal) {
        this.module = module;
        this.name = name;
        this.xPos = initialXVal;
        this.yPos = initialYVal;
        this.initialXVal = initialXVal;
        this.initialYVal = initialYVal;
    }

    public String getName() {
        return name;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getX() {
        return xPos;
    }

    public void setX(float x) {
        if (!Float.isFinite(x) || Float.compare(this.xPos, x) == 0) {
            return;
        }
        this.xPos = x;
        DraggingManager.markDirty();
    }

    public float getY() {
        return yPos;
    }

    public void setY(float y) {
        if (!Float.isFinite(y) || Float.compare(this.yPos, y) == 0) {
            return;
        }
        this.yPos = y;
        DraggingManager.markDirty();
    }

    public final boolean onClick(double mouseX, double mouseY, int button) {
        // Watermark can be locked/centered via HUD settings.
        if ("Watermark".equals(name) && DraggingManager.getHudBoolean("Watermark", "centering", false)) {
            return false;
        }
        if (button == 0 && MathUtil.isHovered((float) mouseX, (float) mouseY, xPos, yPos, width, height)) {
            dragging = true;
            startX = (int) (mouseX - xPos);
            startY = (int) (mouseY - yPos);
            DraggingManager.pushUndoSnapshot(name, xPos, yPos);
            return true;
        }
        return false;
    }

    public final void onFix(double mouseX, double mouseY, Window res) {
        onFix(mouseX, mouseY, res.getWidth(), res.getHeight());
    }

    public final void onFix(double mouseX, double mouseY, float maxWidth, float maxHeight) {
        if (dragging) {
            float previousX = xPos;
            float previousY = yPos;
            xPos = (float) (mouseX - startX);
            yPos = (float) (mouseY - startY);

            if (Interface.isHudEditorSnapToGridEnabled()) {
                float grid = Interface.getHudEditorGridSize();
                float thr = Interface.getHudEditorSnapThreshold();
                xPos = snap(xPos, grid, thr);
                yPos = snap(yPos, grid, thr);
            }

            if (xPos + width > maxWidth) {
                xPos = maxWidth - width;
            }
            if (yPos + height > maxHeight) {
                yPos = maxHeight - height;
            }
            if (xPos < 0) {
                xPos = 0;
            }
            if (yPos < 0) {
                yPos = 0;
            }

            if (Interface.isHudEditorSmartLinesEnabled()) {
                DraggingManager.GridSnapResult gridResult = DraggingManager.computeSmartGrid(this, maxWidth, maxHeight);
                if (gridResult.snapXActive) {
                    xPos = gridResult.snapX;
                }
                if (gridResult.snapYActive) {
                    yPos = gridResult.snapY;
                }
                closestVerticalLine = gridResult.snapLineX;
                closestHorizontalLine = gridResult.snapLineY;
                showVerticalLine = gridResult.snapXActive;
                showHorizontalLine = gridResult.snapYActive;
            } else {
                closestVerticalLine = 0f;
                closestHorizontalLine = 0f;
                showVerticalLine = false;
                showHorizontalLine = false;
                DraggingManager.clearActiveGridLines();
            }

            if (Float.compare(previousX, xPos) != 0 || Float.compare(previousY, yPos) != 0) {
                DraggingManager.markDirty();
            }
        }
    }

    private float snap(float pos, float gridSpacing, float snapThreshold) {
        float gridPos = Math.round(pos / gridSpacing) * gridSpacing;
        if (Math.abs(pos - gridPos) < snapThreshold) {
            return gridPos;
        }
        return pos;
    }

    public final void onRelease(int button) {
        if (button == 0) {
            dragging = false;
            showVerticalLine = false;
            showHorizontalLine = false;
            DraggingManager.clearActiveGridLines();
            DraggingManager.saveNow();
        }
    }

    public boolean isDragging() {
        return dragging;
    }

    public float getClosestVerticalLine() {
        return closestVerticalLine;
    }

    public float getClosestHorizontalLine() {
        return closestHorizontalLine;
    }

    public boolean isShowVerticalLine() {
        return showVerticalLine;
    }

    public boolean isShowHorizontalLine() {
        return showHorizontalLine;
    }

    public void resetPosition() {
        if (Float.compare(this.xPos, this.initialXVal) == 0 && Float.compare(this.yPos, this.initialYVal) == 0) {
            return;
        }
        this.xPos = this.initialXVal;
        this.yPos = this.initialYVal;
        DraggingManager.markDirty();
    }
}
