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
 *  minecraft.class07480
 *  minecraft.class08051
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07327;
import minecraft.class07480;
import minecraft.class08051;
import org.jspecify.annotations.Nullable;

public class class07333
implements class00381<class08051> {
    public static final class02362<class00667, class07333> N = class00381.N(class07333::N, class07333::new);
    private final int y;
    private final String L;
    private final boolean u;

    public class07333(int n, String string, boolean bl) {
        this.y = n;
        this.L = string;
        this.u = bl;
    }

    private class07333(class00667 class006672) {
        this.y = class006672.E();
        this.L = class006672.s();
        this.u = class006672.readBoolean();
    }

    public boolean y() {
        return this.u;
    }

    public @Nullable class07327 N(class07299 class072992) {
        class07049 class070492 = class072992.method_8469(this.y);
        if (class070492 instanceof class07480) {
            return ((class07480)class070492).U();
        }
        return null;
    }

    private void N(class00667 class006672) {
        class006672.L(this.y);
        class006672.N(this.L);
        class006672.writeBoolean(this.u);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12049(this);
    }

    public String N() {
        return this.L;
    }

    public class02897<class07333> method_65080() {
        return class04248.LE;
    }
}

