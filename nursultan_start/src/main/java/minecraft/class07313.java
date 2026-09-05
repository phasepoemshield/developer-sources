/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00240
 *  minecraft.class00265
 *  minecraft.class00294
 *  minecraft.class00299
 *  minecraft.class00302
 *  minecraft.class00330
 *  minecraft.class03774
 *  minecraft.class05838
 *  minecraft.class06184
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06581
 *  minecraft.class06584
 */
package minecraft;

import java.util.List;
import minecraft.class00240;
import minecraft.class00265;
import minecraft.class00294;
import minecraft.class00299;
import minecraft.class00302;
import minecraft.class00330;
import minecraft.class03774;
import minecraft.class05838;
import minecraft.class06184;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06581;
import minecraft.class06584;

public abstract class class07313
extends class06184 {
    private final class03774 N;
    private final float y;
    private final int L;

    public int M() {
        return this.L;
    }

    public class07313(String string, class03774 class037742, class06510 class065102, class06584 class065842, float f, int n) {
        super(string, class065102, class065842);
        this.N = class037742;
        this.y = f;
        this.L = n;
    }

    public class03774 B() {
        return this.N;
    }

    protected abstract class06581 Z();

    public abstract class05838<? extends class07313> u();

    public List<class00265> N() {
        return List.of(new class00240(this.z().method_64673(), (class00299)class00294.L, (class00299)new class00302(this.U()), (class00299)new class00330(this.Z()), this.L, this.y));
    }

    public abstract class06514<? extends class07313> method_8119();

    public float R() {
        return this.y;
    }
}

