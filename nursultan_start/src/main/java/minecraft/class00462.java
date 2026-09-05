/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01072
 *  minecraft.class02796
 *  minecraft.class05157
 *  minecraft.class07388
 *  minecraft.class07403
 *  minecraft.class07932
 *  minecraft.class08774
 */
package minecraft;

import java.util.Collection;
import minecraft.class01072;
import minecraft.class02796;
import minecraft.class05157;
import minecraft.class07388;
import minecraft.class07403;
import minecraft.class07932;
import minecraft.class08774;

public class class00462
implements class07388 {
    private final class02796 N;
    private final class07932 y;

    public class00462(class02796 class027962, class07932 class079322) {
        this.N = class027962;
        this.y = class079322;
    }

    public Collection<class01072> y() {
        return this.N.Nm().B().i();
    }

    public void y(class07403 class074032) {
        this.N.Nm().M().N();
    }

    public void N(class07403 class074032) {
        this.y.N(class074032, "Clear ip ban list", new Object[0]);
        this.N.Nm().B().N();
    }

    public void N(class01072 class010722, class07403 class074032) {
        this.y.N(class074032, "Add ip '{}' to ban list", new Object[]{class010722.B()});
        this.N.Nm().B().N(class010722);
    }

    public void N(String string, class07403 class074032) {
        this.y.N(class074032, "Remove ip '{}' from ban list", new Object[]{string});
        this.N.Nm().B().y(string);
    }

    public Collection<class05157> N() {
        return this.N.Nm().M().i();
    }

    public void N(class08774 class087742, class07403 class074032) {
        this.y.N(class074032, "Remove player '{}' from banlist", new Object[]{class087742});
        this.N.Nm().M().L(class087742);
    }

    public void N(class05157 class051572, class07403 class074032) {
        this.y.N(class074032, "Add player '{}' to banlist. Reason: '{}'", new Object[]{class051572.R(), class051572.i().getString()});
        this.N.Nm().M().N(class051572);
    }
}

