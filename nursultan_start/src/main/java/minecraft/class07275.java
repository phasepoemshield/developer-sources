/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00891
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05946
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00891;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07280;

public class class07275
implements class00381<class07280> {
    public static final class02362<class04247, class07275> N = class00381.N(class07275::N, class07275::new);
    private final class07209 y;
    private final int L;
    private final int u;
    private final class00891 i;

    public int L() {
        return this.u;
    }

    public class07275(class07209 class072092, class00891 class008912, int n, int n2) {
        this.y = class072092;
        this.i = class008912;
        this.L = n;
        this.u = n2;
    }

    private class07275(class04247 class042472) {
        this.y = class042472.i();
        this.L = class042472.readUnsignedByte();
        this.u = class042472.readUnsignedByte();
        this.i = (class00891)class02389.N((class05946)class04227.Z).decode((Object)class042472);
    }

    public class00891 u() {
        return this.i;
    }

    public int y() {
        return this.L;
    }

    private void N(class04247 class042472) {
        class042472.N(this.y);
        class042472.writeByte(this.L);
        class042472.writeByte(this.u);
        class02389.N((class05946)class04227.Z).encode((Object)class042472, (Object)this.i);
    }

    public class07209 N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class07275> method_65080() {
        return class04248.Z;
    }
}

