/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04907
 *  minecraft.class05220
 *  minecraft.class05699
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04597;
import minecraft.class04610;
import minecraft.class04907;
import minecraft.class05220;
import minecraft.class05699;

class class04616
extends class05699<class04616> {
    private final class04907<class01894> y;
    private final class00392 L;
    final /* synthetic */ class04597 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class04616(class04597 class045972, class04907 class049072) {
        this.N = class045972;
        this.y = class049072;
        this.L = class00392.L((String)class04610.N((class04907<class01894>)class049072));
    }

    private String N() {
        return this.y.N(this.N.N.B.N(this.y));
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73385();
        Objects.requireNonNull(class04610.N(this.N.N));
        int n4 = n3 - 4;
        int n5 = this.N.method_25396().indexOf((Object)this) % 2 == 0 ? -1 : -4539718;
        class010542.y(class04610.y(this.N.N), this.L, this.method_73380() + 2, n4, n5);
        String string = this.N();
        class010542.y(class04610.L(this.N.N), string, this.method_73389() - class04610.u(this.N.N).y(string) - 4, n4, n5);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{class00392.i().y(this.L).y(class05220.l).i(this.N())});
    }
}

