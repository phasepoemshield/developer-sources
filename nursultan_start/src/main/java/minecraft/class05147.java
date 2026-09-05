/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00753
 *  minecraft.class02796
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class06984
 *  minecraft.class07109
 *  minecraft.class07701
 *  minecraft.class07703
 *  minecraft.class08152
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00753;
import minecraft.class02796;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07109;
import minecraft.class07701;
import minecraft.class07703;
import minecraft.class08152;

public class class05147
implements class07703 {
    private static final String N = "Rcon";
    private static final class00392 L = class00392.y((String)"Rcon");
    private final StringBuffer u = new StringBuffer();
    private final class02796 i;

    public void L() {
        this.u.setLength(0);
    }

    public class05147(class02796 class027962) {
        this.i = class027962;
    }

    public boolean B() {
        return this.i.M();
    }

    public String i() {
        return this.u.toString();
    }

    public void N(class00392 class003922) {
        this.u.append(class003922.getString());
    }

    public class07701 R() {
        class04782 class047822 = this.i.NY();
        return new class07701((class07703)this, class06889.N((class00753)class047822.method_74854().y()), class07109.N, class047822, (class08152)class06984.i, N, L, this.i, null);
    }

    public boolean A_() {
        return true;
    }

    public boolean B_() {
        return true;
    }
}

