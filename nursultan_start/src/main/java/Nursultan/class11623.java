/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09860
 *  Nursultan.class09864
 *  Nursultan.class09898
 *  Nursultan.class09904
 *  minecraft.class04995
 *  org.joml.Vector2f
 */
package Nursultan;

import Nursultan.class09860;
import Nursultan.class09864;
import Nursultan.class09898;
import Nursultan.class09904;
import Nursultan.class11598;
import Nursultan.class11616;
import Nursultan.class11632;
import minecraft.class04995;
import org.joml.Vector2f;

public class class11623<P extends class11632>
implements class11598<P> {
    public static Object L_0;

    @Override
    public void L(class09860 class098602, P p) {
        class09864 class098642 = (class09864)class098602;
        if (class098642.L() != 0) {
            return;
        }
        class09904 class099042 = class098602.z();
        if (!p.N().equals(class099042.N())) {
            return;
        }
        p.u().N((Object)true);
        p.L().N((Object)((Vector2f)p.L().L()).set(class098642.N() - class099042.c().y(), class098642.y() - class099042.c().L()));
    }

    static {
        class11623.i();
        L_0 = new class11623();
    }

    private static void i() {
        L_0 = null;
    }

    @Override
    public void y(class09860 class098602, P p) {
        if (!((Boolean)p.u().L()).booleanValue()) {
            return;
        }
        class09864 class098642 = (class09864)class098602;
        Vector2f vector2f = (Vector2f)p.y().L();
        if (vector2f == null) {
            vector2f = new Vector2f();
        }
        Vector2f vector2f2 = (Vector2f)p.L().L();
        class09904 class099042 = class098602.z();
        class09898 class098982 = class099042.X().c();
        class09898 class098983 = class099042.c();
        class11616 class116162 = this.N();
        p.y().N((Object)vector2f.set(class116162.y() ? class11623.N(class098642.N() - vector2f2.x, class098982.u(), class098983.u()) : vector2f.x, class116162.N() ? class11623.N(class098642.y() - vector2f2.y, class098982.i(), class098983.i()) : vector2f.y));
    }

    @Override
    public void N(class09860 class098602, P p) {
        if (((class09864)class098602).L() != 0) {
            return;
        }
        p.u().N((Object)false);
    }

    public class11616 N() {
        return class11616.FULL;
    }

    public static float N(float f, float f2, float f3) {
        if (f3 > f2) {
            return class04995.N((float)f, (float)(-f3 / 2.0f), (float)(f2 - f3 / 2.0f));
        }
        return class04995.N((float)f, (float)0.0f, (float)(f2 - f3));
    }
}

