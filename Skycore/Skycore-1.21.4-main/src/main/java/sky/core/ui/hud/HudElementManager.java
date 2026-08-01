package sky.core.ui.hud;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import sky.core.util.drag.DragController;
import sky.core.util.drag.HudLayoutMode;
import sky.core.ui.hud.notifications.Notifications;
import sky.core.ui.hud.target.TargetHud;
import sky.core.ui.hud.watermark.Watermark;
import sky.core.module.impl.visuals.InterfaceModule;
import sky.core.module.impl.visuals.TagsModule;
import sky.core.ui.tags.Tags;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.ScreenScale;

public final class HudElementManager {
    private static final HudElementManager INSTANCE = new HudElementManager();
    private final MinecraftClient client = MinecraftClient.getInstance();
    public Watermark watermark = new Watermark();
    public TargetHud targetHud = new TargetHud();
    public Notifications notifications = new Notifications();
    public Tags tags = new Tags();
    private boolean eventsRegistered;

    private HudElementManager() {
    }

    public static HudElementManager getInstance() {
        return INSTANCE;
    }

    public void registerEvents() {
        if (this.eventsRegistered) {
            return;
        }
        this.eventsRegistered = true;
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.world == null || client.player == null) {
                return;
            }
            if (this.isTargetHudEnabled()) {
                this.targetHud.tick();
            }
            if (InterfaceModule.INSTANCE.isNotificationsEnabled()) {
                this.notifications.tick();
            }
        });
    }

    public void render(DrawContext context, float delta) {
        if (this.client.world == null || this.client.player == null) {
            return;
        }

        if (RenderUtil.get() == null) {
            return;
        }

        context.draw();
        ScreenScale.begin(2.0);
        DragController.getInstance().updateDragPosition();
        float screenWidth = ScreenScale.getRenderWidth();
        float screenHeight = ScreenScale.getRenderHeight();
        if (this.isWatermarkEnabled()) {
            this.watermark.render(context.getMatrices(), screenWidth);
        }
        if (InterfaceModule.INSTANCE.isNotificationsEnabled() && this.notifications.shouldRenderInMainHud()) {
            this.notifications.render(context.getMatrices(), screenWidth, screenHeight);
        }
        if (this.isTargetHudEnabled() && !HudLayoutMode.isActive()) {
            this.targetHud.render(context, screenWidth, screenHeight, delta);
        }
        if (TagsModule.INSTANCE.isEnabled()) {
            this.tags.render(context, context.getMatrices(), screenWidth, screenHeight, delta);
        }
        DragController.getInstance().renderOverlay(RenderUtil.get(), context.getMatrices());
        ScreenScale.end();
    }

    public void renderChatOverlay(DrawContext context, float delta) {
        if (this.client.world == null || this.client.player == null) {
            return;
        }

        if (RenderUtil.get() == null || !HudLayoutMode.isActive()) {
            return;
        }

        context.draw();
        ScreenScale.begin(2.0);
        DragController.getInstance().updateDragPosition();
        float screenWidth = ScreenScale.getRenderWidth();
        float screenHeight = ScreenScale.getRenderHeight();
        if (this.isTargetHudEnabled()) {
            this.targetHud.render(context, screenWidth, screenHeight, delta);
        }
        if (InterfaceModule.INSTANCE.isNotificationsEnabled() && this.notifications.shouldRenderInChatOverlay()) {
            this.notifications.render(context.getMatrices(), screenWidth, screenHeight);
        }
        DragController.getInstance().renderOverlay(RenderUtil.get(), context.getMatrices());
        ScreenScale.end();
    }

    private boolean isWatermarkEnabled() {
        return InterfaceModule.INSTANCE.isWatermarkEnabled();
    }

    private boolean isTargetHudEnabled() {
        return InterfaceModule.INSTANCE.isTargetHudEnabled();
    }
}
