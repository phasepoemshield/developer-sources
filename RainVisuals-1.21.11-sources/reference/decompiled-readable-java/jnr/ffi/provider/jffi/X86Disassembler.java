/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import jnr.ffi.LibraryLoader;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.DefaultTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.jffi.AbstractAsmLibraryInterface;
import jnr.ffi.provider.jffi.NoTrace;
import jnr.ffi.provider.jffi.NoX86;
import jnr.ffi.types.intptr_t;
import jnr.ffi.types.size_t;
import jnr.ffi.types.u_int64_t;
import jnr.ffi.types.u_int8_t;

class X86Disassembler {
    final Pointer ud;
    private final UDis86 udis86;

    public void setInputBuffer(Pointer buffer, int size) {
        this.udis86.ud_set_input_buffer(this, buffer, size);
    }

    public String hex() {
        return this.udis86.ud_insn_hex(this);
    }

    public void setSyntax(Syntax syntax) {
        this.udis86.ud_set_syntax(this, syntax == Syntax.INTEL ? SingletonHolder.intel : SingletonHolder.att);
    }

    private X86Disassembler(UDis86 udis86) {
        this.udis86 = udis86;
        this.ud = Memory.allocateDirect(Runtime.getRuntime(udis86), 1024, true);
        this.udis86.ud_init(this.ud);
    }

    static UDis86 loadUDis86() {
        DefaultTypeMapper typeMapper = new DefaultTypeMapper();
        typeMapper.put(X86Disassembler.class, new X86DisassemblerConverter());
        return LibraryLoader.create(UDis86.class).library("udis86").search("/usr/local/lib").search("/opt/local/lib").search("/usr/lib").mapper(typeMapper).load();
    }

    public boolean disassemble() {
        return this.udis86.ud_disassemble(this) != 0;
    }

    static boolean isAvailable() {
        try {
            return SingletonHolder.INSTANCE != null;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public long offset() {
        return this.udis86.ud_insn_off(this);
    }

    public void setMode(Mode mode) {
        this.udis86.ud_set_mode(this, mode == Mode.I386 ? 32 : 64);
    }

    static X86Disassembler create() {
        return new X86Disassembler(SingletonHolder.INSTANCE);
    }

    public String insn() {
        return this.udis86.ud_insn_asm(this);
    }

    @ToNativeConverter.NoContext
    public static final class X86DisassemblerConverter
    implements ToNativeConverter<X86Disassembler, Pointer> {
        @Override
        public Pointer toNative(X86Disassembler value, ToNativeContext context) {
            return value.ud;
        }

        @Override
        public Class<Pointer> nativeType() {
            return Pointer.class;
        }
    }

    @NoX86
    @NoTrace
    public static interface UDis86 {
        public int ud_insn_len(X86Disassembler var1);

        public int ud_decode(X86Disassembler var1);

        public void ud_input_skip(X86Disassembler var1, @size_t long var2);

        public int ud_input_end(X86Disassembler var1);

        public String ud_insn_asm(X86Disassembler var1);

        public void ud_set_pc(X86Disassembler var1, @u_int64_t int var2);

        @u_int64_t
        public long ud_insn_off(X86Disassembler var1);

        public void ud_set_vendor(X86Disassembler var1, int var2);

        @intptr_t
        public long ud_insn_ptr(X86Disassembler var1);

        public void ud_init(Pointer var1);

        public void ud_set_mode(X86Disassembler var1, @u_int8_t int var2);

        public void ud_set_syntax(X86Disassembler var1, @intptr_t long var2);

        public String ud_insn_hex(X86Disassembler var1);

        public int ud_disassemble(X86Disassembler var1);

        public void ud_set_input_buffer(X86Disassembler var1, Pointer var2, @size_t long var3);
    }

    public static final class Mode
    extends Enum<Mode> {
        private static final /* synthetic */ Mode[] $VALUES;
        public static final /* enum */ Mode I386 = new Mode();
        public static final /* enum */ Mode X86_64 = new Mode();

        static {
            $VALUES = Mode.$values();
        }

        private static /* synthetic */ Mode[] $values() {
            Mode[] modeArray = new Mode[2];
            modeArray[0] = I386;
            modeArray[1] = X86_64;
            return modeArray;
        }

        public static Mode valueOf(String name) {
            return Enum.valueOf(Mode.class, name);
        }

        public static Mode[] values() {
            return (Mode[])$VALUES.clone();
        }
    }

    static final class SingletonHolder {
        static final long att;
        static final long intel;
        static final UDis86 INSTANCE;

        static {
            INSTANCE = X86Disassembler.loadUDis86();
            intel = ((AbstractAsmLibraryInterface)((Object)INSTANCE)).getLibrary().findSymbolAddress("ud_translate_intel");
            att = ((AbstractAsmLibraryInterface)((Object)INSTANCE)).getLibrary().findSymbolAddress("ud_translate_att");
        }

        SingletonHolder() {
        }
    }

    public static final class Syntax
    extends Enum<Syntax> {
        private static final /* synthetic */ Syntax[] $VALUES;
        public static final /* enum */ Syntax ATT;
        public static final /* enum */ Syntax INTEL;

        static {
            INTEL = new Syntax();
            ATT = new Syntax();
            $VALUES = Syntax.$values();
        }

        public static Syntax[] values() {
            return (Syntax[])$VALUES.clone();
        }

        public static Syntax valueOf(String name) {
            return Enum.valueOf(Syntax.class, name);
        }

        private static /* synthetic */ Syntax[] $values() {
            Syntax[] syntaxArray = new Syntax[2];
            syntaxArray[0] = INTEL;
            syntaxArray[1] = ATT;
            return syntaxArray;
        }
    }
}

