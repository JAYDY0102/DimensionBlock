package io.github.jaydy0102

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerChangedWorldEvent

class ConnectionListener : Listener {
    @EventHandler
    fun onPlayerChangedWorld(event: PlayerChangedWorldEvent){
        val player = event.player
        val world = player.world
        val open1 = ConfigManager.endbanned
        val open2 = ConfigManager.netherbanned
        val loc = player.respawnLocation
        val spawn = Bukkit.getWorlds().get(0).spawnLocation
        if (world.environment == World.Environment.THE_END) {
            if (open1) {
                if (loc != null) {
                    player.teleport(loc)
                }
                else {
                    player.teleport(spawn)
                }
                player.sendMessage(Component.text("END IS UNAVAILABLE", TextColor.color(255,255,0), TextDecoration.BOLD))
            }
        }
        if (world.environment == World.Environment.NETHER) {
            if (open2) {
                if (loc != null) {
                    player.teleport(loc)
                }
                else {
                    player.teleport(spawn)
                }
                player.sendMessage(Component.text("NETHER IS UNAVAILABLE", TextColor.color(255,255,0), TextDecoration.BOLD))
            }
        }
    }
}