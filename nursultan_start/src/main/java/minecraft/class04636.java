/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01235
 *  minecraft.class01590
 *  minecraft.class05220
 *  minecraft.class05699
 *  minecraft.class07078
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01235;
import minecraft.class01590;
import minecraft.class04607;
import minecraft.class04610;
import minecraft.class05220;
import minecraft.class05699;
import minecraft.class07078;

class class04636
extends class05699<class04636> {
    private final class00392 y;
    private final class00392 L;
    private final class00392 u;
    private final boolean i;
    private final boolean R;
    final /* synthetic */ class04607 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class04636(class04607 class046072, class07078 class070782) {
        this.N = class046072;
        this.y = class070782.M();
        int n = class046072.N.B.N(class01235.M.y((Object)class070782));
        if (n == 0) {
            this.L = class00392.N((String)"stat_type.minecraft.killed.none", (Object[])new Object[]{this.y});
            this.i = false;
        } else {
            this.L = class00392.N((String)"stat_type.minecraft.killed", (Object[])new Object[]{n, this.y});
            this.i = true;
        }
        int n2 = class046072.N.B.N(class01235.B.y((Object)class070782));
        if (n2 == 0) {
            this.u = class00392.N((String)"stat_type.minecraft.killed_by.none", (Object[])new Object[]{this.y});
            this.R = false;
        } else {
            this.u = class00392.N((String)"stat_type.minecraft.killed_by", (Object[])new Object[]{this.y, n2});
            this.R = true;
        }
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.y(class04610.z(this.N.N), this.y, this.method_73380() + 2, this.method_73382() + 1, -1);
        class01590 class015902 = class04610.U(this.N.N);
        int n3 = this.method_73380() + 2 + 10;
        int n4 = this.method_73382() + 1;
        Objects.requireNonNull(class04610.E(this.N.N));
        class010542.y(class015902, this.L, n3, n4 + 9, this.i ? -4539718 : -8355712);
        class01590 class015903 = class04610.W(this.N.N);
        int n5 = this.method_73380() + 2 + 10;
        int n6 = this.method_73382() + 1;
        Objects.requireNonNull(class04610.m(this.N.N));
        class010542.y(class015903, this.u, n5, n6 + 18, this.R ? -4539718 : -8355712);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{class05220.N((class00392[])new class00392[]{this.L, this.u})});
    }
}

