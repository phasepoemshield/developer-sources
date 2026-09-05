/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01540
 *  minecraft.class01781
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class06959
 *  minecraft.class08133
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01540;
import minecraft.class01781;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06959;
import minecraft.class08133;
import minecraft.class08665;
import minecraft.class08672;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class class08682
extends class08672<class08665> {
    private final class01781 y;

    public class08682(class01422 class014222, class01781 class017812) {
        super(class014222);
        this.y = class017812;
    }

    @Override
    protected String y() {
        return "entity";
    }

    @Override
    protected float N(int n, int n2) {
        return (float)n / 2.0f;
    }

    @Override
    protected void N(class08665 class086652, class01421 class014212) {
        ((class03386)class06202.Nq().i_5).v().N(class01540.field_60028);
        Vector3f vector3f = class086652.L();
        class014212.N(vector3f.x, vector3f.y, vector3f.z);
        class014212.N((Quaternionfc)class086652.u());
        Quaternionf quaternionf = class086652.z();
        class08133 class081332 = ((class03386)class06202.Nq().i_5).L();
        class06959 class069592 = new class06959();
        if (quaternionf != null) {
            class069592.i = quaternionf.conjugate(new Quaternionf()).rotateY((float)Math.PI);
        }
        this.y.N(class086652.y(), class069592, 0.0, 0.0, 0.0, class014212, (class01237)class081332.L());
        class081332.N();
    }

    @Override
    public Class<class08665> N() {
        return class08665.class;
    }
}

