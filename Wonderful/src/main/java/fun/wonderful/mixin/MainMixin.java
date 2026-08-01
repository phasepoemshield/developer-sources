package fun.wonderful.mixin;

import fun.wonderful.Wonderful;
import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Main.class})
public class MainMixin {
    @Inject(method={"main"}, at={@At(value="HEAD")})
    private static void onMain(String[] args, CallbackInfo ci) {
        if (Wonderful.INSTANCE.isServer) {
            try {
                Wonderful.INSTANCE.closeMinecraft();
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
            Wonderful.INSTANCE.isServer = false;
        }
    }
}