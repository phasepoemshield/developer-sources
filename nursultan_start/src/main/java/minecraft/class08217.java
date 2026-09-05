/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class02362
 *  minecraft.class04206
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00751;
import minecraft.class02362;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class08200;
import minecraft.class08211;
import minecraft.class08215;
import minecraft.class08229;
import minecraft.class08235;
import minecraft.class08242;

public final class class08217<T extends class08200>
extends Record {
    private final MapCodec<T> codec;
    private final class02362<class04247, T> streamCodec;
    public static final class08217<class08242> N = class08217.N("apply_effects", class08242.N, class08242.y);
    public static final class08217<class08211> y = class08217.N("remove_effects", class08211.N, class08211.y);
    public static final class08217<class08215> L = class08217.N("clear_all_effects", class08215.y, class08215.L);
    public static final class08217<class08235> u = class08217.N("teleport_randomly", class08235.N, class08235.y);
    public static final class08217<class08229> i = class08217.N("play_sound", class08229.N, class08229.y);

    public class08217(MapCodec<T> mapCodec, class02362<class04247, T> class023622) {
        this.codec = mapCodec;
        this.streamCodec = class023622;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08217.class, "codec;streamCodec", "codec", "streamCodec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08217.class, "codec;streamCodec", "codec", "streamCodec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08217.class, "codec;streamCodec", "codec", "streamCodec"}, this);
    }

    public class02362<class04247, T> y() {
        return this.streamCodec;
    }

    public MapCodec<T> N() {
        return this.codec;
    }

    private static <T extends class08200> class08217<T> N(String string, MapCodec<T> mapCodec, class02362<class04247, T> class023622) {
        return (class08217)((Object)class00751.N((class00751)class04206.Nl, (String)string, new class08217<T>(mapCodec, class023622)));
    }
}

