/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 *  java.lang.MatchException
 *  minecraft.class00667
 *  minecraft.class06799
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import minecraft.class00667;
import minecraft.class06799;
import minecraft.class07222;

public class class07216
implements class06799<StringArgumentType, class07222> {
    public void N(class07222 class072222, class00667 class006672) {
        class006672.N((Enum)class072222.N);
    }

    public class07222 y(class00667 class006672) {
        StringArgumentType.StringType stringType = (StringArgumentType.StringType)class006672.y(StringArgumentType.StringType.class);
        return new class07222(this, stringType);
    }

    public void N(class07222 class072222, JsonObject jsonObject) {
        jsonObject.addProperty("type", switch (class072222.N) {
            default -> throw new MatchException(null, null);
            case StringArgumentType.StringType.SINGLE_WORD -> "word";
            case StringArgumentType.StringType.QUOTABLE_PHRASE -> "phrase";
            case StringArgumentType.StringType.GREEDY_PHRASE -> "greedy";
        });
    }

    public class07222 N(StringArgumentType stringArgumentType) {
        return new class07222(this, stringArgumentType.getType());
    }
}

