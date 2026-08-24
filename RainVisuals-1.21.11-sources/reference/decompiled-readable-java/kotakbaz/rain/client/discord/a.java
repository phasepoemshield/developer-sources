/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.Click
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen
 *  net.minecraft.client.gui.screen.option.OptionsScreen
 *  net.minecraft.client.gui.screen.world.SelectWorldScreen
 *  net.minecraft.text.Text
 *  net.minecraft.util.Util
 */
package kotakbaz.rain.client.discord;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.util.List;
import kotakbaz.rain.client.render.texture.texture.GLTexture;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062a\u0648;
import oxxxde.\u0630\u062e;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u063a;
import oxxxde.\u0631\u064e;
import oxxxde.\u0634\u0633;
import oxxxde.\u0637\u0626;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u0003012B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0003J'\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\"\u0010#J'\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\"\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b%\u0010\u0003R!\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/\u00a8\u00063"}, d2={"Loxxxde/\u062c\u0630;", "Lnet/minecraft/class_437;", "<init>", "()V", "Lnet/minecraft/class_332;", "context", "", "mouseX", "mouseY", "", "delta", "", "render", "(Lnet/minecraft/class_332;IIF)V", "updateHover", "(II)V", "Lnet/minecraft/class_11909;", "event", "", "bl", "mouseClicked", "(Lnet/minecraft/class_11909;Z)Z", "openIASScreen", "isPauseScreen", "()Z", "shouldCloseOnEsc", "renderBackground", "renderMainIcon", "renderMainIconGlow", "renderWelcome", "renderButtons", "a", "b", "t", "lerp", "(IIF)F", "(FFF)F", "renderTitle", "", "Loxxxde/\u062a\u0636;", "buttons$delegate", "Lkotlin/Lazy;", "getButtons", "()Ljava/util/List;", "buttons", "", "hoverProgress", "[F", "Companion", "ButtonDef", "DesignRect", "rain-visuals"})
public final class a
extends Screen {
    @Deprecated
    public static final float MAIN_ICON_GLOW_MAX_ALPHA = 0.16f;
    @Deprecated
    public static final float TITLE_X = 906.0f;
    @Deprecated
    public static final float BUTTON_ICON_Y_OFFSET = 0.0f;
    @NotNull
    private final float[] hoverProgress;
    @Deprecated
    public static final float BACKGROUND_WIDTH = 3840.0f;
    @Deprecated
    public static final float MAIN_ICON_SIZE = 85.0f;
    @NotNull
    private static final \u062a\u0648 Companion = new \u062a\u0648(null);
    @Deprecated
    public static final float BUTTON_THIRD_Y = 654.0f;
    @Deprecated
    public static final long MAIN_ICON_GLOW_PERIOD_MS = 2400L;
    @Deprecated
    public static final float VERSION_GAP = 6.0f;
    @Deprecated
    public static final float TITLE_SIZE = 16.3f;
    @Deprecated
    public static final float MAIN_ICON_GLOW_MIN_ALPHA = 0.09f;
    @Deprecated
    public static final float BUTTON_HEIGHT = 60.0f;
    @Deprecated
    public static final float DESIGN_HEIGHT = 1080.0f;
    @Deprecated
    public static final float SPLIT_BUTTON_LEFT_X = 780.0f;
    @Deprecated
    public static final float WELCOME_TEXT_SIZE = 15.0f;
    @Deprecated
    public static final float BUTTON_ICON_RIGHT_PADDING = 19.0f;
    @Deprecated
    public static final float BUTTON_Y = 510.0f;
    @Deprecated
    public static final float BUTTON_TEXT_Y_OFFSET = -1.0f;
    @Deprecated
    public static final float TITLE_SMOOTHNESS = 0.6f;
    @Deprecated
    public static final float HOVER_SPEED = 0.12f;
    @Deprecated
    public static final float BUTTON_WIDTH = 360.0f;
    @Deprecated
    public static final float BUTTON_SECOND_Y = 582.0f;
    @Deprecated
    public static final float DESIGN_WIDTH = 1920.0f;
    @Deprecated
    public static final float BACKGROUND_HEIGHT = 2160.0f;
    @Deprecated
    public static final float WELCOME_TEXT_Y_OFFSET = 28.0f;
    @Deprecated
    public static final float MAIN_ICON_CENTER_Y = 215.0f;
    @Deprecated
    public static final float BUTTON_RADIUS = 22.0f;
    @Deprecated
    public static final float TITLE_Y = 302.0f;
    @NotNull
    private final Lazy buttons$delegate = LazyKt.lazy(() -> a.buttons_delegate$lambda$0(this));
    @Deprecated
    public static final float VERSION_SIZE = 14.0f;
    @Deprecated
    public static final float MAIN_ICON_GLOW_MIN_SCALE = 1.32f;
    @Deprecated
    public static final float SPLIT_BUTTON_RIGHT_X = 966.0f;
    @Deprecated
    public static final float BUTTON_TEXT_SIZE = 16.0f;
    @Deprecated
    public static final float MAIN_ICON_GLOW_MAX_SCALE = 1.62f;
    @Deprecated
    public static final float BUTTON_X = 780.0f;
    @Deprecated
    public static final float BUTTON_FOREGROUND_INSET = 0.75f;
    @Deprecated
    public static final float SPLIT_BUTTON_WIDTH = 174.0f;
    @Deprecated
    public static final float BUTTON_TEXT_SMOOTHNESS = 0.6f;
    @Deprecated
    public static final float SPLIT_BUTTON_Y = 726.0f;
    @Deprecated
    public static final float BUTTON_TEXT_LEFT_PADDING = 24.0f;
    @Deprecated
    public static final float BUTTON_ICON_SIZE = 19.0f;
    @Deprecated
    public static final float MAIN_ICON_LAYOUT_SCALE = 2.0f;

    private final void renderMainIconGlow() {
        GLTexture gLTexture = \u0634\u0633.INSTANCE.get("main_menu_icon_glow");
        if (gLTexture == null) {
            return;
        }
        GLTexture texture = gLTexture;
        float uniformScale = Math.min((float)this.width / 1920.0f, (float)this.height / 1080.0f);
        double phase = (double)(Util.getMeasuringTimeMs() % 2400L) / 2400.0 * Math.PI * 2.0;
        float pulse = (float)((Math.sin(phase) + 1.0) * 0.5);
        float glowScale = this.lerp(1.32f, 1.62f, pulse);
        float glowSize = 170.0f * uniformScale * glowScale;
        float glowAlpha = this.lerp(0.09f, 0.16f, pulse);
        float centerX = (float)this.width * 0.5f;
        float centerY = 215.0f * uniformScale;
        TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.GUI_RECT).texture(texture.getTexId());
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        TextureRectRenderer.draw$default(textureRectRenderer, centerX - glowSize * 0.5f, centerY - glowSize * 0.5f, glowSize, glowSize, color, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, glowAlpha, 1984, null);
    }

    private final List<RainMainMenuScreen.ButtonDef> getButtons() {
        Lazy lazy = this.buttons$delegate;
        return (List)lazy.getValue();
    }

    private final void renderBackground() {
        block2: {
            float screenAspect = (float)this.width / (float)this.height;
            float textureAspect = 1.7777778f;
            float drawWidth = 0.0f;
            float drawHeight = 0.0f;
            if (screenAspect > textureAspect) {
                drawWidth = this.width;
                drawHeight = (float)this.width / textureAspect;
            } else {
                drawWidth = (float)this.height * textureAspect;
                drawHeight = this.height;
            }
            float x = ((float)this.width - drawWidth) / 2.0f;
            float y = ((float)this.height - drawHeight) / 2.0f;
            GLTexture gLTexture = \u0634\u0633.INSTANCE.get("main_menu_background");
            if (gLTexture == null) break block2;
            GLTexture texture = gLTexture;
            boolean bl = false;
            TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.GUI_RECT).texture(texture.getTexId());
            Color color = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color, "WHITE");
            TextureRectRenderer.draw$default(textureRectRenderer, x - 2.0f, y - 2.0f, drawWidth + 4.0f, drawHeight + 4.0f, color, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 2752, null);
        }
    }

    public boolean shouldCloseOnEsc() {
        return false;
    }

    public boolean mouseClicked(@NotNull Click event, boolean bl) {
        Intrinsics.checkNotNullParameter(event, "event");
        float scaleX = (float)this.width / 1920.0f;
        float scaleY = (float)this.height / 1080.0f;
        double mouseX = event.x();
        double mouseY = event.y();
        Iterable $this$forEach$iv = this.getButtons();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            RainMainMenuScreen.ButtonDef btn = (RainMainMenuScreen.ButtonDef)element$iv;
            boolean bl2 = false;
            float x = btn.getRect().getX() * scaleX;
            float y = btn.getRect().getY() * scaleY;
            float w = btn.getRect().getWidth() * scaleX;
            float h = btn.getRect().getHeight() * scaleY;
            if (!(mouseX >= (double)x) || !(mouseX <= (double)(x + w)) || !(mouseY >= (double)y) || !(mouseY <= (double)(y + h))) continue;
            btn.getAction().invoke();
            return true;
        }
        return super.mouseClicked(event, bl);
    }

    private final void renderMainIcon() {
        float uniformScale = Math.min((float)this.width / 1920.0f, (float)this.height / 1080.0f);
        float iconSize = 170.0f * uniformScale;
        float iconY = 215.0f * uniformScale - iconSize * 0.5f;
        \u0637\u0626.enqueueA((float)this.width * 0.5f + iconSize * 0.13f, iconY, iconSize, Color.WHITE.getRGB());
    }

    private final void renderButtons() {
        float scaleX = (float)this.width / 1920.0f;
        float scaleY = (float)this.height / 1080.0f;
        float uniformScale = Math.min(scaleX, scaleY);
        float radius = 22.0f * uniformScale;
        float foregroundInset = 0.75f * uniformScale;
        float foregroundRadius = 21.25f * uniformScale;
        float textOffsetY = 21.0f;
        Iterable $this$forEachIndexed$iv = this.getButtons();
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RainMainMenuScreen.ButtonDef btn = (RainMainMenuScreen.ButtonDef)item$iv;
            int i = n;
            boolean bl = false;
            float t = this.hoverProgress[i];
            float x = btn.getRect().getX() * scaleX;
            float y = btn.getRect().getY() * scaleY;
            float bw = btn.getRect().getWidth() * scaleX;
            float bh = btn.getRect().getHeight() * scaleY;
            int bgAlpha = (int)this.lerp(26, 255, t);
            int fgR = (int)this.lerp(23.0f, 255.0f, t);
            int fgAlpha = (int)this.lerp(255, 255, t);
            Color outlineColor = new Color(255, 255, 255, bgAlpha);
            Color foregroundColor = new Color(fgR, fgR, fgR, fgAlpha);
            \u0630\u0631.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.GUI_RECT).color(outlineColor).round(radius).draw(x, y, bw, bh);
            \u0630\u0631.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.GUI_RECT).color(foregroundColor).round(foregroundRadius).draw(x + foregroundInset, y + foregroundInset, bw - foregroundInset * 2.0f, bh - foregroundInset * 2.0f);
            int contentAlpha = (int)this.lerp(64, 255, t);
            int contentR = (int)this.lerp(255, 0, t);
            Color contentColor = new Color(contentR, contentR, contentR, contentAlpha);
            float textX = (btn.getRect().getX() + 24.0f) * scaleX;
            float textY = (btn.getRect().getY() + textOffsetY) * scaleY;
            Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT), btn.getText(), textX, textY, 16.0f * uniformScale, contentColor, 0.0f, 0.6f, 0.0f, 0, 0.0f, 928, null);
            float iconSize = 19.0f * uniformScale;
            float iconRight = (btn.getRect().getX() + btn.getRect().getWidth() - 19.0f) * scaleX;
            float iconX = iconRight - Font.getWidth$default(btn.getFont(), btn.getIcon(), iconSize, 0.0f, 4, null);
            float iconY = (btn.getRect().getY() + 20.5f + 0.0f) * scaleY;
            Font.drawText$default(btn.getFont().priority(ClientRenderPipeline.GUI_TEXT), btn.getIcon(), iconX, iconY, iconSize, contentColor, 0.0f, 0.6f, 0.0f, 0, 0.0f, 928, null);
        }
    }

    private static final Unit buttons_delegate$lambda$0$3(MinecraftClient $mc, a this$0) {
        $mc.setScreen((Screen)new OptionsScreen((Screen)this$0, $mc.options));
        return Unit.INSTANCE;
    }

    private final float lerp(int a2, int b2, float t) {
        return (float)a2 + (float)(b2 - a2) * t;
    }

    private static final Unit buttons_delegate$lambda$0$4(MinecraftClient $mc) {
        $mc.scheduleStop();
        return Unit.INSTANCE;
    }

    private static final Unit buttons_delegate$lambda$0$2(a this$0) {
        this$0.openIASScreen();
        return Unit.INSTANCE;
    }

    private final void openIASScreen() {
        try {
            Class<?> iasClass = Class.forName("ru.vidtu.ias.screen.AccountScreen");
            Screen screen = new Class[1];
            screen[0] = Screen.class;
            Constructor<?> constructor = iasClass.getConstructor((Class<?>)screen);
            Object[] objectArray = new Object[1];
            objectArray[0] = this;
            Object obj = constructor.newInstance(objectArray);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type net.minecraft.client.gui.screens.Screen");
            screen = (Screen)obj;
            MinecraftClient.getInstance().setScreen(screen);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final float lerp(float a2, float b2, float t) {
        return a2 + (b2 - a2) * t;
    }

    private static final Unit buttons_delegate$lambda$0$0(MinecraftClient $mc, a this$0) {
        $mc.setScreen((Screen)new SelectWorldScreen((Screen)this$0));
        return Unit.INSTANCE;
    }

    private static final Unit buttons_delegate$lambda$0$1(MinecraftClient $mc, a this$0) {
        $mc.setScreen((Screen)new MultiplayerScreen((Screen)this$0));
        return Unit.INSTANCE;
    }

    public a() {
        super((Text)Text.literal((String)"Rain Visuals"));
        int n = 0;
        float[] fArray = new float[5];
        a a2 = this;
        while (n < 5) {
            int n2 = n++;
            fArray[n2] = 0.0f;
        }
        a2.hoverProgress = fArray;
    }

    public boolean shouldPause() {
        return false;
    }

    private final void renderWelcome() {
        float scaleX = (float)this.width / 1920.0f;
        float scaleY = (float)this.height / 1080.0f;
        float uniformScale = Math.min(scaleX, scaleY);
        float textSize = 15.0f * uniformScale;
        String fullText = "\u0414\u043e\u0431\u0440\u043e \u043f\u043e\u0436\u0430\u043b\u043e\u0432\u0430\u0442\u044c, " + \u0631\u063a.getUsername();
        float textWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), fullText, textSize, 0.0f, 4, null);
        float x = 960.0f * scaleX - textWidth / 2.0f;
        float y = 482.0f * scaleY;
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT), fullText, x, y, textSize, new Color(255, 255, 255, 160), 0.0f, 0.6f, 0.0f, 0, 0.0f, 928, null);
    }

    private final void renderTitle() {
        float scaleX = (float)this.width / 1920.0f;
        float scaleY = (float)this.height / 1080.0f;
        float uniformScale = Math.min(scaleX, scaleY);
        float x = 906.0f * scaleX;
        float y = 302.0f * scaleY;
        float titleSize = 16.3f * uniformScale;
        float versionSize = 14.0f * uniformScale;
        float versionY = y + \u0631\u064e.INSTANCE.getGS_MEDIUM().getHeight(titleSize) + 6.0f * uniformScale;
        float versionX = x + (Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), "RAIN VISUALS", titleSize, 0.0f, 4, null) - Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), "1.21.11", versionSize, 0.0f, 4, null)) * 0.5f;
        Font font = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        Font.drawText$default(font, "RAIN VISUALS", x, y, titleSize, color, 0.0f, 0.6f, 0.0f, 0, 0.0f, 928, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT), "1.21.11", versionX, versionY, versionSize, new Color(255, 255, 255, 128), 0.0f, 0.6f, 0.0f, 0, 0.0f, 928, null);
    }

    public void render(@NotNull DrawContext context, int mouseX, int mouseY, float delta) {
        Intrinsics.checkNotNullParameter(context, "context");
        \u0630\u062e.INSTANCE.ensureLoaded();
        this.updateHover(mouseX, mouseY);
        this.renderBackground();
        this.renderMainIconGlow();
        this.renderMainIcon();
        this.renderTitle();
        this.renderWelcome();
        this.renderButtons();
    }

    private static final List buttons_delegate$lambda$0(a this$0) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue(minecraftClient, "getInstance(...)");
        MinecraftClient mc = minecraftClient;
        RainMainMenuScreen.ButtonDef[] buttonDefArray = new RainMainMenuScreen.ButtonDef[5];
        buttonDefArray[0] = new RainMainMenuScreen.ButtonDef(new RainMainMenuScreen.DesignRect(780.0f, 510.0f, 360.0f, 60.0f), "\u041e\u0434\u0438\u043d\u043e\u0447\u043d\u0430\u044f \u0438\u0433\u0440\u0430", "c", \u0631\u064e.INSTANCE.getICON(), () -> a.buttons_delegate$lambda$0$0(mc, this$0));
        buttonDefArray[1] = new RainMainMenuScreen.ButtonDef(new RainMainMenuScreen.DesignRect(780.0f, 582.0f, 360.0f, 60.0f), "\u041c\u0443\u043b\u044c\u0442\u0438\u043f\u043b\u0435\u0435\u0440", "w", \u0631\u064e.INSTANCE.getICON(), () -> a.buttons_delegate$lambda$0$1(mc, this$0));
        buttonDefArray[2] = new RainMainMenuScreen.ButtonDef(new RainMainMenuScreen.DesignRect(780.0f, 654.0f, 360.0f, 60.0f), "\u0410\u043a\u043a\u0430\u0443\u043d\u0442\u044b", "X", \u0631\u064e.INSTANCE.getICON2(), () -> a.buttons_delegate$lambda$0$2(this$0));
        buttonDefArray[3] = new RainMainMenuScreen.ButtonDef(new RainMainMenuScreen.DesignRect(780.0f, 726.0f, 174.0f, 60.0f), "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438", "P", \u0631\u064e.INSTANCE.getICON2(), () -> a.buttons_delegate$lambda$0$3(mc, this$0));
        buttonDefArray[4] = new RainMainMenuScreen.ButtonDef(new RainMainMenuScreen.DesignRect(966.0f, 726.0f, 174.0f, 60.0f), "\u0412\u044b\u0439\u0442\u0438", "V", \u0631\u064e.INSTANCE.getICON2(), () -> a.buttons_delegate$lambda$0$4(mc));
        return CollectionsKt.listOf(buttonDefArray);
    }

    /*
     * Unable to fully structure code
     */
    private final void updateHover(int mouseX, int mouseY) {
        scaleX = (float)this.width / 1920.0f;
        scaleY = (float)this.height / 1080.0f;
        $this$forEachIndexed$iv = this.getButtons();
        $i$f$forEachIndexed = false;
        index$iv = 0;
        for (T item$iv : $this$forEachIndexed$iv) {
            if ((var10_10 = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            btn = (RainMainMenuScreen.ButtonDef)item$iv;
            i = var10_10;
            $i$a$-forEachIndexed-RainMainMenuScreen$updateHover$1 = false;
            x = btn.getRect().getX() * scaleX;
            y = btn.getRect().getY() * scaleY;
            w = btn.getRect().getWidth() * scaleX;
            h = btn.getRect().getHeight() * scaleY;
            if (!((float)mouseX >= x) || !((float)mouseX <= x + w)) ** GOTO lbl-1000
            if (!((float)mouseY >= y)) ** GOTO lbl-1000
            if ((float)mouseY <= y + h) {
                v0 = true;
            } else lbl-1000:
            // 3 sources

            {
                v0 = false;
            }
            hovered = v0;
            this.hoverProgress[i] = RangesKt.coerceIn(this.hoverProgress[i] + (hovered ? 0.12f : -0.12f), 0.0f, 1.0f);
        }
    }
}

