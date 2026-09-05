/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09860
 *  Nursultan.class09864
 *  Nursultan.class09898
 *  Nursultan.class09904
 *  Nursultan.class11730
 *  Nursultan.class11738
 *  Nursultan.class11769
 *  java.lang.MatchException
 *  minecraft.class06202
 *  org.joml.Vector2f
 *  org.joml.Vector2fc
 */
package Nursultan;

import Nursultan.class09860;
import Nursultan.class09864;
import Nursultan.class09898;
import Nursultan.class09904;
import Nursultan.class11598;
import Nursultan.class11616;
import Nursultan.class11623;
import Nursultan.class11626;
import Nursultan.class11632;
import Nursultan.class11639;
import Nursultan.class11730;
import Nursultan.class11738;
import Nursultan.class11769;
import minecraft.class06202;
import org.joml.Vector2f;
import org.joml.Vector2fc;

public class class11633
extends class11623<class11632> {
    public Object N_0;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;

    @Override
    public void L(class09860 class098602, class11632 class116322) {
        class11769 class117692 = class11730.N((String)class116322.N());
        if (class117692 != null && class098602 instanceof class09864) {
            switch (((class09864)class098602).L()) {
                case 2: {
                    class117692.M();
                    break;
                }
                case 0: {
                    class117692.P();
                }
            }
        }
        super.L(class098602, class116322);
    }

    private static void M() {
    }

    private class11633(class11616 class116162) {
        this.y();
        this.N_0 = class116162;
    }

    static {
        class11633.M();
        y_0 = new class11633(class11616.FULL);
        y_1 = new class11633(class11616.HORIZONTAL);
        y_2 = new class11633(class11616.VERTICAL);
    }

    private static boolean u() {
        return class06202.Nq().s();
    }

    private void y() {
    }

    @Override
    public void y(class09860 class098602, class11632 class116322) {
        this.y();
        super.y(class098602, class116322);
        if (!((Boolean)class116322.u().L()).booleanValue()) {
            return;
        }
        ((class11738)class11738.y_0).N();
        Vector2f vector2f = (Vector2f)class116322.y().L();
        if (vector2f == null) {
            return;
        }
        class09904 class099042 = class098602.z();
        class09898 class098982 = class099042.X().c();
        Vector2f vector2f2 = new Vector2f((Vector2fc)vector2f);
        if (class11633.u()) {
            ((class11738)class11738.y_0).N(class116322.N(), vector2f2, class099042.c().u(), class099042.c().i(), class098982.u(), class098982.i(), ((class11616)((Object)this.N_0)).y(), ((class11616)((Object)this.N_0)).N());
        }
        if (((class11616)((Object)this.N_0)).y()) {
            vector2f2.x += class11633.N(class116322.N(), class099042.c().u());
        }
        if (!vector2f2.equals((Object)vector2f)) {
            class116322.y().N((Object)vector2f2);
        }
    }

    @Override
    public class11616 N() {
        this.y();
        return (class11616)((Object)this.N_0);
    }

    public static class11598<class11632> N(class11616 class116162) {
        return switch (((int[])class11639.N_0)[class116162.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> (class11633)y_0;
            case 2 -> (class11633)y_1;
            case 3 -> (class11633)y_2;
            case 4 -> (class11626)class11626.N_0;
        };
    }

    private static float N(String string, float f) {
        class11769 class117692 = class11730.N((String)string);
        return class117692 != null ? class117692.L().N() * f : 0.0f;
    }

    @Override
    public void N(class09860 class098602, class11632 class116322) {
        super.N(class098602, class116322);
        if (!((Boolean)class116322.u().L()).booleanValue()) {
            ((class11738)class11738.y_0).N();
        }
    }
}

