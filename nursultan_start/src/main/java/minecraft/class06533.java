/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07570
 *  minecraft.class08044
 *  minecraft.class08156
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01894;
import minecraft.class06546;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07570;
import minecraft.class08044;
import minecraft.class08156;
import org.jspecify.annotations.Nullable;

public class class06533
extends class06546<class07570> {
    private static final class01894 n = class01894.y((String)"container/slot");
    private static final class01894 t = class01894.y((String)"textures/gui/container/nautilus.png");

    @Override
    protected @Nullable class01894 L() {
        return null;
    }

    public class06533(class07570 class075702, class08044 class080442, class08156 class081562, int n) {
        super(class075702, class080442, class081562.method_5476(), n, (class07438)class081562);
    }

    @Override
    protected boolean i() {
        return this.u.method_56991(class07085.field_55946);
    }

    @Override
    protected class01894 y() {
        return n;
    }

    @Override
    protected class01894 N() {
        return t;
    }

    @Override
    protected boolean R() {
        return this.u.method_56991(class07085.field_48824);
    }
}

