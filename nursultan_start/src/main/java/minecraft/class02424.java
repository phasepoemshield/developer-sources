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

public final class class02424
extends Enum<class02424>
implements class05033 {
    public static final /* enum */ class02424 field_52743 = new class02424("minimized", "options.inactivityFpsLimit.minimized");
    public static final /* enum */ class02424 field_52744 = new class02424("afk", "options.inactivityFpsLimit.afk");
    public static final Codec<class02424> field_52745;
    private final String field_52747;
    private final class00392 field_64422;
    private static final /* synthetic */ class02424[] field_52749;

    private class02424(String string2, String string3) {
        this.field_52747 = string2;
        this.field_64422 = class00392.L((String)string3);
    }

    public static class02424[] values() {
        return (class02424[])field_52749.clone();
    }

    public static class02424 valueOf(String string) {
        return Enum.valueOf(class02424.class, string);
    }

    private static /* synthetic */ class02424[] y() {
        return new class02424[]{field_52743, field_52744};
    }

    public class00392 N() {
        return this.field_64422;
    }

    public String method_15434() {
        return this.field_52747;
    }

    static {
        field_52749 = class02424.y();
        field_52745 = class05033.N(class02424::values);
    }
}

