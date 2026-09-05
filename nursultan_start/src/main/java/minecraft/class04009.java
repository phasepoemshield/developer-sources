/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07536
 */
package minecraft;

import java.util.Arrays;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class07536;

public final class class04009
extends Enum<class04009> {
    public static final /* enum */ class04009 field_38120 = new class04009(0, class04909.IN, class04909.IZ);
    public static final /* enum */ class04009 field_38121 = new class04009(40, class04909.gr, class04909.Iz);
    public static final /* enum */ class04009 field_38122 = new class04009(80, class04909.Iy, class04909.Iz);
    private static final class04009[] field_38123;
    private final int field_38124;
    private final class04891 field_38125;
    private final class04891 field_38732;
    private static final /* synthetic */ class04009[] field_38126;

    public class04891 L() {
        return this.field_38732;
    }

    private class04009(int n2, class04891 class048912, class04891 class048913) {
        this.field_38124 = n2;
        this.field_38125 = class048912;
        this.field_38732 = class048913;
    }

    static {
        field_38126 = class04009.i();
        field_38123 = (class04009[])class07536.N((Object)class04009.values(), (T class04009Array) -> Arrays.sort(class04009Array, (class040092, class040093) -> Integer.compare(class040093.field_38124, class040092.field_38124)));
    }

    public static class04009[] values() {
        return (class04009[])field_38126.clone();
    }

    public static class04009 valueOf(String string) {
        return Enum.valueOf(class04009.class, string);
    }

    private static /* synthetic */ class04009[] i() {
        return new class04009[]{field_38120, field_38121, field_38122};
    }

    public boolean u() {
        return this == field_38122;
    }

    public class04891 y() {
        return this.field_38125;
    }

    public static class04009 N(int n) {
        for (class04009 class040092 : field_38123) {
            if (n < class040092.field_38124) continue;
            return class040092;
        }
        return field_38120;
    }

    public int N() {
        return this.field_38124;
    }
}

