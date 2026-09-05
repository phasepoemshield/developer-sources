/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.LongArgumentType
 *  minecraft.class00667
 *  minecraft.class01906
 *  minecraft.class06799
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;
import minecraft.class00667;
import minecraft.class01906;
import minecraft.class04615;
import minecraft.class06799;

public class class04608
implements class06799<LongArgumentType, class04615> {
    public void N(class04615 class046152, class00667 class006672) {
        boolean bl = class046152.N != Long.MIN_VALUE;
        boolean bl2 = class046152.y != Long.MAX_VALUE;
        class006672.writeByte(class01906.N((boolean)bl, (boolean)bl2));
        if (bl) {
            class006672.writeLong(class046152.N);
        }
        if (bl2) {
            class006672.writeLong(class046152.y);
        }
    }

    public class04615 y(class00667 class006672) {
        byte by = class006672.readByte();
        long l = class01906.N((byte)by) ? class006672.readLong() : Long.MIN_VALUE;
        long l2 = class01906.y((byte)by) ? class006672.readLong() : Long.MAX_VALUE;
        return new class04615(this, l, l2);
    }

    public void N(class04615 class046152, JsonObject jsonObject) {
        if (class046152.N != Long.MIN_VALUE) {
            jsonObject.addProperty("min", (Number)class046152.N);
        }
        if (class046152.y != Long.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)class046152.y);
        }
    }

    public class04615 N(LongArgumentType longArgumentType) {
        return new class04615(this, longArgumentType.getMinimum(), longArgumentType.getMaximum());
    }
}

