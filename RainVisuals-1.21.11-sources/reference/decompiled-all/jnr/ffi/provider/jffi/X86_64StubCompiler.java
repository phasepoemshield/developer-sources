package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.ffi.CallingConvention;
import jnr.ffi.Runtime;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.x86asm.Asm;
import jnr.x86asm.Assembler;
import jnr.x86asm.Register;

// $VF: Compiled from X86_64StubCompiler.java
final class X86_64StubCompiler extends AbstractX86StubCompiler {
   static final Register[] dstRegisters32 = new Register[]{Asm.edi, Asm.esi, Asm.edx, Asm.ecx, Register.gpr(40), Register.gpr(41)};
   static final Register[] srcRegisters32 = new Register[]{Asm.edx, Asm.ecx, Register.gpr(40), Register.gpr(41)};
   static final Register[] srcRegisters8 = new Register[]{Asm.dl, Asm.cl, Asm.r8b, Asm.r9b};
   static final Register[] dstRegisters64 = new Register[]{Asm.rdi, Asm.rsi, Asm.rdx, Asm.rcx, Asm.r8, Asm.r9};
   static final Register[] srcRegisters64 = new Register[]{Asm.rdx, Asm.rcx, Asm.r8, Asm.r9};
   static final Register[] srcRegisters16 = new Register[]{Asm.dx, Asm.cx, Asm.r8w, Asm.r9w};

