package com.star.light.socket.cmd.pvp;

import com.star.light.action.room.RoomCreateAction;
import com.star.light.player.GamePlayer;
import com.star.light.room.RoomMgr;
import com.star.light.socket.PBMessage;
import com.star.light.socket.cmd.NetCmd;

public class CreateFuBen implements NetCmd {
	public void execute(GamePlayer player, PBMessage packet) throws Exception {
		RoomMgr.getInstance().enDefaultQueue(new RoomCreateAction(player));
	}
}
