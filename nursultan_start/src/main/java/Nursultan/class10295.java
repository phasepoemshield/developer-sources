/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10097
 *  minecraft.class04039
 *  minecraft.class07830
 *  minecraft.class08050
 */
package Nursultan;

import Nursultan.class10097;
import minecraft.class04039;
import minecraft.class07830;
import minecraft.class08050;

public class class10295
extends class10097 {
    public class10295(class04039 class040392) {
        super(class040392);
    }

    protected boolean N() {
        int n;
        int n2 = this.L.z & 0xF;
        int n3 = this.L.U & 0xF;
        int n4 = Math.max(n3 - 1, 0);
        int n5 = Math.min(n3 + 1, 15);
        class08050 class080502 = this.L.M;
        int n6 = class080502.N(class07830.field_13194, n2, n4);
        if (class080502.N(class07830.field_13194, n2, n5) >= n6 + 4) {
            return true;
        }
        int n7 = Math.max(n2 - 1, 0);
        int n8 = Math.min(n2 + 1, 15);
        int n9 = class080502.N(class07830.field_13194, n7, n3);
        return n9 >= (n = class080502.N(class07830.field_13194, n8, n3)) + 4;
    }
}

