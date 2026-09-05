/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09662
 *  Nursultan.class09781
 *  Nursultan.class09828
 *  Nursultan.class09830
 *  Nursultan.class10021
 *  Nursultan.class10029
 *  Nursultan.class10049
 *  java.lang.MatchException
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package Nursultan;

import Nursultan.class09662;
import Nursultan.class09781;
import Nursultan.class09828;
import Nursultan.class09830;
import Nursultan.class09924;
import Nursultan.class09925;
import Nursultan.class09970;
import Nursultan.class09980;
import Nursultan.class10001;
import Nursultan.class10021;
import Nursultan.class10029;
import Nursultan.class10049;
import java.util.List;
import org.joml.Vector4f;
import org.joml.Vector4fc;

final class class10007 {
    private final class09828 N;

    class10007(class09781 class097812) {
        this.N = class09828.N((class09781)class097812);
    }

    private static int N(class10029 class100292, int n, int n2, int n3) {
        return switch (class100292) {
            default -> throw new MatchException(null, null);
            case class10029.NORMAL -> n;
            case class10029.HOVER -> n2;
            case class10029.ACTIVE -> n3;
        };
    }

    void N(class10021 class100212, class09980 class099802, class09830 class098302, List<class09924> list) {
        int n;
        if (class100212.y() == class10049.CANVAS) {
            return;
        }
        if (class099802.k() == class09970.HIDDEN || class098302 == null) {
            return;
        }
        class10001 class100012 = class099802.Y();
        float f = class098302.M() * 0.5f;
        float f2 = class098302.U() * 0.5f;
        int n2 = class10007.N(this.N.y(class100212), class100012.i(), class100012.R(), class100012.M());
        if (class09662.R((int)n2)) {
            list.add(new class09925(class098302.i(), class098302.R(), class098302.M(), class098302.B(), (Vector4fc)new Vector4f(f, f, f, f), n2, 0, 0.0f, 0, 0.0f));
        }
        if (class09662.R((int)(n = class10007.N(this.N.L(class100212), class100012.B(), class100012.Z(), class100012.z())))) {
            list.add(new class09925(class098302.Z(), class098302.z(), class098302.U(), class098302.E(), (Vector4fc)new Vector4f(f2, f2, f2, f2), n, 0, 0.0f, 0, 0.0f));
        }
    }

    boolean N(class10021 class100212, class09980 class099802, class09830 class098302) {
        if (class099802.k() == class09970.HIDDEN || class098302 == null) {
            return false;
        }
        class10001 class100012 = class099802.Y();
        int n = class10007.N(this.N.y(class100212), class100012.i(), class100012.R(), class100012.M());
        if (class098302.L() > 0.0f && class098302.u() > 0.0f && class09662.R((int)n)) {
            return true;
        }
        int n2 = class10007.N(this.N.L(class100212), class100012.B(), class100012.Z(), class100012.z());
        return class098302.U() > 0.0f && class098302.E() > 0.0f && class09662.R((int)n2);
    }

    class09830 N(class10021 class100212, class09980 class099802) {
        if (class100212 == null || class099802 == null) {
            return null;
        }
        if (!class099802.y()) {
            return null;
        }
        if (class099802.k() == class09970.HIDDEN) {
            return null;
        }
        if (class100212.c().P() <= 0.0f) {
            return null;
        }
        if (class100212.c().B() <= 0.0f || class100212.c().Z() <= 0.0f) {
            return null;
        }
        if (class099802.Y().N() <= 0.0f) {
            return null;
        }
        return this.N.u(class100212);
    }
}

