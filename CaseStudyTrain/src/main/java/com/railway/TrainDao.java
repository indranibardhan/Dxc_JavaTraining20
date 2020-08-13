package com.railway;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class TrainDao {
	
	private int trainNo;
	private String TrainName;
	private String sourceStation;
	private String destinationStation;
	private double ticketPrice;

	Train findTrain(int trainNo)
	{
		try
		{
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("DXC");
			rs.setPassword("0007");
			rs.setCommand("select * from Trains where TRAIN_NO="+trainNo);
			rs.execute();
			
			while(rs.next())
			{
				this.trainNo=rs.getInt("TRAIN_NO");
				this.TrainName=rs.getString("TRAIN_NAME");
				this.sourceStation=rs.getString("SOURCE");
				this.destinationStation=rs.getString("DESTINATION");
				this.ticketPrice=rs.getDouble("TICKET_PRICE");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return Train(this.trainNo,TrainName,sourceStation,destinationStation,ticketPrice);
	}

	private Train Train(int trainNo2, String trainName2, String sourceStation2, String destinationStation2,
			double ticketPrice2) {
		// TODO Auto-generated method stub
		return null;
	}

}
