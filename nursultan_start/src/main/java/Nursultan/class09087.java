/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09069;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.lwjgl.opengl.GL33;

public class class09087
extends Record {
    public class09069[] attrs;

    public int L() {
        int n = 0;
        for (class09069 class090692 : this.attrs) {
            n += class090692.N();
        }
        return n;
    }

    public class09087(class09069 ... class09069Array) {
        this.attrs = class09069Array;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09087.class, "attrs", "attrs"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09087.class, "attrs", "attrs"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09087.class, "attrs", "attrs"}, this);
    }

    public void y() {
        int n = this.L();
        int n2 = 0;
        for (int i = 0; i < this.attrs.length; ++i) {
            class09069 class090692 = this.attrs[i];
            GL33.glEnableVertexAttribArray((int)i);
            if (class090692.i() == 5124 || class090692.i() == 5125) {
                GL33.glVertexAttribIPointer((int)i, (int)class090692.u(), (int)class090692.i(), (int)n, (long)n2);
            } else {
                GL33.glVertexAttribPointer((int)i, (int)class090692.u(), (int)class090692.i(), (boolean)class090692.L(), (int)n, (long)n2);
            }
            if (class090692.M() != 0) {
                GL33.glVertexAttribDivisor((int)i, (int)class090692.M());
            }
            n2 += class090692.N();
        }
    }

    public class09069[] N() {
        return this.attrs;
    }
}

