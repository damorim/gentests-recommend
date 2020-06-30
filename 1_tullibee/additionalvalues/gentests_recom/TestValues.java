package gentests_recom;

import randoop.*;

import java.io.*;
import com.ib.client.*;
import java.net.Socket;
import java.util.*;
import java.net.Socket;
import java.util.Vector;

public class TestValues {
    
    /** Fernando (fhaa@cin.ufpe.br) ***/
    
	// covers EReader.processMsg(2):148-156
	public static DataInputStream tickSize_fernando() {
		int version = 1;
		int tickerId = 2;
		int tickType = 3;
		int size = 4;
		String all = "2" + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + size + "\0" + "-1" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}
    
    // covers EReader.processMsg(17):776-809
    public static DataInputStream historicalData_fernando() {
		int version = 3;
		int reqId = 1;
		String startDateStr = "21/06/2020";
		String endDateStr = "21/06/2020";
		int itemCount = 1;
		String date = "21/06/2020";
		double open = 1.00;
		double high = 2.00;
		double low = 3.00;
		double close = 4.00;
		int volume = 5;
		double WAP = 6.00;
		String hasGaps = "false";
		int barCount = 7;

		String all = "17" + "\0" + version + "\0" + reqId + "\0" + startDateStr + "\0" + endDateStr + "\0" + itemCount
				+ "\0" + date + "\0" + open + "\0" + high + "\0" + low + "\0" + close + "\0" + volume + "\0" + WAP
				+ "\0" + hasGaps + "\0" + barCount + "\0" + "-1" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
    }
    
