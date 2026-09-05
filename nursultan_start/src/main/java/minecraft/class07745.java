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
import minecraft.class07729;

class class07745
implements class01444<class07729> {
    public int L() {
        return 8;
    }

    class07745() {
    }

    private static long u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(16L);
        return dataInput.readLong();
    }

    public String y() {
        return "TAG_Long";
    }

    public class07729 L(DataInput dataInput, class07726 class077262) throws IOException {
        return class07729.N(class07745.u(dataInput, class077262));
    }

    public String N() {
        return "LONG";
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07745.u(dataInput, class077262));
    }
}

