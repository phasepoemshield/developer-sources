package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.drag.api.Vec2i;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.*;
import fun.nexisdlc.ui.HudTheme;
import fun.nexisdlc.ui.hud.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

@FunctionAdd(name = "Interface", alias = "Interface", category = Category.Render, description = "Добавляем кастомный UI-интерфейс")
public class Interface extends Function {
    private static final Logger LOGGER = LoggerFactory.getLogger(Interface.class);
    public static final String HUD_SCALE_KEY = "scale";
    public static final String HUD_ROUNDING_KEY = "rounding";

    public static ModeListSetting elements = new ModeListSetting("Элементы",
            new BooleanSetting("Активные бинды", true),
            new BooleanSetting("Забинженные предметы", true),
            new BooleanSetting("Активный таргет", true),
            new BooleanSetting("Броня", true),
            new BooleanSetting("Ватермарка", true),
            new BooleanSetting("Информация", true),
            new BooleanSetting("Медиа-плеер", false),
            new BooleanSetting("Список модерации", true),
            new BooleanSetting("Эффекты", true),
            new BooleanSetting("Нотификации", true),
            new BooleanSetting("Кд трапок и пластов", false),
            new BooleanSetting("Задержка", true),
            new BooleanSetting("Инвентарь", false),
            new BooleanSetting("Кастомный чат", false),
            new BooleanSetting("Кастомный боссбар", false),
            new BooleanSetting("Globals", true),
            new BooleanSetting(GlobalsInventoryHud.ELEMENT_NAME, false),
            new BooleanSetting(CustomActionBarHud.ELEMENT_NAME, false),
            new BooleanSetting(CustomTitleHud.ELEMENT_NAME, false),
            new BooleanSetting(CustomHeldItemTooltipHud.ELEMENT_NAME, false),
            new BooleanSetting(CustomHotbarHud.ELEMENT_NAME, false),
            new BooleanSetting(CustomHotbarHud.HEARTS_SETTING_NAME, false),
            new BooleanSetting(CustomHotbarHud.ARMOR_SETTING_NAME, false),
            new BooleanSetting(CustomHotbarHud.FOOD_SETTING_NAME, false),
            new BooleanSetting("Кастом скорборд", false)
    );

    public static SliderSetting uiScale = new SliderSetting("Увеличение", 1f, 0.5f, 2f, 0.05f);
    public static ModeSetting animationMode = new ModeSetting("Анимация", "Обычная", "Обычная", "Плавная");
    public static SliderSetting elementRounding = new SliderSetting("Скругление элементов", 1f, 0.5f, 2f, 0.05f);
    public static BooleanSetting hudEditorGrid = new BooleanSetting("Сетка", true);
    public static SliderSetting hudEditorGridSize = new SliderSetting("Шаг сетки", 12f, 4f, 32f, 1f);
    public static BooleanSetting hudEditorSnapToGrid = new BooleanSetting("Прилипание к сетке", true);
    public static SliderSetting hudEditorSnapThreshold = new SliderSetting("Порог прилипания", 10f, 2f, 20f, 1f);
    public static BooleanSetting hudEditorSmartLines = new BooleanSetting("Линии выравнивания", true);
    public static BooleanSetting hudEditorOutline = new BooleanSetting("Обводка при переносе", true);
    public static SliderSetting hudEditorOutlineThickness = new SliderSetting("Толщина обводки", 1f, 1f, 3f, 0.5f);
    public static ModeSetting hudTheme;
    public static SliderSetting rainbowSpeed;
    public static BooleanSetting defaultOutlineColor = new BooleanSetting("Свой цвет обводки", false);
    public static ColorSetting defaultOutlineColorPicker = new ColorSetting("Цвет обводки", 0xFFFFFFFF).setVisible(() -> defaultOutlineColor.get());
    public static SliderSetting defaultOutlineAlpha = new SliderSetting("Прозрачность обводки", 255f, 0f, 255f, 5f).setVisible(() -> defaultOutlineColor.get());

    final Watermark watermark;
    final Potions potions;
    final KeyBinds keyBinds;
    final InformationHud informationHud;
    final MediaPlayer mediaPlayer;
    final BoundItemsHud boundItemsHud;
    final TargetHud targetHud;
    final TargetEspMain targetEsp;
    final ArmorHud armor;
    final StaffList staffList;
    final NearbyInfo trapPlateDisplay;
    final CooldownsHud cooldownsHud;
    final InventoryHud inventoryHud;
    final GlobalsHud globalsHud;
    final GlobalsInventoryHud globalsInventoryHud;

