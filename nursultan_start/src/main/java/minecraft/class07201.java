/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  minecraft.class00667
 *  minecraft.class01906
 *  minecraft.class06799
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import minecraft.class00667;
import minecraft.class01906;
import minecraft.class06799;
import minecraft.class07187;

public class class07201
implements class06799<IntegerArgumentType, class07187> {
    public void N(class07187 class071872, class00667 class006672) {
        boolean bl = class071872.N != Integer.MIN_VALUE;
        boolean bl2 = class071872.y != Integer.MAX_VALUE;
        class006672.writeByte(class01906.N((boolean)bl, (boolean)bl2));
        if (bl) {
            class006672.writeInt(class071872.N);
        }
        if (bl2) {
            class006672.writeInt(class071872.y);
        }
    }

    public class07187 y(class00667 class006672) {
        byte by = class006672.readByte();
        int n = class01906.N((byte)by) ? class006672.readInt() : Integer.MIN_VALUE;
        int n2 = class01906.y((byte)by) ? class006672.readInt() : Integer.MAX_VALUE;
        return new class07187(this, n, n2);
    }

    public void N(class07187 class071872, JsonObject jsonObject) {
        if (class071872.N != Integer.MIN_VALUE) {
            jsonObject.addProperty("min", (Number)class071872.N);
        }
        if (class071872.y != Integer.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)class071872.y);
        }
    }

    public class07187 N(IntegerArgumentType integerArgumentType) {
        return new class07187(this, integerArgumentType.getMinimum(), integerArgumentType.getMaximum());
    }
}

