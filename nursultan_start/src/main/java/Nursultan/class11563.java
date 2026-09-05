/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 *  org.joml.Vector3d
 */
package Nursultan;

import Nursultan.class11579;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06584;
import org.joml.Vector3d;

public class class11563
extends Record {
    public Vector3d center;
    public int lifeTimeTicks;
    public class11579 structure;
    public class06584 itemStack;

    public class06584 L() {
        return this.itemStack;
    }

    public class11563(class06584 class065842, class11579 class115792, Vector3d vector3d, int n) {
        this.itemStack = class065842;
        this.structure = class115792;
        this.center = vector3d;
        this.lifeTimeTicks = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11563.class, "itemStack;structure;center;lifeTimeTicks", "itemStack", "structure", "center", "lifeTimeTicks"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11563.class, "itemStack;structure;center;lifeTimeTicks", "itemStack", "structure", "center", "lifeTimeTicks"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11563.class, "itemStack;structure;center;lifeTimeTicks", "itemStack", "structure", "center", "lifeTimeTicks"}, this);
    }

    public class11579 u() {
        return this.structure;
    }

    public int y() {
        return this.lifeTimeTicks;
    }

    public Vector3d N() {
        return this.center;
    }
}

