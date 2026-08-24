/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import com.kenai.jffi.Type;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Aggregate
extends Type {
    private volatile int disposed;
    private static final AtomicIntegerFieldUpdater<Aggregate> UPDATER = AtomicIntegerFieldUpdater.newUpdater(Aggregate.class, "disposed");
    private final long handle;
    private final Type.TypeInfo typeInfo;
    private final Foreign foreign;

    public final synchronized void dispose() {
    }

    Aggregate(Foreign foreign, long handle) {
        if (handle == 0L) {
            throw new NullPointerException("Invalid ffi_type handle");
        }
        this.foreign = foreign;
        this.handle = handle;
        this.typeInfo = new Type.TypeInfo(handle, foreign.getTypeType(handle), foreign.getTypeSize(handle), foreign.getTypeAlign(handle));
    }

    protected void finalize() throws Throwable {
        try {
            int disposed = UPDATER.getAndSet(this, 1);
            if (disposed == 0) {
                this.foreign.freeAggregate(this.typeInfo.handle);
            }
        }
        catch (Throwable t) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Exception when freeing FFI aggregate: %s", t.getLocalizedMessage());
        }
        finally {
            super.finalize();
        }
    }

    @Override
    final Type.TypeInfo getTypeInfo() {
        return this.typeInfo;
    }
}

