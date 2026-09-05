/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class02304
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05033
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00737;
import minecraft.class00753;
import minecraft.class02274;
import minecraft.class02278;
import minecraft.class02281;
import minecraft.class02285;
import minecraft.class02293;
import minecraft.class02296;
import minecraft.class02297;
import minecraft.class02304;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05033;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;

public class class02302
extends Enum<class02302>
implements class05033 {
    public static final /* enum */ class02302 field_48899 = new class02278("INACTIVE", 0, "inactive", class02297.field_48911);
    public static final /* enum */ class02302 field_48900 = new class02285("ACTIVE", 1, "active", class02297.field_48912);
    public static final /* enum */ class02302 field_48901 = new class02293("UNLOCKING", 2, "unlocking", class02297.field_48912);
    public static final /* enum */ class02302 field_48902 = new class02304("EJECTING", 3, "ejecting", class02297.field_48912);
    private static final int field_48903 = 20;
    private static final int field_48904 = 20;
    private static final int field_48905 = 20;
    private static final int field_48906 = 20;
    private final String field_48907;
    private final class02297 field_48908;
    private static final /* synthetic */ class02302[] field_48909;

    class02302(String string2, class02297 class022972) {
        this.field_48907 = string2;
        this.field_48908 = class022972;
    }

    public static class02302[] values() {
        return (class02302[])field_48909.clone();
    }

    public static class02302 valueOf(String string) {
        return Enum.valueOf(class02302.class, string);
    }

    private static /* synthetic */ class02302[] y() {
        return new class02302[]{field_48899, field_48900, field_48901, field_48902};
    }

    private static class02302 N(class04782 class047822, class07209 class072092, class02281 class022812, class02296 class022962, class02274 class022742, double d) {
        class022742.N(class047822, class072092, class022962, class022812, d);
        class022962.y(class047822.N() + 20L);
        return class022742.L() ? field_48900 : field_48899;
    }

    protected void N(class04782 class047822, class07209 class072092, class02281 class022812, class02274 class022742) {
    }

    private void N(class04782 class047822, class07209 class072092, class06584 class065842, float f) {
        class07206.N((class07299)class047822, (class06584)class065842, (int)2, (class07211)class07211.field_11036, (class00737)class06889.L((class00753)class072092).N(class07211.field_11036, 1.2));
        class047822.N(3017, class072092, 0);
        class047822.method_8396(null, class072092, class04909.OD, class04911.field_15245, 1.0f, 0.8f + 0.4f * f);
    }

    protected void N(class04782 class047822, class07209 class072092, class02281 class022812, class02274 class022742, boolean bl) {
    }

    public int N() {
        return this.field_48908.field_48913;
    }

    public class02302 N(class04782 class047822, class07209 class072092, class02281 class022812, class02296 class022962, class02274 class022742) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class02302.N(class047822, class072092, class022812, class022962, class022742, class022812.L());
            case 1 -> class02302.N(class047822, class072092, class022812, class022962, class022742, class022812.u());
            case 2 -> {
                class022962.y(class047822.N() + 20L);
                yield field_48902;
            }
            case 3 -> {
                if (class022962.u().isEmpty()) {
                    class022962.i();
                    yield class02302.N(class047822, class072092, class022812, class022962, class022742, class022812.u());
                }
                float var6_6 = class022962.B();
                this.N(class047822, class072092, class022962.M(), var6_6);
                class022742.N(class022962.R());
                int var8_7 = class022962.u().isEmpty() ? 20 : 20;
                class022962.y(class047822.N() + (long)var8_7);
                yield field_48902;
            }
        };
    }

    public void N(class04782 class047822, class07209 class072092, class02302 class023022, class02281 class022812, class02274 class022742, boolean bl) {
        this.N(class047822, class072092, class022812, class022742);
        class023022.N(class047822, class072092, class022812, class022742, bl);
    }

    public String method_15434() {
        return this.field_48907;
    }

    static {
        field_48909 = class02302.y();
    }
}

