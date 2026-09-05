/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01087
 *  minecraft.class02796
 *  minecraft.class06984
 *  minecraft.class07403
 *  minecraft.class07426
 *  minecraft.class07932
 *  minecraft.class08195
 *  minecraft.class08774
 */
package minecraft;

import java.util.Collection;
import java.util.Optional;
import minecraft.class01087;
import minecraft.class02796;
import minecraft.class06984;
import minecraft.class07403;
import minecraft.class07426;
import minecraft.class07932;
import minecraft.class08195;
import minecraft.class08774;

public class class00451
implements class07426 {
    private final class02796 N;
    private final class07932 y;

    public class00451(class02796 class027962, class07932 class079322) {
        this.N = class027962;
        this.y = class079322;
    }

    public void y(class08774 class087742, class07403 class074032) {
        this.y.N(class074032, "Deop '{}'", new Object[]{class087742});
        this.N.Nm().i(class087742);
    }

    public void N(class07403 class074032) {
        this.y.N(class074032, "Clear operator list", new Object[0]);
        this.N.Nm().E().N();
    }

    public void N(class08774 class087742, class07403 class074032) {
        this.y.N(class074032, "Op '{}'", new Object[]{class087742});
        this.N.Nm().u(class087742);
    }

    public void N(class08774 class087742, Optional<class08195> optional, Optional<Boolean> optional2, class07403 class074032) {
        this.y.N(class074032, "Op '{}'", new Object[]{class087742});
        this.N.Nm().N(class087742, optional.map(class06984::N), optional2);
    }

    public Collection<class01087> N() {
        return this.N.Nm().E().i();
    }
}

