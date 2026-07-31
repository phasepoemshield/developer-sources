package l;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.text.Text;

public class Helper13 {
   public Helper13() {
   }

   public static List<Helper465> method362() {
      ArrayList var0 = new ArrayList();
      List var1 = List.of(Text.literal("Звериная дикая мощь"), Text.literal("Обостряет реакции,"), Text.literal("Укрепляя ваше тело."));
      var0.add(
         method363(
            "[★] Сфера Бестии",
            "9d1ee31a-65ad-4d5c-850e-b8dda3875e1e",
            "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTEwODQzNywKICAicHJvZmlsZUlkIiA6ICIzMjNiYjlkYzkwZWU0Nzk5YjUxYzE3NjRmZDRhNjI3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOcGllIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0ZmZlM2YzNThmMjA5YmFkOGZmZjRkYzQ4MjQ1ZDliYWYwYTAzMWIzYzFlZTZiNzU4NDYwYTMzOWIxNTE5ZTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
            Helper452.method4834("Сфера Бестии"),
            var1
         )
      );
      List var2 = List.of(Text.literal("Хаос искажает реальность,"), Text.literal("Усиливая ваш натиск,"), Text.literal("Ценой жизненых сил."));
      var0.add(
         method363(
            "[★] Сфера Хаоса",
            "812d254a-5d3b-41b6-93f8-bd8b08a0c07c",
            "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTY2NTExNCwKICAicHJvZmlsZUlkIiA6ICJkNzJlNGJjZDIyZGI0NjQ4OTUxNTc0M2UyYTRmMWFjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJhdnZheSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZTUxZTY1ZWI0MDUyNzcyMzgyYzllNTA3YTU0YmRlZDQzZTM5Zjc1NWI1ZGRmNTViM2YzOTQ0M2NlZDQ2N2Y0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
            Helper452.method4834("Сфера Хаоса"),
            var2
         )
      );
      List var3 = List.of(Text.literal("Шёпот Сатира звучит,"), Text.literal("Ускоряя расправу,"), Text.literal("Но сковывая прыжок."));
      var0.add(
         method363(
            "[★] Сфера Сатир",
            "478bd194-bd00-4c33-b3df-31115657f9a3",
            "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjYyNTM0NywKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZXZlMjQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQxMTdiNjAxOGZlZjBkNTE1NjcyMTczZTNiMjZlNjYwZDY1MWU1ODc2YmE2ZDAzZTUzNDIyNzBjNDliZWM4MCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
            Helper452.method4834("Сфера Сатир"),
            var3
         )
      );
      List var4 = List.of(Text.literal("Дух Ареса пылает внутри,"), Text.literal("Даруя мощь в атаке,"), Text.literal("Но требует жертв"));
      var0.add(
         method363(
            "[★] Сфера Арес",
            "89e3c3fb-65c0-4960-964a-62416b1b3f14",
            "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTA2MjQwNywKICAicHJvZmlsZUlkIiA6ICJlMzcxMWU2Y2E0ZmY0NzA4YjY5ZjhiNGZlYzNhZjdhMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNckJ1cnN0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFhNWFhZGQ1MmE1ZmFiOTcwODgxNDUxYWRmNTZmYmI0OTNhMzU4NTZlYTk2ZjU0ZTMyZWVhNjYyZDc4N2VkMjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
            Helper452.method4834("Сфера Арес"),
            var4
         )
      );
      List var5 = List.of(Text.literal("Живучесть темных глубин"), Text.literal("Оберегает хозяина,"), Text.literal("Даруя силы в воде"));
      var0.add(
         method363(
            "[★] Сфера Гидра",
            "5053c3bc-dda9-437f-8caf-e8517e0154ba",
            "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjY2Mzg3NiwKICAicHJvZmlsZUlkIiA6ICI3NGEwMzQxNWY1OTI0ZTA4YjMyMGM2MmU1NGE3ZjJhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZXp6aXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDgxMzYzNWJkODZiMTcxYmJlMTQzYWQ3MWUwOTAyMjkyNjQ5Y2IzYWI4NDQwZWQwMGY4NWNhNmNhMzgyOTkzNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
            Helper452.method4834("Сфера Гидра"),
            var5
         )
      );
      List var6 = List.of(Text.literal("Хранит волю Икара,"), Text.literal("Превращая риск в силу,"), Text.literal("А ярость — в удар"));
      var0.add(
         method363(
            "[★] Сфера Икар",
            "8ac3951d-c8f9-463c-be7a-f29b558f6376",
            "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NjE4MTEwOSwKICAicHJvZmlsZUlkIiA6ICJiNzRiMGQzNTBkNTk0NTU4YmYyYjBlMDJlYmE4NjE4NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJCcmFuZG9uYnBtMjg0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlmYWJlZWQ0MjRiMjUyYTg5NDVhNjQ0MmI0NjJkNWYzMTQ3MDFhODE2ZGEyZDBhNjljY2RmY2ZkNzQ2ZTU4OGUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
            Helper452.method4834("Сфера Икар"),
            var6
         )
      );
      List var7 = List.of(Text.literal("Мощь Титанов крепка,"), Text.literal("Дарует стойкость стали,"), Text.literal("Но тяжелит шаг."));
      var0.add(
         method363(
            "[★] Сфера Титан",
            "05c21710-125c-4738-a102-2e1a4cd577e1",
            "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM1NDQ1NTE5MiwKICAicHJvZmlsZUlkIiA6ICJkOTcwYzEzZTM4YWI0NzlhOTY1OGM1ZDQ1MjZkMTM0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmltcHlMYWNlODUxMjciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODFlOTY5ODQ1OGI3ODQxYzk2YWU0ZjI0ZWM4NGFlMDE3MjQxMDA2NDFjNTY0ZTJhN2IxODVmNDA2ZThlZDIzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
            Helper452.method4834("Сфера Титан"),
            var7
         )
      );
      List var8 = List.of(Text.literal("Холод Эрида вечен,"), Text.literal("Приносит удачу в бою,"), Text.literal("Укрепляя дух и тело."));
      var0.add(
         method363(
            "[★] Сфера Эрид",
            "812d254a-5d3b-41b6-93f8-bd8b08a0c07c",
            "ewogICJ0aW1lc3RhbXAiIDogMTcxNzM2NTY2NTExNCwKICAicHJvZmlsZUlkIiA6ICJkNzJlNGJjZDIyZGI0NjQ4OTUxNTc0M2UyYTRmMWFjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJhdnZheSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZTUxZTY1ZWI0MDUyNzcyMzgyYzllNTA3YTU0YmRlZDQzZTM5Zjc1NWI1ZGRmNTViM2YzOTQ0M2NlZDQ2N2Y0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=",
            Helper452.method4834("Сфера Эрид"),
            var8
         )
      );
      return var0;
   }

   private static Helper465 method363(String var0, String var1, String var2, int var3, List<Text> var4) {
      NbtCompound var5 = new NbtCompound();
      var5.putBoolean("HideFlags", true);
      var5.putBoolean("Unbreakable", true);
      NbtCompound var6 = new NbtCompound();
      var6.putUuid("Id", UUID.fromString(var1));
      NbtCompound var7 = new NbtCompound();
      NbtList var8 = new NbtList();
      NbtCompound var9 = new NbtCompound();
      var9.putString("Value", var2);
      var8.add(var9);
      var7.put("textures", var8);
      var6.put("Properties", var7);
      var5.put("SkullOwner", var6);
      return new Helper294(var0, var5, Items.PLAYER_HEAD, var3, null, var4);
   }
}
