package com.adri1711.randomevents.listeners;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import com.adri1711.randomevents.RandomEvents;
import com.adri1711.randomevents.util.Constantes;
import com.adri1711.randomevents.util.UtilidadesJson;
import com.adri1711.randomevents.util.UtilsRandomEvents;

public class Move implements Listener {

	private RandomEvents plugin;

	public Move(RandomEvents plugin) {
		super();
		this.plugin = plugin;
	}

	@EventHandler
	public void onMove(PlayerMoveEvent evt) {
		Player player = evt.getPlayer();
		if (plugin.getMatchActive() != null && plugin.getMatchActive().getPlaying()
				&& plugin.getMatchActive().getPlayersObj().contains(player)) {

			switch (plugin.getMatchActive().getMatch().getMinigame()) {
			case BOAT_RUN:
			case RACE:

				if (plugin.getMatchActive().getCuboid().contains(player.getLocation())) {

					plugin.getMatchActive().setPlayerContador(player);
					if (plugin.getTournamentActive() == null) {
						plugin.getMatchActive().daRecompensas(false);
					} else {
						if (!plugin.getMatchActive().getPlayersGanadores().contains(player)) {
							plugin.getMatchActive().getPlayersGanadores().add(player);
							for (Player p : plugin.getMatchActive().getPlayersSpectators()) {
								p.sendMessage(Constantes.TAG_PLUGIN + " "
										+ plugin.getLanguage().getRaceTournament()
												.replaceAll("%player%", player.getName())
												.replaceAll("%players%",
														"" + plugin.getMatchActive().getPlayersGanadores().size())
												.replaceAll("%neededPlayers%",
														plugin.getMatchActive().getLimitPlayers().toString()));
							}
							plugin.getMatchActive().compruebaPartida();
						}
					}
				}
				break;
			case ESCAPE_FROM_BEAST:
				if (!plugin.getMatchActive().getBeast().getName().equals(player.getName()) && plugin.getMatchActive().getCuboid().contains(player.getLocation())) {
					if(!plugin.getMatchActive().getGoalPlayers().contains(player)){
						plugin.getMatchActive().getGoalPlayers().add(player);
						plugin.getMatchActive().ponInventarioRunner(player);
						UtilsRandomEvents.playSound(player, UtilsRandomEvents.buscaSonido("LEVEL", "UP"));
					}
				}
				
			default:
				break;
			}
		}

	}

	public RandomEvents getPlugin() {
		return plugin;
	}

	public void setPlugin(RandomEvents plugin) {
		this.plugin = plugin;
	}

}
