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
 *  minecraft.class07107
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

public class class01162
extends class02910 {
    public static final int N = 3790560;
    public static final class01162 y = new class01162(3790560, 0xFF0000, 1.0f);
    public static final MapCodec<class01162> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.E.fieldOf("from_color").forGetter(class011622 -> class011622.B), (App)class06338.E.fieldOf("to_color").forGetter(class011622 -> class011622.Z), (App)M.fieldOf("scale").forGetter(class02910::L)).apply(instance, class01162::new));
    public static final class02362<class04247, class01162> u = class02362.N((class02362)class02389.M, class011622 -> class011622.B, (class02362)class02389.M, class011622 -> class011622.Z, (class02362)class02389.E, class02910::L, class01162::new);
    private final int B;
    private final int Z;

    public class01162(int n, int n2, float f) {
        super(f);
        this.B = n;
        this.Z = n2;
    }

    public Vector3f y() {
        return class02566.U((int)this.Z);
    }

    public Vector3f N() {
        return class02566.U((int)this.B);
    }

    public class07103<class01162> method_10295() {
        return class07107.s;
    }
}

