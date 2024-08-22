package mel.Polokalap.ezFly

import mel.Polokalap.ezFly.commands.fly
import org.bukkit.plugin.java.JavaPlugin

class EzFly : JavaPlugin() {

    override fun onEnable() {
        logger.info("The plugin is running.")
        register_commands()
    }

    private fun register_commands() {
        getCommand("fly")?.setExecutor(fly())
    }

    override fun onDisable() {
        logger.info("The plugin shut down.")
    }
}
