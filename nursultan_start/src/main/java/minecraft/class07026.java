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
import minecraft.class07037;
import minecraft.class07726;

class class07026
implements class01444<class07037> {
    public int L() {
        return 1;
    }

    class07026() {
    }

    private static byte u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(9L);
        return dataInput.readByte();
    }

    public String y() {
        return "TAG_Byte";
    }

    public class07037 L(DataInput dataInput, class07726 class077262) throws IOException {
        return class07037.N(class07026.u(dataInput, class077262));
    }

    public String N() {
        return "BYTE";
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07026.u(dataInput, class077262));
    }
}

