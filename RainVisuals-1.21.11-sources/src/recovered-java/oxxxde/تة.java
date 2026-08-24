/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.render.texture.texture.GLTexture;
import oxxxde.\u062b\u0624;
import oxxxde.\u062c\u0634;
import oxxxde.\u0632\u0622;
import oxxxde.\u0636\u0648;

public class \u062a\u0629<T> {
    private T path = null;
    private String name = null;
    private \u062c\u0634 wrapping = null;
    private \u0632\u0622 filtering = null;
    private final \u062b\u0624<T> loader;
    private \u0636\u0648 colorMode = \u0636\u0648.RGBA;

    public \u062a\u0629<T> colorMode(\u0636\u0648 colorMode) {
        this.colorMode = colorMode;
        return this;
    }

    private void checkArguments() {
        if (this.name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        if (this.loader == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            throw new IllegalArgumentException(String.format("Loader in texture '%s' cannot be null.", objectArray));
        }
        if (this.path == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            throw new IllegalArgumentException(String.format("Path in texture '%s' cannot be null.", objectArray));
        }
        if (this.colorMode == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            throw new IllegalArgumentException(String.format("ColorMode in texture '%s' cannot be null.", objectArray));
        }
        if (this.filtering == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            throw new IllegalArgumentException(String.format("TextureFiltering in texture '%s' cannot be null.", objectArray));
        }
        if (this.wrapping == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            throw new IllegalArgumentException(String.format("TextureWrapping in texture '%s' cannot be null.", objectArray));
        }
    }

    /*
     * WARNING - void declaration
     */
    public \u062a\u0629(\u062b\u0624<T> loader) {
        void var1_1;
        this.loader = var1_1;
    }

    public \u062a\u0629<T> wrapping(\u062c\u0634 wrapping) {
        this.wrapping = wrapping;
        return this;
    }

    public GLTexture build() {
        try {
            this.checkArguments();
            return GLTexture.of(this.name, this.loader.load(this.path, this.colorMode, this.filtering, this.wrapping));
        }
        catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public \u062a\u0629<T> name(String name) {
        this.name = name;
        return this;
    }

    public \u062a\u0629<T> path(T path) {
        this.path = path;
        return this;
    }

    public \u062a\u0629<T> filtering(\u0632\u0622 filtering) {
        this.filtering = filtering;
        return this;
    }
}

