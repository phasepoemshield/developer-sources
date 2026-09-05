/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00755
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06758
 *  minecraft.class07234
 *  minecraft.class07243
 *  minecraft.class07247
 *  minecraft.class07299
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil
 *  net.fabricmc.fabric.impl.transfer.TransferApiImpl
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00755;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06758;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07234;
import minecraft.class07243;
import minecraft.class07247;
import minecraft.class07299;
import minecraft.class08092;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07194
extends class06758 {
    private static final Logger R = LogUtils.getLogger();
    public static final MapCodec<class07194> i = class07194.y(class07194::new);
    private static final class00755 M = new class07206();

    public class07194(class01362 class013622) {
        super(class013622);
    }

    protected void N(class04782 class047822, class00500 class005002, class07209 class072092) {
        class06584 class065842;
        class07243 class072432 = class047822.N(class072092, class00404.field_11899).orElse(null);
        if (class072432 == null) {
            R.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", (Object)class072092);
            return;
        }
        class07210 class072102 = new class07210(class047822, class072092, class005002, class072432);
        int n = class072432.N(class047822.field_9229);
        if (n < 0) {
            class047822.N(1001, class072092, 0);
            return;
        }
        class06584 class065843 = class072432.method_5438(n);
        if (class065843.R()) {
            return;
        }
        class07211 class072112 = (class07211)((Object)class047822.method_8320(class072092).L((class08092)y));
        class06695 class066952 = class07234.N((class07299)class047822, (class07209)class072092.method_10093(class072112));
        if (class066952 == null) {
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(class047822, class005002, class072092, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class065842 = M.dispense(class072102, class065843);
        } else {
            class065842 = class07234.N((class06695)class072432, (class06695)class066952, (class06584)class065843.L(1), (class07211)class072112.b());
            if (class065842.R()) {
                class065842 = class065843.t();
                class065842.B(1);
            } else {
                class065842 = class065843.t();
            }
        }
        class072432.method_5447(n, class065842);
    }

    public void N(class04782 class047822, class00500 class005002, class07209 class072092, CallbackInfo callbackInfo) {
        class07243 class072432 = (class07243)class047822.method_8321(class072092);
        class07211 class072112 = (class07211)((Object)class072432.w().L((class08092)class06758.y));
        Storage var7 = (Storage)ItemStorage.SIDED.find((class07299)class047822, class072092.method_10093(class072112), (Object)class072112.b());
        if (var7 != null) {
            callbackInfo.cancel();
            int n = class072432.N(class047822.field_9229);
            if (n == -1) {
                TransferApiImpl.LOGGER.warn("Skipping dropper transfer because the empty slot is unexpectedly -1.");
                return;
            }
            StorageUtil.move((Storage)InventoryStorage.of((class06695)class072432, null).getSlot(n), (Storage)var7, itemVariant -> true, (long)1L, null);
        }
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07247(class072092, class005002);
    }

    protected class00755 N(class07299 class072992, class06584 class065842) {
        return M;
    }

    public MapCodec<class07194> N() {
        return i;
    }
}

