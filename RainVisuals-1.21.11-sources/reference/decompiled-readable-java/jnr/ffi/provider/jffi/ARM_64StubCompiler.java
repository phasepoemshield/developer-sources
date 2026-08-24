/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.a64asm.Assembler_A64;
import jnr.a64asm.CPU_A64;
import jnr.a64asm.Immediate;
import jnr.a64asm.Offset;
import jnr.a64asm.Post_index;
import jnr.a64asm.Pre_index;
import jnr.a64asm.Register;
import jnr.a64asm.Shift;
import jnr.ffi.CallingConvention;
import jnr.ffi.Runtime;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.jffi.AbstractA64StubCompiler;
import jnr.ffi.provider.jffi.CodegenUtils;

final class ARM_64StubCompiler
extends AbstractA64StubCompiler {
    static final Register[] srcRegisters32;
    static final Register[] srcRegisters64;
    static final Register[] dstRegisters64;
    static final Register[] dstRegisters32;

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

    @Override
    final void compile(Function function, String name, ResultType resultType, ParameterType[] parameterTypes, Class resultClass, Class[] parameterClasses, CallingConvention convention, boolean saveErrno) {
        Shift sh;
        int count;
        Assembler_A64 a2 = new Assembler_A64(CPU_A64.A64);
        int iCount = ARM_64StubCompiler.iCount(parameterTypes);
        int fCount = ARM_64StubCompiler.fCount(parameterTypes);
        Pre_index pindex = new Pre_index(Register.gpb(31), Immediate.imm(-32L));
        a2.stp(Register.gpb(29), Register.gpb(30), pindex);
        a2.mov(Register.gpb(29), Register.gpb(31));
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
        block35: for (int i = 0; i < Math.min(iCount, 6); ++i) {
            switch (parameterTypes[i].getNativeType()) {
                case SCHAR: {
                    a2.sxtb(srcRegisters64[i], srcRegisters32[i]);
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                    continue block35;
                }
                case UCHAR: {
                    a2.uxtb(srcRegisters64[i], srcRegisters32[i]);
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                    continue block35;
                }
                case SSHORT: {
                    a2.sxth(srcRegisters64[i], srcRegisters32[i]);
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                    continue block35;
                }
                case USHORT: {
                    a2.uxth(srcRegisters64[i], srcRegisters32[i]);
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                    continue block35;
                }
                case SINT: {
                    a2.sxtw(srcRegisters64[i], srcRegisters32[i]);
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                    continue block35;
                }
                case UINT: {
                    a2.uxtw(srcRegisters64[i], srcRegisters32[i]);
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                    continue block35;
                }
                default: {
                    a2.mov(dstRegisters64[i], srcRegisters64[i]);
                }
            }
        }
        if (iCount > 6) {
            throw new IllegalArgumentException("integer argument count > 6");
        }
        if (fCount > 8) {
            throw new IllegalArgumentException("float argument count > 8");
        }
        Offset offset = new Offset(Register.gpb(29), Immediate.imm(16L));
        long function_addr = function.getFunctionAddress();
        short funn_addr_chunks = (short)(function_addr & 0xFFFFL);
        a2.mov(Register.gpb(9), Immediate.imm(funn_addr_chunks));
        for (count = 1; count < 4; ++count) {
            sh = new Shift(1, 16 * count);
            funn_addr_chunks = (short)(function_addr >> 16 * count & 0xFFFFL);
            a2.movk(Register.gpb(9), Immediate.imm(funn_addr_chunks), sh);
        }
        a2.blr(Register.gpb(9));
        if (saveErrno) {
            switch (resultType.getNativeType()) {
                case VOID: {
                    break;
                }
                default: {
                    a2.str(dstRegisters64[0], offset);
                }
            }
            function_addr = errnoFunctionAddress;
            funn_addr_chunks = (short)(function_addr & 0xFFFFL);
            a2.mov(Register.gpb(9), Immediate.imm(funn_addr_chunks));
            for (count = 1; count < 4; ++count) {
                sh = new Shift(1, 16 * count);
                funn_addr_chunks = (short)(function_addr >> 16 * count & 0xFFFFL);
                a2.movk(Register.gpb(9), Immediate.imm(funn_addr_chunks), sh);
            }
            a2.blr(Register.gpb(9));
            switch (resultType.getNativeType()) {
                case VOID: {
                    break;
                }
                case SCHAR: {
                    a2.ldrsb(dstRegisters64[0], offset);
                    break;
                }
                case UCHAR: {
                    a2.ldrb(dstRegisters64[0], offset);
                    break;
                }
                case SSHORT: {
                    a2.ldrsh(dstRegisters64[0], offset);
                    break;
                }
                case USHORT: {
                    a2.ldrh(dstRegisters64[0], offset);
                    break;
                }
                case SINT: {
                    a2.ldrsw(dstRegisters64[0], offset);
                    break;
                }
                case UINT: {
                    a2.ldr(dstRegisters64[0], offset);
                    break;
                }
                default: {
                    a2.ldr(dstRegisters64[0], offset);
                    break;
                }
            }
        } else {
            switch (resultType.getNativeType()) {
                case SCHAR: {
                    a2.sxtb(dstRegisters64[0], dstRegisters32[0]);
                    break;
                }
                case UCHAR: {
                    a2.uxtb(dstRegisters64[0], dstRegisters32[0]);
                    break;
                }
                case SSHORT: {
                    a2.sxth(dstRegisters64[0], dstRegisters32[0]);
                    break;
                }
                case USHORT: {
                    a2.uxth(dstRegisters64[0], dstRegisters32[0]);
                    break;
                }
                case SINT: {
                    a2.sxtw(dstRegisters64[0], dstRegisters32[0]);
                    break;
                }
                case UINT: {
                    a2.uxtw(dstRegisters64[0], dstRegisters32[0]);
                }
            }
        }
        Post_index posindex = new Post_index(Register.gpb(31), Immediate.imm(32L));
        a2.ldp(Register.gpb(29), Register.gpb(30), posindex);
        a2.ret(null);
        this.stubs_A64.add(new AbstractA64StubCompiler.Stub(name, CodegenUtils.sig(resultClass, parameterClasses), a2));
    }

    ARM_64StubCompiler(Runtime runtime) {
        super(runtime);
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

    static {
        Register[] registerArray = new Register[6];
        registerArray[0] = Register.gpw(2);
        registerArray[1] = Register.gpw(3);
        registerArray[2] = Register.gpw(4);
        registerArray[3] = Register.gpw(5);
        registerArray[4] = Register.gpw(6);
        registerArray[5] = Register.gpw(7);
        srcRegisters32 = registerArray;
        Register[] registerArray2 = new Register[6];
        registerArray2[0] = Register.gpb(2);
        registerArray2[1] = Register.gpb(3);
        registerArray2[2] = Register.gpb(4);
        registerArray2[3] = Register.gpb(5);
        registerArray2[4] = Register.gpb(6);
        registerArray2[5] = Register.gpb(7);
        srcRegisters64 = registerArray2;
        Register[] registerArray3 = new Register[8];
        registerArray3[0] = Register.gpw(0);
        registerArray3[1] = Register.gpw(1);
        registerArray3[2] = Register.gpw(2);
        registerArray3[3] = Register.gpw(3);
        registerArray3[4] = Register.gpw(4);
        registerArray3[5] = Register.gpw(5);
        registerArray3[6] = Register.gpw(6);
        registerArray3[7] = Register.gpw(7);
        dstRegisters32 = registerArray3;
        Register[] registerArray4 = new Register[8];
        registerArray4[0] = Register.gpb(0);
        registerArray4[1] = Register.gpb(1);
        registerArray4[2] = Register.gpb(2);
        registerArray4[3] = Register.gpb(3);
        registerArray4[4] = Register.gpb(4);
        registerArray4[5] = Register.gpb(5);
        registerArray4[6] = Register.gpb(6);
        registerArray4[7] = Register.gpb(7);
        dstRegisters64 = registerArray4;
    }
}

