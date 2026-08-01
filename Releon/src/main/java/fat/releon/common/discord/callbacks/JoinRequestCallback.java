package fat.releon.common.discord.callbacks;

import com.sun.jna.Callback;
import fat.releon.common.discord.utils.DiscordUser;

public interface JoinRequestCallback extends Callback {
   void apply(DiscordUser var1);
}
