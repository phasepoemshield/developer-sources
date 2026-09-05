/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09054
 *  Nursultan.class11776
 */
package Nursultan;

import Nursultan.class09054;
import Nursultan.class11776;
import java.util.Objects;
import java.util.UUID;

public class class09250 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class09054 L() {
        return ((class11776)this.N_0).N();
    }

    public long M() {
        return (Long)this.N_1;
    }

    public class09250(class11776 class117762, boolean bl, long l) {
        this.z();
        this.N_0 = class117762;
        this.N_2 = bl;
        this.N_1 = l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class09250)) return false;
        class09250 class092502 = (class09250)object;
        if (!((class11776)this.N_0).equals((Object)((class11776)class092502.N_0))) return false;
        return true;
    }

    public int hashCode() {
        return Objects.hashCode((class11776)this.N_0);
    }

    public class11776 i() {
        return (class11776)this.N_0;
    }

    private void z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0L;
            this.N_2 = false;
        }
    }

    public String u() {
        return ((class11776)this.N_0).u();
    }

    public boolean y() {
        return (Boolean)this.N_2;
    }

    public UUID N() {
        return ((class11776)this.N_0).L();
    }

    public class09250 N(boolean bl) {
        this.N_2 = bl;
        return this;
    }

    public UUID R() {
        return ((class11776)this.N_0).y();
    }
}

