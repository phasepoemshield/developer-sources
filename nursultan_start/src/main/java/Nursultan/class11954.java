/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09252
 */
package Nursultan;

import Nursultan.class09252;
import Nursultan.class11940;
import Nursultan.class11951;

public class class11954
implements class11951<class09252> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;

    public String L() {
        return (String)this.N_7;
    }

    public short M() {
        return (Short)this.N_0;
    }

    public class11954(short s, byte by, String string, String string2, int n, String string3, String string4, String string5) {
        this.U();
        this.N_0 = s;
        this.N_1 = by;
        this.N_2 = string;
        this.N_3 = string2;
        this.N_4 = n;
        this.N_5 = string3;
        this.N_6 = string4;
        this.N_7 = string5;
    }

    public class11954() {
        this.U();
    }

    static {
        class11954.Z();
    }

    public String B() {
        return (String)this.N_6;
    }

    private static void Z() {
        y_0 = (byte)1;
        y_1 = (byte)2;
    }

    public int i() {
        return (Integer)this.N_4;
    }

    private void U() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = (short)0;
            this.N_1 = (byte)0;
            this.N_4 = 0;
        }
    }

    public String u() {
        return (String)this.N_3;
    }

    public String y() {
        return (String)this.N_2;
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = class119402.L();
        this.N_1 = class119402.E();
        this.N_2 = class119402.P();
        this.N_3 = class119402.P();
        this.N_4 = class119402.R();
        this.N_5 = class119402.P();
        this.N_6 = class119402.P();
        this.N_7 = class119402.P();
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((Short)this.N_0);
        class119402.L(((Byte)this.N_1).byteValue());
        class119402.N((String)this.N_2);
        class119402.N((String)this.N_3);
        class119402.y((Integer)this.N_4);
        class119402.N((String)this.N_5);
        class119402.N((String)this.N_6);
        class119402.N((String)this.N_7);
    }

    @Override
    public void N(class09252 class092522) {
        class092522.N(this);
    }

    public String N() {
        return (String)this.N_5;
    }

    public byte R() {
        return (Byte)this.N_1;
    }
}

