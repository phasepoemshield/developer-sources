/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class07047
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class01894;
import minecraft.class07047;
import minecraft.class08036;

public final class class01064
extends Enum<class01064> {
    public static final /* enum */ class01064 field_33944 = new class01064(class01894.y((String)"hud/heart/container"), class01894.y((String)"hud/heart/container_blinking"), class01894.y((String)"hud/heart/container"), class01894.y((String)"hud/heart/container_blinking"), class01894.y((String)"hud/heart/container_hardcore"), class01894.y((String)"hud/heart/container_hardcore_blinking"), class01894.y((String)"hud/heart/container_hardcore"), class01894.y((String)"hud/heart/container_hardcore_blinking"));
    public static final /* enum */ class01064 field_33945 = new class01064(class01894.y((String)"hud/heart/full"), class01894.y((String)"hud/heart/full_blinking"), class01894.y((String)"hud/heart/half"), class01894.y((String)"hud/heart/half_blinking"), class01894.y((String)"hud/heart/hardcore_full"), class01894.y((String)"hud/heart/hardcore_full_blinking"), class01894.y((String)"hud/heart/hardcore_half"), class01894.y((String)"hud/heart/hardcore_half_blinking"));
    public static final /* enum */ class01064 field_33946 = new class01064(class01894.y((String)"hud/heart/poisoned_full"), class01894.y((String)"hud/heart/poisoned_full_blinking"), class01894.y((String)"hud/heart/poisoned_half"), class01894.y((String)"hud/heart/poisoned_half_blinking"), class01894.y((String)"hud/heart/poisoned_hardcore_full"), class01894.y((String)"hud/heart/poisoned_hardcore_full_blinking"), class01894.y((String)"hud/heart/poisoned_hardcore_half"), class01894.y((String)"hud/heart/poisoned_hardcore_half_blinking"));
    public static final /* enum */ class01064 field_33947 = new class01064(class01894.y((String)"hud/heart/withered_full"), class01894.y((String)"hud/heart/withered_full_blinking"), class01894.y((String)"hud/heart/withered_half"), class01894.y((String)"hud/heart/withered_half_blinking"), class01894.y((String)"hud/heart/withered_hardcore_full"), class01894.y((String)"hud/heart/withered_hardcore_full_blinking"), class01894.y((String)"hud/heart/withered_hardcore_half"), class01894.y((String)"hud/heart/withered_hardcore_half_blinking"));
    public static final /* enum */ class01064 field_33948 = new class01064(class01894.y((String)"hud/heart/absorbing_full"), class01894.y((String)"hud/heart/absorbing_full_blinking"), class01894.y((String)"hud/heart/absorbing_half"), class01894.y((String)"hud/heart/absorbing_half_blinking"), class01894.y((String)"hud/heart/absorbing_hardcore_full"), class01894.y((String)"hud/heart/absorbing_hardcore_full_blinking"), class01894.y((String)"hud/heart/absorbing_hardcore_half"), class01894.y((String)"hud/heart/absorbing_hardcore_half_blinking"));
    public static final /* enum */ class01064 field_33949 = new class01064(class01894.y((String)"hud/heart/frozen_full"), class01894.y((String)"hud/heart/frozen_full_blinking"), class01894.y((String)"hud/heart/frozen_half"), class01894.y((String)"hud/heart/frozen_half_blinking"), class01894.y((String)"hud/heart/frozen_hardcore_full"), class01894.y((String)"hud/heart/frozen_hardcore_full_blinking"), class01894.y((String)"hud/heart/frozen_hardcore_half"), class01894.y((String)"hud/heart/frozen_hardcore_half_blinking"));
    private final class01894 field_45329;
    private final class01894 field_45330;
    private final class01894 field_45331;
    private final class01894 field_45332;
    private final class01894 field_45333;
    private final class01894 field_45334;
    private final class01894 field_45335;
    private final class01894 field_45336;
    private static final /* synthetic */ class01064[] field_33952;

    private class01064(class01894 class018942, class01894 class018943, class01894 class018944, class01894 class018945, class01894 class018946, class01894 class018947, class01894 class018948, class01894 class018949) {
        this.field_45329 = class018942;
        this.field_45330 = class018943;
        this.field_45331 = class018944;
        this.field_45332 = class018945;
        this.field_45333 = class018946;
        this.field_45334 = class018947;
        this.field_45335 = class018948;
        this.field_45336 = class018949;
    }

    static {
        field_33952 = class01064.N();
    }

    public static class01064[] values() {
        return (class01064[])field_33952.clone();
    }

    public static class01064 valueOf(String string) {
        return Enum.valueOf(class01064.class, string);
    }

    public class01894 N(boolean bl, boolean bl2, boolean bl3) {
        if (!bl) {
            if (bl2) {
                return bl3 ? this.field_45332 : this.field_45331;
            }
            return bl3 ? this.field_45330 : this.field_45329;
        }
        if (bl2) {
            return bl3 ? this.field_45336 : this.field_45335;
        }
        return bl3 ? this.field_45334 : this.field_45333;
    }

    private static /* synthetic */ class01064[] N() {
        return new class01064[]{field_33944, field_33945, field_33946, field_33947, field_33948, field_33949};
    }

    static class01064 N(class08036 class080362) {
        class01064 class010642 = class080362.method_6059(class07047.j) ? field_33946 : (class080362.method_6059(class07047.v) ? field_33947 : (class080362.method_32314() ? field_33949 : field_33945));
        return class010642;
    }
}

