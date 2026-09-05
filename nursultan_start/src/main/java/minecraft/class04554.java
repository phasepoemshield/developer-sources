/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00672
 *  minecraft.class00821
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00672;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04545;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class07049;

public class class04554
extends class01396<class04545> {
    public void N(class04770 class047702, class00672 class006722, List<class07049> list) {
        List list2 = list.stream().map(class070492 -> class00821.y((class04770)class047702, (class07049)class070492)).collect(Collectors.toList());
        class05908 class059082 = class00821.y((class04770)class047702, (class07049)class006722);
        this.N_27(class047702, class045452 -> class045452.N(class059082, list2));
    }

    public Codec<class04545> N() {
        return class04545.N;
    }
}

