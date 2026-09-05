/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01215
 *  minecraft.class01894
 *  net.fabricmc.fabric.impl.datagen.FabricTagBuilder
 *  net.fabricmc.fabric.impl.datagen.ForcedTagEntry
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class01215;
import minecraft.class01894;
import net.fabricmc.fabric.impl.datagen.FabricTagBuilder;
import net.fabricmc.fabric.impl.datagen.ForcedTagEntry;

public class class01225
implements FabricTagBuilder {
    private final List<class01215> N = new ArrayList<class01215>();
    private boolean y = false;

    public class01225 L(class01894 class018942) {
        return this.N(class01215.method_43945((class01894)class018942));
    }

    public class01225 u(class01894 class018942) {
        return this.N(class01215.method_43947((class01894)class018942));
    }

    public class01225 y(class01894 class018942) {
        return this.N(class01215.method_43942((class01894)class018942));
    }

    public List<class01215> y() {
        return List.copyOf(this.N);
    }

    public static class01225 N() {
        return new class01225();
    }

    public class01225 N(class01215 class012152) {
        this.N.add(class012152);
        return this;
    }

    public class01225 N(class01894 class018942) {
        return this.N(class01215.method_43937((class01894)class018942));
    }

    public void fabric_forceAddTag(class01894 class018942) {
        this.N((class01215)new ForcedTagEntry(class018942));
    }

    public void fabric_setReplace(boolean bl) {
        this.y = bl;
    }

    public boolean fabric_isReplaced() {
        return this.y;
    }
}

