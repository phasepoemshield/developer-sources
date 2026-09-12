package Nursultan;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01463;
import minecraft.class01488;
import minecraft.class04453;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;

public class class09678 {
   public static class09674 N;
   private static class06202 L;
   private static class05096 u;
   private static class09670 i;
   private static boolean R;
   private static class06937 M;
   private static double B;
   private static boolean Z;
   private static boolean z;
   private static boolean U;
   private static boolean E;

   public static boolean L(class05096 var0, double var1, double var3, class09690 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         class06937 var6 = i.N(var1, var3);
         if (var6 == M) {
            return false;
         } else {
            class06584 var7 = ((class07482)((class04453)L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
            if (z && var5 == class09690.RIGHT && !U) {
               U = true;
               i.u();
               N(M, var7);
            }

            M = var6;
            if (var6 == null) {
               return false;
            } else if (i.y(var6)) {
               return false;
            } else {
               if (var5 == class09690.LEFT) {
                  if (!Z) {
                     return false;
                  }

                  class06584 var8 = var6.i();
                  if (var8.R()) {
                     return false;
                  }

                  boolean var9 = class04655.N(L.Nt(), 340) || class04655.N(L.Nt(), 344);
                  if (var7.R()) {
                     if (!N.L || !var9) {
                        return false;
                     }

                     i.N(var6, class09690.LEFT, true);
                  } else {
                     if (!N.y) {
                        return false;
                     }

                     if (!N(var8, var7)) {
                        return false;
                     }

                     if (var9) {
                        i.N(var6, class09690.LEFT, true);
                     } else {
                        if (var7.c() + var8.c() > var7.U()) {
                           return false;
                        }

                        i.N(var6, class09690.LEFT, false);
                        if (!i.N(var6)) {
                           i.N(var6, class09690.LEFT, false);
                        }
                     }
                  }
               } else if (var5 == class09690.RIGHT) {
                  if (!z) {
                     return false;
                  }

                  N(var6, var7);
               }

               return false;
            }
         }
      }
   }

   public static boolean y(class05096 var0, double var1, double var3, class09690 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         if (var5 == class09690.LEFT) {
            Z = false;
         } else if (var5 == class09690.RIGHT) {
            z = false;
         }

         return false;
      }
   }

   private static class09670 y(class05096 var0) {
      if (var0 instanceof class09679) {
         return new class09680((class09679)var0);
      } else if (var0 instanceof class01488) {
         return new class09671((class01488)var0);
      } else {
         return var0 instanceof class01463 ? new class09669((class01463)var0) : null;
      }
   }

