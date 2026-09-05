/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09904
 */
package Nursultan;

import Nursultan.class09841;
import Nursultan.class09867;
import Nursultan.class09875;
import Nursultan.class09904;

public abstract class class09860 {
    private final class09867 N;
    private final class09841 y;
    private final class09904 L;
    private final boolean u;
    private final boolean i;
    private class09904 R;
    private class09875 M = class09875.AT_TARGET;
    private boolean B;
    private boolean Z;
    private boolean z;
    private boolean U;
    private boolean E;

    public final class09841 M() {
        return this.y;
    }

    public final boolean P() {
        return this.E;
    }

    public void T() {
        this.B = true;
    }

    protected class09860(class09867 class098672, class09904 class099042) {
        this(class098672, class099042, class098672 != null && class098672.N(), class098672 != null && class098672.y());
    }

    protected class09860(class09867 class098672, class09904 class099042, boolean bl, boolean bl2) {
        this.N = class098672;
        this.y = class099042 == null ? null : class099042.K();
        this.L = class099042;
        this.u = bl;
        this.i = bl2;
    }

    public final boolean B() {
        return this.u;
    }

    public final boolean Z() {
        return this.i;
    }

    public final class09867 i() {
        return this.N;
    }

    public void b() {
        this.Z = true;
        this.B = true;
    }

    public void s() {
        this.E = true;
        this.T();
    }

    public final boolean m() {
        return this.z;
    }

    public void v() {
        this.U = false;
    }

    public void j() {
        if (!this.i || this.U) {
            return;
        }
        this.z = true;
    }

    public final class09875 U() {
        return this.M;
    }

    public final class09904 z() {
        return this.R;
    }

    public final boolean E() {
        return this.B;
    }

    void N(class09875 class098752) {
        this.M = class098752;
    }

    public void N(boolean bl) {
        this.U = bl;
    }

    void N(class09904 class099042) {
        this.R = class099042;
    }

    public final boolean W() {
        return this.Z;
    }

    public final class09904 R() {
        return this.L;
    }
}

