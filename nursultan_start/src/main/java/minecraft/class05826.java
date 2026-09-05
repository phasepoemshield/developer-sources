/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07211
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Objects;
import minecraft.class00500;
import minecraft.class07211;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class05826 {
    private class00500 first;
    private class00500 second;
    private class07211 direction;
    private int u;

    public class07211 L() {
        return this.direction;
    }

    public class05826(class00500 class005002, class00500 class005003, class07211 class072112) {
        this.first = class005002;
        this.second = class005003;
        this.direction = class072112;
        this.N(class005002, class005003, class072112, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof class05826)) return false;
        class05826 class058262 = (class05826)object;
        if (this.first != class058262.first) return false;
        if (this.second != class058262.second) return false;
        if (this.direction != class058262.direction) return false;
        return true;
    }

    public final String toString() {
        return "class05826[first=" + Objects.toString(this.first) + ", second=" + Objects.toString(this.second) + ", direction=" + Objects.toString(this.direction) + "]";
    }

    public int hashCode() {
        return this.u;
    }

    public class00500 y() {
        return this.second;
    }

    private void N(class00500 class005002, class00500 class005003, class07211 class072112, CallbackInfo callbackInfo) {
        int n = System.identityHashCode(this.first);
        n = 31 * n + System.identityHashCode(this.second);
        this.u = 31 * n + this.direction.hashCode();
    }

    public class00500 N() {
        return this.first;
    }
}

