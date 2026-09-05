/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class01372
 *  minecraft.class05033
 *  minecraft.class06338
 *  minecraft.class06993
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class01372;
import minecraft.class05033;
import minecraft.class06338;
import minecraft.class06993;
import minecraft.class07185;
import minecraft.class07211;

public final class class07111
extends Enum<class07111>
implements class05033 {
    public static final /* enum */ class07111 field_11302 = new class07111("none", class01372.field_23292);
    public static final /* enum */ class07111 field_11300 = new class07111("left_right", class01372.field_23267);
    public static final /* enum */ class07111 field_11301 = new class07111("front_back", class01372.field_23323);
    public static final Codec<class07111> field_39311;
    @Deprecated
    public static final Codec<class07111> field_56669;
    private final String field_39312;
    private final class00392 field_27883;
    private final class01372 field_23263;
    private static final /* synthetic */ class07111[] field_11299;

    private static /* synthetic */ class07111[] L() {
        return new class07111[]{field_11302, field_11300, field_11301};
    }

    private class07111(String string2, class01372 class013722) {
        this.field_39312 = string2;
        this.field_27883 = class00392.L((String)("mirror." + string2));
        this.field_23263 = class013722;
    }

    public static class07111[] values() {
        return (class07111[])field_11299.clone();
    }

    public static class07111 valueOf(String string) {
        return Enum.valueOf(class07111.class, string);
    }

    public class07211 y(class07211 class072112) {
        if (this == field_11301 && class072112.z() == class07185.field_11048) {
            return class072112.b();
        }
        if (this == field_11300 && class072112.z() == class07185.field_11051) {
            return class072112.b();
        }
        return class072112;
    }

    public class00392 y() {
        return this.field_27883;
    }

    public class06993 N(class07211 class072112) {
        class07185 class071852 = class072112.z();
        return this == field_11300 && class071852 == class07185.field_11051 || this == field_11301 && class071852 == class07185.field_11048 ? class06993.field_11464 : class06993.field_11467;
    }

    public int N(int n, int n2) {
        int n3 = n2 / 2;
        int n4 = n > n3 ? n - n2 : n;
        switch (this.ordinal()) {
            case 2: {
                return (n2 - n4) % n2;
            }
            case 1: {
                return (n3 - n4 + n2) % n2;
            }
        }
        return n;
    }

    public class01372 N() {
        return this.field_23263;
    }

    public String method_15434() {
        return this.field_39312;
    }

    static {
        field_11299 = class07111.L();
        field_39311 = class05033.N(class07111::values);
        field_56669 = class06338.L(class07111::valueOf);
    }
}

