/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.texture;

public class TextureScaleOverride {
    public final boolean isXRelative;
    public final boolean isYRelative;
    public float relativeX;
    public float relativeY;
    public int sizeX;
    public int sizeY;

    public TextureScaleOverride(String string, String string2) {
        if (string.contains(".")) {
            this.relativeX = Float.parseFloat(string);
            this.isXRelative = true;
        } else {
            this.sizeX = Integer.parseInt(string);
            this.isXRelative = false;
        }
        if (string2.contains(".")) {
            this.relativeY = Float.parseFloat(string2);
            this.isYRelative = true;
        } else {
            this.sizeY = Integer.parseInt(string2);
            this.isYRelative = false;
        }
    }

    public int getY(int n) {
        if (this.isYRelative) {
            return (int)((float)n * this.relativeY);
        }
        return this.sizeY;
    }

    public int getX(int n) {
        if (this.isXRelative) {
            return (int)((float)n * this.relativeX);
        }
        return this.sizeX;
    }
}

