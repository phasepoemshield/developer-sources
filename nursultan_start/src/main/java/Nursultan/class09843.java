/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09936
 */
package Nursultan;

import Nursultan.class09787;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09810;
import Nursultan.class09832;
import Nursultan.class09841;
import Nursultan.class09872;
import Nursultan.class09879;
import Nursultan.class09936;
import java.util.Objects;

public final class class09843<P> {
    private final class09832 N;
    private final class09788<P> y;
    private final class09879 L;
    private class09841 u;
    private P i;
    private boolean R;
    private class09810 M = class09810.N();

    private void L() {
        class09798 class097982 = this.R();
        try {
            this.u = this.N.N(class097982);
            this.L.L();
            this.R = false;
        }
        catch (RuntimeException runtimeException) {
            this.L.u();
            throw runtimeException;
        }
    }

    private class09843(class09832 class098322, String string, class09788<P> class097882, P p) {
        this.N = Objects.requireNonNull(class098322, "engine");
        this.y = Objects.requireNonNull(class097882, "root");
        class09872 class098722 = class09872.N(class098322.N());
        this.L = new class09879(class098722, this::y, string);
        this.i = p;
    }

    private void i() {
        if (this.R || !this.L.i()) {
            return;
        }
        this.y();
    }

    private void u() {
        if (!this.R) {
            return;
        }
        class09798 class097982 = this.R();
        class09810 class098102 = this.M;
        try {
            this.u.N(class097982, class098102);
            this.L.L();
            this.R = false;
            this.M = class09810.N();
        }
        catch (RuntimeException runtimeException) {
            this.L.u();
            throw runtimeException;
        }
    }

    public void y() {
        this.N(class09810.N());
    }

    public class09936 N(int n, int n2, float f) {
        this.i();
        this.u();
        return this.N.N(this.u, n, n2, f);
    }

    public void N(P p) {
        this.i = p;
        this.y();
    }

    private static class09810 N(class09810 class098102, class09810 class098103) {
        Objects.requireNonNull(class098102, "current");
        Objects.requireNonNull(class098103, "next");
        if (class098102.L() == class09787.REMOVE_IMMEDIATELY || class098103.L() == class09787.REMOVE_IMMEDIATELY) {
            return class09810.y();
        }
        return class09810.N();
    }

    public static <P> class09843<P> N(class09832 class098322, String string, class09788<P> class097882, P p) {
        class09843<P> class098432 = new class09843<P>(class098322, string, class097882, p);
        class098432.L();
        return class098432;
    }

    public class09841 N() {
        return this.u;
    }

    public void N(P p, class09810 class098102) {
        Objects.requireNonNull(class098102, "renderOptions");
        this.i = p;
        this.N(class098102);
    }

    public void N(class09810 class098102) {
        Objects.requireNonNull(class098102, "renderOptions");
        this.R = true;
        this.M = class09843.N(this.M, class098102);
    }

    private class09798 R() {
        this.L.N();
        try {
            class09809 class098092 = this.L.y();
            return Objects.requireNonNull(this.y.render(this.i, class098092), "Root stateful component returned null");
        }
        catch (RuntimeException runtimeException) {
            this.L.u();
            throw runtimeException;
        }
    }
}

