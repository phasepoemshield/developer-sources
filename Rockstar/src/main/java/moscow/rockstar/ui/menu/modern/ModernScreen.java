/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.client.util.InputUtil
 */
package moscow.rockstar.ui.menu.modern;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.msdf.Fonts;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.framework.objects.MouseButton;
import moscow.rockstar.module.Module;
import moscow.rockstar.module.misc.Sounds;
import moscow.rockstar.module.visuals.Interface;
import moscow.rockstar.module.visuals.MenuModule;
import moscow.rockstar.systems.theme.Theme;
import moscow.rockstar.ui.components.ColorPicker;
import moscow.rockstar.ui.components.textfield.FieldAction;
import moscow.rockstar.ui.components.textfield.TextField;
import moscow.rockstar.ui.menu.MenuScreen;
import moscow.rockstar.ui.menu.api.MenuCategory;
import moscow.rockstar.ui.menu.dropdown.components.MenuPanel;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.BezierSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.BindSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.BooleanSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.ButtonSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.ColorSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.ModeSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.RangeSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.SliderSettingComponent;
import moscow.rockstar.ui.menu.dropdown.components.settings.impl.StringSettingComponent;
import moscow.rockstar.ui.menu.modern.components.ModernModule;
import moscow.rockstar.ui.menu.modern.components.ModernSettings;
import moscow.rockstar.ui.theme.ThemePanel;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.animation.base.Easing;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.game.cursor.CursorType;
import moscow.rockstar.util.game.cursor.CursorUtility;
import moscow.rockstar.util.gui.GuiUtility;
import moscow.rockstar.util.gui.ScrollHandler;
import moscow.rockstar.util.interfaces.IMinecraft;
import moscow.rockstar.util.interfaces.IScaledResolution;
import moscow.rockstar.util.render.DrawUtility;
import moscow.rockstar.util.render.RenderUtility;
import moscow.rockstar.util.render.ScissorUtility;
import moscow.rockstar.util.render.batching.impl.FadeOutBatching;
import moscow.rockstar.util.render.batching.impl.FontBatching;
import moscow.rockstar.util.render.batching.impl.IconBatching;
import moscow.rockstar.util.render.batching.impl.RoundedRectBatching;
import moscow.rockstar.util.render.batching.impl.SquircleBatching;
import moscow.rockstar.util.render.obj.Rect;
import moscow.rockstar.util.render.penis.PenisPlayer;
import moscow.rockstar.util.sounds.ClientSounds;
import moscow.rockstar.util.time.Timer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.InputUtil;


