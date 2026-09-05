/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class04993
 *  minecraft.class05795
 *  minecraft.class06890
 *  minecraft.class07739
 */
package minecraft;

import minecraft.class00772;
import minecraft.class01296;
import minecraft.class04993;
import minecraft.class05795;
import minecraft.class06890;
import minecraft.class07739;

final class class03501 {
    final class07739 N;
    final class07739 y;
    final class01296 L;

    class03501(class05795 class057952, class01296 class012962, int n, class00772 class007722) {
        int n2 = n * 2 + 1;
        this.N = new class06890(n2, n2, n2);
        this.y = new class06890(n2, n2, n2);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n2; ++j) {
                for (int k = 0; k < n2; ++k) {
                    class01296 class012963 = class01296.N((int)(class012962.N() + k - n), (int)(class012962.y() + j - n), (int)(class012962.L() + i - n));
                    class04993 class049932 = class057952.y(class007722, class012963);
                    if (class049932 == class04993.field_44726) {
                        this.N.method_1049(k, j, i);
                        this.y.method_1049(k, j, i);
                        continue;
                    }
                    if (class049932 != class04993.field_44725) continue;
                    this.y.method_1049(k, j, i);
                }
            }
        }
        this.L = class01296.N((int)(class012962.N() - n), (int)(class012962.y() - n), (int)(class012962.L() - n));
    }
}

