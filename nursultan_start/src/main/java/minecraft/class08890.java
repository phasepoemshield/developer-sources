/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01894
 *  minecraft.class08906
 *  minecraft.class08910
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.BakedModelsHooks
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.Objects;
import minecraft.class00500;
import minecraft.class01894;
import minecraft.class08881;
import minecraft.class08887;
import minecraft.class08906;
import minecraft.class08910;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.BakedModelsHooks;
import org.jspecify.annotations.Nullable;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
@Environment(value=EnvType.CLIENT)
public final class class08890
implements BakedModelsHooks {
    private class08881 missingModels;
    private Map<class00500, class08887> blockStateModels;
    private Map<class01894, class08910> itemStackModels;
    private Map<class01894, class08906> itemProperties;
    private @Nullable Map i;

    public Map<class01894, class08910> L() {
        return this.itemStackModels;
    }

    public class08890(class08881 class088812, Map<class00500, class08887> map, Map<class01894, class08910> map2, Map<class01894, class08906> map3) {
        this.missingModels = class088812;
        this.blockStateModels = map;
        this.itemStackModels = map2;
        this.itemProperties = map3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class08890 && Objects.equals((Object)this.missingModels, (Object)((class08890)object).missingModels) && Objects.equals(this.blockStateModels, ((class08890)object).blockStateModels) && Objects.equals(this.itemStackModels, ((class08890)object).itemStackModels) && Objects.equals(this.itemProperties, ((class08890)object).itemProperties);
    }

    public final String toString() {
        return "class08890[missingModels=" + Objects.toString((Object)this.missingModels) + ", blockStateModels=" + Objects.toString(this.blockStateModels) + ", itemStackModels=" + Objects.toString(this.itemStackModels) + ", itemProperties=" + Objects.toString(this.itemProperties) + "]";
    }

    public final int hashCode() {
        return (((0 * 31 + Objects.hashCode((Object)this.missingModels)) * 31 + Objects.hashCode(this.blockStateModels)) * 31 + Objects.hashCode(this.itemStackModels)) * 31 + Objects.hashCode(this.itemProperties);
    }

    public Map<class01894, class08906> u() {
        return this.itemProperties;
    }

    public Map<class00500, class08887> y() {
        return this.blockStateModels;
    }

    public class08881 N() {
        return this.missingModels;
    }

    public void fabric_setExtraModels(@Nullable Map map) {
        this.i = map;
    }

    public @Nullable Map fabric_getExtraModels() {
        return this.i;
    }
}

