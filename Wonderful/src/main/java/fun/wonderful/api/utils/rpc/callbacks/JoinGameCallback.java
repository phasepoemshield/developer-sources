package fun.wonderful.api.utils.rpc.callbacks;

import com.sun.jna.Callback;

public interface JoinGameCallback
extends Callback {
    public void apply(String var1);
}