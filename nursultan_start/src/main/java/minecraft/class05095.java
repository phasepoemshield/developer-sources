/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class05121;
import minecraft.class05134;

public class class05095
extends class05134<class05095> {
    public class05095(String string, int n, int n2) {
        super(string, n, n2);
    }

    @Override
    public class05095 i() {
        try {
            this.N.setDoOutput(true);
            this.N.setRequestMethod("DELETE");
            this.N.connect();
            return this;
        }
        catch (Exception exception) {
            throw new class05121(exception.getMessage(), exception);
        }
    }
}

