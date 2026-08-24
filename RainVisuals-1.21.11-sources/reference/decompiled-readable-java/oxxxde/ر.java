/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u0627\u0631;
import oxxxde.\u0627\u064a;
import oxxxde.\u0632\u064c;

public class \u0631 {
    private \u0627\u064a decompileMode;
    private \u0632\u064c loader = null;
    private String name = null;

    private void checkArguments() {
        if (this.name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        if (this.loader == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            throw new IllegalArgumentException(String.format("Loader in gif '%s' cannot be null.", objectArray));
        }
        if (this.decompileMode == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.name;
            throw new IllegalArgumentException(String.format("DecompileMode in gif '%s' cannot be null.", objectArray));
        }
    }

    public \u0631 loader(\u0632\u064c loader) {
        this.loader = loader;
        return this;
    }

    public static \u0631 builder() {
        return new \u0631();
    }

    public \u0631 decompileMode(\u0627\u064a decompileMode) {
        this.decompileMode = decompileMode;
        return this;
    }

    public \u0631 name(String name) {
        this.name = name;
        return this;
    }

    public \u0627\u0631 build() {
        try {
            this.checkArguments();
            return \u0627\u0631.of(this.name, this.loader.load(this.decompileMode));
        }
        catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    private \u0631() {
    }
}

