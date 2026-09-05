/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Interner
 *  com.google.common.collect.Interners
 *  minecraft.class02012
 *  org.joml.Vector3fc
 */
package Nursultan;

import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import minecraft.class02012;
import org.joml.Vector3fc;

public class class11660
implements class02012 {
    private final Interner<Vector3fc> N = Interners.newStrongInterner();

    public Vector3fc N(Vector3fc vector3fc) {
        return (Vector3fc)this.N.intern((Object)vector3fc);
    }
}

