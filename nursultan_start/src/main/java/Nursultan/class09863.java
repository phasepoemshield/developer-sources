/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09904
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09860;
import Nursultan.class09875;
import Nursultan.class09904;
import Nursultan.class10021;
import java.util.ArrayList;
import java.util.List;

public final class class09863 {
    private class09863() {
    }

    public static void N(class09860 class098602) {
        if (class098602 == null || class098602.R() == null || class098602.i() == null) {
            return;
        }
        List<class10021> var1 = class09863.N(class098602.R());
        if (var1.isEmpty()) {
            return;
        }
        for (int i = 0; i < var1.size() - 1; ++i) {
            class10021 class100212 = var1.get(i);
            class098602.N((class09904)class100212);
            class098602.N(class09875.CAPTURE);
            class100212.N(class098602, true);
            if (!class098602.E()) continue;
            return;
        }
        class10021 class100213 = (class10021)var1.getLast();
        class098602.N((class09904)class100213);
        class098602.N(class09875.AT_TARGET);
        class100213.N(class098602, true);
        if (!class098602.W()) {
            class100213.N(class098602, false);
        }
        if (class098602.E() || !class098602.B()) {
            return;
        }
        for (int i = var1.size() - 2; i >= 0; --i) {
            class10021 class100214 = var1.get(i);
            class098602.N((class09904)class100214);
            class098602.N(class09875.BUBBLE);
            class100214.N(class098602, false);
            if (!class098602.E()) continue;
            return;
        }
    }

    private static List<class10021> N(class09904 class099042) {
        ArrayList<class10021> arrayList = new ArrayList<class10021>();
        for (class10021 class100212 = (class10021)class099042; class100212 != null; class100212 = class100212.X()) {
            arrayList.add(class100212);
        }
        ArrayList<class10021> arrayList2 = new ArrayList<class10021>(arrayList.size());
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            arrayList2.add((class10021)arrayList.get(i));
        }
        return arrayList2;
    }
}

