/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00808
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06273
 */
package minecraft;

import minecraft.class00808;
import minecraft.class04513;
import minecraft.class04540;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06273;

public class class04483 {
    private int N = 4;
    private float y = 6.0f;
    private float L = 2.0f;
    private float u = 2.0f;
    private float i = 1.0f;
    private int R = 40;
    private class04540<class00808> M = class04540.N();
    private class04540<class05946<class05074>> B = class04540.y().N((Object)class06273.NF).N((Object)class06273.Np).N();
    private class05946<class05074> Z = class06273.NC;

    public class04483 L(float f) {
        this.u = f;
        return this;
    }

    public class04483 u(float f) {
        this.i = f;
        return this;
    }

    public class04483 y(int n) {
        this.R = n;
        return this;
    }

    public class04483 y(class04540<class05946<class05074>> class045402) {
        this.B = class045402;
        return this;
    }

    public class04483 y(float f) {
        this.L = f;
        return this;
    }

    public class04513 N() {
        return new class04513(this.N, this.y, this.L, this.u, this.i, this.R, this.M, this.B, this.Z);
    }

    public class04483 N(class05946<class05074> class059462) {
        this.Z = class059462;
        return this;
    }

    public class04483 N(class04540<class00808> class045402) {
        this.M = class045402;
        return this;
    }

    public class04483 N(int n) {
        this.N = n;
        return this;
    }

    public class04483 N(float f) {
        this.y = f;
        return this;
    }
}

