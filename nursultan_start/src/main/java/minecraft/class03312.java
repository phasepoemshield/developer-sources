/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04023
 *  minecraft.class04025
 *  minecraft.class04054
 *  minecraft.class05974
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import minecraft.class04023;
import minecraft.class04025;
import minecraft.class04054;
import minecraft.class05974;
import minecraft.class07209;

class class03312
extends class04023 {
    public static final MapCodec<class03312> N = class03312.N(class03312::new);

    public class03312(List<class04025> list) {
        super(list);
    }

    public boolean test(class05974 class059742, class07209 class072092) {
        Iterator var3 = this.i.iterator();
        while (var3.hasNext()) {
            if (((class04025)var3.next()).test((Object)class059742, (Object)class072092)) continue;
            return false;
        }
        return true;
    }

    public class04054<?> N() {
        return class04054.z;
    }
}

