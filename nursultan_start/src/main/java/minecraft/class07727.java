/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01477
 *  minecraft.class03154
 *  minecraft.class03175
 */
package minecraft;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01477;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class07726;
import minecraft.class07757;

class class07727
implements class01477<class07757> {
    class07727() {
    }

    private static long[] u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(24L);
        int n = dataInput.readInt();
        class077262.N(8L, n);
        long[] lArray = new long[n];
        for (int i = 0; i < n; ++i) {
            lArray[i] = dataInput.readLong();
        }
        return lArray;
    }

    public String y() {
        return "TAG_Long_Array";
    }

    public void y(DataInput dataInput, class07726 class077262) throws IOException {
        dataInput.skipBytes(dataInput.readInt() * 8);
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07727.u(dataInput, class077262));
    }

    public String N() {
        return "LONG[]";
    }

    public class07757 L(DataInput dataInput, class07726 class077262) throws IOException {
        return new class07757(class07727.u(dataInput, class077262));
    }
}

