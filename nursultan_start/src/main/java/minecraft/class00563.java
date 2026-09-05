/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 */
package minecraft;

import java.util.function.Function;
import minecraft.class00533;
import minecraft.class00534;
import minecraft.class00545;
import minecraft.class00556;
import minecraft.class00667;

final class class00563
extends Enum<class00563> {
    public static final /* enum */ class00563 field_29171 = new class00563(class00534::new);
    public static final /* enum */ class00563 field_29172 = new class00563(class006672 -> class00556.y);
    public static final /* enum */ class00563 field_29173 = new class00563(class00545::new);
    final Function<class00667, class00533> field_29174;
    private static final /* synthetic */ class00563[] field_29175;

    private class00563(Function<class00667, class00533> function) {
        this.field_29174 = function;
    }

    static {
        field_29175 = class00563.N();
    }

    public static class00563[] values() {
        return (class00563[])field_29175.clone();
    }

    public static class00563 valueOf(String string) {
        return Enum.valueOf(class00563.class, string);
    }

    private static /* synthetic */ class00563[] N() {
        return new class00563[]{field_29171, field_29172, field_29173};
    }
}

