package fun.nexisdlc.client.utils.discord.callbacks;

import com.sun.jna.Callback;
import fun.nexisdlc.client.utils.discord.utils.DiscordUser;

public interface ReadyCallback extends Callback {
    void apply(DiscordUser var1);
}