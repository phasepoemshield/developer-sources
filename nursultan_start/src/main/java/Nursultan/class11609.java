/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09867
 *  Nursultan.class09969
 *  Nursultan.class09991
 *  org.joml.Vector2f
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09867;
import Nursultan.class09969;
import Nursultan.class09991;
import Nursultan.class11598;
import Nursultan.class11613;
import Nursultan.class11623;
import Nursultan.class11638;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11609 {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    private class11609() {
    }

    static {
        class11609.y();
        class11609.N();
        class11609.L();
        N_0 = new class11609()::N;
    }

    private static void y() {
    }

    private static class09991 N(class11613 class116132) {
        Vector2f vector2f = (Vector2f)class116132.y().L();
        if (vector2f == null) {
            return class09991.N;
        }
        return class09991.N().N(class09969.FLOATING).U(vector2f.x).E(vector2f.y);
    }

    private static void N() {
    }

    private class09798 N(class11613 class116132, class09809 class098092) {
        class11598<Object> var3 = class116132.R() == null ? (class11623)class11623.L_0 : class116132.R();
        return class09778.N((class09991)class09991.N((class09991[])new class09991[]{class116132.i(), class11609.N(class116132)}), class097842 -> {
            class097842.N(class116132.N());
            class097842.N(class116132.M());
            class097842.N(class09867.POINTER_DOWN, class098602 -> var3.L(class098602, class116132));
            class097842.N(class09867.POINTER_UP, class098602 -> var3.N(class098602, class116132));
            class097842.N(class09867.POINTER_MOVE, class098602 -> var3.y(class098602, class116132));
            class116132.B().accept((class09784)class097842, class098092);
        });
    }

    public static class09785<Vector2f> N(class09785<Vector4f> class097852) {
        Vector2f vector2f = new Vector2f();
        return new class11638(class097852, vector2f);
    }
}

