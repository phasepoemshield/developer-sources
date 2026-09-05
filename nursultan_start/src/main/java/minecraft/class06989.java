/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 */
package minecraft;

import com.mojang.datafixers.DSL;

class class06989
implements DSL.TypeReference {
    final /* synthetic */ String N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06989(String string) {
        this.N = string;
    }

    public String toString() {
        return "@" + this.N;
    }

    public String typeName() {
        return this.N;
    }
}

