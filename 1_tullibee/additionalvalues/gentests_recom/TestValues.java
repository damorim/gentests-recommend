package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;
import java.net.Socket;
import java.util.*;
import java.net.Socket;
import java.util.Vector;

public class TestValues {
  
/** Zaulao **/
  
    public static DataInputStream disOne() {
        String action = "1";
        String part1 = "2";
        String part2 = "3";
        String part3 = "4";
        String part4 = "2.97";
        String part5 = "1";
        String end = "-1";
        String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }
	
	public static DataInputStream disOne2() {
        String all = "21" + "\0" + "2" + "\0" + "3" + "\0" + "13" + "\0" + "-3.05" + "\0" + "4.45" + "\0"+ "6.54" + "\0"+ "5.12" + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }

	public static DataInputStream disOne3() {
        String all = "21" + "\0" + "2" + "\0" + "3" + "\0" + "15" + "\0" + "-3.05" + "\0" + "4.45" + "\0"+ "6.54" + "\0"+ "5.12" + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }
	
    public static EWrapper eWrapperOne() {

  
  /*** Eden ***/
  
  	public static DataInputStream disOne_eden() {
		String action = "01293";
		String all = action + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disTwo_eden() {
		String all = "50" + "\0";
		for(int i = 0; i < 10; i++) {
			all += "112" + "\0";
		}
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disThree_eden() {
		String all = "47" + "\0";
		for(int i = 0; i < 10; i++) {
			all += "113" + "\0";
		}
		return new DataInputStream(new StringBufferInputStream(all));
	}

  
  /*** Felipe de Melo ***/
  
  	public static DataInputStream disOne_felipe() {
		return new DataInputStream(new StringBufferInputStream("-1\0"));
	}

	public static DataInputStream disTwo_felipe() {
		return new DataInputStream(new StringBufferInputStream("1\0\0"));
	}
	
	public static DataInputStream disThree_felipe() {
		return new DataInputStream(new StringBufferInputStream("9" + "\0" + "1" + "\0" + "1" + "\0"));
	}	
  
  /*** Claudio Carvalho ***/
	
	public static Vector vectorOne() {
		return new Vector(Arrays.asList("A", "B", "C"));
	}

	public static Vector vectorTwo() {
		return new Vector(Arrays.asList("X", "Y", "Z"));
	}

	public static Vector vectorThree() {
		return new Vector(Arrays.asList("X", "Y"));
	}

	public static Vector vectorFour() {
		return new Vector();
	}
    
    /** Lais **/
    
    public static TickType tickTypeOne () {
        TickType tick = new TickType();
        for (int i = 0; i < 50; i ++) {
            tick.getField(i);
        }
        return tick;
    }
    
    public static UnderComp underCompOne () {
        UnderComp under = new UnderComp();
        under.m_delta = 0;
        under.m_conId = 0;
        under.m_price = 0;
        UnderComp underZero = new UnderComp();
        underZero.m_delta = 0;
        underZero.m_conId = 0;
        underZero.m_price = 0;
        under.equals(underZero);
        return under;
    }
    
    public static UnderComp underCompTwo () {
        UnderComp under = new UnderComp();
        under.equals(null);
        return under;
    }
 
    public static UnderComp underCompThree () {
        UnderComp under = new UnderComp();
        UnderComp underNotZero = new UnderComp();
        underNotZero.m_conId = 1;
        under.equals(underNotZero);
        return under;
    }
    
    public static UnderComp underCompThree1 () {
    	UnderComp under = new UnderComp();
    	UnderComp underNotZero = new UnderComp();
    	underNotZero.m_delta = 1.0;
    	under.equals(underNotZero);
    	return under;
    }
    
    public static UnderComp underCompThree2 () {
    	UnderComp under = new UnderComp();
    	UnderComp underNotZero = new UnderComp();
    	underNotZero.m_price = 2.0;
    	under.equals(underNotZero);
    	return under;
    }
    
    public static DataInputStream disOne_lais() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }

	/*** Denini Gabriel ***/
	private static TagValue SingletonTagValue;

	public static TagValue denini4() {
		if (SingletonTagValue == null) {
			SingletonTagValue = new TagValue("Tag1", "Value1");
		}
		return SingletonTagValue;
	}

	public static TagValue denini5() {
		return denini4();
	}


    /** Arthur Castro **/
    public static DataInputStream disOne_arthur() {

		String action = "10";
		int integer = 2;
		String str = "3";
		double value = 1.999;
		String all = action + "\0" + integer + "\0" + str + "\0"
		+ str + "\0"+ str + "\0"+ value + "\0" + str + "\0"
		+ str + "\0" + str + "\0" + str + "\0" + str + "\0" + str + "\0"
		+ "\0" + integer + "\0"+ value +"\0" + str + "\0" +str + "\0"+ integer + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disTwo_arthur() {
		String action = "56";
		int integer = 2;
		double value = 1.999;
		String all = action + "\0" + integer + "\0" + integer + "\0" + integer + "\0" +
		value + "\0" + value + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disThree_arthur() {
		String action = "57";
		int integer = 2;
		String all = action + "\0" + integer + "\0" + integer + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

  
  /** Lucas Cardoso **/
	
    public static DataInputStream portfolioCaseDataStream() {
        String action = "7";
        String version = "7";
        String conId = "1";
        String symbol = "a";
        String secType = "b";
        String expirity = "c";
        String strike = "1.42";
        String right = "d";
        String multiplier = "e";
        String primaryExch = "f";
        String currency = "g";
        String localSymbol = "h";
        String position = "1";
        String marketPrice = "1.5";
        String marketValue = "2.1";
        String averageCost = "1.1";
        String unrealizedPNL = "2.2";
        String realizedPNL = "3.1";
        String accountName = "i";
        String end = "-1";
        String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" 
            + expirity + "\0" + strike + "\0" + right + "\0" + multiplier + "\0" + primaryExch + "\0"
            + currency + "\0" + localSymbol + "\0" + position + "\0" + marketPrice + "\0" + marketValue + "\0"
            + averageCost + "\0" + unrealizedPNL + "\0" + realizedPNL + "\0" + accountName + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }
    
    public static DataInputStream portfolioCaseDataStream2() {
        String action = "7";
        String version = "6";
        String conId = "1";
        String symbol = "a";
        String secType = "b";
        String expirity = "c";
        String strike = "1.42";
        String right = "d";
        String currency = "g";
        String localSymbol = "h";
        String position = "1";
        String marketPrice = "1.5";
        String marketValue = "2.1";
        String averageCost = "1.1";
        String unrealizedPNL = "2.2";
        String realizedPNL = "3.1";
        String accountName = "i";
        String primaryExch = "ds";
        String end = "-1";
        String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" 
            + expirity + "\0" + strike + "\0" + right + "\0" + currency + "\0" + localSymbol + "\0" 
            + position + "\0" + marketPrice + "\0" + marketValue + "\0"+ averageCost + "\0" 
            + unrealizedPNL + "\0" + realizedPNL + "\0" + accountName + "\0" + primaryExch + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }
    
    public static DataInputStream acctUpdateTimeDatastream() {
        String action = "8";
        String version = "6";
        String timeStamp = "qw";
        String end = "-1";
        String all = action + "\0" + version + "\0" + timeStamp + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }

    // public static EReader reader() {
	// 	return new EReader(disOne(),eWrapperOne(), 39);
	// }
    
    public static EReader reader2() {
        return new EReader(portfolioCaseDataStream(),eWrapperOne(), version()); /* version() defined by Marcela */
    }
    
    public static EReader reader3() {
        return new EReader(portfolioCaseDataStream2(),eWrapperOne(), version());
    }
    
    public static EReader reader4() {
        return new EReader(acctUpdateTimeDatastream(), eWrapperOne(), version());
    }
    
  
    /** Marcela **/
  
    public static DataInputStream msgId() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }

	public static DataInputStream nextValidIdCase() {
		String switchCase = "9";
		String version = "2";
		String orderId = "8";
		String all = switchCase+"\0"+version+"\0"+orderId+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream managedAcctsCase() {
		String switchCase = "15";
		String version = "2";
		String accountsList = "2,3,5,12";
		String all = switchCase+"\0"+version+"\0"+accountsList+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream receiveFaCase() {
		String switchCase = "16";
		String version = "2";
		String faDataType = "14";
		String xml = "<?xml version='1.0'?>";
		String all = switchCase+"\0"+version+"\0"+faDataType+"\0"+xml+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static int version() {
		return 39;
	}

	public static EReader readerNextValidIdCase() {
		return new EReader(nextValidIdCase(), eWrapperOne(), version());
	}

	public static EReader readerManagedAcctsCase() {
		return new EReader(managedAcctsCase(), eWrapperOne(), version());
	}

	public static EReader readerReceiveFaCase() {
		return new EReader(receiveFaCase(), eWrapperOne(), version());
	}

  
  /** Aldiberg  does not improve coverage **/

    public static DataInputStream disOneOne() {
		//BOND_CONTRACT_DATA
		String str = "kkeaemen";
		Double dd = 7.77;
		int interino = 1;
		String action = "18";
		String input = action + "\0" + interino + "\0"+ str +"\0" + str + "\0" + 
		str +"\0" + dd + "\0"+ str +"\0" + str + "\0"+ str +"\0" +
		str + "\0"+ str +"\0" + interino + "\0"+ 
		interino +"\0" + interino + "\0"+ 
		str +"\0" +  str +"\0" + str + "\0"+ str +"\0" +
		str +"\0" + interino + "\0"+ dd +"\0" +  str +"\0" + str + "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}

    public static DataInputStream disOneTwo() {
        //ACCT_DOWNLOAD_END
        String action = "54";
        String interino = "1";
        String textinput = "berg";
        String input =  action + "\0"+ interino + "\0" + textinput+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
    }
    
    public static DataInputStream disOneThree() {
        //EXECUTION_DATA_END
        String action = "55";
        String interino = "1";
        String input =  action + "\0"+ interino +"\0" + interino+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
    }
    
    public static void eReaderOne() {
        new com.ib.client.EReader(disOneOne(), eWrapperOne(), 44).run();
    }
    
    public static void eReaderTwo() {
        new com.ib.client.EReader(disOneTwo(), eWrapperOne(), 44).run();
    }
    
    public static void eReaderThree() {
        new com.ib.client.EReader(disOneThree(), eWrapperOne(), 44).run();
    }
    
    
    /*** Daniel Bastos ***/
    
    public static DataInputStream disOne_db() {
        String action = "52";
        String part1 = "2";
        String part2 = "3";
        String all = action + "\0" + part1 + "\0" + part2 + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }
    
    public static DataInputStream disTwo_db() {
        String action = "53";
        String part1 = "2";
        String all = action + "\0" + part1 + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }
    
    public static void eReaderOne_db() {
        new com.ib.client.EReader(disTwo_db(), eWrapperOne(), 44).run();
    }
    
    public static void eReaderTwo_db() {
        new com.ib.client.EReader(disOne_db(), eWrapperOne(), 44).run();
    }
    
    public static void eReaderThree_db() {
        String answer = "11" + "\0" + "7" + "\0";
        for(int i = 0; i < 23; i++) {
            answer += "11" + "\0";
        }
        new com.ib.client.EReader(new DataInputStream(new StringBufferInputStream(answer)), eWrapperOne(), 44).run();
    }
    
    
    /*** Lucas Barros ***/
    
    public static DataInputStream disOne2() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements("3", "1")));
    }
    
    public static DataInputStream disOne3() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements("3", "0")));
    }
    
      
    public static DataInputStream disOne4() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements("0", "1")));
    }
    
    private static String getScannerDataWithVersionAndNumberOfElements(String version, String numberOfElements) {
        String action = "20";
        String tickerId = "3";
        String all = action + "\0" + version + "\0" + tickerId + "\0" + numberOfElements + "\0";
        
        if (Integer.parseInt(numberOfElements) > 0) {
            String rank = "1";
            
            all += rank + "\0";

            if (Integer.parseInt(version) >= 3) {
                String m_conId = "1";
                all += m_conId + "\0";
            }
            
            for (int i = 0; i < 3; i++) {
                all += "a" + "\0";
            }
            
            String m_strike = "2.8";
            all += m_strike + "\0";
            
            for (int i = 0; i < 9; i++) {
                all += "a" + "\0";
            } 
            
            if (Integer.parseInt(version) >= 2) {
                String legsStr = "a";
                all += legsStr + "\0";
            }
        }
        
        return all;
    }
    
    /** Marcelo **/
    
    public static DataInputStream disOne() {
        String action = "1";
        String part1 = "2";
        String part2 = "3";
        String part3 = "4";
        String part4 = "2.97";
        String part5 = "1";
        String end = "-1";
        String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }

	public static EWrapper eWrapperOne() {

		return new com.ib.client.EWrapper() {

			@Override
			public void error(Exception e) {
				e.printStackTrace();
			}

			@Override
			public void error(String str) {
			}

			@Override
			public void error(int id, int errorCode, String errorMsg) {
			}

			@Override
			public void connectionClosed() {
			}

			@Override
			public void tickPrice(int tickerId, int field, double price, int canAutoExecute) {
			}

			@Override
			public void tickSize(int tickerId, int field, int size) {
			}

			@Override
			public void tickOptionComputation(int tickerId, int field, double impliedVol, double delta,
					double modelPrice, double pvDividend) {
			}

			@Override
			public void tickGeneric(int tickerId, int tickType, double value) {
			}

			@Override
			public void tickString(int tickerId, int tickType, String value) {
			}

			@Override
			public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints,
					double impliedFuture, int holdDays, String futureExpiry, double dividendImpact,
					double dividendsToExpiry) {
			}

			@Override
			public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice,
					int permId, int parentId, double lastFillPrice, int clientId, String whyHeld) {
			}

			@Override
			public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {
			}

			@Override
			public void openOrderEnd() {
			}

			@Override
			public void updateAccountValue(String key, String value, String currency, String accountName) {
			}

			@Override
			public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue,
					double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {
			}

			@Override
			public void updateAccountTime(String timeStamp) {
			}

			@Override
			public void accountDownloadEnd(String accountName) {
			}

			@Override
			public void nextValidId(int orderId) {
			}

			@Override
			public void contractDetails(int reqId, ContractDetails contractDetails) {
			}

			@Override
			public void bondContractDetails(int reqId, ContractDetails contractDetails) {
			}

			@Override
			public void contractDetailsEnd(int reqId) {
			}

			@Override
			public void execDetails(int reqId, Contract contract, Execution execution) {
			}

			@Override
			public void execDetailsEnd(int reqId) {    }


			@Override
			public void stopRequested() {    }

			@Override
			public void tickSnapshotEnd(int x) {    }

			@Override
			public void deltaNeutralValidation(int x, UnderComp y) {    }

			@Override
			public void fundamentalData(int x, String y) {    }

			@Override
			public void currentTime(long x) {}

         @Override
         public void realtimeBar(int a, long b, double c, double d, double e,double f, long g, double h ,int i) {}

         @Override
         public void scannerDataEnd(int x) {}


         @Override
         public void scannerData(int x, int y, ContractDetails z, String w, String a, String b, String c) {}

         @Override
         public void scannerParameters(String x) {}


         @Override
         public void historicalData(int a, String b, double c, double d, double e, double f, int g, int h, double i, boolean j) {}

         @Override
         public void receiveFA(int x, String y) {}

         @Override
         public void managedAccounts(String x) {}

         @Override
         public void updateNewsBulletin(int a, int b, String c, String d) {}

         @Override
         public void updateMktDepthL2(int a, int b, String c, int d, int e, double f, int g){}


         @Override
         public void updateMktDepth(int a, int b, int c, int d, double e, int f) {}

      };

   }
    

    /** Gabriela **/

	
	public static ExecutionFilter executionFilterNull() {
		return null;
	}
 
	public static Vector vectorNull() {
		return null;
	}

	public static Vector vectorFull() {
		Vector v = new Vector();
		v.add(3);
		return v;
	}

}
