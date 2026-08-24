/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.eclipse.jdt.annotation.NonNull
 */
package org.newsclub.net.unix;

import java.io.Closeable;
import org.eclipse.jdt.annotation.NonNull;
import org.newsclub.net.unix.AFSomeSocket;
import org.newsclub.net.unix.CloseablePair;

public abstract class AFSocketPair<T extends AFSomeSocket>
extends CloseablePair<T> {
    protected AFSocketPair(T a2, T b2, Closeable alsoClose) {
        super(a2, b2, alsoClose);
    }

    protected AFSocketPair(T a2, T b2) {
        super(a2, b2);
    }

    public final @NonNull T getSocket1() {
        return (T)((AFSomeSocket)this.getFirst());
    }

    public final @NonNull T getSocket2() {
        return (T)((AFSomeSocket)this.getSecond());
    }
}

