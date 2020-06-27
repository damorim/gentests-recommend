package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;
import java.net.Socket;
import java.util.*;
import java.net.Socket;
import java.util.Vector;

public class TestValues {

  /** Fernando ***/
  
	// case OPEN_ORDER
	public static DataInputStream disOne_fernando() {
		int version = 22;

		int m_orderId = 1;

		// version >= 17
		int m_conId = 2;

		String m_symbol = "3";
		String m_secType = "4";
		String m_expiry = "5";
		double m_strike = 6.00;
		String m_right = "7";
		String m_exchange = "8";
		String m_currency = "9";

		// version >= 2
		String m_localSymbol = "10";

		String m_action = "11";
		int m_totalQuantity = 12;
		String m_orderType = "13";
		double m_lmtPrice = 14.00;
		double m_auxPrice = 15.00;
		String m_tif = "16";
		String m_ocaGroup = "17";
		String m_account = "18";
		String m_openClose = "19";
		int m_origin = 20;
		String m_orderRef = "21";

		// version >= 3
		int m_clientId = 22;

		// version >= 4
		int m_permId = 23;

		// version >= 18
		int m_outsideRth = 1;

		int m_hidden = 1;
		double m_discretionaryAmt = 24.00;

		// version >= 5
		String m_goodAfterTime = "25";

		// version >= 6
		String skip = "0";

		// version >= 7
		String m_faGroup = "26";
		String m_faMethod = "27";
		String m_faPercentage = "28";
		String m_faProfile = "29";

		// version >= 8
		String m_goodTillDate = "30";

		// version >= 9
		String m_rule80A = "31";
		double m_percentOffset = 32.00;
		String m_settlingFirm = "33";
		int m_shortSaleSlot = 34;
		String m_designatedLocation = "35";
		int m_auctionStrategy = 36;
		double m_startingPrice = 37.00;
		double m_stockRefPrice = 38.00;
		double m_delta = 39.00;
		double m_stockRangeLower = 40.00;
		double m_stockRangeUpper = 41.00;
		int m_displaySize = 42;
		int m_blockOrder = 1;
		int m_sweepToFill = 1;
		int m_allOrNone = 1;
		int m_minQty = 43;
		int m_ocaType = 44;
		int m_eTradeOnly = 1;
		int m_firmQuoteOnly = 1;
		double m_nbboPriceCap = 45.00;

		// version >= 10
		int m_parentId = 46;
		int m_triggerMethod = 47;

		// version >= 11
		double m_volatility = 48.00;
		int m_volatilityType = 49;
		String m_deltaNeutralOrderType = "51";
		double m_deltaNeutralAuxPrice = 52.00;
		int m_continuousUpdate = 53;
		int m_referencePriceType = 56;

		// version >= 13
		double m_trailStopPrice = 57.00;

		// version >= 14
		double m_basisPoints = 58.00;
		int m_basisPointsType = 59;
		String m_comboLegsDescrip = "Descrição";

		// version >= 15
		int m_scaleInitLevelSize = 60;
		int m_scaleSubsLevelSize = 61;
		String m_scalePriceIncrement = "62.00";

		// version >= 19
		String m_clearingAccount = "63";
		String m_clearingIntent = "64";

		// version >= 22
		int m_notHeld = 1;

		// version >= 20
		int if_boolean = 1;
		int m_conId_1 = 65;
		double m_delta_1 = 66.00;
		double m_price = 67.00;

		// version >= 21
		String m_algoStrategy = "strategy";
		int algoParamsCount = 1;
		String m_tag = "69";
		String m_value = "70";

		// version >= 16
		int m_whatIf = 1;
		String m_status = "71";
		String m_initMargin = "72";
		String m_maintMargin = "73";
		String m_equityWithLoan = "74";
		String m_commission = "75";
		String m_minCommission = "76";
		String m_maxCommission = "77";
		String m_commissionCurrency = "78";
		String m_warningText = "79";

		String all = "5" + "\0" + version + "\0" + m_orderId + "\0" + m_conId + "\0" + m_symbol + "\0" + m_secType
				+ "\0" + m_expiry + "\0" + m_strike + "\0" + m_right + "\0" + m_exchange + "\0" + m_currency + "\0"
				+ m_localSymbol + "\0" + m_action + "\0" + m_totalQuantity + "\0" + m_orderType + "\0" + m_lmtPrice
				+ "\0" + m_auxPrice + "\0" + m_tif + "\0" + m_ocaGroup + "\0" + m_account + "\0" + m_openClose + "\0"
				+ m_origin + "\0" + m_orderRef + "\0" + m_clientId + "\0" + m_permId + "\0" + m_outsideRth + "\0"
				+ m_hidden + "\0" + m_discretionaryAmt + "\0" + m_goodAfterTime + "\0" + skip + "\0" + m_faGroup + "\0"
				+ m_faMethod + "\0" + m_faPercentage + "\0" + m_faProfile + "\0" + m_goodTillDate + "\0" + m_rule80A
				+ "\0" + m_percentOffset + "\0" + m_settlingFirm + "\0" + m_shortSaleSlot + "\0" + m_designatedLocation
				+ "\0" + m_auctionStrategy + "\0" + m_startingPrice + "\0" + m_stockRefPrice + "\0" + m_delta + "\0"
				+ m_stockRangeLower + "\0" + m_stockRangeUpper + "\0" + m_displaySize + "\0" + m_blockOrder + "\0"
				+ m_sweepToFill + "\0" + m_allOrNone + "\0" + m_minQty + "\0" + m_ocaType + "\0" + m_eTradeOnly + "\0"
				+ m_firmQuoteOnly + "\0" + m_nbboPriceCap + "\0" + m_parentId + "\0" + m_triggerMethod + "\0"
				+ m_volatility + "\0" + m_volatilityType + "\0" + m_deltaNeutralOrderType + "\0"
				+ m_deltaNeutralAuxPrice + "\0" + m_continuousUpdate + "\0" + m_referencePriceType + "\0"
				+ m_trailStopPrice + "\0" + m_basisPoints + "\0" + m_basisPointsType + "\0" + m_comboLegsDescrip + "\0"
				+ m_scaleInitLevelSize + "\0" + m_scaleSubsLevelSize + "\0" + m_scalePriceIncrement + "\0"
				+ m_clearingAccount + "\0" + m_clearingIntent + "\0" + m_notHeld + "\0" + if_boolean + "\0" + m_conId_1
				+ "\0" + m_delta_1 + "\0" + m_price + "\0" + m_algoStrategy + "\0" + algoParamsCount + "\0" + m_tag
				+ "\0" + m_value + "\0" + m_whatIf + "\0" + m_status + "\0" + m_initMargin + "\0" + m_maintMargin + "\0"
				+ m_equityWithLoan + "\0" + m_commission + "\0" + m_minCommission + "\0" + m_maxCommission + "\0"
				+ m_commissionCurrency + "\0" + m_warningText + "\0" + "-1" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	
  
    /** Saulo **/
  
    public static DataInputStream disOne_saulo() {
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
	
	public static DataInputStream disOne2_saulo() {
        String all = "21" + "\0" + "2" + "\0" + "3" + "\0" + "13" + "\0" + "-3.05" + "\0" + "4.45" + "\0"+ "6.54" + "\0"+ "5.12" + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }

	public static DataInputStream disOne3_saulo() {
        String all = "21" + "\0" + "2" + "\0" + "3" + "\0" + "15" + "\0" + "-3.05" + "\0" + "4.45" + "\0"+ "6.54" + "\0"+ "5.12" + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }
	
  
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
			public void execDetailsEnd(int reqId) {
			}

			@Override
			public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {
			}

			@Override
			public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side,
					double price, int size) {
			}

			@Override
			public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {
			}

			@Override
			public void managedAccounts(String accountsList) {
			}

			@Override
			public void receiveFA(int faDataType, String xml) {
			}

			@Override
			public void historicalData(int reqId, String date, double open, double high, double low, double close,
					int volume, int count, double WAP, boolean hasGaps) {
			}

			@Override
			public void scannerParameters(String xml) {
			}

			@Override
			public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance,
					String benchmark, String projection, String legsStr) {
			}

