/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap
 *  minecraft.class00143
 *  minecraft.class00717
 *  minecraft.class00751
 *  minecraft.class02055
 *  minecraft.class04227
 *  minecraft.class04877
 *  minecraft.class04882
 *  minecraft.class05298
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07473
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import minecraft.class00143;
import minecraft.class00717;
import minecraft.class00751;
import minecraft.class02055;
import minecraft.class04227;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class05298;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import org.jspecify.annotations.Nullable;

public class class10473<T extends class04882>
extends class07473 {
    private final T y;
    private Int2LongOpenHashMap L = new Int2LongOpenHashMap();
    private @Nullable class00143 u;
    private @Nullable class00717 i;
    final /* synthetic */ class04882 N;

    public void L() {
        this.y.f().N(this.u, (double)1.15f);
    }

    private boolean M() {
        if (!this.y.NQ()) {
            return true;
        }
        if (this.y.K().N()) {
            return true;
        }
        if (!this.y.v()) {
            return true;
        }
        class00751 class007512 = this.y.method_56673().L(class04227.NF);
        if (class06584.N((class06584)this.y.method_6118(class07085.field_6169), (class06584)this.N((class02055)class007512))) {
            return true;
        }
        class04882 class048822 = this.N.i.y(this.y.NO());
        return class048822 != null && class048822.method_5805();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10473(class04882 class048822, class04882 class048823) {
        this.N = class048822;
        this.y = class048823;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        if (this.i != null && this.i.method_24516(this.y, 1.414)) {
            this.y.N(class10473.N_18((class07299)this.N.method_73183()), this.i);
        }
    }

    public void u() {
        this.u = null;
        this.i = null;
    }

    public boolean y() {
        if (this.i == null || this.u == null) {
            return false;
        }
        if (this.i.method_31481()) {
            return false;
        }
        if (this.u.L()) {
            return false;
        }
        return !this.M();
    }

    public boolean N() {
        if (this.M()) {
            return false;
        }
        Int2LongOpenHashMap int2LongOpenHashMap = new Int2LongOpenHashMap();
        double d = this.N.method_45325(class05298.P);
        for (class00717 class007172 : this.y.method_73183().N(class00717.class, this.y.method_5829().L(d, 8.0, d), class04882.u)) {
            long l = this.L.getOrDefault(class007172.method_5628(), Long.MIN_VALUE);
            if (this.N.method_73183().N() < l) {
                int2LongOpenHashMap.put(class007172.method_5628(), l);
                continue;
            }
            class00143 class001432 = this.y.f().N((class07049)class007172, 1);
            if (class001432 != null && class001432.z()) {
                this.u = class001432;
                this.i = class007172;
                return true;
            }
            int2LongOpenHashMap.put(class007172.method_5628(), this.N.method_73183().N() + 600L);
        }
        this.L = int2LongOpenHashMap;
        return false;
    }

    private class06584 N(class02055 class020552) {
        class06584 class065842 = ((LithiumData)this.y.method_73183()).lithium$getData().ominousBanner();
        if (class065842 == null) {
            class065842 = class04877.N((class02055)class020552);
        }
        return class065842;
    }
}

