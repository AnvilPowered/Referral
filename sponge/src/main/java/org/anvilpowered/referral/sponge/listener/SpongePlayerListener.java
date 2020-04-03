/*
 *   Referral - AnvilPowered
 *   Copyright (C) 2020 Cableguy20
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.anvilpowered.referral.sponge.listener;

import com.google.inject.Inject;
import org.anvilpowered.referral.api.member.MemberManager;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.text.Text;

public class SpongePlayerListener {

    @Inject
    private MemberManager<Text> memberManager;

    @Listener
    public void onPlayerJoin(ClientConnectionEvent.Login event) {
        memberManager.getPrimaryComponent()
            .getOneOrGenerateForUser(event.getTargetUser().getUniqueId());
    }
}
