/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class07079
 *  minecraft.class07442
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.Optional;
import minecraft.class00753;
import minecraft.class04995;
import minecraft.class07079;
import minecraft.class07144;
import minecraft.class07211;
import minecraft.class07442;
import org.joml.Vector3f;
import org.joml.Vector3fc;

class class07152
extends class07442 {
    final /* synthetic */ class07144 N;

    public class07152(class07144 class071442, class07079 class070792) {
        this.N = class071442;
        super(class070792);
    }

    protected Optional<Float> B() {
        return Optional.of(Float.valueOf(0.0f));
    }

    protected Optional<Float> Z() {
        class07211 class072112 = this.N.E().b();
        Vector3f vector3f = class072112.y().transform(new Vector3f((Vector3fc)class07144.u));
        class00753 class007532 = class072112.E();
        Vector3f vector3f2 = new Vector3f((float)class007532.method_10263(), (float)class007532.method_10264(), (float)class007532.method_10260());
        vector3f2.cross((Vector3fc)vector3f);
        double d = this.R - this.y.method_23317();
        double d2 = this.M - this.y.method_23320();
        double d3 = this.B - this.y.method_23321();
        Vector3f vector3f3 = new Vector3f((float)d, (float)d2, (float)d3);
        float f = vector3f2.dot((Vector3fc)vector3f3);
        float f2 = vector3f.dot((Vector3fc)vector3f3);
        return Math.abs(f) > 1.0E-5f || Math.abs(f2) > 1.0E-5f ? Optional.of(Float.valueOf((float)(class04995.u((double)(-f), (double)f2) * 57.2957763671875))) : Optional.empty();
    }

    protected void y() {
    }
}

