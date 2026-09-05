/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05974
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class04025;
import minecraft.class04054;
import minecraft.class05974;
import minecraft.class07209;

class class04046
implements class04025 {
    public static class04046 N = new class04046();
    public static final MapCodec<class04046> i = MapCodec.unit(() -> N);

    private class04046() {
    }

    @Override
    public boolean test(class05974 class059742, class07209 class072092) {
        return true;
    }

    @Override
    public class04054<?> N() {
        return class04054.E;
    }
}

