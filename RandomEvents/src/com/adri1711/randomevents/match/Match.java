package com.adri1711.randomevents.match;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;

public class Match {

	private String name;

	private InventoryPers inventory;
	
	//TODO private ItemStack[] equipment;
	
	private Integer amountPlayers;
	
	private Integer amountPlayersMin;
	
	private Location playerSpawn;
	
	private MinigameType minigame;
	
	private List<Location> spawns;
	
	private List<Location> spectatorSpawns;
	
	private Double secondsMobSpawn;
	

	private Location location1;
	
	private Location location2;
	
	private EntityType mob;
	
	private Location eventSpawn;
	
	private List<String> rewards;
	
	private Integer tiempoPartida;


	public Match() {
		super();
		this.inventory=new InventoryPers();
		//TODO this.equipment=new ItemStack[0];
		this.rewards = new ArrayList<String>();
		this.spawns=new ArrayList<Location>();
		this.spectatorSpawns=new ArrayList<Location>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public InventoryPers getInventory() {
		return inventory;
	}


	public void setInventory(InventoryPers inventory) {
		this.inventory = inventory;
	}


//	public ItemStack[] getEquipment() {
//		return equipment;
//	}
//
//
//	public void setEquipment(ItemStack[] equipment) {
//		this.equipment = equipment;
//	}


	public Integer getAmountPlayers() {
		return amountPlayers;
	}


	public void setAmountPlayers(Integer amountPlayers) {
		this.amountPlayers = amountPlayers;
	}


	public Integer getAmountPlayersMin() {
		return amountPlayersMin;
	}


	public void setAmountPlayersMin(Integer amountPlayersMin) {
		this.amountPlayersMin = amountPlayersMin;
	}


	public Location getPlayerSpawn() {
		return playerSpawn;
	}


	public void setPlayerSpawn(Location playerSpawn) {
		this.playerSpawn = playerSpawn;
	}


	public MinigameType getMinigame() {
		return minigame;
	}


	public void setMinigame(MinigameType minigame) {
		this.minigame = minigame;
	}


	public List<Location> getSpawns() {
		return spawns;
	}


	public void setSpawns(List<Location> spawns) {
		this.spawns = spawns;
	}


	public Double getSecondsMobSpawn() {
		return secondsMobSpawn;
	}


	public void setSecondsMobSpawn(Double secondsMobSpawn) {
		this.secondsMobSpawn = secondsMobSpawn;
	}


	


	public Location getEventSpawn() {
		return eventSpawn;
	}


	public void setEventSpawn(Location eventSpawn) {
		this.eventSpawn = eventSpawn;
	}


	public List<String> getRewards() {
		return rewards;
	}


	public void setRewards(List<String> rewards) {
		this.rewards = rewards;
	}


	


	public Integer getTiempoPartida() {
		return tiempoPartida;
	}


	public void setTiempoPartida(Integer tiempoPartida) {
		this.tiempoPartida = tiempoPartida;
	}


	public Location getLocation1() {
		return location1;
	}


	public void setLocation1(Location location1) {
		this.location1 = location1;
	}


	public Location getLocation2() {
		return location2;
	}


	public void setLocation2(Location location2) {
		this.location2 = location2;
	}


	public EntityType getMob() {
		return mob;
	}


	public void setMob(EntityType mob) {
		this.mob = mob;
	}
	
	


	public List<Location> getSpectatorSpawns() {
		return spectatorSpawns;
	}


	public void setSpectatorSpawns(List<Location> spectatorSpawns) {
		this.spectatorSpawns = spectatorSpawns;
	}


	@Override
	public String toString() {
		return "Match [name=" + name + ", inventory=" + inventory + ", amountPlayers=" + amountPlayers
				+ ", amountPlayersMin=" + amountPlayersMin + ", playerSpawn=" + playerSpawn + ", minigame=" + minigame
				+ ", spawns=" + spawns + ", secondsMobSpawn=" + secondsMobSpawn + ", location1=" + location1
				+ ", location2=" + location2 + ", mob=" + mob + ", eventSpawn=" + eventSpawn + ", rewards=" + rewards
				+ ", tiempoPartida=" + tiempoPartida + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amountPlayers == null) ? 0 : amountPlayers.hashCode());
		result = prime * result + ((amountPlayersMin == null) ? 0 : amountPlayersMin.hashCode());
		result = prime * result + ((eventSpawn == null) ? 0 : eventSpawn.hashCode());
		result = prime * result + ((inventory == null) ? 0 : inventory.hashCode());
		result = prime * result + ((location1 == null) ? 0 : location1.hashCode());
		result = prime * result + ((location2 == null) ? 0 : location2.hashCode());
		result = prime * result + ((minigame == null) ? 0 : minigame.hashCode());
		result = prime * result + ((mob == null) ? 0 : mob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((playerSpawn == null) ? 0 : playerSpawn.hashCode());
		result = prime * result + ((rewards == null) ? 0 : rewards.hashCode());
		result = prime * result + ((secondsMobSpawn == null) ? 0 : secondsMobSpawn.hashCode());
		result = prime * result + ((spawns == null) ? 0 : spawns.hashCode());
		result = prime * result + ((tiempoPartida == null) ? 0 : tiempoPartida.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Match other = (Match) obj;
		if (amountPlayers == null) {
			if (other.amountPlayers != null)
				return false;
		} else if (!amountPlayers.equals(other.amountPlayers))
			return false;
		if (amountPlayersMin == null) {
			if (other.amountPlayersMin != null)
				return false;
		} else if (!amountPlayersMin.equals(other.amountPlayersMin))
			return false;
		if (eventSpawn == null) {
			if (other.eventSpawn != null)
				return false;
		} else if (!eventSpawn.equals(other.eventSpawn))
			return false;
		if (inventory == null) {
			if (other.inventory != null)
				return false;
		} else if (!inventory.equals(other.inventory))
			return false;
		if (location1 == null) {
			if (other.location1 != null)
				return false;
		} else if (!location1.equals(other.location1))
			return false;
		if (location2 == null) {
			if (other.location2 != null)
				return false;
		} else if (!location2.equals(other.location2))
			return false;
		if (minigame != other.minigame)
			return false;
		if (mob != other.mob)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (playerSpawn == null) {
			if (other.playerSpawn != null)
				return false;
		} else if (!playerSpawn.equals(other.playerSpawn))
			return false;
		if (rewards == null) {
			if (other.rewards != null)
				return false;
		} else if (!rewards.equals(other.rewards))
			return false;
		if (secondsMobSpawn == null) {
			if (other.secondsMobSpawn != null)
				return false;
		} else if (!secondsMobSpawn.equals(other.secondsMobSpawn))
			return false;
		if (spawns == null) {
			if (other.spawns != null)
				return false;
		} else if (!spawns.equals(other.spawns))
			return false;
		if (tiempoPartida == null) {
			if (other.tiempoPartida != null)
				return false;
		} else if (!tiempoPartida.equals(other.tiempoPartida))
			return false;
		return true;
	}


	
	
	
}

