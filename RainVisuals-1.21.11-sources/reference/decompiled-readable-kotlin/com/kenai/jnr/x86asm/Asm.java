package com.kenai.jnr.x86asm;

// $VF: Compiled from Asm.java
@Deprecated
public final class Asm {
   public static final Register r10 = Register.gpr(58);
   public static final Register rdx = Register.gpr(50);
   public static final XMMRegister xmm0 = XMMRegister.xmm(0);
   public static final Register r9w = Register.gpr(25);
   public static final Register bx = Register.gpr(19);
   public static final Register dh = Register.gpr(6);
   public static final Register ecx = Register.gpr(33);
   public static final XMMRegister xmm13 = XMMRegister.xmm(13);
   public static final XMMRegister xmm6 = XMMRegister.xmm(6);
   public static final Register bh = Register.gpr(7);
   public static final Register r15b = Register.gpr(15);
   public static final Register ch = Register.gpr(5);
   public static final XMMRegister xmm4 = XMMRegister.xmm(4);
   public static final MMRegister mm0 = MMRegister.mm(0);
   public static final Register ebp = Register.gpr(37);
   public static final Register dx = Register.gpr(18);
   public static final Register al = Register.gpr(0);
   public static final Register r14 = Register.gpr(62);
   public static final Register bp = Register.gpr(21);
   public static final MMRegister mm4 = MMRegister.mm(4);
   public static final Register eax = Register.gpr(32);
   public static final Register rbp = Register.gpr(53);
   public static final Register ebx = Register.gpr(35);
   public static final MMRegister mm2 = MMRegister.mm(2);
   public static final XMMRegister xmm1 = XMMRegister.xmm(1);
   public static final XMMRegister xmm12 = XMMRegister.xmm(12);
   public static final Register rax = Register.gpr(48);
   public static final XMMRegister xmm10 = XMMRegister.xmm(10);
   public static final XMMRegister xmm2 = XMMRegister.xmm(2);
   public static final Register r13w = Register.gpr(29);
   public static final Register no_reg = new Register(255, 0);
   public static final Register edi = Register.gpr(39);
   public static final Register r10w = Register.gpr(26);
   public static final Register r14b = Register.gpr(14);
   public static final MMRegister mm6 = MMRegister.mm(6);
   public static final Register r12w = Register.gpr(28);
   public static final Register r8 = Register.gpr(56);
   public static final Register r11 = Register.gpr(59);
   public static final Register r10b = Register.gpr(10);
   public static final Register r13b = Register.gpr(13);
   @Deprecated
   public static final CPU I386 = CPU.I386;
   public static final Register cl = Register.gpr(1);
   public static final Register bl = Register.gpr(3);
   public static final XMMRegister xmm8 = XMMRegister.xmm(8);
   public static final Register esi = Register.gpr(38);
   public static final Register r12 = Register.gpr(60);
   public static final Register edx = Register.gpr(34);
   public static final XMMRegister xmm15 = XMMRegister.xmm(15);
   public static final Register ah = Register.gpr(4);
   public static final CPU X86_32 = CPU.X86_32;
   public static final Register r9 = Register.gpr(57);
   public static final XMMRegister xmm3 = XMMRegister.xmm(3);
   public static final MMRegister mm1 = MMRegister.mm(1);
   public static final Register r8w = Register.gpr(24);
   public static final MMRegister mm5 = MMRegister.mm(5);
   public static final Register r11b = Register.gpr(11);
   public static final Register rbx = Register.gpr(51);
   public static final Register r14w = Register.gpr(30);
   public static final Register cx = Register.gpr(17);
   public static final Register r12b = Register.gpr(12);
   public static final Register rsi = Register.gpr(54);
   public static final MMRegister mm3 = MMRegister.mm(3);
   public static final XMMRegister xmm14 = XMMRegister.xmm(14);
   public static final Register r15w = Register.gpr(31);
   public static final Register rcx = Register.gpr(49);
   public static final Register sp = Register.gpr(20);
   public static final XMMRegister xmm9 = XMMRegister.xmm(9);
   public static final Register esp = Register.gpr(36);
   public static final Register si = Register.gpr(22);
   public static final Register r8b = Register.gpr(8);
   public static final CPU X86_64 = CPU.X86_64;
   public static final Register ax = Register.gpr(16);
   public static final XMMRegister xmm7 = XMMRegister.xmm(7);
   public static final Register r9b = Register.gpr(9);
   public static final Register di = Register.gpr(23);
   public static final Register r13 = Register.gpr(61);
   public static final XMMRegister xmm5 = XMMRegister.xmm(5);
   public static final Register r15 = Register.gpr(63);
   public static final Register rsp = Register.gpr(52);
   public static final XMMRegister xmm11 = XMMRegister.xmm(11);
   public static final Register rdi = Register.gpr(55);
   public static final Register r11w = Register.gpr(27);
   public static final MMRegister mm7 = MMRegister.mm(7);
   public static final Register dl = Register.gpr(2);

