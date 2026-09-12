package Nursultan;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06197;
import minecraft.class06202;

public class class11727 {
   private static String[] G;
   private static String[] F;
   private static String[] Nz;
   public static Object N_0 = class09221.N(22, class09079.SEMI_BOLD);
   public static Object N_1 = class09991.N(class09991.N().i(-7171438), class09221.N(16, class09079.REGULAR));
   public static Object N_2;
   public static Object y_0 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(0.0F, 40.0F))
      .R(3.0F)
      .N(class09976.SELF)
      .N(class09692.N(class09994.W((class09743)class11644.N_0), class09994.M((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0)))
      .N(var0 -> var0.y(class09962.N(0.0F, 0.0F)).R(0.0F).l(0.0F))
      .y(var0 -> var0.y(class09962.N(0.0F, 0.0F)).R(0.0F).l(0.0F));
   public static Object y_1 = class09991.N(class09991.N().i(-7171438), class09221.N(12, class09079.REGULAR));
   public static Object y_2 = class09991.N(class09991.N().i(-7171438), class09221.N(18, class09079.REGULAR));
   public static Object y_3;
   public static Object y_4 = class09991.N().N(class09962.N()).y(class09962.N()).y(class09973.CENTER).B(8.0F).N(class09975.ROW);
   public static Object y_5 = class09991.N().N(class09962.N(100.0F)).y(class09962.y(66.0F)).y().y(class09973.CENTER);
   public static Object y_6 = class09991.N().N(class09962.N()).y(class09962.N()).B(8.0F).y(class09973.CENTER).N(class09975.ROW);
   public static Object y_7 = class09221.N(20, class09079.REGULAR);
   public static Object L_0 = class09991.N()
      .u(44.0F, 44.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F);
   public static Object L_1 = class09991.N().u(20.0F, 20.0F).i(-29813);
   public static Object L_2 = class09991.N()
      .u(44.0F, 44.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.y_1)
      .z(1.0F)
      .Z(8.0F);
   public static Object L_3 = class09991.N().u(20.0F, 20.0F);
   public static Object L_4 = class09991.N().u(20.0F, 20.0F).i(-7171438);
   public static Object L_5 = class09991.N()
      .N(class09969.FLOATING)
      .N(0.0F, 0.0F)
      .u(20.0F, 20.0F)
      .i(-10496)
      .N(class09692.N(class09994.s((class09743)class11644.N_0)));
   public static Object L_6 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.N())
      .N(1)
      .Z(12.0F)
      .z(1.0F)
      .M(1.0F)
      .N(class09983.BORDER_BOX)
      .N(class09975.COLUMN)
      .u((Integer)class09181.y_1)
      .y((Integer)class09181.y_0);
   public static Object L_7 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.N())
      .y(class09973.CENTER)
      .N(12.0F)
      .y()
      .N(class09983.BORDER_BOX)
      .N(new class09965(12.0F, 12.0F, 0.0F, 0.0F))
      .y((Integer)class09181.y_3);
   public static Object u_0 = ((class11727)class11727.B_0)::N;
   public static Object u_1 = ((class11727)class11727.B_0)::y;
   public static Object u_2 = new HashMap();
   public static Object u_3 = new HashSet();
   public static Object i_0;
   public static Object i_1 = (Integer)class09181.N_0;
   public static Object i_2 = class09992.N(F[3]);
   public static Object i_3 = class09991.N().N(class09962.N()).y(class09962.N()).y(class09973.CENTER).B(12.0F).N(class09975.ROW);
   public static Object i_4 = class09991.N().u(20.0F, 20.0F).N(class09973.CENTER).y(class09973.CENTER);
   public static Object i_5 = class09991.N()
      .u(20.0F, 20.0F)
      .N((class09992)i_2)
      .i(-7171438)
      .l(0.0F)
      .N(class09692.N(class09994.L((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0)));
   public static Object i_6 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.N())
      .N(9.0F)
      .R(8.0F)
      .M(8.0F)
      .N(class09983.BORDER_BOX)
      .y(class09973.CENTER)
      .y();
   public static Object i_7 = class09991.N().N(class09962.N()).y(class09962.N()).y(class09973.CENTER).B(8.0F).N(class09975.ROW);
   public static Object R_0;
   public static Object R_1;
   public static Object R_2 = DateTimeFormatter.ofPattern(F[2]);
   public static Object R_3;
   public static Object R_4;
   public static Object R_5;
   public static Object R_6;
   public static Object R_7;
   public static Object M_0;
   public static Object M_1;
   public static Object M_2;
   public static Object M_3;
   public static Object M_4;
   public static Object B_0 = new class11727();
   public static Object B_1 = ((class11727)B_0)::N;
   public static Object Z_0 = class09991.N().N(class09962.y(38.0F)).y(class09962.y(32.0F)).N(class09973.END);
   public static Object Z_1 = class09991.N().u(32.0F, 32.0F);
   public static Object Z_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.N(100.0F));
   public static Object Z_3 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09975.COLUMN);
   public static Object Z_4 = class09991.N().N(class09962.N()).y(class09962.N()).y(class09973.CENTER).B(4.0F).N(class09975.ROW);
   public static Object Z_5;
   public static Object Z_6;
   public static Object z_0 = class09991.N(class09991.N().i(-7171438), class09221.N(14, class09079.REGULAR));
   public static Object U_0;
   public static Object U_1;
   public static Object U_2;
   public static Object U_3;
   public static Object U_4 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.N())
      .M(20.0F)
      .N(
         class09692.N(
            class09994.W((class09743)class11644.N_0),
            class09994.M((class09743)class11644.N_0),
            class09994.s((class09743)class11644.N_0),
            class09994.Z((class09743)class11644.N_0)
         )
      )
      .y(var0 -> var0.y(class09962.N(0.0F, 0.0F)).M(0.0F).l(0.0F).W(-480.0F));
   public static Object U_5 = class09991.N()
      .N(class09969.FLOATING)
      .R()
      .N(class09973.END)
      .y(class09973.CENTER)
      .N(0)
      .N(class09975.ROW)
      .l(1.0F)
      .N(class09692.N(class09994.s((class09743)class11644.N_0)))
      .N(var0 -> var0.l(0.0F))
      .y(var0 -> var0.l(0.0F));
   public static Object U_6 = class09991.N()
      .u(44.0F, 44.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX)
      .y((Integer)class09181.y_0)
      .u(-29813)
      .z(1.0F)
      .Z(8.0F);

   private static boolean L() {
      class06202 var0 = class06202.Nq();
      return var0 != null && !var0.Ny().u().isEmpty();
   }

   private static void M(class09250 var0) {
      class11054.N(var0.R());
      class11491 var1 = class11938.M().N(class11491.class);
      if (var0.R().equals(var1.y())) {
         var1.N(null);
         class11519.y(class11491.class);
      }

      class11938.s().N(var0.R());
   }

   private static void M() {
   }

   private class11727() {
   }

   static {
      i();
      M();
      y();
      u();
      Z();
      R();
      N();
      B();
      Objects.requireNonNull(B_0);
      Objects.requireNonNull(B_0);
      Objects.requireNonNull(B_0);
      class09991 var105 = class09991.N();
      y_3 = class09991.N(var105.i((Integer)class09181.N_0), class09221.N(18, class09079.REGULAR));
   }

   private static void B() {
      R_0 = false;
      R_1 = 0.0F;
      R_3 = 300L;
      R_4 = 9;
      R_5 = 1;
      R_6 = 0;
      R_7 = 44;
      M_0 = 20;
      M_1 = 64;
      M_2 = -29813;
      M_3 = 480;
      M_4 = 256.0F;
      U_0 = 110.0F;
      U_1 = 2.0F;
      U_2 = -10496;
      U_3 = 20;
      N_2 = 20;
      i_0 = 12;
      i_1 = 0;
      Z_5 = 3;
      Z_6 = 40.0F;
   }

   private static void Z() {
   }

   private static void i() {
   }

   private static void z(class09250 var0) {
      if (!u(var0)) {
         class06202 var1 = class06202.Nq();
         if (var1 != null && ((class03448)var1.T_3 != null || (class04453)var1.T_4 != null || var1.NE() != null)) {
            class11054.N(var0);
         } else {
            class11054.y();
            class11938.M().N(class11491.class).N(var0.R());
            class11519.y(class11491.class);
            class09303.N(var0);
         }
      }
   }

   private static void u() {
   }

   private static boolean u(class09250 var0) {
      class06202 var1 = class06202.Nq();
      return var1 != null && var0.u().equals(var1.Ny().L());
   }

   private static String y(long var0) {
      return LocalDateTime.ofInstant(Instant.ofEpochMilli(var0), ZoneId.systemDefault()).format((DateTimeFormatter)R_2);
   }

   private static class09798 y(class09250 var0) {
      return class09778.N(class09991.N((class09991)i_4, class09991.N().N((class09992)i_2, var0x -> var0x.i((Integer)i_1))), var1 -> {
         var1.N("accountCopy:" + var0.R());
         var1.N(class09867.POINTER_DOWN, class09860::T);
         var1.N_1(var1x -> {
            ((class06197)class06202.Nq().L_3).N(var0.u());
            var1x.T();
         });
         var1.L(var0xx -> var0xx.L(Nz[5]).N((class09991)i_5));
      });
   }

   private static void y() {
   }

   private class09798 y(class09250 var1, class09809 var2) {
      boolean var3 = var1.y();
      class09991 var4 = class09991.N((class09991)L_5, class09991.N().l(var3 ? 1.0F : 0.0F));
      return class09778.N((class09991)L_2, var2x -> {
         var2x.N("accountFavorite:" + var1.R());
         var2x.N(class09867.POINTER_DOWN, class09860::T);
         var2x.N_1(var1xx -> {
            class11938.s().y(var1.R());
            var1xx.T();
         });
         var2x.N_3((class09991)L_3, var1xx -> {
            var1xx.L(var0xx -> var0xx.L(Nz[3]).N((class09991)L_4));
            var1xx.L(var1xxx -> var1xxx.L(Nz[2]).N(var4));
         });
      });
   }

   private class09798 N(class11757 var1, class09809 var2) {
      class09250 var3 = var1.N();
      class09211 var4 = var2.N((class09804<class09211>)class09211.N_6);
      int var5 = u(var3) ? var4.M() : -7171438;
      class09991 var6 = class09991.N((class09991)N_0, class09991.N().i(var5));
      class11487 var7 = var2.L("accountStatus:" + var3.R(), () -> class11723.y(var3.R()));
      class09785 var8 = var2.N("accountClick:" + var3.R(), 0L);
      class09785 var9 = var2.y(G[0], (UUID)null);
      boolean var10 = var3.R().equals(var9.L());
      boolean var11 = var2.L("accountLoginPending:" + var3.R(), () -> class11054.y(var3.R()));
      boolean var12 = N(var3.R());
      class09785 var13 = var2.N("accountEntering:" + var3.R(), false);
      if (var12) {
         var13.N(true);
      }

      boolean var14 = var12 || (Boolean)var13.L() || var10;
      class09991 var15 = class09991.N(
         (class09991)L_6,
         class09991.N().N((class09992)i_2, var0 -> var0.l(1.0F)).W(var10 ? -64.0F : 0.0F).L(var10).N(class09692.N(class09994.Z((class09728)class11644.N_0)))
      );
      class09793 var16 = ((Map)u_2).computeIfAbsent(var3.R(), var0 -> new class09793());
      class09785 var17 = var2.N("accountHeight:" + var3.R(), 0.0F);
      float var18 = var16.N() != null ? ((class09904)var16.N()).c().i() : 0.0F;
      if (var18 > 0.0F && Math.abs(var18 - (Float)var17.L()) > 0.5F) {
         var17.N(var18);
      }

      float var19 = (Float)var17.L();
      if (var19 > 0.0F) {
         R_1 = var19;
      }

      float var20 = var19 > 0.0F ? var19 : ((Float)R_1 > 0.0F ? (Float)R_1 : 256.0F);
      float var21 = var19 > 0.0F ? var19 : ((Float)R_1 > 0.0F ? (Float)R_1 : 110.0F);
      float var22 = var20 + 2.0F;
      class09991 var23 = class09991.N((class09991)U_4, class09991.N().y(class09962.N(0.0F, var22)).N(var14 ? 0 : 1));
      if (var12) {
         var23 = class09991.N(var23, class09991.N().N(var1x -> var1x.y(class09962.N(0.0F, 0.0F)).M(0.0F).l(0.0F).m(-2.0F * var21)));
      }

      return class09778.N(
         var23,
         var12x -> {
            var12x.N("accountWrapper:" + var3.R());
            var12x.N(class09867.TRANSITION_END, var1xx -> {
               if (var1xx instanceof class09842 && ((class09842)var1xx).N() == class09736.VISUAL_TRANSLATE_Y) {
                  var13.N(false);
               }
            });
            if (var10) {
               var12x.N_3((class09991)U_5, var2xx -> {
                  var2xx.N("accountDeleteLayer:" + var3.R());
                  var2xx.N(class09867.POINTER_DOWN, class09860::T);
                  var2xx.N_1(var1xxx -> {
                     var9.N(null);
                     var1xxx.T();
                  });
                  var2xx.N_3((class09991)U_6, var2xxx -> {
                     var2xxx.N("accountDeleteConfirm:" + var3.R());
                     var2xxx.N(class09867.POINTER_DOWN, class09860::T);
                     var2xxx.N_1(var2xxxx -> {
                        var9.N(null);
                        M(var3);
                        var2xxxx.T();
                     });
                     var2xxx.L(var0xxx -> var0xxx.L(F[1]).N((class09991)L_1));
                  });
               });
            }

            var12x.N_3(
               var15,
               var9xx -> {
                  var9xx.N("accountCard:" + var3.R());
                  var9xx.N(var16);
                  var9xx.N(class09867.POINTER_DOWN, class09860::T);
                  var9xx.N(class09867.CLICK, var3xxx -> {
                     if (var9.L() != null) {
                        var9.N(null);
                        var3xxx.T();
                     } else {
                        long var4xxx = System.currentTimeMillis();
                        if (var4xxx - (Long)var8.L() <= 300L) {
                           var8.N(0L);
                           z(var3);
                        } else {
                           var8.N(var4xxx);
                        }

                        var3xxx.T();
                     }
                  });
                  var9xx.N_3((class09991)L_7, var2xxx -> {
                     var2xxx.N_3((class09991)i_3, var2xxxx -> {
                        var2xxxx.N(N(var3), var6);
                        var2xxxx.y(y(var3));
                     });
                     var2xxx.N(class12020.N(var3.L().N()), (class09991)N_1);
                  });
                  var9xx.y((class09991)class09180.N_2);
                  var9xx.N_3(
                     (class09991)i_6,
                     var6xxx -> {
                        var6xxx.N_3(
                           (class09991)i_7,
                           var3xxxx -> {
                              var3xxxx.N_3(
                                 (class09991)Z_0,
                                 var1xxxxx -> var1xxxxx.N_3(
                                       (class09991)Z_1,
                                       var1xxxxxx -> var1xxxxxx.y(
                                             class09778.R()
                                                .N("accountHead:" + var3.R())
                                                .N((class09991)Z_2)
                                                .y(
                                                   var1xxxxxxx -> class11767.N(
                                                         var3.N(), var3.u(), var1xxxxxxx.N(), var1xxxxxxx.y(), var1xxxxxxx.L(), var1xxxxxxx.u()
                                                      )
                                                )
                                                .i()
                                          )
                                    )
                              );
                              var3xxxx.N_3((class09991)Z_3, var3xxxxx -> {
                                 var3xxxxx.N_3((class09991)Z_4, var1xxxxxx -> {
                                    var1xxxxxx.N(class12020.N(F[0]), (class09991)y_2);
                                    var1xxxxxx.N(y(var3.M()), (class09991)y_3);
                                 });
                                 String var4xxxx = N(var11, var7);
                                 if (var4xxxx != null) {
                                    var3xxxxx.N_3((class09991)y_0, var2xxxxxx -> {
                                       var2xxxxxx.N("accountPending:" + var3.R());
                                       var2xxxxxx.N(var4xxxx, (class09991)y_1);
                                    });
                                 }
                              });
                           }
                        );
                        var6xxx.N_3((class09991)y_4, var4xxxx -> {
                           var4xxxx.y(var2.N(Nz[6], (class09788<class09250>)u_1, var3));
                           var4xxxx.y(N(var3, var9));
                           var4xxxx.y(var2.N(Nz[7], (class09788<class11837>)class11600.N_0, N(var3, var4)));
                        });
                     }
                  );
               }
            );
         }
      );
   }

   private static class09798 N(class09250 var0, class09785<UUID> var1) {
      return class09778.N((class09991)L_0, var2 -> {
         var2.N("accountDeleteRequest:" + var0.R());
         var2.N(class09867.POINTER_DOWN, class09860::T);
         var2.N_1(var2x -> {
            var1.N(var0.R());
            var2x.T();
         });
         var2.L(var0xx -> var0xx.L(Nz[4]).N((class09991)L_1));
      });
   }

   private class09798 N(class09250 var1, class09809 var2) {
      class09211 var3 = var2.N((class09804<class09211>)class09211.N_6);
      int var4 = u(var1) ? var3.M() : -7171438;
      class09991 var5 = class09991.N((class09991)y_7, class09991.N().i(var4));
      String var6 = class12020.N(var1.L().N());
      return class09778.N((class09991)y_5, var5x -> {
         var5x.N("accountSearch:" + var1.R());
         var5x.N(class09867.POINTER_DOWN, class09860::T);
         var5x.N_3((class09991)y_6, var3xx -> {
            var3xx.N(N(var1), var5);
            var3xx.N(var6, (class09991)z_0);
         });
         var5x.N_3((class09991)y_4, var3xx -> {
            var3xx.y(var2.N(G[6], (class09788<class09250>)u_1, var1));
            var3xx.y(var2.N(Nz[0], (class09788<class11837>)class11600.N_0, R(var1)));
            var3xx.y(var2.N(Nz[1], (class09788<class11837>)class11600.N_0, N(var1, var3)));
         });
      });
   }

   public static void N(Set<UUID> var0) {
      ((Map)u_2).keySet().retainAll(var0);
   }

   private static class11837 N(class09250 var0, class09211 var1) {
      boolean var2 = u(var0);
      return new class11837(G[1], var2 ? -7171438 : var1.M(), class12020.N(G[2]), () -> z(var0), var2);
   }

   private static String N(class09250 var0) {
      return var0.L() == class09054.MICROSOFT && u(var0) && !L() ? "* " + var0.u() : var0.u();
   }

   private static boolean N(UUID var0) {
      if (!(Boolean)R_0) {
         R_0 = true;
         class11938.s().u().forEach(var0x -> ((Set)u_3).add(var0x.R()));
      }

      return ((Set)u_3).add(var0);
   }

   private static void N() {
      G = new String[7];
      G[0] = "nursultan:accountDeleting";
      G[1] = "icon:menu/run";
      G[2] = "account.login";
      G[3] = "icon:menu/delete";
      G[4] = "account.item.pending";
      G[5] = ". ";
      G[6] = "favorite";
      Nz = new String[8];
      Nz[0] = "delete";
      Nz[1] = "login";
      Nz[2] = "icon:menu/star-filled";
      Nz[3] = "icon:menu/star";
      Nz[4] = "icon:menu/delete";
      Nz[5] = "icon:menu/copy";
      Nz[6] = "favorite";
      Nz[7] = "login";
      F = new String[4];
      F[0] = "account.item.created";
      F[1] = "icon:menu/delete";
      F[2] = "HH:mm dd.MM.yy";
      F[3] = "account.copy.icon";
   }

   private static String N(boolean var0, class11487 var1) {
      ArrayList var2 = new ArrayList(2);
      if (var0) {
         var2.add(class12020.N(G[4]));
      }

      if (var1.N() != class09177.staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_0) {
         var2.add(class12020.N(var1.y()));
      }

      return var2.isEmpty() ? null : String.join(G[5], var2);
   }

   private static void R() {
   }

   private static class11837 R(class09250 var0) {
      return new class11837(G[3], -29813, () -> M(var0));
   }
}
