/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05216
 *  minecraft.class05523
 *  minecraft.class05946
 *  minecraft.class06541
 *  minecraft.class06993
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00195;
import minecraft.class00200;
import minecraft.class00212;
import minecraft.class00225;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05216;
import minecraft.class05523;
import minecraft.class05946;
import minecraft.class06541;
import minecraft.class06993;

public abstract class class00201 {
    public static final Codec<class00201> y = class04206.NI.T().dispatch(class00201::N, mapCodec -> mapCodec);
    private final class00195<class03556<class00225>> N;

    public class00392 L() {
        return this.P().y(this.s());
    }

    public int M() {
        return this.N.u();
    }

    protected class05216 P() {
        return this.N("test_instance.description.type", this.y());
    }

    public class00201(class00195<class03556<class00225>> class001952) {
        this.N = class001952;
    }

    public boolean B() {
        return this.N.i();
    }

    public boolean Z() {
        return this.N.M();
    }

    public class01894 i() {
        return this.N.y();
    }

    protected class00392 s() {
        return this.N("test_instance.description.structure", this.N.y().toString()).y((class00392)this.N("test_instance.description.batch", this.N.N().M()));
    }

    public class00195<class03556<class00225>> m() {
        return this.N;
    }

    public int U() {
        return this.N.Z();
    }

    public int z() {
        return this.N.B();
    }

    public class03556<class00225> u() {
        return this.N.N();
    }

    protected abstract class05216 y();

    public boolean E() {
        return this.N.z();
    }

    private static MapCodec<? extends class00201> N(class00751<MapCodec<? extends class00201>> class007512, String string, MapCodec<? extends class00201> mapCodec) {
        return (MapCodec)class00751.N(class007512, (class05946)class05946.N((class05946)class04227.No, (class01894)class01894.y((String)string)), mapCodec);
    }

    protected class05216 N(String string, String string2) {
        return this.N(string, class00392.y((String)string2));
    }

    protected class05216 N(String string, class05216 class052162) {
        return class00392.N((String)string, (Object[])new Object[]{class052162.N(class06541.field_1078)}).y((class00392)class00392.y((String)"\n"));
    }

    public static MapCodec<? extends class00201> N(class00751<MapCodec<? extends class00201>> class007512) {
        class00201.N(class007512, "block_based", class00200.N);
        return class00201.N(class007512, "function", class00212.N);
    }

    public abstract void N(class05523 var1);

    public abstract MapCodec<? extends class00201> N();

    public class06993 W() {
        return this.N.R();
    }

    public int R() {
        return this.N.L();
    }
}

