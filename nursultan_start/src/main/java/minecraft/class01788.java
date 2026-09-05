/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05216
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class01762;
import minecraft.class05216;
import org.jspecify.annotations.Nullable;

public interface class01788 {
    public boolean L();

    public @Nullable class01762 i();

    default public class05216 y(class01762 class017622) {
        return Objects.requireNonNullElse(this.i(), class017622).N(this.y());
    }

    public int y();

    public static class05216 N(@Nullable class01788 class017882, class01762 class017622) {
        return class017882 != null ? class017882.y(class017622) : class017622.N(0);
    }
}

