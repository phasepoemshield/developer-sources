package zenith;

import java.util.Map.Entry;

class permessagedeflate extends ZenithInternal044 {
   private static final String SecretKeySpecHolder = "server_no_context_takeover";
   private static final String StringHolder_24 = "client_no_context_takeover";
   private static final String GetSettingsHandler = "server_max_window_bits";
   private static final String StringHolder_17 = "client_max_window_bits";
   private static final byte[] StringHolder_15 = new byte[]{0, 0, -1, -1};
   private static final int StringHolder_22 = 8;
   private static final int ZenithInternal087 = 15;
   private static final int ZenithInternal100 = 256;
   private static final int ZenithInternal024 = 32768;
   private static final int IsPriorityHandler = 1024;
   private boolean FileHolder_2;
   private boolean EventImpl_33;
   private int EventImpl_6 = 32768;
   private int ZenithInternal139 = 32768;
   private int EventImpl_7;
   private ByteBufferHolder_2 ZenithInternal031;

   public permessagedeflate() {
      super("permessage-deflate");
   }

   public permessagedeflate(String s) {
      super(s);
   }

   @Override
   void permessagedeflate() throws ZenithException {
      for (Entry entry : this.Vec3dHolder_2().entrySet()) {
         this.EventTarget((String)entry.getKey(), (String)entry.getValue());
      }

      this.EventImpl_7 = this.EventImpl_6 + 1024;
   }

   public boolean isServerNoContextTakeover() {
      return this.FileHolder_2;
   }

   public boolean isClientNoContextTakeover() {
      return this.EventImpl_33;
   }

   public int StringHolder() {
      return this.EventImpl_6;
   }

   public int StringHolder_11() {
      return this.ZenithInternal139;
   }

   private void EventTarget(String s, String s1) throws ZenithException {
      if ("server_no_context_takeover".equals(s)) {
         this.FileHolder_2 = true;
      } else if ("client_no_context_takeover".equals(s)) {
         this.EventImpl_33 = true;
      } else if ("server_max_window_bits".equals(s)) {
         this.EventImpl_6 = this.ZenithInternal095(s, s1);
      } else {
         if (!"client_max_window_bits".equals(s)) {
            throw new ZenithException(ZenithInternal148.Clickaction, "permessage-deflate extension contains an unsupported parameter: " + s);
         }

         this.ZenithInternal139 = this.ZenithInternal095(s, s1);
      }
   }

   private int ZenithInternal095(String s, String s1) throws ZenithException {
      int i = this.Event(s, s1);
      short short1 = 256;

      for (int j = 8; j < i; j++) {
         short1 *= 2;
      }

      return short1;
   }

   private int Event(String s, String s1) throws ZenithException {
      int i = this.ZenithInternal042(s1);
      if (i < 0) {
         String s2 = String.format("The value of %s parameter of permessage-deflate extension is invalid: %s", s, s1);
         throw new ZenithException(ZenithInternal148.Containerhelper, s2);
      } else {
         return i;
      }
   }

   private int ZenithInternal042(String s) {
      if (s == null) {
         return -1;
      } else {
         int i;
         try {
            i = Integer.parseInt(s);
         } catch (NumberFormatException numberformatexception) {
            return -1;
         }

         return i >= 8 && 15 >= i ? i : -1;
      }
   }

   @Override
   protected byte[] ZenithInternal028(byte[] abyte) throws ZenithException {
      int i = abyte.length + StringHolder_15.length;
      ByteBufferHolder_2 liiili1iii1 = new ByteBufferHolder_2(i);
      liiili1iii1.EventBus(abyte);
      liiili1iii1.EventBus(StringHolder_15);
      if (this.ZenithInternal031 == null) {
         this.ZenithInternal031 = new ByteBufferHolder_2(this.EventImpl_7);
      }

      int j = this.ZenithInternal031.EventImpl_13();

      try {
         ZenithInternal101.StringHolder_8(liiili1iii1, this.ZenithInternal031);
      } catch (Exception exception) {
         throw new ZenithException(
            ZenithInternal148.Elytrahelper, String.format("Failed to decompress the message: %s", exception.getMessage()), exception
         );
      }

      byte[] abyte1 = this.ZenithInternal031.ZenithInternal095(j);
      this.ZenithInternal031.Event(this.EventImpl_7);
      if (this.FileHolder_2) {
         this.ZenithInternal031.clear();
      }

      return abyte1;
   }

