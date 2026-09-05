/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class07049
 *  minecraft.class07077
 *  minecraft.class07633
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00802;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class07049;
import minecraft.class07077;
import minecraft.class07633;
import org.jspecify.annotations.Nullable;

public class class00796
extends class01396<class00802> {
    public void N(class04770 class047702, class07633 class076332, class07633 class076333, @Nullable class07077 class070772) {
        class05908 class059082 = class00821.y(class047702, (class07049)class076332);
        class05908 class059083 = class00821.y(class047702, (class07049)class076333);
        class05908 class059084 = class070772 != null ? class00821.y(class047702, (class07049)class070772) : null;
        this.N_27(class047702, class008022 -> class008022.N(class059082, class059083, class059084));
    }

    public Codec<class00802> N() {
        return class00802.N;
    }
}

