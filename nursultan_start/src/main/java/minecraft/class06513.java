/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class06953
 *  minecraft.class06957
 *  minecraft.class07296
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class06584;
import minecraft.class06953;
import minecraft.class06957;
import minecraft.class07296;

public class class06513 {
    public static final Codec<class06513> N = RecordCodecBuilder.create(instance -> instance.group((App)class06584.u.fieldOf("icon").forGetter(class06513::L), (App)class03748.N.fieldOf("title").forGetter(class06513::N), (App)class03748.N.fieldOf("description").forGetter(class06513::y), (App)class06953.N.optionalFieldOf("background").forGetter(class06513::u), (App)class07296.field_47186.optionalFieldOf("frame", (Object)class07296.field_1254).forGetter(class06513::i), (App)Codec.BOOL.optionalFieldOf("show_toast", (Object)true).forGetter(class06513::B), (App)Codec.BOOL.optionalFieldOf("announce_to_chat", (Object)true).forGetter(class06513::Z), (App)Codec.BOOL.optionalFieldOf("hidden", (Object)false).forGetter(class06513::z)).apply(instance, class06513::new));
    public static final class02362<class04247, class06513> y = class02362.N_34(class06513::N, class06513::y);
    private final class00392 L;
    private final class00392 u;
    private final class06584 i;
    private final Optional<class06953> R;
    private final class07296 M;
    private final boolean B;
    private final boolean Z;
    private final boolean z;
    private float U;
    private float E;

    public class06584 L() {
        return this.i;
    }

    public float M() {
        return this.E;
    }

    public class06513(class06584 class065842, class00392 class003922, class00392 class003923, Optional<class06953> optional, class07296 class072962, boolean bl, boolean bl2, boolean bl3) {
        this.L = class003922;
        this.u = class003923;
        this.i = class065842;
        this.R = optional;
        this.M = class072962;
        this.B = bl;
        this.Z = bl2;
        this.z = bl3;
    }

    public boolean B() {
        return this.B;
    }

    public boolean Z() {
        return this.Z;
    }

    public class07296 i() {
        return this.M;
    }

    public boolean z() {
        return this.z;
    }

    public Optional<class06953> u() {
        return this.R;
    }

    private static class06513 y(class04247 class042472) {
        class00392 class003922 = (class00392)class03748.u.decode((Object)class042472);
        class00392 class003923 = (class00392)class03748.u.decode((Object)class042472);
        class06584 class065842 = (class06584)class06584.z.decode((Object)class042472);
        class07296 class072962 = (class07296)class042472.y(class07296.class);
        int n = class042472.readInt();
        Optional<class06953> optional = (n & 1) != 0 ? Optional.of(new class06953(class042472.T())) : Optional.empty();
        boolean bl = (n & 2) != 0;
        boolean bl2 = (n & 4) != 0;
        class06513 class065132 = new class06513(class065842, class003922, class003923, optional, class072962, bl, false, bl2);
        class065132.N(class042472.readFloat(), class042472.readFloat());
        return class065132;
    }

    public class00392 y() {
        return this.u;
    }

    public class00392 N() {
        return this.L;
    }

    private void N(class04247 class042472) {
        class03748.u.encode((Object)class042472, (Object)this.L);
        class03748.u.encode((Object)class042472, (Object)this.u);
        class06584.z.encode((Object)class042472, (Object)this.i);
        class042472.N((Enum)this.M);
        int n = 0;
        if (this.R.isPresent()) {
            n |= 1;
        }
        if (this.B) {
            n |= 2;
        }
        if (this.z) {
            n |= 4;
        }
        class042472.writeInt(n);
        this.R.map(class06957::N).ifPresent(arg_0 -> ((class04247)class042472).N(arg_0));
        class042472.writeFloat(this.U);
        class042472.writeFloat(this.E);
    }

    public void N(float f, float f2) {
        this.U = f;
        this.E = f2;
    }

    public float R() {
        return this.U;
    }
}

