/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04042
 *  minecraft.class06069
 *  minecraft.class06075
 */
package minecraft;

import java.util.function.LongFunction;
import minecraft.class04042;
import minecraft.class06069;
import minecraft.class06075;

public final class class07813
extends Enum<class07813> {
    public static final /* enum */ class07813 field_35142 = new class07813(class06075::new);
    public static final /* enum */ class07813 field_35143 = new class07813(class04042::new);
    private final LongFunction<class06069> field_35144;
    private static final /* synthetic */ class07813[] field_35145;

    private class07813(LongFunction<class06069> longFunction) {
        this.field_35144 = longFunction;
    }

    static {
        field_35145 = class07813.N();
    }

    public static class07813[] values() {
        return (class07813[])field_35145.clone();
    }

    public static class07813 valueOf(String string) {
        return Enum.valueOf(class07813.class, string);
    }

    private static /* synthetic */ class07813[] N() {
        return new class07813[]{field_35142, field_35143};
    }

    public class06069 N(long l) {
        return this.field_35144.apply(l);
    }
}

