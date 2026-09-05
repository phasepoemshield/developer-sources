/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03711
 *  minecraft.class04770
 */
package minecraft;

import minecraft.class03711;
import minecraft.class04770;
import minecraft.class06385;
import minecraft.class06400;

abstract class class06430
extends Enum<class06430> {
    public static final /* enum */ class06430 field_13457 = new class06400("GRANT", 0, "grant");
    public static final /* enum */ class06430 field_13456 = new class06385("REVOKE", 1, "revoke");
    private final String field_13454;
    private static final /* synthetic */ class06430[] field_13455;

    class06430(String string2) {
        this.field_13454 = "commands.advancement." + string2;
    }

    static {
        field_13455 = class06430.y();
    }

    public static class06430[] values() {
        return (class06430[])field_13455.clone();
    }

    public static class06430 valueOf(String string) {
        return Enum.valueOf(class06430.class, string);
    }

    private static /* synthetic */ class06430[] y() {
        return new class06430[]{field_13457, field_13456};
    }

    protected String N() {
        return this.field_13454;
    }

    protected abstract boolean N(class04770 var1, class03711 var2);

    protected abstract boolean N(class04770 var1, class03711 var2, String var3);

    public int N(class04770 class047702, Iterable<class03711> iterable, boolean bl) {
        int n = 0;
        if (!bl) {
            class047702.method_14236().N(class047702, true);
        }
        for (class03711 class037112 : iterable) {
            if (!this.N(class047702, class037112)) continue;
            ++n;
        }
        if (!bl) {
            class047702.method_14236().N(class047702, false);
        }
        return n;
    }
}

