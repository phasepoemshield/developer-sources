/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02566
 *  minecraft.class02910
 *  minecraft.class04247
 *  minecraft.class06338
 *  minecraft.class07103
 *  org.joml.Vector3f
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02566;
import minecraft.class02910;
import minecraft.class04247;
import minecraft.class06338;
import minecraft.class07103;
import minecraft.class07107;
import org.joml.Vector3f;

public class class07138
extends class02910 {
    public static final int N = 0xFF0000;
    public static final class07138 y = new class07138(0xFF0000, 1.0f);
    public static final MapCodec<class07138> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.E.fieldOf("color").forGetter(class071382 -> class071382.B), (App)M.fieldOf("scale").forGetter(class02910::L)).apply(instance, class07138::new));
    public static final class02362<class04247, class07138> u = class02362.N((class02362)class02389.M, class071382 -> class071382.B, (class02362)class02389.E, class02910::L, class07138::new);
    private final int B;

    public class07138(int n, float f) {
        super(f);
        this.B = n;
    }

    public Vector3f N() {
        return class02566.U((int)this.B);
    }

    public class07103<class07138> method_10295() {
        return class07107.P;
    }
}

