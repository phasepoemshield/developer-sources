package jnr.x86asm;

// $VF: Compiled from SerializerIntrinsics.java
public abstract class SerializerIntrinsics extends SerializerCore {
   public final void psrld(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSRLD, dst, src);
   }

   public final void psrlq(XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSRLQ, dst, src);
   }

   public final void ja_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JA_SHORT, label, hint);
   }

   public final void cmovnae(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVNAE, dst, src);
   }

   public final void cmovp(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVP, dst, src);
   }

   public final void pf2id(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PF2ID, dst, src);
   }

   public final void movdqa(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVDQA, dst, src);
   }

   public final void punpckhbw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHBW, dst, src);
   }

   public final void jnb_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNB_SHORT, label, hint);
   }

   public final void pmovmskb(Register dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMOVMSKB, dst, src);
   }

   public final void pcmpgtd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPGTD, dst, src);
   }

   public final void pabsb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PABSB, dst, src);
   }

   public final void cmp(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMP, dst, src);
   }

   public final void psrad(MMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSRAD, dst, src);
   }

   public final void cvtpd2pi(MMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTPD2PI, dst, src);
   }

   public final void fcmovb(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVB, src);
   }

   public final void sbb(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_SBB, dst, src);
   }

   public final void movd(Register src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void punpcklwd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLWD, dst, src);
   }

   public final void jng_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNG_SHORT, label, hint);
   }

   public final void fstsw(Mem dst) {
      this.emitX86(INST_CODE.INST_FSTSW, dst);
   }

   public final void fisub(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FISUB, src);
   }

   public final void punpcklbw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLBW, dst, src);
   }

   public final void rcr(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_RCR, dst, src);
   }

   public final void setpo(Register dst) {
      this.emitX86(INST_CODE.INST_SETPO, dst);
   }

   public final void fldz() {
      this.emitX86(INST_CODE.INST_FLDZ);
   }

   public final void fidiv(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FIDIV, src);
   }

   public final void pcmpistrm(XMMRegister dst, Mem src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PCMPISTRM, dst, src, imm8);
   }

   public final void fxch(X87Register reg) {
      this.emitX86(INST_CODE.INST_FXCH, reg);
   }

   public final void or_(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_OR, dst, src);
   }

   public final void movddup(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVDDUP, dst, src);
   }

   public final void popf() {
      if (!this.is64()) {
         this.popfd();
      } else {
         this.popfq();
      }
   }

   public final void mov(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOV, dst, src);
   }

   public final void pmovzxwq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVZXWQ, dst, src);
   }

   public final void extractps(XMMRegister imm8, XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_EXTRACTPS, dst, src, imm8);
   }

   public final void punpcklwd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PUNPCKLWD, dst, src);
   }

   public final void cvtsi2sd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTSI2SD, dst, src);
   }

   public final void cmpsd(XMMRegister src, XMMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_CMPSD, dst, src, imm8);
   }

   public final void fdivrp(X87Register reg) {
      this.emitX86(INST_CODE.INST_FDIVRP, reg);
   }

   public final void cmovne(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNE, dst, src);
   }

   public final void ucomiss(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_UCOMISS, dst, src);
   }

   public final void hsubps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_HSUBPS, dst, src);
   }

   public final void movd(Register dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void phsubd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PHSUBD, dst, src);
   }

   public final void jg(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JG, label, hint);
   }

   public final void pextrd(Register imm8, XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PEXTRD, dst, src, imm8);
   }

   public final void movntps(Mem dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVNTPS, dst, src);
   }

   public final void cvttss2si(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTTSS2SI, dst, src);
   }

   public final void paddsw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDSW, dst, src);
   }

   public final void cvtss2sd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTSS2SD, dst, src);
   }

   public final void cvtpd2dq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTPD2DQ, dst, src);
   }

   public final void pfrsqit1(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFRSQIT1, dst, src);
   }

   public final void setnp(Register dst) {
      this.emitX86(INST_CODE.INST_SETNP, dst);
   }

   public final void leave() {
      this.emitX86(INST_CODE.INST_LEAVE);
   }

   public final void cmova(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVA, dst, src);
   }

   public final void pfnacc(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFNACC, dst, src);
   }

   public final void setnbe(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNBE, dst);
   }

   public final void jae_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JAE_SHORT, label, hint);
   }

   public final void finit() {
      this.emitX86(INST_CODE.INST_FINIT);
   }

   public final void packsswb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PACKSSWB, dst, src);
   }

   public final void paddq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PADDQ, dst, src);
   }

   public final void psrlw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSRLW, dst, src);
   }

   public final void movd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void setpo(Mem dst) {
      this.emitX86(INST_CODE.INST_SETPO, dst);
   }

   public final void pminsb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMINSB, dst, src);
   }

   public final void psrlq(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSRLQ, dst, src);
   }

   public final void pinsrw(XMMRegister src, Register dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PINSRW, dst, src, imm8);
   }

   public final void shld(Register src2, Register src1, Immediate dst) {
      this.emitX86(INST_CODE.INST_SHLD, dst, src1, src2);
   }

   public final void cvtsd2ss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTSD2SS, dst, src);
   }

   public final void packuswb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PACKUSWB, dst, src);
   }

   public final void rcl(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_RCL, dst, src);
   }

   public final void addsd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_ADDSD, dst, src);
   }

   public final void movzx(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_MOVZX, dst, src);
   }

   public final void add(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_ADD, dst, src);
   }

   public final void pminsb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMINSB, dst, src);
   }

   public final void por(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_POR, dst, src);
   }

   public final void pslld(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSLLD, dst, src);
   }

   public final void jpo(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JPO, label, hint);
   }

   public final void sub(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_SUB, dst, src);
   }

   public final void paddd(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDD, dst, src);
   }

   public final void pabsd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PABSD, dst, src);
   }

   public final void mulps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MULPS, dst, src);
   }

   public final void movd(XMMRegister dst, Register src) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void psubusw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBUSW, dst, src);
   }

   public final void pshufb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PSHUFB, dst, src);
   }

   public final void fbld(Mem src) {
      this.emitX86(INST_CODE.INST_FBLD, src);
   }

   public final void fsubrp(X87Register dst) {
      this.emitX86(INST_CODE.INST_FSUBRP, dst);
   }

   public final void pfcmpgt(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFCMPGT, dst, src);
   }

   public final void fcom() {
      this.fcom(X87Register.st(1));
   }

   public final void psrlq(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSRLQ, dst, src);
   }

   public final void movupd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVUPD, dst, src);
   }

   public final void jz_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JZ_SHORT, label, hint);
   }

   public final void blendvps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_BLENDVPS, dst, src);
   }

   public final void movntpd(Mem dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVNTPD, dst, src);
   }

   public final void pmaxud(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMAXUD, dst, src);
   }

   public final void pmaddwd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMADDWD, dst, src);
   }

   public final void pfmin(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFMIN, dst, src);
   }

   public final void pmuludq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMULUDQ, dst, src);
   }

   public final void minps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MINPS, dst, src);
   }

   public final void pinsrb(XMMRegister src, Mem dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PINSRB, dst, src, imm8);
   }

   public final void maxpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MAXPD, dst, src);
   }

   public final void fadd(Mem src) {
      this.emitX86(INST_CODE.INST_FADD, src);
   }

   public final void haddpd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_HADDPD, dst, src);
   }

   public final void jc_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JC_SHORT, label, hint);
   }

   public final void pextrd(Mem dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRD, dst, src, imm8);
   }

   public final void setae(Mem dst) {
      this.emitX86(INST_CODE.INST_SETAE, dst);
   }

   public final void jp(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JP, label, hint);
   }

   public final void cmovge(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVGE, dst, src);
   }

   public final void setc(Register dst) {
      this.emitX86(INST_CODE.INST_SETC, dst);
   }

   public final void jna(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNA, label, hint);
   }

   public final void addsubps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_ADDSUBPS, dst, src);
   }

   public final void cmppd(XMMRegister imm8, Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_CMPPD, dst, src, imm8);
   }

   public final void fldenv(Mem src) {
      this.emitX86(INST_CODE.INST_FLDENV, src);
   }

   public final void minps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MINPS, dst, src);
   }

   public final void pcmpeqd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PCMPEQD, dst, src);
   }

   public final void palignr(XMMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_PALIGNR, dst, src, imm8);
   }

   public final void fucompp() {
      this.emitX86(INST_CODE.INST_FUCOMPP);
   }

   public final void mulpd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MULPD, dst, src);
   }

   public final void phsubw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PHSUBW, dst, src);
   }

   public final void call(Label label) {
      this.emitX86(INST_CODE.INST_CALL, label);
   }

   public final void psrlw(MMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSRLW, dst, src);
   }

   public final void seto(Register dst) {
      this.emitX86(INST_CODE.INST_SETO, dst);
   }

   public final void movq(Register src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void pcmpgtb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPGTB, dst, src);
   }

   public final void psubw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBW, dst, src);
   }

   public final void amd_prefetchw(Mem mem) {
      this.emitX86(INST_CODE.INST_AMD_PREFETCHW, mem);
   }

   public final void por(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_POR, dst, src);
   }

   public final void setz(Mem dst) {
      this.emitX86(INST_CODE.INST_SETZ, dst);
   }

   public final void packuswb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PACKUSWB, dst, src);
   }

   public final void pabsw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PABSW, dst, src);
   }

   public final void cmovnl(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVNL, dst, src);
   }

   public final void fsubr(Mem src) {
      if (!$assertionsDisabled && src.size() != 4 && src.size() != 8) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FSUBR, src);
   }

   public final void movdqu(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVDQU, dst, src);
   }

   public final void fdivr(Mem src) {
      this.emitX86(INST_CODE.INST_FDIVR, src);
   }

   public final void fmul(X87Register src, X87Register dst) {
      if (!$assertionsDisabled && dst.index() != 0 && src.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FMUL, dst, src);
   }

   public final void pcmpgtw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PCMPGTW, dst, src);
   }

   public final void movd(MMRegister dst, Register src) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void jns(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNS, label, hint);
   }

   public final void ror(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_ROR, dst, src);
   }

   public final void cmp(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_CMP, dst, src);
   }

   public final void pand(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PAND, dst, src);
   }

   public final void not_(Register dst) {
      this.emitX86(INST_CODE.INST_NOT, dst);
   }

   public final void or_(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_OR, dst, src);
   }

   public final void fucomip() {
      this.emitX86(INST_CODE.INST_FUCOMIP, X87Register.st(1));
   }

   public final void jnle(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNLE, label, hint);
   }

   public final void pabsd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PABSD, dst, src);
   }

   public final void pminsw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMINSW, dst, src);
   }

   public final void minpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MINPD, dst, src);
   }

   public final void pblendvb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PBLENDVB, dst, src);
   }

   public final void cvttps2dq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTTPS2DQ, dst, src);
   }

   public final void fcmovnbe(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVNBE, src);
   }

   public final void phaddsw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PHADDSW, dst, src);
   }

   public final void phaddsw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PHADDSW, dst, src);
   }

   public final void cmovg(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVG, dst, src);
   }

   public final void setp(Mem dst) {
      this.emitX86(INST_CODE.INST_SETP, dst);
   }

   public final void movq(Mem dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void ftst() {
      this.emitX86(INST_CODE.INST_FTST);
   }

   public final void set(CONDITION cc, Register dst) {
      this.emitX86(conditionToSetCC(cc), dst);
   }

   public final void fbstp(Mem dst) {
      this.emitX86(INST_CODE.INST_FBSTP, dst);
   }

   public final void pcmpeqw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPEQW, dst, src);
   }

   public final void psrlq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PSRLQ, dst, src);
   }

   public final void setnc(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNC, dst);
   }

   public final void psignd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSIGND, dst, src);
   }

   public final void setnae(Register dst) {
      this.emitX86(INST_CODE.INST_SETNAE, dst);
   }

   public final void je_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JE_SHORT, label, hint);
   }

   public final void punpckhbw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHBW, dst, src);
   }

   public final void pfmax(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFMAX, dst, src);
   }

   public final void not_(Mem dst) {
      this.emitX86(INST_CODE.INST_NOT, dst);
   }

   public final void psubsb(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSUBSB, dst, src);
   }

   public final void rcpss(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_RCPSS, dst, src);
   }

   public final void movlpd(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVLPD, dst, src);
   }

   public final void phsubw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PHSUBW, dst, src);
   }

   public final void setge(Register dst) {
      this.emitX86(INST_CODE.INST_SETGE, dst);
   }

   public final void fucomp() {
      this.emitX86(INST_CODE.INST_FUCOMP, X87Register.st(1));
   }

   public final void psrlw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSRLW, dst, src);
   }

   public final void divpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_DIVPD, dst, src);
   }

   public final void add(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_ADD, dst, src);
   }

   public final void addps(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ADDPS, dst, src);
   }

   public final void movq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void cmpps(XMMRegister imm8, Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_CMPPS, dst, src, imm8);
   }

   public final void pfrsqrt(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFRSQRT, dst, src);
   }

   public final void pabsw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PABSW, dst, src);
   }

   public final void fnstsw(Register dst) {
      if (!$assertionsDisabled && !dst.isRegCode(16)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FNSTSW, dst);
   }

   public final void fxch() {
      this.emitX86(INST_CODE.INST_FXCH, X87Register.st(1));
   }

   public final void movq(Mem dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void punpcklbw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PUNPCKLBW, dst, src);
   }

   public final void pshufw(MMRegister src, Mem dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PSHUFW, dst, src, imm8);
   }

   public final void psubb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBB, dst, src);
   }

   public final void mpsadbw(XMMRegister src, XMMRegister dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_MPSADBW, dst, src, imm8);
   }

   public final void rdtsc() {
      this.emitX86(INST_CODE.INST_RDTSC);
   }

   public final void nop() {
      this.emitX86(INST_CODE.INST_NOP);
   }

   public final void unpcklps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_UNPCKLPS, dst, src);
   }

   public final void sbb(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_SBB, dst, src);
   }

   public final void cmovg(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVG, dst, src);
   }

   public final void psubsw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBSW, dst, src);
   }

   public final void dppd(XMMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_DPPD, dst, src, imm8);
   }

   public final void cmpss(XMMRegister imm8, XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_CMPSS, dst, src, imm8);
   }

   public final void maxps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MAXPS, dst, src);
   }

   public final void fmulp() {
      this.fmulp(X87Register.st(1));
   }

   public final void test(Register op2, Immediate op1) {
      this.emitX86(INST_CODE.INST_TEST, op1, op2);
   }

   public final void pfcmpge(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFCMPGE, dst, src);
   }

   public final void psignw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSIGNW, dst, src);
   }

   public final void maskmovdqu(XMMRegister mask, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MASKMOVDQU, src, mask);
   }

   public final void imul(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_IMUL, dst, src);
   }

   public final void fst(X87Register reg) {
      this.emitX86(INST_CODE.INST_FST, reg);
   }

   public final void fist(Mem dst) {
      if (!$assertionsDisabled && dst.size() != 2 && dst.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FIST, dst);
   }

   public final void cvttss2si(Register dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTTSS2SI, dst, src);
   }

   public final void blendvpd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_BLENDVPD, dst, src);
   }

   public final void punpcklwd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLWD, dst, src);
   }

   public final void subss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_SUBSS, dst, src);
   }

   public final void btc(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_BTC, dst, src);
   }

   public final void psadbw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSADBW, dst, src);
   }

   public final void pcmpgtb(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PCMPGTB, dst, src);
   }

   public final void psubb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBB, dst, src);
   }

   public final void movups(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVUPS, dst, src);
   }

   public final void ja(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JA, label, hint);
   }

   public final void rdtscp() {
      this.emitX86(INST_CODE.INST_RDTSCP);
   }

   public final void pcmpgtd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPGTD, dst, src);
   }

   public final void psubd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBD, dst, src);
   }

   public final void xor_(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_XOR, dst, src);
   }

   public final void pmuludq(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMULUDQ, dst, src);
   }

   public final void fincstp() {
      this.emitX86(INST_CODE.INST_FINCSTP);
   }

   public final void rsqrtss(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_RSQRTSS, dst, src);
   }

   public final void cvtdq2pd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTDQ2PD, dst, src);
   }

   public final void jnbe(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNBE, label, hint);
   }

   public final void sete(Register dst) {
      this.emitX86(INST_CODE.INST_SETE, dst);
   }

   public final void psignw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSIGNW, dst, src);
   }

   public final void pmaddwd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMADDWD, dst, src);
   }

   public final void psrad(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSRAD, dst, src);
   }

   public final void bt(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_BT, dst, src);
   }

   public final void addsubpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ADDSUBPD, dst, src);
   }

   public final void xor_(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_XOR, dst, src);
   }

   public final void pfcmpge(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFCMPGE, dst, src);
   }

   public final void rcpss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_RCPSS, dst, src);
   }

   public final void setc(Mem dst) {
      this.emitX86(INST_CODE.INST_SETC, dst);
   }

   public final void sqrtsd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_SQRTSD, dst, src);
   }

   public final void pslldq(XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSLLDQ, dst, src);
   }

   public final void mov_ptr(long dst, Register src) {
      if (!$assertionsDisabled && src.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_MOV_PTR, Immediate.imm(dst), src);
   }

   public final void maxsd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MAXSD, dst, src);
   }

   public final void dec(Mem dst) {
      this.emitX86(INST_CODE.INST_DEC, dst);
   }

   public final void punpckldq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLDQ, dst, src);
   }

   public final void fldl2e() {
      this.emitX86(INST_CODE.INST_FLDL2E);
   }

   public final void das() {
      this.emitX86(INST_CODE.INST_DAS);
   }

   public final void pfrcp(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PFRCP, dst, src);
   }

   public final void phsubw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PHSUBW, dst, src);
   }

   public final void pmaxsw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMAXSW, dst, src);
   }

   public final void pmaddwd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMADDWD, dst, src);
   }

   public final void pavgb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PAVGB, dst, src);
   }

   public final void pmaxsd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMAXSD, dst, src);
   }

   public final void psrldq(XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSRLDQ, dst, src);
   }

   public final void jl_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JL_SHORT, label, hint);
   }

   public final void cmovl(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVL, dst, src);
   }

   public final void roundsd(XMMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_ROUNDSD, dst, src, imm8);
   }

   public final void shrd(Mem src2, Register dst, Register src1) {
      this.emitX86(INST_CODE.INST_SHRD, dst, src1, src2);
   }

   public final void cmovz(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVZ, dst, src);
   }

   public final void setng(Register dst) {
      this.emitX86(INST_CODE.INST_SETNG, dst);
   }

   public final void sbb(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_SBB, dst, src);
   }

   public final void pmaddubsw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMADDUBSW, dst, src);
   }

   public final void fldcw(Mem src) {
      this.emitX86(INST_CODE.INST_FLDCW, src);
   }

   public final void fcomp() {
      this.fcomp(X87Register.st(1));
   }

   public final void shl(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_SHL, dst, src);
   }

   public final void pblendw(XMMRegister dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PBLENDW, dst, src, imm8);
   }

   public final void pushf() {
      if (!this.is64()) {
         this.pushfd();
      } else {
         this.pushfq();
      }
   }

   public final void pmulhw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PMULHW, dst, src);
   }

   public final void ror(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_ROR, dst, src);
   }

   public final void phaddd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PHADDD, dst, src);
   }

   public final void ffree(X87Register reg) {
      this.emitX86(INST_CODE.INST_FFREE, reg);
   }

   public final void movhlps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVHLPS, dst, src);
   }

   public final void rol(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_ROL, dst, src);
   }

   public final void pslld(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSLLD, dst, src);
   }

   public final void packssdw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PACKSSDW, dst, src);
   }

   public final void fclex() {
      this.emitX86(INST_CODE.INST_FCLEX);
   }

   public final void phaddd(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PHADDD, dst, src);
   }

   public final void pi2fd(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PI2FD, dst, src);
   }

   public final void por(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_POR, dst, src);
   }

   public final void pcmpeqd(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PCMPEQD, dst, src);
   }

   public final void paddd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDD, dst, src);
   }

   public final void jb_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JB_SHORT, label, hint);
   }

   public final void pfrcpit2(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PFRCPIT2, dst, src);
   }

   public final void paddsb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDSB, dst, src);
   }

   public final void pcmpestri(XMMRegister imm8, XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PCMPESTRI, dst, src, imm8);
   }

   public final void pmuludq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMULUDQ, dst, src);
   }

   public final void paddq(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PADDQ, dst, src);
   }

   public final void movapd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVAPD, dst, src);
   }

   public final void pushad() {
      this.emitX86(INST_CODE.INST_PUSHAD);
   }

   public final void movq(MMRegister dst, Register src) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void mulsd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MULSD, dst, src);
   }

   public final void pextrw(Register dst, MMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRW, dst, src, imm8);
   }

   public final void pavgw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PAVGW, dst, src);
   }

   public final void xor_(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_XOR, dst, src);
   }

   public final void movhps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVHPS, dst, src);
   }

   public final void ret(Immediate imm16) {
      this.emitX86(INST_CODE.INST_RET, imm16);
   }

   public final void pand(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PAND, dst, src);
   }

   public final void xor_(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_XOR, dst, src);
   }

   public final void punpckhwd(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PUNPCKHWD, dst, src);
   }

   public final void unpcklpd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_UNPCKLPD, dst, src);
   }

   public final void cmovnb(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVNB, dst, src);
   }

   public final void xadd(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_XADD, dst, src);
   }

   public final void ret() {
      this.emitX86(INST_CODE.INST_RET);
   }

   public final void pcmpestri(XMMRegister imm8, Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PCMPESTRI, dst, src, imm8);
   }

   public final void fnop() {
      this.emitX86(INST_CODE.INST_FNOP);
   }

   public final void pxor(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PXOR, dst, src);
   }

   public final void fxsave(Mem dst) {
      this.emitX86(INST_CODE.INST_FXSAVE, dst);
   }

   public final void fcmove(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVE, src);
   }

   public final void cvttpd2pi(MMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTTPD2PI, dst, src);
   }

   public final void mov(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_MOV, dst, src);
   }

   public final void subpd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_SUBPD, dst, src);
   }

   public final void paddusw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDUSW, dst, src);
   }

   public final void shrd(Mem src1, Register dst, Immediate src2) {
      this.emitX86(INST_CODE.INST_SHRD, dst, src1, src2);
   }

   public final void cmov(CONDITION src, Register cc, Register dst) {
      this.emitX86(conditionToCMovCC(cc), dst, src);
   }

   public final void jbe(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JBE, label, hint);
   }

   public final void pmovsxbd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVSXBD, dst, src);
   }

   public final void sal(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_SAL, dst, src);
   }

   public final void pxor(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PXOR, dst, src);
   }

   public final void fsub(Mem src) {
      if (!$assertionsDisabled && src.size() != 4 && src.size() != 8) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FSUB, src);
   }

   public final void psubusw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBUSW, dst, src);
   }

   public final void cmovo(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVO, dst, src);
   }

   public final void movsd(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVSD, dst, src);
   }

   public final void movsldup(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVSLDUP, dst, src);
   }

   public final void pavgw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PAVGW, dst, src);
   }

   public final void pfadd(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFADD, dst, src);
   }

   public final void pcmpestrm(XMMRegister dst, Mem src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PCMPESTRM, dst, src, imm8);
   }

   public final void cmovnz(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVNZ, dst, src);
   }

   public final void paddw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PADDW, dst, src);
   }

   public final void pmaddubsw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMADDUBSW, dst, src);
   }

   public final void cvtpi2ps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTPI2PS, dst, src);
   }

   public final void pfcmpeq(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFCMPEQ, dst, src);
   }

   public final void movsx(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVSX, dst, src);
   }

   public final void paddsw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDSW, dst, src);
   }

   public final void unpckhps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_UNPCKHPS, dst, src);
   }

   public final void pextrw(Mem dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRW, dst, src, imm8);
   }

   public final void jns_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNS_SHORT, label, hint);
   }

   public final void fwait() {
      this.emitX86(INST_CODE.INST_FWAIT);
   }

   public final void pcmpgtq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PCMPGTQ, dst, src);
   }

   public final void jnp(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNP, label, hint);
   }

   public final void je(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JE, label, hint);
   }

   public final void rcl(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_RCL, dst, src);
   }

   public final void pfsub(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFSUB, dst, src);
   }

   public final void pshuflw(XMMRegister src, XMMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSHUFLW, dst, src, imm8);
   }

   public final void sets(Register dst) {
      this.emitX86(INST_CODE.INST_SETS, dst);
   }

   public final void pcmpistri(XMMRegister dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PCMPISTRI, dst, src, imm8);
   }

   public final void fnstenv(Mem dst) {
      this.emitX86(INST_CODE.INST_FNSTENV, dst);
   }

   public final void cmove(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVE, dst, src);
   }

   public final void maxss(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MAXSS, dst, src);
   }

   public final void phaddsw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PHADDSW, dst, src);
   }

   public final void pfsubr(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PFSUBR, dst, src);
   }

   public final void sqrtps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_SQRTPS, dst, src);
   }

   public final void pminuw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMINUW, dst, src);
   }

   public final void paddusw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDUSW, dst, src);
   }

   public final void pfcmpgt(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFCMPGT, dst, src);
   }

   public final void psrad(XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSRAD, dst, src);
   }

   public final void setge(Mem dst) {
      this.emitX86(INST_CODE.INST_SETGE, dst);
   }

   public final void cpuid() {
      this.emitX86(INST_CODE.INST_CPUID);
   }

   public final void subsd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_SUBSD, dst, src);
   }

   public final void cmovnae(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNAE, dst, src);
   }

   public final void fcomp(Mem mem) {
      this.emitX86(INST_CODE.INST_FCOMP, mem);
   }

   public final void bts(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_BTS, dst, src);
   }

   public final void pcmpeqd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PCMPEQD, dst, src);
   }

   public final void pminud(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMINUD, dst, src);
   }

   public final void minss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MINSS, dst, src);
   }

   public final void cbw() {
      this.emitX86(INST_CODE.INST_CBW);
   }

   public final void cvtps2pi(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTPS2PI, dst, src);
   }

   public final void cvtsd2ss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTSD2SS, dst, src);
   }

   public final void pinsrd(XMMRegister imm8, Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PINSRD, dst, src, imm8);
   }

   public final void pfrcp(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFRCP, dst, src);
   }

   public final void setna(Register dst) {
      this.emitX86(INST_CODE.INST_SETNA, dst);
   }

   public final void pmulhw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMULHW, dst, src);
   }

   public final void andps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_ANDPS, dst, src);
   }

   public final void pcmpeqw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPEQW, dst, src);
   }

   public final void orpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ORPD, dst, src);
   }

   public final void psadbw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSADBW, dst, src);
   }

   public final void pcmpeqw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPEQW, dst, src);
   }

   public final void fyl2xp1() {
      this.emitX86(INST_CODE.INST_FYL2XP1);
   }

   public final void cdqe() {
      this.emitX86(INST_CODE.INST_CDQE);
   }

   public final void fdivr(X87Register src, X87Register dst) {
      if (!$assertionsDisabled && dst.index() != 0 && src.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FDIVR, dst, src);
   }

   public final void ucomisd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_UCOMISD, dst, src);
   }

   public final void psignd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSIGND, dst, src);
   }

   public final void setbe(Mem dst) {
      this.emitX86(INST_CODE.INST_SETBE, dst);
   }

   public final void pfnacc(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFNACC, dst, src);
   }

   public final void fsubr(X87Register src, X87Register dst) {
      if (!$assertionsDisabled && dst.index() != 0 && src.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FSUBR, dst, src);
   }

   public final void pshufb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSHUFB, dst, src);
   }

   public final void cmovnc(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNC, dst, src);
   }

   public final void pslld(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSLLD, dst, src);
   }

   public final void pcmpgtb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPGTB, dst, src);
   }

   public final void psubsw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBSW, dst, src);
   }

   public final void lddqu(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_LDDQU, dst, src);
   }

   public final void pmovsxwq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVSXWQ, dst, src);
   }

   public final void ldmxcsr(Mem src) {
      this.emitX86(INST_CODE.INST_LDMXCSR, src);
   }

   public final void setpe(Register dst) {
      this.emitX86(INST_CODE.INST_SETPE, dst);
   }

   public final void rcpps(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_RCPPS, dst, src);
   }

   public final void j_short(CONDITION hint, Label label, int cc) {
      this._emitJcc(INST_CODE.valueOf(conditionToJCC(cc).ordinal() + INST_CODE.INST_J_SHORT.ordinal() - INST_CODE.INST_J.ordinal()), label, hint);
   }

   public final void paddusb(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDUSB, dst, src);
   }

   public final void orps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ORPS, dst, src);
   }

   public final void setno(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNO, dst);
   }

   public final void movq(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void psllq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PSLLQ, dst, src);
   }

   public final void fisubr(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FISUBR, src);
   }

   public final void pfacc(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFACC, dst, src);
   }

   public final void fyl2x() {
      this.emitX86(INST_CODE.INST_FYL2X);
   }

   public final void roundpd(XMMRegister src, XMMRegister dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_ROUNDPD, dst, src, imm8);
   }

   public final void sete(Mem dst) {
      this.emitX86(INST_CODE.INST_SETE, dst);
   }

   public final void cmovng(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVNG, dst, src);
   }

   public final void psignb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSIGNB, dst, src);
   }

   public final void pcmpgtd(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PCMPGTD, dst, src);
   }

   public final void cmpxchg16b(Mem dst) {
      this.emitX86(INST_CODE.INST_CMPXCHG16B, dst);
   }

   public final void lfence() {
      this.emitX86(INST_CODE.INST_LFENCE);
   }

   public final void psllq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSLLQ, dst, src);
   }

   public final void subsd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_SUBSD, dst, src);
   }

   public final void imul(Register src) {
      this.emitX86(INST_CODE.INST_IMUL, src);
   }

   public final void pmovsxbd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMOVSXBD, dst, src);
   }

   public final void div(Register src) {
      this.emitX86(INST_CODE.INST_DIV, src);
   }

   public final void andnpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ANDNPD, dst, src);
   }

   public final void psraw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PSRAW, dst, src);
   }

   public final void jpe_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JPE_SHORT, label, hint);
   }

   public final void pshufd(XMMRegister imm8, XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSHUFD, dst, src, imm8);
   }

   public final void cmc() {
      this.emitX86(INST_CODE.INST_CMC);
   }

   public final void jnge(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNGE, label, hint);
   }

   public final void jpo_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JPO_SHORT, label, hint);
   }

   public final void addss(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ADDSS, dst, src);
   }

   public final void unpcklps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_UNPCKLPS, dst, src);
   }

   public final void pmovzxwd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVZXWD, dst, src);
   }

   public final void psubq(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBQ, dst, src);
   }

   public final void paddq(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDQ, dst, src);
   }

   public final void punpckhbw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHBW, dst, src);
   }

   public final void sqrtps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_SQRTPS, dst, src);
   }

   public final void ror(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_ROR, dst, src);
   }

   public final void setns(Register dst) {
      this.emitX86(INST_CODE.INST_SETNS, dst);
   }

   public final void psllw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSLLW, dst, src);
   }

   public final void cmovae(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVAE, dst, src);
   }

   public final void paddb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDB, dst, src);
   }

   public final void movhpd(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVHPD, dst, src);
   }

   public final void phaddsw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PHADDSW, dst, src);
   }

   public final void cmovnb(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNB, dst, src);
   }

   public final void phsubsw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PHSUBSW, dst, src);
   }

   public final void psrld(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSRLD, dst, src);
   }

   public final void jnl(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNL, label, hint);
   }

   public final void hsubps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_HSUBPS, dst, src);
   }

   public final void jnc_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNC_SHORT, label, hint);
   }

   public final void movlpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVLPD, dst, src);
   }

   public final void movq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void setnl(Register dst) {
      this.emitX86(INST_CODE.INST_SETNL, dst);
   }

   public final void cmovna(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVNA, dst, src);
   }

   public final void movdqa(Mem dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVDQA, dst, src);
   }

   public final void pshufhw(XMMRegister imm8, Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSHUFHW, dst, src, imm8);
   }

   public final void fcos() {
      this.emitX86(INST_CODE.INST_FCOS);
   }

   public final void jnae_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNAE_SHORT, label, hint);
   }

   public final void pabsb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PABSB, dst, src);
   }

   public final void psubusw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBUSW, dst, src);
   }

   public final void seta(Register dst) {
      this.emitX86(INST_CODE.INST_SETA, dst);
   }

   public final void setnge(Register dst) {
      this.emitX86(INST_CODE.INST_SETNGE, dst);
   }

   public final void fstcw(Mem dst) {
      this.emitX86(INST_CODE.INST_FSTCW, dst);
   }

   public final void ror(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_ROR, dst, src);
   }

   public final void divsd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_DIVSD, dst, src);
   }

   public final void psadbw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSADBW, dst, src);
   }

   public final void shr(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_SHR, dst, src);
   }

   public final void jge_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JGE_SHORT, label, hint);
   }

   public final void fldln2() {
      this.emitX86(INST_CODE.INST_FLDLN2);
   }

   public final void movdq2q(MMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVDQ2Q, dst, src);
   }

   public final void jng(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNG, label, hint);
   }

   public final void pmaxsw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PMAXSW, dst, src);
   }

   public final void pmulhuw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMULHUW, dst, src);
   }

   public final void mpsadbw(XMMRegister dst, Mem src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_MPSADBW, dst, src, imm8);
   }

   public final void cmovo(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVO, dst, src);
   }

   public final void setbe(Register dst) {
      this.emitX86(INST_CODE.INST_SETBE, dst);
   }

   public final void paddusw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDUSW, dst, src);
   }

   public final void setnz(Register dst) {
      this.emitX86(INST_CODE.INST_SETNZ, dst);
   }

   public final void pinsrq(XMMRegister dst, Register imm8, Immediate src) {
      this.emitX86(INST_CODE.INST_PINSRQ, dst, src, imm8);
   }

   public final void faddp(X87Register dst) {
      this.emitX86(INST_CODE.INST_FADDP, dst);
   }

   public final void cmovbe(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVBE, dst, src);
   }

   public final void paddusb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PADDUSB, dst, src);
   }

   public final void sqrtsd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_SQRTSD, dst, src);
   }

   public final void fabs() {
      this.emitX86(INST_CODE.INST_FABS);
   }

   public final void cvttps2pi(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTTPS2PI, dst, src);
   }

   public final void pmullw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMULLW, dst, src);
   }

   public final void fmul(Mem src) {
      this.emitX86(INST_CODE.INST_FMUL, src);
   }

   public final void mulss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MULSS, dst, src);
   }

   public final void psubw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBW, dst, src);
   }

   public final void cvtsd2si(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTSD2SI, dst, src);
   }

   public final void rsqrtps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_RSQRTPS, dst, src);
   }

   public final void movsd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVSD, dst, src);
   }

   public final void setno(Register dst) {
      this.emitX86(INST_CODE.INST_SETNO, dst);
   }

   public final void movaps(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVAPS, dst, src);
   }

   public final void sar(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_SAR, dst, src);
   }

   public final void pmulhrsw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMULHRSW, dst, src);
   }

   public final void popfd() {
      this.emitX86(INST_CODE.INST_POPFD);
   }

   public final void xorps(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_XORPS, dst, src);
   }

   public final void phsubd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PHSUBD, dst, src);
   }

   public final void cmovnle(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVNLE, dst, src);
   }

   public final void pcmpgtb(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PCMPGTB, dst, src);
   }

   public final void pshufb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSHUFB, dst, src);
   }

   public final void fild(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4 && src.size() != 8) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FILD, src);
   }

   public final void pand(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PAND, dst, src);
   }

   public final void pshuflw(XMMRegister src, Mem dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PSHUFLW, dst, src, imm8);
   }

   public final void cvtps2pi(MMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTPS2PI, dst, src);
   }

   public final void cld() {
      this.emitX86(INST_CODE.INST_CLD);
   }

   public final void fdivp(X87Register reg) {
      this.emitX86(INST_CODE.INST_FDIVP, reg);
   }

   public final void pfmul(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFMUL, dst, src);
   }

   public final void phsubsw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PHSUBSW, dst, src);
   }

   public final void sahf() {
      this.emitX86(INST_CODE.INST_SAHF);
   }

   public final void sbb(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_SBB, dst, src);
   }

   public final void divsd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_DIVSD, dst, src);
   }

   public final void movss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVSS, dst, src);
   }

   public final void femms() {
      this.emitX86(INST_CODE.INST_FEMMS);
   }

   public final void unpckhps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_UNPCKHPS, dst, src);
   }

   public final void cmovs(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVS, dst, src);
   }

   public final void pmaxub(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMAXUB, dst, src);
   }

   public final void pcmpeqb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPEQB, dst, src);
   }

   public final void fucomi(X87Register reg) {
      this.emitX86(INST_CODE.INST_FUCOMI, reg);
   }

   public final void imul(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_IMUL, dst, src);
   }

   public final void movdqa(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVDQA, dst, src);
   }

   public final void rol(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_ROL, dst, src);
   }

   public final void movsx(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_MOVSX, dst, src);
   }

   public final void fnclex() {
      this.emitX86(INST_CODE.INST_FNCLEX);
   }

   public final void call(long dst) {
      this.emitX86(INST_CODE.INST_CALL, Immediate.imm(dst));
   }

   public final void fadd(X87Register dst, X87Register src) {
      if (!$assertionsDisabled && dst.index() != 0 && src.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FADD, dst, src);
   }

   public final void shufps(XMMRegister src, XMMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_SHUFPS, dst, src, imm8);
   }

   public final void cmove(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVE, dst, src);
   }

   public final void phaddw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PHADDW, dst, src);
   }

   public final void pfrsqrt(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFRSQRT, dst, src);
   }

   public final void roundps(XMMRegister src, Mem dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_ROUNDPS, dst, src, imm8);
   }

   public final void movlps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVLPS, dst, src);
   }

   public final void haddpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_HADDPD, dst, src);
   }

   public final void bsf(Register src, Register dst) {
      if (!$assertionsDisabled && dst.isRegType(0)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_BSF, dst, src);
   }

   public final void jmp(Immediate dst) {
      this.emitX86(INST_CODE.INST_JMP, dst);
   }

   public final void andps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_ANDPS, dst, src);
   }

   public final void blendps(XMMRegister imm8, Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_BLENDPS, dst, src, imm8);
   }

   public final void paddb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDB, dst, src);
   }

   public final void movntdq(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVNTDQ, dst, src);
   }

   public final void haddps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_HADDPS, dst, src);
   }

   public final void minsd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MINSD, dst, src);
   }

   public final void popcnt(Register src, Register dst) {
      if (!$assertionsDisabled && dst.isRegType(0)) {
         throw new AssertionError();
      }

      if (!$assertionsDisabled && src.type() != dst.type()) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_POPCNT, dst, src);
   }

   public final void adc(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_ADC, dst, src);
   }

   public final void jne(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNE, label, hint);
   }

   public final void addsubps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_ADDSUBPS, dst, src);
   }

   public final void phaddw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PHADDW, dst, src);
   }

   public final void psraw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSRAW, dst, src);
   }

   public final void orps(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ORPS, dst, src);
   }

   public final void bsr(Register src, Mem dst) {
      if (!$assertionsDisabled && dst.isRegType(0)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_BSR, dst, src);
   }

   public final void pminsw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMINSW, dst, src);
   }

   public final void psllw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSLLW, dst, src);
   }

   public final void pmaxsw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMAXSW, dst, src);
   }

   public final void movbe(Mem src, Register dst) {
      if (!$assertionsDisabled && src.isRegType(0)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_MOVBE, dst, src);
   }

   public final void pextrq(Mem dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRQ, dst, src, imm8);
   }

   public final void cvttpd2pi(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTTPD2PI, dst, src);
   }

   public final void xadd(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_XADD, dst, src);
   }

   public final void pslld(MMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSLLD, dst, src);
   }

   public final void dppd(XMMRegister imm8, XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_DPPD, dst, src, imm8);
   }

   public final void jnl_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNL_SHORT, label, hint);
   }

   public final void pmullw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMULLW, dst, src);
   }

   public final void pmuldq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMULDQ, dst, src);
   }

   public final void movapd(Mem dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVAPD, dst, src);
   }

   public final void psraw(MMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSRAW, dst, src);
   }

   public final void jmp(Register dst) {
      this.emitX86(INST_CODE.INST_JMP, dst);
   }

   public final void fld(X87Register reg) {
      this.emitX86(INST_CODE.INST_FLD, reg);
   }

   public final void movups(Mem dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVUPS, dst, src);
   }

   public final void shrd(Register src2, Register src1, Immediate dst) {
      this.emitX86(INST_CODE.INST_SHRD, dst, src1, src2);
   }

   public final void pminub(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PMINUB, dst, src);
   }

   public final void pmovzxbq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVZXBQ, dst, src);
   }

   public final void psubsb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBSB, dst, src);
   }

   public final void sqrtpd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_SQRTPD, dst, src);
   }

   public final void mfence() {
      this.emitX86(INST_CODE.INST_MFENCE);
   }

   public final void pmullw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PMULLW, dst, src);
   }

   public final void jmp(long dst) {
      this.emitX86(INST_CODE.INST_JMP, Immediate.imm(dst));
   }

   public final void pmaxud(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMAXUD, dst, src);
   }

   public final void punpckldq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLDQ, dst, src);
   }

   public final void fimul(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FIMUL, src);
   }

   public final void setnc(Register dst) {
      this.emitX86(INST_CODE.INST_SETNC, dst);
   }

   public final void haddps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_HADDPS, dst, src);
   }

   public final void cmovpe(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVPE, dst, src);
   }

   public final void adc(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_ADC, dst, src);
   }

   public final void btc(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_BTC, dst, src);
   }

   public final void paddsw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PADDSW, dst, src);
   }

   public final void psrld(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSRLD, dst, src);
   }

   public final void cvttps2dq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTTPS2DQ, dst, src);
   }

   public final void punpckldq(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLDQ, dst, src);
   }

   public final void pandn(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PANDN, dst, src);
   }

   public final void sar(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_SAR, dst, src);
   }

   public final void adc(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_ADC, dst, src);
   }

   public final void movntdqa(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVNTDQA, dst, src);
   }

   public final void lock() {
      this.emitX86(INST_CODE.INST_LOCK);
   }

   public final void pmovzxdq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMOVZXDQ, dst, src);
   }

   public final void psrad(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSRAD, dst, src);
   }

   public final void extractps(XMMRegister imm8, Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_EXTRACTPS, dst, src, imm8);
   }

   public final void psrld(MMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSRLD, dst, src);
   }

   public final void pmulhuw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMULHUW, dst, src);
   }

   public final void subps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_SUBPS, dst, src);
   }

   public final void roundps(XMMRegister imm8, XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_ROUNDPS, dst, src, imm8);
   }

   public final void setg(Mem dst) {
      this.emitX86(INST_CODE.INST_SETG, dst);
   }

   public final void fnstcw(Mem dst) {
      this.emitX86(INST_CODE.INST_FNSTCW, dst);
   }

   public final void cmpsd(XMMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_CMPSD, dst, src, imm8);
   }

   public final void psignd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSIGND, dst, src);
   }

   public final void pswapd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSWAPD, dst, src);
   }

   public final void dpps(XMMRegister imm8, Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_DPPS, dst, src, imm8);
   }

   public final void add(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_ADD, dst, src);
   }

   public final void jnz(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNZ, label, hint);
   }

   public final void sets(Mem dst) {
      this.emitX86(INST_CODE.INST_SETS, dst);
   }

   public final void fcomp(X87Register reg) {
      this.emitX86(INST_CODE.INST_FCOMP, reg);
   }

   public final void packsswb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PACKSSWB, dst, src);
   }

   public final void movbe(Register dst, Mem src) {
      if (!$assertionsDisabled && dst.isRegType(0)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_MOVBE, dst, src);
   }

   public final void jnge_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNGE_SHORT, label, hint);
   }

   public final void movq(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void subps(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_SUBPS, dst, src);
   }

   public final void jnb(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNB, label, hint);
   }

   public final void packuswb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PACKUSWB, dst, src);
   }

   public final void psllq(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSLLQ, dst, src);
   }

   public final void fst(Mem dst) {
      if (!$assertionsDisabled && dst.size() != 4 && dst.size() != 8) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FST, dst);
   }

   public final void divss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_DIVSS, dst, src);
   }

   public final void cvtsd2si(Register src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTSD2SI, dst, src);
   }

   public final void phsubw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PHSUBW, dst, src);
   }

   public final void cmpss(XMMRegister imm8, Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_CMPSS, dst, src, imm8);
   }

   public final void sub(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_SUB, dst, src);
   }

   public final void pxor(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PXOR, dst, src);
   }

   public final void paddsb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PADDSB, dst, src);
   }

   public final void psubsw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBSW, dst, src);
   }

   public final void fxam() {
      this.emitX86(INST_CODE.INST_FXAM);
   }

   public final void xchg(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_XCHG, dst, src);
   }

   public final void pi2fw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PI2FW, dst, src);
   }

   public final void fstp(Mem dst) {
      if (!$assertionsDisabled && dst.size() != 4 && dst.size() != 8 && dst.size() != 10) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FSTP, dst);
   }

   public final void jnz_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNZ_SHORT, label, hint);
   }

   public final void pushfq() {
      this.emitX86(INST_CODE.INST_PUSHFQ);
   }

   public final void cmovnge(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVNGE, dst, src);
   }

   public final void cmovnc(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVNC, dst, src);
   }

   public final void mul(Mem src) {
      this.emitX86(INST_CODE.INST_MUL, src);
   }

   public final void movsd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVSD, dst, src);
   }

   public final void fpatan() {
      this.emitX86(INST_CODE.INST_FPATAN);
   }

   public final void ficomp(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FICOMP, src);
   }

   public final void punpcklqdq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PUNPCKLQDQ, dst, src);
   }

   public final void cmovae(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVAE, dst, src);
   }

   public final void psubd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBD, dst, src);
   }

   public final void pcmpeqd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPEQD, dst, src);
   }

   public final void imul(Register dst, Mem src, Immediate imm) {
      this.emitX86(INST_CODE.INST_IMUL, dst, src, imm);
   }

   public final void punpckhwd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PUNPCKHWD, dst, src);
   }

   public final void inc(Register dst) {
      this.emitX86(INST_CODE.INST_INC, dst);
   }

   public final void fldpi() {
      this.emitX86(INST_CODE.INST_FLDPI);
   }

   public final void psignb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSIGNB, dst, src);
   }

   public final void pmovsxbw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMOVSXBW, dst, src);
   }

   public final void movmskpd(Register dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVMSKPD, dst, src);
   }

   public final void movlps(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVLPS, dst, src);
   }

   public final void jle(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JLE, label, hint);
   }

   public final void sbb(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_SBB, dst, src);
   }

   public final void fptan() {
      this.emitX86(INST_CODE.INST_FPTAN);
   }

   public final void fcmovne(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVNE, src);
   }

   public final void paddb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDB, dst, src);
   }

   public final void cvttpd2dq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTTPD2DQ, dst, src);
   }

   public final void f2xm1() {
      this.emitX86(INST_CODE.INST_F2XM1);
   }

   public final void divps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_DIVPS, dst, src);
   }

   public final void punpcklwd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLWD, dst, src);
   }

   public final void pcmpgtw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPGTW, dst, src);
   }

   public final void psllw(MMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSLLW, dst, src);
   }

   public final void call(Mem dst) {
      this.emitX86(INST_CODE.INST_CALL, dst);
   }

   public final void psrad(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSRAD, dst, src);
   }

   public final void unpckhpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_UNPCKHPD, dst, src);
   }

   public final void cmovnz(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVNZ, dst, src);
   }

   public final void lea(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_LEA, dst, src);
   }

   public final void setnge(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNGE, dst);
   }

   public final void fstp(X87Register reg) {
      this.emitX86(INST_CODE.INST_FSTP, reg);
   }

   public final void pcmpeqq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPEQQ, dst, src);
   }

   public final void movq(XMMRegister src, Register dst) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void pfrcpit1(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFRCPIT1, dst, src);
   }

   public final void pcmpgtw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPGTW, dst, src);
   }

   public final void fucomp(X87Register reg) {
      this.emitX86(INST_CODE.INST_FUCOMP, reg);
   }

   public final void setle(Mem dst) {
      this.emitX86(INST_CODE.INST_SETLE, dst);
   }

   public final void addsubpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ADDSUBPD, dst, src);
   }

   public final void shld(Mem src1, Register dst, Immediate src2) {
      this.emitX86(INST_CODE.INST_SHLD, dst, src1, src2);
   }

   public final void pxor(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PXOR, dst, src);
   }

   public final void dec(Register dst) {
      this.emitX86(INST_CODE.INST_DEC, dst);
   }

   public final void psubd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBD, dst, src);
   }

   public final void stc() {
      this.emitX86(INST_CODE.INST_STC);
   }

   public final void pminsw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PMINSW, dst, src);
   }

   public final void pcmpistrm(XMMRegister imm8, XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PCMPISTRM, dst, src, imm8);
   }

   public final void psubw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBW, dst, src);
   }

   public final void jge(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JGE, label, hint);
   }

   public final void pinsrd(XMMRegister dst, Register imm8, Immediate src) {
      this.emitX86(INST_CODE.INST_PINSRD, dst, src, imm8);
   }

   public final void cvtdq2pd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTDQ2PD, dst, src);
   }

   public final void psubsb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSUBSB, dst, src);
   }

   public final void rsqrtss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_RSQRTSS, dst, src);
   }

   public final void fprem() {
      this.emitX86(INST_CODE.INST_FPREM);
   }

   public final void psubb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBB, dst, src);
   }

   public final void andpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ANDPD, dst, src);
   }

   public final void cmp(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_CMP, dst, src);
   }

   public final void movshdup(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVSHDUP, dst, src);
   }

   public final void pcmpeqb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPEQB, dst, src);
   }

   public final void setnz(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNZ, dst);
   }

   public final void pfadd(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFADD, dst, src);
   }

   public final void movdqu(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVDQU, dst, src);
   }

   public final void rcl(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_RCL, dst, src);
   }

   public final void psubq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBQ, dst, src);
   }

   public final void shld(Mem src1, Register src2, Register dst) {
      this.emitX86(INST_CODE.INST_SHLD, dst, src1, src2);
   }

   public final void jmp_short(Label label) {
      this.emitX86(INST_CODE.INST_JMP_SHORT, label);
   }

   public final void psubusb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBUSB, dst, src);
   }

   public final void andnpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ANDNPD, dst, src);
   }

   public final void paddw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDW, dst, src);
   }

   public final void cvtss2si(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTSS2SI, dst, src);
   }

   public final void push(Immediate src) {
      this.emitX86(INST_CODE.INST_PUSH, src);
   }

   public final void ptest(XMMRegister op2, Mem op1) {
      this.emitX86(INST_CODE.INST_PTEST, op1, op2);
   }

   public final void pandn(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PANDN, dst, src);
   }

   public final void fdiv(X87Register src, X87Register dst) {
      if (!$assertionsDisabled && dst.index() != 0 && src.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FDIV, dst, src);
   }

   public final void rol(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_ROL, dst, src);
   }

   public final void jpe(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JPE, label, hint);
   }

   public final void roundsd(XMMRegister src, XMMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_ROUNDSD, dst, src, imm8);
   }

   public final void cmov(CONDITION src, Register dst, Mem cc) {
      this.emitX86(conditionToCMovCC(cc), dst, src);
   }

   public final void xorps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_XORPS, dst, src);
   }

   public final void pi2fd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PI2FD, dst, src);
   }

   public final void psllq(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSLLQ, dst, src);
   }

   public final void popad() {
      this.emitX86(INST_CODE.INST_POPAD);
   }

   public final void cmovbe(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVBE, dst, src);
   }

   public final void pcmpeqb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PCMPEQB, dst, src);
   }

   public final void fucomip(X87Register reg) {
      this.emitX86(INST_CODE.INST_FUCOMIP, reg);
   }

   public final void maskmovq(MMRegister data, MMRegister mask) {
      this.emitX86(INST_CODE.INST_MASKMOVQ, data, mask);
   }

   public final void fsin() {
      this.emitX86(INST_CODE.INST_FSIN);
   }

   public final void psubusw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBUSW, dst, src);
   }

   public final void btr(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_BTR, dst, src);
   }

   public final void pmulhuw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PMULHUW, dst, src);
   }

   public final void phaddd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PHADDD, dst, src);
   }

   public final void fxrstor(Mem src) {
      this.emitX86(INST_CODE.INST_FXRSTOR, src);
   }

   public final void rcr(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_RCR, dst, src);
   }

   public final void pmovsxbq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMOVSXBQ, dst, src);
   }

   public final void fsincos() {
      this.emitX86(INST_CODE.INST_FSINCOS);
   }

   public final void fcmovbe(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVBE, src);
   }

   public final void psadbw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSADBW, dst, src);
   }

   public final void andnps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_ANDNPS, dst, src);
   }

   public final void pslld(XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSLLD, dst, src);
   }

   public final void pmovsxdq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVSXDQ, dst, src);
   }

   public final void cvtpi2ps(XMMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_CVTPI2PS, dst, src);
   }

   public final void fdecstp() {
      this.emitX86(INST_CODE.INST_FDECSTP);
   }

   public final void seta(Mem dst) {
      this.emitX86(INST_CODE.INST_SETA, dst);
   }

   public final void psignb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSIGNB, dst, src);
   }

   public final void setg(Register dst) {
      this.emitX86(INST_CODE.INST_SETG, dst);
   }

   public final void bsf(Register src, Mem dst) {
      if (!$assertionsDisabled && dst.isRegType(0)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_BSF, dst, src);
   }

   public final void setz(Register dst) {
      this.emitX86(INST_CODE.INST_SETZ, dst);
   }

   public final void sal(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_SAL, dst, src);
   }

   public final void pmaxuw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMAXUW, dst, src);
   }

   public final void fdivp() {
      this.fdivp(X87Register.st(1));
   }

   public final void shl(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_SHL, dst, src);
   }

   public final void pextrq(Register dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRQ, dst, src, imm8);
   }

   public final void cmovne(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVNE, dst, src);
   }

   public final void punpckhdq(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PUNPCKHDQ, dst, src);
   }

   public final void daa() {
      this.emitX86(INST_CODE.INST_DAA);
   }

   public final void fmulp(X87Register dst) {
      this.emitX86(INST_CODE.INST_FMULP, dst);
   }

   public final void psubd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBD, dst, src);
   }

   public final void div(Mem src) {
      this.emitX86(INST_CODE.INST_DIV, src);
   }

   public final void phsubd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PHSUBD, dst, src);
   }

   public final void set(CONDITION dst, Mem cc) {
      this.emitX86(conditionToSetCC(cc), dst);
   }

   public final void shl(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_SHL, dst, src);
   }

   public final void pavgw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PAVGW, dst, src);
   }

   public final void fscale() {
      this.emitX86(INST_CODE.INST_FSCALE);
   }

   public final void j(CONDITION cc, Label hint, int label) {
      this._emitJcc(conditionToJCC(cc), label, hint);
   }

   public final void mulsd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MULSD, dst, src);
   }

   public final void rcr(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_RCR, dst, src);
   }

   public final void cvtsi2ss(XMMRegister dst, Register src) {
      this.emitX86(INST_CODE.INST_CVTSI2SS, dst, src);
   }

   public final void cvtpd2ps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTPD2PS, dst, src);
   }

   public final void cvtpd2pi(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTPD2PI, dst, src);
   }

   public final void jg_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JG_SHORT, label, hint);
   }

   public final void sqrtpd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_SQRTPD, dst, src);
   }

   public final void pf2id(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PF2ID, dst, src);
   }

   public final void maxps(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MAXPS, dst, src);
   }

   public final void pinsrw(MMRegister dst, Register src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PINSRW, dst, src, imm8);
   }

   public final void jna_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNA_SHORT, label, hint);
   }

   public final void fcomip(X87Register reg) {
      this.emitX86(INST_CODE.INST_FCOMIP, reg);
   }

   public final void fsave(Mem dst) {
      this.emitX86(INST_CODE.INST_FSAVE, dst);
   }

   public final void psrld(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSRLD, dst, src);
   }

   public final void paddusb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDUSB, dst, src);
   }

   public final void pfmin(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFMIN, dst, src);
   }

   public final void rsqrtps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_RSQRTPS, dst, src);
   }

   public final void fsubp() {
      this.emitX86(INST_CODE.INST_FSUBP, X87Register.st(1));
   }

   public final void jnc(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNC, label, hint);
   }

   public final void pminuw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMINUW, dst, src);
   }

   public final void fxtract() {
      this.emitX86(INST_CODE.INST_FXTRACT);
   }

   public final void shufps(XMMRegister imm8, Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_SHUFPS, dst, src, imm8);
   }

   public final void setnle(Register dst) {
      this.emitX86(INST_CODE.INST_SETNLE, dst);
   }

   public final void cwde() {
      this.emitX86(INST_CODE.INST_CWDE);
   }

   public final void sar(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_SAR, dst, src);
   }

   public final void xorpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_XORPD, dst, src);
   }

   public final void pandn(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PANDN, dst, src);
   }

   public final void pshufhw(XMMRegister imm8, XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSHUFHW, dst, src, imm8);
   }

   public final void pavgw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PAVGW, dst, src);
   }

   public final void pcmpgtw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PCMPGTW, dst, src);
   }

   public final void fcomi(X87Register reg) {
      this.emitX86(INST_CODE.INST_FCOMI, reg);
   }

   public final void punpckhqdq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHQDQ, dst, src);
   }

   public final void jnbe_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNBE_SHORT, label, hint);
   }

   public final void jo_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JO_SHORT, label, hint);
   }

   public final void bsr(Register src, Register dst) {
      if (!$assertionsDisabled && dst.isRegType(0)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_BSR, dst, src);
   }

   public final void setle(Register dst) {
      this.emitX86(INST_CODE.INST_SETLE, dst);
   }

   public final void pinsrw(MMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_PINSRW, dst, src, imm8);
   }

   public final void pmaxsb(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMAXSB, dst, src);
   }

   public final void pmulhrsw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMULHRSW, dst, src);
   }

   public final void cmovnge(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNGE, dst, src);
   }

   public final void cvtss2si(Register dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTSS2SI, dst, src);
   }

   public final void psrad(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PSRAD, dst, src);
   }

   public final void sub(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_SUB, dst, src);
   }

   public final void cvttpd2dq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTTPD2DQ, dst, src);
   }

   public final void setnp(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNP, dst);
   }

   public final void packuswb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PACKUSWB, dst, src);
   }

   public final void pmovzxbq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMOVZXBQ, dst, src);
   }

   public final void blendvps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_BLENDVPS, dst, src);
   }

   public final void shr(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_SHR, dst, src);
   }

   public final void fcmovnu(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVNU, src);
   }

   public final void setb(Register dst) {
      this.emitX86(INST_CODE.INST_SETB, dst);
   }

   public final void andpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ANDPD, dst, src);
   }

   public final void movntq(Mem src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVNTQ, dst, src);
   }

   public final void jbe_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JBE_SHORT, label, hint);
   }

   public final void paddw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDW, dst, src);
   }

   public final void orpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ORPD, dst, src);
   }

   public final void pmovzxbw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMOVZXBW, dst, src);
   }

   public final void pmaxsw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMAXSW, dst, src);
   }

   public final void sub(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_SUB, dst, src);
   }

   public final void shrd(Register dst, Register src1, Register src2) {
      this.emitX86(INST_CODE.INST_SHRD, dst, src1, src2);
   }

   public final void blendvpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_BLENDVPD, dst, src);
   }

   public final void ficom(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FICOM, src);
   }

   public final void fiadd(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FIADD, src);
   }

   public final void jo(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JO, label, hint);
   }

   public final void imul(Mem src) {
      this.emitX86(INST_CODE.INST_IMUL, src);
   }

   public final void setnbe(Register dst) {
      this.emitX86(INST_CODE.INST_SETNBE, dst);
   }

   public final void paddsb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDSB, dst, src);
   }

   public final void cmovle(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVLE, dst, src);
   }

   public final void setna(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNA, dst);
   }

   public final void jnp_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNP_SHORT, label, hint);
   }

   public final void pshufw(MMRegister dst, MMRegister imm8, Immediate src) {
      this.emitX86(INST_CODE.INST_PSHUFW, dst, src, imm8);
   }

   public final void fcompp() {
      this.emitX86(INST_CODE.INST_FCOMPP);
   }

   public final void movsxd(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_MOVSXD, dst, src);
   }

   public final void pabsb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PABSB, dst, src);
   }

   public final void punpckhdq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHDQ, dst, src);
   }

   public final void idiv(Mem src) {
      this.emitX86(INST_CODE.INST_IDIV, src);
   }

   public final void cmovb(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVB, dst, src);
   }

   public final void setnle(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNLE, dst);
   }

   public final void paddw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDW, dst, src);
   }

   public final void push(Register src) {
      this.emitX86(INST_CODE.INST_PUSH, src);
   }

   public final void bswap(Register dst) {
      if (!$assertionsDisabled && dst.type() != 32 && dst.type() != 48) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_BSWAP, dst);
   }

   public final void bt(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_BT, dst, src);
   }

   public final void psraw(XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSRAW, dst, src);
   }

   public final void movaps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVAPS, dst, src);
   }

   public final void movshdup(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVSHDUP, dst, src);
   }

   public final void cvttps2pi(MMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTTPS2PI, dst, src);
   }

   public final void pcmpeqb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PCMPEQB, dst, src);
   }

   public final void jl(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JL, label, hint);
   }

   public final void cmovno(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVNO, dst, src);
   }

   public final void cmovpo(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVPO, dst, src);
   }

   public final void ucomisd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_UCOMISD, dst, src);
   }

   public final void fld1() {
      this.emitX86(INST_CODE.INST_FLD1);
   }

   public final void paddq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDQ, dst, src);
   }

   public final void shld(Register dst, Register src1, Register src2) {
      this.emitX86(INST_CODE.INST_SHLD, dst, src1, src2);
   }

   public final void paddsb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PADDSB, dst, src);
   }

   public final void crc32(Register dst, Mem src) {
      if (!$assertionsDisabled && !dst.isRegType(32) && !dst.isRegType(48)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_CRC32, dst, src);
   }

   public final void movss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVSS, dst, src);
   }

   public final void push(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != (this.is64() ? 8 : 4)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_PUSH, src);
   }

   public final void adc(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_ADC, dst, src);
   }

   public final void cmovnbe(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVNBE, dst, src);
   }

   public final void punpckhdq(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHDQ, dst, src);
   }

   public final void cvtpi2pd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTPI2PD, dst, src);
   }

   public final void psubusb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBUSB, dst, src);
   }

   public final void psrlq(MMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSRLQ, dst, src);
   }

   public final void movmskps(Register dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVMSKPS, dst, src);
   }

   public final void phsubsw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PHSUBSW, dst, src);
   }

   public final void cmovp(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVP, dst, src);
   }

   public final void setng(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNG, dst);
   }

   public final void pmovsxwd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVSXWD, dst, src);
   }

   public final void minsd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MINSD, dst, src);
   }

   public final void movaps(Mem dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVAPS, dst, src);
   }

   public final void pextrw(Register dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRW, dst, src, imm8);
   }

   public final void setnae(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNAE, dst);
   }

   public final void cmovl(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVL, dst, src);
   }

   public final void shr(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_SHR, dst, src);
   }

   public final void psubb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBB, dst, src);
   }

   public final void fisttp(Mem dst) {
      this.emitX86(INST_CODE.INST_FISTTP, dst);
   }

   public final void fcom(Mem src) {
      this.emitX86(INST_CODE.INST_FCOM, src);
   }

   public final void psrlw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSRLW, dst, src);
   }

   public final void psignd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSIGND, dst, src);
   }

   public final void pextrb(Mem dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRB, dst, src, imm8);
   }

   public final void cvttsd2si(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTTSD2SI, dst, src);
   }

   public final void pandn(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PANDN, dst, src);
   }

   public final void punpcklbw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLBW, dst, src);
   }

   public final void pinsrw(XMMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_PINSRW, dst, src, imm8);
   }

   public final void fstenv(Mem dst) {
      this.emitX86(INST_CODE.INST_FSTENV, dst);
   }

   public final void phsubsw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PHSUBSW, dst, src);
   }

   public final void jnle_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNLE_SHORT, label, hint);
   }

   public final void punpckhbw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHBW, dst, src);
   }

   public final void phminposuw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PHMINPOSUW, dst, src);
   }

   public final void movq2dq(XMMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVQ2DQ, dst, src);
   }

   public final void pminsd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMINSD, dst, src);
   }

   public final void pabsw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PABSW, dst, src);
   }

   public final void pmulhrsw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PMULHRSW, dst, src);
   }

   public final void jae(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JAE, label, hint);
   }

   public final void pause() {
      this.emitX86(INST_CODE.INST_PAUSE);
   }

   public final void bts(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_BTS, dst, src);
   }

   public final void cmpxchg(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_CMPXCHG, dst, src);
   }

   public final void pmullw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMULLW, dst, src);
   }

   public final void mwait() {
      this.emitX86(INST_CODE.INST_MWAIT);
   }

   public final void hsubpd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_HSUBPD, dst, src);
   }

   public final void sqrtss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_SQRTSS, dst, src);
   }

   public final void setb(Mem dst) {
      this.emitX86(INST_CODE.INST_SETB, dst);
   }

   public final void movups(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVUPS, dst, src);
   }

   public final void inc(Mem dst) {
      this.emitX86(INST_CODE.INST_INC, dst);
   }

   public final void divpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_DIVPD, dst, src);
   }

   public final void paddsw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDSW, dst, src);
   }

   public final void setl(Mem dst) {
      this.emitX86(INST_CODE.INST_SETL, dst);
   }

   public final void addpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ADDPD, dst, src);
   }

   public final void add(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_ADD, dst, src);
   }

   public final void fldl2t() {
      this.emitX86(INST_CODE.INST_FLDL2T);
   }

   public final void fchs() {
      this.emitX86(INST_CODE.INST_FCHS);
   }

   public final void phaddw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PHADDW, dst, src);
   }

   public final void movddup(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVDDUP, dst, src);
   }

   public final void movhps(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVHPS, dst, src);
   }

   public final void pmuldq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMULDQ, dst, src);
   }

   public final void palignr(XMMRegister src, XMMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_PALIGNR, dst, src, imm8);
   }

   public final void pfacc(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFACC, dst, src);
   }

   public final void mulss(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MULSS, dst, src);
   }

   public final void fsubrp() {
      this.emitX86(INST_CODE.INST_FSUBRP, X87Register.st(1));
   }

   public final void fldlg2() {
      this.emitX86(INST_CODE.INST_FLDLG2);
   }

   public final void phsubd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PHSUBD, dst, src);
   }

   public final void paddd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PADDD, dst, src);
   }

   public final void cvtdq2ps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_CVTDQ2PS, dst, src);
   }

   public final void bt(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_BT, dst, src);
   }

   public final void mulps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MULPS, dst, src);
   }

   public final void setae(Register dst) {
      this.emitX86(INST_CODE.INST_SETAE, dst);
   }

   public final void pmovsxbw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVSXBW, dst, src);
   }

   public final void pmaddwd(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PMADDWD, dst, src);
   }

   public final void roundss(XMMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_ROUNDSS, dst, src, imm8);
   }

   public final void pmovmskb(Register src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVMSKB, dst, src);
   }

   public final void punpcklbw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PUNPCKLBW, dst, src);
   }

   public final void std() {
      this.emitX86(INST_CODE.INST_STD);
   }

   public final void jz(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JZ, label, hint);
   }

   public final void setns(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNS, dst);
   }

   public final void phaddw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PHADDW, dst, src);
   }

   public final void cmovge(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVGE, dst, src);
   }

   public final void psubq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBQ, dst, src);
   }

   public final void btr(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_BTR, dst, src);
   }

   public final void shl(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_SHL, dst, src);
   }

   public final void movsxd(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVSXD, dst, src);
   }

   public final void setnl(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNL, dst);
   }

   public final void setnb(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNB, dst);
   }

   public final void psrlq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSRLQ, dst, src);
   }

   public final void pf2iw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PF2IW, dst, src);
   }

   public final void pabsd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PABSD, dst, src);
   }

   public final void neg(Mem dst) {
      this.emitX86(INST_CODE.INST_NEG, dst);
   }

   public final void fstsw(Register dst) {
      if (!$assertionsDisabled && !dst.isRegCode(16)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FSTSW, dst);
   }

   public final void pcmpgtd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPGTD, dst, src);
   }

   public final void pmovzxwq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMOVZXWQ, dst, src);
   }

   public final void bts(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_BTS, dst, src);
   }

   public final void addpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ADDPD, dst, src);
   }

   public final void pmovsxdq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMOVSXDQ, dst, src);
   }

   public final void comiss(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_COMISS, dst, src);
   }

   public final void xchg(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_XCHG, src, dst);
   }

   public final void pmaxub(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMAXUB, dst, src);
   }

   public final void sal(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_SAL, dst, src);
   }

   public final void clflush(Mem mem) {
      this.emitX86(INST_CODE.INST_CLFLUSH, mem);
   }

   public final void cmovpo(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVPO, dst, src);
   }

   public final void jb(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JB, label, hint);
   }

   public final void psubusb(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSUBUSB, dst, src);
   }

   public final void movnti(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_MOVNTI, dst, src);
   }

   public final void fsubp(X87Register dst) {
      this.emitX86(INST_CODE.INST_FSUBP, dst);
   }

   public final void pblendvb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PBLENDVB, dst, src);
   }

   public final void prefetch(Mem mem, Immediate hint) {
      this.emitX86(INST_CODE.INST_PREFETCH, mem, hint);
   }

   public final void roundpd(XMMRegister dst, Mem src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_ROUNDPD, dst, src, imm8);
   }

   public final void pop(Mem dst) {
      if (!$assertionsDisabled && dst.size() != 2 && dst.size() != (this.is64() ? 8 : 4)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_POP, dst);
   }

   public final void punpcklqdq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLQDQ, dst, src);
   }

   public final void pmovsxwd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMOVSXWD, dst, src);
   }

   public final void and_(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_AND, dst, src);
   }

   public final void pfcmpeq(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFCMPEQ, dst, src);
   }

   public final void punpckhdq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHDQ, dst, src);
   }

   public final void setne(Mem dst) {
      this.emitX86(INST_CODE.INST_SETNE, dst);
   }

   public final void comiss(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_COMISS, dst, src);
   }

   public final void cmovs(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVS, dst, src);
   }

   public final void mul(Register src) {
      this.emitX86(INST_CODE.INST_MUL, src);
   }

   public final void adc(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_ADC, dst, src);
   }

   public final void jne_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JNE_SHORT, label, hint);
   }

   public final void movzx(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVZX, dst, src);
   }

   public final void setp(Register dst) {
      this.emitX86(INST_CODE.INST_SETP, dst);
   }

   public final void fistp(Mem dst) {
      if (!$assertionsDisabled && dst.size() != 2 && dst.size() != 4 && dst.size() != 8) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FISTP, dst);
   }

   public final void blendpd(XMMRegister src, Mem imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_BLENDPD, dst, src, imm8);
   }

   public final void pfmul(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PFMUL, dst, src);
   }

   public final void pinsrb(XMMRegister src, Register imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_PINSRB, dst, src, imm8);
   }

   public final void crc32(Register src, Register dst) {
      if (!$assertionsDisabled && !dst.isRegType(32) && !dst.isRegType(48)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_CRC32, dst, src);
   }

   public final void and_(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_AND, dst, src);
   }

   public final void minss(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MINSS, dst, src);
   }

   public final void jmp(Label label) {
      this.emitX86(INST_CODE.INST_JMP, label);
   }

   public final void pslld(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSLLD, dst, src);
   }

   public final void cmpps(XMMRegister imm8, XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_CMPPS, dst, src, imm8);
   }

   public final void fdiv(Mem src) {
      this.emitX86(INST_CODE.INST_FDIV, src);
   }

   public final void or_(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_OR, dst, src);
   }

   public final void pop(Register dst) {
      if (!$assertionsDisabled && !dst.isRegType(16) && !dst.isRegType(this.is64() ? 48 : 32)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_POP, dst);
   }

   public final void pshufd(XMMRegister dst, Mem src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PSHUFD, dst, src, imm8);
   }

   public final void andnps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_ANDNPS, dst, src);
   }

   public final void pf2iw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PF2IW, dst, src);
   }

   public final void clc() {
      this.emitX86(INST_CODE.INST_CLC);
   }

   public final void mov_ptr(Register dst, long src) {
      if (!$assertionsDisabled && dst.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_MOV_PTR, dst, Immediate.imm(src));
   }

   public final void movdqu(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVDQU, dst, src);
   }

   public final void pcmpeqw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPEQW, dst, src);
   }

   public final void cmovpe(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVPE, dst, src);
   }

   public final void pmovzxbw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVZXBW, dst, src);
   }

   public final void cmovng(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNG, dst, src);
   }

   public final void cmova(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVA, dst, src);
   }

   public final void fdivrp() {
      this.emitX86(INST_CODE.INST_FDIVRP, X87Register.st(1));
   }

   public final void fld(Mem src) {
      if (!$assertionsDisabled && src.size() != 4 && src.size() != 8 && src.size() != 10) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FLD, src);
   }

   public final void amd_prefetch(Mem mem) {
      this.emitX86(INST_CODE.INST_AMD_PREFETCH, mem);
   }

   public final void packssdw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PACKSSDW, dst, src);
   }

   public final void psllw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSLLW, dst, src);
   }

   public final void pmaxsb(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMAXSB, dst, src);
   }

   public final void subpd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_SUBPD, dst, src);
   }

   public final void popfq() {
      this.emitX86(INST_CODE.INST_POPFQ);
   }

   public final void paddusw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDUSW, dst, src);
   }

   public final void sar(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_SAR, dst, src);
   }

   public final void movd(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void cmovns(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNS, dst, src);
   }

   public final void btr(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_BTR, dst, src);
   }

   public final void psllw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSLLW, dst, src);
   }

   public final void addsd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_ADDSD, dst, src);
   }

   public final void pminud(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMINUD, dst, src);
   }

   public final void paddd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PADDD, dst, src);
   }

   public final void pmovzxbd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVZXBD, dst, src);
   }

   public final void jno(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNO, label, hint);
   }

   public final void movd(Mem src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void pcmpestrm(XMMRegister dst, XMMRegister imm8, Immediate src) {
      this.emitX86(INST_CODE.INST_PCMPESTRM, dst, src, imm8);
   }

   public final void pmulhw(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMULHW, dst, src);
   }

   public final void cvtsi2sd(XMMRegister dst, Register src) {
      this.emitX86(INST_CODE.INST_CVTSI2SD, dst, src);
   }

   public final void pavgb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PAVGB, dst, src);
   }

   public final void psraw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSRAW, dst, src);
   }

   public final void pminsd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMINSD, dst, src);
   }

   public final void maxpd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MAXPD, dst, src);
   }

   public final void cvtps2dq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTPS2DQ, dst, src);
   }

   public final void rol(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_ROL, dst, src);
   }

   public final void palignr(MMRegister src, MMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_PALIGNR, dst, src, imm8);
   }

   public final void pmaxub(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMAXUB, dst, src);
   }

   public final void pinsrq(XMMRegister imm8, Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PINSRQ, dst, src, imm8);
   }

   public final void cmovnp(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVNP, dst, src);
   }

   public final void test(Mem op2, Immediate op1) {
      this.emitX86(INST_CODE.INST_TEST, op1, op2);
   }

   public final void por(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_POR, dst, src);
   }

   public final void pminub(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMINUB, dst, src);
   }

   public final void setl(Register dst) {
      this.emitX86(INST_CODE.INST_SETL, dst);
   }

   public final void psllq(XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSLLQ, dst, src);
   }

   public final void pfmax(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFMAX, dst, src);
   }

   public final void sfence() {
      this.emitX86(INST_CODE.INST_SFENCE);
   }

   public final void cvtps2pd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTPS2PD, dst, src);
   }

   public final void jc(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JC, label, hint);
   }

   public final void comisd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_COMISD, dst, src);
   }

   public final void enter(Immediate imm8, Immediate imm16) {
      this.emitX86(INST_CODE.INST_ENTER, imm16, imm8);
   }

   public final void and_(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_AND, dst, src);
   }

   public final void pabsw(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PABSW, dst, src);
   }

   public final void pmulld(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMULLD, dst, src);
   }

   public final void psignw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSIGNW, dst, src);
   }

   public final void cvtsi2ss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTSI2SS, dst, src);
   }

   public final void pminub(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMINUB, dst, src);
   }

   public final void fnsave(Mem dst) {
      this.emitX86(INST_CODE.INST_FNSAVE, dst);
   }

   public final void movq(Register src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVQ, dst, src);
   }

   public final void punpckhwd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PUNPCKHWD, dst, src);
   }

   public final void movd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MOVD, dst, src);
   }

   public final void blendps(XMMRegister dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_BLENDPS, dst, src, imm8);
   }

   public final void pfsubr(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PFSUBR, dst, src);
   }

   public final void cmpxchg(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMPXCHG, dst, src);
   }

   public final void unpcklpd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_UNPCKLPD, dst, src);
   }

   public final void cvttsd2si(Register dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_CVTTSD2SI, dst, src);
   }

   public final void psrlw(XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSRLW, dst, src);
   }

   public final void pabsb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PABSB, dst, src);
   }

   public final void bt(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_BT, dst, src);
   }

   public final void pswapd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSWAPD, dst, src);
   }

   public final void unpckhpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_UNPCKHPD, dst, src);
   }

   public final void mulpd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MULPD, dst, src);
   }

   public final void js_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JS_SHORT, label, hint);
   }

   public final void btc(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_BTC, dst, src);
   }

   public final void movss(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVSS, dst, src);
   }

   public final void punpckhwd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHWD, dst, src);
   }

   public final void cmovno(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVNO, dst, src);
   }

   public final void pavgb(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PAVGB, dst, src);
   }

   public final void movlhps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVLHPS, dst, src);
   }

   public final void faddp() {
      this.faddp(X87Register.st(1));
   }

   public final void xchg(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_XCHG, dst, src);
   }

   public final void pmulhw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMULHW, dst, src);
   }

   public final void mov(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_MOV, dst, src);
   }

   public final void jmp(Mem dst) {
      this.emitX86(INST_CODE.INST_JMP, dst);
   }

   public final void popcnt(Register src, Mem dst) {
      if (!$assertionsDisabled && dst.isRegType(0)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_POPCNT, dst, src);
   }

   public final void cvtpi2pd(XMMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_CVTPI2PD, dst, src);
   }

   public final void psubq(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSUBQ, dst, src);
   }

   public final void phaddd(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PHADDD, dst, src);
   }

   public final void idiv(Register src) {
      this.emitX86(INST_CODE.INST_IDIV, src);
   }

   public final void comisd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_COMISD, dst, src);
   }

   public final void divps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_DIVPS, dst, src);
   }

   public final void test(Register op1, Register op2) {
      this.emitX86(INST_CODE.INST_TEST, op1, op2);
   }

   public final void pextrb(Register src, XMMRegister dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PEXTRB, dst, src, imm8);
   }

   public final void psraw(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PSRAW, dst, src);
   }

   public final void add(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_ADD, dst, src);
   }

   public final void cmovle(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVLE, dst, src);
   }

   public final void pmovsxbq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PMOVSXBQ, dst, src);
   }

   public final void cvtdq2ps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTDQ2PS, dst, src);
   }

   public final void btc(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_BTC, dst, src);
   }

   public final void ptest(XMMRegister op2, XMMRegister op1) {
      this.emitX86(INST_CODE.INST_PTEST, op1, op2);
   }

   public final void and_(Mem src, Register dst) {
      this.emitX86(INST_CODE.INST_AND, dst, src);
   }

   public final void jp_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JP_SHORT, label, hint);
   }

   public final void cvtss2sd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTSS2SD, dst, src);
   }

   public final void pi2fw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PI2FW, dst, src);
   }

   public final void pfpnaxx(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PFPNACC, dst, src);
   }

   public final void cvtpd2dq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTPD2DQ, dst, src);
   }

   public final void subss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_SUBSS, dst, src);
   }

   public final void pmuludq(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PMULUDQ, dst, src);
   }

   public final void pavgb(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PAVGB, dst, src);
   }

   public final void pmovzxdq(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PMOVZXDQ, dst, src);
   }

   public final void setpe(Mem dst) {
      this.emitX86(INST_CODE.INST_SETPE, dst);
   }

   public final void pmulhrsw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMULHRSW, dst, src);
   }

   public final void roundss(XMMRegister dst, XMMRegister src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_ROUNDSS, dst, src, imm8);
   }

   public final void fsqrt() {
      this.emitX86(INST_CODE.INST_FSQRT);
   }

   public final void pcmpistri(XMMRegister src, Mem dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PCMPISTRI, dst, src, imm8);
   }

   public final void pcmpeqq(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PCMPEQQ, dst, src);
   }

   public final void setne(Register dst) {
      this.emitX86(INST_CODE.INST_SETNE, dst);
   }

   public final void ucomiss(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_UCOMISS, dst, src);
   }

   public final void js(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JS, label, hint);
   }

   public final void frndint() {
      this.emitX86(INST_CODE.INST_FRNDINT);
   }

   public final void blendpd(XMMRegister src, XMMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_BLENDPD, dst, src, imm8);
   }

   public final void sqrtss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_SQRTSS, dst, src);
   }

   public final void monitor() {
      this.emitX86(INST_CODE.INST_MONITOR);
   }

   public final void and_(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_AND, dst, src);
   }

   public final void pand(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PAND, dst, src);
   }

   public final void pmovsxwq(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMOVSXWQ, dst, src);
   }

   public final void cmovnp(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNP, dst, src);
   }

   public final void psignb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSIGNB, dst, src);
   }

   public final void mov(Mem src, Immediate dst) {
      this.emitX86(INST_CODE.INST_MOV, dst, src);
   }

   public final void maxss(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_MAXSS, dst, src);
   }

   public final void ud2() {
      this.emitX86(INST_CODE.INST_UD2);
   }

   public final void cmovns(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVNS, dst, src);
   }

   public final void rcl(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_RCL, dst, src);
   }

   public final void xor_(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_XOR, dst, src);
   }

   public final void psubsb(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_PSUBSB, dst, src);
   }

   public final void cvtps2pd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTPS2PD, dst, src);
   }

   public final void psllq(MMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_PSLLQ, dst, src);
   }

   public final void fninit() {
      this.emitX86(INST_CODE.INST_FNINIT);
   }

   public final void movsldup(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVSLDUP, dst, src);
   }

   public final void movapd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_MOVAPD, dst, src);
   }

   public final void movupd(Mem src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MOVUPD, dst, src);
   }

   public final void pmaxuw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMAXUW, dst, src);
   }

   public final void cmovnle(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMOVNLE, dst, src);
   }

   public final void cmppd(XMMRegister src, XMMRegister imm8, Immediate dst) {
      this.emitX86(INST_CODE.INST_CMPPD, dst, src, imm8);
   }

   public final void dpps(XMMRegister imm8, XMMRegister src, Immediate dst) {
      this.emitX86(INST_CODE.INST_DPPS, dst, src, imm8);
   }

   public final void pblendw(XMMRegister dst, Mem src, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PBLENDW, dst, src, imm8);
   }

   public final void stmxcsr(Mem dst) {
      this.emitX86(INST_CODE.INST_STMXCSR, dst);
   }

   public final void fcmovnb(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVNB, src);
   }

   public final void fucom(X87Register reg) {
      this.emitX86(INST_CODE.INST_FUCOM, reg);
   }

   public final void cmovnbe(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNBE, dst, src);
   }

   public final void or_(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_OR, dst, src);
   }

   public final void call(Register dst) {
      if (!$assertionsDisabled && !dst.isRegType(this.is64() ? 48 : 32)) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_CALL, dst);
   }

   public final void pmaxsd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMAXSD, dst, src);
   }

   public final void pfrcpit1(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFRCPIT1, dst, src);
   }

   public final void pfrsqit1(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PFRSQIT1, dst, src);
   }

   public final void seto(Mem dst) {
      this.emitX86(INST_CODE.INST_SETO, dst);
   }

   public final void psrlw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PSRLW, dst, src);
   }

   public final void cmp(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_CMP, dst, src);
   }

   public final void rcr(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_RCR, dst, src);
   }

   public final void pcmpgtq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PCMPGTQ, dst, src);
   }

   public final void test(Mem op1, Register op2) {
      this.emitX86(INST_CODE.INST_TEST, op1, op2);
   }

   public final void paddb(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PADDB, dst, src);
   }

   public final void pminsw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMINSW, dst, src);
   }

   public final void imul(Register imm, Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_IMUL, dst, src, imm);
   }

   public final void emms() {
      this.emitX86(INST_CODE.INST_EMMS);
   }

   public final void pmaxub(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PMAXUB, dst, src);
   }

   public final void sub(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_SUB, dst, src);
   }

   public final void psllw(XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSLLW, dst, src);
   }

   public final void cmovnl(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVNL, dst, src);
   }

   public final void punpckhqdq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKHQDQ, dst, src);
   }

   public final void pmaddubsw(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMADDUBSW, dst, src);
   }

   public final void psignw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSIGNW, dst, src);
   }

   public final void cmovz(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVZ, dst, src);
   }

   public final void divss(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_DIVSS, dst, src);
   }

   public final void rcpps(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_RCPPS, dst, src);
   }

   public final void pshufb(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PSHUFB, dst, src);
   }

   public final void cmovc(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVC, dst, src);
   }

   public final void pmovzxwd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMOVZXWD, dst, src);
   }

   public final void packusdw(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PACKUSDW, dst, src);
   }

   public final void pushfd() {
      this.emitX86(INST_CODE.INST_PUSHFD);
   }

   public final void minpd(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_MINPD, dst, src);
   }

   public final void pabsd(MMRegister src, MMRegister dst) {
      this.emitX86(INST_CODE.INST_PABSD, dst, src);
   }

   public final void fcmovu(X87Register src) {
      this.emitX86(INST_CODE.INST_FCMOVU, src);
   }

   public final void pmaddubsw(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PMADDUBSW, dst, src);
   }

   public final void pfsub(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFSUB, dst, src);
   }

   public final void mov(Register dst, Register src) {
      this.emitX86(INST_CODE.INST_MOV, dst, src);
   }

   public final void setnb(Register dst) {
      this.emitX86(INST_CODE.INST_SETNB, dst);
   }

   public final void fidivr(Mem src) {
      if (!$assertionsDisabled && src.size() != 2 && src.size() != 4) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FIDIVR, src);
   }

   public final void int3() {
      this.emitX86(INST_CODE.INST_INT3);
   }

   public final void punpckldq(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PUNPCKLDQ, dst, src);
   }

   public final void pmulhuw(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMULHUW, dst, src);
   }

   public final void pminub(MMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_PMINUB, dst, src);
   }

   public final void paddusb(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PADDUSB, dst, src);
   }

   public final void pfpnacc(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFPNACC, dst, src);
   }

   public final void call(Immediate dst) {
      this.emitX86(INST_CODE.INST_CALL, dst);
   }

   public final void hsubpd(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_HSUBPD, dst, src);
   }

   public final void packusdw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PACKUSDW, dst, src);
   }

   public final void fprem1() {
      this.emitX86(INST_CODE.INST_FPREM1);
   }

   public final void phminposuw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PHMINPOSUW, dst, src);
   }

   public final void frstor(Mem src) {
      this.emitX86(INST_CODE.INST_FRSTOR, src);
   }

   public final void cmovna(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_CMOVNA, dst, src);
   }

   public final void maxsd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MAXSD, dst, src);
   }

   public final void pmulld(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMULLD, dst, src);
   }

   public final void cvtps2dq(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_CVTPS2DQ, dst, src);
   }

   public final void neg(Register dst) {
      this.emitX86(INST_CODE.INST_NEG, dst);
   }

   public final void sal(Register src, Immediate dst) {
      this.emitX86(INST_CODE.INST_SAL, dst, src);
   }

   public final void fucom() {
      this.emitX86(INST_CODE.INST_FUCOM, X87Register.st(1));
   }

   public final void addps(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ADDPS, dst, src);
   }

   public final void xorpd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_XORPD, dst, src);
   }

   public final void fsub(X87Register src, X87Register dst) {
      if (!$assertionsDisabled && dst.index() != 0 && src.index() != 0) {
         throw new AssertionError();
      }

      this.emitX86(INST_CODE.INST_FSUB, dst, src);
   }

   public final void jnae(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNAE, label, hint);
   }

   public final void pmovzxbd(XMMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PMOVZXBD, dst, src);
   }

   public final void bts(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_BTS, dst, src);
   }

   public final void cvtpd2ps(XMMRegister src, XMMRegister dst) {
      this.emitX86(INST_CODE.INST_CVTPD2PS, dst, src);
   }

   public final void addss(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_ADDSS, dst, src);
   }

   public final void pfrcpit2(MMRegister dst, Mem src) {
      this.emitX86(INST_CODE.INST_PFRCPIT2, dst, src);
   }

   public final void fnstsw(Mem dst) {
      this.emitX86(INST_CODE.INST_FNSTSW, dst);
   }

   public final void cmp(Mem dst, Register src) {
      this.emitX86(INST_CODE.INST_CMP, dst, src);
   }

   public final void psubusb(MMRegister dst, MMRegister src) {
      this.emitX86(INST_CODE.INST_PSUBUSB, dst, src);
   }

   public final void psubw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PSUBW, dst, src);
   }

   public final void jle_short(Label label, int hint) {
      this._emitJcc(INST_CODE.INST_JLE_SHORT, label, hint);
   }

   public final void imul(Register dst, Immediate src) {
      this.emitX86(INST_CODE.INST_IMUL, dst, src);
   }

   public final void fcom(X87Register reg) {
      this.emitX86(INST_CODE.INST_FCOM, reg);
   }

   public final void btr(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_BTR, dst, src);
   }

   public final void cmovb(Register src, Mem dst) {
      this.emitX86(INST_CODE.INST_CMOVB, dst, src);
   }

   public final void or_(Register dst, Mem src) {
      this.emitX86(INST_CODE.INST_OR, dst, src);
   }

   public final void cmovc(Register src, Register dst) {
      this.emitX86(INST_CODE.INST_CMOVC, dst, src);
   }

   public final void shr(Mem dst, Immediate src) {
      this.emitX86(INST_CODE.INST_SHR, dst, src);
   }

   public final void jno_short(Label hint, int label) {
      this._emitJcc(INST_CODE.INST_JNO_SHORT, label, hint);
   }

   public final void cmpxchg8b(Mem dst) {
      this.emitX86(INST_CODE.INST_CMPXCHG8B, dst);
   }

   public final void psubsw(XMMRegister dst, XMMRegister src) {
      this.emitX86(INST_CODE.INST_PSUBSW, dst, src);
   }

   public final void palignr(MMRegister src, Mem dst, Immediate imm8) {
      this.emitX86(INST_CODE.INST_PALIGNR, dst, src, imm8);
   }

   public final void movhpd(XMMRegister src, Mem dst) {
      this.emitX86(INST_CODE.INST_MOVHPD, dst, src);
   }

   public final void psrld(XMMRegister dst, Immediate src) {
      this.emitX86(INST_CODE.INST_PSRLD, dst, src);
   }
}
