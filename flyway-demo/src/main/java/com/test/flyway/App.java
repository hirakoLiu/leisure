package com.test.flyway;

import com.mysql.jdbc.Driver;
import org.flywaydb.core.internal.jdbc.DriverDataSource;

import javax.sql.DataSource;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/flyway?useUnicode=true&useSSL=false&characterEncoding=utf-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&aserverTimezone=UTC";
		String username = "root";
		String password = "123456";

		FlywayMigration flywayMigration = new FlywayMigration(url, username, password);
		flywayMigration.migrate();
	}
}
