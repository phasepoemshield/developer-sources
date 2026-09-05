/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.targets;

import org.joml.Vector4f;

public class ClearPassInformation {
    private final Vector4f color;
    private final int width;
    private final int height;

    public ClearPassInformation(Vector4f vector4f, int n, int n2) {
        this.color = vector4f;
        this.width = n;
        this.height = n2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ClearPassInformation)) {
            return false;
        }
        ClearPassInformation clearPassInformation = (ClearPassInformation)object;
        return clearPassInformation.color.equals((Object)this.color) && clearPassInformation.height == this.height && clearPassInformation.width == this.width;
    }

    public Vector4f getColor() {
        return this.color;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}

