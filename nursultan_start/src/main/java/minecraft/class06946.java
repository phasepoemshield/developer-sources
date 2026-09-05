/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03729
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class07305
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Collections;
import java.util.List;
import minecraft.class03729;
import minecraft.class04770;
import minecraft.class06584;
import minecraft.class07305;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public interface class06946 {
    default public boolean N(class04770 class047702, class03729<?> class037292) {
        if (class037292.y().method_8118() || !((Boolean)class047702.method_51469().method_64395().N(class07305.n)).booleanValue() || class047702.method_14253().y(class037292.N())) {
            this.N(class037292);
            return true;
        }
        return false;
    }

    default public void N(class08036 class080362, List<class06584> list) {
        class03729<?> var3 = this.N();
        if (var3 != null) {
            class080362.method_51283(var3, list);
            if (!var3.y().method_8118()) {
                class080362.method_7254(Collections.singleton(var3));
                this.N(null);
            }
        }
    }

    public @Nullable class03729<?> N();

    public void N(@Nullable class03729<?> var1);
}

