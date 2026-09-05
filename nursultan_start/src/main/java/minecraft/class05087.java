/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05042
 *  minecraft.class05474
 *  minecraft.class07074
 *  minecraft.class07086
 *  minecraft.class07209
 */
package minecraft;

import java.util.Locale;
import minecraft.class05042;
import minecraft.class05474;
import minecraft.class07074;
import minecraft.class07086;
import minecraft.class07209;

public interface class05087 {
    public long L();

    public boolean T();

    public boolean B();

    public class07086 s();

    public boolean U();

    public long y();

    public void y(boolean var1);

    default public void N(class07074 class070742, class05474 class054742) {
        class070742.N("Level spawn location", () -> class07074.N((class05474)class054742, (class07209)this.N().y()));
        class070742.N("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.y(), this.L()));
    }

    public class05042 N();

    public boolean R();
}

