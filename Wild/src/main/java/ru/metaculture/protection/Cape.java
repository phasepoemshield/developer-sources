package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import java.util.function.Consumer;
import net.minecraft.util.Identifier;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "Cape",
   O0000000000 = Category.Misc,
   O000000000 = "Добавляет вам плащик"
)
public class Cape extends Module {
   public static void O00000000(GameProfile gameProfile, Consumer<Identifier> consumer) {
   }
}
