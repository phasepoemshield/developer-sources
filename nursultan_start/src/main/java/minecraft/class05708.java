/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07078
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07078;
import minecraft.class07438;

public class class05708
extends class05355<class07438> {
    private static final int N = 200;
    private static final int y = 599;

    public class05708() {
        this(200);
    }

    public class05708(int n) {
        super(n);
    }

    public static void y(class07438 class074382) {
        class074382.method_18868().N(class05378.J, (Object)true, 599L);
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.M);
    }

    public static void N(class07438 class074383) {
        Optional var1 = class074383.method_18868().L(class05378.M);
        if (var1.isEmpty()) {
            return;
        }
        if (((List)var1.get()).stream().anyMatch(class074382 -> class074382.method_5864().equals(class07078.Nn))) {
            class05708.y(class074383);
        }
    }

    protected void N(class04782 class047822, class07438 class074382) {
        class05708.N(class074382);
    }
}

