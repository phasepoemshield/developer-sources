/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09991
 *  Nursultan.class11290
 *  Nursultan.class11296
 *  Nursultan.class11325
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09184;
import Nursultan.class09198;
import Nursultan.class09207;
import Nursultan.class09778;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09991;
import Nursultan.class11290;
import Nursultan.class11296;
import Nursultan.class11325;
import Nursultan.class11938;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class class09179 {
    private static String[] L;
    public static Object N_0;

    private class09179() {
    }

    static {
        class09179.y();
        class09179.u();
        class09179.N();
        N_0 = new class09179()::N;
    }

    private static void u() {
        L = new String[1];
        class09179.L[0] = "presetsRevision";
    }

    private static void y() {
    }

    private static void N() {
    }

    private class09798 N(Void void_, class09809 class098092) {
        class098092.L(L[0], () -> ((class11325)class11938.G()).N());
        ArrayList<class11290> arrayList = new ArrayList<class11290>();
        for (class11290 class112904 : class11938.G().L()) {
            if (class112904.M() == class11296.DELETING) continue;
            arrayList.add(class112904);
        }
        arrayList.sort((class112902, class112903) -> Long.compare(class112903.B(), class112902.B()));
        class09184.N(arrayList.stream().map(class11290::u).collect(Collectors.toSet()));
        return class09778.N((class09991)((class09991)class09198.N_0), (T class097843) -> class097843.N_3((class09991)class09198.N_2, class097842 -> {
            for (int i = 0; i < arrayList.size(); ++i) {
                class11290 class112902 = (class11290)arrayList.get(i);
                class097842.y(class098092.N("preset:" + String.valueOf(class112902.u()), (class09788)class09184.L_1, (Object)new class09207(class112902, i == arrayList.size() - 1)));
            }
        }));
    }
}

