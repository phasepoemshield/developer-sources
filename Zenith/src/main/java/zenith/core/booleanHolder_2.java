package zenith;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public class booleanHolder_2 {
   private final booleanHolder ZenithInternal125;
   private final Map<String, List<String>> ZenithInternal062;
   private final SocketFactoryHolder_2 ZenithInternal111;
   private boolean ZenithInternal086;
   private String FinishThread;
   private int ZenithInternal064;
   private String ZenithInternal055;
   private String EventImpl_25;
   private String[] EventImpl_32;

   booleanHolder_2(booleanHolder i1l11ll1l1l11l1111li1) {
      this.ZenithInternal125 = i1l11ll1l1l11l1111li1;
      this.ZenithInternal062 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
      this.ZenithInternal111 = new SocketFactoryHolder_2();
      this.StringHolder_13();
   }

   booleanHolder_2(booleanHolder i1l11ll1l1l11l1111li1, booleanHolder_2 i1lll11il1l1lillill1) {
      this(i1l11ll1l1l11l1111li1);
      this.ZenithInternal062.putAll(i1lll11il1l1lillill1.ZenithInternal062);
      this.ZenithInternal086 = i1lll11il1l1lillill1.ZenithInternal086;
      this.FinishThread = i1lll11il1l1lillill1.FinishThread;
      this.ZenithInternal064 = i1lll11il1l1lillill1.ZenithInternal064;
      this.ZenithInternal055 = i1lll11il1l1lillill1.ZenithInternal055;
      this.EventImpl_25 = i1lll11il1l1lillill1.EventImpl_25;
      if (i1lll11il1l1lillill1.EventImpl_32 != null) {
         this.EventImpl_32 = new String[i1lll11il1l1lillill1.EventImpl_32.length];
         System.arraycopy(i1lll11il1l1lillill1.EventImpl_32, 0, this.EventImpl_32, 0, this.EventImpl_32.length);
      }
   }

   public booleanHolder ZenithInternal086() {
      return this.ZenithInternal125;
   }

   public booleanHolder_2 StringHolder_13() {
      this.ZenithInternal086 = false;
      this.FinishThread = null;
      this.ZenithInternal064 = -1;
      this.ZenithInternal055 = null;
      this.EventImpl_25 = null;
      this.ZenithInternal062.clear();
      this.EventImpl_32 = null;
      return this;
   }

   public boolean ZenithInternal072() {
      return this.ZenithInternal086;
   }

   public booleanHolder_2 EventTarget(boolean flag) {
      this.ZenithInternal086 = flag;
      return this;
   }

   public String ZenithInternal056() {
      return this.FinishThread;
   }

   public booleanHolder_2 ZenithInternal084(String s) {
      this.FinishThread = s;
      return this;
   }

   public int getPort() {
      return this.ZenithInternal064;
   }

   public booleanHolder_2 byteHolder(int i) {
      this.ZenithInternal064 = i;
      return this;
   }

   public String GetSocketHandler() {
      return this.ZenithInternal055;
   }

   public booleanHolder_2 StringHolder_19(String s) {
      this.ZenithInternal055 = s;
      return this;
   }

   public String ZenithInternal142() {
      return this.EventImpl_25;
   }

   public booleanHolder_2 ZenithInternal061(String s) {
      this.EventImpl_25 = s;
      return this;
   }

   public booleanHolder_2 EventImpl_24(String s, String s1) {
      return this.StringHolder_19(s).ZenithInternal061(s1);
   }

   public booleanHolder_2 FinishThread(String s) {
      return s == null ? this : this.EventBus(URI.create(s));
   }

   public booleanHolder_2 StringHolder_8(URL url) {
      if (url == null) {
         return this;
      } else {
         try {
            return this.EventBus(url.toURI());
         } catch (URISyntaxException urisyntaxexception) {
            throw new IllegalArgumentException(urisyntaxexception);
         }
      }
   }

   public booleanHolder_2 EventBus(URI uri) {
      if (uri == null) {
         return this;
      } else {
         String s = uri.getScheme();
         String s1 = uri.getUserInfo();
         String s2 = uri.getHost();
         int i = uri.getPort();
         return this.StringHolder_8(s, s1, s2, i);
      }
   }

   private booleanHolder_2 StringHolder_8(String s, String s1, String s2, int i) {
      this.ZenithInternal064(s);
      this.ZenithInternal021(s1);
      this.FinishThread = s2;
      this.ZenithInternal064 = i;
      return this;
   }

   private void ZenithInternal064(String s) {
      if ("http".equalsIgnoreCase(s)) {
         this.ZenithInternal086 = false;
      } else if ("https".equalsIgnoreCase(s)) {
         this.ZenithInternal086 = true;
      }
   }

   private void ZenithInternal021(String s) {
      if (s != null) {
         String[] astring = s.split(":", 2);
         String s1;
         String s2;
         switch (astring.length) {
            case 1:
               s1 = astring[0];
               s2 = null;
               break;
            case 2:
               s1 = astring[0];
               s2 = astring[1];
               break;
            default:
               return;
         }

         if (s1.length() != 0) {
            this.ZenithInternal055 = s1;
            this.EventImpl_25 = s2;
         }
      }
   }

   public Map<String, List<String>> ZenithInternal045() {
      return this.ZenithInternal062;
   }

   public booleanHolder_2 ZenithInternal028(String s, String s1) {
      if (s != null && s.length() != 0) {
         Object object = this.ZenithInternal062.get(s);
         if (object == null) {
            object = new ArrayList();
            this.ZenithInternal062.put(s, (List<String>)object);
         }

         object.add(s1);
         return this;
      } else {
         return this;
      }
   }

   public SocketFactory ZenithInternal023() {
      return this.ZenithInternal111.ZenithInternal023();
   }

   public booleanHolder_2 StringHolder_8(SocketFactory socketfactory) {
      this.ZenithInternal111.setSocketFactory(socketfactory);
      return this;
   }

   public SSLSocketFactory ZenithInternal148() {
      return this.ZenithInternal111.ZenithInternal148();
   }

   public booleanHolder_2 StringHolder_8(SSLSocketFactory sslsocketfactory) {
      this.ZenithInternal111.EventBus(sslsocketfactory);
      return this;
   }

   public SSLContext ZenithException() {
      return this.ZenithInternal111.ZenithException();
   }

   public booleanHolder_2 StringHolder_8(SSLContext sslcontext) {
      this.ZenithInternal111.EventBus(sslcontext);
      return this;
   }

   SocketFactory StringHolder_10() {
      return this.ZenithInternal111.Event(this.ZenithInternal086);
   }

   public String[] booleanHolder() {
      return this.EventImpl_32;
   }

   public booleanHolder_2 EventBus(String[] astring) {
      this.EventImpl_32 = astring;
      return this;
   }

   public booleanHolder_2 ZenithException_2(String s) {
      return this.EventBus(new String[]{s});
   }
}
