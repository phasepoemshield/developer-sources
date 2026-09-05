/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01424
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class06997
 *  minecraft.class07726
 */
package Nursultan;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01424;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class06997;
import minecraft.class07726;

public class class09471
implements class01424<class06997> {
    final /* synthetic */ int N;

    private IOException L() {
        return new IOException("Invalid tag id: " + this.N);
    }

    public class09471(int n) {
        this.N = n;
    }

    public void y(DataInput dataInput, class07726 class077262) throws IOException {
        throw this.L();
    }

    public String y() {
        return "UNKNOWN_" + this.N;
    }

    public String N() {
        return "INVALID[" + this.N + "]";
    }

    public void N(DataInput dataInput, int n, class07726 class077262) throws IOException {
        throw this.L();
    }

    public class06997 L(DataInput dataInput, class07726 class077262) throws IOException {
        throw this.L();
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        throw this.L();
    }
}

