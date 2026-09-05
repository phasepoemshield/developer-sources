/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class00642
 *  minecraft.class03802
 *  minecraft.class03824
 *  minecraft.class03849
 *  minecraft.class07367
 *  minecraft.class07369
 */
package minecraft;

import java.util.UUID;
import minecraft.class00232;
import minecraft.class00381;
import minecraft.class00642;
import minecraft.class03802;
import minecraft.class03824;
import minecraft.class03849;
import minecraft.class07367;
import minecraft.class07369;

class class00233
implements class03802 {
    final /* synthetic */ class00642 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00233(class00642 class006422) {
        this.N = class006422;
    }

    public void N(UUID uUID, class03849 class038492) {
        class00232.N.debug("Pack {} changed status to {}", (Object)uUID, (Object)class038492);
        class07369 class073692 = switch (class038492) {
            default -> throw new MatchException(null, null);
            case class03849.field_47699 -> class07369.field_13016;
            case class03849.field_47700 -> class07369.field_47704;
        };
        this.N.method_10743((class00381)new class07367(uUID, class073692));
    }

    public void N(UUID uUID, class03824 class038242) {
        class00232.N.debug("Pack {} changed status to {}", (Object)uUID, (Object)class038242);
        class07369 class073692 = switch (class038242) {
            default -> throw new MatchException(null, null);
            case class03824.field_47624 -> class07369.field_13017;
            case class03824.field_47626 -> class07369.field_13015;
            case class03824.field_47623 -> class07369.field_13018;
            case class03824.field_47625 -> class07369.field_47669;
            case class03824.field_47627 -> class07369.field_47668;
        };
        this.N.method_10743((class00381)new class07367(uUID, class073692));
    }
}

