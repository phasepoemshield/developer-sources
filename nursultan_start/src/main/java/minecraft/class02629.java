/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class08719
 */
package minecraft;

import minecraft.class01134;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class08719;

public final class class02629
extends Enum<class02629> {
    public static final /* enum */ class02629 field_56104 = new class02629(class01894.y((String)"textures/entity/horse/horse_skeleton.png"), class04802.uz, class04802.uU, class08719.field_56130, class04802.uE, class04802.uW);
    public static final /* enum */ class02629 field_56105 = new class02629(class01894.y((String)"textures/entity/horse/horse_zombie.png"), class04802.ik, class04802.iY, class08719.field_56129, class04802.iQ, class04802.iO);
    final class01894 field_56106;
    final class01134 field_56107;
    final class01134 field_56108;
    final class08719 field_56109;
    final class01134 field_56110;
    final class01134 field_56111;
    private static final /* synthetic */ class02629[] field_56112;

    private class02629(class01894 class018942, class01134 class011342, class01134 class011343, class08719 class087192, class01134 class011344, class01134 class011345) {
        this.field_56106 = class018942;
        this.field_56107 = class011342;
        this.field_56108 = class011343;
        this.field_56109 = class087192;
        this.field_56110 = class011344;
        this.field_56111 = class011345;
    }

    public static class02629[] values() {
        return (class02629[])field_56112.clone();
    }

    public static class02629 valueOf(String string) {
        return Enum.valueOf(class02629.class, string);
    }

    private static /* synthetic */ class02629[] N() {
        return new class02629[]{field_56104, field_56105};
    }

    static {
        field_56112 = class02629.N();
    }
}

