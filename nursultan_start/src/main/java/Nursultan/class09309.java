/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package Nursultan;

import org.joml.Vector3d;
import org.joml.Vector3dc;

public class class09309 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;

    public String L() {
        return (String)this.N_1;
    }

    public class09309(String string, String string2, Vector3d vector3d) {
        this.Z();
        this.N_0 = string;
        this.N_1 = string2;
        this.N_4 = new Vector3d((Vector3dc)vector3d);
        this.N_3 = new Vector3d((Vector3dc)vector3d);
        this.N_2 = System.currentTimeMillis();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class09309)) {
            return false;
        }
        class09309 class093092 = (class09309)object;
        String string = this.u();
        String string2 = class093092.u();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        String string = this.u();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    private void Z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0L;
        }
    }

    public Vector3d i() {
        return (Vector3d)this.N_4;
    }

    public String u() {
        return (String)this.N_0;
    }

    public long y() {
        return (Long)this.N_2;
    }

    public class09309 N(long l) {
        this.N_2 = l;
        return this;
    }

    public Vector3d N() {
        return (Vector3d)this.N_3;
    }
}

