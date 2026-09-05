/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 *  minecraft.class07211
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class05033;
import minecraft.class07211;
import minecraft.class07536;

public final class class05288
extends Enum<class05288>
implements class05033 {
    public static final /* enum */ class05288 field_23381 = new class05288("down_east", class07211.field_11033, class07211.field_11034);
    public static final /* enum */ class05288 field_23382 = new class05288("down_north", class07211.field_11033, class07211.field_11043);
    public static final /* enum */ class05288 field_23383 = new class05288("down_south", class07211.field_11033, class07211.field_11035);
    public static final /* enum */ class05288 field_23384 = new class05288("down_west", class07211.field_11033, class07211.field_11039);
    public static final /* enum */ class05288 field_23385 = new class05288("up_east", class07211.field_11036, class07211.field_11034);
    public static final /* enum */ class05288 field_23386 = new class05288("up_north", class07211.field_11036, class07211.field_11043);
    public static final /* enum */ class05288 field_23387 = new class05288("up_south", class07211.field_11036, class07211.field_11035);
    public static final /* enum */ class05288 field_23388 = new class05288("up_west", class07211.field_11036, class07211.field_11039);
    public static final /* enum */ class05288 field_23389 = new class05288("west_up", class07211.field_11039, class07211.field_11036);
    public static final /* enum */ class05288 field_23390 = new class05288("east_up", class07211.field_11034, class07211.field_11036);
    public static final /* enum */ class05288 field_23391 = new class05288("north_up", class07211.field_11043, class07211.field_11036);
    public static final /* enum */ class05288 field_23392 = new class05288("south_up", class07211.field_11035, class07211.field_11036);
    private static final int field_54867;
    private static final class05288[] field_54868;
    private final String field_23394;
    private final class07211 field_23395;
    private final class07211 field_23396;
    private static final /* synthetic */ class05288[] field_23397;

    private static /* synthetic */ class05288[] L() {
        return new class05288[]{field_23381, field_23382, field_23383, field_23384, field_23385, field_23386, field_23387, field_23388, field_23389, field_23390, field_23391, field_23392};
    }

    private class05288(String string2, class07211 class072112, class07211 class072113) {
        this.field_23394 = string2;
        this.field_23396 = class072112;
        this.field_23395 = class072113;
    }

    public static class05288[] values() {
        return (class05288[])field_23397.clone();
    }

    public static class05288 valueOf(String string) {
        return Enum.valueOf(class05288.class, string);
    }

    public class07211 y() {
        return this.field_23395;
    }

    private static int y(class07211 class072112, class07211 class072113) {
        return class072112.ordinal() * field_54867 + class072113.ordinal();
    }

    public static class05288 N(class07211 class072112, class07211 class072113) {
        return field_54868[class05288.y(class072112, class072113)];
    }

    public class07211 N() {
        return this.field_23396;
    }

    public String method_15434() {
        return this.field_23394;
    }

    static {
        field_23397 = class05288.L();
        field_54867 = class07211.values().length;
        field_54868 = (class05288[])class07536.N((Object)new class05288[field_54867 * field_54867], (T class05288Array) -> {
            class05288[] class05288Array2 = class05288.values();
            int n = class05288Array2.length;
            for (int i = 0; i < n; ++i) {
                class05288 class052882;
                class05288Array[class05288.y((class07211)class052882.field_23396, (class07211)class052882.field_23395)] = class052882 = class05288Array2[i];
            }
        });
    }
}

