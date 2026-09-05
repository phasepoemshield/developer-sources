/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03003
 *  minecraft.class03019
 *  minecraft.class03028
 *  minecraft.class03979
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03003;
import minecraft.class03019;
import minecraft.class03028;
import minecraft.class03979;
import minecraft.class04039;

final class class04036
extends Enum<class04036>
implements class03028 {
    public static final /* enum */ class04036 field_35225 = new class04036();
    static final class03979<class04036> field_35226;
    private static final /* synthetic */ class04036[] field_35227;

    public static class04036[] values() {
        return (class04036[])field_35227.clone();
    }

    public static class04036 valueOf(String string) {
        return Enum.valueOf(class04036.class, string);
    }

    private static /* synthetic */ class04036[] y() {
        return new class04036[]{field_35225};
    }

    public class03003 apply(class04039 class040392) {
        return (arg_0, arg_1, arg_2) -> ((class03019)class040392.N).N(arg_0, arg_1, arg_2);
    }

    public class03979<? extends class03028> N() {
        return field_35226;
    }

    static {
        field_35227 = class04036.y();
        field_35226 = class03979.N((MapCodec)MapCodec.unit((Object)((Object)field_35225)));
    }
}

