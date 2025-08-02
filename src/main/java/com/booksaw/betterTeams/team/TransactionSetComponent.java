package com.booksaw.betterTeams.team;

import com.booksaw.betterTeams.Team;
import com.booksaw.betterTeams.Transaction;
import com.booksaw.betterTeams.Warp;
import com.booksaw.betterTeams.team.storage.team.TeamStorage;

import java.util.ArrayList;

public class TransactionSetComponent extends SetTeamComponent<Transaction> {

	@Override
	public void load(TeamStorage section) {
		load(section.getTransactions());
	}

	@Override
	public void save(TeamStorage storage) {
		storage.setTransactions(getConvertedList());
	}

	@Override
	public String getSectionHeading() {
		return "transactions";
	}

	@Override
	public Transaction fromString(String str) {
		String[] split = str.split(";");
		return new Transaction(split);
	}

	@Override
	public String toString(Transaction component) {
		return component.toString();
	}

	@Override
	public void add(Team team, Transaction component) {
		super.add(team, component);
		team.getStorage().addTransaction(component);
	}

}
