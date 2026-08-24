/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 */
package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.Cleaner;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
abstract class CleanableState
implements Closeable {
    private static final Cleaner CLEANER = Cleaner.create();
    private final Cleaner.Cleanable cleanable;

    protected CleanableState(Object observed) {
        this.cleanable = CLEANER.register(observed, () -> this.doClean());
    }

    public final void runCleaner() {
        this.cleanable.clean();
    }

    protected abstract void doClean();

    @Override
    public final void close() throws IOException {
        this.runCleaner();
    }
}

