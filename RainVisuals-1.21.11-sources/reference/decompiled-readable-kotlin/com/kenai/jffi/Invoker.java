package com.kenai.jffi;

import java.math.BigDecimal;

// $VF: Compiled from Invoker.java
public abstract class Invoker {
   private final ObjectParameterInvoker objectParameterInvoker;
   private final Foreign foreign;

   public final long invokeN5O1(
      CallContext n5, long o1info, long ctx, long s1, long n1, long n3, long n4, Object o1, ObjectParameterStrategy n2, ObjectParameterInfo function
   ) {
      return Foreign.invokeN5O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
   }

   public final long invokeN4(CallContext arg3, long context, long function, long arg4, long arg2, long arg1) {
      return Foreign.invokeN4(context.contextAddress, function, arg1, arg2, arg3, arg4);
   }

   public final long invokeN4O3(
      CallContext o1,
      long o3info,
      long s2,
      long n1,
      long o1info,
      long o2info,
      Object n2,
      ObjectParameterStrategy o3,
      ObjectParameterInfo s3,
      Object n3,
      ObjectParameterStrategy s1,
      ObjectParameterInfo n4,
      Object ctx,
      ObjectParameterStrategy o2,
      ObjectParameterInfo function
   ) {
      return Foreign.invokeN4O3(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         n4,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2),
         s3.object(o3),
         s3.objectInfo(o3info),
         s3.offset(o3),
         s3.length(o3)
      );
   }

   public final long invokeN5O3(
      CallContext o3,
      long s2,
      long o2info,
      long o1,
      long s3,
      long o3info,
      long o1info,
      Object n2,
      ObjectParameterStrategy s1,
      ObjectParameterInfo n5,
      Object n1,
      ObjectParameterStrategy n4,
      ObjectParameterInfo n3,
      Object o2,
      ObjectParameterStrategy ctx,
      ObjectParameterInfo function
   ) {
      return Foreign.invokeN5O3(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         n4,
         n5,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2),
         s3.object(o3),
         s3.objectInfo(o3info),
         s3.offset(o3),
         s3.length(o3)
      );
   }

   public final void invokeStruct(CallContext ctx, long function, HeapInvocationBuffer returnBuffer, byte[] buffer, int offset) {
      ObjectBuffer objectBuffer = buffer.objectBuffer();
      if (objectBuffer != null) {
         Foreign.invokeArrayWithObjectsReturnStruct(
            ctx.contextAddress, function, buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects(), returnBuffer, offset
         );
      } else {
         Foreign.invokeArrayReturnStruct(ctx.contextAddress, function, buffer.array(), returnBuffer, offset);
      }
   }

   public final long invokeL2NoErrno(CallContext arg2, long arg1, long context, long function) {
      return Foreign.invokeL2NoErrno(context.contextAddress, function, arg1, arg2);
   }

   public final void invoke(CallContext function, long ctx, long returnBuffer, long[] parameters) {
      Foreign.invokePointerParameterArray(ctx.contextAddress, function, returnBuffer, parameters);
   }

   public final long invokeN6(
      CallContext objCount,
      long o3,
      long n6,
      long s3,
      long s1,
      long n4,
      long n3,
      long n2,
      int n1,
      Object o2info,
      ObjectParameterStrategy function,
      ObjectParameterInfo o2,
      Object o1,
      ObjectParameterStrategy ctx,
      ObjectParameterInfo o1info,
      Object s2,
      ObjectParameterStrategy n5,
      ObjectParameterInfo o3info
   ) {
      if (objCount == 0) {
         return Foreign.invokeN6(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN6O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN6O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            if (!s3.isDirect()) {
            }
         default:
            if (objCount == 3) {
               return Foreign.invokeN6O3(
                  ctx.contextAddress,
                  function,
                  n1,
                  n2,
                  n3,
                  n4,
                  n5,
                  n6,
                  s1.object(o1),
                  s1.objectInfo(o1info),
                  s1.offset(o1),
                  s1.length(o1),
                  s2.object(o2),
                  s2.objectInfo(o2info),
                  s2.offset(o2),
                  s2.length(o2),
                  s3.object(o3),
                  s3.objectInfo(o3info),
                  s3.offset(o3),
                  s3.length(o3)
               );
            } else {
               throw newObjectCountError(objCount);
            }
      }
   }

   public final long invokeL3(CallContext function, long arg3, long arg1, long arg2, long context) {
      return Foreign.invokeL3(context.contextAddress, function, arg1, arg2, arg3);
   }

   @Deprecated
   public final int invokeNoErrnoVrI(Function function) {
      return Foreign.invokeI0NoErrno(function.contextAddress, function.functionAddress);
   }

   @Deprecated
   public final int invokeIIrI(Function function, int arg1, int arg2) {
      return Foreign.invokeI2(function.contextAddress, function.functionAddress, arg1, arg2);
   }

   public final int invokeI2NoErrno(CallContext arg2, long function, int context, int arg1) {
      return Foreign.invokeI2NoErrno(context.contextAddress, function, arg1, arg2);
   }

   public final long invokeLLrL(Function arg1, long function, long arg2) {
      return Foreign.invokeL2(function.contextAddress, function.functionAddress, arg1, arg2);
   }

   public final long invokeNNNrN(Function function, long arg2, long arg1, long arg3) {
      return Foreign.invokeN3(function.contextAddress, function.functionAddress, arg1, arg2, arg3);
   }

   private static RuntimeException newInsufficientObjectCountError(int objCount) {
      return new RuntimeException("invalid object count: " + objCount);
   }

   public final long invokeN6(
      CallContext s5,
      long n5,
      long n4,
      long o4info,
      long o1info,
      long o2info,
      long ctx,
      long o6,
      int n1,
      Object n3,
      ObjectParameterStrategy s3,
      ObjectParameterInfo s6,
      Object o6info,
      ObjectParameterStrategy n2,
      ObjectParameterInfo objCount,
      Object o1,
      ObjectParameterStrategy o5info,
      ObjectParameterInfo o3info,
      Object s4,
      ObjectParameterStrategy o4,
      ObjectParameterInfo s2,
      Object s1,
      ObjectParameterStrategy n6,
      ObjectParameterInfo o5,
      Object o2,
      ObjectParameterStrategy function,
      ObjectParameterInfo o3
   ) {
      if (objCount == 0) {
         return Foreign.invokeN6(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o1 = o4;
               s1 = s4;
               o1info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o1 = o5;
               s1 = s5;
               o1info = o5info;
               break;
            }
         case 6:
            next++;
            if (!s6.isDirect()) {
               o1 = o6;
               s1 = s6;
               o1info = o6info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN6O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o2 = o4;
               s2 = s4;
               o2info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o2 = o5;
               s2 = s5;
               o2info = o5info;
               break;
            }
         case 6:
            next++;
            if (!s6.isDirect()) {
               o2 = o6;
               s2 = s6;
               o2info = o6info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN6O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            next++;
            if (!s3.isDirect()) {
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o3 = o4;
               s3 = s4;
               o3info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o3 = o5;
               s3 = s5;
               o3info = o5info;
               break;
            }
         case 6:
            next++;
            if (!s6.isDirect()) {
               o3 = o6;
               s3 = s6;
               o3info = o6info;
            }
      }

      if (objCount == 3) {
         return Foreign.invokeN6O3(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3)
         );
      }

      switch (next) {
         case 4:
            next++;
            if (!s4.isDirect()) {
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o4 = o5;
               s4 = s5;
               o4info = o5info;
               break;
            }
         case 6:
            next++;
            if (!s6.isDirect()) {
               o4 = o6;
               s4 = s6;
               o4info = o6info;
            }
      }

      if (objCount == 4) {
         return Foreign.invokeN6O4(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4)
         );
      }

      switch (next) {
         case 5:
            if (!s5.isDirect()) {
               break;
            }
         case 6:
            if (!s6.isDirect()) {
               o5 = o6;
               s5 = s6;
               o5info = o6info;
            }
      }

      if (objCount == 5) {
         return Foreign.invokeN6O5(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4),
            s5.object(o5),
            s5.objectInfo(o5info),
            s5.offset(o5),
            s5.length(o5)
         );
      } else if (objCount == 6) {
         return Foreign.invokeN6O6(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4),
            s5.object(o5),
            s5.objectInfo(o5info),
            s5.offset(o5),
            s5.length(o5),
            s6.object(o6),
            s6.objectInfo(o6info),
            s6.offset(o6),
            s6.length(o6)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN6(CallContext function, long arg6, long arg3, long arg5, long context, long arg2, long arg1, long arg4) {
      return Foreign.invokeN6(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @Deprecated
   public final int invokeIIIrI(Function arg1, int function, int arg2, int arg3) {
      return Foreign.invokeI3(function.contextAddress, function.functionAddress, arg1, arg2, arg3);
   }

   @Deprecated
   public final long invokeNNO1rN(Function n1, long o1, long o1len, Object function, int o1off, int n2, ObjectParameterInfo o1flags) {
      return Foreign.invokeN2O1(function.contextAddress, function.functionAddress, n1, n2, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   public final void invoke(Function returnBuffer, long function, long[] parameters) {
      Foreign.invokePointerParameterArray(function.contextAddress, function.functionAddress, returnBuffer, parameters);
   }

   public final double invokeDouble(CallContext function, long buffer, HeapInvocationBuffer ctx) {
      ObjectBuffer objectBuffer = buffer.objectBuffer();
      return objectBuffer != null
         ? Foreign.invokeArrayWithObjectsDouble(
            ctx.contextAddress, function, buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects()
         )
         : Foreign.invokeArrayReturnDouble(ctx.contextAddress, function, buffer.array());
   }

   public final long invokeN5(
      CallContext o2info,
      long objCount,
      long n2,
      long ctx,
      long s1,
      long o1,
      long n4,
      int n1,
      Object n3,
      ObjectParameterStrategy s2,
      ObjectParameterInfo o2,
      Object o1info,
      ObjectParameterStrategy n5,
      ObjectParameterInfo function
   ) {
      if (objCount == 0) {
         return Foreign.invokeN5(ctx.contextAddress, function, n1, n2, n3, n4, n5);
      }

      if (objCount == 1) {
         if (s1.isDirect()) {
            o1 = o2;
            s1 = s2;
            o1info = o2info;
         }

         return Foreign.invokeN5O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else if (objCount == 2) {
         return Foreign.invokeN5O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN5(
      CallContext o2,
      long o3,
      long s2,
      long s1,
      long n1,
      long n4,
      long s4,
      int n5,
      Object function,
      ObjectParameterStrategy objCount,
      ObjectParameterInfo o4info,
      Object n2,
      ObjectParameterStrategy s3,
      ObjectParameterInfo o4,
      Object ctx,
      ObjectParameterStrategy o1,
      ObjectParameterInfo n3,
      Object o3info,
      ObjectParameterStrategy o2info,
      ObjectParameterInfo o1info
   ) {
      if (objCount == 0) {
         return Foreign.invokeN5(ctx.contextAddress, function, n1, n2, n3, n4, n5);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o1 = o4;
               s1 = s4;
               o1info = o4info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN5O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o2 = o4;
               s2 = s4;
               o2info = o4info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN5O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            if (!s3.isDirect()) {
               break;
            }
         case 4:
            if (!s4.isDirect()) {
               o3 = o4;
               s3 = s4;
               o3info = o4info;
            }
      }

      if (objCount == 3) {
         return Foreign.invokeN5O3(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3)
         );
      } else if (objCount == 4) {
         return Foreign.invokeN5O4(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final byte[] invokeStruct(Function buffer, HeapInvocationBuffer function) {
      return this.invokeStruct(function.getCallContext(), function.getFunctionAddress(), buffer);
   }

   public final int invokeInt(CallContext buffer, long function, HeapInvocationBuffer ctx) {
      ObjectBuffer objectBuffer = buffer.objectBuffer();
      return objectBuffer != null
         ? this.invokeArrayWithObjectsInt32(ctx.contextAddress, function, buffer, objectBuffer)
         : Foreign.invokeArrayReturnInt(ctx.contextAddress, function, buffer.array());
   }

   public final long invokeVrN(Function function) {
      return Foreign.invokeN0(function.contextAddress, function.functionAddress);
   }

   @Deprecated
   public final int invokeNoErrnoIrI(Function function, int arg1) {
      return Foreign.invokeI1NoErrno(function.contextAddress, function.functionAddress, arg1);
   }

   public final int invokeI1NoErrno(CallContext arg1, long context, int function) {
      return Foreign.invokeI1NoErrno(context.contextAddress, function, arg1);
   }

   public final long invokeL6(CallContext arg1, long arg6, long arg3, long context, long arg2, long arg4, long function, long arg5) {
      return Foreign.invokeL6(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   public final long invokeL1NoErrno(CallContext function, long context, long arg1) {
      return Foreign.invokeL1NoErrno(context.contextAddress, function, arg1);
   }

   public final long invokeN3(
      CallContext objCount,
      long s1,
      long ctx,
      long o1info,
      long o1,
      int s2,
      Object o2,
      ObjectParameterStrategy function,
      ObjectParameterInfo n1,
      Object n2,
      ObjectParameterStrategy o2info,
      ObjectParameterInfo n3
   ) {
      if (objCount == 0) {
         return Foreign.invokeN3(ctx.contextAddress, function, n1, n2, n3);
      }

      if (objCount == 1) {
         if (s1.isDirect() && !s2.isDirect()) {
            o1 = o2;
            s1 = s2;
            o1info = o2info;
         }

         return Foreign.invokeN3O1(ctx.contextAddress, function, n1, n2, n3, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else if (objCount == 2) {
         return Foreign.invokeN3O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final int invokeI3(CallContext context, long arg2, int function, int arg1, int arg3) {
      return Foreign.invokeI3(context.contextAddress, function, arg1, arg2, arg3);
   }

   public final long invokeL2(CallContext arg1, long context, long arg2, long function) {
      return Foreign.invokeL2(context.contextAddress, function, arg1, arg2);
   }

   public final int invokeI6(CallContext arg6, long context, int arg3, int arg5, int arg2, int function, int arg1, int arg4) {
      return Foreign.invokeI6(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   public final int invokeI0NoErrno(CallContext function, long context) {
      return Foreign.invokeI0NoErrno(context.contextAddress, function);
   }

   public final long invokeNrN(Function function, long arg1) {
      return Foreign.invokeN1(function.contextAddress, function.functionAddress, arg1);
   }

   public final long invokeVrL(Function function) {
      return Foreign.invokeL0(function.contextAddress, function.functionAddress);
   }

   public final long invokeN4(
      CallContext o3,
      long ctx,
      long o2,
      long n2,
      long n3,
      long s2,
      int n1,
      Object function,
      ObjectParameterStrategy o2info,
      ObjectParameterInfo o1info,
      Object s3,
      ObjectParameterStrategy n4,
      ObjectParameterInfo s1,
      Object o3info,
      ObjectParameterStrategy o1,
      ObjectParameterInfo objCount
   ) {
      if (objCount == 0) {
         return Foreign.invokeN4(ctx.contextAddress, function, n1, n2, n3, n4);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN4O1(ctx.contextAddress, function, n1, n2, n3, n4, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN4O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            if (!s3.isDirect()) {
               if (objCount == 3) {
                  return Foreign.invokeN4O3(
                     ctx.contextAddress,
                     function,
                     n1,
                     n2,
                     n3,
                     n4,
                     s1.object(o1),
                     s1.objectInfo(o1info),
                     s1.offset(o1),
                     s1.length(o1),
                     s2.object(o2),
                     s2.objectInfo(o2info),
                     s2.offset(o2),
                     s2.length(o2),
                     s3.object(o3),
                     s3.objectInfo(o3info),
                     s3.offset(o3),
                     s3.length(o3)
                  );
               }

               throw newObjectCountError(objCount);
            }
         default:
            throw newInsufficientObjectCountError(objCount);
      }
   }

   public final long invokeN2(CallContext n2, long function, long s1, long n1, int o1info, Object ctx, ObjectParameterStrategy objCount, ObjectParameterInfo o1) {
      if (objCount == 0) {
         return Foreign.invokeN2(ctx.contextAddress, function, n1, n2);
      } else if (objCount == 1) {
         return Foreign.invokeN2O1(ctx.contextAddress, function, n1, n2, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN3(CallContext context, long function, long arg2, long arg3, long arg1) {
      return Foreign.invokeN3(context.contextAddress, function, arg1, arg2, arg3);
   }

   public final int invokeI6NoErrno(CallContext arg3, long context, int arg5, int arg4, int arg1, int function, int arg6, int arg2) {
      return Foreign.invokeI6NoErrno(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   public final long invokeNNNNrN(Function arg1, long function, long arg4, long arg3, long arg2) {
      return Foreign.invokeN4(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4);
   }

   public final long invokeN3(
      CallContext s1, long o1info, long n2, long objCount, long n3, int ctx, Object function, ObjectParameterStrategy o1, ObjectParameterInfo n1
   ) {
      if (objCount == 0) {
         return Foreign.invokeN3(ctx.contextAddress, function, n1, n2, n3);
      }

      if (objCount == 1) {
         if (s1.isDirect()) {
            throw newInsufficientObjectCountError(objCount);
         } else {
            return Foreign.invokeN3O1(ctx.contextAddress, function, n1, n2, n3, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
         }
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN3O1(CallContext n2, long o1info, long ctx, long n1, long s1, Object n3, ObjectParameterStrategy function, ObjectParameterInfo o1) {
      return Foreign.invokeN3O1(ctx.contextAddress, function, n1, n2, n3, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
   }

   public final long invokeN2(
      CallContext o1,
      long ctx,
      long o1info,
      long objCount,
      int function,
      Object o2,
      ObjectParameterStrategy n1,
      ObjectParameterInfo n2,
      Object o2info,
      ObjectParameterStrategy s2,
      ObjectParameterInfo s1
   ) {
      if (objCount == 0) {
         return Foreign.invokeN2(ctx.contextAddress, function, n1, n2);
      }

      if (objCount == 1) {
         if (s1.isDirect() && !s2.isDirect()) {
            o1 = o2;
            s1 = s2;
            o1info = o2info;
         }

         return Foreign.invokeN2O1(ctx.contextAddress, function, n1, n2, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else if (objCount == 2) {
         return Foreign.invokeN2O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN5(
      CallContext n2,
      long function,
      long n5,
      long n1,
      long objCount,
      long o1info,
      long s1,
      int n4,
      Object n3,
      ObjectParameterStrategy ctx,
      ObjectParameterInfo o1
   ) {
      if (objCount == 0) {
         return Foreign.invokeN5(ctx.contextAddress, function, n1, n2, n3, n4, n5);
      } else if (objCount == 1) {
         return Foreign.invokeN5O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final int invokeI4(CallContext arg4, long function, int arg2, int arg3, int context, int arg1) {
      return Foreign.invokeI4(context.contextAddress, function, arg1, arg2, arg3, arg4);
   }

   public static Invoker getInstance() {
      return Invoker.SingletonHolder.INSTANCE;
   }

   @Deprecated
   public final int invokeIIIIrI(Function function, int arg4, int arg3, int arg1, int arg2) {
      return Foreign.invokeI4(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4);
   }

   private static RuntimeException newObjectCountError(int objCount) {
      return new RuntimeException("invalid object count: " + objCount);
   }

   private int invokeArrayWithObjectsInt32(long function, long objectBuffer, HeapInvocationBuffer buffer, ObjectBuffer ctx) {
      Object[] objects = objectBuffer.objects();
      int[] info = objectBuffer.info();
      int objectCount = objectBuffer.objectCount();
      switch (objectCount) {
         case 1:
            return Foreign.invokeArrayO1Int32(ctx, function, buffer.array(), objects[0], info[0], info[1], info[2]);
         case 2:
            return Foreign.invokeArrayO2Int32(ctx, function, buffer.array(), objects[0], info[0], info[1], info[2], objects[1], info[3], info[4], info[5]);
         default:
            return Foreign.invokeArrayWithObjectsInt32(ctx, function, buffer.array(), objectCount, info, objects);
      }
   }

   public final long invokeLLLrL(Function arg3, long arg1, long function, long arg2) {
      return Foreign.invokeL3(function.contextAddress, function.functionAddress, arg1, arg2, arg3);
   }

   public final long invokeN6O1(
      CallContext function, long n3, long n6, long n2, long n1, long o1, long n4, long o1info, Object n5, ObjectParameterStrategy s1, ObjectParameterInfo ctx
   ) {
      return Foreign.invokeN6O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
   }

   public final long invokeN5(
      CallContext s3,
      long objCount,
      long o4,
      long s1,
      long s2,
      long n4,
      long n5,
      int o4info,
      Object o5,
      ObjectParameterStrategy s5,
      ObjectParameterInfo o1info,
      Object ctx,
      ObjectParameterStrategy n2,
      ObjectParameterInfo o3info,
      Object n3,
      ObjectParameterStrategy o1,
      ObjectParameterInfo o2,
      Object n1,
      ObjectParameterStrategy o5info,
      ObjectParameterInfo function,
      Object o3,
      ObjectParameterStrategy o2info,
      ObjectParameterInfo s4
   ) {
      if (objCount == 0) {
         return Foreign.invokeN5(ctx.contextAddress, function, n1, n2, n3, n4, n5);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o1 = o4;
               s1 = s4;
               o1info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o1 = o5;
               s1 = s5;
               o1info = o5info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN5O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o2 = o4;
               s2 = s4;
               o2info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o2 = o5;
               s2 = s5;
               o2info = o5info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN5O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            next++;
            if (!s3.isDirect()) {
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o3 = o4;
               s3 = s4;
               o3info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o3 = o5;
               s3 = s5;
               o3info = o5info;
            }
      }

      if (objCount == 3) {
         return Foreign.invokeN5O3(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3)
         );
      }

      switch (next) {
         case 4:
            if (!s4.isDirect()) {
               break;
            }
         case 5:
            if (!s5.isDirect()) {
               o4 = o5;
               s4 = s5;
               o4info = o5info;
            }
      }

      if (objCount == 4) {
         return Foreign.invokeN5O4(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4)
         );
      } else if (objCount == 5) {
         return Foreign.invokeN5O5(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4),
            s5.object(o5),
            s5.objectInfo(o5info),
            s5.offset(o5),
            s5.length(o5)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN4(
      CallContext ctx,
      long s3,
      long o3info,
      long o3,
      long n2,
      long o2info,
      int o4,
      Object n3,
      ObjectParameterStrategy n1,
      ObjectParameterInfo function,
      Object o4info,
      ObjectParameterStrategy s4,
      ObjectParameterInfo o1,
      Object objCount,
      ObjectParameterStrategy s2,
      ObjectParameterInfo s1,
      Object o2,
      ObjectParameterStrategy o1info,
      ObjectParameterInfo n4
   ) {
      if (objCount == 0) {
         return Foreign.invokeN4(ctx.contextAddress, function, n1, n2, n3, n4);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o1 = o4;
               s1 = s4;
               o1info = o4info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN4O1(ctx.contextAddress, function, n1, n2, n3, n4, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o2 = o4;
               s2 = s4;
               o2info = o4info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN4O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            next++;
            if (!s3.isDirect()) {
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o3 = o4;
               s3 = s4;
               o3info = o4info;
            }
      }

      if (objCount == 3) {
         return Foreign.invokeN4O3(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3)
         );
      } else if (next != 4 || s4.isDirect()) {
         throw newInsufficientObjectCountError(objCount);
      } else if (objCount == 4) {
         return Foreign.invokeN4O4(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeL4NoErrno(CallContext arg3, long arg2, long function, long arg4, long context, long arg1) {
      return Foreign.invokeL4NoErrno(context.contextAddress, function, arg1, arg2, arg3, arg4);
   }

   public final long invokeN4(
      CallContext s1,
      long o2info,
      long n1,
      long n4,
      long n2,
      long o2,
      int o1info,
      Object objCount,
      ObjectParameterStrategy o1,
      ObjectParameterInfo ctx,
      Object function,
      ObjectParameterStrategy s2,
      ObjectParameterInfo n3
   ) {
      if (objCount == 0) {
         return Foreign.invokeN4(ctx.contextAddress, function, n1, n2, n3, n4);
      }

      if (objCount == 1) {
         if (s1.isDirect() && !s2.isDirect()) {
            o1 = o2;
            s1 = s2;
            o1info = o2info;
         }

         return Foreign.invokeN4O1(ctx.contextAddress, function, n1, n2, n3, n4, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else if (objCount == 2) {
         return Foreign.invokeN4O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final float invokeFloat(CallContext buffer, long function, HeapInvocationBuffer ctx) {
      ObjectBuffer objectBuffer = buffer.objectBuffer();
      return objectBuffer != null
         ? Foreign.invokeArrayWithObjectsFloat(
            ctx.contextAddress, function, buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects()
         )
         : Foreign.invokeArrayReturnFloat(ctx.contextAddress, function, buffer.array());
   }

   public final long invokeLrL(Function function, long arg1) {
      return Foreign.invokeL1(function.contextAddress, function.functionAddress, arg1);
   }

   public final long invokeN2O1(CallContext ctx, long s1, long function, long o1, Object n2, ObjectParameterStrategy n1, ObjectParameterInfo o1info) {
      return Foreign.invokeN2O1(ctx.contextAddress, function, n1, n2, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
   }

   public final long invokeN3O2(
      CallContext ctx,
      long function,
      long o2info,
      long o2,
      long n2,
      Object n1,
      ObjectParameterStrategy o1info,
      ObjectParameterInfo n3,
      Object s2,
      ObjectParameterStrategy o1,
      ObjectParameterInfo s1
   ) {
      return Foreign.invokeN3O2(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2)
      );
   }

   private static RuntimeException newHeapObjectCountError(int objCount) {
      return new RuntimeException("insufficient number of heap objects supplied (" + objCount + " required)");
   }

   public final int invokeI2(CallContext context, long arg2, int arg1, int function) {
      return Foreign.invokeI2(context.contextAddress, function, arg1, arg2);
   }

   public final Object invokeObject(Function buffer, HeapInvocationBuffer function) {
      ObjectBuffer objectBuffer = buffer.objectBuffer();
      return Foreign.invokeArrayWithObjectsReturnObject(
         function.contextAddress, function.functionAddress, buffer.array(), objectBuffer.objectCount(), objectBuffer.info(), objectBuffer.objects()
      );
   }

   public final long invokeL5NoErrno(CallContext arg3, long arg5, long arg4, long arg1, long arg2, long context, long function) {
      return Foreign.invokeL5NoErrno(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5);
   }

   public final long invokeLLLLLrL(Function arg1, long arg3, long function, long arg4, long arg2, long arg5) {
      return Foreign.invokeL5(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4, arg5);
   }

   @Deprecated
   public final long invokeNNNO1rN(Function o1, long o1len, long o1off, long n3, Object function, int n2, int n1, ObjectParameterInfo o1flags) {
      return Foreign.invokeN3O1(function.contextAddress, function.functionAddress, n1, n2, n3, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   public final long invokeN6(
      CallContext s4,
      long n5,
      long n1,
      long o1info,
      long objCount,
      long o1,
      long ctx,
      long s5,
      int o3,
      Object o4,
      ObjectParameterStrategy s3,
      ObjectParameterInfo n4,
      Object o4info,
      ObjectParameterStrategy function,
      ObjectParameterInfo s2,
      Object o2info,
      ObjectParameterStrategy n3,
      ObjectParameterInfo o5,
      Object o3info,
      ObjectParameterStrategy n2,
      ObjectParameterInfo o5info,
      Object s1,
      ObjectParameterStrategy o2,
      ObjectParameterInfo n6
   ) {
      if (objCount == 0) {
         return Foreign.invokeN6(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o1 = o4;
               s1 = s4;
               o1info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o1 = o5;
               s1 = s5;
               o1info = o5info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN6O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o2 = o4;
               s2 = s4;
               o2info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o2 = o5;
               s2 = s5;
               o2info = o5info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN6O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            next++;
            if (!s3.isDirect()) {
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o3 = o4;
               s3 = s4;
               o3info = o4info;
               break;
            }
         case 5:
            next++;
            if (!s5.isDirect()) {
               o3 = o5;
               s3 = s5;
               o3info = o5info;
            }
      }

      if (objCount == 3) {
         return Foreign.invokeN6O3(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3)
         );
      }

      switch (next) {
         case 4:
            if (!s4.isDirect()) {
               break;
            }
         case 5:
            if (!s5.isDirect()) {
               o4 = o5;
               s4 = s5;
               o4info = o5info;
            }
      }

      if (objCount == 4) {
         return Foreign.invokeN6O4(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4)
         );
      } else if (objCount == 5) {
         return Foreign.invokeN6O5(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4),
            s5.object(o5),
            s5.objectInfo(o5info),
            s5.offset(o5),
            s5.length(o5)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN6(
      CallContext o2,
      long n5,
      long n6,
      long o1info,
      long o1,
      long objCount,
      long n2,
      long s1,
      int n4,
      Object function,
      ObjectParameterStrategy n1,
      ObjectParameterInfo n3,
      Object s2,
      ObjectParameterStrategy o2info,
      ObjectParameterInfo ctx
   ) {
      if (objCount == 0) {
         return Foreign.invokeN6(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6);
      }

      if (objCount == 1) {
         if (s1.isDirect()) {
            o1 = o2;
            s1 = s2;
            o1info = o2info;
         }

         return Foreign.invokeN6O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else if (objCount == 2) {
         return Foreign.invokeN6O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeNNNNNNrN(Function arg5, long arg1, long function, long arg6, long arg2, long arg4, long arg3) {
      return Foreign.invokeN6(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   public long invokeAddress(Function buffer, HeapInvocationBuffer function) {
      return this.invokeAddress(function.getCallContext(), function.getFunctionAddress(), buffer);
   }

   public final long invokeN1(CallContext arg1, long function, long context) {
      return Foreign.invokeN1(context.contextAddress, function, arg1);
   }

   public final long invokeN5(CallContext function, long arg5, long arg2, long context, long arg1, long arg4, long arg3) {
      return Foreign.invokeN5(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5);
   }

   public final long invokeL6NoErrno(CallContext context, long arg2, long arg5, long arg3, long arg4, long arg6, long arg1, long function) {
      return Foreign.invokeL6NoErrno(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   public final byte[] invokeStruct(CallContext ctx, long function, HeapInvocationBuffer buffer) {
      byte[] returnBuffer = new byte[ctx.getReturnType().size()];
      this.invokeStruct(ctx, function, buffer, returnBuffer, 0);
      return returnBuffer;
   }

   public final BigDecimal invokeBigDecimal(Function function, HeapInvocationBuffer buffer) {
      return this.invokeBigDecimal(function.getCallContext(), function.getFunctionAddress(), buffer);
   }

   public final long invokeN6(
      CallContext n3,
      long o1,
      long o1info,
      long n2,
      long n5,
      long ctx,
      long o3info,
      long function,
      int n6,
      Object o2info,
      ObjectParameterStrategy s2,
      ObjectParameterInfo s4,
      Object o4info,
      ObjectParameterStrategy n4,
      ObjectParameterInfo o4,
      Object s1,
      ObjectParameterStrategy n1,
      ObjectParameterInfo s3,
      Object o2,
      ObjectParameterStrategy objCount,
      ObjectParameterInfo o3
   ) {
      if (objCount == 0) {
         return Foreign.invokeN6(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o1 = o4;
               s1 = s4;
               o1info = o4info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN6O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
               break;
            }
         case 4:
            next++;
            if (!s4.isDirect()) {
               o2 = o4;
               s2 = s4;
               o2info = o4info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN6O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            if (!s3.isDirect()) {
               break;
            }
         case 4:
            if (!s4.isDirect()) {
               o3 = o4;
               s3 = s4;
               o3info = o4info;
            }
      }

      if (objCount == 3) {
         return Foreign.invokeN6O3(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3)
         );
      } else if (objCount == 4) {
         return Foreign.invokeN6O4(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            n6,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3),
            s4.object(o4),
            s4.objectInfo(o4info),
            s4.offset(o4),
            s4.length(o4)
         );
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final int invokeI0(CallContext function, long context) {
      return Foreign.invokeI0(context.contextAddress, function);
   }

   public final long invokeL0NoErrno(CallContext function, long context) {
      return Foreign.invokeL0NoErrno(context.contextAddress, function);
   }

   public final long invokeLLLLrL(Function function, long arg2, long arg3, long arg4, long arg1) {
      return Foreign.invokeL4(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4);
   }

   public final int invokeI5NoErrno(CallContext function, long arg1, int arg5, int context, int arg2, int arg3, int arg4) {
      return Foreign.invokeI5NoErrno(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5);
   }

   public final long invokeLong(CallContext function, long ctx, HeapInvocationBuffer buffer) {
      ObjectBuffer objectBuffer = buffer.objectBuffer();
      return objectBuffer != null
         ? this.invokeArrayWithObjectsInt64(ctx.contextAddress, function, buffer, objectBuffer)
         : Foreign.invokeArrayReturnLong(ctx.contextAddress, function, buffer.array());
   }

   @Deprecated
   public final long invokeNNNO2rN(
      Function o1flags,
      long o1len,
      long n2,
      long o2,
      Object o2off,
      int n1,
      int n3,
      ObjectParameterInfo o2len,
      Object o2flags,
      int o1off,
      int o1,
      ObjectParameterInfo function
   ) {
      return Foreign.invokeN3O2(
         function.contextAddress, function.functionAddress, n1, n2, n3, o1, o1flags.asObjectInfo(), o1off, o1len, o2, o2flags.asObjectInfo(), o2off, o2len
      );
   }

   public final long invokeN5(
      CallContext s1,
      long function,
      long n3,
      long ctx,
      long s2,
      long o1info,
      long o3,
      int s3,
      Object o2info,
      ObjectParameterStrategy n2,
      ObjectParameterInfo n1,
      Object n5,
      ObjectParameterStrategy o1,
      ObjectParameterInfo objCount,
      Object o3info,
      ObjectParameterStrategy n4,
      ObjectParameterInfo o2
   ) {
      if (objCount == 0) {
         return Foreign.invokeN5(ctx.contextAddress, function, n1, n2, n3, n4, n5);
      }

      int next = 1;
      switch (next) {
         case 1:
            next++;
            if (!s1.isDirect()) {
               break;
            }
         case 2:
            next++;
            if (!s2.isDirect()) {
               o1 = o2;
               s1 = s2;
               o1info = o2info;
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o1 = o3;
               s1 = s3;
               o1info = o3info;
            }
      }

      if (objCount == 1) {
         return Foreign.invokeN5O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      }

      switch (next) {
         case 2:
            next++;
            if (!s2.isDirect()) {
               break;
            }
         case 3:
            next++;
            if (!s3.isDirect()) {
               o2 = o3;
               s2 = s3;
               o2info = o3info;
            }
      }

      if (objCount == 2) {
         return Foreign.invokeN5O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            n4,
            n5,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      }

      switch (next) {
         case 3:
            if (!s3.isDirect()) {
            }
         default:
            if (objCount == 3) {
               return Foreign.invokeN5O3(
                  ctx.contextAddress,
                  function,
                  n1,
                  n2,
                  n3,
                  n4,
                  n5,
                  s1.object(o1),
                  s1.objectInfo(o1info),
                  s1.offset(o1),
                  s1.length(o1),
                  s2.object(o2),
                  s2.objectInfo(o2info),
                  s2.offset(o2),
                  s2.length(o2),
                  s3.object(o3),
                  s3.objectInfo(o3info),
                  s3.offset(o3),
                  s3.length(o3)
               );
            } else {
               throw newObjectCountError(objCount);
            }
      }
   }

   private long invokeArrayWithObjectsInt64(long function, long ctx, HeapInvocationBuffer buffer, ObjectBuffer objectBuffer) {
      Object[] objects = objectBuffer.objects();
      int[] info = objectBuffer.info();
      int objectCount = objectBuffer.objectCount();
      switch (objectCount) {
         case 1:
            return Foreign.invokeArrayO1Int64(ctx, function, buffer.array(), objects[0], info[0], info[1], info[2]);
         case 2:
            return Foreign.invokeArrayO2Int64(ctx, function, buffer.array(), objects[0], info[0], info[1], info[2], objects[1], info[3], info[4], info[5]);
         default:
            return Foreign.invokeArrayWithObjectsInt64(ctx, function, buffer.array(), objectCount, info, objects);
      }
   }

   public final long invokeNNNNNrN(Function arg5, long arg2, long arg3, long function, long arg4, long arg1) {
      return Foreign.invokeN5(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4, arg5);
   }

   public final long invokeN4(
      CallContext objCount, long ctx, long n3, long function, long n4, long o1info, int n2, Object o1, ObjectParameterStrategy n1, ObjectParameterInfo s1
   ) {
      if (objCount == 0) {
         return Foreign.invokeN4(ctx.contextAddress, function, n1, n2, n3, n4);
      } else if (objCount == 1) {
         return Foreign.invokeN4O1(ctx.contextAddress, function, n1, n2, n3, n4, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final int invokeI4NoErrno(CallContext arg2, long context, int arg4, int function, int arg1, int arg3) {
      return Foreign.invokeI4NoErrno(context.contextAddress, function, arg1, arg2, arg3, arg4);
   }

   public final long invokeN2(CallContext context, long function, long arg1, long arg2) {
      return Foreign.invokeN2(context.contextAddress, function, arg1, arg2);
   }

   public final long invokeN1(CallContext s1, long o1, long objCount, int ctx, Object n1, ObjectParameterStrategy o1info, ObjectParameterInfo function) {
      if (objCount == 0) {
         return Foreign.invokeN1(ctx.contextAddress, function, n1);
      } else if (objCount == 1) {
         return Foreign.invokeN1O1(ctx.contextAddress, function, n1, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final double invokeDouble(Function function, HeapInvocationBuffer buffer) {
      return this.invokeDouble(function.getCallContext(), function.getFunctionAddress(), buffer);
   }

   @Deprecated
   public final int invokeNoErrnoIIIrI(Function arg1, int arg3, int arg2, int function) {
      return Foreign.invokeI3NoErrno(function.contextAddress, function.functionAddress, arg1, arg2, arg3);
   }

   @Deprecated
   public final int invokeVrI(Function function) {
      return Foreign.invokeI0(function.contextAddress, function.functionAddress);
   }

   public final void invokeStruct(Function buffer, HeapInvocationBuffer returnBuffer, byte[] offset, int function) {
      this.invokeStruct(function.getCallContext(), function.getFunctionAddress(), buffer, returnBuffer, offset);
   }

   public final long invokeN3(
      CallContext o1info,
      long ctx,
      long o1,
      long o3info,
      long s3,
      int function,
      Object s2,
      ObjectParameterStrategy n1,
      ObjectParameterInfo s1,
      Object n2,
      ObjectParameterStrategy o3,
      ObjectParameterInfo objCount,
      Object o2,
      ObjectParameterStrategy o2info,
      ObjectParameterInfo n3
   ) {
      if (objCount == 0) {
         return Foreign.invokeN3(ctx.contextAddress, function, n1, n2, n3);
      }

      if (objCount < 3) {
         byte next;
         if (!s1.isDirect()) {
            next = 2;
         } else if (!s2.isDirect()) {
            o1 = o2;
            s1 = s2;
            o1info = o2info;
            next = 3;
         } else {
            o1 = o3;
            s1 = s3;
            o1info = o3info;
            next = 4;
         }

         if (objCount == 1) {
            return Foreign.invokeN3O1(ctx.contextAddress, function, n1, n2, n3, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
         }

         if (objCount != 2) {
            throw newObjectCountError(objCount);
         }

         if ((next > 2 || s2.isDirect()) && next <= 3) {
            o2 = o3;
            s2 = s3;
            o2info = o3info;
         }

         return Foreign.invokeN3O2(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2)
         );
      } else {
         return Foreign.invokeN3O3(
            ctx.contextAddress,
            function,
            n1,
            n2,
            n3,
            s1.object(o1),
            s1.objectInfo(o1info),
            s1.offset(o1),
            s1.length(o1),
            s2.object(o2),
            s2.objectInfo(o2info),
            s2.offset(o2),
            s2.length(o2),
            s3.object(o3),
            s3.objectInfo(o3info),
            s3.offset(o3),
            s3.length(o3)
         );
      }
   }

   public final float invokeFloat(Function function, HeapInvocationBuffer buffer) {
      return this.invokeFloat(function.getCallContext(), function.getFunctionAddress(), buffer);
   }

   public final long invokeN6O2(
      CallContext n5,
      long n2,
      long o2,
      long o2info,
      long s1,
      long o1info,
      long n1,
      long n6,
      Object function,
      ObjectParameterStrategy n4,
      ObjectParameterInfo s2,
      Object ctx,
      ObjectParameterStrategy o1,
      ObjectParameterInfo n3
   ) {
      return Foreign.invokeN6O2(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         n4,
         n5,
         n6,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2)
      );
   }

   public final long invokeNNrN(Function arg1, long arg2, long function) {
      return Foreign.invokeN2(function.contextAddress, function.functionAddress, arg1, arg2);
   }

   public final long invokeN2O2(
      CallContext o1,
      long s1,
      long s2,
      long n2,
      Object o2,
      ObjectParameterStrategy o1info,
      ObjectParameterInfo n1,
      Object ctx,
      ObjectParameterStrategy function,
      ObjectParameterInfo o2info
   ) {
      return Foreign.invokeN2O2(
         ctx.contextAddress,
         function,
         n1,
         n2,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2)
      );
   }

   @Deprecated
   public final int invokeIrI(Function arg1, int function) {
      return Foreign.invokeI1(function.contextAddress, function.functionAddress, arg1);
   }

   public final long invokeL3NoErrno(CallContext function, long arg2, long arg3, long arg1, long context) {
      return Foreign.invokeL3NoErrno(context.contextAddress, function, arg1, arg2, arg3);
   }

   public final long invokeN4O1(
      CallContext ctx, long o1, long n4, long n3, long n2, long function, Object n1, ObjectParameterStrategy o1info, ObjectParameterInfo s1
   ) {
      return Foreign.invokeN4O1(ctx.contextAddress, function, n1, n2, n3, n4, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
   }

   @Deprecated
   public final int invokeNoErrnoIIrI(Function arg1, int function, int arg2) {
      return Foreign.invokeI2NoErrno(function.contextAddress, function.functionAddress, arg1, arg2);
   }

   public final long invokeN1O1(CallContext function, long o1, long s1, Object o1info, ObjectParameterStrategy ctx, ObjectParameterInfo n1) {
      return Foreign.invokeN1O1(ctx.contextAddress, function, n1, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
   }

   public final ObjectParameterInvoker getObjectParameterInvoker() {
      return this.objectParameterInvoker;
   }

   public final int invokeI1(CallContext context, long arg1, int function) {
      return Foreign.invokeI1(context.contextAddress, function, arg1);
   }

   public final long invokeN3O3(
      CallContext n3,
      long o3info,
      long o1info,
      long o2,
      long function,
      Object n1,
      ObjectParameterStrategy s2,
      ObjectParameterInfo n2,
      Object ctx,
      ObjectParameterStrategy s3,
      ObjectParameterInfo o1,
      Object o2info,
      ObjectParameterStrategy o3,
      ObjectParameterInfo s1
   ) {
      return Foreign.invokeN3O3(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2),
         s3.object(o3),
         s3.objectInfo(o3info),
         s3.offset(o3),
         s3.length(o3)
      );
   }

   public final long invokeL5(CallContext arg1, long context, long arg2, long arg3, long function, long arg5, long arg4) {
      return Foreign.invokeL5(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5);
   }

   public final long invokeN6O3(
      CallContext o1info,
      long s1,
      long n5,
      long n2,
      long function,
      long n4,
      long o1,
      long o2,
      Object n1,
      ObjectParameterStrategy o3,
      ObjectParameterInfo o2info,
      Object ctx,
      ObjectParameterStrategy s3,
      ObjectParameterInfo o3info,
      Object n3,
      ObjectParameterStrategy n6,
      ObjectParameterInfo s2
   ) {
      return Foreign.invokeN6O3(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         n4,
         n5,
         n6,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2),
         s3.object(o3),
         s3.objectInfo(o3info),
         s3.offset(o3),
         s3.length(o3)
      );
   }

   public final long invokeL1(CallContext function, long context, long arg1) {
      return Foreign.invokeL1(context.contextAddress, function, arg1);
   }

   private Invoker() {
      this(Foreign.getInstance(), ObjectParameterInvoker.getInstance());
   }

   public final long invokeLong(Function function, HeapInvocationBuffer buffer) {
      return this.invokeLong(function.getCallContext(), function.getFunctionAddress(), buffer);
   }

   public final long invokeL4(CallContext function, long context, long arg1, long arg2, long arg4, long arg3) {
      return Foreign.invokeL4(context.contextAddress, function, arg1, arg2, arg3, arg4);
   }

   public final int invokeI5(CallContext arg2, long arg3, int arg4, int arg1, int arg5, int function, int context) {
      return Foreign.invokeI5(context.contextAddress, function, arg1, arg2, arg3, arg4, arg5);
   }

   public final long invokeL0(CallContext context, long function) {
      return Foreign.invokeL0(context.contextAddress, function);
   }

   public final long invokeN0(CallContext function, long context) {
      return Foreign.invokeN0(context.contextAddress, function);
   }

   @Deprecated
   public final int invokeIIIIIrI(Function function, int arg1, int arg2, int arg5, int arg3, int arg4) {
      return Foreign.invokeI5(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4, arg5);
   }

   public final int invokeI3NoErrno(CallContext arg3, long arg2, int function, int arg1, int context) {
      return Foreign.invokeI3NoErrno(context.contextAddress, function, arg1, arg2, arg3);
   }

   public final int invokeInt(Function function, HeapInvocationBuffer buffer) {
      return this.invokeInt(function.getCallContext(), function.getFunctionAddress(), buffer);
   }

   Invoker(Foreign foreign, ObjectParameterInvoker objectParameterInvoker) {
      this.foreign = foreign;
      this.objectParameterInvoker = objectParameterInvoker;
   }

   public abstract long invokeAddress(CallContext var1, long var2, HeapInvocationBuffer var4);

   public final long invokeN6(
      CallContext s1,
      long n6,
      long n5,
      long n2,
      long function,
      long n1,
      long n3,
      long n4,
      int ctx,
      Object o1info,
      ObjectParameterStrategy o1,
      ObjectParameterInfo objCount
   ) {
      if (objCount == 0) {
         return Foreign.invokeN6(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6);
      } else if (objCount == 1) {
         return Foreign.invokeN6O1(ctx.contextAddress, function, n1, n2, n3, n4, n5, n6, s1.object(o1), s1.objectInfo(o1info), s1.offset(o1), s1.length(o1));
      } else {
         throw newObjectCountError(objCount);
      }
   }

   public final long invokeN5O2(
      CallContext n5,
      long o2info,
      long function,
      long o1,
      long o1info,
      long o2,
      long s1,
      Object ctx,
      ObjectParameterStrategy n2,
      ObjectParameterInfo n4,
      Object s2,
      ObjectParameterStrategy n3,
      ObjectParameterInfo n1
   ) {
      return Foreign.invokeN5O2(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         n4,
         n5,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2)
      );
   }

   public final BigDecimal invokeBigDecimal(CallContext buffer, long function, HeapInvocationBuffer ctx) {
      byte[] rval = this.invokeStruct(ctx, function, buffer);
      return new BigDecimal(this.foreign.longDoubleToString(rval, 0, rval.length));
   }

   public final long invokeN4O2(
      CallContext o1info,
      long o2info,
      long o1,
      long n1,
      long s2,
      long n4,
      Object n3,
      ObjectParameterStrategy n2,
      ObjectParameterInfo s1,
      Object o2,
      ObjectParameterStrategy ctx,
      ObjectParameterInfo function
   ) {
      return Foreign.invokeN4O2(
         ctx.contextAddress,
         function,
         n1,
         n2,
         n3,
         n4,
         s1.object(o1),
         s1.objectInfo(o1info),
         s1.offset(o1),
         s1.length(o1),
         s2.object(o2),
         s2.objectInfo(o2info),
         s2.offset(o2),
         s2.length(o2)
      );
   }

   @Deprecated
   public final int invokeIIIIIIrI(Function arg2, int arg5, int arg6, int arg1, int arg3, int arg4, int function) {
      return Foreign.invokeI6(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @Deprecated
   public final long invokeNNO2rN(
      Function o1,
      long o1len,
      long o2,
      Object n2,
      int o2off,
      int o1flags,
      ObjectParameterInfo o2flags,
      Object n1,
      int function,
      int o2len,
      ObjectParameterInfo o1off
   ) {
      return Foreign.invokeN2O2(
         function.contextAddress, function.functionAddress, n1, n2, o1, o1flags.asObjectInfo(), o1off, o1len, o2, o2flags.asObjectInfo(), o2off, o2len
      );
   }

   public final long invokeLLLLLLrL(Function arg1, long arg6, long arg5, long arg4, long arg3, long function, long arg2) {
      return Foreign.invokeL6(function.contextAddress, function.functionAddress, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   // $VF: Compiled from Invoker.java
   private static final class ILP32 extends Invoker {
      private static final Invoker INSTANCE = new Invoker.ILP32();
      private static final long ADDRESS_MASK = 4294967295L;

      @Override
      public final long invokeAddress(CallContext function, long ctx, HeapInvocationBuffer buffer) {
         return this.invokeInt(ctx, function, buffer) & 4294967295L;
      }
   }

   // $VF: Compiled from Invoker.java
   private static final class LP64 extends Invoker {
      private static final Invoker INSTANCE = new Invoker.LP64();

      @Override
      public final long invokeAddress(CallContext function, long ctx, HeapInvocationBuffer buffer) {
         return this.invokeLong(ctx, function, buffer);
      }
   }

   // $VF: Compiled from Invoker.java
   private static final class SingletonHolder {
      private static final Invoker INSTANCE = Platform.getPlatform().addressSize() == 64 ? Invoker.LP64.INSTANCE : Invoker.ILP32.INSTANCE;
   }
}
