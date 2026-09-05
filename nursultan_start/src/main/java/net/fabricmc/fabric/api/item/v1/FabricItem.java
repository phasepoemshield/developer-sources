/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02710
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class06504
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06586
 *  minecraft.class07050
 *  minecraft.class07304
 *  minecraft.class08036
 */
package net.fabricmc.fabric.api.item.v1;

import java.util.Optional;
import java.util.Set;
import minecraft.class02484;
import minecraft.class02710;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class06504;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06586;
import minecraft.class07050;
import minecraft.class07304;
import minecraft.class08036;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;

public interface FabricItem {
    default public String getCreatorNamespace(class06584 class065842) {
        Set set;
        class03556 class035562 = class065842.Z();
        if ((this instanceof class06586 || this instanceof class06504) && class065842.L(class02484.h)) {
            Optional optional = ((class06517)class065842.method_58694(class02484.h)).i();
            if (optional.isPresent()) {
                class035562 = (class03556)optional.get();
            }
        } else if (class065842.N(class06570.Gq) && class065842.L(class02484.p) && (set = ((class02710)class065842.method_58694(class02484.p)).N()).size() == 1) {
            class035562 = (class03556)set.iterator().next();
        }
        return ((class05946)class035562.i().orElseThrow()).N().y();
    }

    default public class06584 getRecipeRemainder(class06584 class065842) {
        return ((class06581)this).Z();
    }

    default public boolean canBeEnchantedWith(class06584 class065842, class03556<class07304> class035562, EnchantingContext enchantingContext) {
        return enchantingContext == EnchantingContext.PRIMARY ? ((class07304)class035562.N()).N(class065842) : ((class07304)class035562.N()).L(class065842);
    }

    default public boolean allowComponentsUpdateAnimation(class08036 class080362, class07050 class070502, class06584 class065842, class06584 class065843) {
        return true;
    }

    default public boolean allowContinuingBlockBreaking(class08036 class080362, class06584 class065842, class06584 class065843) {
        return false;
    }
}

