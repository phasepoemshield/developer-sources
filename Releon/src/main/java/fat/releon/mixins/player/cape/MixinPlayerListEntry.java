package fat.releon.mixins.player.cape;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin({PlayerListEntry.class})
public class MixinPlayerListEntry {
   @Shadow
   @Final
   private GameProfile profile;
   @Unique
   private static final Identifier CUSTOM_CAPE = Identifier.of("minecraft", "textures/cape/cape.png");

   public MixinPlayerListEntry() {
   }
}
