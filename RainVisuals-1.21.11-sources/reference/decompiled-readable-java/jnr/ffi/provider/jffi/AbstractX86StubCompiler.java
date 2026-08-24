/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.NativeMethod;
import com.kenai.jffi.NativeMethods;
import com.kenai.jffi.PageManager;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import jnr.ffi.Platform;
import jnr.ffi.Runtime;
import jnr.ffi.provider.jffi.MemoryUtil;
import jnr.ffi.provider.jffi.StubCompiler;
import jnr.ffi.provider.jffi.X86Disassembler;
import jnr.x86asm.Assembler;

abstract class AbstractX86StubCompiler
extends StubCompiler {
    final List<Stub> stubs = new LinkedList<Stub>();
    private final Runtime runtime;
    static final AtomicIntegerFieldUpdater<PageHolder> PAGE_HOLDER_UPDATER;
    public static final boolean DEBUG;

    static {
        DEBUG = Boolean.getBoolean("jnr.ffi.compile.dump");
        PAGE_HOLDER_UPDATER = AtomicIntegerFieldUpdater.newUpdater(PageHolder.class, "disposed");
    }

    static long align(long offset, long align) {
        return offset + align - 1L & (align - 1L ^ 0xFFFFFFFFFFFFFFFFL);
    }

    static int align(int offset, int align) {
        return offset + align - 1 & ~(align + -1);
    }

    protected AbstractX86StubCompiler(Runtime runtime) {
        this.runtime = runtime;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    void attach(Class clazz) {
        void var9_7;
        void var1_1;
        if (this.stubs.isEmpty()) {
            return;
        }
        long codeSize = 0L;
        for (Stub stub : this.stubs) {
            codeSize += (long)(stub.assembler.codeSize() + 8);
        }
        PageManager pm = PageManager.getInstance();
        long npages = (codeSize + pm.pageSize() - 1L) / pm.pageSize();
        long code = pm.allocatePages((int)npages, 3);
        if (code == 0L) {
            throw new OutOfMemoryError("allocatePages failed for codeSize=" + codeSize);
        }
        PageHolder page = new PageHolder(pm, code, npages);
        ArrayList<NativeMethod> methods = new ArrayList<NativeMethod>(this.stubs.size());
        long fn = code;
        PrintStream dbg = System.err;
        System.out.flush();
        System.err.flush();
        for (Stub stub : this.stubs) {
            void var16_13;
            Assembler asm = stub.assembler;
            fn = AbstractX86StubCompiler.align(fn, 8L);
            ByteBuffer buf = ByteBuffer.allocate(asm.codeSize()).order(ByteOrder.LITTLE_ENDIAN);
            stub.assembler.relocCode(buf, fn);
            buf.flip();
            MemoryIO.getInstance().putByteArray(fn, buf.array(), buf.arrayOffset(), buf.limit());
            if (DEBUG && X86Disassembler.isAvailable()) {
                dbg.println(clazz.getName() + "." + stub.name + " " + stub.signature);
                X86Disassembler disassembler = X86Disassembler.create();
                disassembler.setMode(Platform.getNativePlatform().getCPU() == Platform.CPU.I386 ? X86Disassembler.Mode.I386 : X86Disassembler.Mode.X86_64);
                disassembler.setSyntax(X86Disassembler.Syntax.INTEL);
                disassembler.setInputBuffer(MemoryUtil.newPointer(this.runtime, fn), asm.offset());
                while (disassembler.disassemble()) {
                    Object[] objectArray = new Object[2];
                    objectArray[0] = disassembler.offset();
                    objectArray[1] = disassembler.insn();
                    dbg.printf("%8x: %s\n", objectArray);
                }
                if (buf.remaining() > asm.offset()) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = asm.offset();
                    dbg.printf("%8x: <indirect call trampolines>\n", objectArray);
                }
                dbg.println();
            }
            methods.add(new NativeMethod(fn, stub.name, stub.signature));
            fn += (long)var16_13.codeSize();
        }
        pm.protectPages(code, (int)npages, 5);
        NativeMethods.register(clazz, methods);
        StaticDataHolder.PAGES.put((Class)var1_1, (PageHolder)var9_7);
    }

    public final Runtime getRuntime() {
        return this.runtime;
    }

    private static final class StaticDataHolder {
        static final Map<Class, PageHolder> PAGES = Collections.synchronizedMap(new WeakHashMap());

        private StaticDataHolder() {
        }
    }

    static final class PageHolder {
        final PageManager pm;
        final long pageCount;
        volatile int disposed;
        final long memory;

        protected void finalize() throws Throwable {
            try {
                int disposed = PAGE_HOLDER_UPDATER.getAndSet(this, 1);
                if (disposed == 0) {
                    this.pm.freePages(this.memory, (int)this.pageCount);
                }
            }
            catch (Throwable t) {
                Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Exception when freeing native pages: %s", t.getLocalizedMessage());
            }
            finally {
                super.finalize();
            }
        }

        public PageHolder(PageManager pm, long memory, long pageCount) {
            this.pm = pm;
            this.memory = memory;
            this.pageCount = pageCount;
        }
    }

    static final class Stub {
        final String signature;
        final Assembler assembler;
        final String name;

        public Stub(String name, String signature, Assembler assembler) {
            this.name = name;
            this.signature = signature;
            this.assembler = assembler;
        }
    }
}

