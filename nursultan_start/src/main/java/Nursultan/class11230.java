/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Particles
 *  Nursultan.class11807
 */
package Nursultan;

import Nursultan.Particles;
import Nursultan.class11179;
import Nursultan.class11807;

public abstract class class11230
extends class11807<Particles> {
    public Object y_0;

    private void L() {
    }

    public class11230(Particles particles, String string, boolean bl) {
        super((Object)particles, string, bl);
        this.L();
        this.y_0 = particles;
    }

    public void N(class11179 class111792) {
        this.L();
        ((Particles)this.y_0).N(class111792);
    }

    public int N() {
        this.L();
        return ((Particles)this.y_0).m();
    }
}

