/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.hud.container;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotakbaz.rain.client.draggable.c;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.animations.Easings;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.mixin.GameRendererAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.container.A;
import kotakbaz.rain.module.modules.hud.container.B;
import kotakbaz.rain.module.modules.hud.container.C;
import kotakbaz.rain.module.modules.hud.container.Element;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotakbaz.rain.module.modules.hud.container.a;
import kotakbaz.rain.module.modules.hud.container.a_0;
import kotakbaz.rain.module.modules.hud.container.b;
import kotakbaz.rain.module.modules.hud.container.b_0;
import kotakbaz.rain.module.modules.hud.container.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import org.joml.Vector4f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 P2\u00020\u0001:\u0001PB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH$\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001f\u0010 JA\u0010$\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b$\u0010%J/\u0010)\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002\u00a2\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R$\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u00020;j\b\u0012\u0004\u0012\u00020\u0002`<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020@0?j\b\u0012\u0004\u0012\u00020@`A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020@0D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010L\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bL\u0010IR\u001c\u0010N\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bN\u0010O\u00a8\u0006Q"}, d2={"Lkotakbaz/rain/module/modules/hud/container/HudModule;", "Lkotakbaz/rain/module/Module;", "", "name", "desc", "", "startX", "startY", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;)V", "", "Lkotakbaz/rain/module/modules/hud/container/Data$First;", "Lkotakbaz/rain/module/modules/hud/container/Data$Second;", "getCurrentData", "()Ljava/util/Map;", "Lkotakbaz/rain/event/events/OverlayRenderEvent;", "event", "", "renderContainer", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "x", "endX", "rowHeight", "rowTextSize", "panelY", "panelHeight", "alpha", "drawElements", "(FFFFFFFF)V", "rowY", "drawLeadingDivider", "(FFFF)V", "Lkotakbaz/rain/module/modules/hud/container/Data$Leading;", "leading", "size", "drawLeading", "(Lkotakbaz/rain/module/modules/hud/container/Data$Leading;FFFFF)V", "Lnet/minecraft/class_1799;", "stack", "y", "drawItemLeading", "(Lnet/minecraft/class_1799;FFF)V", "Lnet/minecraft/class_332;", "createItemDrawContext", "()Lnet/minecraft/class_332;", "syncData", "()V", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "Lkotakbaz/rain/client/draggable/Draggable;", "draggable", "Lkotakbaz/rain/client/draggable/Draggable;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "currentFrameKeys", "Ljava/util/HashSet;", "Ljava/util/ArrayList;", "Lkotakbaz/rain/module/modules/hud/container/Element;", "Lkotlin/collections/ArrayList;", "activeElements", "Ljava/util/ArrayList;", "Ljava/util/LinkedHashMap;", "elementLookup", "Ljava/util/LinkedHashMap;", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "showAnimation", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "widthAnimation", "heightAnimation", "penisAnimation", "Ljava/lang/reflect/Constructor;", "isolatedDrawContextConstructor", "Ljava/lang/reflect/Constructor;", "Companion", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nHudModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HudModule.kt\nkotakbaz/rain/module/modules/hud/container/HudModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n1807#2,3:376\n*S KotlinDebug\n*F\n+ 1 HudModule.kt\nkotakbaz/rain/module/modules/hud/container/HudModule\n*L\n75#1:376,3\n*E\n"})
public abstract class HudModule
extends Module {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @NotNull
    private final String icon;
    @NotNull
    private final c draggable;
    @NotNull
    private final HashSet<String> currentFrameKeys;
    @NotNull
    private final ArrayList<Element> activeElements;
    @NotNull
    private final LinkedHashMap<String, Element> elementLookup;
    @NotNull
    private final AnimationUtil showAnimation;
    @NotNull
    private final AnimationUtil widthAnimation;
    @NotNull
    private final AnimationUtil heightAnimation;
    @NotNull
    private final AnimationUtil penisAnimation;
    @Nullable
    private final Constructor<DrawContext> isolatedDrawContextConstructor;
    @Deprecated
    public static final float TEXT_APPEAR_START = 0.72f;

    public HudModule(@NotNull String name, @NotNull String desc, float startX, float startY, @NotNull String icon) {
        Object object;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(icon, "icon");
        super(name, kotakbaz.rain.client.extensions.a_0.getHUD(), desc);
        this.icon = icon;
        this.draggable = this.draggable(name, startX, startY);
        this.currentFrameKeys = new HashSet();
        this.activeElements = new ArrayList();
        this.elementLookup = new LinkedHashMap();
        this.showAnimation = new AnimationUtil(0.0f);
        this.widthAnimation = new AnimationUtil(0.0f);
        this.heightAnimation = new AnimationUtil(0.0f);
        this.penisAnimation = new AnimationUtil(0.0f);
        HudModule hudModule = this;
        HudModule hudModule2 = this;
        boolean bl = false;
        try {
            object = new Class[]{MinecraftClient.class, Matrix3x2fStack.class, GuiRenderState.class};
            Object $this$isolatedDrawContextConstructor_u24lambda_u240_u240 = object = DrawContext.class.getDeclaredConstructor((Class<?>)object);
            boolean bl2 = false;
            ((Constructor)$this$isolatedDrawContextConstructor_u24lambda_u240_u240).setAccessible(true);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            object = null;
        }
        hudModule2.isolatedDrawContextConstructor = object;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    protected abstract Map<b_0, d> getCurrentData();

    protected final void renderContainer(@NotNull OverlayRenderEvent event) {
        boolean bl;
        float headerCornerRadius;
        float cornerRadius;
        float headerHeight;
        float rowHeight;
        float rowTextSize;
        float headerTextSize;
        float margin;
        block6: {
            Intrinsics.checkNotNullParameter(event, "event");
            this.syncData();
            margin = HudStyle.INSTANCE.margin();
            headerTextSize = HudStyle.INSTANCE.headerTextSize();
            rowTextSize = HudStyle.INSTANCE.rowTextSize();
            float rowGap = margin;
            rowHeight = rowTextSize + rowGap * 1.2f;
            headerHeight = headerTextSize + margin * 2.2f;
            cornerRadius = HudStyle.INSTANCE.scaled(6.0f);
            headerCornerRadius = HudStyle.INSTANCE.scaled(5.5f);
            Iterable $this$any$iv = this.activeElements;
            boolean $i$f$any = false;
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                bl = false;
            } else {
                for (Object element$iv : $this$any$iv) {
                    Element it = (Element)element$iv;
                    boolean bl2 = false;
                    if (!(it.getProgress() > 0.5f)) continue;
                    bl = true;
                    break block6;
                }
                bl = false;
            }
        }
        boolean visible = bl || kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen;
        float alpha2 = this.showAnimation.animate(visible ? 1.0f : 0.0f, 80.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardAccelerate(p0));
            }
        });
        float penis2 = this.penisAnimation.animate(this.activeElements.isEmpty() ? 1.0f : 0.0f, 80.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardAccelerate(p0));
            }
        });
        if (alpha2 < 0.01f && !(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen)) {
            this.draggable.setWidth(0.0f);
            this.draggable.setHeight(0.0f);
            return;
        }
        float maxWidth = 0.0f;
        float bodyHeight = 0.0f;
        float gapBetweenColumns = margin * 3.0f;
        Iterator<Element> iterator2 = this.activeElements.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator2, "iterator(...)");
        Iterator<Element> bl2 = iterator2;
        while (bl2.hasNext()) {
            Element element;
            Intrinsics.checkNotNullExpressionValue(bl2.next(), "next(...)");
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
        float panelWidth2 = RangesKt.coerceAtLeast(this.widthAnimation.animate(targetWidth, 80.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardAccelerate(p0));
            }
        }), headerWidth);
        float panelHeight2 = RangesKt.coerceAtLeast(this.heightAnimation.animate(targetHeight, 80.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){

            public final Float invoke(float p0) {
                return Float.valueOf(((Easings)this.receiver).standardAccelerate(p0));
            }
        }), headerHeight);
        float x2 = this.draggable.getX();
        float y = this.draggable.getY();
        Color panelColor = this.withAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), alpha2);
        Color headerColor = this.withAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), alpha2);
        Color titleColor = this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), alpha2);
        Color iconColor = this.withAlpha(HudStyle.INSTANCE.getICON_COLOR(), alpha2);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9f).round(cornerRadius).draw(x2, y, panelWidth2, panelHeight2);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(headerColor).mix(0.9f).round(new Vector4f(headerCornerRadius, headerCornerRadius, cornerRadius * penis2, cornerRadius * penis2)).draw(x2, y, panelWidth2, headerHeight);
        float headerSize = headerTextSize - HudStyle.INSTANCE.scaled(1.5f);
        float centerHeaderTextY = y + (headerHeight - headerSize) / 2.0f;
        float iconWidth = E.getWidth$default(Font.INSTANCE.getICON(), this.icon, headerTextSize, 0.0f, 4, null);
        float gap = margin * 1.2f;
        Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(headerSize).color(titleColor).drawText(this.getName(), x2 + iconWidth + gap * 1.3f, centerHeaderTextY - margin / 6.0f);
        Font.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT).size(headerSize).color(titleColor).drawText(this.icon, x2 + gap, centerHeaderTextY);
        BlurredRectRenderer blurredRectRenderer = RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        blurredRectRenderer.color(ColorUtil.INSTANCE.setAlpha(color, alpha2)).mix(1.0f).round(HudStyle.INSTANCE.scaled(0.75f)).draw(x2 + panelWidth2 - margin * 1.5f, y + margin, HudStyle.INSTANCE.scaled(2.5f), HudStyle.INSTANCE.scaled(2.5f));
        this.drawElements(x2 + gap, x2 + panelWidth2 - margin, y + headerHeight + margin / 4.0f, rowHeight, rowTextSize, y, panelHeight2, alpha2);
        this.draggable.setWidth(panelWidth2);
        this.draggable.setHeight(panelHeight2);
    }

    private final void drawElements(float x2, float endX, float startY, float rowHeight, float rowTextSize, float panelY, float panelHeight2, float alpha2) {
        float currentY = startY;
        float leadingSize = HudStyle.INSTANCE.rowLeadingSize(rowTextSize);
        float leadingGap = HudStyle.INSTANCE.rowLeadingGap();
        float onePx = HudStyle.INSTANCE.scaled(1.0f);
        float badgeGap = HudStyle.INSTANCE.scaled(3.0f);
        float badgeRound = HudStyle.INSTANCE.scaled(3.0f);
        float badgeBorder = HudStyle.INSTANCE.scaled(1.0f);
        Iterator<Element> iterator2 = this.activeElements.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator2, "iterator(...)");
        Iterator<Element> iterator3 = iterator2;
        while (iterator3.hasNext()) {
            Element element;
            Intrinsics.checkNotNullExpressionValue(iterator3.next(), "next(...)");
            float progress2 = element.getProgress();
            if (progress2 < 0.01f) continue;
            float textY = currentY + (rowHeight - rowTextSize) / 2.0f;
            float textProgress = element.getValid() ? RangesKt.coerceIn((progress2 - 0.72f) / 0.27999997f, 0.0f, 1.0f) : RangesKt.coerceIn(progress2, 0.0f, 1.0f);
            float lineAlpha = RangesKt.coerceIn(textProgress * alpha2, 0.0f, 1.0f);
            if (lineAlpha > 0.01f) {
                float textX = element.getFirst().getLeading() != null ? x2 + element.getCachedWidthLeading() + leadingGap : x2;
                this.drawLeading(element.getFirst().getLeading(), x2, currentY + onePx, rowHeight, leadingSize, lineAlpha);
                if (element.getFirst().getLeading() != null) {
                    this.drawLeadingDivider(x2 + element.getCachedWidthLeading() + (leadingGap - HudStyle.INSTANCE.scaled(0.5f) - HudStyle.INSTANCE.rowDividerWidth()) / 2.0f, currentY + onePx, rowHeight, lineAlpha);
                }
                Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(rowTextSize).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), lineAlpha)).drawText(element.getFirst().getText(), textX, textY);
                float gap = badgeGap;
                float textWidth = element.getCachedWidthSecond();
                float bgWidth = RangesKt.coerceAtLeast(textWidth + gap * 2.0f, textWidth + gap * 2.5f);
                float bgHeight = rowTextSize + gap * 2.0f;
                float bgX = endX - textWidth - gap * 2.0f;
                float bgY = textY - gap / 1.5f;
                RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).drawWithBorder(bgX, bgY, bgWidth, bgHeight, badgeRound, ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), lineAlpha * 0.2f), 0.9f, badgeBorder, ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), lineAlpha * 0.1f));
                Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(rowTextSize).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), lineAlpha)).drawText(element.getSecond().getText(), bgX + bgWidth / 2.0f - textWidth / 2.0f, textY);
            }
            currentY += rowHeight * progress2;
        }
    }

    private final void drawLeadingDivider(float x2, float rowY, float rowHeight, float alpha2) {
        float dividerHeight = rowHeight / 2.5f;
        BlurredRectRenderer blurredRectRenderer = RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        blurredRectRenderer.color(ColorUtil.INSTANCE.setAlpha(color, 0.39f * alpha2)).mix(0.9f).round(0.0f).draw(x2, rowY + rowHeight / 2.0f - dividerHeight / 2.0f, HudStyle.INSTANCE.rowDividerWidth(), dividerHeight);
    }

    private final void drawLeading(B leading, float x2, float rowY, float rowHeight, float size, float alpha2) {
        if (leading == null) {
            return;
        }
        float iconY = rowY + (rowHeight - size) / 2.0f;
        B b2 = leading;
        if (b2 instanceof A) {
            Font.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_SPECIAL).size(size).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), alpha2)).drawText(((A)leading).getText(), x2, iconY);
        } else if (b2 instanceof a) {
            TextureRectRenderer textureRectRenderer = RenderUtils.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(((a_0)((a)leading)).getTextureId());
            Color color = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color, "WHITE");
            textureRectRenderer.draw(x2, iconY, size, size, color, 0.0f, 0.0f, ((a_0)((a)leading)).getU(), ((a_0)((a)leading)).getV(), ((a_0)((a)leading)).getTexW(), ((a_0)((a)leading)).getTexH(), alpha2);
        } else if (b2 instanceof C) {
            this.drawItemLeading(((C)leading).getStack(), x2, iconY, size);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void drawItemLeading(ItemStack stack, float x2, float y, float size) {
        if (stack.isEmpty()) {
            return;
        }
        DrawContext context = this.createItemDrawContext();
        float itemScale = size / 16.0f;
        context.getMatrices().pushMatrix();
        context.getMatrices().translate(x2, y);
        context.getMatrices().scale(itemScale, itemScale);
        context.drawItem(stack, 0, 0);
        context.getMatrices().popMatrix();
    }

    private final DrawContext createItemDrawContext() {
        Matrix3x2fStack matrices = new Matrix3x2fStack(8);
        GameRenderer gameRenderer = kotakbaz.rain.client.extensions.b.getMc().gameRenderer;
        Intrinsics.checkNotNull(gameRenderer, "null cannot be cast to non-null type kotakbaz.rain.mixin.GameRendererAccessor");
        GuiRenderState guiState = ((GameRendererAccessor)gameRenderer).rain$getGuiState();
        Constructor<DrawContext> constructor = this.isolatedDrawContextConstructor;
        if (constructor == null) {
            boolean bl = false;
            String string = "Failed to access DrawContext constructor for HUD items";
            throw new IllegalStateException(string.toString());
        }
        Object[] objectArray = new Object[]{kotakbaz.rain.client.extensions.b.getMc(), matrices, guiState};
        DrawContext drawContext = constructor.newInstance(objectArray);
        Intrinsics.checkNotNullExpressionValue(drawContext, "newInstance(...)");
        return drawContext;
    }

    private final void syncData() {
        Map<b_0, d> data = this.getCurrentData();
        this.currentFrameKeys.clear();
        for (Map.Entry<b_0, d> entry : data.entrySet()) {
            b first = (b)entry.getKey();
            d second = entry.getValue();
            String key = ((b_0)first).getText();
            ((Collection)this.currentFrameKeys).add(key);
            Element existing = this.elementLookup.get(key);
            if (existing == null) {
                Element newElement = new Element(first, second);
                newElement.setValid(true);
                ((Collection)this.activeElements).add(newElement);
                ((Map)this.elementLookup).put(key, newElement);
                continue;
            }
            existing.updateData(first, second);
            if (existing.getValid()) continue;
            existing.setValid(true);
        }
        Iterator<Element> iterator2 = this.activeElements.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator2, "iterator(...)");
        Iterator<Element> iterator3 = iterator2;
        while (iterator3.hasNext()) {
            Element element;
            Intrinsics.checkNotNullExpressionValue(iterator3.next(), "next(...)");
            if (!this.currentFrameKeys.contains(element.getFirst().getText())) {
                element.setValid(false);
            }
            element.setProgress(element.getAnimation().animate(element.getValid() ? 1.0f : 0.0f, 80.0f, (Function1<? super Float, Float>)new Function1<Float, Float>((Object)Easings.INSTANCE){

                public final Float invoke(float p0) {
                    return Float.valueOf(((Easings)this.receiver).standardAccelerate(p0));
                }
            }));
            if (element.getValid() || !(element.getProgress() <= 0.1f)) continue;
            iterator3.remove();
            this.elementLookup.remove(element.getFirst().getText());
        }
    }

    private final Color withAlpha(Color color, float factor) {
        return ColorUtil.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotakbaz/rain/module/modules/hud/container/HudModule$Companion;", "", "<init>", "()V", "", "TEXT_APPEAR_START", "F", "rain-visuals"})
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

