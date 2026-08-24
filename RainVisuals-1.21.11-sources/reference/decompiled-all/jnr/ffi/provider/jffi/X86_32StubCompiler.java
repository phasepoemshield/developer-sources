package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.ffi.CallingConvention;
import jnr.ffi.NativeType;
import jnr.ffi.Runtime;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.x86asm.Asm;
import jnr.x86asm.Assembler;
import jnr.x86asm.Mem;
import jnr.x86asm.Register;

// $VF: Compiled from X86_32StubCompiler.java
final class X86_32StubCompiler extends AbstractX86StubCompiler {
   X86_32StubCompiler(Runtime runtime) {
      super(runtime);
   }

   static Mem ptr(Register nativeType, long disp, NativeType base) {
      switch (nativeType) {
         case SCHAR:
         case UCHAR:
            return Asm.byte_ptr(base, disp);
         case SSHORT:
         case USHORT:
            return Asm.word_ptr(base, disp);
         default:
            return Asm.dword_ptr(base, disp);
      }
   }

   static int resultSize(ResultType resultType) {
      switch (resultType.getNativeType()) {
         case VOID:
            return 0;
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SINT:
         case UINT:
         case SLONG:
         case ULONG:
         case ADDRESS:
            return 4;
         case SLONGLONG:
         case ULONGLONG:
            return 8;
         case FLOAT:
         case DOUBLE:
            return 16;
         default:
            throw new IllegalArgumentException("invalid return type " + resultType);
      }
   }

   @Override
   void compile(
      Function name,
      String saveErrno,
      ResultType resultClass,
      ParameterType[] parameterClasses,
      Class convention,
      Class[] resultType,
      CallingConvention parameterTypes,
      boolean function
   ) {
      int psize = 0;

      for (ParameterType t : parameterTypes) {
         psize += parameterSize(t);
      }

      int rsize = resultSize(resultType);
      int stackadj = align(Math.max(psize, rsize) + 4, 16) - 4;
      Assembler a = new Assembler(Asm.X86_32);
      a.sub(Asm.esp, Asm.imm(stackadj));
      int i = 0;
      int srcoff = 0;
      int dstoff = 0;

      while (i < parameterTypes.length) {
         int srcParameterSize = parameterSize(parameterClasses[i]);
         int dstParameterSize = parameterSize(parameterTypes[i]);
         int disp = stackadj + 4 + 8 + srcoff;
         switch (parameterTypes[i].getNativeType()) {
            case SCHAR:
            case SSHORT:
               a.movsx(Asm.eax, ptr(Asm.esp, disp, parameterTypes[i].getNativeType()));
               break;
            case UCHAR:
            case USHORT:
               a.movzx(Asm.eax, ptr(Asm.esp, disp, parameterTypes[i].getNativeType()));
               break;
            default:
               a.mov(Asm.eax, Asm.dword_ptr(Asm.esp, disp));
         }

         a.mov(Asm.dword_ptr(Asm.esp, dstoff), Asm.eax);
         if (dstParameterSize > 4) {
            if (parameterTypes[i].getNativeType() == NativeType.SLONGLONG && long.class != parameterClasses[i]) {
               a.sar(Asm.eax, Asm.imm(31L));
            } else if (parameterTypes[i].getNativeType() == NativeType.ULONGLONG && long.class != parameterClasses[i]) {
               a.mov(Asm.dword_ptr(Asm.esp, dstoff + 4), Asm.imm(0L));
            } else {
               a.mov(Asm.eax, Asm.dword_ptr(Asm.esp, disp + 4));
            }

            a.mov(Asm.dword_ptr(Asm.esp, dstoff + 4), Asm.eax);
         }

         dstoff += dstParameterSize;
         srcoff += srcParameterSize;
         i++;
      }

      a.call(Asm.imm(function.getFunctionAddress() & 4294967295L));
      if (saveErrno) {
         i = 0;
         switch (resultType.getNativeType()) {
            case VOID:
               break;
            case SCHAR:
            case UCHAR:
            case SSHORT:
            case USHORT:
            case SINT:
            case UINT:
            case SLONG:
            case ULONG:
            default:
               a.mov(Asm.dword_ptr(Asm.esp, i), Asm.eax);
               break;
            case SLONGLONG:
            case ULONGLONG:
               a.mov(Asm.dword_ptr(Asm.esp, i), Asm.eax);
               a.mov(Asm.dword_ptr(Asm.esp, i + 4), Asm.edx);
               break;
            case FLOAT:
               a.fstp(Asm.dword_ptr(Asm.esp, i));
               break;
            case DOUBLE:
               a.fstp(Asm.qword_ptr(Asm.esp, i));
         }

         a.call(Asm.imm(errnoFunctionAddress & 4294967295L));
         switch (resultType.getNativeType()) {
            case VOID:
               break;
            case SCHAR:
               a.movsx(Asm.eax, Asm.byte_ptr(Asm.esp, i));
               break;
            case UCHAR:
               a.movzx(Asm.eax, Asm.byte_ptr(Asm.esp, i));
               break;
            case SSHORT:
               a.movsx(Asm.eax, Asm.word_ptr(Asm.esp, i));
               break;
            case USHORT:
               a.movzx(Asm.eax, Asm.word_ptr(Asm.esp, i));
               break;
            case SINT:
            case UINT:
            case SLONG:
            case ULONG:
            default:
               a.mov(Asm.eax, Asm.dword_ptr(Asm.esp, i));
               break;
            case SLONGLONG:
            case ULONGLONG:
               a.mov(Asm.eax, Asm.dword_ptr(Asm.esp, i));
               a.mov(Asm.edx, Asm.dword_ptr(Asm.esp, i + 4));
               break;
            case FLOAT:
               a.fld(Asm.dword_ptr(Asm.esp, i));
               break;
            case DOUBLE:
               a.fld(Asm.qword_ptr(Asm.esp, i));
         }
      } else {
         switch (resultType.getNativeType()) {
            case SCHAR:
               a.movsx(Asm.eax, Asm.al);
               break;
            case UCHAR:
               a.movzx(Asm.eax, Asm.al);
               break;
            case SSHORT:
               a.movsx(Asm.eax, Asm.ax);
               break;
            case USHORT:
               a.movzx(Asm.eax, Asm.ax);
         }
      }

      if (long.class == resultClass) {
         switch (resultType.getNativeType()) {
            case SCHAR:
            case SSHORT:
            case SINT:
            case SLONG:
               a.mov(Asm.edx, Asm.eax);
               a.sar(Asm.edx, Asm.imm(31L));
               break;
            case UCHAR:
            case USHORT:
            case UINT:
            case ULONG:
            case ADDRESS:
               a.mov(Asm.edx, Asm.imm(0L));
            case SLONGLONG:
            case ULONGLONG:
            case FLOAT:
            case DOUBLE:
         }
      }

      a.add(Asm.esp, Asm.imm(stackadj));
      a.ret();
      this.stubs.add(new AbstractX86StubCompiler.Stub(name, CodegenUtils.sig(resultClass, parameterClasses), a));
   }

