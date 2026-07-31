package fun.nexisdlc.client.utils.discord.callbacks;

import com.sun.jna.Callback;

public interface JoinGameCallback extends Callback {
    void apply(int var1, String var2);
}