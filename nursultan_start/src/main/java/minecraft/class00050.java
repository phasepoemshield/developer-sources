/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class00050
extends Enum<class00050> {
    public static final /* enum */ class00050 field_60227 = new class00050(0, "realms.configuration.region_preference.automatic_player");
    public static final /* enum */ class00050 field_60226 = new class00050(1, "realms.configuration.region_preference.automatic_owner");
    public static final /* enum */ class00050 field_60228 = new class00050(2, "");
    public static final class00050 field_60229;
    public final int field_60230;
    public final String field_60231;
    private static final /* synthetic */ class00050[] field_60232;

    private class00050(int n2, String string2) {
        this.field_60230 = n2;
        this.field_60231 = string2;
    }

    static {
        field_60232 = class00050.N();
        field_60229 = field_60227;
    }

    public static class00050[] values() {
        return (class00050[])field_60232.clone();
    }

    public static class00050 valueOf(String string) {
        return Enum.valueOf(class00050.class, string);
    }

    private static /* synthetic */ class00050[] N() {
        return new class00050[]{field_60227, field_60226, field_60228};
    }
}

