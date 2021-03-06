package utd.database.com;

/**
 * 
 * @author nikitakothari
 *
 *         printing Help
 */

public class Help {

	public void get() {
		System.out.println(Utility.displayLine("*", 80));
		System.out.println("SUPPORTED COMMANDS");
		System.out.println("All commands below are case insensitive");
		System.out.println();
		System.out.println("\tCREATE database database_name;                   Create new database.");
		System.out.println(
				"\tCREATE table table_name(id int, name varchar);   Create new table under respective database.");
		System.out.println("\tUSE database_name;                               Switched to new database");
		System.out.println("\tDESCRIBE table_name;                             Display all the columns of table_name");
		System.out.println(
				"\tSHOW tables;                                     Display all tables under respective database.");
		System.out.println(
				"\tSHOW databases;                                  Display all the databases present in the system.");
		System.out.println("\tSELECT * FROM table_name;                        Display all records in the table.");
		System.out.println("\tSELECT * FROM table_name WHERE rowid = <value>;  Display records whose rowid is <id>.");
		System.out.println("\tDELETE * FROM table_name WHERE rowid = <value>;  Delete records whose rowid is <id>.");
		System.out.println("\tDROP TABLE table_name;                           Remove table data and its schema.");
		System.out.println("\tDROP Database database_name;                     Remove database and its table.");
		System.out.println("\tVERSION;                                         Show the program version.");
		System.out.println("\tHELP;                                            Show this help information");
		System.out.println("\tEXIT;                                            Exit the program");
		System.out.println();
		System.out.println();
		System.out.println(Utility.displayLine("*", 80));
	}
}
