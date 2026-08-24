package jnr.a64asm;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

// $VF: Compiled from Assembler_A64.java
public final class Assembler_A64 extends Serializer {
   private final Logger _logger;
   public static final CPU_A64 Aarch_64 = CPU_A64.Aarch64;
   private final CpuInfo cpuInfo;
   private final CPU_A64 cpu;
   private final CodeBuffer _buffer = new CodeBuffer();
   private final List<RelocData> _relocData = new LinkedList<>();
   private int _properties;

   public Assembler_A64(CPU_A64 cpu) {
      this.cpuInfo = CpuInfo.GENERIC;
      this._properties = 0;
      this._logger = null;
      this.cpu = cpu;
   }

   void _emitImmediate(Immediate imm, int size) {
      switch (size) {
         case 1:
            this._emitByte(imm.byteValue());
            break;
         case 2:
            this._emitWord(imm.shortValue());
            break;
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            throw new IllegalArgumentException("invalid immediate operand size");
         case 4:
            this._emitDWord(imm.intValue());
            break;
         case 8:
            if (!this.is64()) {
               throw new IllegalArgumentException("64 bit immediate values not supported for 32bit");
            }

            this._emitQWord(imm.longValue());
      }
   }

   @Override
   void _emita64(INST_CODE o5, Operand o1, Operand o2, Operand o4, Operand code, Operand o3) {
      InstructionDescription id = InstructionDescription.find(code);
      switch (id.group) {
         case addsub_carry:
         case addsub_ext: {
            int inst_to_emit = 0;
            if ((!o1.isReg() || !o2.isReg() || !o3.isReg()) && (o4 == null || !o4.isExtend())) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Register regM = (Register)o3;
            Ext extV = null;
            if (o4 != _none && o4.isExtend()) {
               extV = (Ext)o4;
            }

            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
            }

            inst_to_emit |= regD.code & 31;
            inst_to_emit |= (regN.code & 31) << 5;
            inst_to_emit |= (regM.code & 31) << 16;
            if (id.group == InstructionGroup.addsub_ext && extV != null) {
               inst_to_emit = (int)(inst_to_emit | (extV.value() & 7L) << 10);
               inst_to_emit = (int)(inst_to_emit | (extV.type() & 7L) << 13);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case addsub_imm:
         case addsub_shift: {
            int inst_to_emit = 0;
            if (o1 == _none || !o1.isReg() || o2 == _none || !o2.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Immediate val = null;
            if (o3 != _none && o3.isImm()) {
               val = (Immediate)o3;
            }

            Shift sft = null;
            if (o4 != _none) {
               sft = (Shift)o4;
            }

            Register regM = null;
            if (o3 != _none && o3.isReg()) {
               regM = (Register)o3;
            }

            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
            }

            inst_to_emit |= regD.code & 31;
            inst_to_emit |= (regN.code & 31) << 16;
            if (id.group == InstructionGroup.addsub_shift) {
               if (regM != null) {
                  inst_to_emit |= (regM.code & 31) << 16;
               }

               if (sft != null) {
                  inst_to_emit = (int)(inst_to_emit | (sft.value() & 63L) << 10);
               }
            } else if (val != null) {
               inst_to_emit = (int)(inst_to_emit | (val.value() & 4095L) << 10);
            }

            if (sft != null) {
               inst_to_emit = (int)(inst_to_emit | (sft.type() & 3L) << 22);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case bitfield: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Immediate val1 = null;
            if (o3.isImm()) {
               val1 = (Immediate)o3;
            }

            Immediate val2 = null;
            if (o4.isImm()) {
               val2 = (Immediate)o4;
            }

            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
               inst_to_emit |= 4194304;
            }

            inst_to_emit |= regD.code & 31;
            inst_to_emit |= (regN.code & 31) << 5;
            if (val1 != null) {
               inst_to_emit = (int)(inst_to_emit | (val1.value() & 63L) << 10);
            }

            if (val2 != null) {
               inst_to_emit = (int)(inst_to_emit | (val2.value() & 63L) << 16);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case branch_imm: {
            int inst_to_emit = 0;
            if (o1 == _none) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Immediate mem = (Immediate)o1;
            this._emitJmpOrCallReloc(InstructionGroup.branch_imm, mem.value());
            break;
         }
         case branch_reg: {
            int inst_to_emit = 0;
            Register regN = null;
            if (o1 != _none && o1 != null && o1.isReg()) {
               regN = (Register)o1;
            }

            if (regN != null) {
               inst_to_emit |= (regN.code & 31) << 5;
            }

            if (regN == null && id.code == INST_CODE.INST_RET_BRANCH_REG) {
               inst_to_emit |= 960;
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case compbranch: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isLabel()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Label labl = (Label)o2;
            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
            }

            inst_to_emit |= regD.code & 31;
            inst_to_emit |= (labl.position() & 524287) << 5;
            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case condbranch: {
            int inst_to_emit = 0;
            if (!o1.isImm()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Immediate imm19 = (Immediate)o1;
            if (imm19 != null) {
               inst_to_emit = (int)(inst_to_emit | (imm19.value() & 524287L) << 5);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case condcmp_imm:
         case condcmp_reg: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isImm()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regM = (Register)o2;
            Immediate val = (Immediate)o2;
            Immediate nzcv = (Immediate)o3;
            Conditions cond = (Conditions)o4;
            if (regD != null) {
               inst_to_emit |= regD.code & 31;
            }

            if (id.group == InstructionGroup.condcmp_reg && regM != null) {
               inst_to_emit |= (regM.code & 31) << 16;
            } else if (val != null) {
               inst_to_emit = (int)(inst_to_emit | (val.value() & 31L) << 16);
            }

            if (nzcv != null) {
               inst_to_emit = (int)(inst_to_emit | nzcv.value() & 15L);
            }

            if (cond != null) {
               inst_to_emit = (int)(inst_to_emit | (cond.value() & 15L) << 12);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case condsel: {
            int inst_to_emit = 0;
            if (!o1.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Register regM = (Register)o3;
            Conditions cond0 = (Conditions)o4;
            Conditions cond1 = (Conditions)o3;
            Conditions cond2 = (Conditions)o2;
            if (regD != null) {
               inst_to_emit |= regD.code & 31;
            }

            if (o4.isCond() && (cond0.value() & 14L) != 14L) {
               inst_to_emit = (int)(inst_to_emit | (cond0.value() ^ 1L) << 12);
               inst_to_emit |= (regN.code & 31) << 5;
               inst_to_emit |= (regM.code & 31) << 16;
            } else if (o3.isCond() && (cond1.value() & 14L) != 14L) {
               inst_to_emit = (int)(inst_to_emit | (cond1.value() ^ 1L) << 12);
               inst_to_emit |= (regN.code & 31) << 5;
               inst_to_emit |= 2031616;
            } else if (o2.isCond() && (cond2.value() & 14L) != 14L) {
               inst_to_emit = (int)(inst_to_emit | (cond1.value() ^ 1L) << 12);
               inst_to_emit |= 992;
               inst_to_emit |= 2031616;
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case dp_1src:
         case dp_2src:
         case dp_3src: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Register regM = (Register)o3;
            Register regA = (Register)o4;
            if (regD != null) {
               inst_to_emit |= regD.code & 31;
            }

            if (regN != null) {
               inst_to_emit |= (regN.code & 31) << 5;
            }

            if (regM != null && (id.group == InstructionGroup.dp_2src || id.group == InstructionGroup.dp_3src)) {
               inst_to_emit |= (regM.code & 31) << 16;
            }

            if (regA != null && id.group == InstructionGroup.dp_3src) {
               inst_to_emit |= (regA.code & 31) << 10;
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case exception: {
            int inst_to_emit = 0;
            if (!o1.isImm()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Immediate imm16 = (Immediate)o1;
            if (imm16 != null) {
               inst_to_emit = (int)(inst_to_emit | (imm16.value() & 65535L) << 5);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case extract: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Register regM = (Register)o3;
            Immediate imm6 = (Immediate)o4;
            Immediate imm6_1 = (Immediate)o3;
            if (regD != null) {
               inst_to_emit |= regD.code & 31;
            }

            if (regN != null) {
               inst_to_emit |= (regN.code & 31) << 5;
            }

            if (o3.isReg() && regM != null) {
               inst_to_emit |= (regM.code & 31) << 16;
               inst_to_emit = (int)(inst_to_emit | (imm6.value() & 63L) << 10);
            } else if (o3.isImm() && imm6_1 != null) {
               inst_to_emit = (int)(inst_to_emit | (imm6_1.value() & 63L) << 10);
               inst_to_emit |= (regN.code & 31) << 16;
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ldst_imm9:
         case ldst_pos: {
            int inst_to_emit = 0;
            if (!o1.isReg() && id.code != INST_CODE.INST_PRFM_LDST_POS__IMMEDIATE) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = null;
            PRFOP_ENUM pfrop = null;
            if (id.code == INST_CODE.INST_PRFM_LDST_POS__IMMEDIATE && o1 != null) {
               pfrop = (PRFOP_ENUM)o1;
            } else if (o1 != _none) {
               regD = (Register)o1;
            }

            Register regN = null;
            Post_index postindex = null;
            Pre_index preindex = null;
            Offset offset = null;
            Immediate imm9 = null;
            Immediate imm12 = null;
            if (o2 != _none && o2.isReg()) {
               regN = (Register)o2;
            } else if (o2 != _none && (o2.isPreIndex() || o2.isPostIndex() || o2.isOffset())) {
               if (o2.isPreIndex()) {
                  preindex = (Pre_index)o2;
                  regN = preindex.getRegister();
                  imm9 = preindex.getPreIndex();
               } else if (o2.isPostIndex()) {
                  postindex = (Post_index)o2;
                  regN = postindex.getRegister();
                  imm9 = postindex.getPostIndex();
               } else {
                  offset = (Offset)o2;
                  regN = offset.getRegister();
                  imm12 = offset.getOffset();
               }
            }

            if (o3 != _none && id.group == InstructionGroup.ldst_imm9 && !o2.isPreIndex() && !o2.isPostIndex()) {
               imm9 = (Immediate)o3;
            }

            if (o3 != _none && id.group == InstructionGroup.ldst_pos && !o2.isPreIndex() && !o2.isPostIndex()) {
               imm12 = (Immediate)o3;
            }

            if (o1.size() == 64
               && id.code != INST_CODE.INST_PRFM_LDST_POS__IMMEDIATE
               && id.code != INST_CODE.INST_LDRSW_IMM_OFF
               && id.code != INST_CODE.INST_LDRH_IMM_OFF
               && id.code != INST_CODE.INST_LDRSH_IMM_OFF
               && id.code != INST_CODE.INST_LDRB_IMM_OFF
               && id.code != INST_CODE.INST_LDRSB_IMM_OFF) {
               inst_to_emit |= 1073741824;
            }

            if (o1.size() == 32
               && id.code != INST_CODE.INST_LDRB_IMM_OFF
               && (id.code == INST_CODE.INST_LDRSH_IMM_OFF || id.code == INST_CODE.INST_LDRSB_IMM_OFF)) {
               inst_to_emit |= 4194304;
            }

            if (regD != null) {
               inst_to_emit |= regD.code & 31;
            } else if (pfrop != null) {
               inst_to_emit = (int)(inst_to_emit | pfrop.intValue() & 31L);
            }

            if (regN != null) {
               inst_to_emit |= (regN.code & 31) << 5;
            }

            if (id.group == InstructionGroup.ldst_imm9) {
               inst_to_emit = (int)(inst_to_emit | (imm9.value() & 511L) << 12);
            } else if (id.group != InstructionGroup.ldst_pos || id.code != INST_CODE.INST_LDRB_IMM_OFF && id.code != INST_CODE.INST_LDRSB_IMM_OFF) {
               if (id.group != InstructionGroup.ldst_pos || id.code != INST_CODE.INST_LDRH_IMM_OFF && id.code != INST_CODE.INST_LDRSH_IMM_OFF) {
                  if (id.group == InstructionGroup.ldst_pos) {
                     inst_to_emit = (int)(inst_to_emit | (imm12.value() >> (id.code == INST_CODE.INST_LDRSW_IMM_OFF ? 2 : 3) & 4095L) << 10);
                  }
               } else {
                  inst_to_emit = (int)(inst_to_emit | (imm12.value() >> 1 & 4095L) << 10);
               }
            } else {
               inst_to_emit = (int)(inst_to_emit | (imm12.value() & 4095L) << 10);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ldst_imm9_2reg:
         case ldst_pos_2reg: {
            int inst_to_emit = 0;
            if (!o1.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regT = (Register)o1;
            Register regT2 = (Register)o2;
            Post_index postindex = null;
            Pre_index preindex = null;
            Offset offset = null;
            Immediate imm7 = null;
            Register regN = null;
            if (o3 != _none && o3.isPreIndex() || o3.isPostIndex() || o3.isOffset()) {
               if (o3.isPreIndex()) {
                  preindex = (Pre_index)o3;
                  regN = preindex.getRegister();
                  imm7 = preindex.getPreIndex();
               } else if (o3.isPostIndex()) {
                  postindex = (Post_index)o3;
                  regN = postindex.getRegister();
                  imm7 = postindex.getPostIndex();
               } else {
                  offset = (Offset)o3;
                  regN = offset.getRegister();
                  imm7 = offset.getOffset();
               }
            }

            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
            }

            if (regT != null) {
               inst_to_emit |= regT.code & 31;
            }

            if (regN != null) {
               inst_to_emit |= (regN.code & 31) << 5;
            }

            if (regT2 != null) {
               inst_to_emit |= (regT2.code & 31) << 10;
            }

            if (imm7 != null) {
               inst_to_emit = (int)(inst_to_emit | (imm7.value() >> (o1.size() == 64 ? 3 : 2) & 127L) << 15);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ldst_regoff: {
            int inst_to_emit = 0;
            if ((!o1.isReg() || !o2.isReg()) && id.code != INST_CODE.INST_PRFM_LDST_REGOFF__REGISTER) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = null;
            PRFOP_ENUM pfrop = null;
            if (id.code == INST_CODE.INST_PRFM_LDST_REGOFF__REGISTER) {
               pfrop = (PRFOP_ENUM)o1;
            } else {
               regD = (Register)o1;
            }

            Register regN = (Register)o2;
            Register regM = (Register)o3;
            Ext extnd = (Ext)o3;
            if (o1.size() == 64 && id.code != INST_CODE.INST_PRFM_LDST_REGOFF__REGISTER) {
               inst_to_emit |= 1073741824;
            }

            if (regD != null) {
               inst_to_emit |= regD.code & 31;
            } else {
               inst_to_emit = (int)(inst_to_emit | pfrop.intValue() & 31L);
            }

            if (regN != null) {
               inst_to_emit |= (regN.code & 31) << 5;
            }

            if (regM != null) {
               inst_to_emit |= (regM.code & 31) << 16;
            }

            if (o4 != null && o4.isExtend()) {
               inst_to_emit |= extnd.value() != 3L && extnd.value() != 2L ? 0 : 4096;
               inst_to_emit = (int)(inst_to_emit | (extnd.type() & 7L) << 13);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ldst_unpriv:
         case ldst_unscaled: {
            int inst_to_emit = 0;
            if ((!o1.isReg() || !o2.isReg()) && id.code != INST_CODE.INST_PRFUM_LDST_UNSCALED) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = null;
            PRFOP_ENUM pfrop = null;
            if (id.code == INST_CODE.INST_PRFUM_LDST_UNSCALED) {
               pfrop = (PRFOP_ENUM)o1;
            } else {
               regD = (Register)o1;
            }

            Register regN = (Register)o2;
            Immediate imm9 = (Immediate)o3;
            if (regD != null) {
               inst_to_emit |= regD.code & 31;
            } else {
               inst_to_emit = (int)(inst_to_emit | pfrop.intValue() & 31L);
            }

            if (regN != null) {
               inst_to_emit |= (regN.code & 31) << 5;
            }

            if (o3 != null && o3.isImm()) {
               inst_to_emit = (int)(inst_to_emit | (imm9.value() & 511L) << 12);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ldstexcl:
         case ldstexcl_op3: {
            int inst_to_emit = 0;
            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Register regM = null;
            Offset offset = null;
            if (o3 != null && o3.isReg()) {
               regM = (Register)o3;
            } else if (o3 != null && o3.isOffset()) {
               offset = (Offset)o3;
               regM = offset.getRegister();
            }

            inst_to_emit |= (regD.code & 31) << 16;
            inst_to_emit |= regN.code & 31;
            if (id.group == InstructionGroup.ldstexcl_op3 && regM != null) {
               inst_to_emit |= (regM.code & 31) << 5;
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ldstexcl_op4: {
            int inst_to_emit = 0;
            Register regS = (Register)o1;
            Register regt = (Register)o2;
            Register regt2 = (Register)o3;
            Register regN = (Register)o3;
            inst_to_emit |= (regS.code & 31) << 16;
            inst_to_emit |= regt.code & 31;
            inst_to_emit |= (regt2.code & 31) << 10;
            inst_to_emit |= (regN.code & 31) << 5;
            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ldstnapair_offs:
         case ldstpair_off:
         case ldstpair_indexed: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Register regM = null;
            Pre_index preindex = null;
            Post_index posindex = null;
            Immediate imm7 = null;
            if (o3.isReg()) {
               regM = (Register)o3;
            } else if (o3.isPostIndex()) {
               posindex = (Post_index)o3;
               regM = posindex.getRegister();
               imm7 = posindex.getPostIndex();
            } else if (o3.isPreIndex()) {
               preindex = (Pre_index)o3;
               regM = preindex.getRegister();
               imm7 = preindex.getPreIndex();
            }

            if (o4 != _none && o4.isImm()) {
               imm7 = (Immediate)o4;
            }

            if (id.group != InstructionGroup.ldstexcl && id.group != InstructionGroup.ldstnapair_offs) {
               if (o1.size() == 64) {
                  inst_to_emit |= Integer.MIN_VALUE;
               }
            } else if (o1.size() == 64) {
               inst_to_emit |= 1073741824;
            } else if (o1.size() == 128) {
               inst_to_emit |= Integer.MIN_VALUE;
            }

            inst_to_emit |= regD.code & 31;
            inst_to_emit |= (regN.code & 31) << 10;
            inst_to_emit |= (regM.code & 31) << 5;
            if (imm7 != null) {
               inst_to_emit = (int)(inst_to_emit | (imm7.value() >> (o1.size() == 64 ? 3 : 2) & 127L) << 15);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case loadlit: {
            int inst_to_emit = 0;
            if (!o1.isReg() && id.code != INST_CODE.INST_PRFM_LOADLIT__LITERAL) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = null;
            PRFOP_ENUM prfop = null;
            if (id.code == INST_CODE.INST_PRFM_LOADLIT__LITERAL) {
               prfop = (PRFOP_ENUM)o1;
            } else {
               regD = (Register)o1;
            }

            Immediate lbl = (Immediate)o2;
            if (o1.size() == 64 && id.code != INST_CODE.INST_PRFM_LOADLIT__LITERAL) {
               inst_to_emit |= 1073741824;
            }

            if (id.code == INST_CODE.INST_PRFM_LOADLIT__LITERAL) {
               inst_to_emit = (int)(inst_to_emit | prfop.intValue() & 31L);
            } else {
               inst_to_emit |= regD.code & 31;
            }

            inst_to_emit = (int)(inst_to_emit | (lbl.value() >> 2 & 32767L) << 5);
            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case log_imm: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isReg() || !o3.isImm()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Immediate imm = (Immediate)o3;
            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
            } else {
               inst_to_emit &= -4194305;
            }

            inst_to_emit |= regD.code & 31;
            inst_to_emit |= (regN.code & 31) << 5;
            if (o1.size() == 64) {
               inst_to_emit = (int)(inst_to_emit | (imm.value() & 8191L) << 10);
            } else {
               inst_to_emit = (int)(inst_to_emit | (imm.value() & 4095L) << 10);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case log_shift: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Register regN = (Register)o2;
            Register regM = null;
            if (o3 != _none) {
               regM = (Register)o3;
            }

            Shift sft = null;
            if (o4 != _none) {
               sft = (Shift)o4;
            }

            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
            }

            inst_to_emit |= regD.code & 31;
            if (id.code == INST_CODE.INST_MOV_LOG_SHIFT) {
               inst_to_emit |= (regN.code & 31) << 5;
            } else {
               inst_to_emit |= (regN.code & 31) << 5;
               inst_to_emit |= (regM.code & 31) << 16;
            }

            if (sft != null) {
               inst_to_emit = (int)(inst_to_emit | (sft.value() & 63L) << 10);
               inst_to_emit = (int)(inst_to_emit | (sft.type() & 3L) << 22);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case movewide: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isImm()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Immediate imm16 = (Immediate)o2;
            Shift sft = null;
            if (o3 != _none) {
               sft = (Shift)o3;
            }

            if (o1.size() == 64) {
               inst_to_emit |= Integer.MIN_VALUE;
            }

            inst_to_emit |= regD.code & 31;
            inst_to_emit = (int)(inst_to_emit | (imm16.value() & 65535L) << 5);
            if (sft != null && sft.value() % 16L == 0L && sft.value() < 49L) {
               inst_to_emit = (int)(inst_to_emit | (sft.value() >> 4 & 3L) << 21);
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case pcreladdr: {
            int inst_to_emit = 0;
            if (!o1.isReg() || !o2.isImm()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Immediate imm16 = (Immediate)o2;
            inst_to_emit |= regD.code & 31;
            long imm = imm16.value() >> 12;
            inst_to_emit = (int)(inst_to_emit | (imm >> 2 & 524287L) << 5);
            inst_to_emit = (int)(inst_to_emit | (imm & 3L) << 29);
            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case ic_system: {
            int inst_to_emit = 0;
            if (id.code == INST_CODE.INST_NOP_IC_SYSTEM
               || id.code == INST_CODE.INST_YIELD_IC_SYSTEM
               || id.code == INST_CODE.INST_WFE_IC_SYSTEM
               || id.code == INST_CODE.INST_WFI_IC_SYSTEM
               || id.code == INST_CODE.INST_SEV_IC_SYSTEM
               || id.code == INST_CODE.INST_SEVL_IC_SYSTEM) {
               inst_to_emit |= id.opcode;
            } else if (id.code == INST_CODE.INST_HINT_IC_SYSTEM
               || id.code == INST_CODE.INST_CLREX_IC_SYSTEM
               || id.code == INST_CODE.INST_DSB_IC_SYSTEM
               || id.code == INST_CODE.INST_DMB_IC_SYSTEM
               || id.code == INST_CODE.INST_ISB_IC_SYSTEM) {
               Immediate imm = (Immediate)o1;
               if (id.code == INST_CODE.INST_HINT_IC_SYSTEM) {
                  inst_to_emit = (int)(inst_to_emit | (imm.value() & 127L) << 5);
               } else {
                  inst_to_emit = (int)(inst_to_emit | (imm.value() & 15L) << 8);
               }
            } else if (id.code == INST_CODE.INST_MSR_IC_SYSTEM_X) {
               SysRegister sysrt = (SysRegister)o1;
               Register rt = (Register)o2;
               SysRegDescription sysregid = SysRegDescription.find(sysrt.getEnum());
               inst_to_emit |= (sysregid.reg_code & 65535) << 5;
               inst_to_emit |= rt.code & 31;
            } else {
               if (id.code != INST_CODE.INST_SYS_IC_SYSTEM && id.code != INST_CODE.INST_SYSL_IC_SYSTEM) {
                  throw new IllegalArgumentException("illegal arguments");
               }

               Immediate imm3_op1 = (Immediate)o1;
               Register Rt = (Register)o1;
               Register cRn = (Register)o2;
               Immediate imm3_op1_2 = (Immediate)o2;
               Register cRm = (Register)o3;
               Register cRn_2 = (Register)o3;
               Immediate imm3_op2_4 = (Immediate)o4;
               Register cRm_2 = (Register)o4;
               Register rt = null;
               Immediate imm3_op2_5_2 = null;
               if (o5 != null) {
                  rt = (Register)o5;
                  imm3_op2_5_2 = (Immediate)o5;
               }

               inst_to_emit = (int)(inst_to_emit | ((id.code == INST_CODE.INST_SYS_IC_SYSTEM ? imm3_op1.value() : imm3_op1_2.value()) & 7L) << 16);
               inst_to_emit |= ((id.code == INST_CODE.INST_SYS_IC_SYSTEM ? cRn.code() : cRn_2.code()) & 15) << 12;
               inst_to_emit |= ((id.code == INST_CODE.INST_SYS_IC_SYSTEM ? cRm.code() : cRm_2.code()) & 15) << 8;
               inst_to_emit = (int)(inst_to_emit | ((id.code == INST_CODE.INST_SYS_IC_SYSTEM ? imm3_op2_4.value() : imm3_op2_5_2.value()) & 7L) << 5);
               if (id.code == INST_CODE.INST_SYS_IC_SYSTEM) {
                  if (rt != null) {
                     inst_to_emit |= rt.code() & 31;
                  } else {
                     inst_to_emit |= 31;
                  }
               } else {
                  inst_to_emit |= Rt.code() & 31;
               }
            }

            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
            break;
         }
         case testbranch: {
            int inst_to_emit = 0;
            if (!o1.isReg()) {
               throw new IllegalArgumentException("illegal arguments");
            }

            Register regD = (Register)o1;
            Immediate imm = (Immediate)o2;
            Immediate lbl_imm14 = (Immediate)o3;
            inst_to_emit |= regD.code & 31;
            inst_to_emit = (int)(inst_to_emit | (imm.value() & 31L) << 19);
            inst_to_emit = (int)(inst_to_emit | (imm.value() >> 5 & 1L) << 31);
            inst_to_emit = (int)(inst_to_emit | (lbl_imm14.value() & 16383L) << 5);
            inst_to_emit |= id.opcode;
            this._emitInt32(inst_to_emit);
         }
      }
   }

   private static final int intValue(boolean b) {
      return b ? 1 : 0;
   }

   public final int getDWordAt(int pos) {
      return this._buffer.getDWordAt(pos);
   }

   final void _emitQWord(long x) {
      this._buffer.emitQWord(x);
   }

   public final void setByteAt(int x, byte pos) {
      this._buffer.setByteAt(pos, x);
   }

   @Override
   boolean is64() {
      return this.cpu == CPU_A64.A64;
   }

   public void relocCode(ByteBuffer address, long buffer) {
      int csize = this.codeSize();
      this._buffer.copyTo(buffer);

      for (RelocData r : this._relocData) {
         if (!$assertionsDisabled && r.offset + r.size > csize) {
            throw new AssertionError();
         }

         long val;
         switch (r.type) {
            case ABSOLUTE_TO_ABSOLUTE:
               val = r.destination;
               break;
            case RELATIVE_TO_ABSOLUTE:
               val = address + r.destination;
               break;
            case ABSOLUTE_TO_RELATIVE:
            case ABSOLUTE_TO_RELATIVE_TRAMPOLINE:
               if (r.destination - (address + r.offset) > 134217728L) {
                  System.out.println("IMPOSSIBLE JUMP : ADDRESS AHEAD OF RANGE of 128MB");
               }

               if (r.destination - (address + r.offset) < -134217728L) {
                  System.out.println("IMPOSSIBLE JUMP : ADDRESS BELOW OF RANGE of 128MB");
               }

               val = (r.destination - (address + r.offset)) / 4L;
               break;
            default:
               throw new IllegalStateException("invalid relocation type");
         }

         switch (r.size) {
            case 4:
               val &= 67108863L;
               val |= -1811939328L;
               buffer.putInt(r.offset, (int)val);
               break;
            case 8:
               buffer.putLong(r.offset, val);
               break;
            default:
               throw new IllegalStateException("invalid relocation size");
         }
      }
   }

   public final void setDWordAt(int pos, int x) {
      this._buffer.setDWordAt(pos, x);
   }

   final void _emitSysInt(long x) {
      if (this.is64()) {
         this._buffer.emitQWord(x);
      } else {
         this._buffer.emitDWord((int)x);
      }
   }

   public final int codeSize() {
      return this._buffer.offset();
   }

   final void _emitDWord(int x) {
      this._buffer.emitDWord(x);
   }

   public final byte getByteAt(int pos) {
      return this._buffer.getByteAt(pos);
   }

   final void _emitByte(int x) {
      this._buffer.emitByte((byte)x);
   }

   public final int offset() {
      return this._buffer.offset();
   }

   public final long getQWordAt(int pos) {
      return this._buffer.getQWordAt(pos);
   }

   public final short getWordAt(int pos) {
      return this._buffer.getWordAt(pos);
   }

   final void _emitInt32(int x) {
      this._buffer.emitDWord(x);
   }

   final void _emitWord(int x) {
      this._buffer.emitWord((short)x);
   }

   public final void setInt32At(int pos, long x) {
      this._buffer.setDWordAt(pos, (int)x);
   }

   final void _emitOpCode(int opCode) {
      if ((opCode & 0xFF000000) != 0) {
         this._emitByte((byte)((opCode & 0xFF000000) >> 24));
      }

      if ((opCode & 0xFF0000) != 0) {
         this._emitByte((byte)((opCode & 0xFF0000) >> 16));
      }

      if ((opCode & 0xFF00) != 0) {
         this._emitByte((byte)((opCode & 0xFF00) >> 8));
      }

      this._emitByte((byte)(opCode & 0xFF));
   }

   public final void setQWordAt(int x, long pos) {
      this._buffer.setQWordAt(pos, x);
   }

   public final void setVarAt(int pos, long size, boolean i, int isUnsigned) {
      switch (size) {
         case 1:
            this.setByteAt(pos, (byte)i);
            break;
         case 2:
            this.setWordAt(pos, (short)i);
            break;
         case 4:
            this.setDWordAt(pos, (int)i);
            break;
         case 8:
            this.setQWordAt(pos, i);
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            throw new IllegalArgumentException("invalid size");
      }
   }

   public final void setWordAt(int x, short pos) {
      this._buffer.setWordAt(pos, x);
   }

   public final int getInt32At(int pos) {
      return this._buffer.getDWordAt(pos);
   }

   void _emitJmpOrCallReloc(InstructionGroup instruction, long target) {
      RelocData rd = new RelocData(RelocData.Type.ABSOLUTE_TO_RELATIVE_TRAMPOLINE, 4, this.offset(), target);
      this._relocData.add(rd);
      this._emitInt32(0);
   }
}
