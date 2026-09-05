/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package Nursultan;

import java.util.AbstractList;
import java.util.NoSuchElementException;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class11762
extends AbstractList<Vector4f> {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public class11762(int n) {
        this.i();
        this.N_0 = new Vector4f[n];
        for (int i = 0; i < n; ++i) {
            ((Vector4f[])this.N_0)[i] = new Vector4f();
        }
    }

    @Override
    public int size() {
        return (Integer)this.N_1;
    }

    @Override
    public void clear() {
        this.N_1 = 0;
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }

    public Vector4f removeLast() {
        if ((Integer)this.N_1 == 0) {
            throw new NoSuchElementException();
        }
        this.N_1 = (Integer)this.N_1 - 1;
        return ((Vector4f[])this.N_0)[(Integer)this.N_1];
    }

    @Override
    public Vector4f get(int n) {
        return ((Vector4f[])this.N_0)[n];
    }

    public void N(Vector4fc vector4fc) {
        if ((Integer)this.N_1 == ((Vector4f[])this.N_0).length) {
            Vector4f[] vector4fArray = new Vector4f[((Vector4f[])this.N_0).length * 2];
            System.arraycopy((Vector4f[])this.N_0, 0, vector4fArray, 0, ((Vector4f[])this.N_0).length);
            for (int i = ((Vector4f[])this.N_0).length; i < vector4fArray.length; ++i) {
                vector4fArray[i] = new Vector4f();
            }
            this.N_0 = vector4fArray;
        }
        ((Vector4f[])this.N_0)[(Integer)this.N_1].set(vector4fc);
        this.N_1 = (Integer)this.N_1 + 1;
    }
}

