/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.modules.hud.container.Data;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0631\u064e;
import oxxxde.\u0637\u063a;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\rR\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*\"\u0004\b5\u0010\rR\"\u00106\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*\"\u0004\b8\u0010\rR\"\u00109\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010\rR\u0016\u0010<\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010.R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010\"R\u0017\u0010?\u001a\u00020>8\u0006\u00a2\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\u00a8\u0006C"}, d2={"Loxxxde/\u062a\u064b;", "", "Loxxxde/\u0635\u0647;", "first", "Loxxxde/\u062a\u0650;", "second", "<init>", "(Lkotakbaz/rain/module/modules/hud/container/Data$First;Lkotakbaz/rain/module/modules/hud/container/Data$Second;)V", "", "updateData", "", "textSize", "updateSize", "(F)V", "gapBetweenColumns", "totalWidth", "(F)F", "Loxxxde/\u062f\u063a;", "previous", "current", "", "leadingWidthChanged", "(Lkotakbaz/rain/module/modules/hud/container/Data$Leading;Lkotakbaz/rain/module/modules/hud/container/Data$Leading;)Z", "Loxxxde/\u0635\u0647;", "getFirst", "()Lkotakbaz/rain/module/modules/hud/container/Data$First;", "setFirst", "(Lkotakbaz/rain/module/modules/hud/container/Data$First;)V", "Loxxxde/\u062a\u0650;", "getSecond", "()Lkotakbaz/rain/module/modules/hud/container/Data$Second;", "setSecond", "(Lkotakbaz/rain/module/modules/hud/container/Data$Second;)V", "valid", "Z", "getValid", "()Z", "setValid", "(Z)V", "progress", "F", "getProgress", "()F", "setProgress", "", "seenGeneration", "I", "getSeenGeneration", "()I", "setSeenGeneration", "(I)V", "cachedWidthLeading", "getCachedWidthLeading", "setCachedWidthLeading", "cachedWidthFirst", "getCachedWidthFirst", "setCachedWidthFirst", "cachedWidthSecond", "getCachedWidthSecond", "setCachedWidthSecond", "cachedTextSizeBits", "sizeDirty", "Loxxxde/\u0631\u064a;", "animation", "Loxxxde/\u0631\u064a;", "getAnimation", "()Lkotakbaz/rain/client/util/animations/AnimationUtil;", "rain-visuals"})
public final class \u062a\u064b {
    private boolean valid;
    @NotNull
    private Data.Second second;
    private int seenGeneration;
    @NotNull
    private final AnimationUtil animation;
    private float cachedWidthFirst;
    @NotNull
    private Data.First first;
    private float progress;
    private boolean sizeDirty;
    private int cachedTextSizeBits;
    private float cachedWidthLeading;
    private float cachedWidthSecond;

    @NotNull
    public final AnimationUtil getAnimation() {
        return this.animation;
    }

    @NotNull
    public final Data.Second getSecond() {
        return this.second;
    }

    public final float getCachedWidthLeading() {
        return this.cachedWidthLeading;
    }

    public final void setSecond(@NotNull Data.Second second) {
        Intrinsics.checkNotNullParameter(second, "<set-?>");
        this.second = second;
    }

    public final void setCachedWidthFirst(float f) {
        this.cachedWidthFirst = f;
    }

    /*
     * WARNING - void declaration
     */
    public final void updateSize(float textSize) {
        void var1_1;
        float f;
        int textSizeBits = Float.floatToRawIntBits(textSize);
        if (!this.sizeDirty) {
            if (this.cachedTextSizeBits == textSizeBits) {
                return;
            }
        }
        this.cachedTextSizeBits = textSizeBits;
        this.sizeDirty = false;
        float leadingSize = \u0637\u063a.INSTANCE.rowLeadingSize(textSize);
        Data.Leading leading = this.first.getLeading();
        if (leading instanceof Data.Leading.Glyph) {
            f = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), ((Data.Leading.Glyph)leading).getText(), leadingSize, 0.0f, 4, null);
        } else if (leading instanceof Data.Leading.Texture) {
            f = leadingSize;
        } else if (leading instanceof Data.Leading.ResourceTexture) {
            f = leadingSize;
        } else if (leading instanceof Data.Leading.Item) {
            f = leadingSize;
        } else if (leading == null) {
            f = 0.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.cachedWidthLeading = f;
        float leadingGap = this.first.getLeading() != null ? \u0637\u063a.INSTANCE.rowLeadingGap() : 0.0f;
        this.cachedWidthFirst = this.cachedWidthLeading + leadingGap + Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), this.first.getText(), textSize, 0.0f, 4, null);
        this.cachedWidthSecond = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), this.second.getText(), (float)var1_1, 0.0f, 4, null);
    }

    public final int getSeenGeneration() {
        return this.seenGeneration;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public \u062a\u064b(@NotNull Data.First first, @NotNull Data.Second second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.first = first;
        this.second = second;
        this.valid = true;
        this.sizeDirty = true;
        this.animation = new AnimationUtil(0.0f);
    }

    public final float totalWidth(float gapBetweenColumns) {
        return this.cachedWidthFirst + gapBetweenColumns + this.cachedWidthSecond;
    }

    public final void setValid(boolean bl) {
        this.valid = bl;
    }

    public final float getCachedWidthSecond() {
        return this.cachedWidthSecond;
    }

    @NotNull
    public final Data.First getFirst() {
        return this.first;
    }

    public final void setFirst(@NotNull Data.First first) {
        Intrinsics.checkNotNullParameter(first, "<set-?>");
        this.first = first;
    }

    public final void setCachedWidthSecond(float f) {
        this.cachedWidthSecond = f;
    }

    public final void setCachedWidthLeading(float f) {
        this.cachedWidthLeading = f;
    }

    public final void setProgress(float f) {
        this.progress = f;
    }

    public final void setSeenGeneration(int n) {
        this.seenGeneration = n;
    }

    public final float getCachedWidthFirst() {
        return this.cachedWidthFirst;
    }

    public final float getProgress() {
        return this.progress;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean leadingWidthChanged(Data.Leading previous, Data.Leading current) {
        block5: {
            block4: {
                if (previous == null) break block4;
                if (current != null) break block5;
            }
            if (previous == current) return false;
            return true;
        }
        if (!(previous instanceof Data.Leading.Glyph)) {
            if (!(current instanceof Data.Leading.Glyph)) return false;
        }
        if (!(previous instanceof Data.Leading.Glyph)) return true;
        if (!(current instanceof Data.Leading.Glyph)) return true;
        if (Intrinsics.areEqual(((Data.Leading.Glyph)previous).getText(), ((Data.Leading.Glyph)current).getText())) return false;
        return true;
    }

    public final void updateData(@NotNull Data.First first, @NotNull Data.Second second) {
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(first, "first");
                Intrinsics.checkNotNullParameter(second, "second");
                if (!Intrinsics.areEqual(this.first.getText(), first.getText())) break block2;
                if (!Intrinsics.areEqual(this.second.getText(), second.getText())) break block2;
                if (!this.leadingWidthChanged(this.first.getLeading(), first.getLeading())) break block3;
            }
            this.sizeDirty = true;
        }
        this.first = first;
        this.second = second;
    }
}

