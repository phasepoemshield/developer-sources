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
import minecraft.class07680;
import minecraft.class07697;

public class class07683
implements class06799<class07680, class07697> {
    private static final byte N = 1;
    private static final byte y = 2;

    public void N(class07697 class076972, class00667 class006672) {
        int n = 0;
        if (class076972.N) {
            n |= 1;
        }
        if (class076972.y) {
            n |= 2;
        }
        class006672.writeByte(n);
    }

    public class07697 y(class00667 class006672) {
        byte by = class006672.readByte();
        return new class07697(this, (by & 1) != 0, (by & 2) != 0);
    }

    public void N(class07697 class076972, JsonObject jsonObject) {
        jsonObject.addProperty("amount", class076972.N ? "single" : "multiple");
        jsonObject.addProperty("type", class076972.y ? "players" : "entities");
    }

    public class07697 N(class07680 class076802) {
        return new class07697(this, class076802.M, class076802.B);
    }
}

