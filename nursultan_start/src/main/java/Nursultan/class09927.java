/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09677
 *  Nursultan.class10019
 *  Nursultan.class10021
 *  Nursultan.class10047
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09677;
import Nursultan.class09889;
import Nursultan.class09909;
import Nursultan.class09918;
import Nursultan.class09925;
import Nursultan.class09935;
import Nursultan.class10019;
import Nursultan.class10021;
import Nursultan.class10047;
import java.util.ArrayList;
import java.util.List;

final class class09927 {
    class09927() {
    }

    private static void y(class10021 class100212, List<class09935> list, float f, float f2) {
        float f3 = class100212.c().y() + f;
        float f4 = class100212.c().L() + f2;
        float f5 = class100212.c().u();
        float f6 = class100212.c().i();
        if (f5 <= 1.0f || f6 <= 1.0f) {
            return;
        }
        int n = class09927.N(class100212.N());
        class09927.N(list, f3, f4, f5, f6, n);
    }

    private static int N(String string) {
        int n = string == null ? 0 : string.hashCode();
        int n2 = 64 + (n >>> 16 & 0x7F);
        int n3 = 64 + (n >>> 8 & 0x7F);
        int n4 = 64 + (n & 0x7F);
        return 0xFF000000 | n2 << 16 | n3 << 8 | n4;
    }

    private static void N(List<class09935> list, float f, float f2, float f3, float f4, int n) {
        if (f3 <= 0.0f || f4 <= 0.0f) {
            return;
        }
        float f5 = Math.min(2.0f, Math.min(f3, f4));
        list.add(new class09909(new class09925(f, f2, f3, f4, class09889.N, class09662.N((int)n, (class09677)class09677.ALPHA, (int)34), n, f5, 0, 0.0f)));
    }

    List<class09935> N(class10021 class100212) {
        ArrayList<class09935> arrayList = new ArrayList<class09935>();
        if (class100212 != null) {
            class09927.N(class100212, arrayList, 0.0f, 0.0f);
        }
        return arrayList;
    }

    private static void N(class10021 class100212, List<class09935> list, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        class09927.y(class100212, list, f3, f4);
        float f5 = class09918.N(class100212);
        for (class10021 class100213 : class10047.N((class10021)class100212)) {
            if (class10019.N((class10021)class100213)) {
                class09927.N(class100213, list, 0.0f, 0.0f);
                continue;
            }
            float f6 = f4;
            if (f5 > 0.0f && class10019.y((class10021)class100213)) {
                f6 -= f5;
            }
            class09927.N(class100213, list, f3, f6);
        }
    }
}

