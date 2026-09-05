/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class05033
 *  minecraft.class05285
 *  minecraft.class05288
 *  minecraft.class05297
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07536
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Vector3i
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class05033;
import minecraft.class05285;
import minecraft.class05288;
import minecraft.class05297;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07536;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Vector3i;
import org.jspecify.annotations.Nullable;

public final class class01372
extends Enum<class01372>
implements class05033 {
    public static final /* enum */ class01372 field_23292 = new class01372("identity", class05285.field_23362, false, false, false);
    public static final /* enum */ class01372 field_23299 = new class01372("rot_180_face_xy", class05285.field_23362, true, true, false);
    public static final /* enum */ class01372 field_23300 = new class01372("rot_180_face_xz", class05285.field_23362, true, false, true);
    public static final /* enum */ class01372 field_23301 = new class01372("rot_180_face_yz", class05285.field_23362, false, true, true);
    public static final /* enum */ class01372 field_23302 = new class01372("rot_120_nnn", class05285.field_23365, false, false, false);
    public static final /* enum */ class01372 field_23303 = new class01372("rot_120_nnp", class05285.field_23366, true, false, true);
    public static final /* enum */ class01372 field_23304 = new class01372("rot_120_npn", class05285.field_23366, false, true, true);
    public static final /* enum */ class01372 field_23305 = new class01372("rot_120_npp", class05285.field_23365, true, false, true);
    public static final /* enum */ class01372 field_23306 = new class01372("rot_120_pnn", class05285.field_23366, true, true, false);
    public static final /* enum */ class01372 field_23307 = new class01372("rot_120_pnp", class05285.field_23365, true, true, false);
    public static final /* enum */ class01372 field_23308 = new class01372("rot_120_ppn", class05285.field_23365, false, true, true);
    public static final /* enum */ class01372 field_23309 = new class01372("rot_120_ppp", class05285.field_23366, false, false, false);
    public static final /* enum */ class01372 field_23310 = new class01372("rot_180_edge_xy_neg", class05285.field_23363, true, true, true);
    public static final /* enum */ class01372 field_23311 = new class01372("rot_180_edge_xy_pos", class05285.field_23363, false, false, true);
    public static final /* enum */ class01372 field_23312 = new class01372("rot_180_edge_xz_neg", class05285.field_23367, true, true, true);
    public static final /* enum */ class01372 field_23313 = new class01372("rot_180_edge_xz_pos", class05285.field_23367, false, true, false);
    public static final /* enum */ class01372 field_23314 = new class01372("rot_180_edge_yz_neg", class05285.field_23364, true, true, true);
    public static final /* enum */ class01372 field_23315 = new class01372("rot_180_edge_yz_pos", class05285.field_23364, true, false, false);
    public static final /* enum */ class01372 field_23316 = new class01372("rot_90_x_neg", class05285.field_23364, false, false, true);
    public static final /* enum */ class01372 field_23317 = new class01372("rot_90_x_pos", class05285.field_23364, false, true, false);
    public static final /* enum */ class01372 field_23318 = new class01372("rot_90_y_neg", class05285.field_23367, true, false, false);
    public static final /* enum */ class01372 field_23319 = new class01372("rot_90_y_pos", class05285.field_23367, false, false, true);
    public static final /* enum */ class01372 field_23320 = new class01372("rot_90_z_neg", class05285.field_23363, false, true, false);
    public static final /* enum */ class01372 field_23321 = new class01372("rot_90_z_pos", class05285.field_23363, true, false, false);
    public static final /* enum */ class01372 field_23322 = new class01372("inversion", class05285.field_23362, true, true, true);
    public static final /* enum */ class01372 field_23323 = new class01372("invert_x", class05285.field_23362, true, false, false);
    public static final /* enum */ class01372 field_23266 = new class01372("invert_y", class05285.field_23362, false, true, false);
    public static final /* enum */ class01372 field_23267 = new class01372("invert_z", class05285.field_23362, false, false, true);
    public static final /* enum */ class01372 field_23268 = new class01372("rot_60_ref_nnn", class05285.field_23366, true, true, true);
    public static final /* enum */ class01372 field_23269 = new class01372("rot_60_ref_nnp", class05285.field_23365, true, false, false);
    public static final /* enum */ class01372 field_23270 = new class01372("rot_60_ref_npn", class05285.field_23365, false, false, true);
    public static final /* enum */ class01372 field_23271 = new class01372("rot_60_ref_npp", class05285.field_23366, false, false, true);
    public static final /* enum */ class01372 field_23272 = new class01372("rot_60_ref_pnn", class05285.field_23365, false, true, false);
    public static final /* enum */ class01372 field_23273 = new class01372("rot_60_ref_pnp", class05285.field_23366, true, false, false);
    public static final /* enum */ class01372 field_23274 = new class01372("rot_60_ref_ppn", class05285.field_23366, false, true, false);
    public static final /* enum */ class01372 field_23275 = new class01372("rot_60_ref_ppp", class05285.field_23365, true, true, true);
    public static final /* enum */ class01372 field_23276 = new class01372("swap_xy", class05285.field_23363, false, false, false);
    public static final /* enum */ class01372 field_23277 = new class01372("swap_yz", class05285.field_23364, false, false, false);
    public static final /* enum */ class01372 field_23278 = new class01372("swap_xz", class05285.field_23367, false, false, false);
    public static final /* enum */ class01372 field_23279 = new class01372("swap_neg_xy", class05285.field_23363, true, true, false);
    public static final /* enum */ class01372 field_23280 = new class01372("swap_neg_yz", class05285.field_23364, false, true, true);
    public static final /* enum */ class01372 field_23281 = new class01372("swap_neg_xz", class05285.field_23367, true, false, true);
    public static final /* enum */ class01372 field_23282 = new class01372("rot_90_ref_x_neg", class05285.field_23364, true, false, true);
    public static final /* enum */ class01372 field_23283 = new class01372("rot_90_ref_x_pos", class05285.field_23364, true, true, false);
    public static final /* enum */ class01372 field_23284 = new class01372("rot_90_ref_y_neg", class05285.field_23367, true, true, false);
    public static final /* enum */ class01372 field_23285 = new class01372("rot_90_ref_y_pos", class05285.field_23367, false, true, true);
    public static final /* enum */ class01372 field_23286 = new class01372("rot_90_ref_z_neg", class05285.field_23363, false, true, true);
    public static final /* enum */ class01372 field_23287 = new class01372("rot_90_ref_z_pos", class05285.field_23363, true, false, true);
    public static final class01372 field_64506;
    public static final class01372 field_64507;
    public static final class01372 field_64508;
    public static final class01372 field_64509;
    public static final class01372 field_64510;
    public static final class01372 field_64511;
    public static final class01372 field_64512;
    public static final class01372 field_64513;
    public static final class01372 field_64514;
    private final Matrix3fc field_23288;
    private final String field_23289;
    private @Nullable Map<class07211, class07211> field_23290;
    private final boolean field_23291;
    private final boolean field_23293;
    private final boolean field_23294;
    private final class05285 field_23295;
    private static final class01372[][] field_56956;
    private static final class01372[] field_56957;
    private static final /* synthetic */ class01372[] field_23298;

    public class05285 L() {
        return this.field_23295;
    }

    private class01372(String string2, class05285 class052852, boolean bl, boolean bl2, boolean bl3) {
        this.field_23289 = string2;
        this.field_23291 = bl;
        this.field_23293 = bl2;
        this.field_23294 = bl3;
        this.field_23295 = class052852;
        this.field_23288 = new Matrix3f().scaling(bl ? -1.0f : 1.0f, bl2 ? -1.0f : 1.0f, bl3 ? -1.0f : 1.0f).mul(class052852.y());
    }

    public String toString() {
        return this.field_23289;
    }

    public static class01372[] values() {
        return (class01372[])field_23298.clone();
    }

    public static class01372 valueOf(String string) {
        return Enum.valueOf(class01372.class, string);
    }

    private int u() {
        return class01372.N(this.field_23291, this.field_23293, this.field_23294, this.field_23295);
    }

    public Matrix3fc y() {
        return this.field_23288;
    }

    public Vector3i N(Vector3i vector3i) {
        this.field_23295.N(vector3i);
        vector3i.x = vector3i.x * (this.field_23291 ? -1 : 1);
        vector3i.y = vector3i.y * (this.field_23293 ? -1 : 1);
        vector3i.z = vector3i.z * (this.field_23294 ? -1 : 1);
        return vector3i;
    }

    public class01372 N(class01372 class013722) {
        return field_56956[this.ordinal()][class013722.ordinal()];
    }

    public class01372 N() {
        return field_56957[this.ordinal()];
    }

    public class07211 N(class07211 class072113) {
        if (this.field_23290 == null) {
            this.field_23290 = class07536.N_74(class07211.class, class072112 -> {
                class07185 class071852 = class072112.z();
                class07212 class072122 = class072112.i();
                class07185 class071853 = this.field_23295.N().N(class071852);
                class07212 class072123 = this.N(class071853) ? class072122.L() : class072122;
                return class07211.N((class07185)class071853, (class07212)class072123);
            });
        }
        return this.field_23290.get(class072113);
    }

    public class05288 N(class05288 class052882) {
        return class05288.N((class07211)this.N(class052882.N()), (class07211)this.N(class052882.y()));
    }

    private static int N(boolean bl, boolean bl2, boolean bl3, class05285 class052852) {
        int n = (bl3 ? 4 : 0) + (bl2 ? 2 : 0) + (bl ? 1 : 0);
        return class052852.ordinal() << 3 | n;
    }

    public boolean N(class07185 class071852) {
        return switch (class05297.N[class071852.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> this.field_23291;
            case 2 -> this.field_23293;
            case 3 -> this.field_23294;
        };
    }

    private static /* synthetic */ class01372[] R() {
        return new class01372[]{field_23292, field_23299, field_23300, field_23301, field_23302, field_23303, field_23304, field_23305, field_23306, field_23307, field_23308, field_23309, field_23310, field_23311, field_23312, field_23313, field_23314, field_23315, field_23316, field_23317, field_23318, field_23319, field_23320, field_23321, field_23322, field_23323, field_23266, field_23267, field_23268, field_23269, field_23270, field_23271, field_23272, field_23273, field_23274, field_23275, field_23276, field_23277, field_23278, field_23279, field_23280, field_23281, field_23282, field_23283, field_23284, field_23285, field_23286, field_23287};
    }

    public String method_15434() {
        return this.field_23289;
    }

    static {
        field_23298 = class01372.R();
        field_64506 = field_23317;
        field_64507 = field_23301;
        field_64508 = field_23316;
        field_64509 = field_23319;
        field_64510 = field_23300;
        field_64511 = field_23318;
        field_64512 = field_23321;
        field_64513 = field_23299;
        field_64514 = field_23320;
        field_56956 = (class01372[][])class07536.N(() -> {
            class01372[] class01372Array = class01372.values();
            class01372[][] class01372Array2 = new class01372[class01372Array.length][class01372Array.length];
            Map<Integer, Object> map = Arrays.stream(class01372Array).collect(Collectors.toMap(class01372::u, class013722 -> class013722));
            for (class01372 class013723 : class01372Array) {
                for (class01372 class013724 : class01372Array) {
                    class05285 class052852 = class013724.field_23295.N(class013723.field_23295);
                    boolean bl = class013723.N(class07185.field_11048) ^ class013724.N(class013723.field_23295.N(class07185.field_11048));
                    boolean bl2 = class013723.N(class07185.field_11052) ^ class013724.N(class013723.field_23295.N(class07185.field_11052));
                    boolean bl3 = class013723.N(class07185.field_11051) ^ class013724.N(class013723.field_23295.N(class07185.field_11051));
                    class01372Array2[class013723.ordinal()][class013724.ordinal()] = (class01372)((Object)((Object)map.get(class01372.N(bl, bl2, bl3, class052852))));
                }
            }
            return class01372Array2;
        });
        field_56957 = (class01372[])Arrays.stream(class01372.values()).map(class013722 -> Arrays.stream(class01372.values()).filter(class013723 -> class013722.N((class01372)((Object)((Object)class013723))) == field_23292).findAny().get()).toArray(class01372[]::new);
    }
}

