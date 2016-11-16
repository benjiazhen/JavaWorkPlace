package mysqltest;

import org.junit.Test;

public class MySQLTEST {
	@Test
	public void getUsers()
	{
		MySQLUtils.getUsers();
	}
	public static void main(String[] args) {
		MySQLUtils.getUsers();
	}
}
