package fun.wonderful.client.modules.impl.render;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.utils.render.hands.ShaderHandsRenderer;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;

public class ShaderHands
extends Module {
    public static ShaderHands INSTANCE = new ShaderHands();
    private static final ShaderHandsRenderer RENDERER = ShaderHandsRenderer.getInstance();
    public final ModeSetting mode = new ModeSetting("Режим", "Аврора", "Аврора", "Варп");
    public final BooleanSetting outline = new BooleanSetting("Обводка", false);
    public final FloatSetting waveSpeed = new FloatSetting("Скорость волн", 1.2f, 0.1f, 5.0f, 0.1f);
    public final FloatSetting waveScale = new FloatSetting("Частота волн", 1.0f, 1.0f, 3.0f, 0.1f);
    public final FloatSetting fillAlpha = new FloatSetting("Заливка", 1.0f, 0.0f, 1.0f, 0.01f);
    public final FloatSetting fireAlpha = new FloatSetting("Сила обводки", 0.75f, 0.1f, 0.85f, 0.01f).visible(this::isOutline);
    public final FloatSetting fireSpeed = new FloatSetting("Скорость обводки", 1.2f, 0.3f, 2.5f, 0.05f).visible(this::isOutline);
    public final FloatSetting fireRadius = new FloatSetting("Радиус обводки", 9.0f, 3.0f, 12.0f, 0.5f).visible(this::isOutline);
    public final FloatSetting fireDrift = new FloatSetting("Змейка огня", 1.1f, 0.0f, 2.0f, 0.05f).visible(this::isOutline);

    public ShaderHands() {
        super("ShaderHands", "Красивый шейдер на руки и предметы", Module.ModuleCategory.RENDER);
        this.addSettings(this.mode, this.outline, this.waveSpeed, this.waveScale, this.fillAlpha, this.fireAlpha, this.fireSpeed, this.fireRadius);
    }

    public boolean isOutline() {
        return this.outline.isState();
    }

    @Override
    public void onDisable() {
        RENDERER.clearPersistentState();
        super.onDisable();
    }

    @EventLink(priority=200)
    public void onRender2D(EventRender.Default event) {
        if (!this.isEnable()) {
            return;
        }
        RENDERER.renderOverlayIfPending();
    }
}