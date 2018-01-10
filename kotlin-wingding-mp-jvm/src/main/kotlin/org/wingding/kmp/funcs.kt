package org.wingding.kmp

actual fun formatString(source: String, vararg args: Any): String {
    return String.format(source, args)
}