    public Interface() {
        String[] themeNames = new String[HudTheme.values().length + 1];
        System.arraycopy(HudTheme.names(), 0, themeNames, 0, HudTheme.values().length);
        themeNames[HudTheme.values().length] = "RAINBOW";
        hudTheme = new ModeSetting("Тема", "MIDNIGHT", themeNames);
        rainbowSpeed = new SliderSetting("Rainbow Speed", 1.0f, 0.1f, 5.0f, 0.1f).setVisible(() -> "RAINBOW".equals(hudTheme.get()));

        super.addSettings(
                elements, uiScale, elementRounding, animationMode,
                defaultOutlineColor, defaultOutlineColorPicker, defaultOutlineAlpha,
                hudEditorGrid, hudEditorGridSize,
                hudEditorSnapToGrid, hudEditorSnapThreshold,
                hudEditorSmartLines, hudEditorOutline, hudEditorOutlineThickness,
                rainbowSpeed
        );

        HudTheme.snapCurrent(HudTheme.byName(hudTheme.get()));

        Vec2i initPos = new Vec2i(10, 10);
        Dragging watermark = ClientContainer.getNexisInstance().createDrag(this, "Watermark", initPos.getX(), initPos.getY());
        Dragging potions = ClientContainer.getNexisInstance().createDrag(this, "Potions", initPos.getX(), initPos.getY());
        Dragging armor = ClientContainer.getNexisInstance().createDrag(this, "Armor", initPos.getX(), initPos.getY());
        Dragging keyBinds = ClientContainer.getNexisInstance().createDrag(this, "KeyBinds", initPos.getX(), initPos.getY());
        Dragging information = ClientContainer.getNexisInstance().createDrag(this, "Information", initPos.getX(), initPos.getY());
        Dragging boundItems = ClientContainer.getNexisInstance().createDrag(this, "BoundItems", initPos.getX(), initPos.getY());
        Dragging targetHud = ClientContainer.getNexisInstance().createDrag(this, "TargetHud", initPos.getX(), initPos.getY());
        Dragging staffList = ClientContainer.getNexisInstance().createDrag(this, "StaffList", initPos.getX(), initPos.getY());
        Dragging mediaPlayer = ClientContainer.getNexisInstance().createDrag(this, "MediaPlayer", initPos.getX(), initPos.getY());
        Dragging notifications = ClientContainer.getNexisInstance().createDrag(this, Notifications.SETTINGS_SCOPE, initPos.getX(), initPos.getY());
        Dragging trapPlateDisplay = ClientContainer.getNexisInstance().createDrag(this, NearbyInfo.SETTINGS_SCOPE, initPos.getX(), initPos.getY());
        Dragging cooldownsHud = ClientContainer.getNexisInstance().createDrag(this, CooldownsHud.SETTINGS_SCOPE, initPos.getX(), initPos.getY());
        Dragging inventoryHud = ClientContainer.getNexisInstance().createDrag(this, InventoryHud.SETTINGS_SCOPE, initPos.getX(), initPos.getY());
        Dragging globalsHud = ClientContainer.getNexisInstance().createDrag(this, GlobalsHud.SETTINGS_SCOPE, initPos.getX(), initPos.getY());
        Dragging globalsInventoryHud = ClientContainer.getNexisInstance().createDrag(this, GlobalsInventoryHud.SETTINGS_SCOPE, initPos.getX(), initPos.getY());

        this.potions = new Potions(potions);
        this.keyBinds = new KeyBinds(keyBinds);
        this.informationHud = new InformationHud(information);
        this.boundItemsHud = new BoundItemsHud(boundItems);
        this.staffList = new StaffList(staffList);
        this.armor = new ArmorHud(armor);
        this.targetHud = new TargetHud(targetHud);
        this.mediaPlayer = new MediaPlayer(mediaPlayer);
        this.targetEsp = new TargetEspMain();
        this.watermark = new Watermark(watermark);
        this.trapPlateDisplay = new NearbyInfo(trapPlateDisplay);
        this.cooldownsHud = new CooldownsHud(cooldownsHud);
        this.inventoryHud = new InventoryHud(inventoryHud);
        this.globalsHud = new GlobalsHud(globalsHud);
        this.globalsInventoryHud = new GlobalsInventoryHud(globalsInventoryHud);
        Nexis.getEventBus().subscribe(new MediaPlayer(mediaPlayer));
        DraggingManager.load();

        setState(true);
    }

    @EventHandler
    public void onTick(UpdateEvent e) {
        String selected = hudTheme.get();
        HudTheme target = HudTheme.byName(selected);
        if (HudTheme.getCurrent() != target) {
            HudTheme.setCurrent(target);
        }
        HudTheme.setRainbow("RAINBOW".equals(selected), rainbowSpeed.get());
    }

