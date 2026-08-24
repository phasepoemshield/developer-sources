/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import java.awt.Color;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.ConfigEntryActionBounds;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a\u064a;
import oxxxde.\u062b\u062a;
import oxxxde.\u062b\u0635;
import oxxxde.\u062b\u0652;
import oxxxde.\u062e\u062e;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0635\u0634;
import oxxxde.\u0635\u0639;
import oxxxde.\u0638\u0637;
import oxxxde.\u064c;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u00012\u00020\u0002Bs\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0014J'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!\u00a2\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0004\b$\u0010%J5\u0010&\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0004\b(\u0010%J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020!H\u0002\u00a2\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020!H\u0002\u00a2\u0006\u0004\b,\u0010#J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b1\u0010%J\u0017\u00103\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b6\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u00109R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010;R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010;R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010<R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010<R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010<R\u0014\u0010=\u001a\u00020\u001a8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u001a8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020\u001a8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020\u001a8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020\u001a8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020\u001a8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\bC\u0010>R\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010FR\u0014\u0010J\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010K\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010FR\u0014\u0010L\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bL\u0010FR\u0014\u0010M\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010FR\u0016\u0010N\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bN\u0010>R\u0016\u0010O\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bO\u0010>R\"\u0010P\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bP\u0010;\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bU\u0010;\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR\"\u0010X\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bX\u0010;\u001a\u0004\bY\u0010R\"\u0004\bZ\u0010TR\"\u0010[\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b[\u00107\u001a\u0004\b\\\u00109\"\u0004\b]\u0010^R\u0017\u0010_\u001a\u00020\u001a8\u0006\u00a2\u0006\f\n\u0004\b_\u0010>\u001a\u0004\b`\u0010a\u00a8\u0006b"}, d2={"Loxxxde/\u062d\u0645;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "", "configName", "displayName", "authorName", "", "cloudConfig", "ownedCloudConfig", "sharedCloudConfig", "Lkotlin/Function1;", "", "onLoad", "onSettings", "onDelete", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "", "mouseX", "mouseY", "", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "Loxxxde/\u0632\u0635;", "settingsButtonBounds", "()Lkotakbaz/rain/ui/menu/ConfigEntryActionBounds;", "isInsideSettings", "(FF)Z", "matchesMetadata", "(Ljava/lang/String;Ljava/lang/String;ZZZ)Z", "isInsideRenameEditor", "bounds", "renderNameEditor", "(Lkotakbaz/rain/ui/menu/ConfigEntryActionBounds;)V", "nameEditorBounds", "text", "maxWidth", "trimTextToFit", "(Ljava/lang/String;F)Ljava/lang/String;", "isInsideDelete", "iconSize", "deleteIconX", "(F)F", "settingsIconX", "cloudIconX", "Ljava/lang/String;", "getConfigName", "()Ljava/lang/String;", "getDisplayName", "Z", "Lkotlin/jvm/functions/Function1;", "rowHeight", "F", "nameEditorHeight", "nameEditorTextSize", "nameEditorTextPadding", "nameEditorSelectedExpand", "nameEditorMinWidth", "Loxxxde/\u0631\u064a;", "selectedAnimation", "Loxxxde/\u0631\u064a;", "loadedAnimation", "deleteHoverAnimation", "settingsHoverAnimation", "cardHoverAnimation", "sharedIndicatorAnimation", "renameWidthAnimation", "renameFocusAnimation", "lastRenameInputWidth", "lastRenameMaxInputWidth", "selected", "getSelected", "()Z", "setSelected", "(Z)V", "loaded", "getLoaded", "setLoaded", "renaming", "getRenaming", "setRenaming", "renameText", "getRenameText", "setRenameText", "(Ljava/lang/String;)V", "defaultHeight", "getDefaultHeight", "()F", "rain-visuals"})
public final class ConfigEntryComponent
extends \u0627\u0638
implements PipelinedRender {
    @NotNull
    private final AnimationUtil settingsHoverAnimation;
    @NotNull
    private final String authorName;
    @NotNull
    private final AnimationUtil renameWidthAnimation;
    @NotNull
    private final AnimationUtil selectedAnimation;
    private final float nameEditorTextSize;
    private final float rowHeight;
    @NotNull
    private final AnimationUtil sharedIndicatorAnimation;
    private final float nameEditorSelectedExpand;
    @NotNull
    private String renameText;
    private final float defaultHeight;
    @NotNull
    private final String configName;
    @NotNull
    private final Function1<String, Unit> onDelete;
    private final float nameEditorHeight;
    private boolean renaming;
    private final float nameEditorTextPadding;
    private final boolean ownedCloudConfig;
    private boolean loaded;
    @NotNull
    private final AnimationUtil deleteHoverAnimation;
    private final float nameEditorMinWidth;
    @NotNull
    private final Function1<String, Unit> onSettings;
    private float lastRenameMaxInputWidth;
    @NotNull
    private final Function1<String, Unit> onLoad;
    private final boolean sharedCloudConfig;
    private float lastRenameInputWidth;
    private boolean selected;
    @NotNull
    private final String displayName;
    @NotNull
    private final AnimationUtil cardHoverAnimation;
    @NotNull
    private final AnimationUtil loadedAnimation;
    @NotNull
    private final AnimationUtil renameFocusAnimation;
    private final boolean cloudConfig;

    /*
     * WARNING - void declaration
     */
    private final float settingsIconX(float iconSize) {
        void var2_2;
        float iconWidth = Font.getWidth$default(this.getIconFont(), "f", iconSize, 0.0f, 4, null);
        return this.cloudConfig ? this.cloudIconX(5.5f) - this.getPadding() - iconWidth : this.deleteIconX(6.2f) - this.getPadding() - var2_2;
    }

    public ConfigEntryComponent(@NotNull String configName, @NotNull String displayName, @NotNull String authorName, boolean cloudConfig, boolean ownedCloudConfig, boolean sharedCloudConfig, @NotNull Function1<? super String, Unit> onLoad, @NotNull Function1<? super String, Unit> onSettings, @NotNull Function1<? super String, Unit> onDelete) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        Intrinsics.checkNotNullParameter(onSettings, "onSettings");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        this.configName = configName;
        this.displayName = displayName;
        this.authorName = authorName;
        this.cloudConfig = cloudConfig;
        this.ownedCloudConfig = ownedCloudConfig;
        this.sharedCloudConfig = sharedCloudConfig;
        this.onLoad = onLoad;
        this.onSettings = onSettings;
        this.onDelete = onDelete;
        this.rowHeight = 33.0f;
        this.nameEditorHeight = 10.8f;
        this.nameEditorTextSize = 5.9f;
        this.nameEditorTextPadding = 4.0f;
        this.nameEditorSelectedExpand = 6.0f;
        this.nameEditorMinWidth = 26.0f;
        this.selectedAnimation = new AnimationUtil(0.0f, 1, null);
        this.loadedAnimation = new AnimationUtil(0.0f, 1, null);
        this.deleteHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.settingsHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.cardHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.sharedIndicatorAnimation = new AnimationUtil(0.0f, 1, null);
        this.renameWidthAnimation = new AnimationUtil(0.0f, 1, null);
        this.renameFocusAnimation = new AnimationUtil(0.0f, 1, null);
        this.lastRenameInputWidth = this.nameEditorMinWidth;
        this.lastRenameMaxInputWidth = this.nameEditorMinWidth;
        this.renameText = "";
        this.defaultHeight = this.rowHeight;
    }

    public final void setLoaded(boolean bl) {
        this.loaded = bl;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean bl) {
        this.selected = bl;
    }

    private final float deleteIconX(float iconSize) {
        return this.getX() + this.getWidth() - this.getPadding() * 1.6f - Font.getWidth$default(this.getIconFont(), "i", iconSize, 0.0f, 4, null);
    }

    public final void setRenaming(boolean bl) {
        this.renaming = bl;
    }

    @NotNull
    public final String getConfigName() {
        return this.configName;
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean matchesMetadata(@NotNull String displayName, @NotNull String authorName, boolean cloudConfig, boolean ownedCloudConfig, boolean sharedCloudConfig) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        if (!Intrinsics.areEqual(this.displayName, displayName)) return false;
        if (!Intrinsics.areEqual(this.authorName, authorName)) return false;
        if (this.cloudConfig != cloudConfig) return false;
        if (this.ownedCloudConfig != ownedCloudConfig) return false;
        if (this.sharedCloudConfig != sharedCloudConfig) return false;
        return true;
    }

    public final boolean isInsideSettings(float mouseX, float mouseY) {
        return this.settingsButtonBounds().contains(mouseX, mouseY);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    /*
     * WARNING - void declaration
     */
    private final ConfigEntryActionBounds nameEditorBounds() {
        void var9_12;
        float animatedWidth;
        CharSequence charSequence;
        float left = this.getX() + this.getPadding() * 1.5f;
        float hardMax = RangesKt.coerceAtLeast(this.settingsButtonBounds().getLeft() - left - this.getPadding() * 0.8f, 0.0f);
        CharSequence charSequence2 = this.renameText;
        boolean bl = charSequence2.length() == 0;
        if (bl) {
            boolean bl2 = false;
            charSequence = "Text..";
        } else {
            charSequence = charSequence2;
        }
        String displayText = (String)charSequence;
        float contentWidth = Font.getWidth$default(this.getDefaultFont(), displayText, this.nameEditorTextSize, 0.0f, 4, null);
        float desiredWidth = contentWidth + this.nameEditorTextPadding * 2.0f + this.nameEditorSelectedExpand;
        float minAllowed = RangesKt.coerceAtMost(this.nameEditorMinWidth, hardMax);
        float targetWidth = hardMax <= 0.0f ? 0.0f : RangesKt.coerceIn(desiredWidth, minAllowed, hardMax);
        float duration = targetWidth > this.lastRenameInputWidth ? 70.0f : 240.0f;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        this.lastRenameInputWidth = animatedWidth = this.renameWidthAnimation.animate(targetWidth, duration, new \u062b\u062a(\u0628\u06412));
        this.lastRenameMaxInputWidth = hardMax;
        return new ConfigEntryActionBounds(left, this.getY() + this.getPadding() * 1.5f - 1.8f, (float)var9_12, this.nameEditorHeight);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderNameEditor(ConfigEntryActionBounds bounds) {
        String renderText;
        block5: {
            block4: {
                if (bounds.getWidth() <= 0.0f) break block4;
                if (!(bounds.getHeight() <= 0.0f)) break block5;
            }
            return;
        }
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float focus = this.renameFocusAnimation.animate(1.0f, 220.0f, new \u0638\u0637(\u0628\u06412));
        float textMaxWidth = RangesKt.coerceAtLeast(bounds.getWidth() - this.nameEditorTextPadding * 2.0f - 1.0f, 0.0f);
        boolean nearLimit = bounds.getWidth() >= this.lastRenameMaxInputWidth - 1.0f;
        String string = renderText = nearLimit ? this.trimTextToFit(this.renameText, textMaxWidth) : this.renameText;
        Color textColor = ((CharSequence)this.renameText).length() == 0 ? \u062b\u0652.INSTANCE.value(this.getAlpha() * 0.42f) : \u062b\u0652.INSTANCE.value(this.getAlpha() * (0.82f + 0.1f * focus));
        boolean caretVisible = System.currentTimeMillis() / 450L % 2L == 0L;
        float caretReserve = Font.getWidth$default(this.getDefaultFont(), "|", this.nameEditorTextSize, 0.0f, 4, null) + 0.5f;
        float textWidth = Font.getWidth$default(this.getDefaultFont(), renderText, this.nameEditorTextSize, 0.0f, 4, null);
        float textX = bounds.getLeft() + (bounds.getWidth() - textWidth - caretReserve) * 0.5f;
        float textY = bounds.getTop() + 1.8f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(\u062b\u0652.INSTANCE.surface(this.getAlpha() * 0.05f)).round(2.2f).mix(0.95f).border(1.0f, \u062b\u0652.INSTANCE.title(this.getAlpha() * 0.08f)).draw(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight());
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), renderText, textX, textY, this.nameEditorTextSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (caretVisible) {
            void var6_7;
            void var11_12;
            void var9_10;
            Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), "|", textX + var9_10 + 0.5f, (float)var11_12, this.nameEditorTextSize, (Color)var6_7, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
    }

    public final float getDefaultHeight() {
        return this.defaultHeight;
    }

    private final boolean isInsideDelete(float mouseX, float mouseY) {
        float iconSize = 8.0f;
        float areaSize = 14.0f;
        float iconX = this.deleteIconX(iconSize);
        float iconY = this.getY() + (this.getHeight() - this.getIconFont().getHeight(iconSize)) * 0.5f - 0.6f;
        float areaX = iconX - (areaSize - Font.getWidth$default(this.getIconFont(), "i", iconSize, 0.0f, 4, null)) * 0.5f;
        float areaY = this.getY() + (this.getHeight() - areaSize) * 0.5f;
        return mouseX >= areaX && mouseX <= areaX + areaSize && mouseY >= areaY && mouseY <= areaY + areaSize;
    }

    public final boolean isInsideRenameEditor(float mouseX, float mouseY) {
        if (!this.renaming) {
            return false;
        }
        float left = this.getX() + this.getPadding() * 1.5f;
        float right = this.settingsButtonBounds().getLeft() - this.getPadding() * 0.8f;
        float top = this.getY() + this.getPadding() * 1.5f - 1.8f;
        return mouseX >= left && mouseX <= right && mouseY >= top && mouseY <= top + this.nameEditorHeight;
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    public final boolean getLoaded() {
        return this.loaded;
    }

    private final float cloudIconX(float iconSize) {
        return this.deleteIconX(6.2f) - this.getPadding() - Font.getWidth$default(\u0631\u064e.INSTANCE.getICON2(), "4", iconSize, 0.0f, 4, null);
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        block7: {
            block6: {
                super.onMouseClick(mouseX, mouseY, button);
                if (button != 0) {
                    return;
                }
                if ((float)mouseX < this.getX() || (float)mouseX > this.getX() + this.getWidth()) break block6;
                if ((float)mouseY < this.getY()) break block6;
                if (!((float)mouseY > this.getY() + this.getHeight())) break block7;
            }
            return;
        }
        if (this.isInsideSettings(mouseX, mouseY)) {
            this.onSettings.invoke(this.configName);
            return;
        }
        if (this.isInsideDelete(mouseX, mouseY)) {
            this.onDelete.invoke(this.configName);
            return;
        }
        this.onLoad.invoke(this.configName);
    }

    @NotNull
    public final String getRenameText() {
        return this.renameText;
    }

    public final void setRenameText(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.renameText = string;
    }

    public final boolean getRenaming() {
        return this.renaming;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        super.render(mouseX, mouseY, partialTicks);
        if (!((float)mouseX >= this.getX()) || !((float)mouseX <= this.getX() + this.getWidth())) ** GOTO lbl-1000
        if (!((float)mouseY >= this.getY())) ** GOTO lbl-1000
        if ((float)mouseY <= this.getY() + this.getHeight()) {
            v0 = true;
        } else lbl-1000:
        // 3 sources

        {
            v0 = false;
        }
        hovered = v0;
        var6_5 = \u0628\u0641.INSTANCE;
        selection = this.selectedAnimation.animate(this.selected ? 1.0f : 0.0f, 220.0f, new \u0635\u0639(var6_5));
        if (!hovered) ** GOTO lbl-1000
        if (this.isInsideDelete(mouseX, mouseY)) {
            v1 = 1.0f;
        } else lbl-1000:
        // 2 sources

        {
            v1 = 0.0f;
        }
        var7_8 = \u0628\u0641.INSTANCE;
        deleteHover = this.deleteHoverAnimation.animate(v1, 180.0f, new \u062b\u0635(var7_8));
        if (!hovered) ** GOTO lbl-1000
        if (this.isInsideSettings(mouseX, mouseY)) {
            v2 = 1.0f;
        } else lbl-1000:
        // 2 sources

        {
            v2 = 0.0f;
        }
        var8_10 = \u0628\u0641.INSTANCE;
        settingsHover = this.settingsHoverAnimation.animate(v2, 180.0f, new \u064c(var8_10));
        var9_12 = \u0628\u0641.INSTANCE;
        cardHover = RangesKt.coerceIn(this.cardHoverAnimation.animate(hovered ? 1.0f : 0.0f, 180.0f, new \u062e\u062e(var9_12)), 0.0f, 1.0f);
        backgroundColor = \u062b\u0652.INSTANCE.surface(this.getAlpha() * (0.03f + 0.02f * selection + 0.015f * cardHover));
        borderColor = \u062b\u0652.INSTANCE.title(this.getAlpha() * (0.05f + 0.03f * selection + 0.035f * cardHover));
        nameColor = \u062b\u0652.INSTANCE.title(this.getAlpha() * (0.32f + 0.68f * selection + 0.1f * cardHover * (1.0f - selection)));
        hintColor = \u062b\u0652.INSTANCE.value(this.getAlpha() * (0.16f + 0.34f * selection + 0.08f * cardHover));
        settingsIconColor = \u0628\u062d.INSTANCE.setAlpha(\u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.icon$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), selection), this.getAlpha() * RangesKt.coerceAtMost(0.28f + 0.42f * selection + 0.25f * settingsHover, 1.0f));
        deleteIconColor = \u0628\u062d.INSTANCE.setAlpha(\u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.icon$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), selection), this.getAlpha() * RangesKt.coerceAtMost(0.28f + 0.42f * selection + 0.25f * deleteHover, 1.0f));
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        nameSize = 8.0f;
        hintSize = 5.6f;
        textX = this.getX() + this.getPadding() * 1.5f;
        nameY = this.getY() + this.getPadding() * 1.5f;
        v3 = editorBounds = this.renaming ? this.nameEditorBounds() : null;
        if (v3 != null) {
            it = v3;
            $i$a$-let-ConfigEntryComponent$render$hintY$1 = false;
            v4 = it.getTop() + it.getHeight() + 4.0f;
        } else {
            v4 = nameY + this.getDefaultFont().getHeight(nameSize) + this.getPadding() / 1.5f;
        }
        hintY = v4;
        deleteIconSize = 6.2f;
        deleteX = this.deleteIconX(deleteIconSize);
        deleteY = this.getY() + (this.getHeight() - this.getIconFont().getHeight(deleteIconSize)) * 0.5f - 0.2f;
        settingsIcon = "f";
        settingsIconSize = 5.5f;
        settingsX = this.settingsIconX(settingsIconSize);
        settingsFont = this.getIconFont();
        settingsY = this.getY() + (this.getHeight() - settingsFont.getHeight(settingsIconSize)) * 0.5f;
        cloudIconSize = 5.5f;
        cloudX = this.cloudIconX(cloudIconSize);
        cloudY = this.getY() + (this.getHeight() - \u0631\u064e.INSTANCE.getICON2().getHeight(cloudIconSize)) * 0.5f;
        var33_37 = \u0628\u0641.INSTANCE;
        loadedProgress = RangesKt.coerceIn(this.loadedAnimation.animate(this.loaded ? 1.0f : 0.0f, 220.0f, new \u0635\u0634(var33_37)), 0.0f, 1.0f);
        cloudIconColor = \u0628\u062d.INSTANCE.setAlpha(\u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.icon$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), new Color(62, 255, 126), loadedProgress), this.getAlpha() * (0.28f + 0.72f * loadedProgress));
        var35_39 = \u0628\u0641.INSTANCE;
        sharedIndicator = RangesKt.coerceIn(this.sharedIndicatorAnimation.animate(this.ownedCloudConfig && this.sharedCloudConfig ? 1.0f : 0.0f, 220.0f, new \u062a\u064a(var35_39)), 0.0f, 1.0f);
        indicatorColor = \u0628\u062d.INSTANCE.setAlpha(\u0628\u062d.INSTANCE.interpolateColor(\u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.value$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), \u062b\u0652.title$default(\u062b\u0652.INSTANCE, 0.0f, 1, null), selection), new Color(62, 255, 126), sharedIndicator), this.getAlpha());
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(indicatorColor).round(0.3f).draw(this.getX() + this.getWidth() - this.getPadding() * 1.5f, this.getY() + this.getPadding(), 2.5f, 2.5f);
        if (editorBounds != null) {
            this.renderNameEditor(editorBounds);
        } else {
            Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), this.displayName, textX, nameY, nameSize, nameColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), "\u0410\u0432\u0442\u043e\u0440: " + this.authorName, textX, hintY, hintSize, hintColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(settingsFont.priority(this.iconsPipeline()), settingsIcon, settingsX, settingsY, settingsIconSize, settingsIconColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (this.cloudConfig) {
            Font.drawText$default(\u0631\u064e.INSTANCE.getICON2().priority(this.iconsPipeline()), "4", (float)var30_35, (float)var31_36, (float)var29_34, (Color)var33_37, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
        Font.drawText$default(this.getIconFont().priority(this.iconsPipeline()), "i", (float)var22_29, (float)var23_24, (float)var21_28, (Color)var14_17, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final ConfigEntryActionBounds settingsButtonBounds() {
        void var2_2;
        float iconSize = 5.5f;
        float areaSize = 10.0f;
        float iconX = this.settingsIconX(iconSize);
        float iconWidth = Font.getWidth$default(this.getIconFont(), "f", iconSize, 0.0f, 4, null);
        return new ConfigEntryActionBounds(iconX - (areaSize - iconWidth) * 0.5f, this.getY() + (this.getHeight() - areaSize) * 0.5f, areaSize, (float)var2_2);
    }

    private final String trimTextToFit(String text, float maxWidth) {
        String string;
        if (maxWidth <= 0.0f) {
            return "";
        }
        String candidate = text;
        while (true) {
            boolean bl = ((CharSequence)candidate).length() > 0;
            if (!bl) break;
            if (!(Font.getWidth$default(this.getDefaultFont(), candidate, this.nameEditorTextSize, 0.0f, 4, null) > maxWidth)) break;
            string = StringsKt.dropLast(candidate, 1);
        }
        return string;
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }
}

