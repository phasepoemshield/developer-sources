/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11296;
import java.util.UUID;

public class class11290 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public boolean L_init;

    public int L() {
        return (Integer)this.N_6;
    }

    public class11290 L(long l) {
        this.N_3 = l;
        return this;
    }

    public class11296 M() {
        return (class11296)((Object)this.N_5);
    }

    public class11290(UUID uUID, long l, String string, String string2, long l2, long l3, long l4, class11296 class112962, int n, boolean bl, byte[] byArray) {
        this.s();
        this.L_0 = uUID;
        this.L_1 = l;
        this.N_0 = string;
        this.N_1 = string2;
        this.N_2 = l2;
        this.N_3 = l3;
        this.N_4 = l4;
        this.N_5 = class112962;
        this.N_6 = n;
        this.y_0 = bl;
        this.y_1 = byArray;
    }

    public long B() {
        return (Long)this.N_2;
    }

    public long Z() {
        return (Long)this.L_1;
    }

    public String i() {
        return (String)this.N_0;
    }

    private void s() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0L;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0L;
            this.N_3 = 0L;
            this.N_4 = 0L;
            this.N_6 = 0;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }

    public byte[] U() {
        return (byte[])this.y_1;
    }

    public String z() {
        return (String)this.N_1;
    }

    public UUID u() {
        return (UUID)this.L_0;
    }

    public class11290 u(long l) {
        this.N_4 = l;
        return this;
    }

    public class11290 y(String string) {
        this.N_1 = string;
        return this;
    }

    public class11290 y(long l) {
        this.L_1 = l;
        return this;
    }

    public long y() {
        return (Long)this.N_3;
    }

    public boolean E() {
        return (Long)this.L_1 <= 0L;
    }

    public class11290 N(class11296 class112962) {
        this.N_5 = class112962;
        return this;
    }

    public boolean N() {
        return (Boolean)this.y_0;
    }

    public class11290 N(boolean bl) {
        this.y_0 = bl;
        return this;
    }

    public class11290 N(int n) {
        this.N_6 = n;
        return this;
    }

    public class11290 N(String string) {
        this.N_0 = string;
        return this;
    }

    public class11290 N(long l) {
        this.N_2 = l;
        return this;
    }

    public class11290 N(byte[] byArray) {
        this.y_1 = byArray;
        return this;
    }

    public long R() {
        return (Long)this.N_4;
    }
}

