/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  java.lang.MatchException
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import minecraft.class05033;

public final class class02584
extends Enum<class02584>
implements class05033 {
    public static final /* enum */ class02584 field_52394 = new class02584("true");
    public static final /* enum */ class02584 field_52395 = new class02584("false");
    public static final /* enum */ class02584 field_52396 = new class02584("default");
    public static final Codec<class02584> field_64315;
    private final String field_64316;
    private static final /* synthetic */ class02584[] field_52397;

    private class02584(String string2) {
        this.field_64316 = string2;
    }

    public static class02584[] values() {
        return (class02584[])field_52397.clone();
    }

    public static class02584 valueOf(String string) {
        return Enum.valueOf(class02584.class, string);
    }

    public boolean y(boolean bl) {
        return switch (this.ordinal()) {
            case 0 -> true;
            case 1 -> false;
            default -> bl;
        };
    }

    private static /* synthetic */ class02584[] N() {
        return new class02584[]{field_52394, field_52395, field_52396};
    }

    public static class02584 N(boolean bl) {
        return bl ? field_52394 : field_52395;
    }

    public String method_15434() {
        return this.field_64316;
    }

    static {
        field_52397 = class02584.N();
        field_64315 = Codec.either((Codec)Codec.BOOL, (Codec)class05033.N(class02584::values)).xmap(either -> (class02584)((Object)((Object)either.map(class02584::N, Function.identity()))), class025842 -> switch (class025842.ordinal()) {
            default -> throw new MatchException(null, null);
            case 2 -> Either.right((Object)class025842);
            case 0 -> Either.left((Object)true);
            case 1 -> Either.left((Object)false);
        });
    }
}

