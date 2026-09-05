/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class04370
 *  minecraft.class05611
 *  minecraft.class05630
 */
package Nursultan;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import minecraft.class04370;
import minecraft.class05611;
import minecraft.class05630;

public class class10526
implements class05611 {
    final /* synthetic */ List N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10526(class05630 class056302, List list) {
        this.N = list;
    }

    public <T> void N(String string, class04370<T> class043702) {
        this.N.add(Pair.of((Object)string, (Object)class043702.method_41753()));
    }
}

