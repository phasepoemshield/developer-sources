/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01294
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class06478
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.screen;

import java.util.AbstractList;
import java.util.List;
import minecraft.class01294;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class06478;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class ButtonList
extends AbstractList<class06478> {
    private final List<class01294> drawables;
    private final List<class03434> selectables;
    private final List<class04654> children;

    public ButtonList(List<class01294> list, List<class03434> list2, List<class04654> list3) {
        this.drawables = list;
        this.selectables = list2;
        this.children = list3;
    }

    @Override
    public class06478 remove(int n) {
        n = this.translateIndex(this.drawables, n, false);
        class06478 class064782 = (class06478)this.drawables.remove(n);
        this.selectables.remove(class064782);
        this.children.remove(class064782);
        return class064782;
    }

    @Override
    public int size() {
        int n = 0;
        for (class01294 class012942 : this.drawables) {
            if (!(class012942 instanceof class06478)) continue;
            ++n;
        }
        return n;
    }

    @Override
    public class06478 get(int n) {
        int n2 = this.translateIndex(this.drawables, n, false);
        return (class06478)this.drawables.get(n2);
    }

    @Override
    public void add(int n, class06478 class064782) {
        int n2 = this.drawables.indexOf(class064782);
        if (n2 >= 0) {
            this.drawables.remove(class064782);
            this.selectables.remove(class064782);
            this.children.remove(class064782);
            if (n2 <= this.translateIndex(this.drawables, n, true)) {
                --n;
            }
        }
        int n3 = this.translateIndex(this.drawables, n, true);
        this.drawables.add(n3, (class01294)class064782);
        int n4 = this.translateIndex(this.selectables, n, true);
        this.selectables.add(n4, (class03434)class064782);
        int n5 = this.translateIndex(this.children, n, true);
        this.children.add(n5, (class04654)class064782);
    }

    @Override
    public class06478 set(int n, class06478 class064782) {
        int n2 = this.translateIndex(this.drawables, n, false);
        this.drawables.set(n2, (class01294)class064782);
        int n3 = this.translateIndex(this.selectables, n, false);
        this.selectables.set(n3, (class03434)class064782);
        int n4 = this.translateIndex(this.children, n, false);
        return (class06478)this.children.set(n4, (class04654)class064782);
    }

    private int translateIndex(List<?> list, int n, boolean bl) {
        int n2 = n;
        int n3 = list.size();
        for (int i = 0; i < n3; ++i) {
            if (!(list.get(i) instanceof class06478)) continue;
            if (n2 == 0) {
                return i;
            }
            --n2;
        }
        if (bl && n2 == 0) {
            return list.size();
        }
        throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", n, n - n2));
    }
}

