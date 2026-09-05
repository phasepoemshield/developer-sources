/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07438;

public class class05337
extends class05355<class07438> {
    @Override
    protected void N(class04782 class047822, class07438 class074383) {
        class01289 var3 = class074383.method_18868();
        class07072 class070722 = class074383.method_6081();
        if (class070722 != null) {
            var3.N(class05378.d, (Object)class074383.method_6081());
            class07049 class070492 = class070722.u();
            if (class070492 instanceof class07438) {
                var3.N(class05378.w, (Object)((class07438)class070492));
            }
        } else {
            var3.y(class05378.d);
        }
        var3.L(class05378.w).ifPresent(class074382 -> {
            if (!class074382.method_5805() || class074382.method_73183() != class047822) {
                var3.y(class05378.w);
            }
        });
    }

    @Override
    public Set<class05378<?>> N() {
        return ImmutableSet.of(class05378.d, class05378.w);
    }
}

