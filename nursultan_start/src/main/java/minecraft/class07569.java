/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  it.unimi.dsi.fastutil.objects.ReferenceSet
 *  minecraft.class08152
 *  minecraft.class08159
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;
import minecraft.class08152;
import minecraft.class08159;

public class class07569
implements class08152 {
    private final ReferenceSet<class08152> N = new ReferenceArraySet();

    private class07569(ReferenceSet<class08152> referenceSet, ReferenceSet<class08152> referenceSet2) {
        this.N.addAll(referenceSet);
        this.N.addAll(referenceSet2);
        this.y();
    }

    private class07569(ReferenceSet<class08152> referenceSet, class08152 class081522) {
        this.N.addAll(referenceSet);
        this.N.add((Object)class081522);
        this.y();
    }

    class07569(class08152 class081522, class08152 class081523) {
        this.N.add((Object)class081522);
        this.N.add((Object)class081523);
        this.y();
    }

    private void y() {
        ObjectIterator var1 = this.N.iterator();
        while (var1.hasNext()) {
            if (!((class08152)var1.next() instanceof class07569)) continue;
            throw new IllegalArgumentException("Cannot have PermissionSetUnion within another PermissionSetUnion");
        }
    }

    public class08152 N(class08152 class081522) {
        if (class081522 instanceof class07569) {
            class07569 class075692 = (class07569)class081522;
            return new class07569(this.N, class075692.N);
        }
        return new class07569(this.N, class081522);
    }

    public ReferenceSet<class08152> N() {
        return new ReferenceArraySet(this.N);
    }

    public boolean hasPermission(class08159 class081592) {
        ObjectIterator var2 = this.N.iterator();
        while (var2.hasNext()) {
            if (!((class08152)var2.next()).hasPermission(class081592)) continue;
            return true;
        }
        return false;
    }
}

