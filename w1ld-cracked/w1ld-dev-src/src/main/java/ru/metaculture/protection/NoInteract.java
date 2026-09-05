package ru.metaculture.protection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "NoInteract",
   C00OOC00oO = "Запрещает взаимодействие с выбранными блоками",
   uUnuvNvvNU = oOOOo0.Player
)
public class NoInteract extends Module {
   public static VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN(
      "Блоки",
      new vvNnnUNnVvn("Стойки для брони", true),
      new vvNnnUNnVvn("Сундуки", true),
      new vvNnnUNnVvn("Двери", true),
      new vvNnnUNnVvn("Кнопки", true),
      new vvNnnUNnVvn("Воронки", true),
      new vvNnnUNnVvn("Раздатчики", true),
      new vvNnnUNnVvn("Нотные блоки", true),
      new vvNnnUNnVvn("Верстаки", true),
      new vvNnnUNnVvn("Люки", true),
      new vvNnnUNnVvn("Печи", true),
      new vvNnnUNnVvn("Калитки", true),
      new vvNnnUNnVvn("Наковальни", true),
      new vvNnnUNnVvn("Шалкеры", true),
      new vvNnnUNnVvn("Эндер-сундуки", true),
      new vvNnnUNnVvn("Варочные стойки", true),
      new vvNnnUNnVvn("Столы зачарования", true),
      new vvNnnUNnVvn("Пюпитры", true),
      new vvNnnUNnVvn("Рабочие столы", true),
      new vvNnnUNnVvn("Кровати", false),
      new vvNnnUNnVvn("Нажимные плиты", false),
      new vvNnnUNnVvn("Медные лампы", false),
      new vvNnnUNnVvn("Редстоун", false),
      new vvNnnUNnVvn("Прочее", false)
   );

