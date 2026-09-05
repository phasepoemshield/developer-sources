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
import minecraft.class07019;
import minecraft.class07726;

class class07014
implements class01444<class07019> {
    public int L() {
        return 8;
    }

    class07014() {
    }

    private static double u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(16L);
        return dataInput.readDouble();
    }

    public String y() {
        return "TAG_Double";
    }

    public class07019 L(DataInput dataInput, class07726 class077262) throws IOException {
        return class07019.N(class07014.u(dataInput, class077262));
    }

    public String N() {
        return "DOUBLE";
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07014.u(dataInput, class077262));
    }
}

