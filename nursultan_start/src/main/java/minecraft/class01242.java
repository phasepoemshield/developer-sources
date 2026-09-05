/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  minecraft.class00680
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class08023
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00680;
import minecraft.class01238;
import minecraft.class01289;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class08023;

public class class01242
extends class05355<class07438> {
    protected void N(class04782 class047822, class07438 class074383) {
        class01289 var3 = class074383.method_18868();
        ArrayList arrayList = Lists.newArrayList();
        Optional<Object> optional = var3.L(class05378.B).orElse(class04051.N()).N((T class074382) -> class074382 instanceof class08023 || class074382 instanceof class00680).map(class07079.class::cast);
        for (class07438 class074384 : (List)var3.L(class05378.M).orElse(ImmutableList.of())) {
            if (!(class074384 instanceof class01238) || !((class01238)class074384).l()) continue;
            arrayList.add((class01238)class074384);
        }
        var3.N(class05378.c, optional);
        var3.N(class05378.Nd, arrayList);
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of((Object)class05378.B, (Object)class05378.c, (Object)class05378.Nd);
    }
}