   public NoInteract() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv});
   }

   public static Set<class_2248> UuuNnUvUuv() {
      HashSet var0 = new HashSet();
      UuUVuuUu(var0, 2, class_2246.field_10034, class_2246.field_10380, class_2246.field_16328);
      UuUVuuUu(
         var0,
         3,
         class_2246.field_10149,
         class_2246.field_10521,
         class_2246.field_10352,
         class_2246.field_10627,
         class_2246.field_10232,
         class_2246.field_10403,
         class_2246.field_37566,
         class_2246.field_42748,
         class_2246.field_54729,
         class_2246.field_40291,
         class_2246.field_22102,
         class_2246.field_22103,
         class_2246.field_9973,
         class_2246.field_47040,
         class_2246.field_47041,
         class_2246.field_47043,
         class_2246.field_47042,
         class_2246.field_47044,
         class_2246.field_47045,
         class_2246.field_47047,
         class_2246.field_47046
      );
      UuUVuuUu(
         var0,
         4,
         class_2246.field_10057,
         class_2246.field_10066,
         class_2246.field_10417,
         class_2246.field_10553,
         class_2246.field_10278,
         class_2246.field_10493,
         class_2246.field_37559,
         class_2246.field_42743,
         class_2246.field_54724,
         class_2246.field_40286,
         class_2246.field_22100,
         class_2246.field_22101,
         class_2246.field_10494,
         class_2246.field_23864
      );
      UuUVuuUu(var0, 5, class_2246.field_10312);
      UuUVuuUu(var0, 6, class_2246.field_10200, class_2246.field_10228);
      UuUVuuUu(var0, 7, class_2246.field_10179);
      UuUVuuUu(var0, 8, class_2246.field_9980);
      UuUVuuUu(
         var0,
         9,
         class_2246.field_10137,
         class_2246.field_10323,
         class_2246.field_10486,
         class_2246.field_10017,
         class_2246.field_10608,
         class_2246.field_10246,
         class_2246.field_37555,
         class_2246.field_42740,
         class_2246.field_54723,
         class_2246.field_40285,
         class_2246.field_22094,
         class_2246.field_22095,
         class_2246.field_10453,
         class_2246.field_47048,
         class_2246.field_47049,
         class_2246.field_47051,
         class_2246.field_47050,
         class_2246.field_47052,
         class_2246.field_47053,
         class_2246.field_47063,
         class_2246.field_47062
      );
      UuUVuuUu(var0, 10, class_2246.field_10181, class_2246.field_16333, class_2246.field_16334);
      UuUVuuUu(
         var0,
         11,
         class_2246.field_10188,
         class_2246.field_10291,
         class_2246.field_10513,
         class_2246.field_10041,
         class_2246.field_10457,
         class_2246.field_10196,
         class_2246.field_37563,
         class_2246.field_42745,
         class_2246.field_54730,
         class_2246.field_40289,
         class_2246.field_22096,
         class_2246.field_22097
      );
      UuUVuuUu(var0, 12, class_2246.field_10535, class_2246.field_10105, class_2246.field_10414);
      UuUVuuUu(
         var0,
         13,
         class_2246.field_10603,
         class_2246.field_10199,
         class_2246.field_10407,
         class_2246.field_10063,
         class_2246.field_10203,
         class_2246.field_10600,
         class_2246.field_10275,
         class_2246.field_10051,
         class_2246.field_10140,
         class_2246.field_10320,
         class_2246.field_10532,
         class_2246.field_10268,
         class_2246.field_10605,
         class_2246.field_10373,
         class_2246.field_10055,
         class_2246.field_10068,
         class_2246.field_10371
      );
      UuUVuuUu(var0, 14, class_2246.field_10443);
      UuUVuuUu(var0, 15, class_2246.field_10333);
      UuUVuuUu(var0, 16, class_2246.field_10485);
      UuUVuuUu(var0, 17, class_2246.field_16330);
      UuUVuuUu(var0, 18, class_2246.field_16337, class_2246.field_10083, class_2246.field_16336, class_2246.field_16329, class_2246.field_16335);
      UuUVuuUu(
         var0,
         19,
         class_2246.field_10120,
         class_2246.field_10410,
         class_2246.field_10230,
         class_2246.field_10621,
         class_2246.field_10356,
         class_2246.field_10180,
         class_2246.field_10610,
         class_2246.field_10141,
         class_2246.field_10326,
         class_2246.field_10109,
         class_2246.field_10019,
         class_2246.field_10527,
         class_2246.field_10288,
         class_2246.field_10561,
         class_2246.field_10069,
         class_2246.field_10461
      );
      UuUVuuUu(
         var0,
         20,
         class_2246.field_10484,
         class_2246.field_10332,
         class_2246.field_10592,
         class_2246.field_10026,
         class_2246.field_10397,
         class_2246.field_10470,
         class_2246.field_37553,
         class_2246.field_42737,
         class_2246.field_54720,
         class_2246.field_40284,
         class_2246.field_22130,
         class_2246.field_22131,
         class_2246.field_10158,
         class_2246.field_23863,
         class_2246.field_10224,
         class_2246.field_10582
      );
      UuUVuuUu(
         var0,
         21,
         class_2246.field_47072,
         class_2246.field_47073,
         class_2246.field_47074,
         class_2246.field_47075,
         class_2246.field_47076,
         class_2246.field_47077,
         class_2246.field_47078,
         class_2246.field_47079
      );
      UuUVuuUu(var0, 22, class_2246.field_10450, class_2246.field_10377, class_2246.field_10429, class_2246.field_10363);
      UuUVuuUu(
         var0,
         23,
         class_2246.field_10223,
         class_2246.field_16332,
         class_2246.field_42752,
         class_2246.field_40276,
         class_2246.field_23152,
         class_2246.field_10183,
         class_2246.field_10495,
         class_2246.field_17350,
         class_2246.field_23860
      );
      return var0;
   }

   private static void UuUVuuUu(Set<class_2248> var0, int var1, class_2248... var2) {
      if (NVNnnvnuunNv.UuUVuuUu(var1 - 1)) {
         var0.addAll(Arrays.asList(var2));
      }
   }
}
