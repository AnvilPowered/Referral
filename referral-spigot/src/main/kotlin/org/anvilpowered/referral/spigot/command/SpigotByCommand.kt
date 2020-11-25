/*
 *   Referral - AnvilPowered
 *   Copyright (C) 2020
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.anvilpowered.referral.spigot.command

import net.md_5.bungee.api.chat.TextComponent
import org.anvilpowered.referral.common.command.CommonByCommand
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player

class SpigotByCommand
    : CommonByCommand<Player, Player, TextComponent, CommandSender>(Player::class.java), TabExecutor {

    override fun onCommand(source: CommandSender, command: Command, alias: String, context: Array<String>): Boolean {
        execute(source, context)
        return true
    }

    override fun onTabComplete(
        source: CommandSender,
        command: Command,
        label: String,
        context: Array<String>
    ): List<String> = suggest(source, context)
}
