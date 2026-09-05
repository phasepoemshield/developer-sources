/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.GPS
 *  Nursultan.class11938
 *  org.joml.Vector2d
 *  org.joml.Vector2dc
 */
package Nursultan;

import Nursultan.GPS;
import Nursultan.class11938;
import org.joml.Vector2d;
import org.joml.Vector2dc;

public class class10705 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public boolean L() {
        return (Boolean)this.N_1;
    }

    public class10705() {
        this.B();
        this.N_0 = new Vector2d();
    }

    private void B() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = false;
        }
    }

    public Vector2dc u() {
        return (Vector2d)this.N_0;
    }

    public void y() {
        class11938.u().NK().m();
    }

    public void N(double d, double d2) {
        GPS gPS = class11938.u().NK();
        gPS.N(true);
        gPS.N(d, d2);
    }

    public void N(Double d, Double d2) {
        if (d == null || d2 == null) {
            this.N_1 = false;
            return;
        }
        ((Vector2d)this.N_0).set(d.doubleValue(), d2.doubleValue());
        this.N_1 = true;
    }

    public boolean N() {
        return class11938.u().NK().U() && (Boolean)this.N_1 != false;
    }
}

