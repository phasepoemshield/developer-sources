package jnr.ffi.provider.jffi;

import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.NativeMethod;
import com.kenai.jffi.NativeMethods;
import com.kenai.jffi.PageManager;
import java.io.PrintStream;
import java.nio.Buffer;
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
import jnr.x86asm.Assembler;

// $VF: Compiled from AbstractX86StubCompiler.java
abstract class AbstractX86StubCompiler extends StubCompiler {
   final List<AbstractX86StubCompiler.Stub> stubs = new LinkedList<>();
   private final Runtime runtime;
   static final AtomicIntegerFieldUpdater<AbstractX86StubCompiler.PageHolder> PAGE_HOLDER_UPDATER = AtomicIntegerFieldUpdater.newUpdater(
      AbstractX86StubCompiler.PageHolder.class, "disposed"
   );
   public static final boolean DEBUG = Boolean.getBoolean("jnr.ffi.compile.dump");

   static long align(long align, long offset) {
      return offset + align - 1L & ~(align - 1L);
   }

   static int align(int offset, int align) {
      return offset + align - 1 & ~(align + -1);
   }

   protected AbstractX86StubCompiler(Runtime runtime) {
      this.runtime = runtime;
   }

   @Override
   void attach(Class clazz) {
      if (!this.stubs.isEmpty()) {
         long codeSize = 0L;

         for (AbstractX86StubCompiler.Stub stub : this.stubs) {
            codeSize += stub.assembler.codeSize() + 8;
         }

         PageManager pm = PageManager.getInstance();
         long var20 = (codeSize + pm.pageSize() - 1L) / pm.pageSize();
         long code = pm.allocatePages((int)var20, 3);
         if (code == 0L) {
            throw new OutOfMemoryError("allocatePages failed for codeSize=" + codeSize);
         }

         AbstractX86StubCompiler.PageHolder page = new AbstractX86StubCompiler.PageHolder(pm, code, var20);
         List<NativeMethod> methods = new ArrayList(this.stubs.size());
         long fn = code;
         PrintStream dbg = System.err;
         System.out.flush();
         System.err.flush();

         for (AbstractX86StubCompiler.Stub stub : this.stubs) {
            Assembler asm = stub.assembler;
            fn = align(fn, 8L);
            ByteBuffer buf = ByteBuffer.allocate(asm.codeSize()).order(ByteOrder.LITTLE_ENDIAN);
            stub.assembler.relocCode(buf, fn);
            ((Buffer)buf).flip();
            MemoryIO.getInstance().putByteArray(fn, buf.array(), buf.arrayOffset(), buf.limit());
            if (DEBUG && X86Disassembler.isAvailable()) {
               dbg.println(clazz.getName() + "." + stub.name + " " + stub.signature);
               X86Disassembler disassembler = X86Disassembler.create();
               disassembler.setMode(Platform.getNativePlatform().getCPU() == Platform.CPU.I386 ? X86Disassembler.Mode.I386 : X86Disassembler.Mode.X86_64);
               disassembler.setSyntax(X86Disassembler.Syntax.INTEL);
               disassembler.setInputBuffer(MemoryUtil.newPointer(this.runtime, fn), asm.offset());

               while (disassembler.disassemble()) {
                  dbg.printf("%8x: %s\n", disassembler.offset(), disassembler.insn());
               }

               if (buf.remaining() > asm.offset()) {
                  dbg.printf("%8x: <indirect call trampolines>\n", asm.offset());
               }

               dbg.println();
            }

            methods.add(new NativeMethod(fn, stub.name, stub.signature));
            fn += asm.codeSize();
         }

         pm.protectPages(code, (int)var20, 5);
         NativeMethods.register(clazz, methods);
         AbstractX86StubCompiler.StaticDataHolder.PAGES.put(clazz, page);
      }
   }

   public final Runtime getRuntime() {
      return this.runtime;
   }

   // $VF: Compiled from AbstractX86StubCompiler.java
   static final class PageHolder {
      final PageManager pm;
      final long pageCount;
      volatile int disposed;
      final long memory;

      // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      @Override
      protected void finalize() throws Throwable {
         boolean var5 = false /* VF: Semaphore variable */;

         label43: {
            try {
               var5 = true;
               int t = AbstractX86StubCompiler.PAGE_HOLDER_UPDATER.getAndSet(this, 1);
               if (t == 0) {
                  this.pm.freePages(this.memory, (int)this.pageCount);
                  var5 = false;
               } else {
                  var5 = false;
               }
               break label43;
            } catch (Throwable var6) {
               Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Exception when freeing native pages: %s", var6.getLocalizedMessage());
               var5 = false;
            } finally {
               if (var5) {
                  super.finalize();
               }
            }

            super.finalize();
            return;
         }

         super.finalize();
      }

      public PageHolder(PageManager pageCount, long memory, long pm) {
         this.pm = pm;
         this.memory = memory;
         this.pageCount = pageCount;
      }
   }

   // $VF: Compiled from AbstractX86StubCompiler.java
   private static final class StaticDataHolder {
      static final Map<Class, AbstractX86StubCompiler.PageHolder> PAGES = Collections.synchronizedMap(new WeakHashMap<>());
   }

   // $VF: Compiled from AbstractX86StubCompiler.java
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
