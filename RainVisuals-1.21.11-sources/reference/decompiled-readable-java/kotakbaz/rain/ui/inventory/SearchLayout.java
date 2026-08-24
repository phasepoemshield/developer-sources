/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.inventory;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0010JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u00020\u001aH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u00020\u001dH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u0010\u00a8\u0006&"}, d2={"Loxxxde/\u0638\u0626;", "", "", "searchX", "y", "searchWidth", "actionX", "rowWidth", "<init>", "(FFFFF)V", "x", "", "isInsideSearch", "(FF)Z", "isInsideAction", "component1", "()F", "component2", "component3", "component4", "component5", "copy", "(FFFFF)Lkotakbaz/rain/ui/inventory/SearchLayout;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getSearchX", "getY", "getSearchWidth", "getActionX", "getRowWidth", "rain-visuals"})
public final class SearchLayout {
    private final float searchWidth;
    private final float actionX;
    private final float rowWidth;
    private final float y;
    private final float searchX;

    public final float component4() {
        return this.actionX;
    }

    @NotNull
    public String toString() {
        return "SearchLayout(searchX=" + this.searchX + ", y=" + this.y + ", searchWidth=" + this.searchWidth + ", actionX=" + this.actionX + ", rowWidth=" + this.rowWidth + ")";
    }

    public final float component5() {
        return this.rowWidth;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isInsideAction(float x, float y) {
        float f = this.actionX;
        if (!(x <= this.actionX + 27.0f)) return false;
        if (!(f <= x)) return false;
        boolean bl = true;
        if (!bl) return false;
        f = this.y;
        if (!(y <= this.y + 27.0f)) return false;
        if (!(f <= y)) return false;
        return true;
    }

    public final float component3() {
        return this.searchWidth;
    }

    public final float getSearchX() {
        return this.searchX;
    }

    public final float getRowWidth() {
        return this.rowWidth;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isInsideSearch(float x, float y) {
        float f = this.searchX;
        if (!(x <= this.searchX + this.searchWidth)) return false;
        if (!(f <= x)) return false;
        boolean bl = true;
        if (!bl) return false;
        f = this.y;
        if (!(y <= this.y + 27.0f)) return false;
        if (!(f <= y)) return false;
        return true;
    }

    public final float component1() {
        return this.searchX;
    }

    @NotNull
    public final SearchLayout copy(float searchX, float y, float searchWidth, float actionX, float rowWidth) {
        return new SearchLayout(searchX, y, searchWidth, actionX, rowWidth);
    }

    public static /* synthetic */ SearchLayout copy$default(SearchLayout searchLayout, float f, float f2, float f3, float f4, float f5, int n, Object object) {
        if ((n & 1) != 0) {
            f = searchLayout.searchX;
        }
        if ((n & 2) != 0) {
            f2 = searchLayout.y;
        }
        if ((n & 4) != 0) {
            f3 = searchLayout.searchWidth;
        }
        if ((n & 8) != 0) {
            f4 = searchLayout.actionX;
        }
        if ((n & 0x10) != 0) {
            f5 = searchLayout.rowWidth;
        }
        return searchLayout.copy(f, f2, f3, f4, f5);
    }

    public int hashCode() {
        int result = Float.hashCode(this.searchX);
        result = result * 31 + Float.hashCode(this.y);
        result = result * 31 + Float.hashCode(this.searchWidth);
        result = result * 31 + Float.hashCode(this.actionX);
        result = result * 31 + Float.hashCode(this.rowWidth);
        return result;
    }

    public final float component2() {
        return this.y;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchLayout)) {
            return false;
        }
        SearchLayout searchLayout = (SearchLayout)other;
        if (Float.compare(this.searchX, searchLayout.searchX) != 0) {
            return false;
        }
        if (Float.compare(this.y, searchLayout.y) != 0) {
            return false;
        }
        if (Float.compare(this.searchWidth, searchLayout.searchWidth) != 0) {
            return false;
        }
        if (Float.compare(this.actionX, searchLayout.actionX) != 0) {
            return false;
        }
        if (Float.compare(this.rowWidth, searchLayout.rowWidth) != 0) {
            return false;
        }
        return true;
    }

    public final float getActionX() {
        return this.actionX;
    }

    public final float getSearchWidth() {
        return this.searchWidth;
    }

    public final float getY() {
        return this.y;
    }

    public SearchLayout(float searchX, float y, float searchWidth, float actionX, float rowWidth) {
        this.searchX = searchX;
        this.y = y;
        this.searchWidth = searchWidth;
        this.actionX = actionX;
        this.rowWidth = rowWidth;
    }
}

