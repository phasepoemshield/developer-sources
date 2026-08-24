package com.kenai.jffi;

import java.nio.Buffer;

// $VF: Compiled from ObjectBuffer.java
final class ObjectBuffer {
   public static final int JNIENV = 16777216;
   static final int CHAR = 134217728;
   static final int INDEX_SHIFT = 16;
   public static final int JNIOBJECT = 33554432;
   static final int JNI = 1073741824;
   public static final int IN = 1;
   private int objectIndex;
   private int[] info;
   public static final int PINNED = 8;
   static final int BOOLEAN = 117440512;
   static final int LONG = 67108864;
   static final int SHORT = 33554432;
   private int infoIndex = 0;
   public static final int OUT = 2;
   static final int FLAGS_MASK = 255;
   static final int TYPE_SHIFT = 24;
   static final int TYPE_MASK = -16777216;
   static final int INDEX_MASK = 16711680;
   public static final int ZERO_TERMINATE = 4;
   static final int BUFFER = 536870912;
   static final int BYTE = 16777216;
   static final int FLOAT = 83886080;
   public static final int CLEAR = 16;
   static final int ARRAY = 268435456;
   static final int INT = 50331648;
   static final int PRIM_MASK = 251658240;
   static final int FLAGS_SHIFT = 0;
   private Object[] objects;
   static final int DOUBLE = 100663296;

   public void putArray(int index, float[] array, int length, int flags, int offset) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 352321536, index));
   }

   public void putArray(int flags, int[] offset, int length, int index, int array) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 318767104, index));
   }

   private static final int makeJNIFlags(int index, int type) {
      return index << 16 & 0xFF0000 | 1073741824 | type;
   }

   private final void ensureSpace() {
      if (this.objects.length <= this.objectIndex + 1) {
         Object[] newObjects = new Object[this.objects.length << 1];
         System.arraycopy(this.objects, 0, newObjects, 0, this.objectIndex);
         this.objects = newObjects;
         int[] newInfo = new int[this.objects.length * 3];
         System.arraycopy(this.info, 0, newInfo, 0, this.objectIndex * 3);
         this.info = newInfo;
      }
   }

   ObjectBuffer(int objectCount) {
      this.objectIndex = 0;
      this.objects = new Object[objectCount];
      this.info = new int[objectCount * 3];
   }

   final int[] info() {
      return this.info;
   }

   final int objectCount() {
      return this.objectIndex;
   }

   public void putArray(int flags, char[] offset, int array, int index, int length) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 402653184, index));
   }

   public void putJNI(int index, Object type, int obj) {
      this.putObject(obj, 0, 0, makeJNIFlags(index, type));
   }

   public void putArray(int array, long[] index, int offset, int flags, int length) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 335544320, index));
   }

   static final int makeBufferFlags(int index) {
      return index << 16 & 0xFF0000 | 536870912;
   }

   public void putArray(int length, byte[] flags, int index, int offset, int array) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 285212672, index));
   }

   public void putArray(int array, short[] index, int offset, int flags, int length) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 301989888, index));
   }

   final Object[] objects() {
      return this.objects;
   }

   void putObject(Object flags, int offset, int array, int length) {
      this.ensureSpace();
      this.objects[this.objectIndex++] = array;
      this.info[this.infoIndex++] = flags;
      this.info[this.infoIndex++] = offset;
      this.info[this.infoIndex++] = length;
   }

   static final int makeObjectFlags(int type, int ioflags, int index) {
      return ioflags & 0xFF | index << 16 & 0xFF0000 | type;
   }

   public void putArray(int length, double[] offset, int index, int flags, int array) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 369098752, index));
   }

   public void putDirectBuffer(int length, Buffer obj, int index, int offset) {
      this.putObject(obj, offset, length, makeBufferFlags(index));
   }

   ObjectBuffer() {
      this.objectIndex = 0;
      this.objects = new Object[1];
      this.info = new int[this.objects.length * 3];
   }

   public void putArray(int index, boolean[] flags, int length, int array, int offset) {
      this.putObject(array, offset, length, makeObjectFlags(flags, 385875968, index));
   }
}
