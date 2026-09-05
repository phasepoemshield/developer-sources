/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01387
 *  minecraft.class03734
 *  minecraft.class05502
 *  minecraft.class06513
 *  minecraft.class08019
 */
package jerozgen.languagereload.mixin;

import java.util.List;
import minecraft.class01387;
import minecraft.class03734;
import minecraft.class05502;
import minecraft.class06513;
import minecraft.class08019;

public interface AdvancementWidgetAccessor {
    public class03734 languagereload_getAdvancement();

    public void languagereload_setChildren(List<class01387> var1);

    public class01387 languagereload_getParent();

    public class06513 languagereload_getDisplay();

    public class05502 languagereload_getTab();

    public void languagereload_setParent(class01387 var1);

    public List<class01387> languagereload_getChildren();

    public class08019 languagereload_getProgress();
}

