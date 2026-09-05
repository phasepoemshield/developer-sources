/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02072
 *  minecraft.class02102
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02072;
import minecraft.class02102;
import minecraft.class03695;

public class class03725 {
    private static final int N = 4;

    private class03725() {
    }

    public static class03695 N(class01590 class015902, class02102 class021022, class00392 class003922, Consumer<class02072> consumer) {
        class01885 class018852 = class01885.u().N(4);
        class018852.N((class02102)new class02071(class003922, class015902));
        class018852.N(class021022, consumer);
        return class018852;
    }

    public static class03695 N(class01590 class015902, class02102 class021022, class00392 class003922) {
        return class03725.N(class015902, class021022, class003922, class020722 -> {});
    }
}

