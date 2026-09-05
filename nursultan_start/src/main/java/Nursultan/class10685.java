/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.viaversion.viafabricplus.features.item.filter_creative_tabs.VersionedRegistries
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  minecraft.class03767
 *  minecraft.class03778
 *  minecraft.class04206
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06908
 *  minecraft.class06911
 *  minecraft.class06934
 */
package Nursultan;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.features.item.filter_creative_tabs.VersionedRegistries;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import java.util.Collection;
import java.util.Set;
import minecraft.class03767;
import minecraft.class03778;
import minecraft.class04206;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06908;
import minecraft.class06911;
import minecraft.class06934;

public class class10685
implements class06934 {
    public final Collection<class06584> N = class03778.N();
    public final Set<class06584> y = class03778.N();
    private final class06911 L;
    private final class03767 u;

    public class10685(class06911 class069112, class03767 class037672) {
        this.L = class069112;
        this.u = class037672;
    }

    private boolean N(class06581 class065812, class03767 class037672, Operation operation, LocalRef localRef) {
        return this.N(class065812, class037672, operation, (class06584)localRef.get());
    }

    private boolean N(class06581 class065812, class03767 class037672, Operation operation, class06584 class065842) {
        boolean bl = (Boolean)operation.call(new Object[]{class065812, class037672});
        int n = GeneralSettings.INSTANCE.removeNotAvailableItemsFromCreativeTab.getIndex();
        if (n == 2 || class06202.Nq().q()) {
            return bl;
        }
        if (n == 1 && !class04206.Nz.y((Object)this.L).y().equals("minecraft")) {
            return bl;
        }
        return VersionedRegistries.keepItem((class06584)class065842) && bl;
    }

    public void method_45417(class06584 class065842, class06908 class069082) {
        if (class065842.c() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
        }
        if (this.N.contains(class065842) && class069082 != class06908.field_40193) {
            throw new IllegalStateException("Accidentally adding the same item stack twice " + class065842.V().getString() + " to a Creative Mode Tab: " + this.L.N().getString());
        }
        class03767 class037672 = this.u;
        class06581 class065812 = class065842.B();
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1792, net.minecraft.class_7699]");
            return ((class06581)objectArray[0]).N((class03767)objectArray[1]);
        };
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class065842);
        class065842 = (class06584)localRefImpl.dispose();
        if (this.N(class065812, class037672, operation, (LocalRef)localRefImpl)) {
            switch (class069082.ordinal()) {
                case 0: {
                    this.N.add(class065842);
                    this.y.add(class065842);
                    break;
                }
                case 1: {
                    this.N.add(class065842);
                    break;
                }
                case 2: {
                    this.y.add(class065842);
                }
            }
        }
    }
}

