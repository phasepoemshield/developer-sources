/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class07103
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class07103;
import minecraft.class07126;

public class class07134
extends class07103<class07134>
implements class07126 {
    private final MapCodec<class07134> field_25127 = MapCodec.unit(this::method_29140);
    private final class02362<class04247, class07134> field_48460 = class02362.N((Object)this);

    public class07134(boolean bl) {
        super(bl);
    }

    public MapCodec<class07134> method_29138() {
        return this.field_25127;
    }

    public class07134 method_29140() {
        return this;
    }

    public class02362<class04247, class07134> method_56179() {
        return this.field_48460;
    }

    public /* synthetic */ class07103 method_10295() {
        return this.method_29140();
    }
}

