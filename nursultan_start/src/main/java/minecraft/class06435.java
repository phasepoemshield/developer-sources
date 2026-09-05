/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package minecraft;

import java.nio.file.Path;
import minecraft.class00392;
import minecraft.class06434;

public class class06435
extends class06434 {
    private static final class00392 y = class00392.L((String)"recover_world.warning").N(class004052 -> class004052.N(-65536));
    private static final class00392 L = class00392.L((String)"recover_world.button");
    private final long u;

    @Override
    public boolean T() {
        return false;
    }

    public class06435(String string, Path path, long l) {
        super(null, null, string, false, false, false, path);
        this.u = l;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public class00392 v() {
        return L;
    }

    @Override
    public class00392 j() {
        return y;
    }

    @Override
    public String y() {
        return this.N();
    }

    @Override
    public long R() {
        return this.u;
    }

    @Override
    public boolean G() {
        return false;
    }
}

