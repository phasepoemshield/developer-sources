/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class05033;

public final class class08195
extends Enum<class08195>
implements class05033 {
    public static final /* enum */ class08195 field_63196 = new class08195("all", 0);
    public static final /* enum */ class08195 field_63197 = new class08195("moderators", 1);
    public static final /* enum */ class08195 field_63198 = new class08195("gamemasters", 2);
    public static final /* enum */ class08195 field_63199 = new class08195("admins", 3);
    public static final /* enum */ class08195 field_63200 = new class08195("owners", 4);
    public static final Codec<class08195> field_63201;
    private static final IntFunction<class08195> field_63203;
    public static final Codec<class08195> field_63202;
    private final String field_63204;
    private final int field_63205;
    private static final /* synthetic */ class08195[] field_63206;

    private class08195(String string2, int n2) {
        this.field_63204 = string2;
        this.field_63205 = n2;
    }

    public static class08195[] values() {
        return (class08195[])field_63206.clone();
    }

    public static class08195 valueOf(String string) {
        return Enum.valueOf(class08195.class, string);
    }

    private static /* synthetic */ class08195[] y() {
        return new class08195[]{field_63196, field_63197, field_63198, field_63199, field_63200};
    }

    public int N() {
        return this.field_63205;
    }

    public static class08195 N(int n) {
        return field_63203.apply(n);
    }

    public boolean N(class08195 class081952) {
        return this.field_63205 >= class081952.field_63205;
    }

    public String method_15434() {
        return this.field_63204;
    }

    static {
        field_63206 = class08195.y();
        field_63201 = class05033.N(class08195::values);
        field_63203 = class02121.N(class081952 -> class081952.field_63205, (Object[])class08195.values(), (class02126)class02126.field_41666);
        field_63202 = Codec.INT.xmap(field_63203::apply, class081952 -> class081952.field_63205);
    }
}

