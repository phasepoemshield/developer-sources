/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01444
 *  minecraft.class03154
 *  minecraft.class03175
 */
package minecraft;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01444;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class07726;
import minecraft.class07730;

class class07733
implements class01444<class07730> {
    public int L() {
        return 2;
    }

    class07733() {
    }

    private static short u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(10L);
        return dataInput.readShort();
    }

    public String y() {
        return "TAG_Short";
    }

    public class07730 L(DataInput dataInput, class07726 class077262) throws IOException {
        return class07730.N(class07733.u(dataInput, class077262));
    }

    public String N() {
        return "SHORT";
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07733.u(dataInput, class077262));
    }
}

