/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05142
 *  minecraft.class05623
 *  minecraft.class07403
 *  minecraft.class07409
 *  minecraft.class07932
 *  minecraft.class08774
 */
package minecraft;

import java.util.Collection;
import minecraft.class05142;
import minecraft.class05623;
import minecraft.class07403;
import minecraft.class07409;
import minecraft.class07932;
import minecraft.class08774;

public class class00430
implements class07409 {
    private final class05623 N;
    private final class07932 y;

    public class00430(class05623 class056232, class07932 class079322) {
        this.N = class056232;
        this.y = class079322;
    }

    public void y(class07403 class074032) {
        this.y.N(class074032, "Kick unlisted players", new Object[0]);
        this.N.yN();
    }

    public void N(class07403 class074032) {
        this.y.N(class074032, "Clear allowlist", new Object[0]);
        this.N.Nm().z().N();
    }

    public void N(class08774 class087742, class07403 class074032) {
        this.y.N(class074032, "Remove player '{}' from allowlist", new Object[]{class087742});
        this.N.Nm().z().y(class087742);
    }

    public Collection<class05142> N() {
        return this.N.Nm().z().i();
    }

    public boolean N(class05142 class051422, class07403 class074032) {
        this.y.N(class074032, "Add player '{}' to allowlist", new Object[]{class051422.B()});
        return this.N.Nm().z().N(class051422);
    }
}

