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
import minecraft.class07029;
import minecraft.class07726;

class class07035
implements class01477<class07029> {
    class07035() {
    }

    private static byte[] u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(24L);
        int n = dataInput.readInt();
        class077262.N(1L, (long)n);
        byte[] byArray = new byte[n];
        dataInput.readFully(byArray);
        return byArray;
    }

    public String y() {
        return "TAG_Byte_Array";
    }

    public void y(DataInput dataInput, class07726 class077262) throws IOException {
        dataInput.skipBytes(dataInput.readInt() * 1);
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07035.u(dataInput, class077262));
    }

    public String N() {
        return "BYTE[]";
    }

    public class07029 L(DataInput dataInput, class07726 class077262) throws IOException {
        return new class07029(class07035.u(dataInput, class077262));
    }
}

