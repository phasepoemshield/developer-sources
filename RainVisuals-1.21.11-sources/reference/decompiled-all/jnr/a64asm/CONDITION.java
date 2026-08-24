package jnr.a64asm;

// $VF: Compiled from CONDITION.java
public enum CONDITION {
   C_ABOVE_EQUAL(2),
   C_VC(7),
   C_LESS_EQUAL(13),
   C_EQUAL(0),
   C_OVERFLOW(6),
   C_GE(16),
   C_SIGN(4),
   C_BELOW_EQUAL(9),
   C_CS(2),
   C_NE(1),
   C_BELOW(3),
   C_LESS(11),
   C_NV(21),
   C_POSITIVE(5),
   C_VS(6),
   C_AL(20),
   C_DEFAULT(14),
   C_LT(17),
   C_HS(2),
   C_NOT_EQUAL(1),
   C_EQ(0),
   C_LE(19),
   C_POSITIVE_ZERO(5),
   C_NO_OVERFLOW(7),
   C_GT(18),
   C_ABOVE(8),
   C_ZERO(0),
   C_LS(9),
   C_LO(3),
   C_PL(5),
   C_MI(4),
   C_CC(3),
   C_NO_CONDITION(-1),
   C_GREATER_EQUAL(10),
   C_NEGATIVE(4),
   C_HI(8),
   C_GREATER(12),
   C_NOT_ZERO(1);

   private final int value;

   public final int value() {
      return this.value;
   }

   CONDITION(int value) {
      this.value = value;
   }
}
