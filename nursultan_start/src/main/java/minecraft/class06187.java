/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class05033;

public final class class06187
extends Enum<class06187>
implements class05033 {
    public static final /* enum */ class06187 field_13692 = new class06187("normal", class00869.D, class00869.m, class00869.il);
    public static final /* enum */ class06187 field_13691 = new class06187("mesa", class00869.Nu, class00869.v, class00869.EL);
    public static final Codec<class06187> field_24839;
    private static final IntFunction<class06187> field_41680;
    private final String field_13689;
    private final class00500 field_28850;
    private final class00500 field_28851;
    private final class00500 field_28852;
    private static final /* synthetic */ class06187[] field_13688;

    public class00500 L() {
        return this.field_28851;
    }

    private class06187(String string2, class00891 class008912, class00891 class008913, class00891 class008914) {
        this.field_13689 = string2;
        this.field_28850 = class008912.W();
        this.field_28851 = class008913.W();
        this.field_28852 = class008914.W();
    }

    public static class06187[] values() {
        return (class06187[])field_13688.clone();
    }

    public static class06187 valueOf(String string) {
        return Enum.valueOf(class06187.class, string);
    }

    private static /* synthetic */ class06187[] i() {
        return new class06187[]{field_13692, field_13691};
    }

    public class00500 u() {
        return this.field_28852;
    }

    public class00500 y() {
        return this.field_28850;
    }

    public String N() {
        return this.field_13689;
    }

    public static class06187 N(int n) {
        return field_41680.apply(n);
    }

    public String method_15434() {
        return this.field_13689;
    }

    static {
        field_13688 = class06187.i();
        field_24839 = class05033.N(class06187::values);
        field_41680 = class02121.N(Enum::ordinal, (Object[])class06187.values(), (class02126)class02126.field_41664);
    }
}

