/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class06449
extends Enum<class06449> {
    public static final /* enum */ class06449 field_28437 = new class06449(false, false, "");
    public static final /* enum */ class06449 field_28438 = new class06449(true, true, "downgrade");
    public static final /* enum */ class06449 field_28439 = new class06449(true, false, "snapshot");
    private final boolean field_28440;
    private final boolean field_28441;
    private final String field_28442;
    private static final /* synthetic */ class06449[] field_28443;

    public String L() {
        return this.field_28442;
    }

    private class06449(boolean bl, boolean bl2, String string2) {
        this.field_28440 = bl;
        this.field_28441 = bl2;
        this.field_28442 = string2;
    }

    static {
        field_28443 = class06449.u();
    }

    public static class06449[] values() {
        return (class06449[])field_28443.clone();
    }

    public static class06449 valueOf(String string) {
        return Enum.valueOf(class06449.class, string);
    }

    private static /* synthetic */ class06449[] u() {
        return new class06449[]{field_28437, field_28438, field_28439};
    }

    public boolean y() {
        return this.field_28441;
    }

    public boolean N() {
        return this.field_28440;
    }
}

