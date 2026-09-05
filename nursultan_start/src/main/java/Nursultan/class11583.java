/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.HolyHelper
 *  Nursultan.class11328
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class06584
 *  minecraft.class07713
 */
package Nursultan;

import Nursultan.HolyHelper;
import Nursultan.class11328;
import Nursultan.class11553;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class06584;
import minecraft.class07713;

public abstract class class11583
extends class11553<HolyHelper> {
    public Object y_0;
    public Object y_1;

    @Override
    public class11328 L() {
        return class065842 -> {
            this.B();
            class02837 class028373 = (class02837)class065842.y().method_58694(class02484.y);
            if (class028373 == null) {
                return false;
            }
            return ((Optional)((MapCodec)this.y_0).codec().parse((DynamicOps)class07713.N, (Object)class028373.y()).getOrThrow()).map(class028372 -> {
                this.B();
                return ((Optional)((MapCodec)this.y_1).codec().parse((DynamicOps)class07713.N, (Object)class028372.y()).getOrThrow()).orElse("").equals(this.N());
            }).orElse(false) != false || this.N((class06584)class065842);
        };
    }

    public class11583(HolyHelper holyHelper, String string, String string2, String string3) {
        super(holyHelper, string);
        this.B();
        this.y_0 = class02837.L.optionalFieldOf(string2);
        this.y_1 = Codec.STRING.optionalFieldOf(string3);
    }

    private void B() {
    }

    private boolean N(class06584 class065842) {
        return class065842.N(this.y().B()) && class065842.Y().getString().contains(this.u());
    }
}

