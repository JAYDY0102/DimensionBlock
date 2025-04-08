package io.github.jaydy0102

object ConfigManager {
    private val config = DimensionBlock.instance.config

    val endbanned: Boolean
        get() = config.getBoolean("end-banned")
    val netherbanned: Boolean
        get() = config.getBoolean("nether-banned")
}