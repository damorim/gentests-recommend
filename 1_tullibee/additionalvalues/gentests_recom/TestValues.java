package gentests_recom;

import randoop.*;

import java.io.*;

import com.ib.client.*;

public class TestValues {
    public static DataInputStream disOne() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }

    // public static DataInputStream disOne() {
    //     String action = "1";
    //     String part1 = "2";
    //     String part2 = "3";
    //     String part3 = "4";
    //     String part4 = "2.97";
    //     String part5 = "1";
    //     String end = "-1";
    //     String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end + "\0";
    //     return new DataInputStream(new StringBufferInputStream(all));        
    // }


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

    public static DataInputStream marketDepth() {
        int switchCase = 12, version = 1, id = 2, position = 3, operation = 4, side = 5, size = 8;
        Double price = 6.70;

        String input = switchCase + "\0" + version + "\0" + id + "\0" + position + "\0" + operation + "\0" + side + "\0" + price + "\0" + size + "\0";

        return new DataInputStream(new StringBufferInputStream(input));
    }

    public static DataInputStream marketDepthL2() {
        int switchCase = 13, version = 1, id = 3, position = 4, operation = 5, side = 6, size = 9;
        Double price = 7.80;
        String marketMaker = "marketMaker";

        String input = switchCase + "\0" + version + "\0" + id + "\0" + position + "\0" + marketMaker + "\0" + operation + "\0" + side + "\0" + price + "\0" + size + "\0";

        return new DataInputStream(new StringBufferInputStream(input));
    }

    public static DataInputStream newsBulletins() {
        int switchCase = 14, version = 1, newsMsgId = 1, newsMsgType = 2;
        String newsMessage = "newsMessage", originatingExch = "originatingExch";

        String input = switchCase + "\0" + version + "\0" + newsMsgId + "\0" + newsMsgType + "\0" + newsMessage + "\0" + originatingExch + "\0";

        return new DataInputStream(new StringBufferInputStream(input));
    }

    public static int serverVersion() {
        return 39;
    }

    public static EReader reader2() {
        return new EReader(marketDepth(),eWrapperOne(), serverVersion());
    }

    public static EReader reader3() {
        return new EReader(marketDepthL2(),eWrapperOne(), serverVersion());
    }

    public static EReader reader4() {
        return new EReader(newsBulletins(), eWrapperOne(), serverVersion());
    }

}

