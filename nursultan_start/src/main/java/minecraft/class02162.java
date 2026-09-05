/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  minecraft.class02346
 *  minecraft.class08538
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import minecraft.class02346;
import minecraft.class08538;

public class class02162
extends class08538<StringReader> {
    private final StringReader N;

    public int M() {
        return this.N.getCursor();
    }

    public class02162(class02346<StringReader> class023462, StringReader stringReader) {
        super(class023462);
        this.N = stringReader;
    }

    public StringReader R() {
        return this.N;
    }

    public void N(int n) {
        this.N.setCursor(n);
    }
}

