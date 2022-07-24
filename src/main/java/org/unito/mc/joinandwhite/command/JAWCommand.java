package org.unito.mc.joinandwhite.command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.unito.mc.joinandwhite.JoinAndWhite;

public class JAWCommand extends AbstractCommand {


    public JAWCommand() {
        super("jaw");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if(args.length == 0) {
            sender.sendMessage("Reload config : " + label + "reload");
            return;
        }

        if(args[0].equalsIgnoreCase("reload")) {
            if(!sender.hasPermission("jaw.reload")) {
                sender.sendMessage(ChatColor.RED + JoinAndWhite.getInstance().getConfig().getString("NoHasPermission"));
                return;
            }

            JoinAndWhite.getInstance().reloadConfig();
            sender.sendMessage(ChatColor.GREEN + "JoinAndWhite reloaded.");
            return;
        }

        sender.sendMessage(ChatColor.RED + JoinAndWhite.getInstance().getConfig().getString("UnknownCommand") + " " + args[0]);
    }
}
