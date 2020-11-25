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

package org.anvilpowered.referral.velocity.command

import com.velocitypowered.api.command.Command
import com.velocitypowered.api.command.CommandSource
import com.velocitypowered.api.proxy.Player
import net.kyori.adventure.text.TextComponent
import org.anvilpowered.referral.common.command.CommonByCommand

class VelocityByCommand
    : CommonByCommand<Player, Player, TextComponent, CommandSource>(Player::class.java), Command {
    override fun execute(source: CommandSource, context: Array<String>) =
        super<CommonByCommand>.execute(source, context)

    override fun suggest(source: CommandSource, context: Array<String>): List<String> =
        super<CommonByCommand>.suggest(source, context)
}
