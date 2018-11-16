package com.test.flyway;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.Configuration;
import org.flywaydb.core.api.configuration.FluentConfiguration;

import javax.sql.DataSource;

/**
 * @Auther: liup
 * @Date: 2018/11/15 19:00
 * @Description:
 */
public class FlywayMigration {

	private String url;
	private String username;
	private String password;

	public FlywayMigration(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public void migrate() {
		FluentConfiguration configuration = Flyway.configure();
		Flyway flyway = configuration.dataSource(url, username, password).load();
		// Start the migration
		flyway.migrate();
	}
}
