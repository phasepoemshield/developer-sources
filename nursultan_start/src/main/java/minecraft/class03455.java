/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00690
 *  minecraft.class01109
 *  minecraft.class04477
 *  minecraft.class07049
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents$Load
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents$Unload
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.Objects;
import minecraft.class00690;
import minecraft.class01109;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class07049;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
final class class03455
implements class01109<class07049> {
    final /* synthetic */ class03448 N;

    public void L(class07049 class070492) {
        this.N.y.N(class070492);
    }

    public void M(class07049 class070492) {
    }

    class03455(class03448 class034482) {
        this.N = class034482;
    }

    public void i(class07049 class070492) {
        class07049 class070493 = class070492;
        Objects.requireNonNull(class070493);
        class07049 class070494 = class070493;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class04477.class, class00690.class}, (Object)class070494, (int)n)) {
            case 0: {
                class04477 class044772 = (class04477)class070494;
                this.N.u.add(class044772);
                break;
            }
            case 1: {
                class00690 class006902 = (class00690)class070494;
                this.N.i.addAll(Arrays.asList(class006902.E()));
                break;
            }
        }
        this.N(class070492, null);
    }

    public void u(class07049 class070492) {
        this.N.y.y(class070492);
    }

    public void y(class07049 class070492) {
    }

    private void y(class07049 class070492, CallbackInfo callbackInfo) {
        ((ClientEntityEvents.Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class070492, this.N);
    }

    private void N(class07049 class070492, CallbackInfo callbackInfo) {
        ((ClientEntityEvents.Load)ClientEntityEvents.ENTITY_LOAD.invoker()).onLoad(class070492, this.N);
    }

    public void N(class07049 class070492) {
    }

    public void R(class07049 class070492) {
        this.y(class070492, null);
        class070492.method_18375();
        class07049 class070493 = class070492;
        Objects.requireNonNull(class070493);
        class07049 class070494 = class070493;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class04477.class, class00690.class}, (Object)class070494, (int)n)) {
            case 0: {
                class04477 class044772 = (class04477)class070494;
                this.N.u.remove(class044772);
                break;
            }
            case 1: {
                class00690 class006902 = (class00690)class070494;
                this.N.i.removeAll(Arrays.asList(class006902.E()));
                break;
            }
        }
    }
}