   @Override
   protected byte[] EventTarget(byte[] abyte) throws ZenithException {
      if (!this.EventImpl_21(abyte)) {
         return abyte;
      } else {
         try {
            byte[] abyte1 = ZenithInternal042.EventTarget(abyte);
            return EventImpl_13(abyte1);
         } catch (Exception exception) {
            throw new ZenithException(
               ZenithInternal148.Debug, String.format("Failed to compress the message: %s", exception.getMessage()), exception
            );
         }
      }
   }

   private boolean EventImpl_21(byte[] abyte) {
      return this.ZenithInternal139 == 32768 ? true : abyte.length < this.ZenithInternal139;
   }

   private static byte[] EventImpl_13(byte[] abyte) throws ZenithException_2 {
      ByteBufferHolder_2 liiili1iii1 = new ByteBufferHolder_2(abyte.length + 1);
      liiili1iii1.EventBus(abyte);
      int[] aint = new int[1];
      boolean[] aboolean = new boolean[1];

      while (StringHolder_8(liiili1iii1, aint, aboolean)) {
      }

      if (aboolean[0]) {
         return liiili1iii1.StringHolder_8(0, (aint[0] - 1) / 8 + 1 - 4);
      } else {
         EventBus(liiili1iii1, aint);
         return liiili1iii1.StringHolder_8(0, (aint[0] - 1) / 8 + 1);
      }
   }

   private static void EventBus(ByteBufferHolder_2 liiili1iii1, int[] aint) {
      int i = aint[0] % 8;
      switch (i) {
         case 0:
         case 6:
         case 7:
            liiili1iii1.EventTarget(0);
         default:
            aint[0] += 3;
      }
   }

   private static boolean StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint, boolean[] aboolean) throws ZenithException_2 {
      boolean flag = liiili1iii1.StringHolder_8(aint);
      if (flag) {
         liiili1iii1.ZenithInternal028(aint[0] - 1);
      }

      int i = liiili1iii1.StringHolder_8(aint, 2);
      boolean flag1 = false;
      switch (i) {
         case 0:
            flag1 = EventTarget(liiili1iii1, aint) == 0;
            break;
         case 1:
            ZenithInternal095(liiili1iii1, aint);
            break;
         case 2:
            Event(liiili1iii1, aint);
            break;
         default:
            String s = String.format("[%s] Bad compression type '11' at the bit index '%d'.", permessagedeflate.class.getSimpleName(), aint[0]);
            throw new ZenithException_2(s);
      }

      if (liiili1iii1.EventImpl_13() <= aint[0] / 8) {
         flag = true;
      }

      if (flag && flag1) {
         aboolean[0] = true;
      }

      return !flag;
   }

   private static int EventTarget(ByteBufferHolder_2 liiili1iii1, int[] aint) {
      int i = aint[0] + 7 & -8;
      int j = i / 8;
      int k = (liiili1iii1.StringHolder_8(j) & 255) + (liiili1iii1.StringHolder_8(j + 1) & 255) * 256;
      j += 4;
      aint[0] = (j + k) * 8;
      return k;
   }

   private static void ZenithInternal095(ByteBufferHolder_2 liiili1iii1, int[] aint) throws ZenithException_2 {
      StringHolder_8(liiili1iii1, aint, ZenithInternal021.ZenithInternal064(), ZenithInternal064.FinishThread());
   }

   private static void Event(ByteBufferHolder_2 liiili1iii1, int[] aint) throws ZenithException_2 {
      ZenithInternal070[] al111llliilll1iii1ii = new ZenithInternal070[2];
      ZenithInternal084.StringHolder_8(liiili1iii1, aint, al111llliilll1iii1ii);
      StringHolder_8(liiili1iii1, aint, al111llliilll1iii1ii[0], al111llliilll1iii1ii[1]);
   }

   private static void StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint, ZenithInternal070 l111llliilll1iii1ii, ZenithInternal070 l111llliilll1iii1ii) throws ZenithException_2 {
      while (true) {
         int i = l111llliilll1iii1iix.StringHolder_8(liiili1iii1, aint);
         if (i == 256) {
            return;
         }

         if (0 > i || i > 255) {
            ZenithInternal084.StringHolder_8(liiili1iii1, aint, i);
            ZenithInternal084.StringHolder_8(liiili1iii1, aint, l111llliilll1iii1ii);
         }
      }
   }
}
