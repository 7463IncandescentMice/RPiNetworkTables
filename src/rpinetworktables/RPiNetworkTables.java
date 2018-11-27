package rpinetworktables;

import edu.wpi.first.wpilibj.networktables.*;
import edu.wpi.first.wpilibj.networktables2.*;
import edu.wpi.first.wpilibj.tables.*;

public class RPiNetworkTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetworkTable.setClientMode();
		NetworkTable.setTeam(5518);
		NetworkTable table = NetworkTable.getTable("datatable");
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double x = table.getNumber("X", 0);
			System.out.println(x);
		}
	}
}