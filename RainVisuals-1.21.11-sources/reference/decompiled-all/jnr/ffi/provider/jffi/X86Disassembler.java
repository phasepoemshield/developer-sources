package jnr.ffi.provider.jffi;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.DefaultTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.types.intptr_t;
import jnr.ffi.types.size_t;
import jnr.ffi.types.u_int64_t;
import jnr.ffi.types.u_int8_t;

// $VF: Compiled from X86Disassembler.java
class X86Disassembler {
   final Pointer ud;
   private final X86Disassembler.UDis86 udis86;

   public void setInputBuffer(Pointer buffer, int size) {
      this.udis86.ud_set_input_buffer(this, buffer, size);
   }

   public String hex() {
      return this.udis86.ud_insn_hex(this);
   }

   public void setSyntax(X86Disassembler.Syntax syntax) {
      this.udis86.ud_set_syntax(this, syntax == X86Disassembler.Syntax.INTEL ? X86Disassembler.SingletonHolder.intel : X86Disassembler.SingletonHolder.att);
   }

   private X86Disassembler(X86Disassembler.UDis86 udis86) {
      this.udis86 = udis86;
      this.ud = Memory.allocateDirect(Runtime.getRuntime(udis86), 1024, true);
      this.udis86.ud_init(this.ud);
   }

   static X86Disassembler.UDis86 loadUDis86() {
      DefaultTypeMapper typeMapper = new DefaultTypeMapper();
      typeMapper.put(X86Disassembler.class, new X86Disassembler.X86DisassemblerConverter());
      return jnr.ffi.LibraryLoader.create(X86Disassembler.UDis86.class)
         .library("udis86")
         .search("/usr/local/lib")
         .search("/opt/local/lib")
         .search("/usr/lib")
         .mapper(typeMapper)
         .load();
   }

   public boolean disassemble() {
      return this.udis86.ud_disassemble(this) != 0;
   }

   static boolean isAvailable() {
      try {
         return X86Disassembler.SingletonHolder.INSTANCE != null;
      } catch (Throwable var1) {
         return false;
      }
   }

   public long offset() {
      return this.udis86.ud_insn_off(this);
   }

   public void setMode(X86Disassembler.Mode mode) {
      this.udis86.ud_set_mode(this, mode == X86Disassembler.Mode.I386 ? 32 : 64);
   }

   static X86Disassembler create() {
      return new X86Disassembler(X86Disassembler.SingletonHolder.INSTANCE);
   }

   public String insn() {
      return this.udis86.ud_insn_asm(this);
   }

   // $VF: Compiled from X86Disassembler.java
   public enum Mode {
      I386,
      X86_64;
   }

   // $VF: Compiled from X86Disassembler.java
   static final class SingletonHolder {
      static final long att = ((AbstractAsmLibraryInterface)X86Disassembler.SingletonHolder.INSTANCE).getLibrary().findSymbolAddress("ud_translate_att");
      static final long intel = ((AbstractAsmLibraryInterface)X86Disassembler.SingletonHolder.INSTANCE).getLibrary().findSymbolAddress("ud_translate_intel");
      static final X86Disassembler.UDis86 INSTANCE = X86Disassembler.loadUDis86();
   }

   // $VF: Compiled from X86Disassembler.java
   public enum Syntax {
      ATT,
      INTEL;
   }

   // $VF: Compiled from X86Disassembler.java
   @NoX86
   @NoTrace
   public interface UDis86 {
      int ud_insn_len(X86Disassembler var1);

      int ud_decode(X86Disassembler var1);

      void ud_input_skip(X86Disassembler var1, @size_t long var2);

      int ud_input_end(X86Disassembler var1);

      String ud_insn_asm(X86Disassembler var1);

      void ud_set_pc(X86Disassembler var1, @u_int64_t int var2);

      @u_int64_t
      long ud_insn_off(X86Disassembler var1);

      void ud_set_vendor(X86Disassembler var1, int var2);

      @intptr_t
      long ud_insn_ptr(X86Disassembler var1);

      void ud_init(Pointer var1);

      void ud_set_mode(X86Disassembler var1, @u_int8_t int var2);

      void ud_set_syntax(X86Disassembler var1, @intptr_t long var2);

      String ud_insn_hex(X86Disassembler var1);

      int ud_disassemble(X86Disassembler var1);

      void ud_set_input_buffer(X86Disassembler var1, Pointer var2, @size_t long var3);
   }

   // $VF: Compiled from X86Disassembler.java
   @ToNativeConverter.NoContext
   public static final class X86DisassemblerConverter implements ToNativeConverter<X86Disassembler, Pointer> {
      public Pointer toNative(X86Disassembler context, ToNativeContext value) {
         return value.ud;
      }

      @Override
      public Class<Pointer> nativeType() {
         return Pointer.class;
      }
   }
}
