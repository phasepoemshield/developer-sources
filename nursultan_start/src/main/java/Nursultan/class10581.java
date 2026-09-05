/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03729
 *  minecraft.class04782
 *  minecraft.class05838
 *  minecraft.class05946
 *  minecraft.class06485
 *  minecraft.class06521
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Optional;
import minecraft.class03729;
import minecraft.class04782;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class06485;
import minecraft.class06521;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class10581<I, T>
implements class06485<I, T> {
    private @Nullable class05946<class06521<?>> y;
    final /* synthetic */ class05838 N;

    public class10581(class05838 class058382) {
        this.N = class058382;
    }

    public Optional<class03729<T>> N(I i, class04782 class047822) {
        Optional optional = class047822.method_64577().N(this.N, i, (class07299)class047822, this.y);
        if (optional.isPresent()) {
            class03729 class037292 = (class03729)optional.get();
            this.y = class037292.N();
            return Optional.of(class037292);
        }
        return Optional.empty();
    }
}

