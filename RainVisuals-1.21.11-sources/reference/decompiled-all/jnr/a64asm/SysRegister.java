package jnr.a64asm;

// $VF: Compiled from SysRegister.java
public class SysRegister extends Operand {
   SYSREG_CODE sysRegEnum;
   private static final SysRegister[] sys = new SysRegister[305];

   public static final SysRegister sysReg(SYSREG_CODE reg) {
      return sys[reg.ordinal()];
   }

   public SYSREG_CODE getEnum() {
      return this.sysRegEnum;
   }

   static {
      for (SYSREG_CODE i = SYSREG_CODE.SPSR_EL1; i.ordinal() < SYSREG_CODE.SYSREG_MAX.ordinal(); i = SYSREG_CODE.valueOf(i.ordinal() + 1)) {
         sys[i.ordinal()] = new SysRegister(i);
      }
   }

   public SysRegister(SYSREG_CODE sysRegEnum) {
      super(9, 64);
      this.sysRegEnum = sysRegEnum;
   }
}
