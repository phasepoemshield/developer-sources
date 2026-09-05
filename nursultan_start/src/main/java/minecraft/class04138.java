/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01289
 *  minecraft.class04782
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class01289;
import minecraft.class04109;
import minecraft.class04139;
import minecraft.class04140;
import minecraft.class04782;
import org.jspecify.annotations.Nullable;

public class class04138<E, F, Value>
implements class04140<E, class04139<F, Value>> {
    final /* synthetic */ class04109 N;

    public class04138(class04109 class041092) {
        this.N = class041092;
    }

    public String toString() {
        return this.N();
    }

    @Override
    public @Nullable class04139<F, Value> N(class04782 class047822, E e, long l) {
        class01289 var5 = e.method_18868();
        Optional optional = var5.u(this.N.N());
        if (optional == null) {
            return null;
        }
        return this.N.N(var5, optional);
    }

    @Override
    public String N() {
        return "M[" + String.valueOf(this.N) + "]";
    }
}

