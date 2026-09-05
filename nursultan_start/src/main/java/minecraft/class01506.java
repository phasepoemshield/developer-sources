/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00717
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class07079
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00717;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07049;
import minecraft.class07079;

public class class01506
extends class05355<class07079> {
    private static final long y = 32L;
    private static final long L = 16L;
    public static final int N = 32;

    protected void N(class04782 class047822, class07079 class070792) {
        class01289 var3 = class070792.method_18868();
        List var4 = class047822.N(class00717.class, class070792.method_5829().L(32.0, 16.0, 32.0), (T class007172) -> true);
        var4.sort(Comparator.comparingDouble(arg_0 -> ((class07079)class070792).method_5858(arg_0)));
        Optional<class00717> var5 = var4.stream().filter(class007172 -> class070792.y(class047822, class007172.N())).filter(class007172 -> class007172.method_24516((class07049)class070792, 32.0)).filter(arg_0 -> ((class07079)class070792).method_6057(arg_0)).findFirst();
        var3.N(class05378.H, var5);
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.H);
    }
}

