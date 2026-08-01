package zenith;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class StringHolder_5 {
   private static final String StringHolder_10 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
   private final GetSocketHandler booleanHolder;

   public StringHolder_5(GetSocketHandler i1ii1il1i1ll11il1i1lli11) {
      this.booleanHolder = i1ii1il1i1ll11il1i1lli11;
   }

   public Map<String, List<String>> StringHolder_8(FilterInputStreamImpl ill1li1iii11i111iliil, String s) throws ZenithException {
      StringHolder_13 il11i1li1llll1i1111ll = this.StringHolder_8(ill1li1iii11i111iliil);
      Map map = this.EventBus(ill1li1iii11i111iliil);
      this.StringHolder_8(il11i1li1llll1i1111ll, map, ill1li1iii11i111iliil);
      this.StringHolder_8(il11i1li1llll1i1111ll, map);
      this.EventBus(il11i1li1llll1i1111ll, map);
      this.StringHolder_8(il11i1li1llll1i1111ll, map, s);
      this.EventTarget(il11i1li1llll1i1111ll, map);
      this.ZenithInternal095(il11i1li1llll1i1111ll, map);
      return map;
   }

   private StringHolder_13 StringHolder_8(FilterInputStreamImpl ill1li1iii11i111iliil) throws ZenithException {
      String s;
      try {
         s = ill1li1iii11i111iliil.PacketHolder_3();
      } catch (IOException ioexception) {
         throw new ZenithException(
            ZenithInternal148.ColorSetting, "Failed to read an opening handshake response from the server: " + ioexception.getMessage(), ioexception
         );
      }

      if (s != null && s.length() != 0) {
         try {
            return new StringHolder_13(s);
         } catch (Exception exception) {
            throw new ZenithException(
               ZenithInternal148.BindSetting, "The status line of the opening handshake response is badly formatted. The status line is: " + s
            );
         }
      } else {
         throw new ZenithException(ZenithInternal148.ListSetting, "The status line of the opening handshake response is empty.");
      }
   }

   private Map<String, List<String>> EventBus(FilterInputStreamImpl ill1li1iii11i111iliil) throws ZenithException {
      TreeMap treemap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
      StringBuilder stringbuilder = null;

      while (true) {
         String s;
         try {
            s = ill1li1iii11i111iliil.PacketHolder_3();
         } catch (IOException ioexception) {
            throw new ZenithException(
               ZenithInternal148.MultiBooleanSetting, "An error occurred while HTTP header section was being read: " + ioexception.getMessage(), ioexception
            );
         }

         if (s == null || s.length() == 0) {
            if (stringbuilder != null) {
               this.StringHolder_8(treemap, stringbuilder.toString());
            }

            return treemap;
         }

         char c0 = s.charAt(0);
         if (c0 != ' ' && c0 != '\t') {
            if (stringbuilder != null) {
               this.StringHolder_8(treemap, stringbuilder.toString());
            }

            stringbuilder = new StringBuilder(s);
         } else if (stringbuilder != null) {
            s = s.replaceAll("^[ \t]+", " ");
            stringbuilder.append(s);
         }
      }
   }

   private void StringHolder_8(Map<String, List<String>> map, String s) {
      String[] astring = s.split(":", 2);
      if (astring.length >= 2) {
         String s1 = astring[0].trim();
         String s2 = astring[1].trim();
         Object object = (List)map.get(s1);
         if (object == null) {
            object = new ArrayList();
            map.put(s1, object);
         }

         object.add(s2);
      }
   }

   private void StringHolder_8(StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map, FilterInputStreamImpl ill1li1iii11i111iliil) throws ZenithException {
      if (il11i1li1llll1i1111ll.SecretKeySpecHolder() != 101) {
         byte[] abyte = this.StringHolder_8(map, ill1li1iii11i111iliil);
         throw new longHolder_4(
            ZenithInternal148.ModeSetting,
            "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + il11i1li1llll1i1111ll,
            il11i1li1llll1i1111ll,
            map,
            abyte
         );
      }
   }

   private byte[] StringHolder_8(Map<String, List<String>> map, FilterInputStreamImpl ill1li1iii11i111iliil) {
      int i = this.StringHolder_8(map);
      if (i <= 0) {
         return null;
      } else {
         try {
            byte[] abyte = new byte[i];
            ill1li1iii11i111iliil.EventBus(abyte, i);
            return abyte;
         } catch (Throwable throwable) {
            return null;
         }
      }
   }

   private int StringHolder_8(Map<String, List<String>> map) {
      try {
         return Integer.parseInt((String)((List)map.get("Content-Length")).get(0));
      } catch (Exception exception) {
         return -1;
      }
   }

   private void StringHolder_8(StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map) throws ZenithException {
      List list = (List)map.get("Upgrade");
      if (list != null && list.size() != 0) {
         for (String s : list) {
            String[] astring = s.split("\\s*,\\s*");

            for (String s1 : astring) {
               if ("websocket".equalsIgnoreCase(s1)) {
                  return;
               }
            }
         }

         throw new longHolder_4(ZenithInternal148.StringSetting, "'websocket' was not found in 'Upgrade' header.", il11i1li1llll1i1111ll, map);
      } else {
         throw new longHolder_4(
            ZenithInternal148.NumberSetting, "The opening handshake response does not contain 'Upgrade' header.", il11i1li1llll1i1111ll, map
         );
      }
   }

   private void EventBus(StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map) throws ZenithException {
      List list = (List)map.get("Connection");
      if (list != null && list.size() != 0) {
         for (String s : list) {
            String[] astring = s.split("\\s*,\\s*");

            for (String s1 : astring) {
               if ("Upgrade".equalsIgnoreCase(s1)) {
                  return;
               }
            }
         }

         throw new longHolder_4(
            ZenithInternal148.Aimassist, "'Upgrade' was not found in 'Connection' header.", il11i1li1llll1i1111ll, map
         );
      } else {
         throw new longHolder_4(
            ZenithInternal148.ContainerSetting, "The opening handshake response does not contain 'Connection' header.", il11i1li1llll1i1111ll, map
         );
      }
   }

   private void StringHolder_8(StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map, String s) throws ZenithException {
      List list = (List)map.get("Sec-WebSocket-Accept");
      if (list == null) {
         throw new longHolder_4(
            ZenithInternal148.Antibot, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", il11i1li1llll1i1111ll, map
         );
      } else {
         String s1 = (String)list.get(0);
         String s2 = s + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

         String s3;
         try {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            byte[] abyte = messagedigest.digest(SecureRandomHolder_2.ByteBufferHolder_2(s2));
            s3 = ZenithInternal128.StringHolder_8(abyte);
         } catch (Exception exception) {
            return;
         }

         if (!s3.equals(s1)) {
            throw new longHolder_4(
               ZenithInternal148.Aura,
               "The value of 'Sec-WebSocket-Accept' header is different from the expected one.",
               il11i1li1llll1i1111ll,
               map
            );
         }
      }
   }

   private void EventTarget(StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map) throws ZenithException {
      List list = (List)map.get("Sec-WebSocket-Extensions");
      if (list != null && list.size() != 0) {
         ArrayList arraylist = new ArrayList();

         for (String s : list) {
            String[] astring = s.split("\\s*,\\s*");

            for (String s1 : astring) {
               StringHolder_10 iiil1lil1i1111llili1iilili = zenith.StringHolder_10.SocketFactoryHolder_3(s1);
               if (iiil1lil1i1111llili1iilili == null) {
                  throw new longHolder_4(
                     ZenithInternal148.Autoexplosion, "The value in 'Sec-WebSocket-Extensions' failed to be parsed: " + s1, il11i1li1llll1i1111ll, map
                  );
               }

               String s2 = iiil1lil1i1111llili1iilili.getName();
               if (!this.booleanHolder.EventImpl_14().EventImpl_13(s2)) {
                  throw new longHolder_4(
                     ZenithInternal148.Autoswap,
                     "The extension contained in the Sec-WebSocket-Extensions header is not supported: " + s2,
                     il11i1li1llll1i1111ll,
                     map
                  );
               }

               iiil1lil1i1111llili1iilili.permessagedeflate();
               arraylist.add(iiil1lil1i1111llili1iilili);
            }
         }

         this.StringHolder_8(il11i1li1llll1i1111ll, map, arraylist);
         this.booleanHolder.byteHolder_2(arraylist);
      }
   }

   private void StringHolder_8(StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map, List<StringHolder_10> list) throws ZenithException {
      StringHolder_10 iiil1lil1i1111llili1iilili = null;

      for (StringHolder_10 iiil1lil1i1111llili1iilili1 : list) {
         if (iiil1lil1i1111llili1iilili1 instanceof ZenithInternal044) {
            if (iiil1lil1i1111llili1iilili != null) {
               String s = String.format(
                  "'%s' extension and '%s' extension conflict with each other.", iiil1lil1i1111llili1iilili.getName(), iiil1lil1i1111llili1iilili1.getName()
               );
               throw new longHolder_4(ZenithInternal148.Autototem, s, il11i1li1llll1i1111ll, map);
            }

            iiil1lil1i1111llili1iilili = iiil1lil1i1111llili1iilili1;
         }
      }
   }

   private void ZenithInternal095(StringHolder_13 il11i1li1llll1i1111ll, Map<String, List<String>> map) throws ZenithException {
      List list = (List)map.get("Sec-WebSocket-Protocol");
      if (list != null) {
         String s = (String)list.get(0);
         if (s != null && s.length() != 0) {
            if (!this.booleanHolder.EventImpl_14().EventImpl_24(s)) {
               throw new longHolder_4(
                  ZenithInternal148.Reachv3,
                  "The protocol contained in the Sec-WebSocket-Protocol header is not supported: " + s,
                  il11i1li1llll1i1111ll,
                  map
               );
            } else {
               this.booleanHolder.setKeyCode(s);
            }
         }
      }
   }
}