   static int parameterSize(ParameterType parameterType) {
      switch (parameterType.getNativeType()) {
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SINT:
         case UINT:
         case SLONG:
         case ULONG:
         case FLOAT:
         case ADDRESS:
            return 4;
         case SLONGLONG:
         case ULONGLONG:
         case DOUBLE:
            return 8;
         default:
            throw new IllegalArgumentException("invalid parameter type" + parameterType);
      }
   }

   static int parameterSize(Class t) {
      if (byte.class == t || short.class == t || char.class == t | int.class == t || float.class == t) {
         return 4;
      } else if (long.class != t && double.class != t) {
         throw new IllegalArgumentException("invalid parameter type" + t);
      } else {
         return 8;
      }
   }

   @Override
   boolean canCompile(ResultType returnType, ParameterType[] parameterTypes, CallingConvention convention) {
      switch (returnType.getNativeType()) {
         case VOID:
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SINT:
         case UINT:
         case SLONG:
         case ULONG:
         case SLONGLONG:
         case ULONGLONG:
         case FLOAT:
         case DOUBLE:
         case ADDRESS:
            if (convention != CallingConvention.DEFAULT) {
               return false;
            } else {
               int fCount = 0;
               int iCount = 0;

               for (ParameterType t : parameterTypes) {
                  switch (t.getNativeType()) {
                     case SCHAR:
                     case UCHAR:
                     case SSHORT:
                     case USHORT:
                     case SINT:
                     case UINT:
                     case SLONG:
                     case ULONG:
                     case SLONGLONG:
                     case ULONGLONG:
                     case ADDRESS:
                        iCount++;
                        break;
                     case FLOAT:
                     case DOUBLE:
                        fCount++;
                        break;
                     default:
                        return false;
                  }
               }

               return true;
            }
         default:
            return false;
      }
   }
}
