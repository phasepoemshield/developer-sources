/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00667
 *  minecraft.class06799
 */
package minecraft;

import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class06799;
import minecraft.class07783;
import minecraft.class07786;

public class class07780
implements class06799<class07786, class07783> {
    private static final byte N = 1;

    public void N(class07783 class077832, class00667 class006672) {
        int n = 0;
        if (class077832.N) {
            n |= 1;
        }
        class006672.writeByte(n);
    }

    public class07783 y(class00667 class006672) {
        boolean bl = (class006672.readByte() & 1) != 0;
        return new class07783(this, bl);
    }

    public void N(class07783 class077832, JsonObject jsonObject) {
        jsonObject.addProperty("amount", class077832.N ? "multiple" : "single");
    }

    public class07783 N(class07786 class077862) {
        return new class07783(this, class077862.y);
    }
}

