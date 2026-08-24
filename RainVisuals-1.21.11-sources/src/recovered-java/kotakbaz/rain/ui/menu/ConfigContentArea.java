/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u000fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u00020\u0018H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u00020\u001bH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u000f\u00a8\u0006#"}, d2={"Loxxxde/\u0630\u0623;", "", "", "left", "top", "width", "height", "<init>", "(FFFF)V", "mouseX", "mouseY", "", "contains", "(FF)Z", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lkotakbaz/rain/ui/menu/ConfigContentArea;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getLeft", "getTop", "getWidth", "getHeight", "rain-visuals"})
final class ConfigContentArea {
    private final float width;
    private final float height;
    private final float top;
    private final float left;

    public final float component2() {
        return this.top;
    }

    @NotNull
    public final ConfigContentArea copy(float left, float top, float width, float height) {
        return new ConfigContentArea(left, top, width, height);
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return this.width;
    }

    @NotNull
    public String toString() {
        return "ConfigContentArea(left=" + this.left + ", top=" + this.top + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigContentArea)) {
            return false;
        }
        ConfigContentArea configContentArea = (ConfigContentArea)other;
        if (Float.compare(this.left, configContentArea.left) != 0) {
            return false;
        }
        if (Float.compare(this.top, configContentArea.top) != 0) {
            return false;
        }
        if (Float.compare(this.width, configContentArea.width) != 0) {
            return false;
        }
        if (Float.compare(this.height, configContentArea.height) != 0) {
            return false;
        }
        return true;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float component4() {
        return this.height;
    }

    public final float component3() {
        return this.width;
    }

    public final float component1() {
        return this.left;
    }

    public ConfigContentArea(float left, float top, float width, float height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public int hashCode() {
        int result = Float.hashCode(this.left);
        result = result * 31 + Float.hashCode(this.top);
        result = result * 31 + Float.hashCode(this.width);
        result = result * 31 + Float.hashCode(this.height);
        return result;
    }

    public static /* synthetic */ ConfigContentArea copy$default(ConfigContentArea configContentArea, float f, float f2, float f3, float f4, int n, Object object) {
        if ((n & 1) != 0) {
            f = configContentArea.left;
        }
        if ((n & 2) != 0) {
            f2 = configContentArea.top;
        }
        if ((n & 4) != 0) {
            f3 = configContentArea.width;
        }
        if ((n & 8) != 0) {
            f4 = configContentArea.height;
        }
        return configContentArea.copy(f, f2, f3, f4);
    }

    public final boolean contains(float mouseX, float mouseY) {
        return mouseX >= this.left && mouseX <= this.left + this.width && mouseY >= this.top && mouseY <= this.top + this.height;
    }
}