public class ModernScreen
        extends MenuScreen
        implements IMinecraft,
        IScaledResolution {
    private final Rect menuWindow;
    private float dragX;
    private float dragY;
    private boolean drag;
    private final ScrollHandler scrollHandler = new ScrollHandler();
    private MenuCategory current = MenuCategory.COMBAT;
    private final List<ColorPicker> colorPickers = new LinkedList<ColorPicker>();
    private final List<ModernCategory> categories = new ArrayList<ModernCategory>();
    private final List<ModernSettings> windows = new LinkedList<ModernSettings>();
    private final Animation currentCategory = new Animation(300L, Easing.BAKEK_SMALLER);
    private final TextField searchField;
    private final PenisPlayer searchPenis;
    private boolean prevFocused;
    Timer timer = new Timer();
    private final ThemePanel themePanel = new ThemePanel();

    public ModernScreen() {
        float width = 500.0f;
        float height = 343.0f;
        this.menuWindow = new Rect(sr.getScaledWidth() / 2.0f - width / 2.0f, sr.getScaledHeight() / 2.0f - height / 2.0f, width, height);
        this.categories.clear();
        for (MenuCategory category : MenuCategory.values()) {
            LinkedList<ModernModule> filteredModules = new LinkedList<ModernModule>();
            ModernCategory modern = new ModernCategory(category, filteredModules);
            try {
                modern.setPenis(new PenisPlayer(Rockstar.id("penises/" + category.getName().toLowerCase() + ".penis")));
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            this.categories.add(modern);
            filteredModules.addAll(Rockstar.getInstance().getModuleManager().getModules().stream().sorted(Comparator.comparing(Module::getName)).filter(module -> module.getCategory().equals((Object)category.getCategory())).map(module -> new ModernModule((Module)module, modern)).toList());
        }
        this.searchField = new TextField(Fonts.MEDIUM.getFont(6.0f));
        HashMap<String, FieldAction> append = new HashMap<String, FieldAction>();
        for (Module module2 : Rockstar.getInstance().getModuleManager().getModules()) {
            FieldAction action = new FieldAction(module2::toggle, () -> this.categories.forEach(panel -> panel.getModules().stream().filter(component -> component.getModule() == module2).forEach(modernModule -> System.out.println("poka pichego"))));
            append.put(module2.getName().replace(" ", ""), action);
            append.put(module2.getName(), action);
        }
        this.searchField.setAppend(append);
        this.searchField.setPreview("\u041f\u043e\u0438\u0441\u043a");
        this.searchPenis = new PenisPlayer(Rockstar.id("penises/search.penis"));
        this.searchPenis.stop();
    }


    protected void init() {
        this.closing = false;
        for (ModernCategory category : this.categories) {
            if (category.getPenis() == null) continue;
            category.getPenis().stop();
        }
        this.themePanel.onInit();
        super.init();
    }

    public void tick() {
        this.handleMovementKeys();
        super.tick();
    }

    @Override
    public void render(UIContext context) {
        this.menuAnimation.update(this.closing ? 0.0f : 1.0f);
        this.menuAnimation.setEasing(!this.closing ? Easing.BAKEK : Easing.BAKEK_BACK);
        this.menuAnimation.setDuration(400L);
        this.scrollHandler.update();
        if (this.drag) {
            this.menuWindow.setX((float)context.getMouseX() - this.dragX);
            this.menuWindow.setY((float)context.getMouseY() - this.dragY);
        }
        if (this.searchField.isFocused() && !this.prevFocused) {
            this.searchPenis.playOnce();
        }
        this.prevFocused = this.searchField.isFocused();
        float scroll = (float)(-this.scrollHandler.getValue());
        float alpha = Math.min(1.0f, this.menuAnimation.getValue());
        for (ModernCategory category : this.categories) {
            if (!((double)(category.getY() - scroll) <= -this.scrollHandler.getTargetValue()) || this.current == category.getCategory()) continue;
            this.current = category.getCategory();
        }
        boolean dark = Rockstar.getInstance().getThemeManager().getCurrentTheme() != null
                && Rockstar.getInstance().getThemeManager().getCurrentTheme().isDark();
        // ── Modern GUI: фон ВСЕГДА непрозрачный 100% ────────────────────────
        // Прозрачность не регулируется ни режимом Interface (glass/minimalism),
        // ни слайдерами темы (theme.opacity, theme.opacity.minimalism). Только
        // blur-декорация под окном остаётся, чтобы при открытии меню фон игры
        // подсвечивался размытием (внутрь панели сквозь матовый фон ничего
        // не пробивается всё равно).
        // Сила размытия из оригинальной настройки theme.blur_strength.
        float blurStr = Interface.glassBlur();
        // Сдвиг шкалы на +0.5 (как в BlurProgram): новая 0.5 ≡ старая 0.
        // Для slider < 0.5 локальный kernel линейно занижаем до нуля.
        float shiftedBlurStr = Math.max(blurStr - 0.5f, 0.0f);
        float blurKernel = 5.0f + shiftedBlurStr * 10.0f;
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)alpha);
        RenderUtility.scale(context.getMatrices(), this.menuWindow.getX() + this.menuWindow.getWidth() / 2.0f, this.menuWindow.getY() + this.menuWindow.getHeight() / 2.0f, 0.5f + 0.5f * this.menuAnimation.getValue());
        context.drawBlurredRect(this.menuWindow.getX(), this.menuWindow.getY(), this.menuWindow.getWidth(), this.menuWindow.getHeight(), blurKernel, 5.0f, BorderRadius.all(16.0f), Colors.WHITE);
        // Главное окно — однотонный фон без альфа-прозрачности.
        context.drawSquircle(this.menuWindow.getX(), this.menuWindow.getY(), this.menuWindow.getWidth(), this.menuWindow.getHeight(), 5.0f, BorderRadius.all(16.0f), dark ? Colors.getAdditionalColor() : Colors.getBackgroundColor());
        context.drawShadow(this.menuWindow.getX() + 5.0f, this.menuWindow.getY() + 5.0f, 109.0f, 333.0f, 20.0f, BorderRadius.all(14.0f), Colors.BLACK.mulAlpha(0.2f));
        context.drawBlurredRect(this.menuWindow.getX() + 5.0f, this.menuWindow.getY() + 5.0f, 109.0f, 333.0f, blurKernel, BorderRadius.all(12.0f), Colors.WHITE);
        // Внутренняя панель (категории) — тоже непрозрачная. Сохраняем
        // лёгкую разницу с главным окном через коэффициент 0.87 / 0.69
        // (как было раньше), но поверх полностью матового слоя.
        context.drawRoundedRect(this.menuWindow.getX() + 5.0f, this.menuWindow.getY() + 5.0f, 109.0f, 333.0f, BorderRadius.all(12.0f), Colors.getBackgroundColor().mulAlpha(dark ? 0.87f : 0.69f));
        float x = this.menuWindow.getX();
        float y = this.menuWindow.getY();
        float yOff = 0.0f;
        float xOff = 0.0f;
        float moduleWidth = 177.0f;
        context.drawRoundedRect(x + 13.0f, y + 13.0f, 93.0f, 14.0f, BorderRadius.all(3.0f), dark ? Colors.getAdditionalColor().mulAlpha(0.6f) : Colors.getBackgroundColor().mulAlpha(0.6f));
        DrawUtility.drawAnimationSprite(context.getMatrices(), this.searchPenis.getCurrentSprite(), x + 16.0f, y + 16.0f, 8.0f, 8.0f, Colors.getTextColor().mulAlpha(0.5f));
        this.searchField.set(x + 21.0f, y + 13.0f, 80.0f, 14.0f);
        this.searchField.setTextColor(Colors.getTextColor().mulAlpha(0.5f));
        this.searchField.render(context);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)alpha);
        FontBatching regularBatching = new FontBatching(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
        context.drawText(Fonts.REGULAR.getFont(6.0f), "\u0424\u0443\u043d\u043a\u0446\u0438\u0438", x + 14.0f, y + 35.0f, Colors.getTextColor().mulAlpha(0.3f));
        regularBatching.draw();
        for (ModernCategory modernCategory : this.categories) {
            this.currentCategory.setDuration(150L);
            this.currentCategory.setEasing(Easing.QUAD_OUT);
            if (modernCategory.getCategory() == this.current) {
                this.currentCategory.update(yOff);
            }
            if (GuiUtility.isHovered(x + 12.0f, y + 43.0f + yOff, 95.0, 16.0, context)) {
                CursorUtility.set(CursorType.HAND);
            }
            yOff += 18.0f;
        }
        context.drawSquircle(x + 12.0f, y + 43.0f + this.currentCategory.getValue(), 95.0f, 16.0f, 10.0f, BorderRadius.all(4.0f), Colors.getAccent());
        yOff = 0.0f;
        IconBatching iconBatchingCat = new IconBatching(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
        for (ModernCategory modernCategory : this.categories) {
            modernCategory.getSelected().update(modernCategory.getCategory() == this.current);
            if (modernCategory.getPenis() == null) {
                context.drawSprite(modernCategory.getCategory().getMenuSprite(), x + 18.0f, y + 47.0f + yOff, 8.0f, 8.0f, Colors.getIconsColor().mix(Colors.WHITE, modernCategory.getSelected().getValue()));
            }
            yOff += 18.0f;
        }
        iconBatchingCat.draw();
        yOff = 0.0f;
        IconBatching iconBatching = new IconBatching(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
        for (ModernCategory modernCategory : this.categories) {
            modernCategory.getSelected().update(modernCategory.getCategory() == this.current);
            if (modernCategory.getPenis() != null) {
                DrawUtility.drawAnimationSprite(context.getMatrices(), modernCategory.getPenis().getCurrentSprite(), x + 18.0f, y + 47.0f + yOff, 8.0f, 8.0f, Colors.getIconsColor().mix(Colors.WHITE, modernCategory.getSelected().getValue()));
            }
            yOff += 18.0f;
        }
        iconBatching.draw();
        yOff = 0.0f;
        FontBatching fontBatching = new FontBatching(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);
        for (ModernCategory category : this.categories) {
            context.drawText(Fonts.MEDIUM.getFont(7.0f), category.getCategory().getName(), x + 32.0f, y + 48.5f + yOff, Colors.getTextColor().mix(Colors.WHITE, category.getSelected().getValue()));
            yOff += 18.0f;
        }
        fontBatching.draw();
        float f = yOff = scroll;
        ScissorUtility.push(context.getMatrices(), this.menuWindow.getX(), this.menuWindow.getY() + 1.0f, this.menuWindow.getWidth(), this.menuWindow.getHeight() - 2.0f);
        SquircleBatching squircleBatching = new SquircleBatching(5.0f);
        for (ModernCategory modernCategory : this.categories) {
            float prev = yOff;
            modernCategory.setY(yOff);
            for (ModernModule modernModule : modernCategory.getVisibleModules()) {
                // FIX: учитываем isHidden() при обновлении анимации offset
                boolean cond = !this.opened(modernModule) && !modernModule.getModule().isHidden();
                modernModule.getVisible().update(cond);
                modernModule.getOffset().update(cond);
                if (this.visibleCheck(modernModule)) continue;
                modernModule.set(x + 127.0f + xOff, y + 33.0f + yOff, moduleWidth, 28.0f);
                if (GuiUtility.isHovered((double)x, (double)(y - modernModule.getHeight()), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + modernModule.getHeight()), modernModule.getX(), modernModule.getY())) {
                    modernModule.render(context);
                    if (GuiUtility.isHovered(modernModule.getX(), modernModule.getY(), modernModule.getWidth(), modernModule.getHeight(), context)) {
                        CursorUtility.set(CursorType.HAND);
                    }
                }
                if (!((xOff += (modernModule.getWidth() + 6.5f) * modernModule.getOffset().getValue()) > this.menuWindow.getWidth() - 139.0f)) continue;
                yOff += 34.0f * modernModule.getOffset().getValue();
                xOff = 0.0f;
            }
            if (xOff != 0.0f) {
                yOff += 34.0f;
            }
            xOff = 0.0f;
            yOff += 25.0f;
            if (modernCategory.getCategory() != MenuCategory.OTHER || !(yOff - prev < this.menuWindow.getHeight())) continue;
            yOff = prev + this.menuWindow.getHeight();
        }
        squircleBatching.draw();
        RoundedRectBatching roundBatching = new RoundedRectBatching();
        for (ModernCategory category : this.categories) {
            for (ModernModule modernModule : category.getModules()) {
                if (this.visibleCheck(modernModule) || !GuiUtility.isHovered((double)x, (double)(y - modernModule.getHeight()), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + modernModule.getHeight()), modernModule.getX(), modernModule.getY())) continue;
                modernModule.renderRounds(context);
            }
        }
        roundBatching.draw();
        RoundedRectBatching roundedRectBatching = new RoundedRectBatching();
        for (ModernCategory modernCategory : this.categories) {
            for (ModernModule module : modernCategory.getModules()) {
                if (this.visibleCheck(module) || !GuiUtility.isHovered((double)x, (double)(y - module.getHeight()), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + module.getHeight()), module.getX(), module.getY())) continue;
                module.renderInto(context);
            }
        }
        roundedRectBatching.draw();
        FontBatching mediumBatching = new FontBatching(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);
        for (ModernCategory modernCategory : this.categories) {
            for (ModernModule modernModule : modernCategory.getVisibleModules()) {
                if (this.visibleCheck(modernModule) || !GuiUtility.isHovered((double)x, (double)(y - modernModule.getHeight()), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + modernModule.getHeight()), modernModule.getX(), modernModule.getY())) continue;
                modernModule.renderMedium(context);
            }
        }
        mediumBatching.draw();
        FadeOutBatching fadeOutBatching = new FadeOutBatching(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR, 0.9f, 1.0f, moduleWidth - 30.0f, x + 127.0f);
        for (ModernCategory category : this.categories) {
            for (ModernModule modernModule : category.getModules()) {
                if (this.visibleCheck(modernModule) || !GuiUtility.isHovered((double)x, (double)(y - modernModule.getHeight()), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + modernModule.getHeight()), modernModule.getX(), modernModule.getY()) || modernModule.getX() != x + 127.0f) continue;
                modernModule.renderRegular(context);
            }
        }
        fadeOutBatching.draw();
        FadeOutBatching fadeOutBatching2 = new FadeOutBatching(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR, 0.9f, 1.0f, moduleWidth - 30.0f, x + 127.0f + moduleWidth + 6.5f);
        for (ModernCategory modernCategory : this.categories) {
            for (ModernModule modernModule : modernCategory.getVisibleModules()) {
                if (this.visibleCheck(modernModule) || !GuiUtility.isHovered((double)x, (double)(y - modernModule.getHeight()), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + modernModule.getHeight()), modernModule.getX(), modernModule.getY()) || modernModule.getX() == x + 127.0f) continue;
                modernModule.renderRegular(context);
            }
        }
        fadeOutBatching2.draw();
        FontBatching fontBatching2 = new FontBatching(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.SEMIBOLD);
        for (ModernCategory modernCategory : this.categories) {
            if (!GuiUtility.isHovered((double)x, (double)(y - 20.0f), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + 20.0f), x + 142.0f, y + 16.0f + modernCategory.getY())) continue;
            context.drawText(Fonts.SEMIBOLD.getFont(12.0f), modernCategory.getCategory().getName(), x + 143.0f, y + 16.0f + modernCategory.getY(), Rockstar.getInstance().getThemeManager().getCurrentTheme().getTextColor());
        }
        fontBatching2.draw();
        IconBatching iconBatching2 = new IconBatching(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
        for (ModernCategory modernCategory : this.categories) {
            if (!GuiUtility.isHovered((double)x, (double)(y - 20.0f), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + 20.0f), x + 142.0f, y + 16.0f + modernCategory.getY()) || modernCategory.getPenis() != null) continue;
            context.drawSprite(modernCategory.getCategory().getBigMenuSprite(), x + 129.0f, y + 15.0f + modernCategory.getY(), 10.0f, 10.0f, Colors.getIconsColor());
        }
        iconBatching2.draw();
        IconBatching iconBatching3 = new IconBatching(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
        for (ModernCategory category : this.categories) {
            if (!GuiUtility.isHovered((double)x, (double)(y - 20.0f), (double)this.menuWindow.getWidth(), (double)(this.menuWindow.getHeight() + 20.0f), x + 142.0f, y + 16.0f + category.getY()) || category.getPenis() == null) continue;
            DrawUtility.drawAnimationSprite(context.getMatrices(), category.getPenis().getCurrentSprite(), x + 129.0f, y + 15.0f + category.getY(), 10.0f, 10.0f, Colors.getIconsColor());
        }
        iconBatching3.draw();
        float f2 = yOff - f;
        float visibleHeight = this.menuWindow.getHeight() - 10.0f;
        float maxScroll = -Math.max(0.0f, f2 - visibleHeight);
        this.scrollHandler.setMax(maxScroll - 10.0f);
        ScissorUtility.pop();
        RenderUtility.end(context.getMatrices());
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        for (ModernSettings window2 : this.windows) {
            window2.render(context);
        }

        // ── ThemePanel — рендерим ДО колор-пикеров, чтобы пикеры были поверх ──
        if (this.menuAnimation.getValue() > 0.0f) {
            this.themePanel.setMenuAlpha(Math.min(1.0f, this.menuAnimation.getValue()));
            this.themePanel.render(context);
        }

        for (ColorPicker colorPicker2 : this.colorPickers) {
            colorPicker2.render(context);
        }
        this.windows.removeIf(window -> window.getAnimation().getValue() == 0.0f && !window.isShowing());
        this.colorPickers.removeIf(colorPicker -> colorPicker.getAnimation().getValue() == 0.0f && !colorPicker.isShowing());
    }


    private void handleMovementKeys() {
        KeyBinding[] movementKeys;
        if (ModernScreen.mc.player == null || this.isTyping()) {
            return;
        }
        long windowHandle = mc.getWindow().getHandle();
        for (KeyBinding key : movementKeys = new KeyBinding[]{ModernScreen.mc.options.forwardKey, ModernScreen.mc.options.backKey, ModernScreen.mc.options.leftKey, ModernScreen.mc.options.rightKey, ModernScreen.mc.options.jumpKey}) {
            int keyCode = InputUtil.fromTranslationKey((String)key.getBoundKeyTranslationKey()).getCode();
            key.setPressed(InputUtil.isKeyPressed((long)windowHandle, (int)keyCode));
        }
        if (ModernScreen.mc.player.getAbilities().flying) {
            int keyCode = InputUtil.fromTranslationKey((String)ModernScreen.mc.options.sneakKey.getBoundKeyTranslationKey()).getCode();
            ModernScreen.mc.options.sneakKey.setPressed(InputUtil.isKeyPressed((long)windowHandle, (int)keyCode));
        }
    }

    private boolean isTyping() {
        return ModernScreen.mc.currentScreen != null && TextField.LAST_FIELD != null && TextField.LAST_FIELD.isFocused();
    }

    @Override

    public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
        if (Rockstar.getInstance().getHud().getIsland().handleClick((float)mouseX, (float)mouseY, button.getButtonIndex())) {
            return;
        }
        for (ColorPicker colorPicker : this.colorPickers) {
            boolean isPick = colorPicker.isPick();
            colorPicker.onMouseClicked(mouseX, mouseY, button);
            if (colorPicker.isHovered(mouseX, mouseY) || isPick) {
                return;
            }
            colorPicker.setShowing(false);
        }

        // ── ThemePanel ─────────────────────────────────────────────────
        if (themePanel.isExpanded() && themePanel.isHovered((float) mouseX, (float) mouseY)) {
            themePanel.onMouseClicked(mouseX, mouseY, button);
            return;
        }
        themePanel.onMouseClicked(mouseX, mouseY, button);

        for (ModernSettings window : this.windows) {
            window.onMouseClicked(mouseX, mouseY, button);
            if (window.isHovered(mouseX, mouseY)) {
                return;
            }
            if (GuiUtility.isHovered(this.menuWindow, mouseX, mouseY)) continue;
            boolean can = true;
            for (ModernSettings window1 : this.windows) {
                if (!GuiUtility.isHovered(window1, mouseX, mouseY)) continue;
                can = false;
            }
            if (!can) continue;
            window.setShowing(false);
        }
        float x = this.menuWindow.getX();
        float y = this.menuWindow.getY();
        float yOff = 0.0f;
        float xOff = 0.0f;
        for (ModernCategory category : this.categories) {
            if (GuiUtility.isHovered((double)(x + 12.0f), (double)(y + 43.0f + yOff), 95.0, 16.0, mouseX, mouseY) && category.getCategory() != this.current) {
                this.scrollHandler.scroll((-this.scrollHandler.getValue() - ((double)category.getY() - this.scrollHandler.getValue())) / 20.0);
                if (category.getPenis() != null) {
                    category.getPenis().playOnce();
                }
                return;
            }
            yOff += 18.0f;
        }
        for (ModernCategory category : this.categories) {
            for (ModernModule module : category.getModules()) {
                if (this.visibleCheck(module) || !GuiUtility.isHovered(this.menuWindow, mouseX, mouseY) && (button == MouseButton.LEFT || button == MouseButton.RIGHT) || !GuiUtility.isHovered((double)module.getX(), (double)module.getY(), (double)module.getWidth(), (double)module.getHeight(), mouseX, mouseY)) continue;
                module.onMouseClicked(mouseX, mouseY, button);
                return;
            }
        }
        if (button != MouseButton.MIDDLE) {
            this.searchField.onMouseClicked(mouseX, mouseY, button);
        }
        if (GuiUtility.isHovered(this.menuWindow, mouseX, mouseY)) {
            this.drag = true;
            this.dragX = (float)(mouseX - (double)this.menuWindow.getX());
            this.dragY = (float)(mouseY - (double)this.menuWindow.getY());
        }
        super.onMouseClicked(mouseX, mouseY, button);
    }

    @Override

    public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
        this.drag = false;
        for (ModernSettings window : this.windows) {
            window.onMouseReleased(mouseX, mouseY, button);
        }
        for (ColorPicker colorPicker : this.colorPickers) {
            colorPicker.onMouseReleased(mouseX, mouseY, button);
        }
        if (this.searchField.isFocused()) {
            this.searchField.onMouseReleased(mouseX, mouseY, button);
        }
        themePanel.onMouseReleased(mouseX, mouseY, button);
        super.onMouseReleased(mouseX, mouseY, button);
    }


    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        for (ModernSettings window : this.windows) {
            window.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
        }
        themePanel.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
        if (GuiUtility.isHovered(this.menuWindow, mouseX, mouseY)) {
            this.scrollHandler.scroll(verticalAmount);
        }
        return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }


    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (!this.searchField.isFocused() && Screen.hasControlDown() && keyCode == 70) {
            this.searchField.setFocused(true);
        }
        this.scrollHandler.onKeyPressed(keyCode);
        for (ModernSettings window : this.windows) {
            window.onKeyPressed(keyCode, scanCode, modifiers);
        }
        for (ColorPicker colorPicker : this.colorPickers) {
            colorPicker.onKeyPressed(keyCode, scanCode, modifiers);
        }
        if (this.searchField.isFocused() && !this.isBindingModule()) {
            this.searchField.onKeyPressed(keyCode, scanCode, modifiers);
        }
        for (ModernCategory category : this.categories) {
            for (ModernModule module : category.getModules()) {
                if (this.visibleCheck(module)) continue;
                module.onKeyPressed(keyCode, scanCode, modifiers);
            }
        }
        themePanel.onKeyPressed(keyCode, scanCode, modifiers);
        return super.keyPressed(keyCode, scanCode, modifiers);
    }


    public boolean charTyped(char chr, int modifiers) {
        if (this.searchField.isFocused() && !this.isBindingModule()) {
            this.searchField.charTyped(chr, modifiers);
        }
        for (ModernSettings window : this.windows) {
            window.charTyped(chr, modifiers);
        }
        for (ModernCategory category : this.categories) {
            for (ModernModule module : category.getModules()) {
                if (this.visibleCheck(module)) continue;
                module.charTyped(chr, modifiers);
            }
        }
        themePanel.charTyped(chr, modifiers);
        return super.charTyped(chr, modifiers);
    }


    public void close() {
        this.closing = true;
        Rockstar.getInstance().getModuleManager().getModule(MenuModule.class).disable();
        Sounds soundsModule = Rockstar.getInstance().getModuleManager().getModule(Sounds.class);
        if (soundsModule.isEnabled()) {
            ClientSounds.CLICKGUI_OPEN.play(soundsModule.getVolume().getCurrentValue(), 1.0f);
        }
        Rockstar.getInstance().getFileManager().writeFile("client");
        if (Rockstar.getInstance().getConfigManager().getCurrent() != null) {
            Rockstar.getInstance().getConfigManager().getCurrent().save();
        }
        Rockstar.getInstance().getThemeManager().flushSave();
        if (TextField.LAST_FIELD != null) {
            TextField.LAST_FIELD.setFocused(false);
        }
        super.close();
    }

    private boolean searchCheck(ModernModule component) {
        TextField search = this.searchField;
        return search != null && !search.getBuiltText().isBlank() && !component.getModule().getName().toLowerCase().contains(search.getBuiltText().toLowerCase()) && !component.getModule().getName().replace(" ", "").toLowerCase().contains(search.getBuiltText().toLowerCase());
    }

    // FIX: добавлена проверка isHidden() — скрытые модули не занимают место в layout
    private boolean visibleCheck(ModernModule component) {
        return component.getOffset().getValue() == 0.0f
                || this.searchCheck(component)
                || component.getModule().isHidden();
    }

    private boolean opened(ModernModule component) {
        return this.windows.stream().anyMatch(window -> window.getModule() == component);
    }

    public boolean isBindingModule() {
        return this.categories.stream().flatMap(panel -> panel.getModules().stream()).anyMatch(ModernModule::isBinding);
    }

    public boolean shouldPause() {
        return false;
    }

    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
    }

    public boolean shouldCloseOnEsc() {
        return true;
    }

    @Generated
    public Rect getMenuWindow() {
        return this.menuWindow;
    }

    @Generated
    public float getDragX() {
        return this.dragX;
    }

    @Generated
    public float getDragY() {
        return this.dragY;
    }

    @Generated
    public boolean isDrag() {
        return this.drag;
    }

    @Generated
    public ScrollHandler getScrollHandler() {
        return this.scrollHandler;
    }

    @Generated
    public MenuCategory getCurrent() {
        return this.current;
    }

    @Generated
    public List<ColorPicker> getColorPickers() {
        return this.colorPickers;
    }

    @Generated
    public List<ModernCategory> getCategories() {
        return this.categories;
    }

    @Generated
    public List<ModernSettings> getWindows() {
        return this.windows;
    }

    @Generated
    public Animation getCurrentCategory() {
        return this.currentCategory;
    }

    @Generated
    public TextField getSearchField() {
        return this.searchField;
    }

    @Generated
    public PenisPlayer getSearchPenis() {
        return this.searchPenis;
    }

    @Generated
    public boolean isPrevFocused() {
        return this.prevFocused;
    }

    @Generated
    public Timer getTimer() {
        return this.timer;
    }

    static {
        new MenuPanel(null);
        new BezierSettingComponent(null, null);
        new BindSettingComponent(null, null);
        new BooleanSettingComponent(null, null);
        new ModeSettingComponent(null, null);
        new ButtonSettingComponent(null, null);
        new ColorSettingComponent(null, null);
        new StringSettingComponent(null, null);
        new RangeSettingComponent(null, null);
        new SliderSettingComponent(null, null);
    }
}
