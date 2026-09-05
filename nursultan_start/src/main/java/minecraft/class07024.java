/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01477
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class07726
 */
package minecraft;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01477;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class06995;
import minecraft.class07726;

class class07024
implements class01477<class06995> {
    class07024() {
    }

    private static int[] u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(24L);
        int n = dataInput.readInt();
        class077262.N(4L, (long)n);
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = dataInput.readInt();
        }
        return nArray;
    }

    public String y() {
        return "TAG_Int_Array";
    }

    public void y(DataInput dataInput, class07726 class077262) throws IOException {
        dataInput.skipBytes(dataInput.readInt() * 4);
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07024.u(dataInput, class077262));
    }

    public String N() {
        return "INT[]";
    }

    public class06995 L(DataInput dataInput, class07726 class077262) throws IOException {
        return new class06995(class07024.u(dataInput, class077262));
    }
}

