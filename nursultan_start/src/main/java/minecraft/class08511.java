/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.MatchException
 *  minecraft.class01372
 *  minecraft.class04995
 */
package minecraft;

import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import minecraft.class01372;
import minecraft.class04995;

public final class class08511
extends Enum<class08511> {
    public static final /* enum */ class08511 field_57029 = new class08511(0, class01372.field_23292, class01372.field_23292, class01372.field_23292);
    public static final /* enum */ class08511 field_57030 = new class08511(1, class01372.field_64508, class01372.field_64511, class01372.field_64514);
    public static final /* enum */ class08511 field_57031 = new class08511(2, class01372.field_64507, class01372.field_64510, class01372.field_64513);
    public static final /* enum */ class08511 field_57032 = new class08511(3, class01372.field_64506, class01372.field_64509, class01372.field_64512);
    public static final Codec<class08511> field_57033;
    public final int field_57034;
    public final class01372 field_64521;
    public final class01372 field_64522;
    public final class01372 field_64523;
    private static final /* synthetic */ class08511[] field_57035;

    private class08511(int n2, class01372 class013722, class01372 class013723, class01372 class013724) {
        this.field_57034 = n2;
        this.field_64521 = class013722;
        this.field_64522 = class013723;
        this.field_64523 = class013724;
    }

    public static class08511[] values() {
        return (class08511[])field_57035.clone();
    }

    public static class08511 valueOf(String string) {
        return Enum.valueOf(class08511.class, string);
    }

    public int y(int n) {
        return (n + this.field_57034) % 4;
    }

    private static /* synthetic */ class08511[] N() {
        return new class08511[]{field_57029, field_57030, field_57031, field_57032};
    }

    @Deprecated
    public static class08511 N(int n) {
        return switch (class04995.L((int)n, (int)360)) {
            case 0 -> field_57029;
            case 90 -> field_57030;
            case 180 -> field_57031;
            case 270 -> field_57032;
            default -> throw new JsonParseException("Invalid rotation " + n + " found, only 0/90/180/270 allowed");
        };
    }

    public static class01372 N(class08511 class085112, class08511 class085113, class08511 class085114) {
        return class085114.field_64523.N(class085113.field_64522.N(class085112.field_64521));
    }

    public static class01372 N(class08511 class085112, class08511 class085113) {
        return class085113.field_64522.N(class085112.field_64521);
    }

    static {
        field_57035 = class08511.N();
        field_57033 = Codec.INT.comapFlatMap(n -> switch (class04995.L((int)n, (int)360)) {
            case 0 -> DataResult.success((Object)((Object)field_57029));
            case 90 -> DataResult.success((Object)((Object)field_57030));
            case 180 -> DataResult.success((Object)((Object)field_57031));
            case 270 -> DataResult.success((Object)((Object)field_57032));
            default -> DataResult.error(() -> "Invalid rotation " + n + " found, only 0/90/180/270 allowed");
        }, class085112 -> switch (class085112.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> 0;
            case 1 -> 90;
            case 2 -> 180;
            case 3 -> 270;
        });
    }
}

