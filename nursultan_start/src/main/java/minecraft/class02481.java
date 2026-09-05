/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class06741
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class02467;
import minecraft.class02477;
import minecraft.class06741;

public final class class02481
extends class02467<class06741> {
    private final class06741 L;

    public class02481(class06741 class067412) {
        super(MapCodec.unitCodec((Object)class067412));
        this.L = class067412;
    }

    public class02477<?> y() {
        return this.L.N();
    }

    public class06741 N() {
        return this.L;
    }

    public static class02481 N(class02477<?> class024772) {
        return new class02481(new class06741(class024772));
    }
}

