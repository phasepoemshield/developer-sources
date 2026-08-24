package jnr.a64asm;

// $VF: Compiled from SerializerIntrinsics_a64.java
public abstract class SerializerIntrinsics_a64 extends SerializerCore {
   public final void ldursw(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDURSW_LDST_UNSCALED, Xd, location);
   }

   public final void bhi(Immediate label) {
      this.emitA64(INST_CODE.INST_BHI_CONDBRANCH, label);
   }

   public final void ccmp(Register Xn, Immediate cc, Immediate val, Conditions nzcv) {
      this.emitA64(INST_CODE.INST_CCMP_CONDCMP_IMM, Xn, val, nzcv, cc);
   }

   public final void uxtw(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_UXTW_LOG_SHIFT, Xd, Xn);
   }

   public final void stp(Register Xd, Register Xn, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_STP_LDSTPAIR_INDEXED_PRE, Xd, Xn, pindex);
   }

   public final void subs(Register sft, Register Xn, Immediate val, Shift Xd) {
      this.emitA64(INST_CODE.INST_SUBS_ADDSUB_IMM, Xd, Xn, val, sft);
   }

   public final void lsrv(Register Xd, Register Xm, Register Xn) {
      this.emitA64(INST_CODE.INST_LSRV_DP_2SRC, Xd, Xn, Xm);
   }

   public final void ldaxrb(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDAXRB_LDSTEXCL, Xd, location);
   }

   public final void cinc(Register cc, Register Xn, Conditions Xd) {
      this.emitA64(INST_CODE.INST_CINC_CONDSEL, Xd, Xn, cc);
   }

   public final void ldpsw(Register Xn, Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_LDPSW_OFF, Xd, Xn, offset);
   }

   public final void ldursh(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDURSH_LDST_UNSCALED, Xd, location);
   }

   public final void drps() {
      this.emitA64(INST_CODE.INST_DRPS_BRANCH_REG);
   }

   public final void ldpsw(Register Xd, Register val, Mem location, Immediate Xn) {
      this.emitA64(INST_CODE.INST_LDPSW_POST_INDEXED, Xd, Xn, location, val);
   }

   public final void strb(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_STRB_LDST_OFFSET, Xd, offset);
   }

   public final void mov(Register Xd, Shift sft) {
      this.emitA64(INST_CODE.INST_MOV_LOG_SHIFT, Xd, sft);
   }

   public final void sbcs(Register Xn, Register Xd, Register Xm) {
      this.emitA64(INST_CODE.INST_SBCS_ADDSUB_CARRY, Xd, Xn, Xm);
   }

   public final void lsr(Register Xn, Register Xd, Register Xm) {
      this.emitA64(INST_CODE.INST_LSR_DP_2SRC, Xd, Xn, Xm);
   }

   public final void blo(Immediate label) {
      this.emitA64(INST_CODE.INST_BLO_CONDBRANCH, label);
   }

   public final void ldarh(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDARH_LDSTEXCL, Xd, location);
   }

   public final void dmb(Immediate val) {
      this.emitA64(INST_CODE.INST_DMB_IC_SYSTEM, val);
   }

   public final void orr(Register Xd, Register Xm, Register Xn, Shift sft) {
      this.emitA64(INST_CODE.INST_ORR_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void clrex(Immediate val) {
      this.emitA64(INST_CODE.INST_CLREX_IC_SYSTEM, val);
   }

   public final void tst(Register Xd, Immediate val) {
      this.emitA64(INST_CODE.INST_TST_LOG_IMM, Xd, val);
   }

   public final void bmi(Immediate label) {
      this.emitA64(INST_CODE.INST_BMI_CONDBRANCH, label);
   }

   public final void ldrsb(Register location, Mem Xd, Immediate val) {
      this.emitA64(INST_CODE.INST_LDRSB_IMM_POST, Xd, location, val);
   }

   public final void strb(Register Xn, Register Rm, Register Wt, Ext ext) {
      this.emitA64(INST_CODE.INST_STRB_LDST_REGOFF, Wt, Xn, Rm, ext);
   }

   public final void stxp(Register Xd, Register Xm, Register location, Register zero, Immediate Xn) {
      this.emitA64(INST_CODE.INST_STXP_LDSTEXCL, Xd, Xn, Xm, location, zero);
   }

   public final void stnp(Register Xd, Register location, Mem Xn) {
      this.emitA64(INST_CODE.INST_STNP_LDSTNAPAIR_OFFS, Xd, Xn, location);
   }

   public final void bne(Immediate label) {
      this.emitA64(INST_CODE.INST_BNE_CONDBRANCH, label);
   }

   public final void ldaxp(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDAXP_LDSTEXCL, Xd, location);
   }

   public final void neg(Register Xd, Register sft, Shift Xn) {
      this.emitA64(INST_CODE.INST_NEG_ADDSUB_SHIFT, Xd, Xn, sft);
   }

   public final void sbfx(Register Xd, Register val, Immediate val1, Immediate Xn) {
      this.emitA64(INST_CODE.INST_SBFX_BITFIELD, Xd, Xn, val, val1);
   }

   public final void ands(Register Xn, Register Xm, Register sft, Shift Xd) {
      this.emitA64(INST_CODE.INST_ANDS_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void stlxr(Register Wd, Register Xn, Mem location) {
      this.emitA64(INST_CODE.INST_STLXR_LDSTEXCL, Wd, Xn, location);
   }

   public final void hvc(Immediate val) {
      this.emitA64(INST_CODE.INST_HVC_EXCEPTION, val);
   }

   public final void b(Immediate Xd) {
      this.emitA64(INST_CODE.INST_B_BRANCH_IMM, Xd);
   }

   public final void stp(Register Xd, Register Xn, Post_index location) {
      this.emitA64(INST_CODE.INST_STP_LDSTPAIR_INDEXED_POST, Xd, Xn, location);
   }

   public final void wfe() {
      this.emitA64(INST_CODE.INST_WFE_IC_SYSTEM);
   }

   public final void add(Register Xm, Register Xn, Register Xd, Shift sft) {
      this.emitA64(INST_CODE.INST_ADD_ADDSUB_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void add(Register Xm, Register Xd, Register Xn, Ext extnd) {
      this.emitA64(INST_CODE.INST_ADD_EXT_ADDSUB_EXT, Xd, Xn, Xm, extnd);
   }

   public final void ldtrb(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDTRB_LDST_UNPRIV, Xd, location);
   }

   public final void sub(Register Xd, Register Xn, Immediate val, Shift sft) {
      this.emitA64(INST_CODE.INST_SUB_ADDSUB_IMM, Xd, Xn, val, sft);
   }

   public final void str(Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_STR_LDST_IMM9_PRE, Xd, pindex);
   }

   public final void bls(Immediate label) {
      this.emitA64(INST_CODE.INST_BLS_CONDBRANCH, label);
   }

   public final void msr(SysRegister srt, Register Xd) {
      this.emitA64(INST_CODE.INST_MSR_IC_SYSTEM_X, srt, Xd);
   }

   public final void sttr(Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_STTR_LDST_UNPRIV, Xd, offset);
   }

   public final void blt(Immediate label) {
      this.emitA64(INST_CODE.INST_BLT_CONDBRANCH, label);
   }

   public final void ic(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_IC_IC_SYSTEM, Xd, Xn);
   }

   public final void lsr(Register Xd, Register Xn, Immediate val) {
      this.emitA64(INST_CODE.INST_LSR_BITFIELD, Xd, Xn, val);
   }

   public final void ldxp(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDXP_LDSTEXCL, Xd, location);
   }

   public final void ldurb(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDURB_LDST_UNSCALED, Xd, location);
   }

   public final void subs(Register Xm, Register Xd, Register sft, Shift Xn) {
      this.emitA64(INST_CODE.INST_SUBS_ADDSUB_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void sbfm(Register Xd, Register Xn, Immediate val, Immediate val1) {
      this.emitA64(INST_CODE.INST_SBFM_BITFIELD, Xd, Xn, val, val1);
   }

   public final void ldr(Register pindex, Pre_index Xd) {
      this.emitA64(INST_CODE.INST_LDR_IMM_PRE, Xd, pindex);
   }

   public final void stlrb(Register Xn, Register val, Immediate Xd) {
      this.emitA64(INST_CODE.INST_STLRB_LDSTEXCL, Xd, Xn, val);
   }

   public final void mov(Register Xn, Register Xd) {
      if (Xd.code() < 31 && Xn.code() < 31) {
         this.emitA64(INST_CODE.INST_MOV_ADDSUB_IMM, Xd, Xn);
      } else {
         this.emitA64(INST_CODE.INST_MOV_LOG_SHIFT, Xd, Xn);
      }
   }

   public final void ngc(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_NGC_ADDSUB_CARRY, Xd, Xn);
   }

   public final void ldrsw(Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_LDRSW_IMM_OFF, Xd, offset);
   }

   public final void strb(Register pindex, Pre_index Xd) {
      this.emitA64(INST_CODE.INST_STRB_LDST_PRE, Xd, pindex);
   }

   public final void smc(Immediate val) {
      this.emitA64(INST_CODE.INST_SMC_EXCEPTION, val);
   }

   public final void dsb(Immediate val) {
      this.emitA64(INST_CODE.INST_DSB_IC_SYSTEM, val);
   }

   public final void ubfx(Register Xd, Register Xn, Immediate val, Immediate val1) {
      this.emitA64(INST_CODE.INST_UBFX_BITFIELD, Xd, Xn, val, val1);
   }

   public final void tbnz(Register label, Immediate val, Label Xd) {
      this.emitA64(INST_CODE.INST_TBNZ_TESTBRANCH, Xd, val, label);
   }

   public final void svc(Immediate val) {
      this.emitA64(INST_CODE.INST_SVC_EXCEPTION, val);
   }

   public final void umull(Register Xd, Register Xn, Register Xm) {
      this.emitA64(INST_CODE.INST_UMULL_DP_3SRC, Xd, Xn, Xm);
   }

   public final void stlr(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_STLR_LDSTEXCL, Xd, location);
   }

   public final void adds(Register Xm, Register extnd, Register Xd, Ext Xn) {
      this.emitA64(INST_CODE.INST_ADDS_ADDSUB_EXT, Xd, Xn, Xm, extnd);
   }

   public final void strh(Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_STRH_LDST_IMM_OFF, Xd, offset);
   }

   public final void ubfm(Register val1, Register val, Immediate Xn, Immediate Xd) {
      this.emitA64(INST_CODE.INST_UBFM_BITFIELD, Xd, Xn, val, val1);
   }

   public final void bl(Immediate label) {
      this.emitA64(INST_CODE.INST_BL_BRANCH_IMM, label);
   }

   public final void cls(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_CLS_DP_1SRC, Xd, Xn);
   }

   public final void rorv(Register Xn, Register Xm, Register Xd) {
      this.emitA64(INST_CODE.INST_RORV_DP_2SRC, Xd, Xn, Xm);
   }

   public final void umulh(Register Xm, Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_UMULH_DP_3SRC, Xd, Xn, Xm);
   }

   public final void ldrb(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDRB_REG, Xd, location);
   }

   public final void movz(Register sft, Immediate val, Shift Xd) {
      this.emitA64(INST_CODE.INST_MOVZ_MOVEWIDE, Xd, val, sft);
   }

   public final void cneg(Register Xn, Register Xd, Conditions cc) {
      this.emitA64(INST_CODE.INST_CNEG_CONDSEL, Xd, Xn, cc);
   }

   public final void umnegl(Register Xd, Register Xn, Register Xm) {
      this.emitA64(INST_CODE.INST_UMNEGL_DP_3SRC, Xd, Xn, Xm);
   }

   public final void ccmp(Register Xm, Register nzcv, Immediate Xn, Conditions cc) {
      this.emitA64(INST_CODE.INST_CCMP_CONDCMP_REG, Xn, Xm, nzcv, cc);
   }

   public final void dcps2(Immediate val) {
      this.emitA64(INST_CODE.INST_DCPS2_EXCEPTION, val);
   }

   public final void prfm(PRFOP_ENUM imm19, Immediate Xd) {
      this.emitA64(INST_CODE.INST_PRFM_LOADLIT__LITERAL, Xd, imm19);
   }

   public final void bcs(Immediate Xd) {
      this.emitA64(INST_CODE.INST_BCS_CONDBRANCH, Xd);
   }

   public final void ldrb(Register val, Mem Xd, Immediate location) {
      this.emitA64(INST_CODE.INST_LDRB_IMM_POST, Xd, location, val);
   }

   public final void dc(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_DC_IC_SYSTEM, Xd, Xn);
   }

   public final void hlt(Immediate val) {
      this.emitA64(INST_CODE.INST_HLT_EXCEPTION, val);
   }

   public final void ldrsh(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDRSH_REG, Xd, location);
   }

   public final void udiv(Register Xn, Register Xm, Register Xd) {
      this.emitA64(INST_CODE.INST_UDIV_DP_2SRC, Xd, Xn, Xm);
   }

   public final void cmn(Register sft, Immediate Xd, Shift val) {
      this.emitA64(INST_CODE.INST_CMN_ADDSUB_IMM, Xd, val, sft);
   }

   public final void sxth(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_SXTH_BITFIELD, Xd, Xn);
   }

   public final void ldr(Register Xd, Post_index postindex) {
      this.emitA64(INST_CODE.INST_LDR_IMM_POST, Xd, postindex);
   }

   public final void ldur(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDUR_LDST_UNSCALED_X, Xd, location);
   }

   public final void msub(Register Xa, Register Xm, Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_MSUB_DP_3SRC, Xd, Xn, Xm, Xa);
   }

   public final void stxr(Register location, Register Xd, Offset Xn) {
      this.emitA64(INST_CODE.INST_STXR_LDSTEXCL, Xd, Xn, location);
   }

   public final void madd(Register Xn, Register Xm, Register Xd, Register Xa) {
      this.emitA64(INST_CODE.INST_MADD_DP_3SRC, Xd, Xn, Xm, Xa);
   }

   public final void smsubl(Register Wm, Register Xn, Register Wn, Register Xd) {
      this.emitA64(INST_CODE.INST_SMSUBL_DP_3SRC, Xd, Wn, Wm, Xn);
   }

   public final void stxrh(Register location, Register Xd, Offset Xn) {
      this.emitA64(INST_CODE.INST_STXRH_LDSTEXCL, Xd, Xn, location);
   }

   public final void nop() {
      this.emitA64(INST_CODE.INST_NOP_IC_SYSTEM);
   }

   public final void bfm(Register Xd, Register val1, Immediate Xn, Immediate val2) {
      this.emitA64(INST_CODE.INST_BFM_BITFIELD, Xd, Xn, val1, val2);
   }

   public final void ldp(Register offset, Register Xn, Offset Xd) {
      this.emitA64(INST_CODE.INST_LDP_LDSTPAIR_OFF_LDST_POS, Xd, Xn, offset);
   }

   public final void ldr(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_LDR_IMM_OFF, Xd, offset);
   }

   public final void ubfiz(Register val, Register val1, Immediate Xn, Immediate Xd) {
      this.emitA64(INST_CODE.INST_UBFIZ_BITFIELD, Xd, Xn, val, val1);
   }

   public final void and(Register val, Register Xn, Immediate Xd) {
      this.emitA64(INST_CODE.INST_AND_LOG_IMM, Xd, Xn, val);
   }

   public final void stlrh(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_STLRH_LDSTEXCL, Xd, location);
   }

   public final void adr(Register label, Label Xd) {
      this.emitA64(INST_CODE.INST_ADR_PCRELADDR, Xd, label);
   }

   public final void eor(Register sft, Register Xd, Register Xm, Shift Xn) {
      this.emitA64(INST_CODE.INST_EOR_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void bcc(Immediate Xd) {
      this.emitA64(INST_CODE.INST_BCC_CONDBRANCH, Xd);
   }

   public final void str(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_STR_LDST_POS, Xd, offset);
   }

   public final void bge(Immediate label) {
      this.emitA64(INST_CODE.INST_BGE_CONDBRANCH, label);
   }

   public final void rev16(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_REV16_DP_1SRC, Xd, Xn);
   }

   public final void rev32(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_REV32_DP_1SRC, Xd, Xn);
   }

   public final void add(Register sft, Register val, Immediate Xn, Shift Xd) {
      this.emitA64(INST_CODE.INST_ADD_ADDSUB_IMM, Xd, Xn, val, sft);
   }

   public final void tst(Register Xd, Register sft, Shift Xn) {
      this.emitA64(INST_CODE.INST_TST_LOG_SHIFT, Xd, Xn, sft);
   }

   public final void stlxrb(Register Wd, Register Wn, Mem location) {
      this.emitA64(INST_CODE.INST_STLXRB_LDSTEXCL, Wd, Wn, location);
   }

   public final void sub(Register sft, Register Xd, Register Xm, Shift Xn) {
      this.emitA64(INST_CODE.INST_SUB_ADDSUB_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void negs(Register Xn, Register sft, Shift Xd) {
      this.emitA64(INST_CODE.INST_NEGS_ADDSUB_SHIFT, Xd, Xn, sft);
   }

   public final void cmp(Register Xd, Register Xn, Shift sft) {
      this.emitA64(INST_CODE.INST_CMP_ADDSUB_SHIFT, Xd, Xn, sft);
   }

   public final void beq(Immediate imm19) {
      this.emitA64(INST_CODE.INST_BEQ_CONDBRANCH, imm19);
   }

   public final void cbnz(Register label, Label Xn) {
      this.emitA64(INST_CODE.INST_CBNZ_COMPBRANCH, Xn, label);
   }

   public final void ldnp(Register imm7, Register location, Register Xn, Immediate Xd) {
      this.emitA64(INST_CODE.INST_LDNP_LDSTNAPAIR_OFFS, Xd, Xn, location, imm7);
   }

   public final void ldtrsw(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDTRSW_LDST_UNPRIV, Xd, location);
   }

   public final void bgt(Immediate label) {
      this.emitA64(INST_CODE.INST_BGT_CONDBRANCH, label);
   }

   public final void mov(Register val, Immediate Xd) {
      if (Xd.code() < 31) {
         this.emitA64(INST_CODE.INST_MOV_MOVEWIDE_X, Xd, val);
      } else {
         this.emitA64(INST_CODE.INST_MOV_LOG_IMM, Xd, val);
      }
   }

   public final void bvs(Immediate label) {
      this.emitA64(INST_CODE.INST_BVS_CONDBRANCH, label);
   }

   public final void adds(Register Xd, Register Xm, Register sft, Shift Xn) {
      this.emitA64(INST_CODE.INST_ADDS_ADDSUB_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void ldrsw(Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_LDRSW_IMM_PRE, Xd, pindex);
   }

   public final void asr(Register Xd, Register Xn, Immediate val) {
      this.emitA64(INST_CODE.INST_ASR_BITFIELD, Xd, Xn, val);
   }

   public final void ldurh(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDURH_LDST_UNSCALED, Xd, location);
   }

   public final void ldtrh(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDTRH_LDST_UNPRIV, Xd, location);
   }

   public final void eor(Register Xd, Register val, Immediate Xn) {
      this.emitA64(INST_CODE.INST_EOR_LOG_IMM, Xd, Xn, val);
   }

   public final void cmn(Register Xn, Register Xd, Shift sft) {
      this.emitA64(INST_CODE.INST_CMN_ADDSUB_SHIFT, Xd, Xn, sft);
   }

   public final void mul(Register Xd, Register Xm, Register Xn) {
      this.emitA64(INST_CODE.INST_MUL_DP_3SRC, Xd, Xn, Xm);
   }

   public final void lsl(Register Xn, Register val, Immediate Xd) {
      this.emitA64(INST_CODE.INST_LSL_BITFIELD, Xd, Xn, val);
   }

   public final void stlxrh(Register location, Register Wd, Mem Wn) {
      this.emitA64(INST_CODE.INST_STLXRH_LDSTEXCL, Wd, Wn, location);
   }

   public final void tbz(Register label, Immediate val, Label Xd) {
      this.emitA64(INST_CODE.INST_TBZ_TESTBRANCH, Xd, val, label);
   }

   public final void ldxrh(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDXRH_LDSTEXCL, Xd, location);
   }

   public final void uxtb(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_UXTB_BITFIELD, Xd, Xn);
   }

   public final void prfm(PRFOP_ENUM Rm, Register ext, Register label, Ext Xn) {
      this.emitA64(INST_CODE.INST_PRFM_LDST_REGOFF__REGISTER, label, Xn, Rm, ext);
   }

   public final void mvn(Register sft, Register Xn, Shift Xd) {
      this.emitA64(INST_CODE.INST_MVN_LOG_SHIFT, Xd, Xn, sft);
   }

   public final void strh(Register Xm, Register Xn, Register Xd, Ext ext) {
      this.emitA64(INST_CODE.INST_STRH_LDST_REGOFF, Xd, Xn, Xm, ext);
   }

   public final void sxtb(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_SXTB_BITFIELD, Xd, Xn);
   }

   public final void stur(Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_STUR_LDST_UNSCALED_X, Xd, offset);
   }

   public final void ldrsw(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDRSW_REG, Xd, location);
   }

   public final void lsl(Register Xm, Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_LSL_DP_2SRC, Xd, Xn, Xm);
   }

   public final void umsubl(Register Xa, Register Xm, Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_UMSUBL_DP_3SRC, Xd, Xn, Xm, Xa);
   }

   public final void ldrh(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDRH_REG, Xd, location);
   }

   public final void stp(Register offset, Register Xd, Offset Xn) {
      this.emitA64(INST_CODE.INST_STP_LDSTPAIR_OFF, Xd, Xn, offset);
   }

   public final void sturh(Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_STURH_LDST_UNSCALED, Xd, offset);
   }

   public final void str(Register Xn, Register ext, Register Xt, Ext Xm) {
      this.emitA64(INST_CODE.INST_STR_LDST_REGOFF, Xt, Xn, Xm, ext);
   }

   public final void clz(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_CLZ_DP_1SRC, Xd, Xn);
   }

   public final void ror(Register Xm, Register Xd, Immediate val) {
      this.emitA64(INST_CODE.INST_ROR_EXTRACT, Xd, Xm, val);
   }

   public final void adds(Register Xn, Register sft, Immediate Xd, Shift val) {
      this.emitA64(INST_CODE.INST_ADDS_ADDSUB_IMM, Xd, Xn, val, sft);
   }

   public final void sttrh(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_STTRH_LDST_UNPRIV, Xd, offset);
   }

   public final void bpl(Immediate label) {
      this.emitA64(INST_CODE.INST_BPL_CONDBRANCH, label);
   }

   public final void ldp(Register location, Register Xd, Post_index Xn) {
      this.emitA64(INST_CODE.INST_LDP_POST_INDEXED_IDST_IMM9, Xd, Xn, location);
   }

   public final void stlxp(Register Xn, Register Wd, Register Xm, Mem location) {
      this.emitA64(INST_CODE.INST_STLXP_LDSTEXCL, Wd, Xn, Xm, location);
   }

   public final void ldrsb(Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_LDRSB_IMM_PRE, Xd, pindex);
   }

   public final void ldxr(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDXR_LDSTEXCL, Xd, location);
   }

   public final void ldrsh(Register Xd, Mem location, Immediate val) {
      this.emitA64(INST_CODE.INST_LDRSH_IMM_POST, Xd, location, val);
   }

   public final void cinv(Register Xn, Register cc, Conditions Xd) {
      this.emitA64(INST_CODE.INST_CINV_CONDSEL, Xd, Xn, cc);
   }

   public final void isb(Immediate val) {
      this.emitA64(INST_CODE.INST_ISB_IC_SYSTEM, val);
   }

   public final void movk(Register val, Immediate Xd, Shift sft) {
      this.emitA64(INST_CODE.INST_MOVK_MOVEWIDE, Xd, val, sft);
   }

   public final void csel(Register Xd, Register cc, Register Xm, Conditions Xn) {
      this.emitA64(INST_CODE.INST_CSEL_CONDSEL, Xd, Xn, Xm, cc);
   }

   public final void bic(Register sft, Register Xn, Register Xd, Shift Xm) {
      this.emitA64(INST_CODE.INST_BIC_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void ldaxr(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDAXR_LDSTEXCL, Xd, location);
   }

   public final void adcs(Register Xn, Register Xm, Register Xd) {
      this.emitA64(INST_CODE.INST_ADCS_ADDSUB_CARRY, Xd, Xn, Xm);
   }

   public final void ldtrsh(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDTRSH_LDST_UNPRIV, Xd, location);
   }

   public final void cmp(Register val, Immediate Xd, Shift sft) {
      this.emitA64(INST_CODE.INST_CMP_ADDSUB_IMM, Xd, val, sft);
   }

   public final void uxth(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_UXTH_BITFIELD, Xd, Xn);
   }

   public final void mrs(Register Xd, Register SysReg) {
      this.emitA64(INST_CODE.INST_MRS_IC_SYSTEM, Xd, SysReg);
   }

   public final void cbz(Register label, Label Xn) {
      this.emitA64(INST_CODE.INST_CBZ_COMPBRANCH, Xn, label);
   }

   public final void sdiv(Register Xd, Register Xm, Register Xn) {
      this.emitA64(INST_CODE.INST_SDIV_DP_2SRC, Xd, Xn, Xm);
   }

   public final void strh(Register pindex, Post_index Xd) {
      this.emitA64(INST_CODE.INST_STRH_LDST_IMM_POST, Xd, pindex);
   }

   public final void bvc(Immediate label) {
      this.emitA64(INST_CODE.INST_BVC_CONDBRANCH, label);
   }

   public final void yield() {
      this.emitA64(INST_CODE.INST_YIELD_IC_SYSTEM);
   }

   public final void ands(Register Xd, Register val, Immediate Xn) {
      this.emitA64(INST_CODE.INST_ANDS_LOG_IMM, Xd, Xn, val);
   }

   public final void ret(Register Xd) {
      this.emitA64(INST_CODE.INST_RET_BRANCH_REG, Xd);
   }

   public final void strb(Register Xd, Post_index pindex) {
      this.emitA64(INST_CODE.INST_STRB_LDST_IMM9_POST, Xd, pindex);
   }

   public final void adc(Register Xm, Register Xn, Register dst) {
      this.emitA64(INST_CODE.INST_ADC_ADDSUB_CARRY, dst, Xn, Xm);
   }

   public final void sevl() {
      this.emitA64(INST_CODE.INST_SEVL_IC_SYSTEM);
   }

   public final void csinc(Register Xm, Register cc, Register Xd, Conditions Xn) {
      this.emitA64(INST_CODE.INST_CSINC_CONDSEL, Xd, Xn, Xm, cc);
   }

   public final void dcps3(Immediate val) {
      this.emitA64(INST_CODE.INST_DCPS3_EXCEPTION, val);
   }

   public final void ldrsh(Register pindex, Pre_index Xd) {
      this.emitA64(INST_CODE.INST_LDRSH_IMM_PRE, Xd, pindex);
   }

   public final void eret() {
      this.emitA64(INST_CODE.INST_ERET_BRANCH_REG);
   }

   public final void ldrb(Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_LDRB_IMM_PRE, Xd, pindex);
   }

   public final void ror(Register Xm, Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_ROR_DP_2SRC, Xd, Xn, Xm);
   }

   public final void prfum(PRFOP_ENUM imm9, Register Xd, Immediate Xn) {
      this.emitA64(INST_CODE.INST_PRFUM_LDST_UNSCALED, Xd, Xn, imm9);
   }

   public final void sttrb(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_STTRB_LDST_UNPRIV, Xd, offset);
   }

   public final void ldtrsb(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDTRSB_LDST_UNPRIV, Xd, location);
   }

   public final void ldar(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDAR_LDSTEXCL, Xd, location);
   }

   public final void ldrh(Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_LDRH_IMM_OFF, Xd, offset);
   }

   public final void bfi(Register Xn, Register width, Immediate val, Immediate Xd) {
      this.emitA64(INST_CODE.INST_BFI_BITFIELD, Xd, Xn, val, width);
   }

   public final void ldtr(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDTR_LDST_UNPRIV, Xd, location);
   }

   public final void rbit(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_RBIT_DP_1SRC, Xd, Xn);
   }

   public final void ldpsw(Register Xn, Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_LDPSW_PRE_INDEXED, Xd, Xn, pindex);
   }

   public final void ldarb(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDARB_LDSTEXCL, Xd, location);
   }

   public final void eon(Register sft, Register Xn, Register Xm, Shift Xd) {
      this.emitA64(INST_CODE.INST_EON_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void ccmn(Register nzcv, Register Xm, Immediate cc, Conditions Xn) {
      this.emitA64(INST_CODE.INST_CCMN_CONDCMP_REG, Xn, Xm, nzcv, cc);
   }

   public final void csinv(Register Xd, Register Xm, Register Xn, Conditions cc) {
      this.emitA64(INST_CODE.INST_CSINV_CONDSEL, Xd, Xn, Xm, cc);
   }

   public final void ldrh(Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_LDRH_IMM_PRE, Xd, pindex);
   }

   public final void dcps1(Immediate val) {
      this.emitA64(INST_CODE.INST_DCPS1_EXCEPTION, val);
   }

   public final void sxtw(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_SXTW_BITFIELD, Xd, Xn);
   }

   public final void cset(Register Xd, Conditions cc) {
      this.emitA64(INST_CODE.INST_CSET_CONDSEL, Xd, cc);
   }

   public final void smull(Register Xd, Register Wn, Register Wm) {
      this.emitA64(INST_CODE.INST_SMULL_DP_3SRC, Xd, Wn, Wm);
   }

   public final void brk(Immediate val) {
      this.emitA64(INST_CODE.INST_BRK_EXCEPTION, val);
   }

   public final void stxrb(Register Xd, Register Xn, Offset location) {
      this.emitA64(INST_CODE.INST_STXRB_LDSTEXCL, Xd, Xn, location);
   }

   public final void br(Register Xn) {
      this.emitA64(INST_CODE.INST_BR_BRANCH_REG, Xn);
   }

   public final void umaddl(Register Xd, Register Xm, Register Xa, Register Xn) {
      this.emitA64(INST_CODE.INST_UMADDL_DP_3SRC, Xd, Xn, Xm, Xa);
   }

   public final void msr(Register Xd, Immediate val) {
      this.emitA64(INST_CODE.INST_MSR_IC_SYSTEM, Xd, val);
   }

   public final void and(Register Xd, Register Xn, Register Xm, Shift sft) {
      this.emitA64(INST_CODE.INST_AND_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void ngcs(Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_NGCS_ADDSUB_CARRY, Xd, Xn);
   }

   public final void extr(Register Xm, Register Xd, Register Xn, Immediate val) {
      this.emitA64(INST_CODE.INST_EXTR_EXTRACT, Xd, Xn, Xm, val);
   }

   public final void mneg(Register Xd, Register Xm, Register Xn) {
      this.emitA64(INST_CODE.INST_MNEG_DP_3SRC, Xd, Xn, Xm);
   }

   public final void ldursb(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDURSB_LDST_UNSCALED, Xd, location);
   }

   public final void bhs(Immediate label) {
      this.emitA64(INST_CODE.INST_BHS_CONDBRANCH, label);
   }

   public final void ldrsw(Register Xd, Label label) {
      this.emitA64(INST_CODE.INST_LDRSW_LOADLIT, label);
   }

   public final void ldrsh(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_LDRSH_IMM_OFF, Xd, offset);
   }

   public final void orn(Register Xn, Register Xd, Register Xm, Shift sft) {
      this.emitA64(INST_CODE.INST_ORN_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void ldrsb(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_LDRSB_IMM_OFF, Xd, offset);
   }

   public final void asrv(Register Xm, Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_ASRV_DP_2SRC, Xd, Xn, Xm);
   }

   public final void sbfiz(Register Xn, Register Xd, Immediate lsb, Immediate width) {
      this.emitA64(INST_CODE.INST_SBFIZ_BITFIELD, Xd, Xn, lsb, width);
   }

   public final void smaddl(Register Xn, Register Xd, Register Wn, Register Wm) {
      this.emitA64(INST_CODE.INST_SMADDL_DP_3SRC, Xd, Wn, Wm, Xn);
   }

   public final void lslv(Register Xd, Register Xm, Register Xn) {
      this.emitA64(INST_CODE.INST_LSLV_DP_2SRC, Xd, Xn, Xm);
   }

   public final void ldp(Register Xn, Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_LDP_PRE_INDEXED_IDST_IMM9, Xd, Xn, pindex);
   }

   public final void str(Register postindex, Post_index Xd) {
      this.emitA64(INST_CODE.INST_STR_LDST_IMM9_POST, Xd, postindex);
   }

   public final void cmp(Register Xn, Register extend, Ext Xd) {
      this.emitA64(INST_CODE.INST_CMP_ADDSUB_EXT, Xd, Xn, extend);
   }

   public final void rev(Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_REV_DP_1SRC_X, Xd, Xn);
   }

   public final void ldrh(Register Xd, Mem location, Immediate val) {
      this.emitA64(INST_CODE.INST_LDRH_IMM_POST, Xd, location, val);
   }

   public final void blr(Register Xn) {
      this.emitA64(INST_CODE.INST_BLR_BRANCH_REG, Xn);
   }

   public final void bics(Register Xm, Register Xn, Register sft, Shift Xd) {
      this.emitA64(INST_CODE.INST_BICS_LOG_SHIFT, Xd, Xn, Xm, sft);
   }

   public final void ldrsb(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDRSB_REG, Xd, location);
   }

   public final void prfm(PRFOP_ENUM imm12, Register Xn, Immediate Xd) {
      this.emitA64(INST_CODE.INST_PRFM_LDST_POS__IMMEDIATE, Xd, Xn, imm12);
   }

   public final void sbc(Register Xn, Register Xd, Register Xm) {
      this.emitA64(INST_CODE.INST_SBC_ADDSUB_CARRY, Xd, Xn, Xm);
   }

   public final void sub(Register Xd, Register Xn, Register extend, Ext Xm) {
      this.emitA64(INST_CODE.INST_SUB_ADDSUB_EXT, Xd, Xn, Xm, extend);
   }

   public final void ccmn(Register nzcv, Immediate cc, Immediate val, Conditions Xn) {
      this.emitA64(INST_CODE.INST_CCMN_CONDCMP_IMM, Xn, val, nzcv, cc);
   }

   public final void strh(Register Xd, Pre_index pindex) {
      this.emitA64(INST_CODE.INST_STRH_LDST_IMM_PRE, Xd, pindex);
   }

   public final void adrp(Register label, Label Xd) {
      this.emitA64(INST_CODE.INST_ADRP_PCRELADDR, Xd, label);
   }

   public final void bfxil(Register Xn, Register val, Immediate Xd, Immediate width) {
      this.emitA64(INST_CODE.INST_BFXIL_BITFIELD, Xd, Xn, val, width);
   }

   public final void csneg(Register Xm, Register Xd, Register Xn, Conditions cc) {
      this.emitA64(INST_CODE.INST_CSNEG_CONDSEL, Xd, Xn, Xm, cc);
   }

   public final void cmn(Register extend, Register Xn, Ext Xd) {
      this.emitA64(INST_CODE.INST_CMN_ADDSUB_EXT, Xd, Xn, extend);
   }

   public final void smnegl(Register Wm, Register Xd, Register Wn) {
      this.emitA64(INST_CODE.INST_SMNEGL_DP_3SRC, Xd, Wn, Wm);
   }

   public final void ldr(Register Xd, Immediate label) {
      this.emitA64(INST_CODE.INST_LDR_LOADLIT, label);
   }

   public final void orr(Register Xm, Register val, Immediate Xd) {
      this.emitA64(INST_CODE.INST_ORR_LOG_IMM, Xd, Xm, val);
   }

   public final void ble(Immediate label) {
      this.emitA64(INST_CODE.INST_BLE_CONDBRANCH, label);
   }

   public final void asr(Register Xm, Register Xd, Register Xn) {
      this.emitA64(INST_CODE.INST_ASR_DP_2SRC, Xd, Xn, Xm);
   }

   public final void subs(Register Xd, Register extend, Register Xn, Ext Xm) {
      this.emitA64(INST_CODE.INST_SUBS_ADDSUB_EXT, Xd, Xn, Xm, extend);
   }

   public final void smulh(Register Xm, Register Xn, Register Xd) {
      this.emitA64(INST_CODE.INST_SMULH_DP_3SRC, Xd, Xn, Xm);
   }

   public final void ldrb(Register Xd, Offset offset) {
      this.emitA64(INST_CODE.INST_LDRB_IMM_OFF, Xd, offset);
   }

   public final void sturb(Register offset, Offset Xd) {
      this.emitA64(INST_CODE.INST_STURB_LDST_UNSCALED, Xd, offset);
   }

   public final void hint(Immediate val) {
      this.emitA64(INST_CODE.INST_HINT_IC_SYSTEM, val);
   }

   public final void ldrsw(Register val, Mem Xd, Immediate location) {
      this.emitA64(INST_CODE.INST_LDRSW_IMM_POST, Xd, location, val);
   }

   public final void ldxrb(Register Xd, Mem location) {
      this.emitA64(INST_CODE.INST_LDXRB_LDSTEXCL, Xd, location);
   }

   public final void ldaxrh(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDAXRH_LDSTEXCL, Xd, location);
   }

   public final void sev() {
      this.emitA64(INST_CODE.INST_SEV_IC_SYSTEM);
   }

   public final void csetm(Register Xd, Conditions cc) {
      this.emitA64(INST_CODE.INST_CSETM_CONDSEL, Xd, cc);
   }

   public final void wfi() {
      this.emitA64(INST_CODE.INST_WFI_IC_SYSTEM);
   }

   public final void ldr(Register location, Mem Xd) {
      this.emitA64(INST_CODE.INST_LDR_REG, Xd, location);
   }

   public final void movn(Register val, Immediate sft, Shift Xd) {
      this.emitA64(INST_CODE.INST_MOVN_MOVEWIDE, Xd, val, sft);
   }
}
