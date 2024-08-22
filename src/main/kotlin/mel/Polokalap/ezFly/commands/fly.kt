package mel.Polokalap.ezFly.commands

import org.bukkit.ChatColor
import org.bukkit.Sound
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class fly : CommandExecutor {
    //Code made by Polokalap! Consider supporting me! https://buymeacoffee.com/Polokalap
    //If you find this plugin useful, feel free to dm me! My discord is polokalap
    //meow
    override fun onCommand(sender: CommandSender, cmd: Command, s: String, p3: Array<out String>?): Boolean {
        if (cmd.name.equals("fly", ignoreCase = true)) {
            if (sender is Player) {
                if (sender.hasPermission("ezfly.fly")) {
                    if (sender.allowFlight) {
                        sender.allowFlight = false
                        sender.isFlying = false
                        sender.sendMessage("${ChatColor.GREEN}You are no longer flying!")
                    }
                    else {
                        sender.allowFlight = true
                        sender.isFlying = true
                        sender.sendMessage("${ChatColor.GREEN}You are now flying!")
                    }
                }
                else {
                    sender.sendMessage("${ChatColor.RED}You don't have the right permisson!")
                    sender.playSound(sender, Sound.BLOCK_NOTE_BLOCK_BANJO, 1.0f, 1.0f)
                }
            }
            else {
                sender.sendMessage("${ChatColor.RED}Only players can run this command!")
            }
            return true
        }
        return true
    }
}