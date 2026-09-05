/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 *  java.lang.MatchException
 *  minecraft.class04348
 *  minecraft.class06763
 *  minecraft.class06799
 */
package minecraft;

import com.mojang.brigadier.arguments.StringArgumentType;
import minecraft.class04348;
import minecraft.class06763;
import minecraft.class06799;
import minecraft.class07216;

public final class class07222
implements class06763<StringArgumentType> {
    final StringArgumentType.StringType N;
    final /* synthetic */ class07216 y;

    public class07222(class07216 class072162, StringArgumentType.StringType stringType) {
        this.y = class072162;
        this.N = stringType;
    }

    public StringArgumentType y(class04348 class043482) {
        return switch (this.N) {
            default -> throw new MatchException(null, null);
            case StringArgumentType.StringType.SINGLE_WORD -> StringArgumentType.word();
            case StringArgumentType.StringType.QUOTABLE_PHRASE -> StringArgumentType.string();
            case StringArgumentType.StringType.GREEDY_PHRASE -> StringArgumentType.greedyString();
        };
    }

    public class06799<StringArgumentType, ?> N() {
        return this.y;
    }
}

