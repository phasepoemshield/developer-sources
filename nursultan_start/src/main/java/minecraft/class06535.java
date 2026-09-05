/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class05033;

public final class class06535
extends Enum<class06535>
implements class05033 {
    public static final /* enum */ class06535 field_64525 = new class06535("never", "options.musicToast.never");
    public static final /* enum */ class06535 field_64526 = new class06535("pause", "options.musicToast.pauseMenu");
    public static final /* enum */ class06535 field_64527 = new class06535("pause_and_toast", "options.musicToast.pauseMenuAndToast");
    public static final Codec<class06535> field_64528;
    private final String field_64529;
    private final class00392 field_64530;
    private final class00392 field_64531;
    private static final /* synthetic */ class06535[] field_64532;

    public boolean L() {
        return this != field_64525;
    }

    private class06535(String string2, String string3) {
        this.field_64529 = string2;
        this.field_64530 = class00392.L((String)string3);
        this.field_64531 = class00392.L((String)(string3 + ".tooltip"));
    }

    public static class06535[] values() {
        return (class06535[])field_64532.clone();
    }

    public static class06535 valueOf(String string) {
        return Enum.valueOf(class06535.class, string);
    }

    private static /* synthetic */ class06535[] i() {
        return new class06535[]{field_64525, field_64526, field_64527};
    }

    public boolean u() {
        return this == field_64527;
    }

    public class00392 y() {
        return this.field_64531;
    }

    public class00392 N() {
        return this.field_64530;
    }

    public String method_15434() {
        return this.field_64529;
    }

    static {
        field_64532 = class06535.i();
        field_64528 = class05033.N(class06535::values);
    }
}

