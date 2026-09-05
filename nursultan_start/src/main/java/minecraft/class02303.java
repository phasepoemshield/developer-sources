/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00429
 *  minecraft.class00455
 */
package minecraft;

import minecraft.class00429;
import minecraft.class00455;

public final class class02303
extends Enum<class02303> {
    public static final /* enum */ class02303 field_48817 = new class02303(class00429.N);
    private final class00455<?> field_62907;
    private static final /* synthetic */ class02303[] field_48818;

    private class02303(class00455<?> class004552) {
        this.field_62907 = class004552;
    }

    public static class02303[] values() {
        return (class02303[])field_48818.clone();
    }

    public static class02303 valueOf(String string) {
        return Enum.valueOf(class02303.class, string);
    }

    private static /* synthetic */ class02303[] y() {
        return new class02303[]{field_48817};
    }

    public class00455<?> N() {
        return this.field_62907;
    }

    static {
        field_48818 = class02303.y();
    }
}

