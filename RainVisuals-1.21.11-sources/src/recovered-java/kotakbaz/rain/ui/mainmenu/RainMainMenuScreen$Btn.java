/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.render.state.GuiRenderState
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Identifier
 *  org.joml.Vector4f
 */
package kotakbaz.rain.ui.mainmenu;

import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.mixin.GameRendererAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.container.Data;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0630;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a\u064b;
import oxxxde.\u062a\u064f;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u0621;
import oxxxde.\u0631\u062d;
import oxxxde.\u0631\u064e;
import oxxxde.\u0632\u064a;
import oxxxde.\u0632\u0650;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u063a;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 S2\u00020\u0001:\u0001SB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH$\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJA\u0010\"\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\"\u0010#J7\u0010'\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R$\u0010@\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020>0B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010Q\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010OR\u0014\u0010R\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u0010O\u00a8\u0006T"}, d2={"Loxxxde/\u0632\u0643;", "Loxxxde/\u062f\u0650;", "", "name", "desc", "", "startX", "startY", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;)V", "", "Loxxxde/\u0635\u0647;", "Loxxxde/\u062a\u0650;", "getCurrentData", "()Ljava/util/Map;", "Loxxxde/\u062b\u0622;", "event", "", "renderContainer", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "x", "endX", "rowHeight", "rowTextSize", "alpha", "drawElements", "(FFFFFF)V", "rowY", "drawLeadingDivider", "(FFFF)V", "Loxxxde/\u062f\u063a;", "leading", "size", "drawLeading", "(Lkotakbaz/rain/module/modules/hud/container/Data$Leading;FFFFF)V", "Lnet/minecraft/class_2960;", "texture", "y", "drawResourceLeading", "(Lnet/minecraft/class_2960;FFFF)V", "Lnet/minecraft/class_1799;", "stack", "drawItemLeading", "(Lnet/minecraft/class_1799;FFF)V", "Lnet/minecraft/class_332;", "createItemDrawContext", "()Lnet/minecraft/class_332;", "syncData", "()V", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "Loxxxde/\u0638\u0630;", "draggable", "Loxxxde/\u0638\u0630;", "Ljava/util/ArrayList;", "Loxxxde/\u062a\u064b;", "Lkotlin/collections/ArrayList;", "activeElements", "Ljava/util/ArrayList;", "Ljava/util/LinkedHashMap;", "elementLookup", "Ljava/util/LinkedHashMap;", "Lorg/joml/Vector4f;", "headerRound", "Lorg/joml/Vector4f;", "", "syncGeneration", "I", "itemDrawContext", "Lnet/minecraft/class_332;", "Loxxxde/\u0631\u064a;", "showAnimation", "Loxxxde/\u0631\u064a;", "widthAnimation", "heightAnimation", "penisAnimation", "Companion", "rain-visuals"})
public abstract class RainMainMenuScreen$Btn
extends Module {
    @NotNull
    private final AnimationUtil heightAnimation;
    @NotNull
    private final AnimationUtil penisAnimation;
    @NotNull
    private final ArrayList<\u062a\u064b> activeElements;
    @NotNull
    private final AnimationUtil showAnimation;
    private int syncGeneration;
    @NotNull
    private final AnimationUtil widthAnimation;
    @Nullable
    private DrawContext itemDrawContext;
    @NotNull
    private final LinkedHashMap<String, \u062a\u064b> elementLookup;
    @NotNull
    private final Draggable draggable;
    @NotNull
    private final String icon;
    @NotNull
    private final Vector4f headerRound;
    @NotNull
    private static final \u0631\u062d Companion = new \u0631\u062d(null);
    @Deprecated
    public static final float TEXT_APPEAR_START = 0.72f;

    /*
     * WARNING - void declaration
     */
    private final void drawElements(float x, float endX, float startY, float rowHeight, float rowTextSize, float alpha) {
        this.itemDrawContext = null;
        float currentY = startY;
        float leadingSize = \u0637\u063a.INSTANCE.rowLeadingSize(rowTextSize);
        float leadingGap = \u0637\u063a.INSTANCE.rowLeadingGap();
        float onePx = \u0637\u063a.INSTANCE.scaled(1.0f);
        float badgeGap = \u0637\u063a.INSTANCE.scaled(3.0f);
        float badgeRound = \u0637\u063a.INSTANCE.scaled(3.0f);
        float badgeBorder = \u0637\u063a.INSTANCE.scaled(1.0f);
        int elementIndex = 0;
        while (elementIndex < this.activeElements.size()) {
            void var14_14;
            void var16_16;
            void var4_4;
            \u062a\u064b element;
            Intrinsics.checkNotNullExpressionValue(this.activeElements.get(elementIndex), "get(...)");
            float progress = element.getProgress();
            if (progress < 0.01f) {
                ++elementIndex;
                continue;
            }
            float textY = currentY + (rowHeight - rowTextSize) / 2.0f;
            float textProgress = element.getValid() ? RangesKt.coerceIn((progress - 0.72f) / 0.27999997f, 0.0f, 1.0f) : RangesKt.coerceIn(progress, 0.0f, 1.0f);
            float lineAlpha = RangesKt.coerceIn(textProgress * alpha, 0.0f, 1.0f);
            if (lineAlpha > 0.01f) {
                void var22_23;
                void var23_24;
                float textX = element.getFirst().getLeading() != null ? x + element.getCachedWidthLeading() + leadingGap : x;
                try {
                    this.drawLeading(element.getFirst().getLeading(), x, currentY + onePx, rowHeight, leadingSize, lineAlpha);
                }
                catch (RuntimeException runtimeException) {
                    // empty catch block
                }
                if (element.getFirst().getLeading() != null) {
                    this.drawLeadingDivider(x + element.getCachedWidthLeading() + (leadingGap - \u0637\u063a.INSTANCE.scaled(0.5f) - \u0637\u063a.INSTANCE.rowDividerWidth()) / 2.0f, currentY + onePx, rowHeight, lineAlpha);
                }
                \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(rowTextSize).color(\u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), lineAlpha)).drawText(element.getFirst().getText(), textX, textY);
                float gap = badgeGap;
                float textWidth = element.getCachedWidthSecond();
                float bgWidth = RangesKt.coerceAtLeast(textWidth + gap * 2.0f, textWidth + gap * 2.5f);
                float bgHeight = rowTextSize + gap * 2.0f;
                float bgX = endX - textWidth - gap * 2.0f;
                float bgY = textY - gap / 1.5f;
                \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).drawWithBorder(bgX, bgY, bgWidth, bgHeight, badgeRound, \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), lineAlpha * 0.2f), 0.9f, badgeBorder, \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), lineAlpha * 0.1f));
                \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(rowTextSize).color(\u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), lineAlpha)).drawText(element.getSecond().getText(), bgX + var23_24 / 2.0f - var22_23 / 2.0f, textY);
            }
            var7_7 += var4_4 * var16_16;
            ++var14_14;
        }
    }

    private final void drawLeadingDivider(float x, float rowY, float rowHeight, float alpha) {
        float dividerHeight = rowHeight / 2.5f;
        BlurredRectRenderer blurredRectRenderer = \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        blurredRectRenderer.color(\u0628\u062d.INSTANCE.setAlpha(color, 0.39f * alpha)).mix(0.9f).round(0.0f).draw(x, rowY + rowHeight / 2.0f - dividerHeight / 2.0f, \u0637\u063a.INSTANCE.rowDividerWidth(), dividerHeight);
    }

    /*
     * WARNING - void declaration
     */
    private final void syncData() {
        Map.Entry<Data.First, Data.Second> entry;
        int n;
        Map<Data.First, Data.Second> data = this.getCurrentData();
        RainMainMenuScreen$Btn rainMainMenuScreen$Btn = this;
        if (this.syncGeneration == Integer.MAX_VALUE) {
            RainMainMenuScreen$Btn rainMainMenuScreen$Btn2 = rainMainMenuScreen$Btn;
            for (int index = 0; index < this.activeElements.size(); ++index) {
                this.activeElements.get(index).setSeenGeneration(0);
            }
            rainMainMenuScreen$Btn = rainMainMenuScreen$Btn2;
            n = 1;
        } else {
            n = this.syncGeneration + 1;
        }
        rainMainMenuScreen$Btn.syncGeneration = n;
        Iterator<Map.Entry<Data.First, Data.Second>> index = data.entrySet().iterator();
        while (index.hasNext()) {
            void var7_10;
            entry = index.next();
            Data.First first = entry.getKey();
            Data.Second second = entry.getValue();
            String key = first.getText();
            \u062a\u064b existing = this.elementLookup.get(key);
            if (existing == null) {
                void var8_11;
                \u062a\u064b newElement = new \u062a\u064b(first, second);
                newElement.setValid(true);
                newElement.setSeenGeneration(this.syncGeneration);
                ((Collection)this.activeElements).add(newElement);
                ((Map)this.elementLookup).put(key, var8_11);
                continue;
            }
            existing.updateData(first, second);
            existing.setSeenGeneration(this.syncGeneration);
            if (existing.getValid()) continue;
            var7_10.setValid(true);
        }
        int index2 = 0;
        while (index2 < this.activeElements.size()) {
            void var2_4;
            Integer n2;
            \u062a\u064b element;
            Intrinsics.checkNotNullExpressionValue(this.activeElements.get(index2), "get(...)");
            if (element.getSeenGeneration() != this.syncGeneration) {
                element.setValid(false);
            }
            \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
            element.setProgress(element.getAnimation().animate(element.getValid() ? 1.0f : 0.0f, 80.0f, new \u0628\u0630(\u0628\u06412)));
            if (!element.getValid()) {
                if (element.getProgress() <= 0.1f) {
                    this.activeElements.remove(index2);
                    n2 = this.elementLookup.remove(((\u062a\u064b)((Object)entry)).getFirst().getText());
                    continue;
                }
            }
            n2 = (int)(++var2_4);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void drawResourceLeading(Identifier texture, float x, float y, float size, float alpha) {
        void var5_5;
        AbstractTexture abstractTexture = \u0636\u0643.getMc().getTextureManager().getTexture(texture);
        Intrinsics.checkNotNullExpressionValue(abstractTexture, "getTexture(...)");
        GpuTexture gpuTexture = \u0637\u062b.getGlTextureView(abstractTexture).texture();
        GlTexture glTexture = gpuTexture instanceof GlTexture ? (GlTexture)gpuTexture : null;
        if (glTexture == null) {
            return;
        }
        int textureId = glTexture.getGlId();
        TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        textureRectRenderer.draw(x, y, size, size, color, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, (float)var5_5);
    }

    public RainMainMenuScreen$Btn(@NotNull String name, @NotNull String desc, float startX, float startY, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(icon, "icon");
        super(name, \u0638\u0646.getHUD(), desc);
        this.icon = icon;
        this.draggable = this.draggable(name, startX, startY);
        this.activeElements = new ArrayList();
        this.elementLookup = new LinkedHashMap();
        this.headerRound = new Vector4f();
        this.showAnimation = new AnimationUtil(0.0f);
        this.widthAnimation = new AnimationUtil(0.0f);
        this.heightAnimation = new AnimationUtil(0.0f);
        this.penisAnimation = new AnimationUtil(0.0f);
    }

    private final void drawItemLeading(ItemStack stack, float x, float y, float size) {
        if (stack.isEmpty()) {
            return;
        }
        DrawContext context = this.createItemDrawContext();
        float itemScale = size / 16.0f;
        context.getMatrices().pushMatrix();
        context.getMatrices().translate(x, y);
        context.getMatrices().scale(itemScale, itemScale);
        context.drawItem(stack, 0, 0);
        context.getMatrices().popMatrix();
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    /*
     * WARNING - void declaration
     */
    protected final void renderContainer(@NotNull OverlayRenderEvent event) {
        void var21_25;
        void var20_26;
        Intrinsics.checkNotNullParameter(event, "event");
        this.syncData();
        float margin = \u0637\u063a.INSTANCE.margin();
        float headerTextSize = \u0637\u063a.INSTANCE.headerTextSize();
        float rowTextSize = \u0637\u063a.INSTANCE.rowTextSize();
        float rowGap = margin;
        float rowHeight = rowTextSize + rowGap * 1.2f;
        float headerHeight = headerTextSize + margin * 2.2f;
        float cornerRadius = \u0637\u063a.INSTANCE.scaled(6.0f);
        float headerCornerRadius = \u0637\u063a.INSTANCE.scaled(5.5f);
        boolean visible = \u0636\u0643.getMc().currentScreen instanceof ChatScreen;
        if (!visible) {
            for (int index = 0; index < this.activeElements.size(); ++index) {
                if (!(this.activeElements.get(index).getProgress() > 0.5f)) continue;
                visible = true;
                break;
            }
        }
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float alpha = this.showAnimation.animate(visible ? 1.0f : 0.0f, 80.0f, new \u0632\u0650(\u0628\u06412));
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        float penis = this.penisAnimation.animate(this.activeElements.isEmpty() ? 1.0f : 0.0f, 80.0f, new \u0632\u064a(\u0628\u06413));
        if (alpha < 0.01f && !(\u0636\u0643.getMc().currentScreen instanceof ChatScreen)) {
            this.draggable.setWidth(0.0f);
            this.draggable.setHeight(0.0f);
            return;
        }
        float maxWidth = 0.0f;
        float bodyHeight = 0.0f;
        float gapBetweenColumns = margin * 3.0f;
        for (int elementIndex = 0; elementIndex < this.activeElements.size(); ++elementIndex) {
            \u062a\u064b element;
            Intrinsics.checkNotNullExpressionValue(this.activeElements.get(elementIndex), "get(...)");
            element.updateSize(rowTextSize);
            maxWidth = Math.max(maxWidth, element.totalWidth(gapBetweenColumns));
            if (!element.getValid()) continue;
            bodyHeight += rowHeight * element.getProgress();
        }
        if (bodyHeight > 0.1f) {
            bodyHeight += margin;
        }
        float headerWidth = headerTextSize * 11.0f;
        float targetWidth = Math.max(headerWidth, maxWidth + margin);
        float targetHeight = headerHeight + bodyHeight;
        \u0628\u0641 \u0628\u06414 = \u0628\u0641.INSTANCE;
        float panelWidth = RangesKt.coerceAtLeast(this.widthAnimation.animate(targetWidth, 80.0f, new \u0631\u0621(\u0628\u06414)), headerWidth);
        \u0628\u0641 \u0628\u06415 = \u0628\u0641.INSTANCE;
        float panelHeight = RangesKt.coerceAtLeast(this.heightAnimation.animate(targetHeight, 80.0f, new \u062a\u064f(\u0628\u06415)), headerHeight);
        float x = this.draggable.getX();
        float y = this.draggable.getY();
        Color panelColor = this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), alpha);
        Color headerColor = this.withAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), alpha);
        Color titleColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), alpha);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9f).round(cornerRadius).draw(x, y, panelWidth, panelHeight);
        BlurredRectRenderer blurredRectRenderer = \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(headerColor).mix(0.9f);
        Vector4f vector4f = this.headerRound.set(headerCornerRadius, headerCornerRadius, cornerRadius * penis, cornerRadius * penis);
        Intrinsics.checkNotNullExpressionValue(vector4f, "set(...)");
        blurredRectRenderer.round(vector4f).draw(x, y, panelWidth, headerHeight);
        float headerSize = headerTextSize - \u0637\u063a.INSTANCE.scaled(1.5f);
        float centerHeaderTextY = y + (headerHeight - headerSize) / 2.0f;
        float iconWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), this.icon, headerTextSize, 0.0f, 4, null);
        float gap = margin * 1.2f;
        \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(headerSize).color(titleColor).drawText(this.getName(), x + iconWidth + gap * 1.3f, centerHeaderTextY - margin / 6.0f);
        \u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT).size(headerSize).color(titleColor).drawText(this.icon, x + gap, centerHeaderTextY);
        BlurredRectRenderer blurredRectRenderer2 = \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        blurredRectRenderer2.color(\u0628\u062d.INSTANCE.setAlpha(color, alpha)).mix(1.0f).round(\u0637\u063a.INSTANCE.scaled(0.75f)).draw(x + panelWidth - margin * 1.5f, y + margin, \u0637\u063a.INSTANCE.scaled(2.5f), \u0637\u063a.INSTANCE.scaled(2.5f));
        this.drawElements(x + gap, x + panelWidth - margin, y + headerHeight + margin / 4.0f, rowHeight, rowTextSize, alpha);
        this.draggable.setWidth((float)var20_26);
        this.draggable.setHeight((float)var21_25);
    }

    private final void drawLeading(Data.Leading leading, float x, float rowY, float rowHeight, float size, float alpha) {
        if (leading == null) {
            return;
        }
        float iconY = rowY + (rowHeight - size) / 2.0f;
        Data.Leading leading2 = leading;
        if (leading2 instanceof Data.Leading.Glyph) {
            \u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_SPECIAL).size(size).color(\u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), alpha)).drawText(((Data.Leading.Glyph)leading).getText(), x, iconY);
        } else if (leading2 instanceof Data.Leading.Texture) {
            TextureRectRenderer textureRectRenderer = \u0630\u0631.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(((Data.Leading.Texture)leading).getTextureId());
            Color color = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color, "WHITE");
            textureRectRenderer.draw(x, iconY, size, size, color, 0.0f, 0.0f, ((Data.Leading.Texture)leading).getU(), ((Data.Leading.Texture)leading).getV(), ((Data.Leading.Texture)leading).getTexW(), ((Data.Leading.Texture)leading).getTexH(), alpha);
        } else if (leading2 instanceof Data.Leading.ResourceTexture) {
            this.drawResourceLeading(((Data.Leading.ResourceTexture)leading).getTexture(), x, iconY, size, alpha);
        } else if (leading2 instanceof Data.Leading.Item) {
            this.drawItemLeading(((Data.Leading.Item)leading).getStack(), x, iconY, size);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    protected abstract Map<Data.First, Data.Second> getCurrentData();

    /*
     * WARNING - void declaration
     */
    private final DrawContext createItemDrawContext() {
        void var3_2;
        DrawContext drawContext = this.itemDrawContext;
        if (drawContext != null) {
            DrawContext it = drawContext;
            boolean bl = false;
            return it;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNull(gameRenderer, "null cannot be cast to non-null type kotakbaz.rain.mixin.GameRendererAccessor");
        GuiRenderState guiState = ((GameRendererAccessor)gameRenderer).rain$getGuiState();
        DrawContext drawContext2 = new DrawContext(\u0636\u0643.getMc(), guiState, \u0636\u0643.getMc().getWindow().getScaledWidth(), \u0636\u0643.getMc().getWindow().getScaledHeight());
        DrawContext it = drawContext2;
        boolean bl = false;
        this.itemDrawContext = var3_2;
        return drawContext2;
    }

    private final Color withAlpha(Color color, float factor) {
        return \u0628\u062d.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }
}

