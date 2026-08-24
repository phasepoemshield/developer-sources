@file:JvmMultifileClass
@file:JvmName("FilesKt")

package kotlin.io

import java.io.File

// $VF: Compiled from FileTreeWalk.kt
open fun FilesKt__FileTreeWalkKt() {
}

public fun File.walk(direction: FileWalkDirection = FileWalkDirection.TOP_DOWN): FileTreeWalk {
   return FileTreeWalk(`$this$walk`, direction)
}

public fun File.walkTopDown(): FileTreeWalk {
   return FilesKt.walk(`$this$walkTopDown`, FileWalkDirection.TOP_DOWN)
}

public fun File.walkBottomUp(): FileTreeWalk {
   return FilesKt.walk(`$this$walkBottomUp`, FileWalkDirection.BOTTOM_UP)
}
