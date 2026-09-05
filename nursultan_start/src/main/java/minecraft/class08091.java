/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00518
 *  minecraft.class01762
 *  minecraft.class01787
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05220
 *  minecraft.class06640
 *  minecraft.class07280
 */
package minecraft;

import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00518;
import minecraft.class01762;
import minecraft.class01787;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05220;
import minecraft.class06640;
import minecraft.class07280;

public class class08091
implements class00381<class07280> {
    public static final class02362<class04247, class08091> N = class00381.N(class08091::N, class08091::new);
    public static final int y = 0;
    public static final int L = 1;
    public static final int u = 2;
    private final String i;
    private final class00392 R;
    private final class06640 M;
    private final Optional<class01762> B;
    private final int Z;

    public int L() {
        return this.Z;
    }

    public Optional<class01762> M() {
        return this.B;
    }

    public class08091(class00518 class005182, int n) {
        this.i = class005182.L();
        this.R = class005182.i();
        this.M = class005182.Z();
        this.B = Optional.ofNullable(class005182.M());
        this.Z = n;
    }

    private class08091(class04247 class042472) {
        this.i = class042472.s();
        this.Z = class042472.readByte();
        if (this.Z == 0 || this.Z == 2) {
            this.R = (class00392)class03748.u.decode((Object)class042472);
            this.M = (class06640)class042472.y(class06640.class);
            this.B = (Optional)class01787.u.decode((Object)class042472);
        } else {
            this.R = class05220.N;
            this.M = class06640.field_1472;
            this.B = Optional.empty();
        }
    }

    public class06640 u() {
        return this.M;
    }

    public class00392 y() {
        return this.R;
    }

    public String N() {
        return this.i;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class04247 class042472) {
        class042472.N(this.i);
        class042472.writeByte(this.Z);
        if (this.Z == 0 || this.Z == 2) {
            class03748.u.encode((Object)class042472, (Object)this.R);
            class042472.N((Enum)this.M);
            class01787.u.encode((Object)class042472, this.B);
        }
    }

    public class02897<class08091> method_65080() {
        return class04248.NF;
    }
}

