/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.inventory;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u000fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u00020\u0018H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u00020\u001bH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u000f\u00a8\u0006#"}, d2={"Loxxxde/\u0638\u0622;", "", "", "x", "y", "width", "height", "<init>", "(FFFF)V", "pointX", "pointY", "", "contains", "(FF)Z", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lkotakbaz/rain/ui/inventory/UiRect;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getX", "getY", "getWidth", "getHeight", "rain-visuals"})
public final class UiRect {
    private final float height;
    private final float y;
    private final float width;
    private final float x;

    public final float component4() {
        return this.height;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRect)) {
            return false;
        }
        UiRect uiRect = (UiRect)other;
        if (Float.compare(this.x, uiRect.x) != 0) {
            return false;
        }
        if (Float.compare(this.y, uiRect.y) != 0) {
            return false;
        }
        if (Float.compare(this.width, uiRect.width) != 0) {
            return false;
        }
        if (Float.compare(this.height, uiRect.height) != 0) {
            return false;
        }
        return true;
    }

    public final float component2() {
        return this.y;
    }

    public int hashCode() {
        int result = Float.hashCode(this.x);
        result = result * 31 + Float.hashCode(this.y);
        result = result * 31 + Float.hashCode(this.width);
        result = result * 31 + Float.hashCode(this.height);
        return result;
    }

    @NotNull
    public String toString() {
        return "UiRect(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public final float getHeight() {
        return this.height;
    }

    @NotNull
    public final UiRect copy(float x, float y, float width, float height) {
        return new UiRect(x, y, width, height);
    }

    public static /* synthetic */ UiRect copy$default(UiRect uiRect, float f, float f2, float f3, float f4, int n, Object object) {
        if ((n & 1) != 0) {
            f = uiRect.x;
        }
        if ((n & 2) != 0) {
            f2 = uiRect.y;
        }
        if ((n & 4) != 0) {
            f3 = uiRect.width;
        }
        if ((n & 8) != 0) {
            f4 = uiRect.height;
        }
        return uiRect.copy(f, f2, f3, f4);
    }

    public final float getY() {
        return this.y;
    }

    public final float getWidth() {
        return this.width;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean contains(float pointX, float pointY) {
        float f = this.x;
        if (!(pointX <= this.x + this.width)) return false;
        if (!(f <= pointX)) return false;
        boolean bl = true;
        if (!bl) return false;
        f = this.y;
        if (!(pointY <= this.y + this.height)) return false;
        if (!(f <= pointY)) return false;
        return true;
    }

    public UiRect(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public final float getX() {
        return this.x;
    }

    public final float component3() {
        return this.width;
    }

    public final float component1() {
        return this.x;
    }
}