   @Override
   boolean canCompile(ResultType returnType, ParameterType[] convention, CallingConvention parameterTypes) {
      if (convention != CallingConvention.DEFAULT) {
         return false;
      }

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

            return iCount <= 6 && fCount <= 8;
         default:
            return false;
      }
   }

   X86_64StubCompiler(Runtime runtime) {
      super(runtime);
   }

   static int iCount(ParameterType[] parameterTypes) {
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
            case FLOAT:
            case DOUBLE:
         }
      }

      return iCount;
   }

   static int fCount(ParameterType[] parameterTypes) {
      int fCount = 0;

      for (ParameterType t : parameterTypes) {
         switch (t.getNativeType()) {
            case FLOAT:
            case DOUBLE:
               fCount++;
         }
      }

      return fCount;
   }

   @Override
   final void compile(
      Function saveErrno,
      String parameterClasses,
      ResultType resultType,
      ParameterType[] function,
      Class convention,
      Class[] resultClass,
      CallingConvention name,
      boolean parameterTypes
   ) {
      Assembler a = new Assembler(Asm.X86_64);
      int iCount = iCount(parameterTypes);
      int fCount = fCount(parameterTypes);
      boolean canJumpToTarget = !saveErrno & iCount <= 6 & fCount <= 8;
      switch (resultType.getNativeType()) {
         case VOID:
            break;
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SLONG:
         case ULONG:
         default:
            canJumpToTarget = false;
            break;
         case SINT:
         case UINT:
            canJumpToTarget &= int.class == resultClass;
            break;
         case SLONGLONG:
         case ULONGLONG:
            canJumpToTarget &= long.class == resultClass;
            break;
         case FLOAT:
            canJumpToTarget &= float.class == resultClass;
            break;
         case DOUBLE:
            canJumpToTarget &= double.class == resultClass;
      }

      for (int i = 0; i < Math.min(iCount, 4); i++) {
         switch (parameterTypes[i].getNativeType()) {
            case SCHAR:
               a.movsx(dstRegisters64[i], srcRegisters8[i]);
               break;
            case UCHAR:
               a.movzx(dstRegisters64[i], srcRegisters8[i]);
               break;
            case SSHORT:
               a.movsx(dstRegisters64[i], srcRegisters16[i]);
               break;
            case USHORT:
               a.movzx(dstRegisters64[i], srcRegisters16[i]);
               break;
            case SINT:
               a.movsxd(dstRegisters64[i], srcRegisters32[i]);
               break;
            case UINT:
               a.mov(dstRegisters32[i], srcRegisters32[i]);
               break;
            default:
               a.mov(dstRegisters64[i], srcRegisters64[i]);
         }
      }

      if (iCount > 6) {
         throw new IllegalArgumentException("integer argument count > 6");
      }

      for (int i = 4; i < iCount; i++) {
         int disp = 8 + (4 - i) * 8;
         switch (parameterTypes[i].getNativeType()) {
            case SCHAR:
               a.movsx(dstRegisters64[i], Asm.byte_ptr(Asm.rsp, disp));
               break;
            case UCHAR:
               a.movzx(dstRegisters64[i], Asm.byte_ptr(Asm.rsp, disp));
               break;
            case SSHORT:
               a.movsx(dstRegisters64[i], Asm.word_ptr(Asm.rsp, disp));
               break;
            case USHORT:
               a.movzx(dstRegisters64[i], Asm.word_ptr(Asm.rsp, disp));
               break;
            case SINT:
               a.movsxd(dstRegisters64[i], Asm.dword_ptr(Asm.rsp, disp));
               break;
            case UINT:
               a.mov(dstRegisters32[i], Asm.dword_ptr(Asm.rsp, disp));
               break;
            default:
               a.mov(dstRegisters64[i], Asm.qword_ptr(Asm.rsp, disp));
         }
      }

      if (fCount > 8) {
         throw new IllegalArgumentException("float argument count > 8");
      }

      if (canJumpToTarget) {
         a.jmp(Asm.imm(function.getFunctionAddress()));
         this.stubs.add(new AbstractX86StubCompiler.Stub(name, CodegenUtils.sig(resultClass, parameterClasses), a));
      } else {
         int space = resultClass != float.class && resultClass != double.class ? 8 : 24;
         a.sub(Asm.rsp, Asm.imm(space));
         a.mov(Asm.rax, Asm.imm(0L));
         a.call(Asm.imm(function.getFunctionAddress()));
         if (saveErrno) {
            switch (resultType.getNativeType()) {
               case VOID:
                  break;
               case FLOAT:
                  a.movss(Asm.dword_ptr(Asm.rsp, 0L), Asm.xmm0);
                  break;
               case DOUBLE:
                  a.movsd(Asm.qword_ptr(Asm.rsp, 0L), Asm.xmm0);
                  break;
               default:
                  a.mov(Asm.qword_ptr(Asm.rsp, 0L), Asm.rax);
            }

            a.call(Asm.imm(errnoFunctionAddress));
            switch (resultType.getNativeType()) {
               case VOID:
                  break;
               case SCHAR:
                  a.movsx(Asm.rax, Asm.byte_ptr(Asm.rsp, 0L));
                  break;
               case UCHAR:
                  a.movzx(Asm.rax, Asm.byte_ptr(Asm.rsp, 0L));
                  break;
               case SSHORT:
                  a.movsx(Asm.rax, Asm.word_ptr(Asm.rsp, 0L));
                  break;
               case USHORT:
                  a.movzx(Asm.rax, Asm.word_ptr(Asm.rsp, 0L));
                  break;
               case SINT:
                  a.movsxd(Asm.rax, Asm.dword_ptr(Asm.rsp, 0L));
                  break;
               case UINT:
                  a.mov(Asm.eax, Asm.dword_ptr(Asm.rsp, 0L));
                  break;
               case SLONG:
               case ULONG:
               case SLONGLONG:
               case ULONGLONG:
               default:
                  a.mov(Asm.rax, Asm.qword_ptr(Asm.rsp, 0L));
                  break;
               case FLOAT:
                  a.movss(Asm.xmm0, Asm.dword_ptr(Asm.rsp, 0L));
                  break;
               case DOUBLE:
                  a.movsd(Asm.xmm0, Asm.qword_ptr(Asm.rsp, 0L));
            }
         } else {
            switch (resultType.getNativeType()) {
               case SCHAR:
                  a.movsx(Asm.rax, Asm.al);
                  break;
               case UCHAR:
                  a.movzx(Asm.rax, Asm.al);
                  break;
               case SSHORT:
                  a.movsx(Asm.rax, Asm.ax);
                  break;
               case USHORT:
                  a.movzx(Asm.rax, Asm.ax);
                  break;
               case SINT:
                  if (long.class == resultClass) {
                     a.movsxd(Asm.rax, Asm.eax);
                  }
                  break;
               case UINT:
                  if (long.class == resultClass) {
                     a.mov(Asm.eax, Asm.eax);
                  }
            }
         }

         a.add(Asm.rsp, Asm.imm(space));
         a.ret();
         this.stubs.add(new AbstractX86StubCompiler.Stub(name, CodegenUtils.sig(resultClass, parameterClasses), a));
      }
   }
}
