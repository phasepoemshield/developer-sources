package fun.wonderful.client.modules.impl.render;

import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;

public class Removals
extends Module {
    public static Removals INSTANCE = new Removals();
    private final BooleanSetting fire = new BooleanSetting("Огонь", false);
    private final BooleanSetting badEffects = new BooleanSetting("Плохие эффекты", false);
    private final BooleanSetting blockOverlay = new BooleanSetting("Оверлей в блоке", false);
    private final BooleanSetting particles = new BooleanSetting("Частицы", false);
    private final BooleanSetting weather = new BooleanSetting("Погода", false);
    private final BooleanSetting clouds = new BooleanSetting("Облака", false);
    private final BooleanSetting blockEntities = new BooleanSetting("Блок-сущности", false);
    private final BooleanSetting shadows = new BooleanSetting("Тени", false);
    private final BooleanSetting totemAnimation = new BooleanSetting("Анимацию тотема", false);
    private final BooleanSetting noFov = new BooleanSetting("FOV при спринте", false);
    private final ListSetting elements = new ListSetting("Элементы", this.fire, this.badEffects, this.blockOverlay, this.particles, this.weather, this.clouds, this.blockEntities, this.shadows, this.totemAnimation, this.noFov);

    public Removals() {
        super("Removals", "Убирает выбранные элементы рендера", Module.ModuleCategory.RENDER);
        this.addSettings(this.elements);
    }

    public boolean isEnabled(String element) {
        return this.isEnable() && this.elements.is(element);
    }

    public boolean isFireDisabled() {
        return this.isEnable() && this.fire.isState();
    }

    public boolean isBadEffectsDisabled() {
        return this.isEnable() && this.badEffects.isState();
    }

    public boolean isBlockOverlayDisabled() {
        return this.isEnable() && this.blockOverlay.isState();
    }

    public boolean isParticlesDisabled() {
        return this.isEnable() && this.particles.isState();
    }

    public boolean isWeatherDisabled() {
        return this.isEnable() && this.weather.isState();
    }

    public boolean isCloudsDisabled() {
        return this.isEnable() && this.clouds.isState();
    }

    public boolean isBlockEntitiesDisabled() {
        return this.isEnable() && this.blockEntities.isState();
    }

    public boolean isShadowsDisabled() {
        return this.isEnable() && this.shadows.isState();
    }

    public boolean isTotemAnimationDisabled() {
        return this.isEnable() && this.totemAnimation.isState();
    }

    public boolean isNoFovEnabled() {
        return this.isEnable() && this.noFov.isState();
    }
}