/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.figura.FiguraAvatarInstaller;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.other.ScrollUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.ui.menu.CategoryComponent;
import kotakbaz.rain.ui.menu.ContentArea;
import kotakbaz.rain.ui.menu.ModuleComponent;
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0632;
import oxxxde.\u0628\u0641;
import oxxxde.\u0629;
import oxxxde.\u062b\u0651;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u0635;
import oxxxde.\u062c\u0650;
import oxxxde.\u062e\u0646;
import oxxxde.\u062e\u064b;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0634\u0622;
import oxxxde.\u0636\u0636;
import oxxxde.\u0637\u0642;
import oxxxde.\u0638\u0646;
import oxxxde.\u0638\u0648;
import oxxxde.\u0639\u0630;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u008f\u00012\u00020\u0001:\u0006\u0090\u0001\u0091\u0001\u008f\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u0015J\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020 \u00a2\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0004\u00a2\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004\u00a2\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0004\u00a2\u0006\u0004\b'\u0010%J\r\u0010(\u001a\u00020\u0004\u00a2\u0006\u0004\b(\u0010%J'\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b+\u0010,JC\u00103\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020)2\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.2\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b3\u00104J7\u00108\u001a\u00020\u000b2\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b8\u00109J'\u0010=\u001a\u00020\u000b2\u0006\u00105\u001a\u00020)2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b?\u0010%JW\u0010F\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bH\u0010\u000fJ7\u0010M\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\b\u0012\u0004\u0012\u00020O0.H\u0002\u00a2\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bR\u0010\u000fJ\u000f\u0010S\u001a\u00020\tH\u0002\u00a2\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020)H\u0002\u00a2\u0006\u0004\bW\u0010XJ'\u0010Z\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010Y\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bZ\u0010[J'\u0010]\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010\\\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b`\u0010aJ'\u0010b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bb\u0010\u0018J\u000f\u0010c\u001a\u00020 H\u0002\u00a2\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020 H\u0002\u00a2\u0006\u0004\be\u0010dJ'\u0010f\u001a\u00020 2\u0006\u0010-\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bf\u0010gR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010kR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010kR\u0014\u0010l\u001a\u00020\u00108\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u00048\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\bn\u0010kR\u0014\u0010o\u001a\u00020\u00048\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\bo\u0010kR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bq\u0010rR \u0010t\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002000s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bt\u0010uR0\u0010y\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0vj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w`x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\by\u0010zR0\u0010{\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0vj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w`x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010zR\"\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020O0.8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0080\u0001\u0010}R7\u0010\u0084\u0001\u001a\"\u0012\u0004\u0012\u00020O\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001j\u0010\u0012\u0004\u0012\u00020O\u0012\u0005\u0012\u00030\u0082\u0001`\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u007fR\u0018\u0010\u008c\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008c\u0001\u0010kR\u0018\u0010\u008d\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008d\u0001\u0010kR\u0018\u0010\u008e\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u007f\u00a8\u0006\u0092\u0001"}, d2={"Loxxxde/\u062c\u0631;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0638\u0635;", "category", "", "panelWidth", "contentTopOffset", "<init>", "(Lkotakbaz/rain/client/extensions/Category;FF)V", "", "query", "", "setSearchQuery", "(Ljava/lang/String;)V", "resetScroll", "()V", "", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "onKeyPress", "vertical", "onMouseScroll", "scrollWheel", "(F)V", "progress", "", "instant", "setScrollProgress", "(FZ)V", "scrollOffsetValue", "()F", "scrollContentHeight", "scrollViewHeight", "scrollMaxValue", "Loxxxde/\u0634\u062e;", "listArea", "renderModelsContent", "(Lkotakbaz/rain/ui/menu/ContentArea;II)V", "area", "", "Loxxxde/\u062c\u0629;", "Loxxxde/\u0630\u064a;", "cards", "scrollOffset", "renderModelsCards", "(Lkotakbaz/rain/ui/menu/ContentArea;Ljava/util/List;FII)V", "bounds", "card", "presence", "renderModelsCard", "(Lkotakbaz/rain/ui/menu/ContentArea;Lkotakbaz/rain/ui/menu/CategoryComponent$ModelCard;IIF)V", "Loxxxde/\u0637\u0646;", "avatar", "previewAlpha", "renderModelPreview", "(Lkotakbaz/rain/ui/menu/ContentArea;Lkotakbaz/rain/client/figura/FiguraAvatarInstaller$AvatarEntry;F)V", "layoutModules", "startX", "startY", "width", "columnGap", "clipTop", "clipBottom", "renderModules", "(FFFFFFIIF)V", "syncModuleStates", "contentLeft", "contentTop", "contentWidth", "contentHeight", "renderEmptyState", "(FFFFF)V", "Loxxxde/\u062f\u0650;", "filteredModules", "()Ljava/util/List;", "refreshVisibleModulesIfNeeded", "currentModuleSignature", "()Ljava/lang/String;", "insideContent", "(FF)Z", "contentArea", "()Lkotakbaz/rain/ui/menu/ContentArea;", "position", "modelsCardBounds", "(Lkotakbaz/rain/ui/menu/ContentArea;FF)Lkotakbaz/rain/ui/menu/ContentArea;", "index", "modelsCardBoundsAtIndex", "(Lkotakbaz/rain/ui/menu/ContentArea;IF)Lkotakbaz/rain/ui/menu/ContentArea;", "cardCount", "modelsCardsHeight", "(I)F", "handleModelsClick", "isModelsCategory", "()Z", "isModuleCategory", "inside", "(Lkotakbaz/rain/ui/menu/ContentArea;FF)Z", "Loxxxde/\u0638\u0635;", "getCategory", "()Lkotakbaz/rain/client/extensions/Category;", "F", "modelsCardColumns", "I", "modelsCardHeight", "modelsPreviewMaxWidth", "Loxxxde/\u0628\u0632;", "modelCatalog", "Loxxxde/\u0628\u0632;", "Loxxxde/\u062b\u0651;", "modelListAnimations", "Loxxxde/\u062b\u0651;", "Ljava/util/HashMap;", "Loxxxde/\u0631\u064a;", "Lkotlin/collections/HashMap;", "modelHoverAnimations", "Ljava/util/HashMap;", "modelSelectionAnimations", "renderedModelCards", "Ljava/util/List;", "selectedModelAvatarId", "Ljava/lang/String;", "categoryModules", "Ljava/util/LinkedHashMap;", "Loxxxde/\u0639\u0633;", "Lkotlin/collections/LinkedHashMap;", "moduleStates", "Ljava/util/LinkedHashMap;", "emptyStateAnimation", "Loxxxde/\u0631\u064a;", "Loxxxde/\u0632\u0639;", "scroll", "Loxxxde/\u0632\u0639;", "normalizedSearch", "cachedTotalHeight", "cachedViewHeight", "lastModuleSignature", "Companion", "ModelCard", "ModuleLayoutState", "rain-visuals"})
public final class \u062c\u0631
extends \u0627\u0638 {
    private final float panelWidth;
    @NotNull
    private final LinkedHashMap<Module, CategoryComponent.ModuleLayoutState> moduleStates;
    @NotNull
    private String selectedModelAvatarId;
    @NotNull
    private final Category category;
    private float cachedViewHeight;
    @NotNull
    private final \u062b\u0651<String, CategoryComponent.ModelCard> modelListAnimations;
    private final float contentTopOffset;
    private final float modelsPreviewMaxWidth;
    @NotNull
    private List<AnimatedListTracker.Item<CategoryComponent.ModelCard>> renderedModelCards;
    @NotNull
    private final HashMap<String, AnimationUtil> modelHoverAnimations;
    @NotNull
    private final List<Module> categoryModules;
    private final float modelsCardHeight;
    @NotNull
    private final AnimationUtil emptyStateAnimation;
    @NotNull
    private static final Set<Category> MODULE_CATEGORIES;
    @NotNull
    private final \u0628\u0632 modelCatalog;
    @NotNull
    private String normalizedSearch;
    @NotNull
    private ScrollUtil scroll;
    @NotNull
    private final HashMap<String, AnimationUtil> modelSelectionAnimations;
    private float cachedTotalHeight;
    @NotNull
    public static final \u0629 Companion;
    private final int modelsCardColumns;
    @NotNull
    private String lastModuleSignature;

    private final ContentArea modelsCardBounds(ContentArea area, float position, float scrollOffset) {
        int lowerIndex = RangesKt.coerceAtLeast((int)Math.floor(position), 0);
        float fraction = RangesKt.coerceIn(position - (float)lowerIndex, 0.0f, 1.0f);
        ContentArea lower = this.modelsCardBoundsAtIndex(area, lowerIndex, scrollOffset);
        ContentArea upper = this.modelsCardBoundsAtIndex(area, lowerIndex + 1, scrollOffset);
        return new ContentArea(lower.getLeft() + (upper.getLeft() - lower.getLeft()) * fraction, lower.getTop() + (upper.getTop() - lower.getTop()) * fraction, lower.getWidth(), this.modelsCardHeight);
    }

    public final void resetScroll() {
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    /*
     * Unable to fully structure code
     */
    private final void renderModelPreview(ContentArea bounds, FiguraAvatarInstaller.AvatarEntry avatar, float previewAlpha) {
        block7: {
            block6: {
                block5: {
                    aspectRatio = \u0634\u0622.getPreviewAspectRatio();
                    availableWidth = RangesKt.coerceAtLeast(bounds.getWidth() - this.getPadding() * 3.2f, 0.0f);
                    availableHeight = RangesKt.coerceAtLeast(bounds.getHeight() - this.getPadding() * 2.0f, 0.0f);
                    previewWidth = Math.min(this.modelsPreviewMaxWidth, Math.min(availableWidth, availableHeight * aspectRatio));
                    previewHeight = previewWidth / aspectRatio;
                    if (previewWidth <= 0.0f) break block5;
                    if (!(previewHeight <= 0.0f)) break block6;
                }
                return;
            }
            previewX = bounds.getLeft() + (bounds.getWidth() - previewWidth) * 0.5f;
            previewY = bounds.getTop() + (bounds.getHeight() - previewHeight) * 0.5f;
            \u0634\u0622.enqueue(avatar.id(), previewX, previewY, previewWidth, previewHeight, RangesKt.coerceIn(previewAlpha, 0.0f, 1.0f));
            if (\u0634\u0622.isPreviewReady(avatar.id())) break block7;
            iconSize = Math.min(previewWidth, previewHeight) * 0.36f;
            v0 = \u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.GUI_SPECIAL);
            if (!\u0637\u0642.isFiguraLoaded()) ** GOTO lbl-1000
            if (!\u0637\u0642.hasPreviewFailed(avatar.id())) {
                v1 = "g";
            } else lbl-1000:
            // 2 sources

            {
                v1 = "!";
            }
            Font.drawCenteredText$default(v0, v1, previewX + previewWidth * 0.5f, previewY + (previewHeight - iconSize) * 0.48f, iconSize, \u062b\u0652.INSTANCE.value(previewAlpha * 0.42f), 0.0f, 32, null);
        }
    }

    private final void renderModules(float startX, float startY, float width, float columnGap, float clipTop, float clipBottom, int mouseX, int mouseY, float partialTicks) {
        Iterator<Map.Entry<Module, CategoryComponent.ModuleLayoutState>> iterator2 = this.moduleStates.entrySet().iterator();
        while (iterator2.hasNext()) {
            float componentHeight;
            CategoryComponent.ModuleLayoutState state;
            Intrinsics.checkNotNullExpressionValue(iterator2.next().getValue(), "<get-value>(...)");
            \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
            float presence = RangesKt.coerceIn(state.getPresenceAnimation().animate(state.getPresent() ? 1.0f : 0.0f, 190.0f, new \u062e\u0646(\u0628\u06412)), 0.0f, 1.0f);
            if (!state.getPresent() && presence <= 0.001f) {
                iterator2.remove();
                continue;
            }
            ModuleComponent component = state.getComponent();
            float componentY = startY + state.getTargetY() + (1.0f - presence) * 5.0f;
            boolean visible = componentY + (componentHeight = state.getPreparedHeight()) > clipTop && componentY < clipBottom;
            component.setAlpha(this.getAlpha() * presence);
            component.setX(startX + state.getTargetColumn() * (width + columnGap));
            component.setY(componentY);
            component.setWidth(width);
            component.setHeight(componentHeight);
            component.setViewport(clipTop, clipBottom);
            if (!visible) continue;
            component.render(mouseX, mouseY, partialTicks);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void renderModelsCard(ContentArea bounds, CategoryComponent.ModelCard card, int mouseX, int mouseY, float presence) {
        void var11_12;
        void var6_6;
        void var1_1;
        Object object;
        Object object2;
        \u0628\u0641 $this$getOrPut$iv;
        FiguraAvatarInstaller.AvatarEntry avatar = card.getAvatar();
        boolean hovered = this.inside(bounds, mouseX, mouseY);
        boolean selected = Intrinsics.areEqual(avatar.id(), this.selectedModelAvatarId) || \u0637\u0642.isApplied(avatar.id());
        Map map = this.modelHoverAnimations;
        String key$iv = card.getKey();
        boolean $i$f$getOrPut = false;
        Object value$iv = $this$getOrPut$iv.get(key$iv);
        if (value$iv == null) {
            boolean bl = false;
            AnimationUtil answer$iv = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv.put(key$iv, answer$iv);
            object2 = answer$iv;
        } else {
            object2 = value$iv;
        }
        $this$getOrPut$iv = \u0628\u0641.INSTANCE;
        float hover = RangesKt.coerceIn(((AnimationUtil)object2).animate(hovered ? 1.0f : 0.0f, 180.0f, new \u062c\u0635($this$getOrPut$iv)), 0.0f, 1.0f);
        Object $this$getOrPut$iv2 = this.modelSelectionAnimations;
        String key$iv2 = card.getKey();
        boolean $i$f$getOrPut2 = false;
        Object value$iv2 = $this$getOrPut$iv2.get(key$iv2);
        if (value$iv2 == null) {
            boolean answer$iv22 = false;
            AnimationUtil answer$iv22 = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv2.put(key$iv2, answer$iv22);
            object = answer$iv22;
        } else {
            object = value$iv2;
        }
        $this$getOrPut$iv2 = \u0628\u0641.INSTANCE;
        float selection = RangesKt.coerceIn(((AnimationUtil)object).animate(selected ? 1.0f : 0.0f, 220.0f, new \u0639\u0630((\u0628\u0641)$this$getOrPut$iv2)), 0.0f, 1.0f);
        float cardAlpha = this.getAlpha() * presence;
        Color bgColor = \u062b\u0652.INSTANCE.surface(cardAlpha * (0.03f + 0.02f * selection + 0.01f * hover));
        Color borderColor = \u062b\u0652.INSTANCE.title(cardAlpha * (0.05f + 0.03f * selection + 0.025f * hover));
        Color inactiveIndicator = \u062b\u0652.INSTANCE.value(cardAlpha * (0.34f + 0.12f * hover));
        Color indicatorColor = \u0628\u062d.INSTANCE.interpolateColor(inactiveIndicator, \u062b\u0652.INSTANCE.title(cardAlpha * (0.86f + 0.14f * hover)), selection);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.GUI_RECT).color(bgColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight());
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.GUI_RECT).color(indicatorColor).round(0.3f).draw(bounds.getLeft() + bounds.getWidth() - this.getPadding() * 1.5f, bounds.getTop() + this.getPadding(), 2.5f, 2.5f);
        this.renderModelPreview((ContentArea)var1_1, (FiguraAvatarInstaller.AvatarEntry)var6_6, (float)var11_12);
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean insideContent(float mouseX, float mouseY) {
        ContentArea area = this.contentArea();
        if (!(mouseX >= area.getLeft())) return false;
        if (!(mouseX <= area.getLeft() + area.getWidth())) return false;
        if (!(mouseY >= area.getTop())) return false;
        if (!(mouseY <= area.getTop() + area.getHeight())) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        void $this$filterTo$iv$iv;
        super.onKeyPress(mouseX, mouseY, button);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        Collection<CategoryComponent.ModuleLayoutState> collection = this.moduleStates.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$filter$iv = collection;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            void var11_13;
            CategoryComponent.ModuleLayoutState p0 = (CategoryComponent.ModuleLayoutState)element$iv$iv;
            boolean bl = false;
            if (!var11_13.getPresent()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$forEach$iv = (List)destination$iv$iv;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var3_3;
            CategoryComponent.ModuleLayoutState it = (CategoryComponent.ModuleLayoutState)element$iv;
            boolean bl = false;
            it.getComponent().onKeyPress(mouseX, mouseY, (int)var3_3);
        }
    }

    private final ContentArea modelsCardBoundsAtIndex(ContentArea area, int index, float scrollOffset) {
        float cardWidth = RangesKt.coerceAtLeast((area.getWidth() - this.getPadding() * (float)(this.modelsCardColumns - 1)) / (float)this.modelsCardColumns, 0.0f);
        int row = index / this.modelsCardColumns;
        int column = index % this.modelsCardColumns;
        return new ContentArea(area.getLeft() + (float)column * (cardWidth + this.getPadding()), area.getTop() - scrollOffset + (float)row * (this.modelsCardHeight + this.getPadding()), cardWidth, this.modelsCardHeight);
    }

    public final void setScrollProgress(float progress, boolean instant) {
        float max = this.scroll.max();
        if (max <= 0.0f) {
            this.scroll.setValue(0.0f).setTargetValue(0.0f);
            return;
        }
        float target = -max * RangesKt.coerceIn(progress, 0.0f, 1.0f);
        this.scroll.setTargetValue(target);
        if (instant) {
            this.scroll.setValue(target);
        }
    }

    /*
     * Unable to fully structure code
     */
    private final List<Module> filteredModules() {
        block8: {
            block7: {
                if (!StringsKt.isBlank(this.normalizedSearch)) break block7;
                $this$filter$iv = this.categoryModules;
                $i$f$filter = false;
                var3_5 = $this$filter$iv;
                destination$iv$iv = new ArrayList<E>();
                $i$f$filterTo = false;
                for (T element$iv$iv : $this$filterTo$iv$iv) {
                    it = (Module)element$iv$iv;
                    $i$a$-filter-CategoryComponent$filteredModules$1 = false;
                    if (!it.isVisibleInGui()) continue;
                    destination$iv$iv.add(element$iv$iv);
                }
                v0 = (List)destination$iv$iv;
                break block8;
            }
            if (this.isModuleCategory()) {
                $this$filter$iv = \u062e\u064b.INSTANCE.getModules();
                $i$f$filter = false;
                destination$iv$iv = $this$filter$iv;
                destination$iv$iv = new ArrayList<E>();
                $i$f$filterTo = false;
                for (T element$iv$iv : $this$filterTo$iv$iv) {
                    it = (Module)element$iv$iv;
                    $i$a$-filter-CategoryComponent$filteredModules$searchSource$1 = false;
                    if (!\u062c\u0631.MODULE_CATEGORIES.contains(it.getCategory())) continue;
                    destination$iv$iv.add(element$iv$iv);
                }
                v1 = (List)destination$iv$iv;
            } else {
                v1 = this.categoryModules;
            }
            searchSource = v1;
            $this$filter$iv = searchSource;
            $i$f$filter = false;
            $this$filterTo$iv$iv = $this$filter$iv;
            destination$iv$iv = new ArrayList<E>();
            $i$f$filterTo = false;
            for (T element$iv$iv : $this$filterTo$iv$iv) {
                module = (Module)element$iv$iv;
                $i$a$-filter-CategoryComponent$filteredModules$2 = false;
                if (!module.isVisibleInGui()) ** GOTO lbl-1000
                v2 = module.getName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(v2, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence)v2, this.normalizedSearch, false, 2, null)) ** GOTO lbl-1000
                v3 = module.getDesc().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(v3, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence)v3, this.normalizedSearch, false, 2, null)) lbl-1000:
                // 2 sources

                {
                    v4 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v4 = false;
                }
                if (!v4) continue;
                var5_10.add(var8_16);
            }
            v0 = (List)var5_10;
        }
        return v0;
    }

    /*
     * WARNING - void declaration
     */
    private final float layoutModules() {
        void var2_2;
        void var1_1;
        Iterator $this$filterTo$iv$iv;
        float leftHeight = 0.0f;
        float rightHeight = 0.0f;
        Collection<CategoryComponent.ModuleLayoutState> collection = this.moduleStates.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$filter$iv = collection;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        Iterator iterator2 = $this$filterTo$iv$iv.iterator();
        while (iterator2.hasNext()) {
            Object element$iv$iv = iterator2.next();
            CategoryComponent.ModuleLayoutState p0 = (CategoryComponent.ModuleLayoutState)element$iv$iv;
            boolean bl = false;
            if (!p0.getPresent()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$forEach$iv = (List)destination$iv$iv;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            CategoryComponent.ModuleLayoutState state = (CategoryComponent.ModuleLayoutState)element$iv;
            boolean bl = false;
            float componentHeight = state.getComponent().prepareLayout();
            state.setPreparedHeight(componentHeight);
            if (state.getTargetColumn() < 0.5f) {
                state.setTargetY(leftHeight);
                leftHeight += componentHeight + this.getPadding();
                continue;
            }
            state.setTargetY(rightHeight);
            rightHeight += componentHeight + this.getPadding();
        }
        Collection<CategoryComponent.ModuleLayoutState> collection2 = this.moduleStates.values();
        Intrinsics.checkNotNullExpressionValue(collection2, "<get-values>(...)");
        Iterable $this$filterNot$iv = collection2;
        boolean $i$f$filterNot = false;
        Iterable $this$filterNotTo$iv$iv = $this$filterNot$iv;
        destination$iv$iv = new ArrayList();
        boolean $i$f$filterNotTo = false;
        for (Object element$iv$iv : $this$filterNotTo$iv$iv) {
            void var9_15;
            CategoryComponent.ModuleLayoutState moduleLayoutState = (CategoryComponent.ModuleLayoutState)element$iv$iv;
            boolean bl = false;
            if (moduleLayoutState.getPresent()) continue;
            destination$iv$iv.add(var9_15);
        }
        $this$forEach$iv = (List)destination$iv$iv;
        $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var7_9;
            CategoryComponent.ModuleLayoutState state = (CategoryComponent.ModuleLayoutState)element$iv;
            boolean bl = false;
            var7_9.setPreparedHeight(var7_9.getComponent().prepareLayout());
        }
        return RangesKt.coerceAtLeast(Math.max((float)var1_1, (float)var2_2) - this.getPadding(), 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        float totalHeight;
        super.render(mouseX, mouseY, partialTicks);
        ContentArea area = this.contentArea();
        if (this.isModelsCategory()) {
            this.renderModelsContent(area, mouseX, mouseY);
            return;
        }
        this.refreshVisibleModulesIfNeeded();
        ContentArea listArea = area;
        float contentLeft = listArea.getLeft();
        float contentTop = listArea.getTop();
        float contentWidth = listArea.getWidth();
        float contentHeight = listArea.getHeight();
        float columnGap = this.getPadding();
        float columnWidth = RangesKt.coerceAtLeast((contentWidth - columnGap) * 0.5f, 0.0f);
        this.cachedTotalHeight = totalHeight = this.layoutModules();
        this.cachedViewHeight = contentHeight;
        this.scroll.setMax(RangesKt.coerceAtLeast(totalHeight - contentHeight, 0.0f));
        this.scroll.update();
        float scrollOffset = this.scroll.value();
        \u062c\u0650.INSTANCE.start(contentLeft, contentTop, contentWidth, contentHeight);
        float clipBottom = contentTop + contentHeight;
        this.renderModules(contentLeft, contentTop - scrollOffset, columnWidth, columnGap, contentTop, clipBottom, mouseX, mouseY, partialTicks);
        \u062c\u0650.INSTANCE.end();
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float emptyProgress = RangesKt.coerceIn(this.emptyStateAnimation.animate(this.filteredModules().isEmpty() ? 1.0f : 0.0f, 190.0f, new \u0636\u0636(\u0628\u06412)), 0.0f, 1.0f);
        if (emptyProgress > 0.001f) {
            void var15_16;
            void var9_9;
            this.renderEmptyState(contentLeft, contentTop, contentWidth, (float)var9_9, (float)var15_16);
        }
    }

    private final String currentModuleSignature() {
        return CollectionsKt.joinToString$default(this.filteredModules(), "\u0000", null, null, 0, null, \u062c\u0631::currentModuleSignature$lambda$0, 30, null);
    }

    /*
     * WARNING - void declaration
     */
    private final void syncModuleStates() {
        Collection<CategoryComponent.ModuleLayoutState> collection = this.moduleStates.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$forEach$iv = collection;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            Object element$iv = iterator2.next();
            CategoryComponent.ModuleLayoutState it = (CategoryComponent.ModuleLayoutState)element$iv;
            boolean bl = false;
            it.setPresent(false);
        }
        float leftHeight = 0.0f;
        float rightHeight = 0.0f;
        Iterable $this$forEach$iv2 = this.filteredModules();
        boolean $i$f$forEach2 = false;
        for (Object element$iv : $this$forEach$iv2) {
            void var9_13;
            void var14_23;
            float estimatedHeight;
            Object object;
            Module module = (Module)element$iv;
            boolean bl = false;
            Map $this$getOrPut$iv = this.moduleStates;
            Module key$iv = module;
            boolean $i$f$getOrPut = false;
            Object value$iv = $this$getOrPut$iv.get(key$iv);
            if (value$iv == null) {
                void var10_15;
                boolean bl2 = false;
                CategoryComponent.ModuleLayoutState answer$iv = new CategoryComponent.ModuleLayoutState(new ModuleComponent(module), false, 0.0f, 0.0f, 0.0f, null, 62, null);
                $this$getOrPut$iv.put(var10_15, answer$iv);
                object = answer$iv;
            } else {
                object = value$iv;
            }
            CategoryComponent.ModuleLayoutState state = (CategoryComponent.ModuleLayoutState)object;
            state.setPresent(true);
            Float f = Float.valueOf(state.getPreparedHeight());
            float f2 = ((Number)f).floatValue();
            boolean bl3 = false;
            Float f3 = f2 > 0.0f ? f : null;
            float f4 = estimatedHeight = f3 != null ? f3.floatValue() : state.getComponent().getDefaultHeight();
            if (leftHeight <= rightHeight) {
                state.setTargetColumn(0.0f);
                leftHeight += estimatedHeight + this.getPadding();
                continue;
            }
            var14_23.setTargetColumn(1.0f);
            var2_4 += var9_13 + this.getPadding();
        }
        this.lastModuleSignature = this.currentModuleSignature();
    }

    private final void refreshVisibleModulesIfNeeded() {
        String currentSignature = this.currentModuleSignature();
        if (Intrinsics.areEqual(currentSignature, this.lastModuleSignature)) {
            return;
        }
        this.syncModuleStates();
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    private static final CharSequence currentModuleSignature$lambda$0(Module it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCategory().getName() + ":" + it.getName();
    }

    private final boolean inside(ContentArea area, float mouseX, float mouseY) {
        return mouseX >= area.getLeft() && mouseX <= area.getLeft() + area.getWidth() && mouseY >= area.getTop() && mouseY <= area.getTop() + area.getHeight();
    }

    public static /* synthetic */ void setScrollProgress$default(\u062c\u0631 \u062c\u06312, float f, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        \u062c\u06312.setScrollProgress(f, bl);
    }

    private final boolean isModelsCategory() {
        return Intrinsics.areEqual(this.category, \u0638\u0646.getMODELS());
    }

    private final boolean isModuleCategory() {
        return MODULE_CATEGORIES.contains(this.category);
    }

    public final float scrollOffsetValue() {
        return this.scroll.value();
    }

    /*
     * WARNING - void declaration
     */
    private final void handleModelsClick(int mouseX, int mouseY, int button) {
        void $this$filterTo$iv$iv;
        if (button != 0) {
            return;
        }
        ContentArea listArea = this.contentArea();
        if (!this.inside(listArea, mouseX, mouseY)) {
            return;
        }
        Iterable $this$filter$iv = this.renderedModelCards;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            AnimatedListTracker.Item it = (AnimatedListTracker.Item)element$iv$iv;
            boolean bl = false;
            if (!it.getPresent()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$forEach$iv = (List)destination$iv$iv;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            AnimatedListTracker.Item animatedCard = (AnimatedListTracker.Item)element$iv;
            boolean bl = false;
            FiguraAvatarInstaller.AvatarEntry avatar = ((CategoryComponent.ModelCard)animatedCard.getValue()).getAvatar();
            ContentArea bounds = this.modelsCardBounds(listArea, animatedCard.getPosition(), this.scroll.value());
            if (!this.inside(bounds, mouseX, mouseY)) continue;
            String avatarId = avatar.id();
            boolean isSelected = Intrinsics.areEqual(this.selectedModelAvatarId, avatarId) || \u0637\u0642.isApplied(avatarId) || \u0637\u0642.isApplying(avatarId);
            if (isSelected) {
                this.selectedModelAvatarId = "";
                \u0637\u0642.removeAppliedAvatar();
            } else {
                void var13_16;
                Intrinsics.checkNotNull(avatarId);
                this.selectedModelAvatarId = avatarId;
                \u0637\u0642.installAndApplyAsync((String)var13_16);
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public \u062c\u0631(@NotNull Category category, float panelWidth, float contentTopOffset) {
        void var7_8;
        void $this$filterTo$iv$iv;
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
        this.panelWidth = panelWidth;
        this.contentTopOffset = contentTopOffset;
        this.modelsCardColumns = 4;
        this.modelsCardHeight = 74.0f;
        this.modelsPreviewMaxWidth = 40.0f;
        this.modelCatalog = new \u0628\u0632();
        this.modelListAnimations = new \u062b\u0651(0.0f, 0.0f, 3, null);
        this.modelHoverAnimations = new HashMap();
        this.modelSelectionAnimations = new HashMap();
        this.renderedModelCards = CollectionsKt.emptyList();
        this.selectedModelAvatarId = "";
        Iterable $this$filter$iv = \u062e\u064b.INSTANCE.getModules();
        \u062c\u0631 \u062c\u06312 = this;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            void var10_11;
            Module it = (Module)element$iv$iv;
            boolean bl = false;
            if (!Intrinsics.areEqual(it.getCategory(), this.category)) continue;
            destination$iv$iv.add(var10_11);
        }
        \u062c\u06312.categoryModules = (List)var7_8;
        this.moduleStates = new LinkedHashMap();
        this.emptyStateAnimation = new AnimationUtil(0.0f, 1, null);
        this.scroll = new ScrollUtil(0.0f, 1, null);
        this.normalizedSearch = "";
        this.lastModuleSignature = "";
        this.syncModuleStates();
    }

    public final float scrollViewHeight() {
        return this.cachedViewHeight;
    }

    private final float modelsCardsHeight(int cardCount) {
        if (cardCount <= 0) {
            return 0.0f;
        }
        int rows = (cardCount + this.modelsCardColumns - 1) / this.modelsCardColumns;
        return (float)rows * this.modelsCardHeight + (float)(rows + -1) * this.getPadding();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        void $this$filterTo$iv$iv;
        super.onMouseRelease(mouseX, mouseY, button);
        Collection<CategoryComponent.ModuleLayoutState> collection = this.moduleStates.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$filter$iv = collection;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            void var11_13;
            CategoryComponent.ModuleLayoutState p0 = (CategoryComponent.ModuleLayoutState)element$iv$iv;
            boolean bl = false;
            if (!var11_13.getPresent()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$forEach$iv = (List)destination$iv$iv;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            CategoryComponent.ModuleLayoutState it = (CategoryComponent.ModuleLayoutState)element$iv;
            boolean bl = false;
            it.getComponent().onMouseRelease(mouseX, mouseY, button);
        }
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        super.onMouseScroll(mouseX, mouseY, vertical);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        this.scrollWheel(vertical);
    }

    public final void setSearchQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String string = ((Object)StringsKt.trim((CharSequence)query)).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        String normalized = string;
        if (Intrinsics.areEqual(normalized, this.normalizedSearch)) {
            return;
        }
        this.normalizedSearch = normalized;
        if (this.isModelsCategory()) {
            this.scroll = new ScrollUtil(0.0f, 1, null);
            return;
        }
        this.syncModuleStates();
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    public final void scrollWheel(float vertical) {
        this.scroll.scroll(vertical * 2.5f);
    }

    private final void renderEmptyState(float contentLeft, float contentTop, float contentWidth, float contentHeight, float progress) {
        block3: {
            block2: {
                if (contentWidth <= 0.0f) break block2;
                if (!(contentHeight <= 0.0f)) break block3;
            }
            return;
        }
        float textSize = 12.0f;
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT), "\u041d\u0438\u0447\u0435\u0433\u043e \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e :(", contentLeft + contentWidth * 0.45f, contentTop + (contentHeight - textSize) * 0.45f, textSize, \u062b\u0652.INSTANCE.value(this.getAlpha() * 0.5f * progress), 0.0f, 32, null);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderModelsContent(ContentArea listArea, int mouseX, int mouseY) {
        void var3_3;
        void var8_7;
        void $this$mapTo$iv$iv;
        Iterable $this$map$iv = this.modelCatalog.cards(this.normalizedSearch);
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            FiguraAvatarInstaller.AvatarEntry avatar = (FiguraAvatarInstaller.AvatarEntry)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            String string = avatar.id();
            Intrinsics.checkNotNullExpressionValue(string, "id(...)");
            collection.add(new CategoryComponent.ModelCard(string, avatar));
        }
        List cards = (List)var8_7;
        this.renderedModelCards = this.modelListAnimations.update(cards, \u0638\u0648.INSTANCE);
        this.cachedTotalHeight = this.modelsCardsHeight(cards.size());
        this.cachedViewHeight = listArea.getHeight();
        this.scroll.setMax(RangesKt.coerceAtLeast(this.cachedTotalHeight - this.cachedViewHeight, 0.0f));
        this.scroll.update();
        this.renderModelsCards(listArea, this.renderedModelCards, this.scroll.value(), mouseX, (int)var3_3);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderModelsCards(ContentArea area, List<AnimatedListTracker.Item<CategoryComponent.ModelCard>> cards, float scrollOffset, int mouseX, int mouseY) {
        block4: {
            block3: {
                if (area.getWidth() <= 0.0f) break block3;
                if (!(area.getHeight() <= 0.0f)) break block4;
            }
            return;
        }
        \u062c\u0650.INSTANCE.start(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight());
        Iterable $this$forEach$iv = cards;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var10_10;
            AnimatedListTracker.Item animatedCard = (AnimatedListTracker.Item)element$iv;
            boolean bl = false;
            ContentArea bounds = this.modelsCardBounds(area, animatedCard.getPosition(), scrollOffset);
            ContentArea renderBounds = ContentArea.copy$default(bounds, 0.0f, bounds.getTop() + (1.0f - animatedCard.getPresence()) * 5.0f, 0.0f, 0.0f, 13, null);
            if (!(renderBounds.getTop() + renderBounds.getHeight() > area.getTop()) || !(renderBounds.getTop() < area.getTop() + area.getHeight())) continue;
            this.renderModelsCard(renderBounds, (CategoryComponent.ModelCard)animatedCard.getValue(), mouseX, mouseY, var10_10.getPresence());
        }
        \u062c\u0650.INSTANCE.end();
    }

    static {
        Companion = new \u0629(null);
        Category[] categoryArray = new Category[3];
        categoryArray[0] = \u0638\u0646.getRENDER();
        categoryArray[1] = \u0638\u0646.getPLAYER();
        categoryArray[2] = \u0638\u0646.getHUD();
        MODULE_CATEGORIES = SetsKt.setOf(categoryArray);
    }

    public final float scrollMaxValue() {
        return this.scroll.max();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        void $this$filterTo$iv$iv;
        super.onMouseClick(mouseX, mouseY, button);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        if (this.isModelsCategory()) {
            this.handleModelsClick(mouseX, mouseY, button);
            return;
        }
        Collection<CategoryComponent.ModuleLayoutState> collection = this.moduleStates.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$filter$iv = collection;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            void var10_12;
            void var11_13;
            CategoryComponent.ModuleLayoutState p0 = (CategoryComponent.ModuleLayoutState)element$iv$iv;
            boolean bl = false;
            if (!var11_13.getPresent()) continue;
            destination$iv$iv.add(var10_12);
        }
        Iterable $this$forEach$iv = (List)destination$iv$iv;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var3_3;
            void var2_2;
            CategoryComponent.ModuleLayoutState it = (CategoryComponent.ModuleLayoutState)element$iv;
            boolean bl = false;
            it.getComponent().onMouseClick(mouseX, (int)var2_2, (int)var3_3);
        }
    }

    private final ContentArea contentArea() {
        float left = this.getX() + this.panelWidth + this.getPadding();
        float right = this.getX() + this.getWidth() - this.panelWidth / 3.0f;
        float top = this.getY() + this.contentTopOffset;
        float width = RangesKt.coerceAtLeast(right - left, 0.0f);
        float height = RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0f);
        return new ContentArea(left, top, width, height);
    }

    public final float scrollContentHeight() {
        return this.cachedTotalHeight;
    }
}