    @EventHandler
    public void onRender(EventRender.Screen.Hud event) {
        if (mc.world == null) {
            return;
        }

        // event.getRenderer().text(FontRegistry.NEXIS_HUD, 100, 100, 40, "ABCDEFGHIJKLMNOP", ClientColors.TEXT.getRGB());



        /*
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS, 100, 100, 24, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", ClientColors.TEXT.getRGB());
        event.getRenderer().text(FontRegistry.WEXSIDE_MENU_ICONS,
                100,
                150,
                24,
                "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя",
                ClientColors.TEXT.getRGB());

         */


        renderHudElement(event, Watermark.SETTINGS_SCOPE, elements.getByName("Ватермарка").get(), () -> watermark.render(event));
        renderHudElement(event, "Information", elements.getByName("Информация").get(), () -> informationHud.render(event));
        renderHudElement(event, TargetHud.SETTINGS_SCOPE, elements.getByName("Активный таргет").get(), () -> targetHud.render(event));
        renderHudElement(event, KeyBinds.SETTINGS_SCOPE, elements.getByName("Активные бинды").get(), () -> keyBinds.render(event));
        renderHudElement(event, MediaPlayer.SETTINGS_SCOPE, elements.getByName("Медиа-плеер").get(), () -> mediaPlayer.render(event));
        renderHudElement(event, "BoundItems", elements.getByName("Забинженные предметы").get(), () -> boundItemsHud.render(event));
        renderHudElement(event, Potions.SETTINGS_SCOPE, elements.getByName("Эффекты").get(), () -> potions.render(event));
        renderHudElement(event, StaffList.SETTINGS_SCOPE, elements.getByName("Список модерации").get(), () -> staffList.render(event));
        renderHudElement(event, "Armor", elements.getByName("Броня").get(), () -> armor.render(event));
        renderHudElement(event, NearbyInfo.SETTINGS_SCOPE, elements.getByName("Кд трапок и пластов").get(), () -> trapPlateDisplay.render(event));
        renderHudElement(event, CooldownsHud.SETTINGS_SCOPE, elements.getByName("Задержка").get(), () -> cooldownsHud.render(event));
        renderHudElement(event, InventoryHud.SETTINGS_SCOPE, elements.getByName("Инвентарь").get(), () -> inventoryHud.render(event));
        renderHudElement(event, GlobalsHud.SETTINGS_SCOPE, elements.getByName("Globals").get(), () -> globalsHud.render(event));
        renderHudElement(event, GlobalsInventoryHud.SETTINGS_SCOPE, elements.getByName(GlobalsInventoryHud.ELEMENT_NAME).get(), () -> globalsInventoryHud.render(event));
        renderHudElement(event, CustomHotbarHud.ELEMENT_NAME, CustomHotbarHud.shouldUseCustomHotbar(), () -> CustomHotbarHud.render(event));
        CustomActionBarHud.render(event);
        CustomHeldItemTooltipHud.render(event);
        CustomTitleHud.render(event);
        CustomBossBarHud.render(event);
    }

    private static void renderHudElement(EventRender.Screen.Hud event, String scope, boolean enabled, Runnable renderAction) {
        if (!enabled) {
            return;
        }
        float scale = getHudScale(scope);
        event.getRenderer().pushScale(scale);
        try {
            try {
                renderAction.run();
            } catch (Throwable throwable) {
                LOGGER.error("HUD element '{}' render failed", scope, throwable);
            }
        } finally {
            event.getRenderer().popScale();
        }
    }

