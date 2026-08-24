/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.TargetHudModule;
import kotakbaz.rain.module.modules.hud.container.HudModule;
import kotakbaz.rain.module.modules.player.AutoInvestModule;
import kotakbaz.rain.module.modules.player.AutoReissueModule;
import kotakbaz.rain.module.modules.player.ChangeHandModule;
import kotakbaz.rain.module.modules.player.CommandFixModule;
import kotakbaz.rain.module.modules.render.ItemPhysicModule;
import kotakbaz.rain.module.modules.render.SoulsModule;
import kotakbaz.rain.module.modules.render.WayPointModule;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u0624;
import oxxxde.\u0627\u0625;
import oxxxde.\u0627\u062a;
import oxxxde.\u0627\u0651;
import oxxxde.\u0628\u0624;
import oxxxde.\u0628\u0625;
import oxxxde.\u0628\u0637;
import oxxxde.\u0628\u0648;
import oxxxde.\u0628\u064e;
import oxxxde.\u062a\u0623;
import oxxxde.\u062a\u0628;
import oxxxde.\u062a\u0635;
import oxxxde.\u062a\u0639;
import oxxxde.\u062b\u0623;
import oxxxde.\u062b\u0627;
import oxxxde.\u062b\u0631;
import oxxxde.\u062b\u0643;
import oxxxde.\u062b\u0648;
import oxxxde.\u062b\u0650;
import oxxxde.\u062c;
import oxxxde.\u062c\u0624;
import oxxxde.\u062c\u0636;
import oxxxde.\u062c\u0642;
import oxxxde.\u062d\u0634;
import oxxxde.\u062d\u063a;
import oxxxde.\u062e\u0623;
import oxxxde.\u062e\u0627;
import oxxxde.\u062e\u062b;
import oxxxde.\u062e\u0635;
import oxxxde.\u062e\u064a;
import oxxxde.\u062e\u0650;
import oxxxde.\u062e\u0652;
import oxxxde.\u062f;
import oxxxde.\u062f\u0638;
import oxxxde.\u0630\u062c;
import oxxxde.\u0630\u0636;
import oxxxde.\u0630\u0643;
import oxxxde.\u0630\u064b;
import oxxxde.\u0631\u0625;
import oxxxde.\u0631\u062c;
import oxxxde.\u0631\u0632;
import oxxxde.\u0631\u0634;
import oxxxde.\u0631\u0639;
import oxxxde.\u0631\u0648;
import oxxxde.\u0632\u0623;
import oxxxde.\u0632\u0628;
import oxxxde.\u0632\u062a;
import oxxxde.\u0633\u0621;
import oxxxde.\u0633\u0638;
import oxxxde.\u0633\u0647;
import oxxxde.\u0633\u064c;
import oxxxde.\u0634\u0621;
import oxxxde.\u0634\u0627;
import oxxxde.\u0634\u062d;
import oxxxde.\u0634\u0632;
import oxxxde.\u0634\u0635;
import oxxxde.\u0635\u0628;
import oxxxde.\u0635\u064e;
import oxxxde.\u0635\u0650;
import oxxxde.\u0636\u0627;
import oxxxde.\u0636\u0639;
import oxxxde.\u0636\u0642;
import oxxxde.\u0638\u0624;
import oxxxde.\u0638\u0627;
import oxxxde.\u0638\u062b;
import oxxxde.\u0639\u062c;
import oxxxde.\u0647;
import oxxxde.\u0652;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2={"Loxxxde/\u062e\u064b;", "Loxxxde/\u0647;", "<init>", "()V", "", "load", "", "Loxxxde/\u062f\u0650;", "module", "add", "([Lkotakbaz/rain/module/Module;)V", "syncAvailabilityStates", "", "modules", "Ljava/util/List;", "getModules", "()Ljava/util/List;", "rain-visuals"})
@RecompileFormat
public final class \u062e\u064b
implements \u0647 {
    @NotNull
    private static final List<Module> modules;
    @NotNull
    public static final \u062e\u064b INSTANCE;

    @Override
    @Compile(ops=10)
    public void load() {
        if (!((Collection)modules).isEmpty()) {
            return;
        }
        this.add(\u062f.INSTANCE, \u062d\u063a.INSTANCE, \u062a\u0635.INSTANCE, \u0633\u0638.INSTANCE, AutoInvestModule.INSTANCE, \u062e\u0623.INSTANCE, AutoReissueModule.INSTANCE, \u0628\u0625.INSTANCE, \u0638\u0627.INSTANCE, \u0630\u0636.INSTANCE, \u0636\u0642.INSTANCE, \u0631\u062c.INSTANCE, \u0634\u0621.INSTANCE, CommandFixModule.INSTANCE, \u062e\u062b.INSTANCE, \u0627\u0625.INSTANCE, \u0633\u0647.INSTANCE, \u062b\u0643.INSTANCE, \u062c\u0624.INSTANCE, \u0628\u0648.INSTANCE, \u062a\u0628.INSTANCE, \u0627\u062a.INSTANCE, \u0634\u0627.INSTANCE, \u062c.INSTANCE, \u062e\u0650.INSTANCE, \u062b\u0648.INSTANCE, ChangeHandModule.INSTANCE, \u0636\u0627.INSTANCE, \u0630\u0643.INSTANCE, \u0631\u0634.INSTANCE, \u0635\u064e.INSTANCE, \u0632\u0628.INSTANCE, TargetHudModule.INSTANCE, \u0628\u0637.INSTANCE, \u062e\u0627.INSTANCE, \u0627\u0624.INSTANCE, RainMainMenuScreen$Link.INSTANCE, \u062e\u0635.INSTANCE, \u062b\u0623.INSTANCE, \u0630\u064b.INSTANCE, \u062a\u0623.INSTANCE, \u0631\u0639.INSTANCE, WayPointModule.INSTANCE, \u0628\u064e.INSTANCE, \u0638\u062b.INSTANCE, \u0630\u062c.INSTANCE, \u0639\u062c.INSTANCE, \u062b\u0627.INSTANCE, \u062a\u0639.INSTANCE, \u0633\u0621.INSTANCE, \u0628\u0624.INSTANCE, \u0631\u0632.INSTANCE, \u0652.INSTANCE, \u062e\u0652.INSTANCE, \u0631\u0625.INSTANCE, \u0633\u064c.INSTANCE, \u062f\u0638.INSTANCE, \u062b\u0631.INSTANCE, ItemPhysicModule.INSTANCE, \u0634\u0635.INSTANCE, \u062c\u0636.INSTANCE, \u0632\u0623.INSTANCE, \u062b\u0650.INSTANCE, \u0634\u062d.INSTANCE, \u0636\u0639.INSTANCE, \u0627\u0651.INSTANCE, \u062e\u064a.INSTANCE, HudModule.INSTANCE, \u0638\u0624.INSTANCE, \u0632\u062a.INSTANCE, \u062d\u0634.INSTANCE, \u0635\u0650.INSTANCE, \u0635\u0628.INSTANCE, SoulsModule.INSTANCE, \u0634\u0632.INSTANCE, \u062c\u0642.INSTANCE, \u0631\u0648.INSTANCE);
    }

    private \u062e\u064b() {
    }

    @NotNull
    public final List<Module> getModules() {
        return modules;
    }

    public final void syncAvailabilityStates() {
        Iterable $this$forEach$iv = modules;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            Object element$iv = iterator2.next();
            Module p0 = (Module)element$iv;
            boolean bl = false;
            p0.syncEnabledState();
        }
    }

    private final void add(Module ... module) {
        CollectionsKt.addAll((Collection)modules, module);
    }

    static {
        INSTANCE = new \u062e\u064b();
        modules = new ArrayList();
    }
}

