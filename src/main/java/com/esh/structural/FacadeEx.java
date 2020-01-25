package com.esh.structural;

import java.sql.Connection;

class MySqlHelper {
	public static Connection getMySqlConnection() {
		return null;
	}

	public static String getMySQLHTMLReport() {
		return "my sql html report";
	}

	public static String getMySQLPDFReport() {
		return "my sql PDF report";
	}
}

class InformixHelper {
	public static Connection getInformixConnection() {
		return null;
	}

	public static String getInformixHTMLReport() {
		return "my informix html report";
	}

	public static String getInformixPDFReport() {
		return "my informix PDF report";
	}
}

enum DBType {
	INFORMIX, MYSQL
}

enum ReportType {
	PDF, HTML
}

class DBFacade {
	public static void generateReport(DBType dbType, ReportType reportType) {
		Connection conn = null;
		switch (dbType) {
		case MYSQL:
			conn = MySqlHelper.getMySqlConnection();
			System.out.println(
					reportType == ReportType.PDF ? MySqlHelper.getMySQLPDFReport() : MySqlHelper.getMySQLHTMLReport());
			break;
		case INFORMIX:
			conn = InformixHelper.getInformixConnection();
			System.out.println(reportType == ReportType.PDF ? InformixHelper.getInformixPDFReport()
					: InformixHelper.getInformixHTMLReport());
			break;
		}
	}
}

public class FacadeEx {
	public static void main(String[] args) {
		DBFacade.generateReport(DBType.INFORMIX, ReportType.HTML);
	}
}
