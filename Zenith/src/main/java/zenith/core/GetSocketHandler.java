package zenith;

import zenith.hud.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class GetSocketHandler {
   private static final long ZenithInternal041 = 10000L;
   private final booleanHolder ModuleHolder;
   private final SocketFactoryHolder_3 SupplierHolder;
   private final ZenithInternal086 StringHolder_26;
   private ClearHeadersHandler floatHolder_11;
   private final ListHolder_6 ZenithInternal059;
   private final StringHolder_11 ZenithInternal137;
   private final StringHolder_32 ZenithInternal138;
   private final Object floatHolder_7 = new Object();
   private FilterInputStreamImpl ZenithInternal057;
   private BufferedOutputStreamImpl ZenithInternal026;
   private ReadingThread ZenithInternal124;
   private WritingThread ZenithInternal015;
   private Map<String, List<String>> ZenithInternal017;
   private List<StringHolder_10> ZenithInternal115;
   private String ZenithInternal002;
   private boolean ListHolder_7;
   private boolean GetDisplayNameHandler = true;
   private boolean SoundEventHolder = true;
   private boolean SetColorHandler_3;
   private int GetClientColorHandler;
   private int StringHolder_23;
   private boolean ArmorHud;
   private Object CloudFriendInfo = new Object();
   private boolean Cooldowns;
   private boolean Events;
   private boolean HootBar;
   private boolean Information;
   private GetPayloadLengthHandler Inventory;
   private GetPayloadLengthHandler ItemBinds;
   private ZenithInternal044 Keybinds;

   GetSocketHandler(
      booleanHolder i1l11ll1l1l11l1111li1, boolean flag, String s, String s1, String s2, SocketFactoryHolder_3 li11ii1li11lli1i1liil
   ) {
      this.ModuleHolder = i1l11ll1l1l11l1111li1;
      this.SupplierHolder = li11ii1li11lli1i1liil;
      this.StringHolder_26 = new ZenithInternal086();
      this.floatHolder_11 = new ClearHeadersHandler(flag, s, s1, s2);
      this.ZenithInternal059 = new ListHolder_6(this);
      this.ZenithInternal137 = new StringHolder_11(this, new longHolder_5());
      this.ZenithInternal138 = new StringHolder_32(this, new longHolder_5());
   }

   public GetSocketHandler GetSettingsHandler() throws IOException {
      return this.ZenithInternal128(this.SupplierHolder.GetStartTimeHandler());
   }

   public GetSocketHandler ZenithInternal128(int i) throws IOException {
      if (i < 0) {
         throw new IllegalArgumentException("The given timeout value is negative.");
      } else {
         GetSocketHandler i1ii1il1i1ll11il1i1lli111 = this.ModuleHolder.StringHolder_8(this.getURI(), i);
         i1ii1il1i1ll11il1i1lli111.floatHolder_11 = new ClearHeadersHandler(this.floatHolder_11);
         i1ii1il1i1ll11il1i1lli111.EventTarget(this.EventImpl_7());
         i1ii1il1i1ll11il1i1lli111.ZenithInternal095(this.ZenithInternal031());
         i1ii1il1i1ll11il1i1lli111.EventBus(this.EventImpl_11());
         i1ii1il1i1ll11il1i1lli111.EventTarget(this.StringHolder_20());
         i1ii1il1i1ll11il1i1lli111.ListHolder_7 = this.ListHolder_7;
         i1ii1il1i1ll11il1i1lli111.GetDisplayNameHandler = this.GetDisplayNameHandler;
         i1ii1il1i1ll11il1i1lli111.SoundEventHolder = this.SoundEventHolder;
         i1ii1il1i1ll11il1i1lli111.SetColorHandler_3 = this.SetColorHandler_3;
         i1ii1il1i1ll11il1i1lli111.GetClientColorHandler = this.GetClientColorHandler;
         List list = this.ZenithInternal059.SecureRandomHolder_2();
         synchronized (list) {
            i1ii1il1i1ll11il1i1lli111.EventImpl_21(list);
            return i1ii1il1i1ll11il1i1lli111;
         }
      }
   }

   @Override
   protected void finalize() throws Throwable {
      if (this.EventTarget(ZenithInternal033.Boathighjump)) {
         this.BlockHolder_2();
      }

      super.finalize();
   }

   public ZenithInternal033 StringHolder_6() {
      synchronized (this.StringHolder_26) {
         return this.StringHolder_26.StringHolder_6();
      }
   }

   public boolean isOpen() {
      return this.EventTarget(ZenithInternal033.Elytrabooster);
   }

   private boolean EventTarget(ZenithInternal033 ii1iili11i1ililliiiiii111lll1i) {
      synchronized (this.StringHolder_26) {
         return this.StringHolder_26.StringHolder_6() == ii1iili11i1ililliiiiii111lll1i;
      }
   }

   public GetSocketHandler longHolder_6(String s) {
      this.floatHolder_11.EventTarget(s);
      return this;
   }

   public GetSocketHandler ListHolder_6(String s) {
      this.floatHolder_11.ZenithInternal095(s);
      return this;
   }

   public GetSocketHandler StringHolder_17() {
      this.floatHolder_11.ZenithInternal021();
      return this;
   }

   public GetSocketHandler ZenithInternal095(StringHolder_10 iiil1lil1i1111llili1iilili) {
      this.floatHolder_11.StringHolder_8(iiil1lil1i1111llili1iilili);
      return this;
   }

   public GetSocketHandler SecureRandomHolder_2(String s) {
      this.floatHolder_11.ZenithInternal028(s);
      return this;
   }

   public GetSocketHandler Event(StringHolder_10 iiil1lil1i1111llili1iilili) {
      this.floatHolder_11.EventBus(iiil1lil1i1111llili1iilili);
      return this;
   }

   public GetSocketHandler longHolder_7(String s) {
      this.floatHolder_11.EventImpl_21(s);
      return this;
   }

   public GetSocketHandler StringHolder_15() {
      this.floatHolder_11.ZenithException_2();
      return this;
   }

   public GetSocketHandler EventImpl_21(String s, String s1) {
      this.floatHolder_11.addHeader(s, s1);
      return this;
   }

   public GetSocketHandler HostnameVerifierImpl(String s) {
      this.floatHolder_11.byteHolder_2(s);
      return this;
   }

   public GetSocketHandler StringHolder_22() {
      this.floatHolder_11.clearHeaders();
      return this;
   }

   public GetSocketHandler longHolder_4(String s) {
      this.floatHolder_11.byteHolder(s);
      return this;
   }

   public GetSocketHandler EventImpl_13(String s, String s1) {
      this.floatHolder_11.StringHolder_8(s, s1);
      return this;
   }

   public GetSocketHandler ZenithInternal087() {
      this.floatHolder_11.ClearHeadersHandler();
      return this;
   }

   public boolean ZenithInternal100() {
      return this.ListHolder_7;
   }

   public GetSocketHandler EventImpl_24(boolean flag) {
      this.ListHolder_7 = flag;
      return this;
   }

   public boolean ZenithInternal024() {
      return this.GetDisplayNameHandler;
   }

   public GetSocketHandler ZenithInternal028(boolean flag) {
      this.GetDisplayNameHandler = flag;
      return this;
   }

   public boolean IsPriorityHandler() {
      return this.SoundEventHolder;
   }

   public GetSocketHandler EventImpl_21(boolean flag) {
      this.SoundEventHolder = flag;
      return this;
   }

   public boolean FileHolder_2() {
      return this.SetColorHandler_3;
   }

   public GetSocketHandler EventImpl_13(boolean flag) {
      this.SetColorHandler_3 = flag;
      return this;
   }

   public GetSocketHandler EventImpl_33() {
      synchronized (this.StringHolder_26) {
         ZenithInternal033 ii1iili11i1ililliiiiii111lll1i = this.StringHolder_26.StringHolder_6();
         if (ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytrabooster
            && ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytrafly) {
            return this;
         }
      }

      WritingThread ili11ii1l1ill1lllil1 = this.ZenithInternal015;
      if (ili11ii1l1ill1lllil1 != null) {
         ili11ii1l1ill1lllil1.TypeHolder();
      }

      return this;
   }

   public int EventImpl_6() {
      return this.GetClientColorHandler;
   }

   public GetSocketHandler ByteBufferHolder_2(int i) throws IllegalArgumentException {
      if (i < 0) {
         throw new IllegalArgumentException("size must not be negative.");
      } else {
         this.GetClientColorHandler = i;
         return this;
      }
   }

   public int ZenithInternal139() {
      return this.StringHolder_23;
   }

   public GetSocketHandler ConnectThread(int i) throws IllegalArgumentException {
      if (i < 0) {
         throw new IllegalArgumentException("size must not be negative.");
      } else {
         this.StringHolder_23 = i;
         return this;
      }
   }

   public long EventImpl_7() {
      return this.ZenithInternal137.StringHolder_32();
   }

   public GetSocketHandler EventTarget(long i) {
      this.ZenithInternal137.StringHolder_8(i);
      return this;
   }

   public long ZenithInternal031() {
      return this.ZenithInternal138.StringHolder_32();
   }

   public GetSocketHandler ZenithInternal095(long i) {
      this.ZenithInternal138.StringHolder_8(i);
      return this;
   }

   public ZenithInternal045 EventImpl_11() {
      return this.ZenithInternal137.StringHolder_12();
   }

   public GetSocketHandler EventBus(ZenithInternal045 iili11iiiil111lil) {
      this.ZenithInternal137.StringHolder_8(iili11iiiil111lil);
      return this;
   }

   public ZenithInternal045 StringHolder_20() {
      return this.ZenithInternal138.StringHolder_12();
   }

   public GetSocketHandler EventTarget(ZenithInternal045 iili11iiiil111lil) {
      this.ZenithInternal138.StringHolder_8(iili11iiiil111lil);
      return this;
   }

   public String doubleHolder_2() {
      return this.ZenithInternal137.setKeyCode();
   }

   public GetSocketHandler ZenithInternal045(String s) {
      this.ZenithInternal137.ZenithInternal101(s);
      return this;
   }

   public String EventImpl_19() {
      return this.ZenithInternal138.setKeyCode();
   }

   public GetSocketHandler ZenithInternal044(String s) {
      this.ZenithInternal138.ZenithInternal101(s);
      return this;
   }

   public GetSocketHandler EventTarget(ZenithInternal123 lil1illiii1li) {
      this.ZenithInternal059.StringHolder_8(lil1illiii1li);
      return this;
   }

   public GetSocketHandler EventImpl_21(List<ZenithInternal123> list) {
      this.ZenithInternal059.EventTarget(list);
      return this;
   }

   public GetSocketHandler ZenithInternal095(ZenithInternal123 lil1illiii1li) {
      this.ZenithInternal059.EventBus(lil1illiii1li);
      return this;
   }

   public GetSocketHandler EventImpl_13(List<ZenithInternal123> list) {
      this.ZenithInternal059.ZenithInternal095(list);
      return this;
   }

   public GetSocketHandler KeyEvent() {
      this.ZenithInternal059.longHolder_7();
      return this;
   }

   public Socket getSocket() {
      return this.SupplierHolder.getSocket();
   }

   public Socket IReturn() throws ZenithException {
      return this.SupplierHolder.IReturn();
   }

   public URI getURI() {
      return this.floatHolder_11.getURI();
   }

   public GetSocketHandler EventImpl_16() throws ZenithException {
      this.ZenithInternal111();

      Map map;
      try {
         Socket socket = this.SupplierHolder.StringHolder_30();
         map = this.Event(socket);
      } catch (ZenithException ilii1lii1liiill) {
         this.SupplierHolder.ZenithInternal150();
         this.StringHolder_26.EventBus(ZenithInternal033.Elytramotion);
         this.ZenithInternal059.StringHolder_8(ZenithInternal033.Elytramotion);
         throw ilii1lii1liiill;
      }

      this.ZenithInternal017 = map;
      this.Keybinds = this.EventImpl_31();
      this.StringHolder_26.EventBus(ZenithInternal033.Elytrabooster);
      this.ZenithInternal059.StringHolder_8(ZenithInternal033.Elytrabooster);
      this.EventImpl_25();
      return this;
   }

   public Future<GetSocketHandler> StringHolder_8(ExecutorService executorservice) {
      return executorservice.submit(this.EventImpl_38());
   }

   public Callable<GetSocketHandler> EventImpl_38() {
      return new CallableImpl(this);
   }

   public GetSocketHandler ZenithInternal090() {
      ConnectThread iil1ilii1iii1iil1iil = new ConnectThread(this);
      ListHolder_6 illlll11i11i1illi1l1ii1i111 = this.ZenithInternal059;
      if (illlll11i11i1illi1l1ii1i111 != null) {
         illlll11i11i1illi1l1ii1i111.StringHolder_8(ZenithInternal072.TimerUtilHolder_2, iil1ilii1iii1iil1iil);
      }

      iil1ilii1iii1iil1iil.start();
      return this;
   }

   public GetSocketHandler EventImpl_36() {
      return this.StringHolder_8(1000, null);
   }

   public GetSocketHandler CallableImpl(int i) {
      return this.StringHolder_8(i, null);
   }

   public GetSocketHandler permessagedeflate(String s) {
      return this.StringHolder_8(1000, s);
   }

   public GetSocketHandler StringHolder_8(int i, String s) {
      return this.StringHolder_8(i, s, 10000L);
   }

   public GetSocketHandler StringHolder_8(int i, String s, long j) {
      synchronized (this.StringHolder_26) {
         switch (this.StringHolder_26.StringHolder_6()) {
            case Boathighjump:
               this.EventImpl_35();
               return this;
            case Elytrabooster:
               this.StringHolder_26.StringHolder_8(ZenithInternal085$Helper.StringHolder_31);
               GetPayloadLengthHandler lll1li1iil1ii11iliiii1 = GetPayloadLengthHandler.ZenithInternal095(i, s);
               this.longHolder_3(lll1li1iil1ii11iliiii1);
               break;
            default:
               return this;
         }
      }

      this.ZenithInternal059.StringHolder_8(ZenithInternal033.Elytrafly);
      if (j < 0L) {
         j = 10000L;
      }

      this.Event(j);
      return this;
   }

   public List<StringHolder_10> BlockPosHolder_2() {
      return this.ZenithInternal115;
   }

   public String GetSlotIdHandler_2() {
      return this.ZenithInternal002;
   }

   public GetSocketHandler longHolder_3(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      if (lll1li1iil1ii11iliiii1x == null) {
         return this;
      } else {
         synchronized (this.StringHolder_26) {
            ZenithInternal033 ii1iili11i1ililliiiiii111lll1i = this.StringHolder_26.StringHolder_6();
            if (ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytrabooster
               && ii1iili11i1ililliiiiii111lll1i != ZenithInternal033.Elytrafly) {
               return this;
            }
         }

         WritingThread ili11ii1l1ill1lllil1 = this.ZenithInternal015;
         if (ili11ii1l1ill1lllil1 == null) {
            return this;
         } else {
            List list = this.ZenithInternal070(lll1li1iil1ii11iliiii1x);
            if (list == null) {
               ili11ii1l1ill1lllil1.ZenithInternal045(lll1li1iil1ii11iliiii1x);
            } else {
               for (GetPayloadLengthHandler lll1li1iil1ii11iliiii1x : list) {
                  ili11ii1l1ill1lllil1.ZenithInternal045(lll1li1iil1ii11iliiii1x);
               }
            }

            return this;
         }
      }
   }

   private List<GetPayloadLengthHandler> ZenithInternal070(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      return GetPayloadLengthHandler.StringHolder_8(lll1li1iil1ii11iliiii1, this.StringHolder_23, this.Keybinds);
   }

   public GetSocketHandler ScreenHolder() {
      return this.longHolder_3(GetPayloadLengthHandler.EventImpl_37());
   }

   public GetSocketHandler byteHolder_2(boolean flag) {
      return this.longHolder_3(GetPayloadLengthHandler.EventImpl_37().StringHolder_4(flag));
   }

   public GetSocketHandler StringHolder(String s) {
      return this.longHolder_3(GetPayloadLengthHandler.GetSocketHandler(s));
   }

   public GetSocketHandler StringHolder_8(String s, boolean flag) {
      return this.longHolder_3(GetPayloadLengthHandler.GetSocketHandler(s).StringHolder_4(flag));
   }

   public GetSocketHandler byteHolder(byte[] abyte) {
      return this.longHolder_3(GetPayloadLengthHandler.CallableImpl(abyte));
   }

   public GetSocketHandler StringHolder_8(byte[] abyte, boolean flag) {
      return this.longHolder_3(GetPayloadLengthHandler.CallableImpl(abyte).StringHolder_4(flag));
   }

   public GetSocketHandler StringHolder_11(String s) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal142(s));
   }

   public GetSocketHandler EventBus(String s, boolean flag) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal142(s).StringHolder_4(flag));
   }

   public GetSocketHandler StringHolder_4(byte[] abyte) {
      return this.longHolder_3(GetPayloadLengthHandler.hasTimeElapsed(abyte));
   }

   public GetSocketHandler EventBus(byte[] abyte, boolean flag) {
      return this.longHolder_3(GetPayloadLengthHandler.hasTimeElapsed(abyte).StringHolder_4(flag));
   }

   public GetSocketHandler EventImpl_27() {
      return this.longHolder_3(GetPayloadLengthHandler.TextHolder_2());
   }

   public GetSocketHandler longHolder_5(int i) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal061(i));
   }

   public GetSocketHandler EventBus(int i, String s) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal095(i, s));
   }

   public GetSocketHandler ZenithInternal125() {
      return this.longHolder_3(GetPayloadLengthHandler.PacketHolder());
   }

   public GetSocketHandler ZenithInternal128(byte[] abyte) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal042(abyte));
   }

   public GetSocketHandler StringHolder_32(String s) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal023(s));
   }

   public GetSocketHandler ZenithInternal062() {
      return this.longHolder_3(GetPayloadLengthHandler.PacketHolder_2());
   }

   public GetSocketHandler ByteBufferHolder_2(byte[] abyte) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal101(abyte));
   }

   public GetSocketHandler StringHolder_12(String s) {
      return this.longHolder_3(GetPayloadLengthHandler.ZenithInternal148(s));
   }

   private void ZenithInternal111() throws ZenithException {
      synchronized (this.StringHolder_26) {
         if (this.StringHolder_26.StringHolder_6() != ZenithInternal033.Boathighjump) {
            throw new ZenithException(ZenithInternal148.ModuleInfo, "The current state of the WebSocket is not CREATED.");
         }

         this.StringHolder_26.EventBus(ZenithInternal033.Boatlongjump);
      }

      this.ZenithInternal059.StringHolder_8(ZenithInternal033.Boatlongjump);
   }

   private Map<String, List<String>> Event(Socket socket) throws ZenithException {
      FilterInputStreamImpl ill1li1iii11i111iliil = this.EventImpl_24(socket);
      BufferedOutputStreamImpl lll11lil1illli11lili1ililiiiil = this.ZenithInternal028(socket);
      String s = ZenithInternal055();
      this.StringHolder_8(lll11lil1illli11lili1ililiiiil, s);
      Map map = this.StringHolder_8(ill1li1iii11i111iliil, s);
      this.ZenithInternal057 = ill1li1iii11i111iliil;
      this.ZenithInternal026 = lll11lil1illli11lili1ililiiiil;
      return map;
   }

   private FilterInputStreamImpl EventImpl_24(Socket socket) throws ZenithException {
      try {
         return new FilterInputStreamImpl(new BufferedInputStream(socket.getInputStream()));
      } catch (IOException ioexception) {
         throw new ZenithException(ZenithInternal148.Setting, "Failed to get the input stream of the raw socket: " + ioexception.getMessage(), ioexception);
      }
   }

   private BufferedOutputStreamImpl ZenithInternal028(Socket socket) throws ZenithException {
      try {
         return new BufferedOutputStreamImpl(new BufferedOutputStream(socket.getOutputStream()));
      } catch (IOException ioexception) {
         throw new ZenithException(
            ZenithInternal148.BooleanSetting, "Failed to get the output stream from the raw socket: " + ioexception.getMessage(), ioexception
         );
      }
   }

   private static String ZenithInternal055() {
      byte[] abyte = new byte[16];
      SecureRandomHolder_2.nextBytes(abyte);
      return ZenithInternal128.StringHolder_8(abyte);
   }

   private void StringHolder_8(BufferedOutputStreamImpl lll11lil1illli11lili1ililiiiil, String s) throws ZenithException {
      this.floatHolder_11.StringHolder_4(s);
      String s1 = this.floatHolder_11.StringHolder_5();
      List list = this.floatHolder_11.longHolder_3();
      String s2 = ClearHeadersHandler.StringHolder_8(s1, list);
      this.ZenithInternal059.EventBus(s1, list);

      try {
         lll11lil1illli11lili1ililiiiil.ZenithException(s2);
         lll11lil1illli11lili1ililiiiil.flush();
      } catch (IOException ioexception) {
         throw new ZenithException(
            ZenithInternal148.ButtonSetting,
            "Failed to send an opening handshake request to the server: " + ioexception.getMessage(),
            ioexception
         );
      }
   }

   private Map<String, List<String>> StringHolder_8(FilterInputStreamImpl ill1li1iii11i111iliil, String s) throws ZenithException {
      return new StringHolder_5(this).StringHolder_8(ill1li1iii11i111iliil, s);
   }

   private void EventImpl_25() {
      ReadingThread ii1il11i11lilii1i1l11liliil1l = new ReadingThread(this);
      WritingThread ili11ii1l1ill1lllil1 = new WritingThread(this);
      synchronized (this.floatHolder_7) {
         this.ZenithInternal124 = ii1il11i11lilii1i1l11liliil1l;
         this.ZenithInternal015 = ili11ii1l1ill1lllil1;
      }

      ii1il11i11lilii1i1l11liliil1l.PathHolder();
      ili11ii1l1ill1lllil1.PathHolder();
      ii1il11i11lilii1i1l11liliil1l.start();
      ili11ii1l1ill1lllil1.start();
   }

   private void Event(long i) {
      ReadingThread ii1il11i11lilii1i1l11liliil1l;
      WritingThread ili11ii1l1ill1lllil1;
      synchronized (this.floatHolder_7) {
         ii1il11i11lilii1i1l11liliil1l = this.ZenithInternal124;
         ili11ii1l1ill1lllil1 = this.ZenithInternal015;
         this.ZenithInternal124 = null;
         this.ZenithInternal015 = null;
      }

      if (ii1il11i11lilii1i1l11liliil1l != null) {
         ii1il11i11lilii1i1l11liliil1l.EventBus(i);
      }

      if (ili11ii1l1ill1lllil1 != null) {
         ili11ii1l1ill1lllil1.CreateGsonHandler();
      }
   }

   FilterInputStreamImpl EventImpl_32() {
      return this.ZenithInternal057;
   }

   BufferedOutputStreamImpl GetSlotIdHandler() {
      return this.ZenithInternal026;
   }

   ZenithInternal086 BlockHolder() {
      return this.StringHolder_26;
   }

   ListHolder_6 ZenithInternal127() {
      return this.ZenithInternal059;
   }

   ClearHeadersHandler EventImpl_14() {
      return this.floatHolder_11;
   }

   void byteHolder_2(List<StringHolder_10> list) {
      this.ZenithInternal115 = list;
   }

   void booleanHolder_2(String s) {
      this.ZenithInternal002 = s;
   }

   void EventImpl_2() {
      boolean flag = false;
      synchronized (this.floatHolder_7) {
         this.Cooldowns = true;
         if (this.Events) {
            flag = true;
         }
      }

      this.EventImpl_29();
      if (flag) {
         this.EventImpl_26();
      }
   }

   void EventImpl_17() {
      boolean flag = false;
      synchronized (this.floatHolder_7) {
         this.Events = true;
         if (this.Cooldowns) {
            flag = true;
         }
      }

      this.EventImpl_29();
      if (flag) {
         this.EventImpl_26();
      }
   }

   private void EventImpl_29() {
      synchronized (this.CloudFriendInfo) {
         if (this.ArmorHud) {
            return;
         }

         this.ArmorHud = true;
      }

      this.ZenithInternal059.EventBus(this.ZenithInternal017);
   }

   private void EventImpl_26() {
      this.ZenithInternal137.start();
      this.ZenithInternal138.start();
   }

   void longHolder_6(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      synchronized (this.floatHolder_7) {
         this.HootBar = true;
         this.Inventory = lll1li1iil1ii11iliiii1;
         if (!this.Information) {
            return;
         }
      }

      this.EntityHolder();
   }

   void ListHolder_6(GetPayloadLengthHandler lll1li1iil1ii11iliiii1) {
      synchronized (this.floatHolder_7) {
         this.Information = true;
         this.ItemBinds = lll1li1iil1ii11iliiii1;
         if (!this.HootBar) {
            return;
         }
      }

      this.EntityHolder();
   }

   private void EntityHolder() {
      this.BlockHolder_2();
   }

   void BlockHolder_2() {
      this.ZenithInternal137.stop();
      this.ZenithInternal138.stop();
      Socket socket = this.SupplierHolder.getSocket();
      if (socket != null) {
         try {
            socket.close();
         } catch (Throwable throwable) {
         }
      }

      synchronized (this.StringHolder_26) {
         this.StringHolder_26.EventBus(ZenithInternal033.Elytramotion);
      }

      this.ZenithInternal059.StringHolder_8(ZenithInternal033.Elytramotion);
      this.ZenithInternal059.StringHolder_8(this.Inventory, this.ItemBinds, this.StringHolder_26.StringHolder_27());
   }

   private void EventImpl_35() {
      FinishThread illll1l1l1il = new FinishThread(this);
      illll1l1l1il.PathHolder();
      illll1l1l1il.start();
   }

   private ZenithInternal044 EventImpl_31() {
      if (this.ZenithInternal115 == null) {
         return null;
      } else {
         for (StringHolder_10 iiil1lil1i1111llili1iilili : this.ZenithInternal115) {
            if (iiil1lil1i1111llili1iilili instanceof ZenithInternal044) {
               return (ZenithInternal044)iiil1lil1i1111llili1iilili;
            }
         }

         return null;
      }
   }

   ZenithInternal044 EventImpl_4() {
      return this.Keybinds;
   }
}
