/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class04206
 *  minecraft.class07001
 *  minecraft.class07939
 */
package baritone.utils.schematic.format.defaults;

import baritone.utils.schematic.StaticSchematic;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class04206;
import minecraft.class07001;
import minecraft.class07939;

public final class MCEditSchematic
extends StaticSchematic {
    public MCEditSchematic(class07001 class070012) {
        int n;
        String string = (String)class070012.Z("Materials").orElseThrow();
        if (!string.equals("Alpha")) {
            throw new IllegalStateException("bad schematic " + string);
        }
        this.x = class070012.i("Width").orElse(0);
        this.y = class070012.i("Height").orElse(0);
        this.z = class070012.i("Length").orElse(0);
        byte[] byArray = (byte[])class070012.z("Blocks").orElseThrow();
        byte[] byArray2 = null;
        if (class070012.y("AddBlocks")) {
            byte[] byArray3 = (byte[])class070012.z("AddBlocks").orElseThrow();
            byArray2 = new byte[byArray3.length * 2];
            for (n = 0; n < byArray3.length; ++n) {
                byArray2[n * 2 + 0] = (byte)(byArray3[n] >> 4 & 0xF);
                byArray2[n * 2 + 1] = (byte)(byArray3[n] >> 0 & 0xF);
            }
        }
        this.states = new class00500[this.x][this.z][this.y];
        for (int i = 0; i < this.y; ++i) {
            for (n = 0; n < this.z; ++n) {
                for (int j = 0; j < this.x; ++j) {
                    class01894 class018942;
                    int n2 = (i * this.z + n) * this.x + j;
                    int n3 = byArray[n2] & 0xFF;
                    if (byArray2 != null) {
                        n3 |= byArray2[n2] << 8;
                    }
                    class00891 class008912 = (class018942 = class01894.L((String)class07939.N((int)n3))) == null ? class00869.N : (class00891)class04206.i.L(class018942).map(class03529::N).orElse(class00869.N);
                    this.states[j][n][i] = class008912.W();
                }
            }
        }
    }
}

