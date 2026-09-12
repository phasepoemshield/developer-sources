package Nursultan;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Vector2f;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11292 extends class11488 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public static Object y_0 = LogManager.getLogger(String.class);

   public Vector2f L() {
      this.z();
      return (Vector2f)this.N_3;
   }

   public Vector2f L(String var1) {
      this.z();
      return (Vector2f)((Map)this.N_0).get(var1);
   }

   public Map<String, class11763> M() {
      this.z();
      return (Map<String, class11763>)this.N_1;
   }

   private void P() {
      this.z();
      ((Map)this.N_0).clear();
      ((Map)this.N_1).clear();

      for (class11769 var2 : (List)class11730.N_7) {
         Vector2f var3 = var2.m();
         if (var3 != null) {
            ((Map)this.N_0).put(var2.E(), var3);
            ((Map)this.N_1).put(var2.E(), var2.L());
         }
      }

      this.N_3 = class09193.y();
      ((Map)this.N_2).clear();

      for (Entry var5 : class09223.N().entrySet()) {
         ((Map)this.N_2).put((String)var5.getKey(), (Boolean)((class09785)var5.getValue()).L());
      }
   }

   public class11292(String var1, int var2) {
      super(var1, var2, null);
      this.z();
      this.N_0 = new HashMap();
      this.N_1 = new HashMap();
      this.N_2 = new HashMap();
   }

   static {
      U();
   }

   public Map<String, Vector2f> B() {
      this.z();
      return (Map<String, Vector2f>)this.N_0;
   }

   public Map<String, Boolean> Z() {
      this.z();
      return (Map<String, Boolean>)this.N_2;
   }

   private static void U() {
      y_0 = null;
   }

   private void z() {
   }

   public Vector2f y() {
      this.z();
      return (Vector2f)this.N_3;
   }

   public Boolean y(String var1) {
      this.z();
      return (Boolean)((Map)this.N_2).get(var1);
   }

   public class11763 N(String var1) {
      this.z();
      return (class11763)((Map)this.N_1).get(var1);
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      this.z();
      this.P();
      var1.packArrayHeader(3);
      var1.packMapHeader(((Map)this.N_0).size());

      for (Entry var3 : ((Map)this.N_0).entrySet()) {
         var1.packString((String)var3.getKey());
         class11763 var4 = (class11763)((Map)this.N_1).get(var3.getKey());
         var1.packArrayHeader(3);
         var1.packFloat(((Vector2f)var3.getValue()).x);
         var1.packFloat(((Vector2f)var3.getValue()).y);
         var1.packInt(var4 != null ? var4.ordinal() : 0);
      }

      if ((Vector2f)this.N_3 == null) {
         var1.packNil();
      } else {
         var1.packArrayHeader(2);
         var1.packFloat(((Vector2f)this.N_3).x);
         var1.packFloat(((Vector2f)this.N_3).y);
      }

      var1.packMapHeader(((Map)this.N_2).size());

      for (Entry var6 : ((Map)this.N_2).entrySet()) {
         var1.packString((String)var6.getKey());
         var1.packBoolean((Boolean)var6.getValue());
      }
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      this.z();
      var2.unpackArrayHeader();
      ((Map)this.N_0).clear();
      ((Map)this.N_1).clear();
      int var3 = var2.unpackMapHeader();

      for (int var4 = 0; var4 < var3; var4++) {
         try {
            String var5 = var2.unpackString();
            int var6 = var2.unpackArrayHeader();
            float var7 = var2.unpackFloat();
            float var8 = var2.unpackFloat();
            if (var6 > 2) {
               int var9 = var2.unpackInt();
               class11763[] var10 = class11763.values();
               if (var9 >= 0 && var9 < var10.length) {
                  ((Map)this.N_1).put(var5, var10[var9]);
               }

               for (int var11 = 3; var11 < var6; var11++) {
                  var2.skipValue();
               }
            }

            ((Map)this.N_0).put(var5, new Vector2f(var7, var8));
         } catch (Exception var13) {
            ((Logger)y_0).warn("Skipped corrupt hud position #{} in {}: {}", var4, this.u(), var13.getMessage());
         }
      }

      if (var2.tryUnpackNil()) {
         this.N_3 = null;
      } else {
         var2.unpackArrayHeader();
         float var14 = var2.unpackFloat();
         float var16 = var2.unpackFloat();
         this.N_3 = new Vector2f(var14, var16);
      }

      ((Map)this.N_2).clear();
      int var15 = var2.unpackMapHeader();

      for (int var17 = 0; var17 < var15; var17++) {
         try {
            String var18 = var2.unpackString();
            boolean var19 = var2.unpackBoolean();
            ((Map)this.N_2).put(var18, var19);
         } catch (Exception var12) {
            ((Logger)y_0).warn("Skipped corrupt subcategory flag #{} in {}: {}", var17, this.u(), var12.getMessage());
         }
      }
   }

   @Override
   public boolean d_() {
      this.z();
      return ((Map)this.N_0).isEmpty() && (Vector2f)this.N_3 == null && ((Map)this.N_2).isEmpty();
   }
}