    @EventHandler
    public void onRenderWorld(EventRender.World event) {
        if (mc.world == null) {
            return;
        }
        targetEsp.renderWorld(event);
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static float getInterfaceScale() {
        if (uiScale == null) {
            return 1f;
        }
        float value = uiScale.get().floatValue();
        if (!Float.isFinite(value) || value <= 0f) {
            return 1f;
        }
        return value;
    }

    public static float getHudScale(String scope) {
        float fallback = getInterfaceScale();
        if (scope == null || scope.isBlank()) {
            return fallback;
        }
        float value = DraggingManager.getHudFloat(scope, HUD_SCALE_KEY, fallback);
        if (!Float.isFinite(value) || value <= 0f) {
            return fallback;
        }
        return value;
    }

    public static float scalePos(float value) {
        float scale = getInterfaceScale();
        if (!Float.isFinite(scale) || scale <= 0f) {
            return value;
        }
        return value / scale;
    }

    public static float scalePos(String scope, float value) {
        float scale = getHudScale(scope);
        if (!Float.isFinite(scale) || scale <= 0f) {
            return value;
        }
        return value / scale;
    }

    public static float getHudRoundingScale() {
        if (elementRounding == null) {
            return 1f;
        }
        float value = elementRounding.get().floatValue();
        if (!Float.isFinite(value) || value <= 0f) {
            return 1f;
        }
        return value;
    }

    public static float getHudRoundingScale(String scope) {
        float fallback = getHudRoundingScale();
        if (scope == null || scope.isBlank()) {
            return fallback;
        }
        float value = DraggingManager.getHudFloat(scope, HUD_ROUNDING_KEY, fallback);
        if (!Float.isFinite(value) || value <= 0f) {
            return fallback;
        }
        return value;
    }

    public static float getHudRounding(float baseRounding) {
        if (!Float.isFinite(baseRounding) || baseRounding <= 0f) {
            return 0f;
        }
        return baseRounding * getHudRoundingScale();
    }

    public static float getHudRounding(String scope, float baseRounding) {
        if (!Float.isFinite(baseRounding) || baseRounding <= 0f) {
            return 0f;
        }
        return baseRounding * getHudRoundingScale(scope);
    }

    public static int getHudRoundedInt(float baseRounding) {
        return Math.max(0, Math.round(getHudRounding(baseRounding)));
    }

    public static int getHudRoundedInt(String scope, float baseRounding) {
        return Math.max(0, Math.round(getHudRounding(scope, baseRounding)));
    }

    public static boolean isHudEditorGridEnabled() {
        return hudEditorGrid != null && hudEditorGrid.get();
    }

    public static float getHudEditorGridSize() {
        if (hudEditorGridSize == null) {
            return 12f;
        }
        float value = hudEditorGridSize.get().floatValue();
        if (!Float.isFinite(value) || value < 1f) {
            return 12f;
        }
        return value;
    }

    public static boolean isHudEditorSnapToGridEnabled() {
        return hudEditorSnapToGrid != null && hudEditorSnapToGrid.get();
    }

    public static float getHudEditorSnapThreshold() {
        if (hudEditorSnapThreshold == null) {
            return 10f;
        }
        float value = hudEditorSnapThreshold.get().floatValue();
        if (!Float.isFinite(value) || value < 0f) {
            return 10f;
        }
        return value;
    }

    public static boolean isHudEditorSmartLinesEnabled() {
        return hudEditorSmartLines != null && hudEditorSmartLines.get();
    }

    public static boolean isHudEditorOutlineEnabled() {
        return hudEditorOutline != null && hudEditorOutline.get();
    }

    public static float getHudEditorOutlineThickness() {
        if (hudEditorOutlineThickness == null) {
            return 1.5f;
        }
        float value = hudEditorOutlineThickness.get().floatValue();
        if (!Float.isFinite(value) || value <= 0f) {
            return 1.5f;
        }
        return value;
    }

    public static boolean isBounceAnimation() {
        return animationMode != null && animationMode.is("Bounce");
    }

    public static int getAlphaDurationMs() {
        return 250;
    }

    public static int getScaleDurationMs() {
        if (isBounceAnimation()) {
            return 400;
        }
        if (animationMode != null && animationMode.is("Плавная")) {
            return 350;
        }
        return 350;
    }

    public static float animatedScale(float startScale, float progress) {
        return animatedScale(startScale, progress, false);
    }

    public static float animatedScale(float startScale, float progress, boolean hiding) {
        float alphaDuration = getAlphaDurationMs();
        float scaleDuration = getScaleDurationMs();
        float scaleProgress = progress;
        if (scaleDuration > 0f && alphaDuration > 0f) {
            scaleProgress = Math.min(1f, progress * (alphaDuration / scaleDuration));
        }
        float t = Math.max(0f, Math.min(1f, scaleProgress));
        t = t * t * (3f - 2f * t);
        t = 1f - (float) Math.pow(1f - t, 2f);
        if (animationMode != null && animationMode.is("Плавная")) {
            return 1f;
        }
        if (!isBounceAnimation()) {
            return startScale + (1f - startScale) * t;
        }

        float back = hiding ? (1f - backIn(1f - t)) : backOut(t);
        return startScale + (1f - startScale) * back;
    }

    private static float backIn(float value) {
        float bounceOvershootFactor = 1.1f;
        float s = 1.70158f * Math.max(0f, bounceOvershootFactor);
        return (s + 1f) * value * value * value - s * value * value;
    }

    private static float backOut(float value) {
        float bounceOvershootFactor = 1.1f;
        float v = value - 1f;
        float s = 1.70158f * Math.max(0f, bounceOvershootFactor);
        return 1f + (s + 1f) * v * v * v + s * v * v;
    }

    public static boolean isDefaultOutlineColorEnabled() {
        return defaultOutlineColor != null && defaultOutlineColor.get();
    }

    public static int[] getDefaultOutlineGlowColors(float alphaProgress) {
        if (defaultOutlineColorPicker == null || defaultOutlineAlpha == null) {
            return new int[4];
        }
        Color c = defaultOutlineColorPicker.getColor();
        int a = Math.round(alphaProgress * defaultOutlineAlpha.get().floatValue());
        int argb = (a << 24) | (c.getRGB() & 0x00FFFFFF);
        return new int[]{argb, argb, argb, argb};
    }
}

