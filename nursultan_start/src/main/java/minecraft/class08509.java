/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class05033;
import minecraft.class08493;
import minecraft.class08504;

public abstract class class08509
extends Enum<class08509>
implements class05033 {
    public static final /* enum */ class08509 field_22850 = new class08504("AND", 0, "AND");
    public static final /* enum */ class08509 field_22851 = new class08493("OR", 1, "OR");
    public static final Codec<class08509> field_56941;
    private final String field_22852;
    private static final /* synthetic */ class08509[] field_22853;

    class08509(String string2) {
        this.field_22852 = string2;
    }

    static {
        field_22853 = class08509.N();
        field_56941 = class05033.N(class08509::values);
    }

    public static class08509[] values() {
        return (class08509[])field_22853.clone();
    }

    public static class08509 valueOf(String string) {
        return Enum.valueOf(class08509.class, string);
    }

    private static /* synthetic */ class08509[] N() {
        return new class08509[]{field_22850, field_22851};
    }

    public abstract <V> Predicate<V> N(List<Predicate<V>> var1);

    public String method_15434() {
        return this.field_22852;
    }
}

