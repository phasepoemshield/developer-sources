/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.function.Function;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

class class00478
implements Function<Map.Entry<class08092<?>, Comparable<?>>, String> {
    class00478() {
    }

    @Override
    public String apply( @Nullable Map.Entry<class08092<?>, Comparable<?>> entry) {
        if (entry == null) {
            return "<NULL>";
        }
        class08092<?> class080922 = entry.getKey();
        return class080922.R() + "=" + this.N(class080922, entry.getValue());
    }

    private <T extends Comparable<T>> String N(class08092<T> class080922, Comparable<?> comparable) {
        return class080922.y(comparable);
    }
}

