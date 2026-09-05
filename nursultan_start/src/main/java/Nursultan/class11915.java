/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11781
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11781;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11915
extends Record {
    public class11781 clientEntity;
    public boolean sneaking;
    public boolean jumping;
    public boolean water;
    public int jumpingCooldown;
    public boolean sprinting;
    public double fallDistance;
    public boolean ground;

    public boolean L() {
        return this.water;
    }

    public boolean M() {
        return this.sneaking;
    }

    public class11915(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, double d, int n, class11781 class117812) {
        this.sneaking = bl;
        this.sprinting = bl2;
        this.jumping = bl3;
        this.water = bl4;
        this.ground = bl5;
        this.fallDistance = d;
        this.jumpingCooldown = n;
        this.clientEntity = class117812;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11915.class, "sneaking;sprinting;jumping;water;ground;fallDistance;jumpingCooldown;clientEntity", "sneaking", "sprinting", "jumping", "water", "ground", "fallDistance", "jumpingCooldown", "clientEntity"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11915.class, "sneaking;sprinting;jumping;water;ground;fallDistance;jumpingCooldown;clientEntity", "sneaking", "sprinting", "jumping", "water", "ground", "fallDistance", "jumpingCooldown", "clientEntity"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11915.class, "sneaking;sprinting;jumping;water;ground;fallDistance;jumpingCooldown;clientEntity", "sneaking", "sprinting", "jumping", "water", "ground", "fallDistance", "jumpingCooldown", "clientEntity"}, this);
    }

    public boolean B() {
        return this.ground;
    }

    public double i() {
        return this.fallDistance;
    }

    public class11781 u() {
        return this.clientEntity;
    }

    public boolean y() {
        return this.sprinting;
    }

    public int N() {
        return this.jumpingCooldown;
    }

    public boolean R() {
        return this.jumping;
    }
}

