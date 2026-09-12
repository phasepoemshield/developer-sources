package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import java.time.Duration;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07089;
import minecraft.class07438;
import minecraft.class08893;

@class11761(
   u = "targetInfo",
   i = 200.0F,
   N = 40.0F
)
public class TargetInfoHud extends class11769 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object y_0;
   public static Object y_1;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object L_5;
   public static Object u_0;
   public static Object u_1;
   public static Object u_2;
   public static Object u_3;
   public static Object u_4;
   public static Object u_5;
   public static Object i_0;
   public static Object i_1;
   public static Object R_0;
   public static Object R_1;
   public static Object R_2;
   public static Object R_3;
   public static Object M_0;
   public static Object M_1;
   public static Object M_2;
   public static Object M_3;
   public static Object M_4;
   public static Object M_5;
   public static Object M_6;
   public static Object M_7;
   public static Object U_0;
   public static Object U_1;
   public static Object U_2;
   public static Object U_3;
   public static Object U_4;
   public static Object U_5;
   public static Object U_6;
   public static Object U_7;
   public static Object E_0;
   public static Object E_1;
   public static Object E_2;
   public static Object E_3;
   public static Object E_4;
   public static Object E_5;
   public static Object E_6;
   public static Object W_0;
   public static Object W_1;
   public static Object W_2;
   public static Object m_0;
   public static Object m_1;
   public static Object m_2;
   public static Object m_3;
   public static Object m_4;
   public static Object m_5;
   public static Object m_6;
   public static Object m_7;
   public static Object P_0;
   public static Object P_1;
   public static Object s_0;
   public static Object s_1;
   public static Object s_2;
   public static Object s_3;
   public static Object s_4;
   public static Object T_0;
   public static Object T_1;
   public static Object T_2;
   public static Object T_3;
   public static Object T_4;
   public static Object T_5;
   public static Object T_6;
   public static Object T_7;

   private static Integer w() {
      if ((class04453)((class06202)T_0).T_4 == null) {
         return -1;
      } else {
         class07438 var0 = k();
         return var0 != null ? var0.method_5628() : -1;
      }
   }

   private static class09798 L(class11745 var0) {
      return class09778.N((class09991)u_2, var1 -> {
         var1.N("targetInfoHpClip");
         if (var0.L()) {
            var1.y(u(var0));
         }

         var1.y(i(var0));
      });
   }

   private static class09798 K() {
      return class09778.N((class09991)R_2, var0 -> {
         var0.N("targetInfoHeadArea");
         var0.y(G());
      });
   }

   private static Boolean T() {
      return class11938.u().l().m().i();
   }

   private static boolean Q(String var0) {
      return class11938.i().N(var0, 14.0F, class09079.MEDIUM) > (float)((Integer)L_3).intValue();
   }

   private static void Q() {
   }

   public TargetInfoHud() {
      super(TargetInfoHud::N);
   }

   static {
      T_0 = class06202.Nq();
      T_1 = new class07085[]{
         class07085.field_6169, class07085.field_6174, class07085.field_6172, class07085.field_6166, class07085.field_6171, class07085.field_6173
      };
      T_2 = 32;
      T_3 = 6;
      T_4 = 38;
      T_5 = 3.0F;
      T_6 = 16;
      T_7 = 2;
      i_0 = 13;
      i_1 = 4;
      E_0 = 1;
      E_1 = 24;
      E_2 = 14;
      E_3 = 14;
      E_4 = class11300.L(16777215, 12.0F);
      E_5 = 58;
      E_6 = 1;
      W_0 = 14;
      W_1 = 2;
      W_2 = class11300.y(0, 0, 0, 255);
      s_0 = 58;
      s_1 = 20.0F;
      s_2 = class11300.L(16766976, 80.0F);
      s_3 = 106;
      s_4 = 132;
      L_0 = 249;
      L_1 = 119;
      L_2 = 119;
      L_3 = 95;
      L_4 = "targetInfoHeadCanvas";
      L_5 = "targetInfoRingCanvas";
      P_0 = "targetInfoNameCanvas";
      P_1 = "targetInfoWindow";
      U_0 = "targetInfoSlot";
      U_1 = Duration.ofMillis(180L);
      U_2 = Duration.ofMillis(180L);
      U_3 = 14;
      U_4 = 14.0F;
      N_0 = "targetInfoHealth";
      N_1 = "targetInfoAbsorption";
      N_2 = "targetInfoHpText";
      N_3 = null;

      U_5 = class11213.N((class09087)class09063.N_2, 4, 6);
      U_6 = class11213.N((class09087)class09063.N_2, 4, 6);

      U_7 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.y_0).N(4).N())
         .N((class11213)U_5)
         .N();

      R_0 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.y_1).N(4).N())
         .N((class11213)U_6)
         .N();

      class09991 var67 = class09991.N().N(class09962.y((float)((Integer)L_0).intValue()));
      R_1 = class09991.N((class09991)class11756.y_1, var67.y(class09962.y(58.0F)).N(class09975.ROW).y(class09973.CENTER));

      R_2 = class09991.N()
         .N(999)
         .N(class09962.N())
         .y(class09962.N(100.0F))
         .N(13.0F)
         .N(class09973.CENTER)
         .y(class09973.CENTER)
         .N(class09983.BORDER_BOX);

      R_3 = class09991.N((class09991)class09180.N_3, class09991.N().W(-1.0F));

      y_0 = class09991.N().N(999).u(32.0F, 32.0F);
      y_1 = class09991.N().N(class09962.N(100.0F)).y(class09962.N(100.0F));

      M_0 = class09991.N()
         .N(class09962.y(0.0F, Float.POSITIVE_INFINITY))
         .y(class09962.N(100.0F))
         .u(13.0F)
         .N(class09975.COLUMN)
         .B(4.0F)
         .y(class09973.CENTER)
         .N(class09983.BORDER_BOX);

      M_1 = class09991.N().N(class09962.N()).y(class09962.y(16.0F)).N(class09975.ROW).B(2.0F);
      M_2 = class09991.N().u(16.0F, 16.0F).N(class09973.CENTER).y(class09973.CENTER);
      M_3 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).u(16.0F, 16.0F);
      M_4 = class09991.N().N(class09969.FLOATING).N(1.0F, 13.0F).u(14.0F, 2.0F).y((Integer)W_2);
      M_5 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).R().N(class09973.END).y(class09973.END).i((Integer)class09181.N_0);
      M_6 = class09991.N().u(8.0F, 8.0F).i(-7171438);
      M_7 = class09991.N().u(32.0F, 32.0F).i((Integer)class09181.N_0);

      m_0 = class09991.N().t(8.0F).N(new class09838("minecraft", class09079.REGULAR.N()));
      class09991 var80 = class09991.N();
      m_1 = class09991.N((class09991)m_0, var80.i((Integer)class09181.N_0).N(1.0F, -16777216));
      class09991 var81 = class09991.N();
      m_2 = class09991.N(var81.i((Integer)class09181.N_0), class09221.N(14, class09079.MEDIUM));

      m_3 = class09991.N().u(58.0F, 58.0F).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX);
      m_4 = class09991.N().u(38.0F, 38.0F).N(class09973.CENTER).y(class09973.CENTER);
      m_5 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).N(class09962.N(100.0F)).y(class09962.N(100.0F));
      m_6 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).R().N(class09975.ROW).y(class09973.CENTER).M();
      m_7 = class09991.N().N(class09962.y(1.0F)).y(class09962.N(100.0F));

      u_0 = class09991.N().N(class09962.N()).y(class09962.y(16.0F));
      class09991 var88 = class09991.N();
      u_1 = class09991.N(var88.i((Integer)class09181.N_0), class09221.N(14, class09079.MEDIUM));
      u_2 = class09991.N().R().N(class09976.SELF).Z(999.0F);
      u_3 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).R().N(class09975.ROW).N(class09973.CENTER).y(class09973.CENTER);
      u_4 = class09991.N().y(class09962.N(100.0F));
      u_5 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).R().N(class09973.CENTER).y(class09973.CENTER);
   }

   private static Boolean I() {
      return class11938.u().x().m();
   }

   private static class09798 J() {
      return class09778.N((class09991)M_1, var0 -> {
         var0.N("targetInfoItems");

         for (int var1 = 0; var1 < ((class07085[])T_1).length; var1++) {
            class07085 var2 = ((class07085[])T_1)[var1];
            String var3 = "targetInfoSlot" + var1;
            class06584 var4 = ((class07438)N_3).method_6118(var2);
            var0.y(N(var3, var4));
         }
      });
   }

   private static class09798 i(class11745 var0) {
      String var1 = var0.z();
      float var2 = var0.E();
      boolean var3 = var0.L();
      float var4 = (float)var0.U() * 14.0F * (1.0F - var2);
      return class09778.N(var3 ? class09991.N((class09991)u_3, class09991.N().m(var4)) : (class09991)u_3, var5 -> {
         var5.N("targetInfoHpLine");

         for (int var6 = 0; var6 < var1.length(); var6++) {
            int var7 = var6;
            char var8 = var1.charAt(var7);
            String var9 = "targetInfoHpCell" + var7;
            float var10 = class11938.i().N(String.valueOf(var8), 14.0F, class09079.MEDIUM);
            class09991 var11 = class09991.N((class09991)u_4, class09991.N().N(class09962.y(var10)));
            boolean var12 = !var3 && var0.M(var7);
            float var13 = !var3 && !var12 ? 1.0F : var2;
            var5.N_3(var11, var8x -> {
               var8x.N(var9);
               if (var12) {
                  var8x.y(N(var9 + "-old", var0.W().charAt(var7), (float)(-var0.U()) * 14.0F * var2, 1.0F - var2));
               }

               var8x.y(N(var9 + "-cur", var8, var12 ? var4 : 0.0F, var13));
            });
         }
      });
   }

   private static Boolean b() {
      return class11938.u().l().s().i();
   }

   private static class09798 n() {
      String var0 = ((class07438)N_3).method_5477().getString();
      boolean var1 = Q(var0);
      return class09778.N((class09991)M_0, var2 -> {
         var2.N("targetInfoCenter");
         if (var1) {
            var2.N(var0xx -> var0xx.N("targetInfoNamePlaceholder").N(O()));
         } else {
            var2.y(var1xx -> var1xx.N("targetInfoName").L(var0).N((class09991)m_2));
         }

         var2.y(J());
      });
   }

   private static Long o() {
      return (class07438)N_3 == null
         ? -1L
         : (long)((class07438)N_3).method_5628() << 32 | (long)Float.floatToIntBits(((class07438)N_3).method_6032()) & 4294967295L;
   }

   private static class07438 k() {
      TargetEsp var0 = class11938.u().r();
      if (var0 != null && var0.m()) {
         return var0.P();
      } else if (class11753.y()) {
         return (class04453)((class06202)T_0).T_4;
      } else {
         if (class11938.u().l().P().i()) {
            class07089 var2 = class11892.N(
               (class04453)((class06202)T_0).T_4,
               class11505.L(),
               ((class04453)((class06202)T_0).T_4).method_55755(),
               false,
               class11791.N()
                  .and(var0x -> var0x instanceof class07438)
                  .and(var0x -> var0x.method_5864() != class07078.B)
                  .and(var0x -> !((class11783)var0x).dataManager().M().N())
            );
            if (var2 != null) {
               return (class07438)((class06145)var2).L();
            }
         }

         return null;
      }
   }

   private static Long v() {
      return (class07438)N_3 == null
         ? -1L
         : (long)((class07438)N_3).method_5628() << 32 | (long)Float.floatToIntBits(((class07438)N_3).method_6067()) & 4294967295L;
   }

   private static class09798 u(class11745 var0) {
      float var1 = var0.E();
      return class09778.N(class09991.N((class09991)u_3, class09991.N().m((float)(-var0.U()) * 14.0F * var1)), var2 -> {
         var2.N("targetInfoHpLineOld");
         var2.y(var2x -> var2x.N("targetInfoHpLineOldText").L(var0.W()).N(N(1.0F - var1)));
      });
   }

   @Override
   public boolean y() {
      return class11938.u().l().U();
   }

   private static void y(class09784 var0, String var1, class06584 var2) {
      int var3 = var2.c();
      if (var3 > 1) {
         String var4 = Integer.toString(var3);
         var0.N_3((class09991)M_5, var2x -> {
            var2x.N(var1 + "-count");
            var2x.y(var2xx -> var2xx.N(var1 + "-count-text").L(var4).N((class09991)m_1));
         });
      }
   }

   private static class09798 y(class11745 var0) {
      return class09778.N((class09991)m_4, var1 -> {
         var1.N("targetInfoRing");
         var1.y(L(var0));
      });
   }

   private static class09798 N(class09211 var0, float var1, float var2) {
      int var3 = var0.M();
      boolean var4 = N((class07438)N_3) != null;
      String var5 = ((class07438)N_3).method_5477().getString();
      boolean var6 = Q(var5);
      return class09778.N(
         (class09991)m_6,
         var6x -> {
            var6x.N("targetInfoCanvasOverlay");
            var6x.N_3(
               (class09991)R_2,
               var1xx -> {
                  var1xx.N("targetInfoHeadCanvasArea");
                  var1xx.N_3(
                     (class09991)y_0,
                     var1xxx -> {
                        var1xxx.N("targetInfoHeadCanvasBox");
                        if (var4) {
                           var1xxx.y(
                              class09778.R()
                                 .N("targetInfoHeadCanvas")
                                 .N((class09991)y_1)
                                 .y(var0xxxx -> N(var0xxxx.N(), var0xxxx.y(), var0xxxx.L(), var0xxxx.u()))
                                 .i()
                           );
                        }
                     }
                  );
               }
            );
            var6x.N(var0xx -> var0xx.N("targetInfoDividerSpacer").N((class09991)m_7));
            var6x.N_3((class09991)M_0, var2xx -> {
               var2xx.N("targetInfoCenterCanvasCol");
               if (var6) {
                  var2xx.y(class09778.R().N("targetInfoNameCanvas").N(O()).y(var1xxx -> N(var5, var1xxx.N(), var1xxx.y(), var1xxx.L(), var1xxx.u())).i());
                  var2xx.N(var0xxx -> var0xxx.N("targetInfoItemsSpacer").N((class09991)u_0));
               }
            });
            var6x.N_3(
               (class09991)m_3,
               var3xx -> {
                  var3xx.N("targetInfoRingCanvasArea");
                  var3xx.N_3(
                     (class09991)m_4,
                     var3xxx -> {
                        var3xxx.N("targetInfoRingCanvasBox");
                        var3xxx.y(
                           class09778.R()
                              .N("targetInfoRingCanvas")
                              .N((class09991)m_5)
                              .y(var3xxxx -> N(var3xxxx.N(), var3xxxx.y(), var3xxxx.L(), var3xxxx.u(), var3, var1, var2))
                              .i()
                        );
                     }
                  );
               }
            );
         }
      );
   }

   private static class01894 N(class07438 var0) {
      if (I()) {
         return null;
      } else if (var0 instanceof class04477) {
         class01631 var2 = ((class04477)var0).Z();
         return var2 != null ? var2.N().y() : null;
      } else {
         return null;
      }
   }

   private static class09991 N(float var0) {
      return var0 >= 1.0F ? (class09991)u_1 : class09991.N((class09991)u_1, class09991.N().i(class11300.u((Integer)class09181.N_0, var0)));
   }

   private static void N(class09784 var0, String var1, class06584 var2) {
      if (var2.m()) {
         int var3 = var2.s();
         if (var3 > 0) {
            float var4 = 1.0F - (float)var2.P() / (float)var3;
            int var5 = Math.max(0, Math.round(var4 * 14.0F));
            int var6 = class11300.N(var4);
            var0.N_3((class09991)M_4, var3x -> {
               var3x.N(var1 + "-damageBg");
               if (var5 > 0) {
                  class09991 var4x = class09991.N().u((float)var5, 1.0F).y(var6);
                  var3x.N(var2xx -> var2xx.N(var1 + "-damageBar").N(var4x));
               }
            });
         }
      }
   }

   @Override
   public boolean N() {
      if ((class04453)((class06202)T_0).T_4 == null) {
         N_3 = null;
         return false;
      } else {
         class07438 var1 = k();
         if (var1 != null) {
            N_3 = var1;
            return true;
         } else {
            return false;
         }
      }
   }

   private static void N(float var0, float var1, float var2, float var3, int var4, float var5, float var6) {
      if ((class07438)N_3 != null) {
         float var7 = 3.0F * (var2 / 38.0F);
         class11176.N((class11213)U_6, var0, var1, var2, var3, 0.0F, 0.0F, 1.0F, 1.0F, -1);
         ((class11174)R_0)
            .N(
               var6x -> {
                  var6x.z("u_projection").N(class11925.L());
                  var6x.z("u_view").N(RenderSystem.getModelViewMatrix());
                  var6x.R("u_size").N(var2, var3);
                  var6x.i("u_thickness").N(var7);
                  var6x.i("u_hp_progress").N(var5);
                  var6x.i("u_abs_progress").N(var6);
                  var6x.N("u_color")
                     .N(
                        (float)class11300.u(var4) / 255.0F,
                        (float)class11300.N(var4) / 255.0F,
                        (float)class11300.i(var4) / 255.0F,
                        (float)class11300.y(var4) / 255.0F
                     );
                  var6x.N("u_abs_color")
                     .N(
                        (float)class11300.u((Integer)s_2) / 255.0F,
                        (float)class11300.N((Integer)s_2) / 255.0F,
                        (float)class11300.i((Integer)s_2) / 255.0F,
                        (float)class11300.y((Integer)s_2) / 255.0F
                     );
                  var6x.N("u_track_color")
                     .N(
                        (float)class11300.u((Integer)E_4) / 255.0F,
                        (float)class11300.N((Integer)E_4) / 255.0F,
                        (float)class11300.i((Integer)E_4) / 255.0F,
                        (float)class11300.y((Integer)E_4) / 255.0F
                     );
               }
            );
      }
   }

   private static void N(float var0, float var1, float var2, float var3) {
      if ((class07438)N_3 != null) {
         class01894 var4 = N((class07438)N_3);
         if (var4 != null) {
            if (((class06202)T_0).NO().y(var4).method_68004() instanceof class08893 var6) {
               int var9 = var6.N();
               class11176.N((class11213)U_5, var0, var1, var2, var3, 0.0F, 0.0F, 1.0F, 1.0F, -1);
               float var8 = 6.0F * (var2 / 32.0F);
               ((class11174)U_7).N(var4x -> {
                  var4x.z("u_projection").N(class11925.L());
                  var4x.z("u_view").N(RenderSystem.getModelViewMatrix());
                  var4x.R("u_size").N(var2, var3);
                  var4x.i("u_radius").N(var8);
                  var4x.M("texture_in").N(var9);
               });
            }
         }
      }
   }

   private static class09798 N(String var0, class06584 var1) {
      return class09778.N((class09991)M_2, var2 -> {
         var2.N(var0);
         if (var1.R()) {
            var2.L(var1xx -> var1xx.N(var0 + "-x").L("icon:hud/x").N((class09991)M_6));
         } else {
            class11867 var3 = class11938.k().N(var1);
            if (var3.L()) {
               class09991 var4 = class09991.N((class09991)M_3, class09991.N().N(var3.y(), var3.N(), var3.R(), var3.i()));
               var2.L(var2x -> var2x.N(var0 + "-icon").L(class11938.k().y()).N(var4));
            }

            if (b()) {
               N(var2, var0, var1);
               y(var2, var0, var1);
            }
         }
      });
   }

   private static class09798 N(String var0, char var1, float var2, float var3) {
      return class09778.N(var2 == 0.0F ? (class09991)u_5 : class09991.N((class09991)u_5, class09991.N().m(var2)), var3x -> {
         var3x.N(var0);
         var3x.y(var3xx -> var3xx.N(var0 + "-text").L(String.valueOf(var1)).N(N(var3)));
      });
   }

   private static class09798 N(Void var0, class09809 var1) {
      class09211 var2 = var1.N((class09804<class09211>)class09211.N_6);
      var1.L("targetInfoTarget", TargetInfoHud::w);
      var1.L("targetInfoHealth", TargetInfoHud::o);
      var1.L("targetInfoArmorDetails", TargetInfoHud::b);
      var1.L("targetInfoAbsorption", TargetInfoHud::v);
      var1.L("targetInfoAbsorptionEnabled", TargetInfoHud::T);
      var1.L("targetInfoHideSkin", TargetInfoHud::I);
      if ((class07438)N_3 == null) {
         return class09778.N(var0x -> var0x.N("dummy").N((class09991)class11769.z_3));
      } else {
         float var3 = ((class07438)N_3).method_6032();
         float var4 = Math.max(((class07438)N_3).method_6063(), 1.0F);
         float var5 = class09693.N(var3 / var4);
         class11754 var6 = var1.u("targetInfoHealth", class11754::new);
         var6.N((class07438)N_3, var5);
         float var7 = var6.u();
         String var8 = var3 > ((class07438)N_3).method_6063() * 5.0F ? "?" : Integer.toString((int)Math.ceil((double)var3));
         class11745 var9 = var1.u("targetInfoHpText", class11745::new);
         var9.N((class07438)N_3, var8, var3);
         float var10 = T() ? ((class07438)N_3).method_6067() : 0.0F;
         class11754 var11 = var1.u("targetInfoAbsorption", class11754::new);
         var11.N((class07438)N_3, var10 / 20.0F);
         float var12 = var11.u();
         return class09778.N((class09991)R_1, var4x -> {
            var4x.N("targetInfoWindow");
            var4x.y(K());
            var4x.N(var0xx -> var0xx.N("targetInfoDivider").N((class09991)R_3));
            var4x.y(n());
            var4x.y(N(var9));
            var4x.y(N(var2, var7, var12));
         });
      }
   }

   private static class09798 N(class11745 var0) {
      return class09778.N((class09991)m_3, var1 -> {
         var1.N("targetInfoRingArea");
         var1.y(y(var0));
      });
   }

   private static void N(String var0, float var1, float var2, float var3, float var4) {
      class11617.N(
         var0,
         (Integer)class09181.N_0,
         14.0F,
         class09079.MEDIUM,
         (float)((Integer)L_1).intValue(),
         0.0F,
         (float)((Integer)L_3).intValue(),
         (float)((Integer)L_2).intValue(),
         var1,
         var2,
         var3,
         var4
      );
   }

   private static class09991 O() {
      float var0 = class11938.i().N(14.0F, class09079.MEDIUM);
      return class09991.N().N(class09962.y((float)((Integer)L_1).intValue())).y(class09962.y(var0));
   }

   private static class09798 G() {
      boolean var0 = N((class07438)N_3) != null;
      return class09778.N((class09991)y_0, var1 -> {
         var1.N("targetInfoHead");
         if (!var0) {
            var1.L(var0xx -> var0xx.N("targetInfoHeadIcon").L("icon:hud/target").N((class09991)M_7));
         }
      });
   }
}
