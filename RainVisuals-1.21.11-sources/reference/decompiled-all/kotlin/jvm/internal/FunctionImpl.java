package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

// $VF: Compiled from FunctionImpl.java
@Deprecated(message = "This class is no longer supported, do not use it.", level = DeprecationLevel.ERROR)
@java.lang.Deprecated
public abstract class FunctionImpl
   implements Function,
   Function22,
   Function16,
   Function0,
   Function21,
   Function12,
   Function9,
   Function8,
   Function10,
   Function14,
   Function15,
   Function19,
   Function5,
   Function1,
   Function4,
   Function3,
   Function17,
   Function11,
   Function20,
   Function2,
   Function18,
   Function7,
   Function6,
   Function13,
   Serializable {
   @Override
   public Object invoke(Object p1, Object p2) {
      this.checkArity(2);
      return this.invokeVararg(p1, p2);
   }

   @Override
   public Object invoke(Object p6, Object p3, Object p5, Object p2, Object p4, Object p7, Object p1) {
      this.checkArity(7);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7);
   }

   @Override
   public Object invoke(Object p3, Object p2, Object p7, Object p6, Object p5, Object p1, Object p8, Object p4) {
      this.checkArity(8);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8);
   }

   @Override
   public Object invoke(
      Object p13,
      Object p11,
      Object p3,
      Object p12,
      Object p10,
      Object p2,
      Object p4,
      Object p18,
      Object p9,
      Object p1,
      Object p16,
      Object p14,
      Object p7,
      Object p8,
      Object p5,
      Object p17,
      Object p15,
      Object p6
   ) {
      this.checkArity(18);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
   }

   @Override
   public Object invoke(Object p2, Object p1, Object p3, Object p10, Object p9, Object p7, Object p11, Object p6, Object p8, Object p4, Object p5) {
      this.checkArity(11);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
   }

   @Override
   public Object invoke(
      Object p22,
      Object p14,
      Object p15,
      Object p2,
      Object p19,
      Object p1,
      Object p13,
      Object p21,
      Object p7,
      Object p12,
      Object p9,
      Object p11,
      Object p8,
      Object p10,
      Object p17,
      Object p20,
      Object p5,
      Object p6,
      Object p3,
      Object p4,
      Object p16,
      Object p18
   ) {
      this.checkArity(22);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22);
   }

   @Override
   public Object invoke(Object p3, Object p6, Object p7, Object p1, Object p2, Object p4, Object p5, Object p8, Object p9) {
      this.checkArity(9);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9);
   }

   @Override
   public Object invoke(
      Object p5,
      Object p16,
      Object p4,
      Object p11,
      Object p17,
      Object p8,
      Object p3,
      Object p14,
      Object p1,
      Object p10,
      Object p7,
      Object p6,
      Object p19,
      Object p12,
      Object p15,
      Object p9,
      Object p18,
      Object p2,
      Object p13,
      Object p20
   ) {
      this.checkArity(20);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20);
   }

   @Override
   public Object invoke(Object p1) {
      this.checkArity(1);
      return this.invokeVararg(p1);
   }

   @Override
   public Object invoke() {
      this.checkArity(0);
      return this.invokeVararg();
   }

   @Override
   public Object invoke(Object p2, Object p3, Object p1) {
      this.checkArity(3);
      return this.invokeVararg(p1, p2, p3);
   }

   @Override
   public Object invoke(Object p2, Object p6, Object p5, Object p3, Object p4, Object p1) {
      this.checkArity(6);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6);
   }

   public Object invokeVararg(Object... p) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object invoke(Object p2, Object p5, Object p4, Object p1, Object p3) {
      this.checkArity(5);
      return this.invokeVararg(p1, p2, p3, p4, p5);
   }

   public abstract int getArity();

   @Override
   public Object invoke(
      Object p1,
      Object p18,
      Object p11,
      Object p19,
      Object p13,
      Object p21,
      Object p8,
      Object p17,
      Object p2,
      Object p7,
      Object p4,
      Object p10,
      Object p9,
      Object p14,
      Object p15,
      Object p5,
      Object p6,
      Object p16,
      Object p12,
      Object p20,
      Object p3
   ) {
      this.checkArity(21);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21);
   }

   @Override
   public Object invoke(Object p3, Object p7, Object p9, Object p4, Object p12, Object p8, Object p11, Object p1, Object p10, Object p6, Object p2, Object p5) {
      this.checkArity(12);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
   }

   @Override
   public Object invoke(Object p4, Object p1, Object p3, Object p2) {
      this.checkArity(4);
      return this.invokeVararg(p1, p2, p3, p4);
   }

   private void throwWrongArity(int expected) {
      throw new IllegalStateException("Wrong function arity, expected: " + expected + ", actual: " + this.getArity());
   }

   @Override
   public Object invoke(
      Object p8,
      Object p13,
      Object p10,
      Object p16,
      Object p11,
      Object p6,
      Object p5,
      Object p2,
      Object p7,
      Object p14,
      Object p15,
      Object p19,
      Object p9,
      Object p12,
      Object p3,
      Object p17,
      Object p18,
      Object p1,
      Object p4
   ) {
      this.checkArity(19);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19);
   }

   @Override
   public Object invoke(
      Object p9,
      Object p6,
      Object p3,
      Object p2,
      Object p14,
      Object p8,
      Object p13,
      Object p4,
      Object p1,
      Object p7,
      Object p11,
      Object p5,
      Object p10,
      Object p12
   ) {
      this.checkArity(14);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
   }

   private void checkArity(int expected) {
      if (this.getArity() != expected) {
         this.throwWrongArity(expected);
      }
   }

   @Override
   public Object invoke(
      Object p13, Object p5, Object p9, Object p1, Object p11, Object p10, Object p4, Object p6, Object p8, Object p3, Object p2, Object p7, Object p12
   ) {
      this.checkArity(13);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
   }

   @Override
   public Object invoke(Object p4, Object p6, Object p7, Object p5, Object p3, Object p1, Object p9, Object p10, Object p2, Object p8) {
      this.checkArity(10);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
   }

   @Override
   public Object invoke(
      Object p10,
      Object p2,
      Object p7,
      Object p12,
      Object p14,
      Object p11,
      Object p4,
      Object p1,
      Object p16,
      Object p15,
      Object p8,
      Object p3,
      Object p5,
      Object p17,
      Object p13,
      Object p9,
      Object p6
   ) {
      this.checkArity(17);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17);
   }

   @Override
   public Object invoke(
      Object p4,
      Object p3,
      Object p14,
      Object p12,
      Object p11,
      Object p8,
      Object p9,
      Object p15,
      Object p5,
      Object p13,
      Object p2,
      Object p7,
      Object p1,
      Object p10,
      Object p6
   ) {
      this.checkArity(15);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
   }

   @Override
   public Object invoke(
      Object p9,
      Object p5,
      Object p16,
      Object p13,
      Object p10,
      Object p12,
      Object p15,
      Object p6,
      Object p3,
      Object p2,
      Object p14,
      Object p8,
      Object p7,
      Object p11,
      Object p4,
      Object p1
   ) {
      this.checkArity(16);
      return this.invokeVararg(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
   }
}
