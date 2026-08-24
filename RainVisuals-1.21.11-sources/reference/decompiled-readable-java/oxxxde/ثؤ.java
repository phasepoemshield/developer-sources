/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062a\u0629;
import oxxxde.\u062c\u0634;
import oxxxde.\u0630\u0646;
import oxxxde.\u0632\u0622;
import oxxxde.\u0636\u0648;

public abstract class \u062b\u0624<T> {
    public abstract \u0630\u0646 load(T var1, \u0636\u0648 var2, \u0632\u0622 var3, \u062c\u0634 var4) throws Exception;

    public \u062a\u0629<T> createTextureBuilder() {
        return new \u062a\u0629(this);
    }
}

