package sky.core.util.drag;

import com.google.gson.JsonObject;
import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;
import sky.core.Skycore;
import sky.core.util.animation.Animations;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.ScreenScale;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;

public final class DragController {
    private static final DragController INSTANCE = new DragController();
    private static final float SNAP_DISTANCE = 10.0F;
    private static final float GRID_LINE_SIZE = 1.0F;
    private static final float SCREEN_PADDING = 0.0F;
    private static final int HINT_FONT_SIZE = 18;
    private static final float HINT_OFFSET_ABOVE_CENTER = 200.0F;
    private static final long FADE_DURATION_MS = 250L;
    private static final String HINT_TEXT = "CTRL — свободное перемещение";

    private final WatermarkDrag watermark = new WatermarkDrag();
    private final TargetHudDrag targetHud = new TargetHudDrag();
    private final NotificationsDrag notifications = new NotificationsDrag();

    private DragElement dragElement = DragElement.NONE;
    private float dragOffsetX;
    private float dragOffsetY;

    private DragController() {
    }

    public static DragController getInstance() {
        return INSTANCE;
    }

    public WatermarkDrag getWatermark() {
        return this.watermark;
    }

    public TargetHudDrag getTargetHud() {
        return this.targetHud;
    }

    public NotificationsDrag getNotifications() {
        return this.notifications;
    }

    public boolean isDragging() {
        return this.dragElement != DragElement.NONE;
    }

    public void stopDragging() {
        if (this.dragElement == DragElement.NONE) {
            return;
        }
        this.dragElement = DragElement.NONE;
        Animations.DRAG_GRID.fadeOut(FADE_DURATION_MS);
        Skycore.getInstance().getClientConfig().saveCurrentSettings();
    }

    public JsonObject savePositions() {
        JsonObject hud = new JsonObject();

        JsonObject watermark = new JsonObject();
        watermark.addProperty("x", this.watermark.getX());
        watermark.addProperty("y", this.watermark.getY());
        hud.add("watermark", watermark);

        JsonObject targetHud = new JsonObject();
        targetHud.addProperty("x", this.targetHud.getX());
        targetHud.addProperty("y", this.targetHud.getY());
        hud.add("targetHud", targetHud);

        JsonObject notifications = new JsonObject();
        notifications.addProperty("y", this.notifications.getY());
        hud.add("notifications", notifications);

        return hud;
    }

    public void loadPositions(JsonObject hud) {
        if (hud.has("watermark")) {
            JsonObject watermark = hud.getAsJsonObject("watermark");
            if (watermark.has("x") && watermark.has("y")) {
                this.watermark.setPosition(watermark.get("x").getAsFloat(), watermark.get("y").getAsFloat());
            }
        }

        if (hud.has("targetHud")) {
            JsonObject targetHud = hud.getAsJsonObject("targetHud");
            if (targetHud.has("x") && targetHud.has("y")) {
                this.targetHud.setPosition(targetHud.get("x").getAsFloat(), targetHud.get("y").getAsFloat());
            }
        }

        if (hud.has("notifications")) {
            JsonObject notifications = hud.getAsJsonObject("notifications");
            if (notifications.has("y")) {
                this.notifications.loadAnchorY(notifications.get("y").getAsFloat());
            }
        }
    }

    public void updateDragPosition() {
        if (this.dragElement == DragElement.NONE || !HudLayoutMode.isActive()) {
            return;
        }
        double[] mouse = ScreenScale.getScaledMouse();
        this.applyPosition(mouse[0], mouse[1]);
    }

    public boolean tryStartDrag() {
        if (!HudLayoutMode.isActive()) {
            return false;
        }

        float screenWidth = ScreenScale.getRenderWidth();
        float screenHeight = ScreenScale.getRenderHeight();
        double[] mouse = ScreenScale.getScaledMouse();
        float renderX = ScreenScale.toHudX(mouse[0]);
        float renderY = ScreenScale.toHudY(mouse[1]);

        this.targetHud.ensureInitialized(screenWidth, screenHeight);
        if (this.targetHud.contains(renderX, renderY)) {
            this.dragElement = DragElement.TARGET_HUD;
            Animations.DRAG_GRID.fadeIn(FADE_DURATION_MS);
            this.dragOffsetX = renderX - this.targetHud.getX();
            this.dragOffsetY = renderY - this.targetHud.getY();
            return true;
        }

        this.watermark.ensureInitialized(screenWidth);
        if (this.watermark.contains(renderX, renderY)) {
            this.dragElement = DragElement.WATERMARK;
            Animations.DRAG_GRID.fadeIn(FADE_DURATION_MS);
            this.dragOffsetX = renderX - this.watermark.getX();
            this.dragOffsetY = renderY - this.watermark.getY();
            return true;
        }

        this.notifications.ensureInitialized(screenWidth, screenHeight);
        if (this.notifications.contains(renderX, renderY)) {
            this.dragElement = DragElement.NOTIFICATIONS;
            Animations.DRAG_GRID.fadeIn(FADE_DURATION_MS);
            this.dragOffsetX = 0.0F;
            this.dragOffsetY = renderY - this.notifications.getY();
            return true;
        }

        return false;
    }

    public boolean isOverWatermark() {
        if (!HudLayoutMode.isActive()) {
            return false;
        }

        float screenWidth = ScreenScale.getRenderWidth();
        this.watermark.ensureInitialized(screenWidth);
        double[] mouse = ScreenScale.getScaledMouse();
        return this.watermark.contains(
                ScreenScale.toHudX(mouse[0]),
                ScreenScale.toHudY(mouse[1]));
    }