	// covers EReader.processMsg(5):340-539
	public static DataInputStream openOrder_fernando() {
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
    //TODO: coloque a linha coberta em cada metodo (conforme orientacao classrooom. como rafael, abaixo)
  
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
	
    
	/*** Rafael Mota ***/
  
	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order, OrderState):137-140
	public static DataInputStream disOpenOrderBag_rafaelmota() {
        String action = "5"; // open order action
        String version = "14";

        String all = action + "\0" 
			+ version + "\0" 
			+ "3" + "\0" 
			+ "4" + "\0" 
			+ "BAG" + "\0" ; // pass the m_secType as BAG

		// fill the rest of parameters needed for this version
		// inclunding the m_comboLegsDescrip parameter
		for (int i = 0; i < 61; i++) {
			all += ("1" + "\0");
		}
		// add end of message action number
		all += "-1" + "\0";

        return new DataInputStream(new StringBufferInputStream(all));        
    }

	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order, OrderState):147-153
	public static DataInputStream disOpenOrderUnderComp_rafaelmota() {
        String action = "5"; // open order action
        String version = "20"; // version just enough to fill the UnderComp field

        String all = action + "\0" 
			+ version + "\0";

		// fill the parameters needed for this version
		// including the UnderComp values
		for (int i = 0; i < 84; i++) {
			all += ("1" + "\0");
		}
		// add end of message action number
		all += "-1" + "\0";

        return new DataInputStream(new StringBufferInputStream(all));        
    }

	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order, OrderState):155-168
	public static DataInputStream disOpenOrderAlgo_rafaelmota() {
        String action = "5"; // open order action
        String version = "21"; // version enogh to fill the algo fields

        String all = action + "\0" 
			+ version + "\0";


		// fill the needed parameters before m_algoStrategy
		for (int i = 0; i < 74; i++) {
			all += ("1" + "\0");
		}

		// fill the parameters in a way that covers all lines at m_algoStrategy branch
		all += "algo_strategy" + "\0"
			+ "2" + "\0"
			+ "tag1" + "\0"
			+ "value1" + "\0"
			+ "tag2" + "\0"
			+ "value2" + "\0";

		// fill the rest of the needed parameters for this version
		for (int i = 0; i < 10; i++) {
			all += ("1" + "\0");
		}
		// add end of message action number
		all += "-1" + "\0";

        return new DataInputStream(new StringBufferInputStream(all));        
    }

	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order, OrderState):Used to cover multiple lines
	public static EWrapper eWrapperTwo_rafaelmota() {
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
				EWrapperMsgGenerator.openOrder(orderId, contract, order, orderState);
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
    
	/*** Matheus Barbosa ***/
    //TODO: coloque a linha coberta junto a cada metodo, por favor. Ver orientacao no classroom. Alguns exemplos no arquivo.
    public static DataInputStream marketDepth_matheusbarbosa() {
        int switchCase = 12, version = 1, id = 2, position = 3, operation = 4, side = 5, size = 8;
        Double price = 6.70;
        String input = switchCase + "\0" + version + "\0" + id + "\0" + position + "\0" + operation + "\0" + side + "\0" + price + "\0" + size + "\0";
        return new DataInputStream(new StringBufferInputStream(input));
    }

    public static DataInputStream marketDepthL2_matheusbarbosa() {
        int switchCase = 13, version = 1, id = 3, position = 4, operation = 5, side = 6, size = 9;
        Double price = 7.80;
        String marketMaker = "marketMaker";
        String input = switchCase + "\0" + version + "\0" + id + "\0" + position + "\0" + marketMaker + "\0" + operation + "\0" + side + "\0" + price + "\0" + size + "\0";
        return new DataInputStream(new StringBufferInputStream(input));
    }

    public static DataInputStream newsBulletins_matheusbarbosa() {
        int switchCase = 14, version = 1, newsMsgId = 1, newsMsgType = 2;
        String newsMessage = "newsMessage", originatingExch = "originatingExch";
        String input = switchCase + "\0" + version + "\0" + newsMsgId + "\0" + newsMsgType + "\0" + newsMessage + "\0" + originatingExch + "\0";
        return new DataInputStream(new StringBufferInputStream(input));
    }

    public static int serverVersion_matheusbarbosa() {
        return 39;
    }

    public static EReader reader2_matheusbarbosa() {
        return new EReader(marketDepth_matheusbarbosa(),eWrapperOne_marcelo(), serverVersion_matheusbarbosa());
    }

    public static EReader reader3_matheusbarbosa() {
        return new EReader(marketDepthL2_matheusbarbosa(),eWrapperOne_marcelo(), serverVersion_matheusbarbosa());
    }

    public static EReader reader4_matheusbarbosa() {
        return new EReader(newsBulletins_matheusbarbosa(), eWrapperOne_marcelo(), serverVersion_matheusbarbosa());
    }


	/** Victor Melo **/
  
  	public static DataInputStream readerTickPrice_victormelo() {
		String action = "1";
		int version = 1;
		int tickerId = 213;
		int tickType = 2;
		double price = 20.50;
		String all = action + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" +
				price + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream readerTickSize_victormelo() {
		String action = "2";
		int version = 1;
		int tickerId = 213;
		int tickType = 2;
		int size = 5;
		String all = action + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + size + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream readerTickOptionComputation_victormelo() {
		String action = "3";
		int version = 1;
		int tickerId = 213;
		int tickType = 2;
		double impliedVol = 10.00;
		String all = action + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + impliedVol + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static void eReaderTickPrice_victormelo() {
		new com.ib.client.EReader(readerTickPrice_victormelo(), eWrapperOne_marcelo(), 44);
	}

	public static void eReaderTickSize_victormelo() {
		new com.ib.client.EReader(readerTickSize_victormelo(), eWrapperOne_marcelo(), 44);
	}

	public static void eReaderTickOptionComputation_victormelo() {
		new com.ib.client.EReader(readerTickOptionComputation_victormelo(), eWrapperOne_marcelo(), 44);
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
	
	public static Vector vectorOne_claudiocarvalho() {
		return new Vector(Arrays.asList("A", "B", "C"));
	}

	public static Vector vectorTwo_claudiocarvalho() {
		return new Vector(Arrays.asList("X", "Y", "Z"));
	}

	public static Vector vectorThree_claudiocarvalho() {
		return new Vector(Arrays.asList("X", "Y"));
	}

	public static Vector vectorFour_claudiocarvalho() {
		return new Vector();
	}
    
    /** Lais **/
    // TODO: (1) Vc. esta chamando metodos nao relacionado a construcao do objeto retornado (ex. cont0.equals abaixo), 
	//       (2) Vc. esta construindo objetos nao relacionados ao objeto retornado. Por exemplo, vc. retorna cont0 e constroi cont1 que nao tem nenhuma relacao com cont0

    public static TickType tickTypeOne_lais() {
        TickType tick = new TickType();
        for (int i = 0; i < 50; i ++) {
            tick.getField(i);
        }
        return tick;
    }
    
    // public static UnderComp underCompOne_lais() {
    //     UnderComp under = new UnderComp();
    //     under.m_delta = 0;
    //     under.m_conId = 0;
    //     under.m_price = 0;
    //     UnderComp underZero = new UnderComp();
    //     underZero.m_delta = 0;
    //     underZero.m_conId = 0;
    //     underZero.m_price = 0;
    //     under.equals(underZero);
    //     return under;
    // }
    
    // public static UnderComp underCompTwo_lais() {
    //     UnderComp under = new UnderComp();
    //     under.equals(null);
    //     return under;
    // }
 
    // public static UnderComp underCompThree_lais() {
    //     UnderComp under = new UnderComp();
    //     UnderComp underNotZero = new UnderComp();
    //     underNotZero.m_conId = 1;
    //     under.equals(underNotZero);
    //     return under;
    // }
    
    // public static UnderComp underCompThree1_lais() {
    // 	UnderComp under = new UnderComp();
    // 	UnderComp underNotZero = new UnderComp();
    // 	underNotZero.m_delta = 1.0;
    // 	under.equals(underNotZero);
    // 	return under;
    // }
    
    // public static UnderComp underCompThree2_lais() {
    // 	UnderComp under = new UnderComp();
    // 	UnderComp underNotZero = new UnderComp();
    // 	underNotZero.m_price = 2.0;
    // 	under.equals(underNotZero);
    // 	return under;
    // }
    
    public static DataInputStream disOne_lais() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }

	/*** Denini Gabriel ***/
	//TODO: Sinceramente, nao entendi isto. Nao vejo necessidade/vantagem de se 
	// criar objetos Singleton. Na pratica a unica coisa que vc. fez foi criar um 
	// objeto TagValue com duas strings arbitrarias. Eu acredito que Randoop
	// conseguiria fazer isto sem a ajuda deste seu metodo fabrica. Estranho!

   //TODO: conforme orientacao no classroom, coloca a linha coberta por cada fabrica junto ao nome do metodo, por favor.  -Marcelo
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
	
    public static DataInputStream portfolioCaseDataStream_lucascardoso() {
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
    
    public static DataInputStream portfolioCaseDataStream2_lucascardoso() {
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
    
    public static DataInputStream acctUpdateTimeDatastream_lucascardoso() {
        String action = "8";
        String version = "6";
        String timeStamp = "qw";
        String end = "-1";
        String all = action + "\0" + version + "\0" + timeStamp + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }
   
    public static EReader reader2_lucascardoso() {
        return new EReader(portfolioCaseDataStream_lucascardoso(),eWrapperOne_marcelo(), version_marcela()); 
    }
    
    public static EReader reader3_lucascardoso() {
        return new EReader(portfolioCaseDataStream2_lucascardoso(),eWrapperOne_marcelo(), version_marcela());
    }
    
    public static EReader reader4_lucascardoso() {
        return new EReader(acctUpdateTimeDatastream_lucascardoso(), eWrapperOne_marcelo(), version_marcela());
    }
  
    /** Marcela **/
  
    public static DataInputStream msgId_marcela() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }

	public static DataInputStream nextValidIdCase_marcela() {
		String switchCase = "9";
		String version = "2";
		String orderId = "8";
		String all = switchCase+"\0"+version+"\0"+orderId+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream managedAcctsCase_marcela() {
		String switchCase = "15";
		String version = "2";
		String accountsList = "2,3,5,12";
		String all = switchCase+"\0"+version+"\0"+accountsList+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream receiveFaCase_marcela() {
		String switchCase = "16";
		String version = "2";
		String faDataType = "14";
		String xml = "<?xml version='1.0'?>";
		String all = switchCase+"\0"+version+"\0"+faDataType+"\0"+xml+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static int version_marcela() {
		return 39;
	}

	public static EReader readerNextValidIdCase_marcela() {
		return new EReader(nextValidIdCase_marcela(), eWrapperOne_marcelo(), version_marcela());
	}

	public static EReader readerManagedAcctsCase_marcela() {
		return new EReader(managedAcctsCase_marcela(), eWrapperOne_marcelo(), version_marcela());
	}

	public static EReader readerReceiveFaCase_marcela() {
		return new EReader(receiveFaCase_marcela(), eWrapperOne_marcelo(), version_marcela());
	}

  
	/** Aldiberg  does not improve coverage **/
	

    public static DataInputStream disOneOne_aldiberg() {
		//case : BOND_CONTRACT_DATA -> Ereader.processMsg(629)
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

	public static DataInputStream disOneTwo_aldiberg() {
		//case: ACCT_DOWNLOAD_END -> Ereader.processMsg(856)
		String action = "54";
		String interino = "1";
		String textinput = "berg";
		String input =  action + "\0"+ interino + "\0" + textinput+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
    }
    
	public static DataInputStream disOneThree_aldiberg() {
		//case: EXECUTION_DATA_END -> Ereader.processMsg(861)
		String action = "55";
		String interino = "1";
		String input =  action + "\0"+ interino +"\0" + interino+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}

	public static EReader eReaderOne_aldiberg(){
        return new com.ib.client.EReader(disOneOne(), eWrapperOne(), 44);
	}

	public static EReader eReaderTwo_aldiberg(){
        return new com.ib.client.EReader(disOneTwo(), eWrapperOne(), 44);
	}

	public static EReader eReaderThree_aldiberg(){
        return new com.ib.client.EReader(disOneThree(), eWrapperOne(), 44);
    }
    
	/*** Daniel Bastos ***/
	//TODO: Nao use metodo void. Ver abaixo. -Marcelo
    
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
    
    // public static void eReaderOne_db() {
    //     new com.ib.client.EReader(disTwo_db(), eWrapperOne(), 44).run();
    // }
    
    // public static void eReaderTwo_db() {
    //     new com.ib.client.EReader(disOne_db(), eWrapperOne(), 44).run();
    // }
    
    // public static void eReaderThree_db() {
    //     String answer = "11" + "\0" + "7" + "\0";
    //     for(int i = 0; i < 23; i++) {
    //         answer += "11" + "\0";
    //     }
    //     new com.ib.client.EReader(new DataInputStream(new StringBufferInputStream(answer)), eWrapperOne(), 44).run();
    // }
    
    
	/*** Lucas Barros ***/
    
    public static DataInputStream disOne2_lucasbarros() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements_lucasbarros("3", "1")));
    }
    
    public static DataInputStream disOne3_lucasbarros() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements_lucasbarros("3", "0")));
    }
    
      
    public static DataInputStream disOne4_lucasbarros() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements_lucasbarros("0", "1")));
    }
    
    private static String getScannerDataWithVersionAndNumberOfElements_lucasbarros(String version, String numberOfElements) {
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
    
    public static DataInputStream disOne_marcelo() {
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

	public static EWrapper eWrapperOne_marcelo() {

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
		
	/** Raquel Santos **/
	// TODO: (1) Vc. esta chamando metodos nao relacionado a construcao do objeto retornado (ex. cont0.equals abaixo), 
	//       (2) Vc. esta construindo objetos nao relacionados ao objeto retornado. Por exemplo, vc. retorna cont0 e constroi cont1 que nao tem nenhuma relacao com cont0
	
	// // case else if (p_other == null)
	// public static ComboLeg comboIsNull_raquel() {
	// 	ComboLeg comboLeg = new ComboLeg();
	// 	comboLeg.equals(null);
		
	// 	return comboLeg;
	// }

	// // case if (m_conId != l_theOther.m_conId)
	// public static ComboLeg comboNotEqualsConId_raquel() {
	// 	ComboLeg comboLeg = new ComboLeg();
	// 	comboLeg.m_conId = 3;
	// 	ComboLeg comboLegOne = new ComboLeg();
	// 	comboLegOne.m_conId = 2;
	// 	comboLeg.equals(comboLegOne); 
		
	// 	return comboLeg;
	// }
		
	// // case if (m_ratio != l_theOther.m_ratio) 
	// public static ComboLeg comboNotEqualsRatio_raquel() {
	// 	ComboLeg comboLeg = new ComboLeg();
	// 	comboLeg.m_ratio = 3;
	// 	ComboLeg comboLegOne = new ComboLeg();
	// 	comboLegOne.m_ratio = 2;
	// 	comboLeg.equals(comboLegOne); 
		
	// 	return comboLeg;
	// }
		
	// // case if (m_openClose != l_theOther.m_openClose)
	// public static ComboLeg comboNotEqualsOpenClose_raquel() {
	// 	ComboLeg comboLeg = new ComboLeg();
	// 	comboLeg.m_openClose = 1;
	// 	ComboLeg comboLegOne = new ComboLeg();
	// 	comboLegOne.m_openClose = 2;
	// 	comboLeg.equals(comboLegOne); 
		
	// 	return comboLeg;
	// }
		
	// // case if (m_shortSaleSlot != l_theOther.m_shortSaleSlot)	
	// public static ComboLeg comboNotEqualsSaleSlot_raquel() {
	// 	ComboLeg comboLeg = new ComboLeg();
	// 	comboLeg.m_shortSaleSlot = 1;
	// 	ComboLeg comboLegOne = new ComboLeg();
	// 	comboLegOne.m_shortSaleSlot = 2;
	// 	comboLeg.equals(comboLegOne); 
		
	// 	return comboLeg;
	// }

	/** Gabriela **/
	public static ExecutionFilter executionFilterNull_gabriela() {
		return null;
	}

	public static Vector vectorNull_gabriela() {
		return null;
	}

	public static Vector vectorFull_gabriela() {
		Vector v = new Vector();
		v.add(3);
		return v;
	}
	
	/** Matheus Borba **/
	public static DataInputStream orderStatus_matheusborba() {
		//first input of values
		String switchCase = "3", version = "6", id = "2", status = "status", filled = "7", remaining = "8", avgFillPrice = "2.64";
		String firstInput = switchCase + "\0" + version + "\0" + id + "\0" + status + "\0" + filled + "\0" + remaining + "\0" + avgFillPrice + "\0";
		//second input of values, all this values are inside the if cases
		String permId = "0", parentId = "10", lastFillPrice = "6.9", clientId = "5", whyHeld = "whyHeld";
		String secondInput = permId + "\0" + parentId + "\0" + lastFillPrice + "\0" + clientId + "\0" + whyHeld + "\0";	
		return new DataInputStream(new StringBufferInputStream(firstInput + secondInput));
	}

	public static DataInputStream acctValue_matheusborba() {
		String switchCase = "6";
		String version = "2";
		String key = "key";
		String val = "val";
		String cur = "cur";
		String accountName = "Name";
		String input = switchCase + "\0" + version + "\0" + key + "\0" + val + "\0" + cur + "\0" + accountName + "\0";

		return new DataInputStream(new StringBufferInputStream(input));
	}

	/*** Arnaldo Morais ***/
	// TODO: (1) Vc. esta chamando metodos nao relacionado a construcao do objeto retornado
	//       (2) Vc. esta construindo objetos nao relacionados ao objeto retornado.

	// public static ExecutionFilter executionFilterEquals55_arnaldomorais(){
	// 	ExecutionFilter f1 = new ExecutionFilter();
	// 	f1.equals(f1);
	// 	return f1;
	// }

	// public static ExecutionFilter executionFilterEquals58_arnaldomorais(){
	// 	ExecutionFilter f1 = new ExecutionFilter();
	// 	ExecutionFilter f2 = new ExecutionFilter();
	// 	f1.equals(f2);
	// 	return f1;
	// }

	// public static Order orderEquals168_arnaldommorais(){
	// 	Order o1 = new Order();
	// 	o1.equals(o1);
	// 	return o1;
	// }

	// public static Order orderEquals171_arnaldomorais(){
	// 	Order o1 = new Order();
	// 	o1.equals(null);
	// 	return o1;
	// }

	/*** Igor dos Santos ***/

	//TODO: Nao use reflection! -Marcelo
	
	//  public static OrderState equalsOne_igorsantos() throws Exception {
		// Constructor<OrderState> constructorOne, constructorTwo;
		// constructorOne = OrderState.class.getConstructor(String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, String.class, String.class);
		// constructorTwo = OrderState.class.getConstructor();
		// OrderState orderStateOne = (OrderState) constructorOne.newInstance("status", "initMargin", "maintMargin",
		// 	"equityWithLoan", 0.5, 0.25,
		// 	0.75, "commissionCurrency", "warningText");
			
		// constructorTwo = OrderState.class.getConstructor(String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, String.class, String.class);
		// OrderState orderStateTwo = (OrderState) constructorTwo.newInstance("status", "initMargin", "maintMargin",
		// 	"equityWithLoan", 0.53, 0.27,
		// 	0.79, "commissionCurrency", "warningText");

		// orderStateOne.equals(orderStateTwo);
		// return orderStateOne;
	//  }
		
	//  public static OrderState equalsTwo_igorsantos() throws Exception {
		// Constructor<OrderState> constructor;
		// constructor = OrderState.class.getConstructor(String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, String.class, String.class);
		// OrderState orderState = (OrderState) constructor.newInstance("status", "initMargin", "maintMargin",
		// 	"equityWithLoan", 0.5, 0.25,
		// 	0.75, "commissionCurrency", "warningText");
			
		// orderState.equals(orderState);
		// return orderState;
	//  }
		
	//  public static OrderState equalsThree_igorsantos() throws Exception {
		// Constructor<OrderState> constructorOne, constructorTwo;
		// constructorOne = OrderState.class.getConstructor(String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, String.class, String.class);
		// OrderState orderStateOne = (OrderState) constructorOne.newInstance("status1", "initMargin", "maintMargin",
		// 	"equityWithLoan", 0.5, 0.25,
		// 	0.75, "commissionCurrency", "warningText");
			
		// constructorTwo = OrderState.class.getConstructor(String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, String.class, String.class);
		// OrderState orderStateTwo = (OrderState) constructorTwo.newInstance("status2", "initMargin", "maintMargin",
		// 	"equityWithLoan", 0.5, 0.25,
		// 	0.75, "commissionCurrency", "warningText");
		
		// orderStateOne.equals(orderStateTwo);
		// return orderStateOne;
	//  }

	/*** Rodrigo ***/
	
	public static DataInputStream disOneScanner_rodrigo() {
		String action = "19";
		String part1 = "1";
		String part2 = "xmlfile";
		String all = action + "\0" + part1 + "\0" + part2 + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disOneFundamental_rodrigo() {
		String action = "51";
		String part1 = "1";
		String part2 = "2";
		String part3 = "3";
		String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0";

		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disOneTime_rodrigo() {
		String action = "49";
		String part1 = "1";
		String part2 = "101";
		String all = action + "\0" + part1 + "\0" + part2 + "\0";

		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static void eReaderScanner_rodrigo() {
		new com.ib.client.EReader(disOneScanner_rodrigo(), eWrapperOne_marcelo(), 13).run();
	}

	public static void eReaderTime_rodrigo() {
		new com.ib.client.EReader(disOneTime_rodrigo(), eWrapperOne_marcelo(), 13).run();
	}

	/*** Vinicius Siqueira ***/
	
	// TODO: (1) Vc. esta chamando metodos nao relacionado a construcao do objeto retornado (ex. cont0.equals abaixo), 
	//       (2) Vc. esta construindo objetos nao relacionados ao objeto retornado. Por exemplo, vc. retorna cont0 e constroi cont1 que nao tem nenhuma relacao com cont0

	// //line 103~105
	// public static Contract brchSecType_vinicius() {
	// 	Contract cont0 = new Contract();
	// 	cont0.m_secType = "Suj01";
	// 	Contract cont1 = new Contract();
	// 	cont1.m_secType = "Suj02";			
	// 	cont0.equals(cont1); // Por que vc. colocou isto aqui? -Marcelo
	// 	return cont0;
	// }

	// //line 107~112
	// public static Contract brch107_vinicius() {
	// 	Contract cont0 = new Contract();
	// 	cont0.m_symbol = "Suj01-sym";
	// 	cont0.m_exchange = "Suj01-exc";
	// 	cont0.m_primaryExch = "Suj01-priEx";
	// 	cont0.m_currency = "Suj01-cur";
	// 	Contract cont1 = new Contract();
	// 	cont1.m_symbol = "Suj02-sym";
	// 	cont1.m_exchange = "Suj02-exc";
	// 	cont1.m_primaryExch = "Suj02-priEx";
	// 	cont1.m_currency = "Suj02-cur";
	// 	cont0.equals(cont1);
	// 	return cont0;
	// }
	
	// //line 128~130
	// public static Contract brchIdType_vinicius() {
	// 	Contract cont0 = new Contract();
	// 	cont0.m_secIdType = "Suj01";
	// 	Contract cont1 = new Contract();
	// 	cont1.m_secIdType = "Suj02";			
	// 	cont0.equals(cont1);    	
	// 	return cont0;
	// }

	// //line 132~134
	// public static Contract brchSecId_vinicius() {
	// 	Contract cont0 = new Contract();
	// 	cont0.m_secId = "Suj01";
	// 	Contract cont1 = new Contract();
	// 	cont1.m_secId = "Suj02";				
	// 	cont0.equals(cont1);
	// 	return cont0;
	// }    

    /* Vinicius Thiago (vtls@cin.ufpe.br) */
    
    //Cover 137
    public static Contract returnContractVector1() {
    	Contract cont = new Contract();
    	Vector v1 = new Vector();
    	v1.add(1);
    	cont.m_comboLegs = v1;
    	return cont;
    }

    //Cover 137
    public static Contract returnContractVector2() {
    	Contract cont1 = new Contract();
    	Vector v2 = new Vector();
    	v2.add(2);  	
    	cont1.m_comboLegs = v2;
    	return cont1;
    }

    //Cover 137
    // TODO: poderia retornar True/False como fabrica de Boolean. Nao pode chamar diretamente equals.
    // public static Boolean linha137(){ 
    // 	return returnContractVector1().equals(returnContractVector2());
    // }

    //Cover 141
    public static Contract returnContractUnder1() {
    	Contract cont = new Contract();
    	UnderComp under1 = new UnderComp();
    	under1.m_conId = 1;
    	cont.m_underComp = under1;
    	return cont;
    }

    //Cover 141
    public static Contract returnContractUnder2() {
    	Contract cont1 = new Contract();
    	UnderComp under2 = new UnderComp();
    	cont1.m_underComp = under2;
    	return cont1;
    }

    //Cover 141
    // public static Boolean linha141(){
    // 	return returnContractUnder1().equals(returnContractUnder2());
    // }


    //Cover 141 (Branch False)
    // public static Boolean linha141False(){
    // 	Contract c1 = returnContractUnder1();
    // 	Contract c2 = returnContractUnder2();
    // 	UnderComp uc1 = new UnderComp();
    // 	c1.m_underComp = uc1;
    // 	c2.m_underComp = uc1;
    // 	return c1.equals(c2);
    // }

    //Cover 142
    // public static Boolean linha142(){
    // 	Contract c1 = returnContractUnder1();
    // 	Contract c2 = returnContractUnder2();

    // 	c2.m_underComp = null;

    // 	return c1.equals(c2);
    // }
    
	//Galileu Santos 

	public static DataInputStream msgIdBufferStreamGalileu() {
		return new DataInputStream(new StringBufferInputStream("1\0"));
	}

	public static EWrapper eWrapperOneGalileu() {

		return new com.ib.client.EWrapper() {

		@Override
		public void error(Exception e) { e.printStackTrace(); }

		@Override
		public void error(String str) {}

		@Override
		public void error(int id, int errorCode, String errorMsg) {	}

		@Override
		public void connectionClosed() {}

		@Override
		public void tickPrice(int tickerId, int field, double price, int canAutoExecute) {}

		@Override
		public void tickSize(int tickerId, int field, int size) {}

		@Override
		public void tickOptionComputation(int tickerId, int field, double impliedVol, double delta,
				double modelPrice, double pvDividend) {}

		@Override
		public void tickGeneric(int tickerId, int tickType, double value) {	}

		@Override
		public void tickString(int tickerId, int tickType, String value) {	}

		@Override
		public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints,
				double impliedFuture, int holdDays, String futureExpiry, double dividendImpact,
				double dividendsToExpiry) {	}

		@Override
		public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice,
				int permId, int parentId, double lastFillPrice, int clientId, String whyHeld) {	}

		@Override
		public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {	}

		@Override
		public void openOrderEnd() {}

		@Override
		public void updateAccountValue(String key, String value, String currency, String accountName) {	}

		@Override
		public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue,
				double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {	}

		@Override
		public void updateAccountTime(String timeStamp) {}

		@Override
		public void accountDownloadEnd(String accountName) {}

		@Override
		public void nextValidId(int orderId) {}

		@Override
		public void contractDetails(int reqId, ContractDetails contractDetails) {}

		@Override
		public void bondContractDetails(int reqId, ContractDetails contractDetails) {}

		@Override
		public void contractDetailsEnd(int reqId) {	}

		@Override
		public void execDetails(int reqId, Contract contract, Execution execution) {}

		@Override
		public void execDetailsEnd(int reqId) {	}

		@Override
		public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {}

		@Override
		public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side,
				double price, int size) {}

		@Override
		public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {	}

		@Override
		public void managedAccounts(String accountsList) {	}

		@Override
		public void receiveFA(int faDataType, String xml) {	}

		@Override
		public void historicalData(int reqId, String date, double open, double high, double low, double close,
				int volume, int count, double WAP, boolean hasGaps) {	}

		@Override
		public void scannerParameters(String xml) {	}

		@Override
		public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance,
				String benchmark, String projection, String legsStr) {	}

		@Override
		public void scannerDataEnd(int reqId) {	}

		@Override
		public void realtimeBar(int reqId, long time, double open, double high, double low, double close,
				long volume, double wap, int count) {	}

		@Override
		public void currentTime(long time) {	}

		@Override
		public void fundamentalData(int reqId, String data) {	}

		@Override
		public void deltaNeutralValidation(int reqId, UnderComp underComp) {	}

		@Override
		public void tickSnapshotEnd(int reqId) {	}

		@Override
		public void stopRequested() {		}

		};
		
	}    

	public static DataInputStream tickGenericGalileu() {
		String action_TICK_GENERIC = "45",
				version = "2",
				tickerId = "7",
				tickType = "8",
				value = "2.57";
		String all = action_TICK_GENERIC+"\0"+version+"\0"+tickerId+"\0"+tickType+"\0"+value+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream tickStringGalileu() {
		String action_TICK_STRING = "46",
				version = "1",
				tickerId = "7",
				tickType = "5",
				value = "value";
		String all = action_TICK_STRING+"\0"+version+"\0"+tickerId+"\0"+tickType+"\0"+value+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}
	

	public static DataInputStream errMgsGalileu() {
		String action_ERR_MSG = "4",
				version = "1",
				msg = "msg";

		// True Condition
		String errTrue = action_ERR_MSG+"\0"+version+"\0"+msg+"\0";

		// False Condition
		version = "5";
		String id = "5",
				errorCode = "1",
				errorMsg = "errorMsg";

		String errFalse = action_ERR_MSG+"\0"+version+"\0"+id+"\0"+errorCode+"\0"+errorMsg+"\0";

		return new DataInputStream(new StringBufferInputStream(errTrue + errFalse));
	}
	
	public static int versionGalileu() {
		return 39;
	}

	public static EReader readerTickGenericGalileu() {
		return new EReader(tickGenericGalileu(), eWrapperOne_galileu(), versionGalileu());
	}

	public static EReader readerTickStringGalileu() {
		return new EReader(tickStringGalileu(), eWrapperOne_galileu(), versionGalileu());
	}

	public static EReader readerErrMgsGalileu() {
		return new EReader(errMgsGalileu(), eWrapperOne_galileu(), versionGalileu());
	}

}
