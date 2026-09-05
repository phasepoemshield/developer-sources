/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 */
package minecraft;

import minecraft.class04482;
import minecraft.class04489;
import org.slf4j.Logger;

public class class04495
extends class04482
implements AutoCloseable {
    private final Logger L;

    public class04495(Logger logger) {
        this.L = logger;
    }

    public class04495(class04489 class044892, Logger logger) {
        super(class044892);
        this.L = logger;
    }

    @Override
    public void close() {
        if (!this.N()) {
            this.L.warn("[{}] Serialization errors:\n{}", (Object)this.L.getName(), (Object)this.L());
        }
    }
}

