/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08774
 *  minecraft.class08957
 */
package minecraft;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import minecraft.class08774;
import minecraft.class08957;

class class01691
implements class08957 {
    private final Set<class08774> N = new HashSet<class08774>();

    class01691() {
    }

    public void N() {
    }

    public void N(class08774 class087742) {
        this.N.add(class087742);
    }

    public Optional<class08774> N(String string) {
        return this.N.stream().filter(class087742 -> class087742.y().equals(string)).findFirst().or(() -> Optional.of(class08774.N((String)string)));
    }

    public Optional<class08774> N(UUID uUID) {
        return this.N.stream().filter(class087742 -> class087742.N().equals(uUID)).findFirst();
    }

    public void N(boolean bl) {
    }
}