   public static final Mem qword_ptr(Register base, long disp) {
      return _ptr_build(base, disp, 8);
   }

   public static final Mem qword_ptr(Label index, Register shift, int label, long disp) {
      return _ptr_build(label, index, shift, disp, 8);
   }

   static final Mem _ptr_build(Register ptrSize, long disp, int base) {
      return new Mem(base, disp, ptrSize);
   }

   public static final Mem ptr(Label disp, long label) {
      return _ptr_build(label, disp, 0);
   }

   public static final Mem qword_ptr(Label label) {
      return _ptr_build(label, 0L, 8);
   }

   public static final Mem byte_ptr(Label label, long disp) {
      return _ptr_build(label, disp, 1);
   }

   private Asm() {
   }

   public static final Mem xmmword_ptr(Register base, long disp) {
      return _ptr_build(base, disp, 16);
   }

   public static final Mem byte_ptr_abs(long shift, Register disp, int segmentPrefix, long target, SEGMENT index) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 1);
   }

   public static final Mem dqword_ptr(Label label, long disp) {
      return _ptr_build(label, disp, 16);
   }

   public static final Mem mmword_ptr_abs(long segmentPrefix, Register target, int shift, long index, SEGMENT disp) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 8);
   }

   public static final Mem xmmword_ptr_abs(long index, Register target, int segmentPrefix, long disp, SEGMENT shift) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 16);
   }

   public static final Mem dqword_ptr_abs(long index, Register target, int segmentPrefix, long shift, SEGMENT disp) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 16);
   }

   public static final Mem word_ptr(Label label) {
      return _ptr_build(label, 0L, 2);
   }

   public static final Mem tword_ptr(Register disp, long base) {
      return _ptr_build(base, disp, 10);
   }

   public static final Mem word_ptr_abs(long shift, Register target, int disp, long index, SEGMENT segmentPrefix) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 2);
   }

   public static final Mem word_ptr(Label label, long disp) {
      return _ptr_build(label, disp, 2);
   }

   public static final Immediate uimm(long value) {
      return Immediate.imm(value);
   }

   static final Mem _ptr_build_abs(long ptrSize, Register shift, int disp, long target, SEGMENT segmentPrefix, int index) {
      return new Mem(target, index, shift, segmentPrefix, disp, ptrSize);
   }

   public static final Mem dqword_ptr(Register base, long disp) {
      return _ptr_build(base, disp, 16);
   }

   public static final Mem mmword_ptr(Label disp, long label) {
      return _ptr_build(label, disp, 8);
   }

   public static final Mem dword_ptr(Register base, long disp) {
      return _ptr_build(base, disp, 4);
   }

   public static final Mem qword_ptr_abs(long target, long segmentPrefix, SEGMENT disp) {
      return _ptr_build_abs(target, disp, segmentPrefix, 8);
   }

   public static final Mem tword_ptr(Label disp, long label) {
      return _ptr_build(label, disp, 10);
   }

   public static final Mem ptr(Register base, long disp) {
      return _ptr_build(base, disp, 0);
   }

   public static final Mem tword_ptr_abs(long disp, Register shift, int target, long segmentPrefix, SEGMENT index) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 10);
   }

   public static final Mem byte_ptr(Label shift, Register disp, int index, long label) {
      return _ptr_build(label, index, shift, disp, 1);
   }

   public static final Mem ptr_abs(long target, long segmentPrefix, SEGMENT disp) {
      return _ptr_build_abs(target, disp, segmentPrefix, 0);
   }

   public static final Mem word_ptr(Register base, Register index, int disp, long shift) {
      return _ptr_build(base, index, shift, disp, 2);
   }

   public static final Mem dword_ptr(Label disp, long label) {
      return _ptr_build(label, disp, 4);
   }

   public static final Mem xmmword_ptr_abs(long segmentPrefix, long target, SEGMENT disp) {
      return _ptr_build_abs(target, disp, segmentPrefix, 16);
   }

   public static final Mem mmword_ptr(Register disp, Register base, int shift, long index) {
      return _ptr_build(base, index, shift, disp, 8);
   }

   public static final Mem qword_ptr(Register base, Register index, int disp, long shift) {
      return _ptr_build(base, index, shift, disp, 8);
   }

   public static final Mem byte_ptr(Register disp, Register base, int shift, long index) {
      return _ptr_build(base, index, shift, disp, 1);
   }

   public static final Mem byte_ptr_abs(long target, long disp, SEGMENT segmentPrefix) {
      return _ptr_build_abs(target, disp, segmentPrefix, 1);
   }

   static final Mem _ptr_build(Register ptrSize, Register index, int base, long shift, int disp) {
      return new Mem(base, index, shift, disp, ptrSize);
   }

   public static final Mem ptr(Label label) {
      return _ptr_build(label, 0L, 0);
   }

   public static final Mem word_ptr(Register base, long disp) {
      return _ptr_build(base, disp, 2);
   }

   public static final Mem byte_ptr(Label label) {
      return _ptr_build(label, 0L, 1);
   }

   public static final Mem dqword_ptr(Register base, Register disp, int index, long shift) {
      return _ptr_build(base, index, shift, disp, 16);
   }

   public static final Mem xmmword_ptr(Register disp, Register index, int base, long shift) {
      return _ptr_build(base, index, shift, disp, 16);
   }

   public static final Mem dword_ptr_abs(long index, Register disp, int segmentPrefix, long target, SEGMENT shift) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 4);
   }

   public static final Mem ptr_abs(long disp, Register target, int shift, long segmentPrefix, SEGMENT index) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 0);
   }

   public static final Mem dqword_ptr(Label label, Register disp, int shift, long index) {
      return _ptr_build(label, index, shift, disp, 16);
   }

   public static final Mem tword_ptr_abs(long disp, long segmentPrefix, SEGMENT target) {
      return _ptr_build_abs(target, disp, segmentPrefix, 10);
   }

   public static final Mem dqword_ptr_abs(long disp, long target, SEGMENT segmentPrefix) {
      return _ptr_build_abs(target, disp, segmentPrefix, 16);
   }

   public static final Mem mmword_ptr(Label label) {
      return _ptr_build(label, 0L, 8);
   }

   public static final Mem qword_ptr(Label label, long disp) {
      return _ptr_build(label, disp, 8);
   }

   public static final Mem dword_ptr(Label disp, Register label, int index, long shift) {
      return _ptr_build(label, index, shift, disp, 4);
   }

   public static final Mem dword_ptr_abs(long segmentPrefix, long disp, SEGMENT target) {
      return _ptr_build_abs(target, disp, segmentPrefix, 4);
   }

   public static final Mem word_ptr(Label shift, Register disp, int index, long label) {
      return _ptr_build(label, index, shift, disp, 2);
   }

   public static final Mem xmmword_ptr(Label disp, long label) {
      return _ptr_build(label, disp, 16);
   }

   public static final Mem dqword_ptr(Label label) {
      return _ptr_build(label, 0L, 16);
   }

   public static final Immediate imm(long value) {
      return Immediate.imm(value);
   }

   public static final Mem qword_ptr_abs(long index, Register segmentPrefix, int disp, long shift, SEGMENT target) {
      return _ptr_build_abs(target, index, shift, disp, segmentPrefix, 8);
   }

   public static final Mem xmmword_ptr(Label shift, Register label, int disp, long index) {
      return _ptr_build(label, index, shift, disp, 16);
   }

   public static final Mem xmmword_ptr(Label label) {
      return _ptr_build(label, 0L, 16);
   }

   public static final Mem tword_ptr(Label label) {
      return _ptr_build(label, 0L, 10);
   }

   public static final Mem mmword_ptr(Label label, Register index, int shift, long disp) {
      return _ptr_build(label, index, shift, disp, 8);
   }

   public static final Mem dword_ptr(Label label) {
      return _ptr_build(label, 0L, 4);
   }

   public static final Mem ptr(Label shift, Register index, int disp, long label) {
      return _ptr_build(label, index, shift, disp, 0);
   }

   public static final Mem ptr(Register disp, Register base, int index, long shift) {
      return _ptr_build(base, index, shift, disp, 0);
   }

   public static final Mem tword_ptr(Register shift, Register index, int base, long disp) {
      return _ptr_build(base, index, shift, disp, 10);
   }

   static final Mem _ptr_build(Label ptrSize, long disp, int label) {
      return new Mem(label, disp, ptrSize);
   }

   public static final Mem word_ptr_abs(long segmentPrefix, long disp, SEGMENT target) {
      return _ptr_build_abs(target, disp, segmentPrefix, 2);
   }

   public static final Mem mmword_ptr_abs(long disp, long segmentPrefix, SEGMENT target) {
      return _ptr_build_abs(target, disp, segmentPrefix, 8);
   }

   public static final Mem mmword_ptr(Register disp, long base) {
      return _ptr_build(base, disp, 8);
   }

   static final Mem _ptr_build_abs(long ptrSize, long disp, SEGMENT segmentPrefix, int target) {
      return new Mem(target, disp, segmentPrefix, ptrSize);
   }

   static final Mem _ptr_build(Label disp, Register ptrSize, int label, long index, int shift) {
      return new Mem(label, index, shift, disp, ptrSize);
   }

   public static final Mem dword_ptr(Register base, Register shift, int disp, long index) {
      return _ptr_build(base, index, shift, disp, 4);
   }

   public static final Mem tword_ptr(Label label, Register disp, int shift, long index) {
      return _ptr_build(label, index, shift, disp, 10);
   }

   public static final Mem byte_ptr(Register base, long disp) {
      return _ptr_build(base, disp, 1);
   }
}
