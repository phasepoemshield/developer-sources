/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  minecraft.class00667
 *  minecraft.class01906
 *  minecraft.class06799
 *  minecraft.class07213
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import minecraft.class00667;
import minecraft.class01906;
import minecraft.class06799;
import minecraft.class07213;

public class class07224
implements class06799<DoubleArgumentType, class07213> {
    public void N(class07213 class072132, class00667 class006672) {
        boolean bl = class072132.N != -1.7976931348623157E308;
        boolean bl2 = class072132.y != Double.MAX_VALUE;
        class006672.writeByte(class01906.N((boolean)bl, (boolean)bl2));
        if (bl) {
            class006672.writeDouble(class072132.N);
        }
        if (bl2) {
            class006672.writeDouble(class072132.y);
        }
    }

    public class07213 y(class00667 class006672) {
        byte by = class006672.readByte();
        double d = class01906.N((byte)by) ? class006672.readDouble() : -1.7976931348623157E308;
        double d2 = class01906.y((byte)by) ? class006672.readDouble() : Double.MAX_VALUE;
        return new class07213(this, d, d2);
    }

    public void N(class07213 class072132, JsonObject jsonObject) {
        if (class072132.N != -1.7976931348623157E308) {
            jsonObject.addProperty("min", (Number)class072132.N);
        }
        if (class072132.y != Double.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)class072132.y);
        }
    }

    public class07213 N(DoubleArgumentType doubleArgumentType) {
        return new class07213(this, doubleArgumentType.getMinimum(), doubleArgumentType.getMaximum());
    }
}

