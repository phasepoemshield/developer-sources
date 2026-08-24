/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.Invoker;
import jnr.ffi.Runtime;
import jnr.ffi.provider.LoadedLibrary;
import jnr.ffi.provider.jffi.NativeLibrary;

public abstract class AbstractAsmLibraryInterface
implements LoadedLibrary {
    protected final NativeLibrary library;
    protected final Runtime runtime;
    public static final Invoker ffi = Invoker.getInstance();

    public AbstractAsmLibraryInterface(Runtime runtime, NativeLibrary library) {
        this.runtime = runtime;
        this.library = library;
    }

    final NativeLibrary getLibrary() {
        return this.library;
    }

    @Override
    public final Runtime getRuntime() {
        return this.runtime;
    }
}

