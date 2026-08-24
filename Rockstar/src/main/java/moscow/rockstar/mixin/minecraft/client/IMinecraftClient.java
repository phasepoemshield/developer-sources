package moscow.rockstar.mixin.minecraft.client;

import java.io.File;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.session.Session;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(MinecraftClient.class)
public interface IMinecraftClient {
   @Invoker("doItemUse")
   void idoItemUse();

   @Accessor("itemUseCooldown")
   int getUseCooldown();

   @Accessor("itemUseCooldown")
   void setUseCooldown(int var1);

   @Accessor("session")
   void setSession(Session var1);

   @Mutable
   @Accessor("runDirectory")
   void setRunDirectory(File var1);
}
