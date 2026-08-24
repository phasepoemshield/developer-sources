package org.zenith.module;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;


@ModuleInfo(
   name = "NoFriendDamage",
   category = Category.MISC,
   description = "\u0414\u0430\u0435\u0442 \u0440\u0435\u0439\u043a\u0430\u0441\u0442\u0443 \u043f\u0440\u043e\u0445\u043e\u0434\u0438\u0442\u044c \u0441\u043a\u0432\u043e\u0437\u044c \u0434\u0440\u0443\u0437\u0435\u0439"
)
public final class NoFriendDamage extends Module {
   public static final NoFriendDamage noFriendDamage = new NoFriendDamage();

   public NoFriendDamage() {
   }
}
