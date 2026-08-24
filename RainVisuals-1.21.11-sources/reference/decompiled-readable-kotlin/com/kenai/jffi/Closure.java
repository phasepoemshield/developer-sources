package com.kenai.jffi;

// $VF: Compiled from Closure.java
public interface Closure {
   void invoke(Closure.Buffer var1);

   // $VF: Compiled from Closure.java
   interface Buffer {
      void setAddressReturn(long var1);

      long getLong(int var1);

      long getAddress(int var1);

      void setLongReturn(long var1);

      short getShort(int var1);

      int getInt(int var1);

      void setStructReturn(long var1);

      void setIntReturn(int var1);

      byte getByte(int var1);

      void setShortReturn(short var1);

      void setByteReturn(byte var1);

      void setFloatReturn(float var1);

      void setStructReturn(byte[] var1, int var2);

      double getDouble(int var1);

      long getStruct(int var1);

      void setDoubleReturn(double var1);

      float getFloat(int var1);
   }

   // $VF: Compiled from Closure.java
   interface Handle {
      void dispose();

      @Deprecated
      void free();

      void setAutoRelease(boolean var1);

      long getAddress();
   }
}
