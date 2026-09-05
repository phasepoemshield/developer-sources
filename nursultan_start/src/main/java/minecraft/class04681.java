/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05005
 */
package minecraft;

import java.nio.file.Path;
import java.util.List;
import minecraft.class05005;

public interface class04681 {
    public static final char y = '\u001e';

    public long L();

    default public long M() {
        return this.L() - this.N();
    }

    public String i();

    public int u();

    public static String y(String string) {
        return string.replace('\u001e', '.');
    }

    public int y();

    public boolean N(Path var1);

    public List<class05005> N(String var1);

    public long N();

    default public int R() {
        return this.u() - this.y();
    }
}

