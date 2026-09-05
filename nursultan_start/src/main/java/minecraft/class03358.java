/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00394
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00985
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class08141
 *  org.jspecify.annotations.Nullable
 *  page.langeweile.ok_zoomer.utils.ZoomUtils
 *  page.langeweile.ok_zoomer.zoom.Zoom
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import minecraft.class00394;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00985;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class08141;
import org.jspecify.annotations.Nullable;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

public interface class03358<T extends class00394, S extends class00985> {
    public S i();

    default public boolean N(T t, class06889 class068892) {
        return class06889.y((class00753)t.d()).N((class00737)class068892, (double)this.u_());
    }

    private int N(Operation operation) {
        if (!ZoomUtils.canSeeDistantEntities()) {
            return (Integer)operation.call(new Object[0]);
        }
        return (Integer)operation.call(new Object[0]) * (Zoom.isZooming() ? Math.max(1, class04995.L((double)Zoom.getZoomDivisor())) : 1);
    }

    private int N() {
        return 64;
    }

    default public void N(T t, S s, float f, class06889 class068892, @Nullable class08141 class081412) {
        class00985.N(t, s, (class08141)class081412);
    }

    public void N(S var1, class01421 var2, class01237 var3, class06959 var4);

    default public int u_() {
        return this.N(objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)0, (String)"[]");
            return this.N();
        });
    }

    default public boolean t_() {
        return false;
    }
}

