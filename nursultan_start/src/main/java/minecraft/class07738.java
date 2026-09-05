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
import minecraft.class07707;
import minecraft.class07726;

class class07738
implements class01477<class07707> {
    class07738() {
    }

    private static String u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(36L);
        String string = dataInput.readUTF();
        class077262.N(2L, string.length());
        return string;
    }

    public String y() {
        return "TAG_String";
    }

    public void y(DataInput dataInput, class07726 class077262) throws IOException {
        class07707.N(dataInput);
    }

    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        return class031752.N(class07738.u(dataInput, class077262));
    }

    public String N() {
        return "STRING";
    }

    public class07707 L(DataInput dataInput, class07726 class077262) throws IOException {
        return class07707.N(class07738.u(dataInput, class077262));
    }
}

