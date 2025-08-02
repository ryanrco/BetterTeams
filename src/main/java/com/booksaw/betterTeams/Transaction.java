package com.booksaw.betterTeams;

import lombok.Getter;

import java.util.UUID;


@Getter
public class Transaction {

	private final UUID uuid;
	private double amount;
	private long timeOf;

	public Transaction(String[] args) {
		uuid = UUID.fromString(args[0]);
		amount = Double.parseDouble(args[1]);
		timeOf = Long.parseLong(args[2]);
	}

	public Transaction(UUID uuid, double amount, long time){
		this.uuid = uuid;
		this.amount = amount;
		this.timeOf = time;

	}

	@Override
	public String toString() {
		return uuid + ";" + amount + ";" + timeOf;
	}
}
