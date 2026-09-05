/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10875
 *  java.lang.MatchException
 *  minecraft.class08152
 *  minecraft.class08159
 *  minecraft.class08162
 *  minecraft.class08179
 *  minecraft.class08194
 *  minecraft.class08195
 */
package minecraft;

import Nursultan.class10875;
import minecraft.class08152;
import minecraft.class08159;
import minecraft.class08162;
import minecraft.class08179;
import minecraft.class08194;
import minecraft.class08195;

public interface class06984
extends class08152 {
    @Deprecated
    public static final class06984 N = class06984.y(class08195.field_63196);
    public static final class06984 y = class06984.y(class08195.field_63197);
    public static final class06984 L = class06984.y(class08195.field_63198);
    public static final class06984 u = class06984.y(class08195.field_63199);
    public static final class06984 i = class06984.y(class08195.field_63200);

    private static class06984 y(class08195 class081952) {
        return new class10875(class081952);
    }

    public class08195 N();

    public static class06984 N(class08195 class081952) {
        return switch (class08194.N[class081952.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> N;
            case 2 -> y;
            case 3 -> L;
            case 4 -> u;
            case 5 -> i;
        };
    }

    default public class08152 N(class08152 class081522) {
        if (class081522 instanceof class06984) {
            class06984 class069842 = (class06984)class081522;
            if (this.N().N(class069842.N())) {
                return class069842;
            }
            return this;
        }
        return super.N(class081522);
    }

    default public boolean hasPermission(class08159 class081592) {
        if (class081592 instanceof class08179) {
            class08179 class081792 = (class08179)class081592;
            return this.N().N(class081792.y());
        }
        if (class081592.equals((Object)class08162.i)) {
            return this.N().N(class08195.field_63198);
        }
        return false;
    }
}

