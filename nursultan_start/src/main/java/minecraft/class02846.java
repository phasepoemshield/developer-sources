/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.injection.access.item.attack_damage.IDisplayDefault
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02710
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class05220
 *  minecraft.class05298
 *  minecraft.class06541
 *  minecraft.class06581
 *  minecraft.class07314
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07471
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.access.item.attack_damage.IDisplayDefault;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02710;
import minecraft.class02831;
import minecraft.class02833;
import minecraft.class02836;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class05220;
import minecraft.class05298;
import minecraft.class06541;
import minecraft.class06581;
import minecraft.class07314;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class02846
implements class02831,
IDisplayDefault {
    static final class02846 L = new class02846();
    static final MapCodec<class02846> u = MapCodec.unit((Object)L);
    static final class02362<class04247, class02846> i = class02362.N((Object)L);
    private class02710 R;

    @Override
    public class02836 L() {
        return class02836.field_59739;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class02846;
    }

    public final String toString() {
        return "class02846[]";
    }

    public final int hashCode() {
        return 0;
    }

    private double N(class08036 class080362, class03556 class035562) {
        double d = 0.0;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            for (class03556 var6 : this.R.N()) {
                if (!var6.N(class07314.m)) continue;
                int n = this.R.N(var6);
                if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
                    d = (float)n * 1.25f;
                    break;
                }
                d = 1.0f + (float)Math.max(0, n - 1) * 0.5f;
                break;
            }
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return d;
        }
        return class080362.method_45326(class035562) + d;
    }

    @Override
    public void N(Consumer<class00392> consumer, @Nullable class08036 class080362, class03556<class07468> class035562, class07471 class074712) {
        double d = class074712.y();
        boolean bl = false;
        if (class080362 != null) {
            if (class074712.N(class06581.M)) {
                class03556 var11 = class05298.u;
                class08036 class080363 = class080362;
                d += this.N(class080363, var11);
                bl = true;
            } else if (class074712.N(class06581.B)) {
                d += class080362.method_45326(class05298.R);
                bl = true;
            }
        }
        double d2 = class074712.L() == class07463.field_6330 || class074712.L() == class07463.field_6331 ? d * 100.0 : (class035562.N(class05298.b) ? d * 10.0 : d);
        if (bl) {
            consumer.accept((class00392)class05220.N().y((class00392)class00392.N((String)("attribute.modifier.equals." + class074712.L().N()), (Object[])new Object[]{class02833.u.format(d2), class00392.L((String)((class07468)class035562.N()).L())})).N(class06541.field_1077));
        } else if (d > 0.0) {
            consumer.accept((class00392)class00392.N((String)("attribute.modifier.plus." + class074712.L().N()), (Object[])new Object[]{class02833.u.format(d2), class00392.L((String)((class07468)class035562.N()).L())}).N(((class07468)class035562.N()).y(true)));
        } else if (d < 0.0) {
            consumer.accept((class00392)class00392.N((String)("attribute.modifier.take." + class074712.L().N()), (Object[])new Object[]{class02833.u.format(-d2), class00392.L((String)((class07468)class035562.N()).L())}).N(((class07468)class035562.N()).y(false)));
        }
    }

    public void viaFabricPlus$setItemEnchantments(class02710 class027102) {
        this.R = class027102;
    }
}

