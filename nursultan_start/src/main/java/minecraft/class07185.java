/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class06069
 *  minecraft.class07227
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class05031;
import minecraft.class05033;
import minecraft.class06069;
import minecraft.class07186;
import minecraft.class07199;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07227;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public abstract class class07185
extends Enum<class07185>
implements class05033,
Predicate<class07211> {
    public static final /* enum */ class07185 field_11048 = new class07199("X", 0, "x");
    public static final /* enum */ class07185 field_11052 = new class07227("Y", 1, "y");
    public static final /* enum */ class07185 field_11051 = new class07186("Z", 2, "z");
    public static final class07185[] field_23780;
    public static final class05031<class07185> field_25065;
    private final String field_11053;
    private static final /* synthetic */ class07185[] field_11049;

    public boolean L() {
        return this == field_11048 || this == field_11051;
    }

    public class07221 M() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 2 -> class07221.field_11062;
            case 1 -> class07221.field_11064;
        };
    }

    class07185(String string2) {
        this.field_11053 = string2;
    }

    public String toString() {
        return this.field_11053;
    }

    public static class07185[] values() {
        return (class07185[])field_11049.clone();
    }

    public static class07185 valueOf(String string) {
        return Enum.valueOf(class07185.class, string);
    }

    private static /* synthetic */ class07185[] B() {
        return new class07185[]{field_11048, field_11052, field_11051};
    }

    public abstract class07211 i();

    public abstract class07211 u();

    public boolean y() {
        return this == field_11052;
    }

    public abstract int N(int var1, int var2, int var3);

    public abstract double N(double var1, double var3, double var5);

    public abstract boolean N(boolean var1, boolean var2, boolean var3);

    public String N() {
        return this.field_11053;
    }

    @Override
    public boolean test(@Nullable class07211 class072112) {
        return class072112 != null && class072112.z() == this;
    }

    public static class07185 N(class06069 class060692) {
        return (class07185)class07536.N((Object[])field_23780, (class06069)class060692);
    }

    public static @Nullable class07185 N(String string) {
        return (class07185)field_25065.N(string);
    }

    public class07211[] R() {
        return new class07211[]{this.u(), this.i()};
    }

    public String method_15434() {
        return this.field_11053;
    }

    static {
        field_11049 = class07185.B();
        field_23780 = class07185.values();
        field_25065 = class05033.N(class07185::values);
    }
}

