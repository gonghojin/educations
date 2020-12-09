package com.gongdel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		// simple troll
		LOGGER.info("A simple looking troll approaches.");
		SimpleTroll troll = new SimpleTroll();
		troll.attack();
		troll.fleeBattle();
		LOGGER.info("Simple troll power {}.\n", troll.getAttackPower());

		// change the behavior of the simple troll by adding a decorator
		LOGGER.info("A troll with huge club surprises you.");
		ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
		clubbedTroll.attack();
		clubbedTroll.fleeBattle();
		LOGGER.info("Clubbed troll power {}.\n", clubbedTroll.getAttackPower());
	}
}
