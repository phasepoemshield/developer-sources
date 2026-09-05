/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  minecraft.class00667
 *  minecraft.class01906
 *  minecraft.class06799
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;
import minecraft.class00667;
import minecraft.class01906;
import minecraft.class06799;
import minecraft.class07195;

public class class07198
implements class06799<FloatArgumentType, class07195> {
    public void N(class07195 class071952, class00667 class006672) {
        boolean bl = class071952.N != -3.4028235E38f;
        boolean bl2 = class071952.y != Float.MAX_VALUE;
        class006672.writeByte(class01906.N((boolean)bl, (boolean)bl2));
        if (bl) {
            class006672.writeFloat(class071952.N);
        }
        if (bl2) {
            class006672.writeFloat(class071952.y);
        }
    }

    public class07195 y(class00667 class006672) {
        byte by = class006672.readByte();
        float f = class01906.N((byte)by) ? class006672.readFloat() : -3.4028235E38f;
        float f2 = class01906.y((byte)by) ? class006672.readFloat() : Float.MAX_VALUE;
        return new class07195(this, f, f2);
    }

    public void N(class07195 class071952, JsonObject jsonObject) {
        if (class071952.N != -3.4028235E38f) {
            jsonObject.addProperty("min", (Number)Float.valueOf(class071952.N));
        }
        if (class071952.y != Float.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)Float.valueOf(class071952.y));
        }
    }

    public class07195 N(FloatArgumentType floatArgumentType) {
        return new class07195(this, floatArgumentType.getMinimum(), floatArgumentType.getMaximum());
    }
}

