/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01285
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03434
 *  minecraft.class04589
 *  minecraft.class04654
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05484
 *  minecraft.class05731
 *  minecraft.class06134
 *  minecraft.class06276
 *  minecraft.class06366
 *  minecraft.class06478
 *  minecraft.class06541
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package Nursultan;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01285;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03434;
import minecraft.class04589;
import minecraft.class04654;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05484;
import minecraft.class05731;
import minecraft.class06134;
import minecraft.class06276;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class06541;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class class10545
extends class05484 {
    private static final int L = 60;
    private final class01894 u;
    protected final List<class06478> N = Lists.newArrayList();
    private final class06366<Boolean> i;
    private final class06366<Boolean> R;
    private final class06366<Boolean> M;
    private final String B;
    private final boolean Z;
    final /* synthetic */ class04589 y;

    public class10545(class04589 class045892, class01894 class018942) {
        this.y = class045892;
        this.u = class018942;
        class01285 class012852 = class06134.N((class01894)class018942);
        this.Z = class012852 != null && class012852.method_72753(class04589.y((class04589)class045892).h());
        class01894 class018943 = class018942;
        String string = this.N(class018943, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_2960]");
            return ((class01894)objectArray[0]).N();
        });
        this.B = this.Z ? string : String.valueOf(class06541.field_1056) + string;
        this.i = class06366.N((class00392)class04589.N.L().y(-2142128), (class00392)class04589.N.L().y(-4539718), (boolean)false).N().N_57(this::N).N(10, 5, 60, 16, (class00392)class00392.y((String)string), (class063662, bl) -> this.N(class018942, class06276.field_61593));
        this.R = class06366.N((class00392)class04589.y.L().y(-171), (class00392)class04589.y.L().y(-4539718), (boolean)false).N().N_57(this::N).N(10, 5, 60, 16, (class00392)class00392.y((String)string), (class063662, bl) -> this.N(class018942, class06276.field_61594));
        this.M = class06366.N((class00392)class04589.L.L().y(-1), (class00392)class04589.L.L().y(-4539718), (boolean)false).N().N_57(this::N).N(10, 5, 60, 16, (class00392)class00392.y((String)string), (class063662, bl) -> this.N(class018942, class06276.field_61595));
        this.N.add((class06478)this.M);
        this.N.add((class06478)this.R);
        this.N.add((class06478)this.i);
        this.N();
    }

    public void N() {
        class06276 class062762 = ((class05731)class04589.R((class04589)this.y).L_0).N(this.u);
        this.i.N((Object)(class062762 == class06276.field_61593 ? 1 : 0));
        this.R.N((Object)(class062762 == class06276.field_61594 ? 1 : 0));
        this.M.N((Object)(class062762 == class06276.field_61595 ? 1 : 0));
        this.i.field_22763 = (Boolean)this.i.y() == false;
        this.R.field_22763 = (Boolean)this.R.y() == false;
        this.M.field_22763 = (Boolean)this.M.y() == false;
    }

    private String N(class01894 class018942, Operation operation) {
        if (!"minecraft".equals(class018942.y())) {
            return class018942.toString();
        }
        return (String)operation.call(new Object[]{class018942});
    }

    private class05216 N(class06366<Boolean> class063662) {
        return class05220.N((class00392)class00392.N((String)("debug.entry.currently." + ((class05731)class04589.L((class04589)this.y).L_0).N(this.u).method_15434()), (Object[])new Object[]{this.B}), (class00392)class063662.method_25369());
    }

    private void N(class01894 class018942, class06276 class062762) {
        ((class05731)class04589.u((class04589)this.y).L_0).N(class018942, class062762);
        Iterator var3 = this.y.R.iterator();
        while (var3.hasNext()) {
            ((class05362)var3.next()).field_22763 = true;
        }
        this.N();
    }

    public List<? extends class04654> method_25396() {
        return this.N;
    }

    public List<? extends class03434> method_37025() {
        return this.N;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        class010542.y((class01590)class04589.i((class04589)this.y).i_3, this.B, n3, n4 + 5, this.Z ? -1 : -8355712);
        int n5 = n3 + this.method_73387() - this.M.method_25368() - this.R.method_25368() - this.i.method_25368();
        if (!this.Z && bl && n < n5) {
            class010542.N(class04589.u, n, n2);
        }
        this.M.method_46421(n5);
        this.R.method_46421(this.M.method_46426() + this.M.method_25368());
        this.i.method_46421(this.R.method_46426() + this.R.method_25368());
        this.i.method_46419(n4);
        this.R.method_46419(n4);
        this.M.method_46419(n4);
        this.i.method_25394(class010542, n, n2, f);
        this.R.method_25394(class010542, n, n2, f);
        this.M.method_25394(class010542, n, n2, f);
    }
}

