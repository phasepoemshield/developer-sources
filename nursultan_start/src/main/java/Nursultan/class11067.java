/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09045
 *  Nursultan.class09113
 *  Nursultan.class09173
 *  Nursultan.class11403
 *  Nursultan.class11512
 *  Nursultan.class11536
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  Nursultan.class12018
 *  Nursultan.class12033
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09045;
import Nursultan.class09113;
import Nursultan.class09173;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11089;
import Nursultan.class11101;
import Nursultan.class11106;
import Nursultan.class11403;
import Nursultan.class11512;
import Nursultan.class11536;
import Nursultan.class11938;
import Nursultan.class12002;
import Nursultan.class12018;
import Nursultan.class12033;
import java.util.Arrays;
import java.util.Objects;
import minecraft.class06202;

public class class11067
extends class11512 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;

    public String L() {
        this.m();
        return (String)this.N_2;
    }

    public class11072 M() {
        this.m();
        return (class11072)((Object)this.y_2);
    }

    public class11067() {
        this.m();
        this.y_0 = class06202.Nq();
        class11080 class110802 = Objects.requireNonNull(((Object)((Object)this)).getClass().getAnnotation(class11080.class), "The module should be annotated @ModuleTag");
        this.y_2 = class110802.y();
        this.y_3 = class110802.N();
        if (Arrays.stream(((class11072)((Object)this.y_2)).y()).noneMatch(class111062 -> {
            this.m();
            return class111062 == (class11106)((Object)((Object)this.y_3));
        })) {
            throw new IllegalArgumentException(String.format("Subcategory '%s' does not belong to category '%s'", ((class11106)((Object)this.y_3)).N(), ((class11072)((Object)this.y_2)).N()));
        }
        this.y_1 = class110802.L();
        this.N_1 = class110802.u();
        this.N_0 = new class12018(class12033.N((String)((String)this.y_1)));
        this.N_2 = class11089.N((String)this.y_1);
        this.N_3 = class09113.N((class11067)this, (class12002)class12002.UNKNOWN);
        class11938.W().y((class09173)this.N_3);
        class11938.b().N((class09173)this.N_3);
    }

    public class12018 B() {
        this.m();
        return (class12018)this.N_0;
    }

    public boolean Z() {
        return true;
    }

    public boolean i() {
        return true;
    }

    private void n() {
        class11938.L().L((Object)class11403.N((class11067)this));
    }

    private void m() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = false;
        }
    }

    private void v() {
        this.m();
        if (this.Z()) {
            this.N_4 = true;
            class11938.L().y((Object)this);
            this.y();
            this.n();
        }
    }

    private void j() {
        this.m();
        if (this.i()) {
            this.N_4 = false;
            class11938.L().N((Object)this);
            this.y();
            this.n();
        }
    }

    public boolean U() {
        this.m();
        return (Boolean)this.N_4;
    }

    public class11106 z() {
        this.m();
        return (class11106)((Object)this.y_3);
    }

    public class11101 u() {
        this.m();
        return (class11101)((Object)this.N_1);
    }

    public void y() {
    }

    public void E() {
        this.m();
        this.N((Boolean)this.N_4 == false);
    }

    public String N() {
        this.m();
        return (String)this.y_1;
    }

    public class12018 N_7(String string) {
        this.m();
        return new class12018("module").N(((String)this.y_1).toLowerCase()).N("setting").N(string);
    }

    public class11536<?> N(class11536<?> class115362) {
        return super.N(class115362);
    }

    public void N(class12002 class120022, int n, class09045 class090452, boolean bl) {
        this.m();
        ((class09173)this.N_3).N(class120022, n, class090452, bl);
    }

    public void N(boolean bl) {
        this.m();
        if ((Boolean)this.N_4 == bl) {
            return;
        }
        if (bl) {
            this.v();
        } else {
            this.j();
        }
    }

    public class06202 W() {
        this.m();
        return (class06202)this.y_0;
    }

    public class09173 R() {
        this.m();
        return (class09173)this.N_3;
    }
}

