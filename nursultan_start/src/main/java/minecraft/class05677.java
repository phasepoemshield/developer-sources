/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class05642
 *  minecraft.class05662
 *  minecraft.class07709
 *  minecraft.class07793
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class05033;
import minecraft.class05642;
import minecraft.class05662;
import minecraft.class05674;
import minecraft.class07709;
import minecraft.class07793;

public abstract class class05677
extends Enum<class05677>
implements class05033 {
    public static final /* enum */ class05677 field_17032 = new class05642("REPLACE", 0, "replace");
    public static final /* enum */ class05677 field_17033 = new class05674("APPEND", 1, "append");
    public static final /* enum */ class05677 field_17034 = new class05662("MERGE", 2, "merge");
    public static final Codec<class05677> field_45821;
    private final String field_17035;
    private static final /* synthetic */ class05677[] field_17036;

    class05677(String string2) {
        this.field_17035 = string2;
    }

    static {
        field_17036 = class05677.N();
        field_45821 = class05033.N(class05677::values);
    }

    public static class05677[] values() {
        return (class05677[])field_17036.clone();
    }

    public static class05677 valueOf(String string) {
        return Enum.valueOf(class05677.class, string);
    }

    private static /* synthetic */ class05677[] N() {
        return new class05677[]{field_17032, field_17033, field_17034};
    }

    public abstract void N(class07709 var1, class07793 var2, List<class07709> var3) throws CommandSyntaxException;

    public String method_15434() {
        return this.field_17035;
    }
}

