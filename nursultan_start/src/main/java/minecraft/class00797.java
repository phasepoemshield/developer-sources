/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00799;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class07049;

public class class00797
extends class01396<class00799> {
    public void N(class04770 class047702, Collection<? extends class07049> collection) {
        List list = collection.stream().map(class070492 -> class00821.y(class047702, class070492)).collect(Collectors.toList());
        this.N_27(class047702, class007992 -> class007992.N(list));
    }

    public Codec<class00799> N() {
        return class00799.N;
    }
}

