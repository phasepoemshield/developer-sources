/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class05121;
import minecraft.class05134;

public class class05126
extends class05134<class05126> {
    public class05126(String string, int n, int n2) {
        super(string, n, n2);
    }

    @Override
    public class05126 i() {
        try {
            this.N.setDoInput(true);
            this.N.setDoOutput(true);
            this.N.setUseCaches(false);
            this.N.setRequestMethod("GET");
            return this;
        }
        catch (Exception exception) {
            throw new class05121(exception.getMessage(), exception);
        }
    }
}

