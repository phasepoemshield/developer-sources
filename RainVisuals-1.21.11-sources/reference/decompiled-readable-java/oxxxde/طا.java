/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.layout.MenuLayout;
import kotakbaz.rain.ui.menu.misc.AnimatedTextTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0652;
import oxxxde.\u062d\u062a;
import oxxxde.\u0630\u062a;
import oxxxde.\u0630\u0631;
import oxxxde.\u0630\u0632;
import oxxxde.\u0631\u062b;
import oxxxde.\u0631\u064e;
import oxxxde.\u0632\u0626;
import oxxxde.\u0634\u062a;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJa\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00102\u00a8\u00064"}, d2={"Loxxxde/\u0637\u0627;", "", "Loxxxde/\u0627\u0633;", "pipelines", "<init>", "(Lkotakbaz/rain/ui/api/PipelinedRender;)V", "Loxxxde/\u0632\u0652;", "layout", "Loxxxde/\u0638\u0635;", "currentCategory", "", "inputText", "", "inputFocused", "inputSelected", "", "uiScale", "configMode", "configCloudMode", "mouseX", "mouseY", "alpha", "", "render", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;Lkotakbaz/rain/client/extensions/Category;Ljava/lang/String;ZZFZZFFF)V", "renderCategorySection", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;Lkotakbaz/rain/client/extensions/Category;FF)V", "category", "offsetY", "renderCategoryContent", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;Lkotakbaz/rain/client/extensions/Category;FFF)V", "renderSearchSection", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;Lkotakbaz/rain/client/extensions/Category;Ljava/lang/String;ZZZZFFF)V", "x", "hover", "renderConfigActionButton", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;FFF)V", "Loxxxde/\u0627\u0633;", "Loxxxde/\u0631\u064a;", "configRightIconAnimation", "Loxxxde/\u0631\u064a;", "searchFocusAnimation", "configCreateHoverAnimation", "configRightHoverAnimation", "categoryTextAnimation", "displayedCategory", "Loxxxde/\u0638\u0635;", "previousCategory", "Loxxxde/\u062d\u062a;", "searchPlaceholderTransition", "Loxxxde/\u062d\u062a;", "searchIconTransition", "rain-visuals"})
public final class \u0637\u0627 {
    @NotNull
    private final AnimationUtil configRightHoverAnimation;
    @NotNull
    private final AnimationUtil categoryTextAnimation;
    @NotNull
    private final PipelinedRender pipelines;
    @Nullable
    private Category previousCategory;
    @NotNull
    private final AnimationUtil configRightIconAnimation;
    @NotNull
    private final \u062d\u062a searchPlaceholderTransition;
    @Nullable
    private Category displayedCategory;
    @NotNull
    private final AnimationUtil configCreateHoverAnimation;
    @NotNull
    private final AnimationUtil searchFocusAnimation;
    @NotNull
    private final \u062d\u062a searchIconTransition;

    private final void renderConfigActionButton(MenuLayout layout, float x, float hover, float alpha) {
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(4.0f).color(\u062b\u0652.INSTANCE.surface((0.01f + 0.035f * hover) * alpha)).border(1.0f, \u062b\u0652.INSTANCE.title((0.07f + 0.055f * hover) * alpha)).draw(x, layout.getTopBarY(), layout.getTopBarConfigButtonSize(), layout.getTopBarHeight());
    }

