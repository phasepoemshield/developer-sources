/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class05836
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07054
 *  minecraft.class07075
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  net.caffeinemc.mods.lithium.common.hopper.BlockStateOnlyInventory
 *  net.caffeinemc.mods.lithium.common.util.ArrayConstants
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class05836;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07054;
import minecraft.class07075;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import net.caffeinemc.mods.lithium.common.hopper.BlockStateOnlyInventory;
import net.caffeinemc.mods.lithium.common.util.ArrayConstants;
import org.jspecify.annotations.Nullable;

class class06147
extends class07075
implements class07054,
BlockStateOnlyInventory {
    private final class00500 y;
    private final class07284 u;
    private final class07209 i;
    private boolean R;

    public class06147(class00500 class005002, class07284 class072842, class07209 class072092, class06584 class065842) {
        super(new class06584[]{class065842});
        this.y = class005002;
        this.u = class072842;
        this.i = class072092;
    }

    public boolean y(int n, class06584 class065842, class07211 class072112) {
        return !this.R && class072112 == class07211.field_11033 && class065842.N(class06570.vQ);
    }

    public int[] N(class07211 class072112) {
        return class072112 == class07211.field_11033 ? ArrayConstants.ZERO : ArrayConstants.EMPTY;
    }

    public boolean N(int n, class06584 class065842, @Nullable class07211 class072112) {
        return false;
    }

    public int method_5444() {
        return 1;
    }

    public void method_5431() {
        class05836.N(null, (class00500)this.y, (class07284)this.u, (class07209)this.i);
        this.R = true;
    }
}

