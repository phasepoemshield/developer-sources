/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class10021;
import Nursultan.class10036;
import Nursultan.class10048;
import Nursultan.class10052;
import Nursultan.class10061;
import java.util.ArrayList;
import java.util.List;

final class class10040 {
    private final class10052 N;
    private final ArrayList<class10021> y = new ArrayList();
    private float[] L = new float[0];

    class10040(class10052 class100522) {
        this.N = class100522;
    }

    void y(List<class10021> list, class10036 class100362, float f) {
        ArrayList<class10021> var4 = this.y;
        var4.clear();
        var4.addAll(list);
        while (f > 0.01f && !var4.isEmpty()) {
            float f2 = Float.MAX_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = f;
            for (class10021 class100212 : var4) {
                float f5 = this.N.N(class100212).L(class100362);
                if (class10048.N(f5, f2)) continue;
                if (f5 < f2) {
                    f3 = f2;
                    f2 = f5;
                }
                if (!(f5 > f2)) continue;
                f3 = Math.min(f3, f5);
                f4 = f3 - f2;
            }
            f4 = Math.min(f4, f / (float)var4.size());
            for (int i = 0; i < var4.size(); ++i) {
                class10021 class100212;
                class100212 = var4.get(i);
                class10061 class100612 = this.N.N(class100212);
                float f6 = class100612.L(class100362);
                if (!class10048.N(f6, f2)) continue;
                float f7 = f6 + f4;
                float f8 = class10048.u(class100212.o(), class100362, class100612.N(class100362));
                if (f7 >= f8) {
                    f7 = f8;
                    var4.remove(i--);
                }
                class100612.N(class100362, f7);
                f -= f7 - f6;
            }
        }
    }

    void N(List<class10021> list, class10036 class100362, float f) {
        ArrayList<class10021> var4 = this.y;
        var4.clear();
        var4.addAll(list);
        if (this.L.length < var4.size()) {
            this.L = new float[var4.size()];
        }
        while (f < -0.01f && !var4.isEmpty()) {
            class10061 class100612;
            class10021 class100212;
            int n;
            float f2 = 0.0f;
            for (class10021 class100213 : var4) {
                f2 += this.N.N(class100213).L(class100362);
            }
            if (f2 <= 0.01f) break;
            float f3 = -f;
            float f4 = 0.0f;
            boolean bl = false;
            float[] fArray = this.L;
            for (n = 0; n < var4.size(); ++n) {
                float f5;
                class100212 = var4.get(n);
                class100612 = this.N.N(class100212);
                float f6 = class100612.L(class100362);
                float f7 = class100612.y(class100362);
                float f8 = Math.max(f7, f6 - (f5 = f3 * (f6 / f2)));
                if (f8 <= f7 + 0.01f) {
                    bl = true;
                }
                fArray[n] = f8;
                f4 += f6 - f8;
            }
            for (n = 0; n < var4.size(); ++n) {
                this.N.N(var4.get(n)).N(class100362, fArray[n]);
            }
            f += f4;
            if (f4 <= 0.01f || !bl) break;
            for (n = 0; n < var4.size(); ++n) {
                class100212 = var4.get(n);
                class100612 = this.N.N(class100212);
                if (!class10048.N(class100612.L(class100362), class100612.y(class100362))) continue;
                var4.remove(n--);
            }
        }
    }
}

