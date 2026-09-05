/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AnarchyHelper
 *  Nursultan.class11328
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07713
 */
package Nursultan;

import Nursultan.AnarchyHelper;
import Nursultan.class11328;
import Nursultan.class11553;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07713;

public class class11561
extends class11553<AnarchyHelper> {
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;

    @Override
    public class11328 L() {
        return class065842 -> {
            this.R();
            class02837 class028372 = (class02837)class065842.y().method_58694(class02484.y);
            return class028372 != null && ((Optional)((MapCodec)this.u_0).codec().parse((DynamicOps)class07713.N, (Object)class028372.y()).getOrThrow()).orElse("").equals(this.N()) || this.N((class06584)class065842);
        };
    }

    public class11561(AnarchyHelper anarchyHelper, String string, Supplier<class06584> supplier, String string2, String string3) {
        super(anarchyHelper, string);
        this.R();
        this.u_1 = supplier;
        this.u_2 = string2;
        this.u_3 = string3;
        this.u_0 = Codec.STRING.optionalFieldOf("don-item");
    }

    public class11561(AnarchyHelper anarchyHelper, String string, class06581 class065812, String string2, String string3) {
        this(anarchyHelper, string, () -> ((class06581)class065812).E(), string2, string3);
    }

    @Override
    public String u() {
        this.R();
        return (String)this.u_2;
    }

    @Override
    public class06584 y() {
        this.R();
        return (class06584)((Supplier)this.u_1).get();
    }

    @Override
    public String N() {
        this.R();
        return (String)this.u_3;
    }

    public boolean N(class06584 class065842) {
        return class065842.Y().getString().toLowerCase().contains(this.u().toLowerCase());
    }

    private void R() {
    }
}

