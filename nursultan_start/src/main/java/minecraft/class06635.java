/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07049
 *  minecraft.class07280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07280;
import org.jspecify.annotations.Nullable;

public class class06635
implements class00381<class07280> {
    public static final class02362<class00667, class06635> N = class00381.N(class06635::N, class06635::new);
    private final int y;
    private final int L;

    public class06635(class07049 class070492, @Nullable class07049 class070493) {
        this.y = class070492.method_5628();
        this.L = class070493 != null ? class070493.method_5628() : 0;
    }

    private class06635(class00667 class006672) {
        this.y = class006672.readInt();
        this.L = class006672.readInt();
    }

    public int y() {
        return this.L;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.writeInt(this.y);
        class006672.writeInt(this.L);
    }

    public class02897<class06635> method_65080() {
        return class04248.Ne;
    }
}