    /*
     * WARNING - void declaration
     */
    private final void renderCategoryContent(MenuLayout layout, Category category, float uiScale, float alpha, float offsetY) {
        void var4_4;
        void var7_7;
        if (alpha <= 0.001f) {
            return;
        }
        float iconSize = layout.getTopBarHeight() * 0.35f;
        float textSize = layout.getTopBarHeight() * 0.25f;
        float iconX = layout.getTopBarInfoX() + layout.getUiPadding() * 1.5f;
        float iconY = layout.getTopBarY() + (layout.getTopBarHeight() - iconSize) * 0.5f + offsetY;
        float iconWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), category.getIcon(), iconSize, 0.0f, 4, null);
        float textX = iconX + iconWidth + layout.getUiPadding();
        float textY = layout.getTopBarY() + (layout.getTopBarHeight() - textSize) * 0.46f + offsetY;
        float sectionRight = layout.getTopBarInfoX() + layout.getTopBarInfoWidth() - layout.getUiPadding() * 1.5f;
        float safeScale = RangesKt.coerceAtLeast(uiScale, 0.01f);
        float minNameWidth = RangesKt.coerceAtLeast(layout.getTopBarInfoWidth() * 0.05f, 6.0f);
        float minDescRegionX = textX + layout.getUiPadding() + minNameWidth;
        float maxDescRegionWidth = RangesKt.coerceAtLeast(sectionRight - minDescRegionX, 0.0f);
        float minDescRegionWidth = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(layout.getTopBarInfoWidth() * 0.34f, 0.0f), maxDescRegionWidth);
        float growth = RangesKt.coerceIn((safeScale - 0.75f) / 0.35f, 0.0f, 1.0f);
        float descRegionWidth = minDescRegionWidth + (maxDescRegionWidth - minDescRegionWidth) * growth;
        float descRegionX = RangesKt.coerceAtLeast(sectionRight - descRegionWidth, minDescRegionX);
        Font textFont = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline());
        Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), category.getIcon(), iconX, iconY, iconSize, \u062b\u0652.INSTANCE.icon(0.86f * alpha), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()), category.getName(), textX, textY, textSize, \u062b\u0652.INSTANCE.title(0.86f * alpha), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        float descWidth = Font.getWidth$default(textFont, category.getDesc(), textSize, 0.0f, 4, null);
        float staticDescX = descRegionX + descRegionWidth - descWidth;
        textFont.resetFade();
        Font.drawText$default(textFont, category.getDesc(), staticDescX, textY, (float)var7_7, \u062b\u0652.INSTANCE.value(0.4f * var4_4), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void renderSearchSection(MenuLayout layout, Category currentCategory, String inputText, boolean inputFocused, boolean inputSelected, boolean configMode, boolean configCloudMode, float mouseX, float mouseY, float alpha) {
        block23: {
            block22: {
                block21: {
                    block20: {
                        if (!configMode) ** GOTO lbl-1000
                        if (layout.getTopBarConfigButtonSize() > 0.0f) {
                            iconSize = layout.getTopBarHeight() * 0.34f;
                            iconY = layout.getTopBarFolderButtonY() + (layout.getTopBarHeight() - iconSize) * 0.5f - 0.1f;
                            var14_15 = \u0628\u0641.INSTANCE;
                            cloudProgress = RangesKt.coerceIn(this.configRightIconAnimation.animate(configCloudMode ? 1.0f : 0.0f, 220.0f, new \u0630\u062a(var14_15)), 0.0f, 1.0f);
                            var15_18 = \u0628\u0641.INSTANCE;
                            createHover = RangesKt.coerceIn(this.configCreateHoverAnimation.animate(layout.isInsideTopBarConfigCreateAction(mouseX, mouseY) ? 1.0f : 0.0f, 180.0f, new \u0630\u0632(var15_18)), 0.0f, 1.0f);
                            var16_21 = \u0628\u0641.INSTANCE;
                            rightHover = RangesKt.coerceIn(this.configRightHoverAnimation.animate(layout.isInsideTopBarFolderAction(mouseX, mouseY) ? 1.0f : 0.0f, 180.0f, new \u0631\u062b(var16_21)), 0.0f, 1.0f);
                            this.renderConfigActionButton(layout, layout.getTopBarConfigCreateButtonX(), createHover, alpha);
                            createIconX = layout.getTopBarConfigCreateButtonX() + layout.getTopBarConfigButtonSize() * 0.5f;
                            Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), "C", createIconX, iconY + 0.5f, iconSize, \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(0.8f * alpha), \u062b\u0652.INSTANCE.title(alpha), createHover), 0.0f, 32, null);
                            this.renderConfigActionButton(layout, layout.getTopBarFolderButtonX(), rightHover, alpha);
                            folderProgress = 1.0f - cloudProgress;
                            folderIconX = layout.getTopBarFolderButtonX() + layout.getTopBarConfigButtonSize() * 0.5f;
                            Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), "Q", folderIconX, iconY + cloudProgress * 0.5f, iconSize * (0.9f + folderProgress * 0.1f), \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(0.8f * alpha * folderProgress), \u062b\u0652.INSTANCE.title(alpha * folderProgress), rightHover), 0.0f, 32, null);
                            auxIconX = layout.getTopBarConfigAuxButtonX() + layout.getTopBarConfigButtonSize() * 0.5f - 0.5f;
                            Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getICON2().priority(this.pipelines.iconsPipeline()), "3", auxIconX, iconY + 0.5f - (1.0f - cloudProgress) * 0.5f, iconSize * (0.9f + cloudProgress * 0.1f), \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(0.8f * alpha * cloudProgress), \u062b\u0652.INSTANCE.title(alpha * cloudProgress), rightHover), 0.0f, 32, null);
                        } else lbl-1000:
                        // 2 sources

                        {
                            AnimationUtil.animate$default(this.configRightIconAnimation, 0.0f, 0.0f, null, 4, null);
                            AnimationUtil.animate$default(this.configCreateHoverAnimation, 0.0f, 0.0f, null, 4, null);
                            AnimationUtil.animate$default(this.configRightHoverAnimation, 0.0f, 0.0f, null, 4, null);
                        }
                        if (configMode) {
                            return;
                        }
                        if (layout.getTopBarSearchWidth() <= 0.0f) {
                            return;
                        }
                        iconY = \u0628\u0641.INSTANCE;
                        focus = RangesKt.coerceIn(this.searchFocusAnimation.animate(inputFocused ? 1.0f : 0.0f, 190.0f, new \u0634\u062a(iconY)), 0.0f, 1.0f);
                        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(4.0f).color(\u062b\u0652.INSTANCE.surface((0.01f + 0.03f * focus) * alpha)).border(1.0f, \u062b\u0652.INSTANCE.title((0.07f + 0.06f * focus) * alpha)).draw(layout.getTopBarSearchX(), layout.getTopBarY(), layout.getTopBarSearchWidth(), layout.getTopBarHeight());
                        textSize = layout.getTopBarHeight() * 0.24f;
                        textX = layout.getTopBarSearchX() + layout.getUiPadding() * 1.3f;
                        textY = layout.getTopBarY() + (layout.getTopBarHeight() - textSize) * 0.46f;
                        v0 = currentCategory;
                        v1 = v0;
                        if (v0 == null || (v1 = v1.getSearchPlaceholder()) == null) {
                            v1 = "Search..";
                        }
                        placeholder = v1;
                        folderProgress = inputText;
                        if (StringsKt.isBlank(folderProgress)) {
                            $i$a$-ifBlank-MenuTopBarRenderer$renderSearchSection$drawText$1 = false;
                            v2 = " ";
                        } else {
                            v2 = textColor;
                        }
                        drawText = v2;
                        textColor = StringsKt.isBlank(inputText) != false ? \u062b\u0652.INSTANCE.value(0.45f * alpha) : \u062b\u0652.INSTANCE.title(0.76f * alpha);
                        textWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), drawText, textSize, 0.0f, 4, null);
                        placeholderLayers = this.searchPlaceholderTransition.update((String)(StringsKt.isBlank(inputText) && !inputFocused ? placeholder : null));
                        if (inputSelected) {
                            v3 = ((CharSequence)inputText).length() > 0;
                            if (v3) {
                                \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(2.0f).color(\u062b\u0652.INSTANCE.title(0.16f * alpha)).draw(textX - 1.5f, textY - 1.2f, textWidth + 3.0f, textSize + 4.0f);
                            }
                        }
                        if (!StringsKt.isBlank(inputText)) break block20;
                        if (!inputFocused) break block21;
                    }
                    Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()), drawText, textX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
                }
                $this$forEach$iv = placeholderLayers;
                $i$f$forEach = false;
                for (T element$iv : $this$forEach$iv) {
                    layer = (AnimatedTextTransition.Layer)element$iv;
                    $i$a$-forEach-MenuTopBarRenderer$renderSearchSection$1 = false;
                    Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()), layer.getText(), textX, textY + p0.getOffsetY(), textSize, \u062b\u0652.INSTANCE.value(0.45f * alpha * p0.getAlpha()), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
                }
                v4 = currentCategory;
                v5 = v4;
                if (v4 == null || (v5 = v5.getSearchFieldIcon()) == null) break block22;
                p0 = var23_38 = v5;
                $i$a$-takeIf-MenuTopBarRenderer$renderSearchSection$searchIcon$1 = false;
                v6 /* !! */  = !StringsKt.isBlank((CharSequence)p0) ? var23_38 : null;
                v5 = v6 /* !! */ ;
                if (v6 /* !! */  != null) break block23;
            }
            v5 = "g";
        }
        searchIcon = v5;
        $this$forEach$iv = this.searchIconTransition.update((String)searchIcon);
        $i$f$forEach = false;
        for (T element$iv : $this$forEach$iv) {
            layer = (AnimatedTextTransition.Layer)element$iv;
            $i$a$-forEach-MenuTopBarRenderer$renderSearchSection$2 = false;
            Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), var25_41.getText(), layout.getTopBarSearchX() + layout.getTopBarSearchWidth() - layout.getUiPadding() * 2.7f, textY + 1.0f + var25_41.getOffsetY(), textSize, \u062b\u0652.INSTANCE.icon(0.45f * alpha * var25_41.getAlpha()), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
        if (!inputFocused || inputSelected) ** GOTO lbl-1000
        if (System.currentTimeMillis() / 450L % 2L == 0L) {
            v7 = true;
        } else lbl-1000:
        // 2 sources

        {
            v7 = false;
        }
        var21_34 = v7;
        if (!var21_34) {
            return;
        }
        var22_37 = var13_17 + var18_28 + 1.0f;
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()), "|", (float)var22_37, (float)var14_16, (float)var12_14, \u062b\u0652.INSTANCE.title(0.86f * var10_10), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    public final void render(@NotNull MenuLayout layout, @Nullable Category currentCategory, @NotNull String inputText, boolean inputFocused, boolean inputSelected, float uiScale, boolean configMode, boolean configCloudMode, float mouseX, float mouseY, float alpha) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        this.renderCategorySection(layout, currentCategory, uiScale, alpha);
        this.renderSearchSection(layout, currentCategory, inputText, inputFocused, inputSelected, configMode, configCloudMode, mouseX, mouseY, alpha);
    }

    public \u0637\u0627(@NotNull PipelinedRender pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        this.pipelines = pipelines;
        this.configRightIconAnimation = new AnimationUtil(0.0f, 1, null);
        this.searchFocusAnimation = new AnimationUtil(0.0f, 1, null);
        this.configCreateHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.configRightHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.categoryTextAnimation = new AnimationUtil(1.0f);
        this.searchPlaceholderTransition = new \u062d\u062a(0.0f, 0.0f, 3, null);
        this.searchIconTransition = new \u062d\u062a(0.0f, 0.0f, 3, null);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderCategorySection(MenuLayout layout, Category currentCategory, float uiScale, float alpha) {
        void var5_6;
        Category category;
        if (layout.getTopBarInfoWidth() <= 0.0f) {
            return;
        }
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(4.0f).color(\u062b\u0652.INSTANCE.surface(0.01f * alpha)).border(1.0f, \u062b\u0652.INSTANCE.surface(0.06f * alpha)).draw(layout.getTopBarInfoX(), layout.getTopBarY(), layout.getTopBarInfoWidth(), layout.getTopBarHeight());
        if (!Intrinsics.areEqual(currentCategory, this.displayedCategory)) {
            this.previousCategory = this.displayedCategory;
            this.displayedCategory = currentCategory;
            AnimationUtil.animate$default(this.categoryTextAnimation, 0.0f, 0.0f, null, 4, null);
        }
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float progress = RangesKt.coerceIn(this.categoryTextAnimation.animate(1.0f, 190.0f, new \u0632\u0626(\u0628\u06412)), 0.0f, 1.0f);
        Category category2 = this.previousCategory;
        if (category2 != null) {
            category = category2;
            boolean bl = false;
            this.renderCategoryContent(layout, category, uiScale, alpha * (1.0f - progress), -2.0f * progress);
        }
        Category category3 = this.displayedCategory;
        if (category3 != null) {
            category = category3;
            boolean bl = false;
            this.renderCategoryContent(layout, category, uiScale, alpha * progress, 2.0f * (1.0f - progress));
        }
        if (var5_6 >= 0.999f) {
            this.previousCategory = null;
        }
    }
}

