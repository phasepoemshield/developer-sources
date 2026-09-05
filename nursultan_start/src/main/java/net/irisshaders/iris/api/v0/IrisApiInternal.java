/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.api.v0;

import net.irisshaders.iris.api.v0.IrisApi;

public class IrisApiInternal {
    static final IrisApi INSTANCE;

    static {
        try {
            INSTANCE = (IrisApi)Class.forName("net.irisshaders.iris.apiimpl.IrisApiV0Impl").getField("INSTANCE").get(null);
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

