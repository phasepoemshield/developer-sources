/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package Nursultan;

import Nursultan.class11599;
import Nursultan.class11635;
import java.util.List;
import java.util.Optional;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class11620 {
    public static Object[] N;
    private static byte[] L;

    public static void L() {
        class11635 class116352 = (class11635)((Object)N[0]);
        class11620.N[1] = class116352;
    }

    private class11620() {
    }

    static {
        class11620.i();
        class11620.R();
        class11620.N[0] = class11635.i();
        class11620.N[1] = N[0];
    }

    private static void i() {
        L = new byte[1];
        class11620.L[0] = 2;
    }

    public static Optional<class11599> u() {
        return ((class11635)((Object)N[1])).L();
    }

    public static class11635 y() {
        return (class11635)((Object)N[1]);
    }

    public static void N(List<Vector4f> list, List<Vector4f> list2, class11599 class115992, class11599 class115993) {
        int n = Math.min(list.size(), list2.size());
        Vector4f[] vector4fArray = new Vector4f[n];
        Vector4f[] vector4fArray2 = new Vector4f[n];
        for (int i = 0; i < n; ++i) {
            vector4fArray[i] = new Vector4f((Vector4fc)list.get(i));
            vector4fArray2[i] = new Vector4f((Vector4fc)list2.get(i));
        }
        class11635 class116352 = new class11635(List.of(vector4fArray), List.of(vector4fArray2), Optional.ofNullable(class115992), Optional.ofNullable(class115993));
        class11620.N[1] = class116352;
    }

    public static Optional<class11599> N() {
        return ((class11635)((Object)N[1])).u();
    }

    private static void R() {
        N = new Object[L[0]];
    }
}

