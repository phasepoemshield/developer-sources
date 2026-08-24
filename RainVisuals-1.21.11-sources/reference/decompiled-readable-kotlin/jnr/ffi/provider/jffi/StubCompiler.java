package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import com.kenai.jffi.Internals;
import com.kenai.jffi.PageManager;
import com.kenai.jffi.Platform;
import jnr.a64asm.Assembler_A64;
import jnr.a64asm.CPU_A64;
import jnr.ffi.CallingConvention;
import jnr.ffi.Runtime;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.x86asm.Assembler;
import jnr.x86asm.CPU;

// $VF: Compiled from StubCompiler.java
abstract class StubCompiler {
   static final boolean hasAssembler = hasAssembler();
   static final long errnoFunctionAddress = getErrnoSaveFunction();
   static final boolean hasPageManager = hasPageManager();

   abstract void attach(Class var1);

   abstract void compile(Function var1, String var2, ResultType var3, ParameterType[] var4, Class var5, Class[] var6, CallingConvention var7, boolean var8);

   private static boolean hasAssembler() {
      try {
         switch (Platform.getPlatform().getCPU()) {
            case I386:
               new Assembler(CPU.X86_32);
               return true;
            case X86_64:
               new Assembler(CPU.X86_64);
               return true;
            case AARCH64:
               new Assembler_A64(CPU_A64.A64);
               return true;
            default:
               return false;
         }
      } catch (Throwable t) {
         return false;
      }
   }

   private static long getErrnoSaveFunction() {
      try {
         return Internals.getErrnoSaveFunction();
      } catch (Throwable t) {
         return 0L;
      }
   }

   abstract boolean canCompile(ResultType var1, ParameterType[] var2, CallingConvention var3);

   public static StubCompiler newCompiler(Runtime runtime) {
      if (errnoFunctionAddress != 0L && hasPageManager && hasAssembler) {
         switch (Platform.getPlatform().getCPU()) {
            case I386:
               if (Platform.getPlatform().getOS() != Platform.OS.WINDOWS) {
                  return new X86_32StubCompiler(runtime);
               }
               break;
            case X86_64:
               if (Platform.getPlatform().getOS() != Platform.OS.WINDOWS) {
                  return new X86_64StubCompiler(runtime);
               }
               break;
            case AARCH64:
               if (Platform.getPlatform().getOS() != Platform.OS.WINDOWS) {
                  return new ARM_64StubCompiler(runtime);
               }
         }
      }

      return new StubCompiler.DummyStubCompiler();
   }

   private static boolean hasPageManager() {
      try {
         long t = PageManager.getInstance().allocatePages(1, 3);
         PageManager.getInstance().freePages(t, 1);
         return true;
      } catch (Throwable var2) {
         return false;
      }
   }

   // $VF: Compiled from StubCompiler.java
   static final class DummyStubCompiler extends StubCompiler {
      @Override
      void attach(Class clazz) {
      }

      @Override
      void compile(
         Function convention,
         String resultClass,
         ResultType returnType,
         ParameterType[] name,
         Class saveErrno,
         Class[] parameterClasses,
         CallingConvention function,
         boolean parameterTypes
      ) {
         throw new UnsupportedOperationException("Not supported yet.");
      }

      @Override
      boolean canCompile(ResultType returnType, ParameterType[] parameterTypes, CallingConvention convention) {
         return false;
      }
   }
}