			@Override
			public void scannerDataEnd(int reqId) {
			}

			@Override
			public void realtimeBar(int reqId, long time, double open, double high, double low, double close,
					long volume, double wap, int count) {
			}

			@Override
			public void currentTime(long time) {
			}

			@Override
			public void fundamentalData(int reqId, String data) {
			}

			@Override
			public void deltaNeutralValidation(int reqId, UnderComp underComp) {
			}

			@Override
			public void tickSnapshotEnd(int reqId) {
			}

			@Override
			public void stopRequested() {
			}

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
  
  /** Borba **/

	
	public static DataInputStream orderStatus() {
		//first input of values
		String switchCase = "3", version = "6", id = "2", status = "status", filled = "7", remaining = "8", avgFillPrice = "2.64";
		String firstInput = switchCase + "\0" + version + "\0" + id + "\0" + status + "\0" + filled + "\0" + remaining + "\0" + avgFillPrice + "\0";
		//second input of values, all this values are inside the if cases
		String permId = "0", parentId = "10", lastFillPrice = "6.9", clientId = "5", whyHeld = "whyHeld";
		String secondInput = permId + "\0" + parentId + "\0" + lastFillPrice + "\0" + clientId + "\0" + whyHeld + "\0";
		
		return new DataInputStream(new StringBufferInputStream(firstInput + secondInput));
	}

	public static DataInputStream acctValue() {
		String switchCase = "6";
		String version = "2";
		String key = "key";
		String val = "val";
		String cur = "cur";
		String accountName = "Name";
		String input = switchCase + "\0" + version + "\0" + key + "\0" + val + "\0" + cur + "\0" + accountName + "\0";

		return new DataInputStream(new StringBufferInputStream(input));
	}
    
}