    public void onMouseButton(int button, int action) {
        if (!HudLayoutMode.isActive()) {
            if (this.isDragging()) {
                this.stopDragging();
            }
            return;
        }

        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT && action == GLFW.GLFW_RELEASE) {
            this.stopDragging();
        }
    }

    public void tickAnimations() {
        boolean layoutActive = HudLayoutMode.isActive();
        if (layoutActive) {
            Animations.LAYOUT_HINT.fadeIn(FADE_DURATION_MS);
        } else if (Animations.LAYOUT_HINT.isOpen()) {
            Animations.LAYOUT_HINT.fadeOut(FADE_DURATION_MS);
        }

        if (!layoutActive && this.isDragging()) {
            this.stopDragging();
        }

        Animations.updateAll();
    }

    public boolean shouldRenderOverlay() {
        return Animations.LAYOUT_HINT.isVisible() || Animations.DRAG_GRID.isVisible();
    }

    public void renderOverlay(RenderUtil renderer, MatrixStack matrices) {
        this.tickAnimations();
        if (!this.shouldRenderOverlay()) {
            return;
        }

        float screenWidth = ScreenScale.getRenderWidth();
        float screenHeight = ScreenScale.getRenderHeight();
        float centerX = screenWidth / 2.0F;
        float centerY = screenHeight / 2.0F;

        float hintAlpha = Animations.LAYOUT_HINT.getAlpha() * 220.0F;
        if (hintAlpha > 0.5F) {
            FontRenderer font = FontManager.getRegular(HINT_FONT_SIZE);
            float hintY = centerY - HINT_OFFSET_ABOVE_CENTER;
            font.drawCentered(HINT_TEXT, centerX, hintY, withAlpha(255, 255, 255, hintAlpha), matrices);
        }

        float gridAlpha = Animations.DRAG_GRID.getAlpha() * 180.0F;
        if (gridAlpha > 0.5F) {
            Color lineColor = withAlpha(255, 255, 255, gridAlpha);
            renderer.drawRoundedRect(0.0F, centerY - GRID_LINE_SIZE / 2.0F, screenWidth, GRID_LINE_SIZE, lineColor, matrices);
            renderer.drawRoundedRect(centerX - GRID_LINE_SIZE / 2.0F, 0.0F, GRID_LINE_SIZE, screenHeight, lineColor, matrices);
        }
    }

    private void applyPosition(double scaledMouseX, double scaledMouseY) {
        float screenWidth = ScreenScale.getRenderWidth();
        float screenHeight = ScreenScale.getRenderHeight();
        float renderX = ScreenScale.toHudX(scaledMouseX);
        float renderY = ScreenScale.toHudY(scaledMouseY);

        float newX = renderX - this.dragOffsetX;
        float newY = renderY - this.dragOffsetY;

        float elementWidth;
        float elementHeight;
        if (this.dragElement == DragElement.TARGET_HUD) {
            elementWidth = this.targetHud.getWidth();
            elementHeight = this.targetHud.getHeight();
        } else if (this.dragElement == DragElement.NOTIFICATIONS) {
            elementWidth = this.notifications.getWidth();
            elementHeight = this.notifications.getHeight();
        } else {
            elementWidth = this.watermark.getWidth();
            elementHeight = this.watermark.getHeight();
        }

        if (!this.isCtrlDown()) {
            float centerX = newX + elementWidth / 2.0F;
            float centerY = newY + elementHeight / 2.0F;
            float screenCenterX = screenWidth / 2.0F;
            float screenCenterY = screenHeight / 2.0F;

            if (this.dragElement != DragElement.NOTIFICATIONS && Math.abs(centerX - screenCenterX) <= SNAP_DISTANCE) {
                newX = screenCenterX - elementWidth / 2.0F;
            }
            if (Math.abs(centerY - screenCenterY) <= SNAP_DISTANCE) {
                newY = screenCenterY - elementHeight / 2.0F;
            }
        }

        if (this.dragElement == DragElement.NOTIFICATIONS) {
            newX = screenWidth / 2.0F - elementWidth / 2.0F;
        }

        newX = clamp(newX, SCREEN_PADDING, screenWidth - elementWidth - SCREEN_PADDING);
        newY = clamp(newY, SCREEN_PADDING, screenHeight - elementHeight - SCREEN_PADDING);

        if (this.dragElement == DragElement.TARGET_HUD) {
            this.targetHud.setPosition(newX, newY);
        } else if (this.dragElement == DragElement.NOTIFICATIONS) {
            this.notifications.setAnchorY(newY, screenWidth);
        } else {
            this.watermark.setPosition(newX, newY);
        }
    }

    private boolean isCtrlDown() {
        long window = net.minecraft.client.MinecraftClient.getInstance().getWindow().getHandle();
        return GLFW.glfwGetKey(window, GLFW.GLFW_KEY_LEFT_CONTROL) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(window, GLFW.GLFW_KEY_RIGHT_CONTROL) == GLFW.GLFW_PRESS;
    }

    private static Color withAlpha(int red, int green, int blue, float alpha) {
        return new Color(red, green, blue, Math.round(Math.min(255.0F, Math.max(0.0F, alpha))));
    }

    private static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    private enum DragElement {
        NONE,
        WATERMARK,
        TARGET_HUD,
        NOTIFICATIONS
    }
}
