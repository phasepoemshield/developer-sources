/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.ffi.CallingConvention;
import jnr.ffi.Runtime;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.jffi.AbstractX86StubCompiler;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.x86asm.Asm;
import jnr.x86asm.Assembler;
import jnr.x86asm.Register;

final class X86_64StubCompiler
extends AbstractX86StubCompiler {
    static final Register[] dstRegisters32;
    static final Register[] srcRegisters32;
    static final Register[] srcRegisters8;
    static final Register[] dstRegisters64;
    static final Register[] srcRegisters64;
    static final Register[] srcRegisters16;

    static {
        Register[] registerArray = new Register[4];
        registerArray[0] = Asm.dl;
        registerArray[1] = Asm.cl;
        registerArray[2] = Asm.r8b;
        registerArray[3] = Asm.r9b;
        srcRegisters8 = registerArray;
        Register[] registerArray2 = new Register[4];
        registerArray2[0] = Asm.dx;
        registerArray2[1] = Asm.cx;
        registerArray2[2] = Asm.r8w;
        registerArray2[3] = Asm.r9w;
        srcRegisters16 = registerArray2;
        Register[] registerArray3 = new Register[4];
        registerArray3[0] = Asm.edx;
        registerArray3[1] = Asm.ecx;
        registerArray3[2] = Register.gpr(40);
        registerArray3[3] = Register.gpr(41);
        srcRegisters32 = registerArray3;
        Register[] registerArray4 = new Register[4];
        registerArray4[0] = Asm.rdx;
        registerArray4[1] = Asm.rcx;
        registerArray4[2] = Asm.r8;
        registerArray4[3] = Asm.r9;
        srcRegisters64 = registerArray4;
        Register[] registerArray5 = new Register[6];
        registerArray5[0] = Asm.edi;
        registerArray5[1] = Asm.esi;
        registerArray5[2] = Asm.edx;
        registerArray5[3] = Asm.ecx;
        registerArray5[4] = Register.gpr(40);
        registerArray5[5] = Register.gpr(41);
        dstRegisters32 = registerArray5;
        Register[] registerArray6 = new Register[6];
        registerArray6[0] = Asm.rdi;
        registerArray6[1] = Asm.rsi;
        registerArray6[2] = Asm.rdx;
        registerArray6[3] = Asm.rcx;
        registerArray6[4] = Asm.r8;
        registerArray6[5] = Asm.r9;
        dstRegisters64 = registerArray6;
    }

    @Override
    boolean canCompile(ResultType returnType, ParameterType[] parameterTypes, CallingConvention convention) {
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
            case ADDRESS: {
                break;
            }
            default: {
                return false;
            }
        }
        int fCount = 0;
        int iCount = 0;
        block7: for (ParameterType t : parameterTypes) {
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
                case ADDRESS: {
                    ++iCount;
                    continue block7;
                }
                case FLOAT: 
                case DOUBLE: {
                    ++fCount;
                    continue block7;
                }
                default: {
                    return false;
                }
            }
        }
        return iCount <= 6 && fCount <= 8;
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
                case ADDRESS: {
                    ++iCount;
                }
            }
        }
        return iCount;
    }

    static int fCount(ParameterType[] parameterTypes) {
        int fCount = 0;
        for (ParameterType t : parameterTypes) {
            switch (t.getNativeType()) {
                case FLOAT: 
                case DOUBLE: {
                    ++fCount;
                }
            }
        }
        return fCount;
    }

    @Override
    final void compile(Function function, String name, ResultType resultType, ParameterType[] parameterTypes, Class resultClass, Class[] parameterClasses, CallingConvention convention, boolean saveErrno) {
        int i;
        Assembler a2 = new Assembler(Asm.X86_64);
        int iCount = X86_64StubCompiler.iCount(parameterTypes);
        int fCount = X86_64StubCompiler.fCount(parameterTypes);
        boolean canJumpToTarget = !saveErrno & iCount <= 6 & fCount <= 8;
        switch (resultType.getNativeType()) {
            case SINT: 
            case UINT: {
                canJumpToTarget &= Integer.TYPE == resultClass;
                break;
            }
            case SLONGLONG: 
            case ULONGLONG: {
                canJumpToTarget &= Long.TYPE == resultClass;
                break;
            }
            case FLOAT: {
                canJumpToTarget &= Float.TYPE == resultClass;
                break;
            }
            case DOUBLE: {
                canJumpToTarget &= Double.TYPE == resultClass;
                break;
            }
            case VOID: {
                break;
            }
            default: {
                canJumpToTarget = false;
            }
        }
        block47: for (i = 0; i < Math.min(iCount, 4); ++i) {
            switch (parameterTypes[i].getNativeType()) {
                case SCHAR: {
                    a2.movsx(dstRegisters64[i], srcRegisters8[i]);
                    continue block47;
                }
                case UCHAR: {
                    a2.movzx(dstRegisters64[i], srcRegisters8[i]);
                    continue block47;
                }
                case SSHORT: {
                    a2.movsx(dstRegisters64[i], srcRegisters16[i]);
                    continue block47;
                }
                case USHORT: {
                    a2.movzx(dstRegisters64[i], srcRegisters16[i]);
                    continue block47;
                }
                case SINT: {
                    a2.movsxd(dstRegisters64[i], srcRegisters32[i]);
                    continue block47;
                }
                case UINT: {
                    a2.mov(dstRegisters32[i], srcRegisters32[i]);
                    continue block47;
                }
                default: {
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                }
            }
        }
        if (iCount > 6) {
            throw new IllegalArgumentException("integer argument count > 6");
        }
        block48: for (i = 4; i < iCount; ++i) {
            int disp = 8 + (4 - i) * 8;
            switch (parameterTypes[i].getNativeType()) {
                case SCHAR: {
                    a2.movsx(dstRegisters64[i], Asm.byte_ptr(Asm.rsp, (long)disp));
                    continue block48;
                }
                case UCHAR: {
                    a2.movzx(dstRegisters64[i], Asm.byte_ptr(Asm.rsp, (long)disp));
                    continue block48;
                }
                case SSHORT: {
                    a2.movsx(dstRegisters64[i], Asm.word_ptr(Asm.rsp, (long)disp));
                    continue block48;
                }
                case USHORT: {
                    a2.movzx(dstRegisters64[i], Asm.word_ptr(Asm.rsp, (long)disp));
                    continue block48;
                }
                case SINT: {
                    a2.movsxd(dstRegisters64[i], Asm.dword_ptr(Asm.rsp, (long)disp));
                    continue block48;
                }
                case UINT: {
                    a2.mov(dstRegisters32[i], Asm.dword_ptr(Asm.rsp, (long)disp));
                    continue block48;
                }
                default: {
                    a2.mov(dstRegisters64[i], Asm.qword_ptr(Asm.rsp, (long)disp));
                }
            }
        }
        if (fCount > 8) {
            throw new IllegalArgumentException("float argument count > 8");
        }
        if (canJumpToTarget) {
            a2.jmp(Asm.imm(function.getFunctionAddress()));
            this.stubs.add(new AbstractX86StubCompiler.Stub(name, CodegenUtils.sig(resultClass, parameterClasses), a2));
            return;
        }
        int space = resultClass == Float.TYPE || resultClass == Double.TYPE ? 24 : 8;
        a2.sub(Asm.rsp, Asm.imm(space));
        a2.mov(Asm.rax, Asm.imm(0L));
        a2.call(Asm.imm(function.getFunctionAddress()));
        if (saveErrno) {
            switch (resultType.getNativeType()) {
                case VOID: {
                    break;
                }
                case FLOAT: {
                    a2.movss(Asm.dword_ptr(Asm.rsp, 0L), Asm.xmm0);
                    break;
                }
                case DOUBLE: {
                    a2.movsd(Asm.qword_ptr(Asm.rsp, 0L), Asm.xmm0);
                    break;
                }
                default: {
                    a2.mov(Asm.qword_ptr(Asm.rsp, 0L), Asm.rax);
                }
            }
            a2.call(Asm.imm(errnoFunctionAddress));
            switch (resultType.getNativeType()) {
                case VOID: {
                    break;
                }
                case SCHAR: {
                    a2.movsx(Asm.rax, Asm.byte_ptr(Asm.rsp, 0L));
                    break;
                }
                case UCHAR: {
                    a2.movzx(Asm.rax, Asm.byte_ptr(Asm.rsp, 0L));
                    break;
                }
                case SSHORT: {
                    a2.movsx(Asm.rax, Asm.word_ptr(Asm.rsp, 0L));
                    break;
                }
                case USHORT: {
                    a2.movzx(Asm.rax, Asm.word_ptr(Asm.rsp, 0L));
                    break;
                }
                case SINT: {
                    a2.movsxd(Asm.rax, Asm.dword_ptr(Asm.rsp, 0L));
                    break;
                }
                case UINT: {
                    a2.mov(Asm.eax, Asm.dword_ptr(Asm.rsp, 0L));
                    break;
                }
                case FLOAT: {
                    a2.movss(Asm.xmm0, Asm.dword_ptr(Asm.rsp, 0L));
                    break;
                }
                case DOUBLE: {
                    a2.movsd(Asm.xmm0, Asm.qword_ptr(Asm.rsp, 0L));
                    break;
                }
                default: {
                    a2.mov(Asm.rax, Asm.qword_ptr(Asm.rsp, 0L));
                    break;
                }
            }
        } else {
            switch (resultType.getNativeType()) {
                case SCHAR: {
                    a2.movsx(Asm.rax, Asm.al);
                    break;
                }
                case UCHAR: {
                    a2.movzx(Asm.rax, Asm.al);
                    break;
                }
                case SSHORT: {
                    a2.movsx(Asm.rax, Asm.ax);
                    break;
                }
                case USHORT: {
                    a2.movzx(Asm.rax, Asm.ax);
                    break;
                }
                case SINT: {
                    if (Long.TYPE != resultClass) break;
                    a2.movsxd(Asm.rax, Asm.eax);
                    break;
                }
                case UINT: {
                    if (Long.TYPE != resultClass) break;
                    a2.mov(Asm.eax, Asm.eax);
                }
            }
        }
        a2.add(Asm.rsp, Asm.imm(space));
        a2.ret();
        this.stubs.add(new AbstractX86StubCompiler.Stub(name, CodegenUtils.sig(resultClass, parameterClasses), a2));
    }
}

