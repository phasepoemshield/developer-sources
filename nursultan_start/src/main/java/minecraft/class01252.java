/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07438;

public class class01252
extends class05355<class07438> {
    protected void N(class07438 class074382, class04051 class040512) {
        Optional var3 = class040512.N(class074383 -> class074383.method_5864() == class074382.method_5864() && !class074383.method_6109());
        class074382.method_18868().N(class05378.e, var3);
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.e, (Object)class05378.B);
    }

    protected void N(class04782 class047822, class07438 class074382) {
        class074382.method_18868().L(class05378.B).ifPresent(class040512 -> this.N(class074382, (class04051)class040512));
    }
}

