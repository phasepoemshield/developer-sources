/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02057
 *  minecraft.class02102
 *  minecraft.class03695
 *  minecraft.class04229
 *  minecraft.class04230
 *  minecraft.class05216
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02057;
import minecraft.class02102;
import minecraft.class03695;
import minecraft.class04229;
import minecraft.class04230;
import minecraft.class05216;

class class04217 {
    private final int N;
    private final class01885 y;
    private final class05216 L = class00392.i();

    public class04217(int n) {
        this.N = n;
        this.y = class01885.u();
        this.y.L().N();
        this.y.N((class02102)class02057.N((int)n));
    }

    public void y(class01590 class015902, class00392 class003922) {
        this.y.N((class02102)new class04230(class003922, class015902).N(this.N - 64).N(true), (T class020722) -> class020722.y().R(32));
        this.L.y(class003922).i("\n");
    }

    public class04229 N() {
        this.y.N();
        return new class04229((class03695)this.y, (class00392)this.L);
    }

    public void N(int n) {
        this.y.N((class02102)class02057.y((int)n));
    }

    public void N(class01590 class015902, class00392 class003922, int n) {
        this.y.N((class02102)new class04230(class003922, class015902).N(this.N), (T class020722) -> class020722.i(n));
        this.L.y(class003922).i("\n");
    }

    public void N(class01590 class015902, class00392 class003922) {
        this.N(class015902, class003922, 0);
    }
}

