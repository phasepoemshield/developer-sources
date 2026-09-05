/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package minecraft;

import java.util.Set;
import minecraft.class00392;

final class class03429
extends Enum<class03429> {
    public static final /* enum */ class03429 field_46193 = new class03429((class00392)class00392.L((String)"connect.connecting"), Set.of());
    public static final /* enum */ class03429 field_46194 = new class03429((class00392)class00392.L((String)"connect.authorizing"), Set.of(field_46193));
    public static final /* enum */ class03429 field_46195 = new class03429((class00392)class00392.L((String)"connect.encrypting"), Set.of(field_46194));
    public static final /* enum */ class03429 field_46196 = new class03429((class00392)class00392.L((String)"connect.joining"), Set.of(field_46195, field_46193));
    final class00392 field_46197;
    final Set<class03429> field_46198;
    private static final /* synthetic */ class03429[] field_46199;

    private class03429(class00392 class003922, Set<class03429> set) {
        this.field_46197 = class003922;
        this.field_46198 = set;
    }

    static {
        field_46199 = class03429.N();
    }

    public static class03429[] values() {
        return (class03429[])field_46199.clone();
    }

    public static class03429 valueOf(String string) {
        return Enum.valueOf(class03429.class, string);
    }

    private static /* synthetic */ class03429[] N() {
        return new class03429[]{field_46193, field_46194, field_46195, field_46196};
    }
}

