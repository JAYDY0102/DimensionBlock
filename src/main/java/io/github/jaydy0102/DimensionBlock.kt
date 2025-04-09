package io.github.jaydy0102

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class DimensionBlock : JavaPlugin() {
    companion object {
        lateinit var instance: DimensionBlock
            private set
    }
    override fun onEnable() {
        instance = this
        logger.info("DimensionBlock starting...")
        Bukkit.getPluginManager().registerEvents(ConnectionListener(), this)

        saveDefaultConfig()
    }
}