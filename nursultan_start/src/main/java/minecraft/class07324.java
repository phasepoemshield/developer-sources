/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class02680
 *  minecraft.class04247
 *  minecraft.class04995
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02680;
import minecraft.class04247;
import minecraft.class04995;
import minecraft.class06584;

public class class07324 {
    public static final Codec<class07324> N = RecordCodecBuilder.create(instance -> instance.group((App)class02680.N.fieldOf("buy").forGetter(class073242 -> class073242.L), (App)class02680.N.lenientOptionalFieldOf("buyB").forGetter(class073242 -> class073242.u), (App)class06584.y.fieldOf("sell").forGetter(class073242 -> class073242.i), (App)Codec.INT.lenientOptionalFieldOf("uses", (Object)0).forGetter(class073242 -> class073242.R), (App)Codec.INT.lenientOptionalFieldOf("maxUses", (Object)4).forGetter(class073242 -> class073242.M), (App)Codec.BOOL.lenientOptionalFieldOf("rewardExp", (Object)true).forGetter(class073242 -> class073242.B), (App)Codec.INT.lenientOptionalFieldOf("specialPrice", (Object)0).forGetter(class073242 -> class073242.Z), (App)Codec.INT.lenientOptionalFieldOf("demand", (Object)0).forGetter(class073242 -> class073242.z), (App)Codec.FLOAT.lenientOptionalFieldOf("priceMultiplier", (Object)Float.valueOf(0.0f)).forGetter(class073242 -> Float.valueOf(class073242.U)), (App)Codec.INT.lenientOptionalFieldOf("xp", (Object)1).forGetter(class073242 -> class073242.E)).apply(instance, class07324::new));
    public static final class02362<class04247, class07324> y = class02362.N(class07324::N, class07324::N);
    private final class02680 L;
    private final Optional<class02680> u;
    private final class06584 i;
    private int R;
    private final int M;
    private final boolean B;
    private int Z;
    private int z;
    private final float U;
    private final int E;

    public class06584 L() {
        return this.u.map(class02680::u).orElse(class06584.E);
    }

    public void M() {
        this.z = this.z + this.R - (this.M - this.R);
    }

    public int P() {
        return this.Z;
    }

    public int T() {
        return this.E;
    }

    private class07324(class02680 class026802, Optional<class02680> optional, class06584 class065842, int n, int n2, boolean bl, int n3, int n4, float f, int n5) {
        this.L = class026802;
        this.u = optional;
        this.i = class065842;
        this.R = n;
        this.M = n2;
        this.B = bl;
        this.Z = n3;
        this.z = n4;
        this.U = f;
        this.E = n5;
    }

    public class07324(class02680 class026802, Optional<class02680> optional, class06584 class065842, int n, int n2, int n3, float f) {
        this(class026802, optional, class065842, n, n2, n3, f, 0);
    }

    private class07324(class07324 class073242) {
        this(class073242.L, class073242.u, class073242.i.t(), class073242.R, class073242.M, class073242.B, class073242.Z, class073242.z, class073242.U, class073242.E);
    }

    public class07324(class02680 class026802, Optional<class02680> optional, class06584 class065842, int n, int n2, int n3, float f, int n4) {
        this(class026802, optional, class065842, n, n2, true, 0, n4, f, n3);
    }

    public class07324(class02680 class026802, Optional<class02680> optional, class06584 class065842, int n, int n2, float f) {
        this(class026802, optional, class065842, 0, n, n2, f);
    }

    public class07324(class02680 class026802, class06584 class065842, int n, int n2, float f) {
        this(class026802, Optional.empty(), class065842, n, n2, f);
    }

    public class06584 B() {
        return this.i.t();
    }

    public int Z() {
        return this.R;
    }

    public Optional<class02680> i() {
        return this.u;
    }

    public boolean b() {
        return this.R >= this.M;
    }

    public float s() {
        return this.U;
    }

    public boolean n() {
        return this.B;
    }

    public void m() {
        this.Z = 0;
    }

    public class07324 t() {
        return new class07324(this);
    }

    public boolean v() {
        return this.R > 0;
    }

    public void j() {
        this.R = this.M;
    }

    public int U() {
        return this.M;
    }

    public void z() {
        this.R = 0;
    }

    public class02680 u() {
        return this.L;
    }

    public class06584 y() {
        return this.L.u().L(this.N(this.L));
    }

    public void y(int n) {
        this.Z = n;
    }

    public boolean y(class06584 class065842, class06584 class065843) {
        if (!this.N(class065842, class065843)) {
            return false;
        }
        class065842.B(this.y().c());
        if (!this.L().R()) {
            class065843.B(this.L().c());
        }
        return true;
    }

    public void E() {
        ++this.R;
    }

    public class06584 N() {
        return this.L.u();
    }

    private static void N(class04247 class042472, class07324 class073242) {
        class02680.y.encode((Object)class042472, (Object)class073242.u());
        class06584.z.encode((Object)class042472, (Object)class073242.R());
        class02680.L.encode((Object)class042472, class073242.i());
        class042472.writeBoolean(class073242.b());
        class042472.writeInt(class073242.Z());
        class042472.writeInt(class073242.U());
        class042472.writeInt(class073242.T());
        class042472.writeInt(class073242.P());
        class042472.writeFloat(class073242.s());
        class042472.writeInt(class073242.W());
    }

    public boolean N(class06584 class065842, class06584 class065843) {
        if (!this.L.N(class065842) || class065842.c() < this.N(this.L)) {
            return false;
        }
        if (this.u.isPresent()) {
            return this.u.get().N(class065843) && class065843.c() >= this.u.get().y();
        }
        return class065843.R();
    }

    private int N(class02680 class026802) {
        int n = class026802.y();
        int n2 = Math.max(0, class04995.y((float)((float)(n * this.z) * this.U)));
        return class04995.N((int)(n + n2 + this.Z), (int)1, (int)class026802.u().U());
    }

    public void N(int n) {
        this.Z += n;
    }

    public static class07324 N(class04247 class042472) {
        class02680 class026802 = (class02680)class02680.y.decode((Object)class042472);
        class06584 class065842 = (class06584)class06584.z.decode((Object)class042472);
        Optional var3 = (Optional)class02680.L.decode((Object)class042472);
        boolean bl = class042472.readBoolean();
        int n = class042472.readInt();
        int n2 = class042472.readInt();
        int n3 = class042472.readInt();
        int n4 = class042472.readInt();
        float f = class042472.readFloat();
        int n5 = class042472.readInt();
        class07324 class073242 = new class07324(class026802, var3, class065842, n, n2, n3, f, n5);
        if (bl) {
            class073242.j();
        }
        class073242.y(n4);
        return class073242;
    }

    public int W() {
        return this.z;
    }

    public class06584 R() {
        return this.i;
    }
}