   public static boolean N(class05096 var0, double var1, double var3, double var5) {
      N(var0);
      if (i != null && !R && N.u) {
         class06937 var7 = i.N(var1, var3);
         if (var7 != null && !i.y(var7)) {
            class06584 var8 = var7.i();
            if (var8.B() instanceof class05462) {
               return false;
            } else {
               double var9 = N.M.N(var5);
               if (B != 0.0 && Math.signum(var9) != Math.signum(B)) {
                  B = 0.0;
               }

               B += var9;
               int var11 = (int)B;
               B -= (double)var11;
               if (var11 == 0) {
                  return true;
               } else {
                  List<class06937> var12 = i.L();
                  int var13 = Math.abs(var11);
                  boolean var14 = var11 < 0;
                  if (N.R.L() && N(var7, var12)) {
                     var14 = !var14;
                  }

                  if (N.R.y()) {
                     var14 = !var14;
                  }

                  if (var8.R()) {
                     return true;
                  } else {
                     class06584 var15 = ((class07482)((class04453)L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
                     if (i.N(var7)) {
                        if (!N(var8, var15)) {
                           return true;
                        } else {
                           if (var15.R()) {
                              if (!var14) {
                                 return true;
                              }

                              while (var13-- > 0) {
                                 List<class06937> var16 = N(var12, var7, var8.c(), true);
                                 if (var16 == null) {
                                    break;
                                 }

                                 i.N(var7, class09690.LEFT, false);

                                 for (int var26 = 0; var26 < var16.size(); var26++) {
                                    class06937 var28 = var16.get(var26);
                                    if (var26 == var16.size() - 1) {
                                       i.N(var28, class09690.LEFT, false);
                                    } else {
                                       int var31 = var28.b_(var28.i()) - var28.i().c();

                                       while (var31-- > 0) {
                                          i.N(var28, class09690.RIGHT, false);
                                       }
                                    }
                                 }
                              }
                           } else {
                              while (var13-- > 0) {
                                 i.N(var7, class09690.LEFT, false);
                              }
                           }

                           return true;
                        }
                     } else if (!var15.R() && N(var8, var15)) {
                        return true;
                     } else if (var14) {
                        if (!var15.R() && !var7.N(var15)) {
                           return true;
                        } else {
                           var13 = Math.min(var13, var8.c());
                           List<class06937> var16 = N(var12, var7, var13, false);
                           if (!y && var16 == null) {
                              throw new AssertionError();
                           } else if (var16.isEmpty()) {
                              return true;
                           } else {
                              i.N(var7, class09690.LEFT, false);

                              for (class06937 var27 : var16) {
                                 int var29 = var27.b_(var27.i()) - var27.i().c();
                                 var29 = Math.min(var29, var13);
                                 var13 -= var29;

                                 while (var29-- > 0) {
                                    i.N(var27, class09690.RIGHT, false);
                                 }
                              }

                              i.N(var7, class09690.LEFT, false);
                              return true;
                           }
                        }
                     } else {
                        int var16 = var7.b_(var8) - var8.c();
                        var13 = Math.min(var13, var16);

                        while (var13 > 0) {
                           class06937 var17 = N(var12, var7);
                           if (var17 == null) {
                              break;
                           }

                           int var18 = var17.i().c();
                           if (i.N(var17)) {
                              if (var16 < var18) {
                                 break;
                              }

                              var16 -= var18;
                              var13 = Math.min(var13 - 1, var16);
                              if (!var15.R() && !var7.N(var15)) {
                                 break;
                              }

                              i.N(var7, class09690.LEFT, false);
                              i.N(var17, class09690.LEFT, false);
                              i.N(var7, class09690.LEFT, false);
                           } else {
                              int var19 = Math.min(var13, var18);
                              var16 -= var19;
                              var13 -= var19;
                              if (!var15.R() && !var17.N(var15)) {
                                 break;
                              }

                              i.N(var17, class09690.LEFT, false);
                              if (var19 == var18) {
                                 i.N(var7, class09690.LEFT, false);
                              } else {
                                 for (int var20 = 0; var20 < var19; var20++) {
                                    i.N(var7, class09690.RIGHT, false);
                                 }
                              }

                              i.N(var17, class09690.LEFT, false);
                           }
                        }

                        return true;
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean N(class06584 var0, class06584 var1) {
      return var0.R() || var1.R() || class06584.y(var0, var1) && class06584.L(var0, var1);
   }

   private static class06937 N(List<class06937> var0, class06937 var1) {
      int var2;
      int var3;
      byte var4;
      if (N.i == class09684.FIRST_TO_LAST) {
         var2 = 0;
         var3 = var0.size();
         var4 = 1;
      } else {
         var2 = var0.size() - 1;
         var3 = -1;
         var4 = -1;
      }

      class06584 var5 = var1.i();
      boolean var6 = var1.L != ((class04453)L.T_4).method_31548();

      for (int var7 = var2; var7 != var3; var7 += var4) {
         class06937 var8 = (class06937)var0.get(var7);
         if (!i.y(var8)) {
            boolean var9 = var8.L == ((class04453)L.T_4).method_31548();
            if (var6 == var9) {
               class06584 var10 = var8.i();
               if (!var10.R() && N(var5, var10)) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   private static List<class06937> N(List<class06937> var0, class06937 var1, int var2, boolean var3) {
      class06584 var4 = var1.i();
      boolean var5 = var1.L != ((class04453)L.T_4).method_31548();
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();

      for (int var8 = 0; var8 != var0.size() && var2 > 0; var8++) {
         class06937 var9 = (class06937)var0.get(var8);
         if (!i.y(var9)) {
            boolean var10 = var9.L == ((class04453)L.T_4).method_31548();
            if (var5 == var10 && !i.N(var9)) {
               class06584 var11 = var9.i();
               if (var11.R()) {
                  if (var9.N(var4)) {
                     var7.add(var9);
                  }
               } else if (N(var4, var11) && var11.c() < var9.b_(var11)) {
                  var6.add(var9);
                  var2 -= Math.min(var2, var9.b_(var11) - var11.c());
               }
            }
         }
      }

      for (int var12 = 0; var12 != var7.size() && var2 > 0; var12++) {
         class06937 var13 = (class06937)var7.get(var12);
         var6.add(var13);
         var2 -= Math.min(var2, var13.y());
      }

      return var3 && var2 > 0 ? null : var6;
   }

   public static boolean N(class05096 var0, double var1, double var3, class09690 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         M = i.N(var1, var3);
         class06584 var6 = ((class07482)((class04453)L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
         if (var5 == class09690.LEFT) {
            if (var6.R()) {
               Z = true;
            }
         } else if (var5 == class09690.RIGHT) {
            if (var6.R()) {
               return false;
            }

            if (!N.N) {
               return false;
            }

            z = true;
            U = false;
         }

         return false;
      }
   }

   private static void N(class06937 var0, class06584 var1) {
      if (var0 != null) {
         if (!var1.R()) {
            if (!i.y(var0)) {
               if (!i.N(var0)) {
                  if (!(var1.B() instanceof class05462)) {
                     class06584 var2 = var0.i();
                     if (!N(var2, var1)) {
                        return;
                     }

                     if (var2.c() == var0.b_(var2)) {
                        return;
                     }
                  }

                  i.N(var0, class09690.RIGHT, false);
               }
            }
         }
      }
   }

   private static void N(class05096 var0) {
      if (var0 != u) {
         u = var0;
         i = null;
         M = null;
         B = 0.0;
         Z = false;
         z = false;
         U = false;
         if (u != null) {
            class09673.y("You have just opened a " + u.getClass().getName() + ".");
            N.N();
            i = y(u);
            if (i == null) {
               class09673.y("No valid handler found; Mouse Tweaks is disabled.");
            } else {
               boolean var1 = i.N();
               R = i.y();
               class09673.y(
                  "Handler: "
                     + i.getClass().getSimpleName()
                     + "; Mouse Tweaks is "
                     + (var1 ? "disabled" : "enabled")
                     + "; wheel tweak is "
                     + (R ? "disabled" : "enabled")
                     + "."
               );
               if (var1) {
                  i = null;
               }
            }
         }
      }
   }

   public static void N() {
      class09673.N("Main.initialize()");
      if (!E) {
         L = class06202.Nq();
         N = new class09674(((File)L.l_1).getAbsolutePath() + File.separator + "config" + File.separator + "MouseTweaks.cfg");
         N.N();
         class09673.N("Initialized.");
         E = true;
      }
   }

   private static boolean N(class06937 var0, List<class06937> var1) {
      boolean var2 = var0.L == ((class04453)L.T_4).method_31548();
      int var3 = 0;
      int var4 = 0;

      for (class06937 var6 : var1) {
         if (var6.L == ((class04453)L.T_4).method_31548() != var2) {
            if (var6.R < var0.R) {
               var4++;
            } else {
               var3++;
            }
         }
      }

      return var4 > var3;
   }
}
