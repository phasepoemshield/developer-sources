/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class06563
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00095;
import minecraft.class06563;

public final class class00111
extends Enum<class00111> {
    public static final /* enum */ class00111 field_60687 = new class00111(25, class06563.values(), 0.75f);
    public static final /* enum */ class00111 field_60688 = new class00111(30, class00095.N, 1.25f);
    final int field_60689;
    private final Map<class06563, Integer> field_60690;
    final class06563[] field_60691;
    private static final /* synthetic */ class00111[] field_60692;

    private class00111(int n2, class06563[] class06563Array, float f) {
        this.field_60689 = n2;
        this.field_60690 = Maps.newHashMap(Arrays.stream(class06563Array).collect(Collectors.toMap(class065632 -> class065632, class065632 -> class00095.N(class065632, f))));
        this.field_60691 = class06563Array;
    }

    static {
        field_60692 = class00111.N();
    }

    public static class00111[] values() {
        return (class00111[])field_60692.clone();
    }

    public static class00111 valueOf(String string) {
        return Enum.valueOf(class00111.class, string);
    }

    private static /* synthetic */ class00111[] N() {
        return new class00111[]{field_60687, field_60688};
    }

    public final int N(class06563 class065632) {
        return this.field_60690.get(class065632);
    }
}

