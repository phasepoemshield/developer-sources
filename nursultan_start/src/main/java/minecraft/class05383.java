/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05298
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05298;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08036;

public class class05383
extends class05355<class07438> {
    protected double N(class07438 class074382) {
        return class074382.method_45325(class05298.P);
    }

    @Override
    protected void N(class04782 class047822, class07438 class074382) {
        List list = class047822.method_18456().stream().filter(class07042.R).filter(class047702 -> class074382.method_24516((class07049)class047702, this.N(class074382))).sorted(Comparator.comparingDouble(arg_0 -> ((class07438)class074382).method_5858(arg_0))).collect(Collectors.toList());
        class01289 var4 = class074382.method_18868();
        var4.N(class05378.z, list);
        List list2 = list.stream().filter(class080362 -> class05383.N(class047822, class074382, (class07438)class080362)).collect(Collectors.toList());
        var4.N(class05378.U, list2.isEmpty() ? null : (class08036)list2.get(0));
        List list3 = list2.stream().filter(class080362 -> class05383.y(class047822, class074382, (class07438)class080362)).toList();
        var4.N(class05378.W, (Object)list3);
        var4.N(class05378.E, list3.isEmpty() ? null : (class08036)list3.get(0));
    }

    @Override
    public Set<class05378<?>> N() {
        return ImmutableSet.of(class05378.z, class05378.U, class05378.E, class05378.W);
    }
}

