/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01444
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class07726
 */
package minecraft;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01444;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class07009;
import minecraft.class07726;

class class07038
implements class01444<class07009> {
    public int L() {
        return 4;
    }

    class07038() {
    }

    private static float u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(12L);
        return dataInput.readFloat();
    }

    public String y() {
        return "TAG_Float";
    }

    public class07009 L(DataInput dataInput, class07726 class077262) throws IOException {
        return class07009.N(class07038.u(dataInput, class077262));
    }

    public String N() {
        return "FLOAT";
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07038.u(dataInput, class077262));
    }
}

