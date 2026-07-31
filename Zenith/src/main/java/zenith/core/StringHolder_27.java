package zenith;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringHolder_27 {
   private static final int ListHolder_4 = 2;
   public static final String BufferBuilderHolder = "mincraftsodiumrender";
   private final TypeHolder BufferBuilderHolder_2;
   private final ExecutorService ZenithInternal035 = Executors.newSingleThreadExecutor();
   private final List<StringHolder_17> floatHolder_8 = new CopyOnWriteArrayList<>();
   private final SecretKeySpecHolder ListHolder;
   private DatagramSocket GlUniformHolder;
   private Thread StringHolder_28;
   private volatile boolean MinecraftClientHolder_3;
   private volatile String ListHolder_2;
   private InetAddress GsonHolder;
   private int ZenithInternal152;
   private final String ZenithInternal092;
   private final int ll11lIllIlI1IlI1I111111IlIlIll;
   private final String I1lllI1I1IIl1l1;
   private final String role;
   private long lIIIl1IllIlIIll1II = 0L;
   private long IlIl1llIlI11IllI11IIIII11l111I = 0L;
   private long IlIll11I1lll1II1llI1I1II = 0L;
   private int Il1Il1llIIl1lIlII11l11ll = 0;
   private long ll1ll1l11l1lllIIIIl1 = 0L;

   public StringHolder_27(TypeHolder ll1i11iili1i1i11lilil11i11ill1, String s, String s1, String s2, String s3, String s4) {
      this.BufferBuilderHolder_2 = ll1i11iili1i1i11lilil11i11ill1;
      this.ZenithInternal092 = s;
      String s5 = s2 == null ? "" : s2.trim();
      this.ll11lIllIlI1IlI1I111111IlIlIll = this.StringHolder_30(s5);
      this.I1lllI1I1IIl1l1 = s3 != null && !s3.isBlank() ? s3.trim() : "UID " + s5;
      this.role = s4 != null && !s4.isBlank() ? s4.trim().toUpperCase(Locale.ROOT) : "USER";
      String s6 = s1 != null && !s1.isBlank() ? s1.trim() : "mincraftsodiumrender";
      this.ListHolder = new SecretKeySpecHolder(s6);
      EventBus.StringHolder_8(this);
      this.StringHolder_8(null);
   }

   @EventTarget
   public void StringHolder_8(EventImpl_22 l11llilil1) {
      if (!this.isConnected()) {
         long k = System.currentTimeMillis();
         if (k - this.lIIIl1IllIlIIll1II >= 5000L) {
            this.lIIIl1IllIlIIll1II = k;
            this.ZenithInternal035.execute(() -> {
               try {
                  this.Setting();
               } catch (Exception exception) {
                  exception.printStackTrace();
               }
            });
         }
      } else {
         long i = System.currentTimeMillis();
         if (this.ListHolder_2 != null && !this.ListHolder_2.isBlank()) {
            if (i - this.IlIl1llIlI11IllI11IIIII11l111I >= 100L) {
               this.IlIl1llIlI11IllI11IIIII11l111I = i;
               StringHolder_22 l1liil1ili1iiii1lliii1l1li = StringHolder_22.Nointeract();
               if (l1liil1ili1iiii1lliii1l1li != null) {
                  this.StringHolder_8(l1liil1ili1iiii1lliii1l1li);
               }
            }

            if (i - this.IlIll11I1lll1II1llI1I1II >= 1000L) {
               StringHolder_15 illiilillliiiil1liil = StringHolder_15.Bowaimbot();
               if (illiilillliiiil1liil != null) {
                  int j = illiilillliiiil1liil.Cheststealer();
                  if (j != this.Il1Il1llIIl1lIlII11l11ll || i - this.IlIll11I1lll1II1llI1I1II >= 5000L) {
                     this.Il1Il1llIIl1lIlII11l11ll = j;
                     this.IlIll11I1lll1II1llI1I1II = i;
                     this.StringHolder_8(illiilillliiiil1liil);
                  }
               }
            }
         } else {
            if (i - this.ll1ll1l11l1lllIIIIl1 >= 60000L) {
               this.ModeSetting();
            }
         }
      }
   }

   private void Setting() throws Exception {
      this.BindSetting();
      this.ZenithInternal123(this.ZenithInternal092);
      this.GlUniformHolder = new DatagramSocket();
      this.GlUniformHolder.setSoTimeout(2000);
      this.MinecraftClientHolder_3 = true;
      this.ListHolder_2 = null;
      this.ll1ll1l11l1lllIIIIl1 = 0L;
      this.StringHolder_28 = new Thread(this::ListSetting, "cloud-udp-client");
      this.StringHolder_28.setDaemon(true);
      this.StringHolder_28.start();
      this.ModeSetting();
   }

   private void ZenithInternal123(String s) throws Exception {
      if (s != null && !s.isBlank()) {
         String s1 = s.trim();
         if (!s1.startsWith("udp://") && !s1.startsWith("ws://") && !s1.startsWith("wss://")) {
            int j = s1.lastIndexOf(58);
            if (j > 0 && j != s1.length() - 1) {
               String s3 = s1.substring(0, j).trim();
               int k = Integer.parseInt(s1.substring(j + 1).trim());
               this.GsonHolder = InetAddress.getByName(s3);
               this.ZenithInternal152 = k;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            URI uri = new URI(s1);
            String s2 = uri.getHost();
            int i = uri.getPort();
            if (s2 != null && !s2.isBlank()) {
               this.GsonHolder = InetAddress.getByName(s2);
               this.ZenithInternal152 = i;
            } else {
               throw new IllegalArgumentException("");
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   private synchronized void StringHolder_8(JsonObject jsonobject) {
      if (this.isConnected()) {
         try {
            String s = this.ListHolder.ZenithInternal149(jsonobject.toString());
            byte[] abyte = s.getBytes(StandardCharsets.UTF_8);
            DatagramPacket datagrampacket = new DatagramPacket(abyte, abyte.length, this.GsonHolder, this.ZenithInternal152);
            this.GlUniformHolder.send(datagrampacket);
         } catch (Exception exception) {
            exception.printStackTrace();
            this.BindSetting();
         }
      }
   }

   protected void ZenithInternal121(String s) {
      try {
         JsonObject jsonobject = JsonParser.parseString(s).getAsJsonObject();
         ZenithInternal100 li1ii1ll1iili1l1lil1 = ZenithInternal100.ZenithInternal039(this.StringHolder_8(jsonobject, "type")).orElse(null);
         if (li1ii1ll1iili1l1lil1 == null) {
            return;
         }

         switch (li1ii1ll1iili1l1lil1) {
            case ll1I1l1ll111111lllI1lI:
               this.EventBus(jsonobject);
               break;
            case lIIlII1IlII1IIl:
               this.EventTarget(jsonobject);
               break;
            case I1III1llIIlII11:
               this.ZenithInternal095(jsonobject);
               break;
            case I1IIl1l1I:
               this.Event(jsonobject);
               break;
            case I11IlIIlI11l111lIIlIl1lIl:
               this.EventImpl_24(jsonobject);
               break;
            case lIlIlI1l11lI1ll1lIll1I:
               this.ZenithInternal028(jsonobject);
               break;
            case Il11l1Il11:
            case lllI1l1111l1IlIIl1I1lI:
               this.EventImpl_21(jsonobject);
               break;
            case lIllIl11I1l1IlIllI1l1l11Il:
               this.EventImpl_13(jsonobject);
               break;
            case l11I1lIll1III:
               this.byteHolder_2(jsonobject);
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private void EventBus(JsonObject jsonobject) {
      String s = this.EventBus(jsonobject, "ERROR");
      if ("OK".equalsIgnoreCase(s)) {
         String s1 = this.StringHolder_8(jsonobject, "token");
         if (!s1.isEmpty()) {
            this.ListHolder_2 = s1;
            this.ll1ll1l11l1lllIIIIl1 = 0L;
            this.BooleanSetting();
         }
      }
   }

   private void EventTarget(JsonObject jsonobject) {
      String s = this.StringHolder_8(jsonobject, "fromUid");
      String s1 = this.StringHolder_8(jsonobject, "fromRole");
      String s2 = this.StringHolder_8(jsonobject, "message");
      String s3 = this.StringHolder_8(jsonobject, "fromName");
      if (s3.isEmpty()) {
         s3 = s.isEmpty() ? "Unknown" : "UID " + s;
      }

      StringHolder_22 l1liil1ili1iiii1lliii1l1li = StringHolder_22.StringHolder_27(s2);
      if (l1liil1ili1iiii1lliii1l1li != null) {
         GetSettingsHandler i11ll1111lil11i1 = this.BufferBuilderHolder_2.ZenithInternal100(s);
         if (i11ll1111lil11i1 != null) {
            i11ll1111lil11i1.Targetpearl();
            i11ll1111lil11i1.EventBus(l1liil1ili1iiii1lliii1l1li);
            this.BufferBuilderHolder_2.StringHolder_8(i11ll1111lil11i1, l1liil1ili1iiii1lliii1l1li);
         }
      } else {
         StringHolder_15 illiilillliiiil1liil = StringHolder_15.RegistryEntryHolder(s2);
         if (illiilillliiiil1liil != null) {
            GetSettingsHandler i11ll1111lil11i = this.BufferBuilderHolder_2.ZenithInternal100(s);
            if (i11ll1111lil11i != null) {
               i11ll1111lil11i.Targetpearl();
               i11ll1111lil11i.EventBus(illiilillliiiil1liil);
            }
         } else if (!s2.isBlank()) {
            this.StringHolder_8(s, s3, s1);
         }
      }
   }

   private void ZenithInternal095(JsonObject jsonobject) {
   }

   private void Event(JsonObject jsonobject) {
      String s = this.EventBus(jsonobject, "UNKNOWN");
      String s1 = this.StringHolder_8(jsonobject, "details");
      String s2 = this.StringHolder_8(jsonobject, "friendId");
      if ("OK".equalsIgnoreCase(s) && !s2.isEmpty()) {
         this.StringHolder_8(s2, "UID " + s2, "");
         if ("MUTUAL_CONFIRMED".equalsIgnoreCase(s1) || "ALREADY_EXISTS".equalsIgnoreCase(s1)) {
            this.ArrayListHolder_2(s2);
         }
      }

      this.BooleanSetting();
   }

   private void EventImpl_24(JsonObject jsonobject) {
      String s = this.EventBus(jsonobject, "UNKNOWN");
      String s1 = this.StringHolder_8(jsonobject, "friendId");
      if ("OK".equalsIgnoreCase(s) && !s1.isEmpty()) {
         this.BufferBuilderHolder_2.ZenithInternal087(s1);
         this.ArrayListHolder_2(s1);
      }

      this.BooleanSetting();
   }

   private void ZenithInternal028(JsonObject jsonobject) {
      String s = this.StringHolder_8(jsonobject, "fromUid");
      if (!s.isEmpty()) {
         this.floatHolder_12(s);
         this.StringHolder_8(s, "UID " + s, "");
         this.ArrayListHolder_2(s);
      }

      this.BooleanSetting();
   }

   private void EventImpl_21(JsonObject jsonobject) {
      String s = this.StringHolder_8(jsonobject, "fromUid");
      if (s.isEmpty()) {
         s = this.StringHolder_8(jsonobject, "friendId");
      }

      if (!s.isEmpty()) {
         String s1 = this.StringHolder_8(jsonobject, "fromRole");
         this.StringHolder_4(s, s1);
      }
   }

   private void EventImpl_13(JsonObject jsonobject) {
      if (jsonobject.has("friends") && jsonobject.get("friends").isJsonArray()) {
         ArrayList arraylist = new ArrayList();
         jsonobject.getAsJsonArray("friends").forEach(jsonelement -> {
            if (jsonelement.isJsonObject()) {
               JsonObject jsonobject1 = jsonelement.getAsJsonObject();
               String s = this.StringHolder_8(jsonobject1, "uid");
               if (!s.isEmpty()) {
                  String s1 = this.StringHolder_8(jsonobject1, "nick");
                  String s2 = this.StringHolder_8(jsonobject1, "role");
                  arraylist.add(new GetSettingsHandler(s, s1.isEmpty() ? "UID " + s : s1, s2));
               }
            }
         });
         this.BufferBuilderHolder_2.StringHolder_4(arraylist);
      }
   }

   private void byteHolder_2(JsonObject jsonobject) {
      String s = this.EventBus(jsonobject, "ERROR");
      String s1 = this.StringHolder_8(jsonobject, "details");
      System.out.println(s + " " + s1);
      this.BindSetting();
   }

   private void StringHolder_8(String s, String s1, String s2) {
      this.BufferBuilderHolder_2.EventBus(s, s1, s2);
   }

   public void BufferedOutputStreamImpl(String s) {
      Integer integer = this.byteHolder(s, "add friend");
      if (integer != null) {
         if (!this.StringHolder_8(integer)) {
            String s1 = this.MultiBooleanSetting();
            if (s1 != null) {
               this.StringHolder_8(ZenithInternal039.StringHolder_8(2, s1, integer));
            }
         }
      }
   }

   public void ZenithInternal033(String s) {
      Integer integer = this.byteHolder(s, "remove friend");
      if (integer != null) {
         if (!this.StringHolder_8(integer)) {
            String s1 = this.MultiBooleanSetting();
            if (s1 != null) {
               this.StringHolder_8(ZenithInternal039.StringHolder_8(2, s1, integer, true));
            }
         }
      }
   }

   public void BooleanSetting() {
      String s = this.MultiBooleanSetting();
      if (s != null) {
         this.StringHolder_8(ZenithInternal039.Event(2, s));
      }
   }

   public void ThreadImpl(String s) {
      Integer integer = this.byteHolder(s, "accept friend request");
      if (integer != null && !this.StringHolder_8(integer)) {
         String s1 = this.MultiBooleanSetting();
         if (s1 != null) {
            this.StringHolder_8(ZenithInternal039.StringHolder_8(2, s1, integer));
         }
      }
   }

   public void WritingThread(String s) {
      Integer integer = this.byteHolder(s, "decline friend request");
      if (integer != null && !this.StringHolder_8(integer)) {
         String s1 = this.MultiBooleanSetting();
         if (s1 != null) {
            this.StringHolder_8(ZenithInternal039.StringHolder_8(2, s1, integer, false));
            this.ArrayListHolder_2(String.valueOf(integer));
         }
      }
   }

   public void ZenithClient(String s) {
      if (s != null && !s.isEmpty()) {
         this.StringHolder_8(ZenithInternal024.l11I11lIII1I1, s);
      }
   }

   public void GetStartTimeHandler(String s) {
      if (s != null && !s.isEmpty()) {
         this.StringHolder_8(ZenithInternal024.IlIl1II1ll11, s);
      }
   }

   private void StringHolder_8(StringHolder_22 l1liil1ili1iiii1lliii1l1li) {
      this.StringHolder_8(ZenithInternal024.IlIl1II1ll11, l1liil1ili1iiii1lliii1l1li.Autoweb());
   }

   private void StringHolder_8(StringHolder_15 illiilillliiiil1liil) {
      this.StringHolder_8(ZenithInternal024.IlIl1II1ll11, illiilillliiiil1liil.Autoweb());
   }

   public boolean isConnected() {
      return this.MinecraftClientHolder_3 && this.GlUniformHolder != null && !this.GlUniformHolder.isClosed();
   }

   public List<GetSettingsHandler> ButtonSetting() {
      return this.BufferBuilderHolder_2.ZenithInternal001();
   }

   public List<StringHolder_17> ColorSetting() {
      return List.copyOf(this.floatHolder_8);
   }

   private void ListSetting() {
      byte[] abyte = new byte[8192];

      while (this.MinecraftClientHolder_3 && this.GlUniformHolder != null && !this.GlUniformHolder.isClosed()) {
         DatagramPacket datagrampacket = new DatagramPacket(abyte, abyte.length);

         try {
            this.GlUniformHolder.receive(datagrampacket);
            String s = new String(datagrampacket.getData(), datagrampacket.getOffset(), datagrampacket.getLength(), StandardCharsets.UTF_8);

            String s1;
            try {
               s1 = this.ListHolder.ZenithInternal150(s);
            } catch (Exception exception) {
               System.out.println("sosiska");
               continue;
            }

            this.ZenithInternal035.execute(() -> this.ZenithInternal121(s1));
         } catch (SocketTimeoutException sockettimeoutexception) {
         } catch (Exception exception1) {
            if (this.MinecraftClientHolder_3) {
               this.BindSetting();
            }
         }
      }
   }

   private synchronized void BindSetting() {
      try {
         this.MinecraftClientHolder_3 = false;
         this.ListHolder_2 = null;
         if (this.GlUniformHolder != null && !this.GlUniformHolder.isClosed()) {
            this.GlUniformHolder.close();
         }
      } finally {
         this.GlUniformHolder = null;
         this.StringHolder_28 = null;
      }
   }

   private void StringHolder_8(ZenithInternal024 i1ilii1l1l1lll, String s) {
      String s1 = this.MultiBooleanSetting();
      if (s1 != null) {
         JsonObject jsonobject = switch (i1ilii1l1l1lll) {
            case l11I11lIII1I1 -> ZenithInternal039.StringHolder_8(2, s1, s);
            case IlIl1II1ll11 -> ZenithInternal039.EventBus(2, s1, s);
            case llI1llllIllIlll1l1lI11lIIIl -> null;
         };
         if (jsonobject != null) {
            this.StringHolder_8(jsonobject);
         }
      }
   }

   private void ModeSetting() {
      this.ll1ll1l11l1lllIIIIl1 = System.currentTimeMillis();
      this.StringHolder_8(ZenithInternal039.StringHolder_8(2, this.ll11lIllIlI1IlI1I111111IlIlIll, this.I1lllI1I1IIl1l1, this.role));
   }

   private String MultiBooleanSetting() {
      return this.ListHolder_2 != null && !this.ListHolder_2.isBlank() ? this.ListHolder_2 : null;
   }

   private Integer byteHolder(String s, String s1) {
      if (s != null && !s.isBlank()) {
         try {
            return Integer.parseInt(s.trim());
         } catch (NumberFormatException numberformatexception) {
            numberformatexception.printStackTrace();
            return null;
         }
      } else {
         return null;
      }
   }

   private Integer IReturn(String s) {
      if (s != null && !s.isBlank()) {
         String s1 = s.trim();

         try {
            return Integer.parseInt(s1);
         } catch (Exception exception1) {
            exception1.printStackTrace();

            for (GetSettingsHandler i11ll1111lil11i : this.BufferBuilderHolder_2.ZenithInternal001()) {
               if (i11ll1111lil11i.Autoswap().equalsIgnoreCase(s1) && !i11ll1111lil11i.Autoexplosion().isBlank()) {
                  try {
                     return Integer.parseInt(i11ll1111lil11i.Autoexplosion());
                  } catch (Exception exception) {
                     exception.printStackTrace();
                     break;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private boolean StringHolder_8(Integer integer) {
      return integer == null ? false : integer == this.ll11lIllIlI1IlI1I111111IlIlIll;
   }

   private void StringHolder_4(String s, String s1) {
      if (s != null && !s.isBlank()) {
         for (StringHolder_17 l1111ililiii1ll1i : this.floatHolder_8) {
            if (s.equalsIgnoreCase(l1111ililiii1ll1i.Autoauth())) {
               return;
            }
         }

         this.floatHolder_8.add(new StringHolder_17(s, s1 == null ? "" : s1, System.currentTimeMillis()));
      }
   }

   private void floatHolder_12(String s) {
      if (s == null || s.isBlank()) {
         ;
      }
   }

   private void ArrayListHolder_2(String s) {
      if (s != null && !s.isBlank()) {
         this.floatHolder_8.removeIf(l1111ililiii1ll1i -> s.equalsIgnoreCase(l1111ililiii1ll1i.Autoauth()));
      }
   }

   private String StringHolder_8(JsonObject jsonobject, String s) {
      return jsonobject.has(s) && !jsonobject.get(s).isJsonNull() ? jsonobject.get(s).getAsString() : "";
   }

   private String EventBus(JsonObject jsonobject, String s) {
      String s1 = this.StringHolder_8(jsonobject, "status");
      return s1.isEmpty() ? s : s1;
   }

   private int StringHolder_30(String s) {
      if (s != null && !s.isBlank()) {
         try {
            return Integer.parseInt(s.trim());
         } catch (NumberFormatException numberformatexception) {
            int i = Math.floorMod(s.trim().toLowerCase(Locale.ROOT).hashCode(), 1000000000);
            return i + 1;
         }
      } else {
         return 1;
      }
   }
}
