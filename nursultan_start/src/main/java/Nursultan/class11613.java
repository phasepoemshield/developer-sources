/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09784
 *  Nursultan.class09785
 *  Nursultan.class09793
 *  Nursultan.class09809
 *  Nursultan.class09904
 *  Nursultan.class09991
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector2f
 */
package Nursultan;

import Nursultan.class09784;
import Nursultan.class09785;
import Nursultan.class09793;
import Nursultan.class09809;
import Nursultan.class09904;
import Nursultan.class09991;
import Nursultan.class11598;
import Nursultan.class11632;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import org.joml.Vector2f;

public class class11613
extends Record
implements class11632 {
    public BiConsumer<class09784, class09809> content;
    public class09991 style;
    public class11598<? super class11613> behavior;
    public class09785<Vector2f> dragOffset;
    public class09785<Boolean> dragging;
    public class09793<class09904> ref;
    public class09785<Vector2f> position;
    public String id;

    @Override
    public class09785<Vector2f> L() {
        return this.dragOffset;
    }

    public class09793<class09904> M() {
        return this.ref;
    }

    public class11613(String string, class09793<class09904> class097932, class09991 class099912, class09785<Vector2f> class097852, class09785<Boolean> class097853, class09785<Vector2f> class097854, class11598<? super class11613> class115982, BiConsumer<class09784, class09809> biConsumer) {
        this.id = string;
        this.ref = class097932;
        this.style = class099912;
        this.position = class097852;
        this.dragging = class097853;
        this.dragOffset = class097854;
        this.behavior = class115982;
        this.content = biConsumer;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11613.class, "id;ref;style;position;dragging;dragOffset;behavior;content", "id", "ref", "style", "position", "dragging", "dragOffset", "behavior", "content"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11613.class, "id;ref;style;position;dragging;dragOffset;behavior;content", "id", "ref", "style", "position", "dragging", "dragOffset", "behavior", "content"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11613.class, "id;ref;style;position;dragging;dragOffset;behavior;content", "id", "ref", "style", "position", "dragging", "dragOffset", "behavior", "content"}, this);
    }

    public BiConsumer<class09784, class09809> B() {
        return this.content;
    }

    public class09991 i() {
        return this.style;
    }

    @Override
    public class09785<Boolean> u() {
        return this.dragging;
    }

    @Override
    public class09785<Vector2f> y() {
        return this.position;
    }

    @Override
    public String N() {
        return this.id;
    }

    public class11598<? super class11613> R() {
        return this.behavior;
    }
}

