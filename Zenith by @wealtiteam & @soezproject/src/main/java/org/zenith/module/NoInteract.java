package org.zenith.module;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;


@ModuleInfo(
   name = "NoInteract",
   category = Category.MISC,
   description = "\u041d\u0435 \u0434\u0430\u0435\u0442 \u043e\u0442\u043a\u0440\u044b\u0442\u044c \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0430"
)
public final class NoInteract extends Module {
   public static final NoInteract noInteract = new NoInteract();

   public NoInteract() {
   }
}
