/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.other.KeyMappings;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0624;
import oxxxde.\u0627\u062e;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u062f;
import oxxxde.\u0628\u0641;
import oxxxde.\u0628\u064b;
import oxxxde.\u062a\u062c;
import oxxxde.\u062a\u064d;
import oxxxde.\u062b\u0633;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u0641;
import oxxxde.\u062c\u0650;
import oxxxde.\u062f\u0628;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0635\u0637;
import oxxxde.\u0636\u062d;
import oxxxde.\u0638\u062e;
import oxxxde.\u0638\u0634;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001FB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0011J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u00100R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00105R\u0014\u00108\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00105R\u0014\u00109\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u00105R\u001e\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b@\u0010,R\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010,R\u0011\u0010C\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\bB\u0010\tR\u0011\u0010E\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\bD\u0010\t\u00a8\u0006G"}, d2={"Loxxxde/\u062d\u0636;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "Loxxxde/\u062f\u0650;", "module", "<init>", "(Lkotakbaz/rain/module/Module;)V", "", "prepareLayout", "()F", "top", "bottom", "", "setViewport", "(FF)V", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "onKeyPress", "progress", "renderBindMenu", "(F)V", "openBindMenu", "()V", "closeBindMenu", "Loxxxde/\u0634\u0631;", "calculateLayout", "()Lkotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot;", "Loxxxde/\u062f\u0650;", "getModule", "()Lkotakbaz/rain/module/Module;", "headerHeight", "F", "settingGap", "", "expanded", "Z", "bindMenuOpen", "expandedBeforeBindMenu", "Loxxxde/\u0631\u064a;", "openAnim", "Loxxxde/\u0631\u064a;", "bindMenuAnim", "bindWidthAnim", "enableAnimation", "hoverAnimation", "", "Loxxxde/\u0622;", "settingComponents", "Ljava/util/List;", "preparedLayout", "Loxxxde/\u0634\u0631;", "viewportTop", "viewportBottom", "getDefaultHeight", "defaultHeight", "getLayoutHeight", "layoutHeight", "LayoutSnapshot", "rain-visuals"})
public final class ModuleComponent
extends \u0627\u0638
implements PipelinedRender {
    @NotNull
    private final List<ModuleSettingComponent<?>> settingComponents;
    @NotNull
    private final AnimationUtil bindWidthAnim;
    @NotNull
    private final AnimationUtil bindMenuAnim;
    @NotNull
    private final AnimationUtil hoverAnimation;
    private float viewportTop;
    @NotNull
    private final AnimationUtil openAnim;
    private float viewportBottom;
    private boolean expanded;
    private boolean bindMenuOpen;
    private boolean expandedBeforeBindMenu;
    @NotNull
    private final Module module;
    private final float headerHeight;
    @NotNull
    private final AnimationUtil enableAnimation;
    @Nullable
    private LayoutSnapshot preparedLayout;
    private final float settingGap;

    /*
     * WARNING - void declaration
     */
    private final void renderBindMenu(float progress) {
        void var11_11;
        void var15_15;
        void var39_40;
        void var38_39;
        void var20_20;
        float panelH;
        float panelW;
        float panelY;
        float panelX;
        block5: {
            block4: {
                float offset = (1.0f - progress) * 4.0f;
                float panelInset = this.getPadding() * 1.15f;
                panelX = this.getX() + panelInset;
                panelY = this.getY() + this.getPadding() * 0.75f + offset;
                panelW = RangesKt.coerceAtLeast(this.getWidth() - panelInset * 2.0f, 0.0f);
                panelH = RangesKt.coerceAtLeast(this.headerHeight - this.getPadding() * 1.4f, 0.0f);
                if (panelW <= 0.0f) break block4;
                if (!(panelH <= 0.0f)) break block5;
            }
            return;
        }
        Color panelColor = \u062b\u0652.INSTANCE.surface(0.04f * this.getAlpha() * progress);
        Color panelBorder = \u062b\u0652.INSTANCE.title(0.08f * this.getAlpha() * progress);
        Color titleColor = \u062b\u0652.INSTANCE.value(0.78f * this.getAlpha() * progress);
        Color valueColor = \u062b\u0652.INSTANCE.title(0.92f * this.getAlpha() * progress);
        Color keyBoxColor = \u062b\u0652.INSTANCE.surface(0.03f * this.getAlpha() * progress);
        Color keyBoxBorder = \u062b\u0652.INSTANCE.title(0.28f * this.getAlpha() * progress);
        float titleSize = 7.0f;
        float valueSize = 6.8f;
        float keyTextPaddingX = 4.8f;
        float keyTextPaddingTop = 2.1f;
        float keyTextPaddingBottom = 3.2f;
        String titleText = "Bind:";
        String bindValueText = KeyMappings.INSTANCE.getKey(this.module.getKey());
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(panelColor).round(3.2f).mix(0.95f).border(1.0f, panelBorder).draw(panelX, panelY, panelW, panelH);
        float keyBoxHeight = RangesKt.coerceAtLeast(this.getDefaultFont().getHeight(valueSize) + keyTextPaddingTop + keyTextPaddingBottom, 11.0f);
        float rowY = panelY + (panelH - keyBoxHeight) * 0.5f;
        float titleWidth = Font.getWidth$default(this.getDefaultFont(), titleText, titleSize, 0.0f, 4, null);
        float titleY = rowY + (keyBoxHeight - this.getDefaultFont().getHeight(titleSize)) * 0.5f;
        float valueWidth = Font.getWidth$default(this.getDefaultFont(), bindValueText, valueSize, 0.0f, 4, null);
        float minKeyBoxWidth = 18.0f;
        float sideInset = 5.0f;
        float contentGap = 2.0f;
        float innerLeft = panelX + sideInset;
        float innerRight = panelX + panelW - sideInset;
        float titleX = innerLeft;
        float keyBoxMaxWidth = RangesKt.coerceAtLeast(innerRight - titleX - titleWidth - contentGap, 0.0f);
        if (keyBoxMaxWidth <= 0.0f) {
            return;
        }
        float keyBoxMinWidth = RangesKt.coerceAtMost(minKeyBoxWidth, keyBoxMaxWidth);
        float keyBoxTargetWidth = RangesKt.coerceIn(valueWidth + keyTextPaddingX * 2.0f, keyBoxMinWidth, keyBoxMaxWidth);
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float keyBoxWidth = RangesKt.coerceIn(this.bindWidthAnim.animate(keyBoxTargetWidth, 170.0f, new \u0624(\u0628\u06412)), keyBoxMinWidth, keyBoxMaxWidth);
        float keyBoxX = innerRight - keyBoxWidth;
        float keyBoxY = rowY;
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), titleText, titleX, titleY, titleSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(keyBoxColor).round(3.0f).mix(0.95f).border(1.0f, keyBoxBorder).draw(keyBoxX, keyBoxY, keyBoxWidth, keyBoxHeight);
        float valueX = keyBoxX + (keyBoxWidth - valueWidth) * 0.5f;
        float valueY = keyBoxY + keyTextPaddingTop;
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), (String)var20_20, (float)var38_39, (float)var39_40, (float)var15_15, (Color)var11_11, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    @NotNull
    public final Module getModule() {
        return this.module;
    }

    public final void setViewport(float top, float bottom) {
        this.viewportTop = top;
        this.viewportBottom = bottom;
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    /*
     * WARNING - void declaration
     */
    private final LayoutSnapshot calculateLayout() {
        void var6_8;
        void var5_7;
        void var10_14;
        void var9_12;
        void var4_6;
        void var3_5;
        void var2_2;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float openProgress = this.openAnim.animate(this.expanded ? 1.0f : 0.0f, 250.0f, new \u0636\u062d(\u0628\u06412));
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        float bindProgress = this.bindMenuAnim.animate(this.bindMenuOpen ? 1.0f : 0.0f, 240.0f, new \u062a\u062c(\u0628\u06413));
        float contentVisibility = RangesKt.coerceIn(1.0f - bindProgress, 0.0f, 1.0f);
        float effectiveOpenProgress = openProgress * contentVisibility;
        float[] settingVisibility = new float[this.settingComponents.size()];
        float[] settingHeights = new float[this.settingComponents.size()];
        float totalHeight = 0.0f;
        boolean hasPreviousVisible = false;
        Iterable $this$forEachIndexed$iv = this.settingComponents;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void var18_22;
            void var19_23;
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ModuleSettingComponent component = (ModuleSettingComponent)item$iv;
            int index = n;
            boolean bl = false;
            float visibleProgress = ModuleSettingComponent.visibleProgress$default(component, 0.0f, 1, null);
            float componentHeight = component.getComponentHeight();
            settingVisibility[index] = visibleProgress;
            settingHeights[index] = componentHeight;
            if (visibleProgress <= 0.001f) continue;
            if (hasPreviousVisible) {
                totalHeight += this.settingGap * visibleProgress;
            }
            totalHeight += var19_23 * var18_22;
            hasPreviousVisible = true;
        }
        float settingsHeight = RangesKt.coerceAtLeast(totalHeight, 0.0f);
        float moduleHeight = this.headerHeight + (settingsHeight > 0.001f ? (this.getPadding() + settingsHeight) * effectiveOpenProgress : 0.0f);
        return new LayoutSnapshot((float)var2_2, (float)var3_5, (float)var4_6, (float)var9_12, (float)var10_14, (float[])var5_7, (float[])var6_8);
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    private final void openBindMenu() {
        if (this.bindMenuOpen) {
            return;
        }
        this.expandedBeforeBindMenu = this.expanded;
        this.bindMenuOpen = true;
        this.expanded = false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        super.onMouseRelease(mouseX, mouseY, button);
        float f = this.bindMenuOpen ? 1.0f : 0.0f;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        \u0627\u062e \u0627\u062e2 = new \u0627\u062e(\u0628\u06412);
        if (this.bindMenuAnim.animate(f, 240.0f, \u0627\u062e2) > 0.05f) {
            return;
        }
        float f2 = this.expanded ? 1.0f : 0.0f;
        \u0628\u06412 = \u0628\u0641.INSTANCE;
        \u062c\u0641 \u062c\u06412 = new \u062c\u0641(\u0628\u06412);
        if (this.openAnim.animate(f2, 250.0f, \u062c\u06412) <= 0.05f) {
            return;
        }
        Iterable $this$forEach$iv = this.settingComponents;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var3_3;
            void var8_8;
            ModuleSettingComponent it = (ModuleSettingComponent)element$iv;
            boolean bl = false;
            var8_8.onMouseRelease(mouseX, mouseY, (int)var3_3);
        }
    }

    public final float getLayoutHeight() {
        LayoutSnapshot layoutSnapshot = this.preparedLayout;
        return layoutSnapshot != null ? layoutSnapshot.getModuleHeight() : this.getDefaultHeight();
    }

    /*
     * WARNING - void declaration
     */
    public ModuleComponent(@NotNull Module module) {
        void var6_7;
        Intrinsics.checkNotNullParameter(module, "module");
        this.module = module;
        this.headerHeight = 33.0f;
        this.settingGap = 4.0f;
        this.openAnim = new AnimationUtil(0.0f, 1, null);
        this.bindMenuAnim = new AnimationUtil(0.0f, 1, null);
        this.bindWidthAnim = new AnimationUtil(0.0f, 1, null);
        this.enableAnimation = new AnimationUtil(this.module.isEnabled() ? 1.0f : 0.0f);
        this.hoverAnimation = new AnimationUtil(0.0f, 1, null);
        Iterable $this$mapNotNull$iv = this.module.getSettings();
        \u062b\u0633 \u062b\u06332 = \u062b\u0633.INSTANCE;
        ModuleComponent moduleComponent = this;
        boolean $i$f$mapNotNull = false;
        Iterable $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        Iterable $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.iterator();
        while (iterator2.hasNext()) {
            ModuleSettingComponent<?> moduleSettingComponent;
            Object element$iv$iv$iv;
            Object element$iv$iv = element$iv$iv$iv = iterator2.next();
            boolean bl = false;
            Setting setting = (Setting)element$iv$iv;
            boolean bl2 = false;
            if (\u062b\u06332.create(setting) == null) continue;
            boolean bl3 = false;
            var6_7.add(moduleSettingComponent);
        }
        moduleComponent.settingComponents = (List)var6_7;
        this.viewportTop = Float.NEGATIVE_INFINITY;
        this.viewportBottom = Float.POSITIVE_INFINITY;
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    public final float prepareLayout() {
        LayoutSnapshot snapshot;
        this.preparedLayout = snapshot = this.calculateLayout();
        return snapshot.getModuleHeight();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        super.render(mouseX, mouseY, partialTicks);
        v0 = this.preparedLayout;
        if (v0 == null) {
            v0 = this.calculateLayout();
        }
        layout = v0;
        bindProgress = layout.getBindProgress();
        contentVisibility = layout.getContentVisibility();
        effectiveOpenProgress = layout.getEffectiveOpenProgress();
        var9_8 = \u0628\u0641.INSTANCE;
        enableProgress = this.enableAnimation.animate(this.module.isEnabled() ? 1.0f : 0.0f, 220.0f, new \u0635\u0637(var9_8));
        if (!((float)mouseX >= this.getX()) || !((float)mouseX <= this.getX() + this.getWidth())) ** GOTO lbl-1000
        if (!((float)mouseY >= this.getY())) ** GOTO lbl-1000
        if ((float)mouseY <= this.getY() + this.headerHeight) {
            v1 = true;
        } else lbl-1000:
        // 3 sources

        {
            v1 = false;
        }
        headerHovered = v1;
        var11_11 = \u0628\u0641.INSTANCE;
        hoverProgress = RangesKt.coerceIn(this.hoverAnimation.animate(headerHovered ? 1.0f : 0.0f, 180.0f, new \u0638\u0634(var11_11)), 0.0f, 1.0f);
        settingsHeight = layout.getSettingsHeight();
        moduleHeight = layout.getModuleHeight();
        bgAlpha = 0.03f + 0.020000001f * enableProgress + 0.015f * hoverProgress;
        borderAlpha = 0.05f + 0.029999997f * enableProgress + 0.03f * hoverProgress;
        nameAlpha = (0.32f + 0.68f * enableProgress + 0.12f * hoverProgress * (1.0f - enableProgress)) * contentVisibility;
        descAlpha = (0.16f + 0.34f * enableProgress + 0.08f * hoverProgress * (1.0f - enableProgress)) * contentVisibility;
        bgColor = \u062b\u0652.INSTANCE.surface(bgAlpha * this.getAlpha());
        borderColor = \u062b\u0652.INSTANCE.title(borderAlpha * this.getAlpha());
        nameColor = \u062b\u0652.INSTANCE.title(nameAlpha * this.getAlpha());
        descColor = \u062b\u0652.INSTANCE.value(descAlpha * this.getAlpha());
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(bgColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(this.getX(), this.getY(), this.getWidth(), moduleHeight);
        nameSize = 8.0f;
        descSize = 5.6f;
        left = this.getX() + this.getPadding() * 1.5f;
        titleY = this.getY() + this.getPadding() * 1.5f;
        descY = titleY + this.getDefaultFont().getHeight(nameSize) + this.getPadding() / 1.5f;
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), this.module.getName(), left, titleY, nameSize, nameColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), this.module.getDesc(), left, descY, descSize, descColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        indicatorColor = \u0628\u062d.INSTANCE.setAlpha(\u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.value$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), enableProgress), this.getAlpha() * contentVisibility);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(indicatorColor).round(0.3f).draw(this.getX() + this.getWidth() - this.getPadding() * 1.5f, this.getY() + this.getPadding(), 2.5f, 2.5f);
        v2 = !((Collection)this.module.getSettings()).isEmpty();
        if (v2 && contentVisibility > 0.01f) {
            markerText = "f";
            markerSize = 5.5f;
            markerColor = \u0628\u062d.INSTANCE.setAlpha(\u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.icon$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), enableProgress), 0.55f * this.getAlpha() * contentVisibility);
            markerX = this.getX() + this.getWidth() - this.getPadding() * 3.0f;
            markerY = this.getY() + this.getPadding() * 2.0f;
            markerWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), markerText, markerSize, 0.0f, 4, null);
            markerHeight = \u0631\u064e.INSTANCE.getICON().getHeight(markerSize);
            markerCenterX = markerX + markerWidth * 0.5f;
            markerCenterY = markerY + markerHeight * 0.5f;
            markerRotation = effectiveOpenProgress * 180.0f * 0.017453292f;
            \u0628\u062f.INSTANCE.pushMatrix();
            \u0628\u062f.matrix4fStack.translate(markerCenterX, markerCenterY, 0.0f);
            \u0628\u062f.matrix4fStack.rotateZ(markerRotation);
            \u0628\u062f.matrix4fStack.translate(-markerCenterX, -markerCenterY, 0.0f);
            Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.textPipeline()), markerText, markerX, markerY, markerSize, markerColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            \u0628\u062f.INSTANCE.popMatrix();
        }
        if (bindProgress > 0.01f) {
            this.renderBindMenu(bindProgress);
        }
        if (effectiveOpenProgress <= 0.01f || this.settingComponents.isEmpty() || settingsHeight <= 0.001f) {
            return;
        }
        separatorColor = \u062b\u0652.INSTANCE.surface(0.12f * this.getAlpha() * effectiveOpenProgress);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(separatorColor).round(0.5f).draw(this.getX() + this.getPadding() + this.getWidth() / 2.0f * (1.0f - effectiveOpenProgress), this.getY() + this.headerHeight - this.getPadding() / 2.0f, (this.getWidth() - this.getPadding() * 2.0f) * effectiveOpenProgress, 1.0f);
        settingsX = this.getX() + this.getPadding() * 1.2f;
        settingsWidth = this.getWidth() - this.getPadding() * 2.4f;
        currentY = 0.0f;
        currentY = this.getY() + this.headerHeight + this.getPadding() * 0.45f;
        hasPreviousVisible = false;
        \u062c\u0650.INSTANCE.start(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        $this$forEachIndexed$iv = this.settingComponents;
        $i$f$forEachIndexed = false;
        index$iv = 0;
        for (T item$iv : $this$forEachIndexed$iv) {
            if ((var37_46 = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            component = (ModuleSettingComponent)item$iv;
            index = var37_46;
            $i$a$-forEachIndexed-ModuleComponent$render$1 = false;
            visibleProgress = layout.getSettingVisibility()[index];
            if (visibleProgress <= 0.001f) continue;
            componentHeight = layout.getSettingHeights()[index];
            if (hasPreviousVisible) {
                currentY += this.settingGap * effectiveOpenProgress * visibleProgress;
            }
            component.setAlpha(this.getAlpha() * effectiveOpenProgress * visibleProgress);
            component.setEnableProgress(enableProgress);
            component.setParentOpenProgress(effectiveOpenProgress);
            component.setX(settingsX);
            component.setY(currentY);
            var38_47.setWidth(settingsWidth);
            var38_47.setHeight((float)var42_51);
            if (var30_33 + var42_51 > this.viewportTop && var30_33 < this.viewportBottom) {
                var38_47.render((int)var1_1, (int)var2_2, (float)var3_3);
            }
            var30_33 += var42_51 * var7_7 * var41_50;
            var31_35 = true;
        }
        \u062c\u0650.INSTANCE.end();
    }

    private final void closeBindMenu() {
        if (!this.bindMenuOpen) {
            return;
        }
        this.bindMenuOpen = false;
        this.expanded = this.expandedBeforeBindMenu;
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        super.onKeyPress(mouseX, mouseY, button);
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float bindProgress = this.bindMenuAnim.animate(this.bindMenuOpen ? 1.0f : 0.0f, 240.0f, new \u0628\u064b(\u0628\u06412));
        if (this.bindMenuOpen) {
            switch (button) {
                case 256: 
                case 259: 
                case 261: {
                    this.module.setKey(-1);
                    break;
                }
                default: {
                    this.module.setKey(button);
                }
            }
            this.closeBindMenu();
            return;
        }
        if (bindProgress > 0.05f) {
            return;
        }
        float f = this.expanded ? 1.0f : 0.0f;
        \u0628\u06412 = \u0628\u0641.INSTANCE;
        \u062a\u064d \u062a\u064d2 = new \u062a\u064d(\u0628\u06412);
        if (this.openAnim.animate(f, 250.0f, \u062a\u064d2) <= 0.05f) {
            return;
        }
        Iterable $this$forEach$iv = this.settingComponents;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            ModuleSettingComponent component = (ModuleSettingComponent)element$iv;
            boolean bl = false;
            if (!((Setting)component.getSetting()).isVisible()) continue;
            component.onKeyPress(mouseX, mouseY, button);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        super.onMouseClick(mouseX, mouseY, button);
        var5_4 = \u0628\u0641.INSTANCE;
        bindProgress = this.bindMenuAnim.animate(this.bindMenuOpen ? 1.0f : 0.0f, 240.0f, new \u0638\u062e(var5_4));
        if (!((float)mouseX >= this.getX()) || !((float)mouseX <= this.getX() + this.getWidth())) ** GOTO lbl-1000
        if (!((float)mouseY >= this.getY())) ** GOTO lbl-1000
        if ((float)mouseY <= this.getY() + this.getHeight()) {
            v0 = true;
        } else lbl-1000:
        // 3 sources

        {
            v0 = false;
        }
        inComponent = v0;
        if (!((float)mouseX >= this.getX()) || !((float)mouseX <= this.getX() + this.getWidth())) ** GOTO lbl-1000
        if (!((float)mouseY >= this.getY())) ** GOTO lbl-1000
        if ((float)mouseY <= this.getY() + this.headerHeight) {
            v1 = true;
        } else lbl-1000:
        // 3 sources

        {
            v1 = false;
        }
        inHeader = v1;
        if (this.bindMenuOpen) {
            if (!inComponent) {
                return;
            }
            if (button == 2) {
                this.closeBindMenu();
                return;
            }
            this.module.setKey(button);
            this.closeBindMenu();
            return;
        }
        if (inHeader) {
            if (button == 2) {
                if (this.module.canBind()) {
                    this.openBindMenu();
                } else {
                    this.module.onBindAttempt();
                }
                return;
            }
        }
        if (bindProgress > 0.05f) {
            return;
        }
        if (inHeader) {
            if (button == 0) {
                if (this.module.canToggle()) {
                    this.module.toggle();
                }
                return;
            }
            if (button == 1) {
                v2 = !((Collection)this.settingComponents).isEmpty();
                if (v2) {
                    this.expanded = !this.expanded;
                    return;
                }
            }
        }
        v3 = this.expanded ? 1.0f : 0.0f;
        var7_8 = \u0628\u0641.INSTANCE;
        v4 = new \u062f\u0628((\u0628\u0641)$this$forEach$iv);
        if (this.openAnim.animate(v3, 250.0f, v4) <= 0.05f) {
            return;
        }
        $this$forEach$iv = this.settingComponents;
        $i$f$forEach = false;
        for (T element$iv : $this$forEach$iv) {
            var11_12 = (ModuleSettingComponent)element$iv;
            var12_13 = false;
            if (!var11_12.getSetting().isVisible()) continue;
            var11_12.onMouseClick((int)var1_1, (int)var2_2, (int)var3_3);
        }
    }

    public final float getDefaultHeight() {
        return this.calculateLayout().getModuleHeight();
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0014JV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u00020\u001cH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u00020\u001fH\u00d6\u0081\u0004\u00a2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\n\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b*\u0010\u0014\u00a8\u0006+"}, d2={"Loxxxde/\u0634\u0631;", "", "", "bindProgress", "contentVisibility", "effectiveOpenProgress", "settingsHeight", "moduleHeight", "", "settingVisibility", "settingHeights", "<init>", "(FFFFF[F[F)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "()[F", "component7", "copy", "(FFFFF[F[F)Lkotakbaz/rain/ui/menu/ModuleComponent$LayoutSnapshot;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getBindProgress", "getContentVisibility", "getEffectiveOpenProgress", "getSettingsHeight", "getModuleHeight", "[F", "getSettingVisibility", "getSettingHeights", "rain-visuals"})
    private static final class LayoutSnapshot {
        private final float moduleHeight;
        private final float bindProgress;
        @NotNull
        private final float[] settingHeights;
        private final float effectiveOpenProgress;
        private final float contentVisibility;
        private final float settingsHeight;
        @NotNull
        private final float[] settingVisibility;

        public final float getModuleHeight() {
            return this.moduleHeight;
        }

        public final float component5() {
            return this.moduleHeight;
        }

        @NotNull
        public String toString() {
            return "LayoutSnapshot(bindProgress=" + this.bindProgress + ", contentVisibility=" + this.contentVisibility + ", effectiveOpenProgress=" + this.effectiveOpenProgress + ", settingsHeight=" + this.settingsHeight + ", moduleHeight=" + this.moduleHeight + ", settingVisibility=" + Arrays.toString(this.settingVisibility) + ", settingHeights=" + Arrays.toString(this.settingHeights) + ")";
        }

        public final float getBindProgress() {
            return this.bindProgress;
        }

        @NotNull
        public final float[] getSettingHeights() {
            return this.settingHeights;
        }

        public final float component4() {
            return this.settingsHeight;
        }

        public final float getEffectiveOpenProgress() {
            return this.effectiveOpenProgress;
        }

        @NotNull
        public final LayoutSnapshot copy(float bindProgress, float contentVisibility, float effectiveOpenProgress, float settingsHeight, float moduleHeight, @NotNull float[] settingVisibility, @NotNull float[] settingHeights) {
            Intrinsics.checkNotNullParameter(settingVisibility, "settingVisibility");
            Intrinsics.checkNotNullParameter(settingHeights, "settingHeights");
            return new LayoutSnapshot(bindProgress, contentVisibility, effectiveOpenProgress, settingsHeight, moduleHeight, settingVisibility, settingHeights);
        }

        @NotNull
        public final float[] component7() {
            return this.settingHeights;
        }

        public final float getSettingsHeight() {
            return this.settingsHeight;
        }

        public int hashCode() {
            int result = Float.hashCode(this.bindProgress);
            result = result * 31 + Float.hashCode(this.contentVisibility);
            result = result * 31 + Float.hashCode(this.effectiveOpenProgress);
            result = result * 31 + Float.hashCode(this.settingsHeight);
            result = result * 31 + Float.hashCode(this.moduleHeight);
            result = result * 31 + Arrays.hashCode(this.settingVisibility);
            result = result * 31 + Arrays.hashCode(this.settingHeights);
            return result;
        }

        public final float getContentVisibility() {
            return this.contentVisibility;
        }

        public static /* synthetic */ LayoutSnapshot copy$default(LayoutSnapshot layoutSnapshot, float f, float f2, float f3, float f4, float f5, float[] fArray, float[] fArray2, int n, Object object) {
            if ((n & 1) != 0) {
                f = layoutSnapshot.bindProgress;
            }
            if ((n & 2) != 0) {
                f2 = layoutSnapshot.contentVisibility;
            }
            if ((n & 4) != 0) {
                f3 = layoutSnapshot.effectiveOpenProgress;
            }
            if ((n & 8) != 0) {
                f4 = layoutSnapshot.settingsHeight;
            }
            if ((n & 0x10) != 0) {
                f5 = layoutSnapshot.moduleHeight;
            }
            if ((n & 0x20) != 0) {
                fArray = layoutSnapshot.settingVisibility;
            }
            if ((n & 0x40) != 0) {
                fArray2 = layoutSnapshot.settingHeights;
            }
            return layoutSnapshot.copy(f, f2, f3, f4, f5, fArray, fArray2);
        }

        public LayoutSnapshot(float bindProgress, float contentVisibility, float effectiveOpenProgress, float settingsHeight, float moduleHeight, @NotNull float[] settingVisibility, @NotNull float[] settingHeights) {
            Intrinsics.checkNotNullParameter(settingVisibility, "settingVisibility");
            Intrinsics.checkNotNullParameter(settingHeights, "settingHeights");
            this.bindProgress = bindProgress;
            this.contentVisibility = contentVisibility;
            this.effectiveOpenProgress = effectiveOpenProgress;
            this.settingsHeight = settingsHeight;
            this.moduleHeight = moduleHeight;
            this.settingVisibility = settingVisibility;
            this.settingHeights = settingHeights;
        }

        @NotNull
        public final float[] component6() {
            return this.settingVisibility;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutSnapshot)) {
                return false;
            }
            LayoutSnapshot layoutSnapshot = (LayoutSnapshot)other;
            if (Float.compare(this.bindProgress, layoutSnapshot.bindProgress) != 0) {
                return false;
            }
            if (Float.compare(this.contentVisibility, layoutSnapshot.contentVisibility) != 0) {
                return false;
            }
            if (Float.compare(this.effectiveOpenProgress, layoutSnapshot.effectiveOpenProgress) != 0) {
                return false;
            }
            if (Float.compare(this.settingsHeight, layoutSnapshot.settingsHeight) != 0) {
                return false;
            }
            if (Float.compare(this.moduleHeight, layoutSnapshot.moduleHeight) != 0) {
                return false;
            }
            if (!Intrinsics.areEqual(this.settingVisibility, layoutSnapshot.settingVisibility)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.settingHeights, layoutSnapshot.settingHeights)) {
                return false;
            }
            return true;
        }

        public final float component1() {
            return this.bindProgress;
        }

        public final float component3() {
            return this.effectiveOpenProgress;
        }

        @NotNull
        public final float[] getSettingVisibility() {
            return this.settingVisibility;
        }

        public final float component2() {
            return this.contentVisibility;
        }
    }
}

