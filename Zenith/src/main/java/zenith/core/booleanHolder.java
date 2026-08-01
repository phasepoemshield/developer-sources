package zenith;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public class booleanHolder {
   private final SocketFactoryHolder_2 ShulkerLook;
   private final booleanHolder_2 Tridentaimbot;
   private int PlayerInputHolder;
   private int EventImpl_10;
   private ZenithInternal061 ZenithInternal078 = ZenithInternal061.permessagedeflate;
   private int booleanHolder_3 = 250;
   private boolean ZenithInternal025 = true;
   private String[] EventImpl_32;

   public booleanHolder() {
      this.ShulkerLook = new SocketFactoryHolder_2();
      this.Tridentaimbot = new booleanHolder_2(this);
   }

   public booleanHolder(booleanHolder i1l11ll1l1l11l1111li11) {
      if (i1l11ll1l1l11l1111li11 == null) {
         throw new IllegalArgumentException("The given WebSocketFactory is null");
      } else {
         this.ShulkerLook = new SocketFactoryHolder_2(i1l11ll1l1l11l1111li11.ShulkerLook);
         this.Tridentaimbot = new booleanHolder_2(this, i1l11ll1l1l11l1111li11.Tridentaimbot);
         this.PlayerInputHolder = i1l11ll1l1l11l1111li11.PlayerInputHolder;
         this.EventImpl_10 = i1l11ll1l1l11l1111li11.EventImpl_10;
         this.ZenithInternal078 = i1l11ll1l1l11l1111li11.ZenithInternal078;
         this.booleanHolder_3 = i1l11ll1l1l11l1111li11.booleanHolder_3;
         this.ZenithInternal025 = i1l11ll1l1l11l1111li11.ZenithInternal025;
         if (i1l11ll1l1l11l1111li11.EventImpl_32 != null) {
            this.EventImpl_32 = new String[i1l11ll1l1l11l1111li11.EventImpl_32.length];
            System.arraycopy(i1l11ll1l1l11l1111li11.EventImpl_32, 0, this.EventImpl_32, 0, this.EventImpl_32.length);
         }
      }
   }

   public SocketFactory ZenithInternal023() {
      return this.ShulkerLook.ZenithInternal023();
   }

   public booleanHolder EventBus(SocketFactory socketfactory) {
      this.ShulkerLook.setSocketFactory(socketfactory);
      return this;
   }

   public SSLSocketFactory ZenithInternal148() {
      return this.ShulkerLook.ZenithInternal148();
   }

   public booleanHolder EventTarget(SSLSocketFactory sslsocketfactory) {
      this.ShulkerLook.EventBus(sslsocketfactory);
      return this;
   }

   public SSLContext ZenithException() {
      return this.ShulkerLook.ZenithException();
   }

   public booleanHolder EventTarget(SSLContext sslcontext) {
      this.ShulkerLook.EventBus(sslcontext);
      return this;
   }

   public booleanHolder_2 PlayerInputHolder() {
      return this.Tridentaimbot;
   }

   public int GetStartTimeHandler() {
      return this.PlayerInputHolder;
   }

   public booleanHolder ZenithInternal042(int i) {
      if (i < 0) {
         throw new IllegalArgumentException("timeout value cannot be negative.");
      } else {
         this.PlayerInputHolder = i;
         return this;
      }
   }

   public int EventImpl_10() {
      return this.EventImpl_10;
   }

   public booleanHolder ZenithInternal101(int i) {
      if (i < 0) {
         throw new IllegalArgumentException("timeout value cannot be negative.");
      } else {
         this.EventImpl_10 = i;
         return this;
      }
   }

   public ZenithInternal061 EventImpl_15() {
      return this.ZenithInternal078;
   }

   public booleanHolder StringHolder_8(ZenithInternal061 ili1ll11li1ili11l1i1l11l1) {
      this.ZenithInternal078 = ili1ll11li1ili11l1i1l11l1;
      return this;
   }

   public int EventImpl_3() {
      return this.booleanHolder_3;
   }

   public booleanHolder ZenithInternal084(int i) {
      if (i < 0) {
         throw new IllegalArgumentException("delay value cannot be negative.");
      } else {
         this.booleanHolder_3 = i;
         return this;
      }
   }

   public boolean EventImpl_30() {
      return this.ZenithInternal025;
   }

   public booleanHolder byteHolder(boolean flag) {
      this.ZenithInternal025 = flag;
      return this;
   }

   public String[] booleanHolder() {
      return this.EventImpl_32;
   }

   public booleanHolder Event(String[] astring) {
      this.EventImpl_32 = astring;
      return this;
   }

   public booleanHolder SocketFactoryHolder(String s) {
      return this.Event(new String[]{s});
   }

   public GetSocketHandler ZenithInternal086(String s) throws IOException {
      return this.StringHolder_8(s, this.GetStartTimeHandler());
   }

   public GetSocketHandler StringHolder_8(String s, int i) throws IOException {
      if (s == null) {
         throw new IllegalArgumentException("The given URI is null.");
      } else if (i < 0) {
         throw new IllegalArgumentException("The given timeout value is negative.");
      } else {
         return this.StringHolder_8(URI.create(s), i);
      }
   }

   public GetSocketHandler EventBus(URL url) throws IOException {
      return this.StringHolder_8(url, this.GetStartTimeHandler());
   }

   public GetSocketHandler StringHolder_8(URL url, int i) throws IOException {
      if (url == null) {
         throw new IllegalArgumentException("The given URL is null.");
      } else if (i < 0) {
         throw new IllegalArgumentException("The given timeout value is negative.");
      } else {
         try {
            return this.StringHolder_8(url.toURI(), i);
         } catch (URISyntaxException urisyntaxexception) {
            throw new IllegalArgumentException("Failed to convert the given URL into a URI.");
         }
      }
   }

   public GetSocketHandler EventTarget(URI uri) throws IOException {
      return this.StringHolder_8(uri, this.GetStartTimeHandler());
   }

   public GetSocketHandler StringHolder_8(URI uri, int i) throws IOException {
      if (uri == null) {
         throw new IllegalArgumentException("The given URI is null.");
      } else if (i < 0) {
         throw new IllegalArgumentException("The given timeout value is negative.");
      } else {
         String s = uri.getScheme();
         String s1 = uri.getUserInfo();
         String s2 = SecureRandomHolder_2.StringHolder_8(uri);
         int j = uri.getPort();
         String s3 = uri.getRawPath();
         String s4 = uri.getRawQuery();
         return this.StringHolder_8(s, s1, s2, j, s3, s4, i);
      }
   }

   private GetSocketHandler StringHolder_8(String s, String s1, String s2, int i, String s3, String s4, int j) throws IOException {
      boolean flag = StringHolder_13(s);
      if (s2 != null && s2.length() != 0) {
         s3 = ZenithInternal072(s3);
         SocketFactoryHolder_3 li11ii1li11lli1i1liil = this.StringHolder_8(s2, i, flag, j);
         return this.StringHolder_8(flag, s1, s2, i, s3, s4, li11ii1li11lli1i1liil);
      } else {
         throw new IllegalArgumentException("The host part is empty.");
      }
   }

   private static boolean StringHolder_13(String s) {
      if (s == null || s.length() == 0) {
         throw new IllegalArgumentException("The scheme part is empty.");
      } else if ("wss".equalsIgnoreCase(s) || "https".equalsIgnoreCase(s)) {
         return true;
      } else if (!"ws".equalsIgnoreCase(s) && !"http".equalsIgnoreCase(s)) {
         throw new IllegalArgumentException("Bad scheme: " + s);
      } else {
         return false;
      }
   }

   private static String ZenithInternal072(String s) {
      if (s == null || s.length() == 0) {
         return "/";
      } else {
         return s.startsWith("/") ? s : "/" + s;
      }
   }

   private SocketFactoryHolder_3 StringHolder_8(String s, int i, boolean flag, int j) throws IOException {
      i = EventBus(i, flag);
      boolean flag1 = this.Tridentaimbot.ZenithInternal056() != null;
      return flag1 ? this.EventBus(s, i, flag, j) : this.EventTarget(s, i, flag, j);
   }

   private SocketFactoryHolder_3 EventBus(String s, int i, boolean flag, int j) {
      int k = EventBus(this.Tridentaimbot.getPort(), this.Tridentaimbot.ZenithInternal072());
      SocketFactory socketfactory = this.Tridentaimbot.StringHolder_10();
      StringHolder_4 i1i1li111lii1 = new StringHolder_4(this.Tridentaimbot.ZenithInternal056(), k);
      StringHolder_12 iilillliillil1ilil1i11i1ii = new StringHolder_12(s, i, this.Tridentaimbot);
      SSLSocketFactory sslsocketfactory = flag ? (SSLSocketFactory)this.ShulkerLook.Event(flag) : null;
      return new SocketFactoryHolder_3(
            socketfactory,
            i1i1li111lii1,
            j,
            this.EventImpl_10,
            this.Tridentaimbot.booleanHolder(),
            iilillliillil1ilil1i11i1ii,
            sslsocketfactory,
            s,
            i
         )
         .StringHolder_8(this.ZenithInternal078, this.booleanHolder_3)
         .ZenithInternal095(this.ZenithInternal025);
   }

   private SocketFactoryHolder_3 EventTarget(String s, int i, boolean flag, int j) {
      SocketFactory socketfactory = this.ShulkerLook.Event(flag);
      StringHolder_4 i1i1li111lii1 = new StringHolder_4(s, i);
      return new SocketFactoryHolder_3(socketfactory, i1i1li111lii1, j, this.EventImpl_32, this.EventImpl_10)
         .StringHolder_8(this.ZenithInternal078, this.booleanHolder_3)
         .ZenithInternal095(this.ZenithInternal025);
   }

   private static int EventBus(int i, boolean flag) {
      if (0 <= i) {
         return i;
      } else {
         return flag ? 443 : 80;
      }
   }

   private GetSocketHandler StringHolder_8(
      boolean flag, String s, String s1, int i, String s2, String s3, SocketFactoryHolder_3 li11ii1li11lli1i1liil
   ) {
      if (0 <= i) {
         s1 = s1 + ":" + i;
      }

      if (s3 != null) {
         s2 = s2 + "?" + s3;
      }

      return new GetSocketHandler(this, flag, s, s1, s2, li11ii1li11lli1i1liil);
   }
}
