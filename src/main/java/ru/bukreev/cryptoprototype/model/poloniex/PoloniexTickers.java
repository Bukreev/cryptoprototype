
package ru.bukreev.cryptoprototype.model.poloniex;

import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.HashMap;
import java.util.Map;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "BTC_BCN",
    "BTC_BTS",
    "BTC_DASH",
    "BTC_DOGE",
    "BTC_LTC",
    "BTC_NXT",
    "BTC_STR",
    "BTC_XEM",
    "BTC_XMR",
    "BTC_XRP",
    "USDT_BTC",
    "USDT_DASH",
    "USDT_LTC",
    "USDT_NXT",
    "USDT_STR",
    "USDT_XMR",
    "USDT_XRP",
    "BTC_ETH",
    "USDT_ETH",
    "BTC_SC",
    "BTC_DCR",
    "BTC_LSK",
    "BTC_ETC",
    "ETH_ETC",
    "USDT_ETC",
    "BTC_REP",
    "USDT_REP",
    "ETH_REP",
    "BTC_ARDR",
    "BTC_ZEC",
    "ETH_ZEC",
    "USDT_ZEC",
    "BTC_STRAT",
    "BTC_GNT",
    "BTC_ZRX",
    "ETH_ZRX",
    "BTC_CVC",
    "BTC_OMG",
    "BTC_GAS",
    "BTC_STORJ",
    "BTC_EOS",
    "ETH_EOS",
    "USDT_EOS",
    "BTC_SNT",
    "BTC_KNC",
    "BTC_BAT",
    "ETH_BAT",
    "USDT_BAT",
    "BTC_LOOM",
    "USDT_DOGE",
    "USDT_GNT",
    "USDT_LSK",
    "USDT_SC",
    "USDT_ZRX",
    "BTC_QTUM",
    "USDT_QTUM",
    "USDC_BTC",
    "USDC_ETH",
    "USDC_USDT",
    "BTC_MANA",
    "USDT_MANA",
    "BTC_BNT",
    "BTC_BCHABC",
    "USDC_BCHABC",
    "BTC_BCHSV",
    "USDC_BCHSV",
    "USDC_XRP",
    "USDC_XMR",
    "USDC_STR",
    "USDC_DOGE",
    "USDC_LTC",
    "USDC_ZEC",
    "BTC_FOAM",
    "BTC_NMR",
    "BTC_POLY",
    "BTC_LPT",
    "BTC_GRIN",
    "USDC_GRIN",
    "BTC_ATOM",
    "USDC_ATOM",
    "USDT_ATOM",
    "USDC_DASH",
    "USDC_EOS",
    "USDC_ETC",
    "USDT_BCHSV",
    "USDT_BCHABC",
    "USDT_GRIN",
    "BTC_TRX",
    "USDC_TRX",
    "USDT_TRX",
    "BTC_ETHBNT",
    "TRX_ETH",
    "TRX_XRP",
    "BTC_BTT",
    "USDT_BTT",
    "TRX_BTT",
    "USDT_WIN",
    "TRX_WIN"
})
public class PoloniexTickers {

    @JsonProperty("BTC_BCN")
    private BTCBCN bTCBCN;
    @JsonProperty("BTC_BTS")
    private BTCBTS bTCBTS;
    @JsonProperty("BTC_DASH")
    private BTCDASH bTCDASH;
    @JsonProperty("BTC_DOGE")
    private BTCDOGE bTCDOGE;
    @JsonProperty("BTC_LTC")
    private BTCLTC bTCLTC;
    @JsonProperty("BTC_NXT")
    private BTCNXT bTCNXT;
    @JsonProperty("BTC_STR")
    private BTCSTR bTCSTR;
    @JsonProperty("BTC_XEM")
    private BTCXEM bTCXEM;
    @JsonProperty("BTC_XMR")
    private BTCXMR bTCXMR;
    @JsonProperty("BTC_XRP")
    private BTCXRP bTCXRP;
    @JsonProperty("USDT_BTC")
    private USDTBTC uSDTBTC;
    @JsonProperty("USDT_DASH")
    private USDTDASH uSDTDASH;
    @JsonProperty("USDT_LTC")
    private USDTLTC uSDTLTC;
    @JsonProperty("USDT_NXT")
    private USDTNXT uSDTNXT;
    @JsonProperty("USDT_STR")
    private USDTSTR uSDTSTR;
    @JsonProperty("USDT_XMR")
    private USDTXMR uSDTXMR;
    @JsonProperty("USDT_XRP")
    private USDTXRP uSDTXRP;
    @JsonProperty("BTC_ETH")
    private BTCETH bTCETH;
    @JsonProperty("USDT_ETH")
    private USDTETH uSDTETH;
    @JsonProperty("BTC_SC")
    private BTCSC bTCSC;
    @JsonProperty("BTC_DCR")
    private BTCDCR bTCDCR;
    @JsonProperty("BTC_LSK")
    private BTCLSK bTCLSK;
    @JsonProperty("BTC_ETC")
    private BTCETC bTCETC;
    @JsonProperty("ETH_ETC")
    private ETHETC eTHETC;
    @JsonProperty("USDT_ETC")
    private USDTETC uSDTETC;
    @JsonProperty("BTC_REP")
    private BTCREP bTCREP;
    @JsonProperty("USDT_REP")
    private USDTREP uSDTREP;
    @JsonProperty("ETH_REP")
    private ETHREP eTHREP;
    @JsonProperty("BTC_ARDR")
    private BTCARDR bTCARDR;
    @JsonProperty("BTC_ZEC")
    private BTCZEC bTCZEC;
    @JsonProperty("ETH_ZEC")
    private ETHZEC eTHZEC;
    @JsonProperty("USDT_ZEC")
    private USDTZEC uSDTZEC;
    @JsonProperty("BTC_STRAT")
    private BTCSTRAT bTCSTRAT;
    @JsonProperty("BTC_GNT")
    private BTCGNT bTCGNT;
    @JsonProperty("BTC_ZRX")
    private BTCZRX bTCZRX;
    @JsonProperty("ETH_ZRX")
    private ETHZRX eTHZRX;
    @JsonProperty("BTC_CVC")
    private BTCCVC bTCCVC;
    @JsonProperty("BTC_OMG")
    private BTCOMG bTCOMG;
    @JsonProperty("BTC_GAS")
    private BTCGAS bTCGAS;
    @JsonProperty("BTC_STORJ")
    private BTCSTORJ bTCSTORJ;
    @JsonProperty("BTC_EOS")
    private BTCEOS bTCEOS;
    @JsonProperty("ETH_EOS")
    private ETHEOS eTHEOS;
    @JsonProperty("USDT_EOS")
    private USDTEOS uSDTEOS;
    @JsonProperty("BTC_SNT")
    private BTCSNT bTCSNT;
    @JsonProperty("BTC_KNC")
    private BTCKNC bTCKNC;
    @JsonProperty("BTC_BAT")
    private BTCBAT bTCBAT;
    @JsonProperty("ETH_BAT")
    private ETHBAT eTHBAT;
    @JsonProperty("USDT_BAT")
    private USDTBAT uSDTBAT;
    @JsonProperty("BTC_LOOM")
    private BTCLOOM bTCLOOM;
    @JsonProperty("USDT_DOGE")
    private USDTDOGE uSDTDOGE;
    @JsonProperty("USDT_GNT")
    private USDTGNT uSDTGNT;
    @JsonProperty("USDT_LSK")
    private USDTLSK uSDTLSK;
    @JsonProperty("USDT_SC")
    private USDTSC uSDTSC;
    @JsonProperty("USDT_ZRX")
    private USDTZRX uSDTZRX;
    @JsonProperty("BTC_QTUM")
    private BTCQTUM bTCQTUM;
    @JsonProperty("USDT_QTUM")
    private USDTQTUM uSDTQTUM;
    @JsonProperty("USDC_BTC")
    private USDCBTC uSDCBTC;
    @JsonProperty("USDC_ETH")
    private USDCETH uSDCETH;
    @JsonProperty("USDC_USDT")
    private USDCUSDT uSDCUSDT;
    @JsonProperty("BTC_MANA")
    private BTCMANA bTCMANA;
    @JsonProperty("USDT_MANA")
    private USDTMANA uSDTMANA;
    @JsonProperty("BTC_BNT")
    private BTCBNT bTCBNT;
    @JsonProperty("BTC_BCHABC")
    private BTCBCHABC bTCBCHABC;
    @JsonProperty("USDC_BCHABC")
    private USDCBCHABC uSDCBCHABC;
    @JsonProperty("BTC_BCHSV")
    private BTCBCHSV bTCBCHSV;
    @JsonProperty("USDC_BCHSV")
    private USDCBCHSV uSDCBCHSV;
    @JsonProperty("USDC_XRP")
    private USDCXRP uSDCXRP;
    @JsonProperty("USDC_XMR")
    private USDCXMR uSDCXMR;
    @JsonProperty("USDC_STR")
    private USDCSTR uSDCSTR;
    @JsonProperty("USDC_DOGE")
    private USDCDOGE uSDCDOGE;
    @JsonProperty("USDC_LTC")
    private USDCLTC uSDCLTC;
    @JsonProperty("USDC_ZEC")
    private USDCZEC uSDCZEC;
    @JsonProperty("BTC_FOAM")
    private BTCFOAM bTCFOAM;
    @JsonProperty("BTC_NMR")
    private BTCNMR bTCNMR;
    @JsonProperty("BTC_POLY")
    private BTCPOLY bTCPOLY;
    @JsonProperty("BTC_LPT")
    private BTCLPT bTCLPT;
    @JsonProperty("BTC_GRIN")
    private BTCGRIN bTCGRIN;
    @JsonProperty("USDC_GRIN")
    private USDCGRIN uSDCGRIN;
    @JsonProperty("BTC_ATOM")
    private BTCATOM bTCATOM;
    @JsonProperty("USDC_ATOM")
    private USDCATOM uSDCATOM;
    @JsonProperty("USDT_ATOM")
    private USDTATOM uSDTATOM;
    @JsonProperty("USDC_DASH")
    private USDCDASH uSDCDASH;
    @JsonProperty("USDC_EOS")
    private USDCEOS uSDCEOS;
    @JsonProperty("USDC_ETC")
    private USDCETC uSDCETC;
    @JsonProperty("USDT_BCHSV")
    private USDTBCHSV uSDTBCHSV;
    @JsonProperty("USDT_BCHABC")
    private USDTBCHABC uSDTBCHABC;
    @JsonProperty("USDT_GRIN")
    private USDTGRIN uSDTGRIN;
    @JsonProperty("BTC_TRX")
    private BTCTRX bTCTRX;
    @JsonProperty("USDC_TRX")
    private USDCTRX uSDCTRX;
    @JsonProperty("USDT_TRX")
    private USDTTRX uSDTTRX;
    @JsonProperty("BTC_ETHBNT")
    private BTCETHBNT bTCETHBNT;
    @JsonProperty("TRX_ETH")
    private TRXETH tRXETH;
    @JsonProperty("TRX_XRP")
    private TRXXRP tRXXRP;
    @JsonProperty("BTC_BTT")
    private BTCBTT bTCBTT;
    @JsonProperty("USDT_BTT")
    private USDTBTT uSDTBTT;
    @JsonProperty("TRX_BTT")
    private TRXBTT tRXBTT;
    @JsonProperty("USDT_WIN")
    private USDTWIN uSDTWIN;
    @JsonProperty("TRX_WIN")
    private TRXWIN tRXWIN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BTC_BCN")
    public BTCBCN getBTCBCN() {
        return bTCBCN;
    }

    @JsonProperty("BTC_BCN")
    public void setBTCBCN(BTCBCN bTCBCN) {
        this.bTCBCN = bTCBCN;
    }

    @JsonProperty("BTC_BTS")
    public BTCBTS getBTCBTS() {
        return bTCBTS;
    }

    @JsonProperty("BTC_BTS")
    public void setBTCBTS(BTCBTS bTCBTS) {
        this.bTCBTS = bTCBTS;
    }

    @JsonProperty("BTC_DASH")
    public BTCDASH getBTCDASH() {
        return bTCDASH;
    }

    @JsonProperty("BTC_DASH")
    public void setBTCDASH(BTCDASH bTCDASH) {
        this.bTCDASH = bTCDASH;
    }

    @JsonProperty("BTC_DOGE")
    public BTCDOGE getBTCDOGE() {
        return bTCDOGE;
    }

    @JsonProperty("BTC_DOGE")
    public void setBTCDOGE(BTCDOGE bTCDOGE) {
        this.bTCDOGE = bTCDOGE;
    }

    @JsonProperty("BTC_LTC")
    public BTCLTC getBTCLTC() {
        return bTCLTC;
    }

    @JsonProperty("BTC_LTC")
    public void setBTCLTC(BTCLTC bTCLTC) {
        this.bTCLTC = bTCLTC;
    }

    @JsonProperty("BTC_NXT")
    public BTCNXT getBTCNXT() {
        return bTCNXT;
    }

    @JsonProperty("BTC_NXT")
    public void setBTCNXT(BTCNXT bTCNXT) {
        this.bTCNXT = bTCNXT;
    }

    @JsonProperty("BTC_STR")
    public BTCSTR getBTCSTR() {
        return bTCSTR;
    }

    @JsonProperty("BTC_STR")
    public void setBTCSTR(BTCSTR bTCSTR) {
        this.bTCSTR = bTCSTR;
    }

    @JsonProperty("BTC_XEM")
    public BTCXEM getBTCXEM() {
        return bTCXEM;
    }

    @JsonProperty("BTC_XEM")
    public void setBTCXEM(BTCXEM bTCXEM) {
        this.bTCXEM = bTCXEM;
    }

    @JsonProperty("BTC_XMR")
    public BTCXMR getBTCXMR() {
        return bTCXMR;
    }

    @JsonProperty("BTC_XMR")
    public void setBTCXMR(BTCXMR bTCXMR) {
        this.bTCXMR = bTCXMR;
    }

    @JsonProperty("BTC_XRP")
    public BTCXRP getBTCXRP() {
        return bTCXRP;
    }

    @JsonProperty("BTC_XRP")
    public void setBTCXRP(BTCXRP bTCXRP) {
        this.bTCXRP = bTCXRP;
    }

    @JsonProperty("USDT_BTC")
    public USDTBTC getUSDTBTC() {
        return uSDTBTC;
    }

    @JsonProperty("USDT_BTC")
    public void setUSDTBTC(USDTBTC uSDTBTC) {
        this.uSDTBTC = uSDTBTC;
    }

    @JsonProperty("USDT_DASH")
    public USDTDASH getUSDTDASH() {
        return uSDTDASH;
    }

    @JsonProperty("USDT_DASH")
    public void setUSDTDASH(USDTDASH uSDTDASH) {
        this.uSDTDASH = uSDTDASH;
    }

    @JsonProperty("USDT_LTC")
    public USDTLTC getUSDTLTC() {
        return uSDTLTC;
    }

    @JsonProperty("USDT_LTC")
    public void setUSDTLTC(USDTLTC uSDTLTC) {
        this.uSDTLTC = uSDTLTC;
    }

    @JsonProperty("USDT_NXT")
    public USDTNXT getUSDTNXT() {
        return uSDTNXT;
    }

    @JsonProperty("USDT_NXT")
    public void setUSDTNXT(USDTNXT uSDTNXT) {
        this.uSDTNXT = uSDTNXT;
    }

    @JsonProperty("USDT_STR")
    public USDTSTR getUSDTSTR() {
        return uSDTSTR;
    }

    @JsonProperty("USDT_STR")
    public void setUSDTSTR(USDTSTR uSDTSTR) {
        this.uSDTSTR = uSDTSTR;
    }

    @JsonProperty("USDT_XMR")
    public USDTXMR getUSDTXMR() {
        return uSDTXMR;
    }

    @JsonProperty("USDT_XMR")
    public void setUSDTXMR(USDTXMR uSDTXMR) {
        this.uSDTXMR = uSDTXMR;
    }

    @JsonProperty("USDT_XRP")
    public USDTXRP getUSDTXRP() {
        return uSDTXRP;
    }

    @JsonProperty("USDT_XRP")
    public void setUSDTXRP(USDTXRP uSDTXRP) {
        this.uSDTXRP = uSDTXRP;
    }

    @JsonProperty("BTC_ETH")
    public BTCETH getBTCETH() {
        return bTCETH;
    }

    @JsonProperty("BTC_ETH")
    public void setBTCETH(BTCETH bTCETH) {
        this.bTCETH = bTCETH;
    }

    @JsonProperty("USDT_ETH")
    public USDTETH getUSDTETH() {
        return uSDTETH;
    }

    @JsonProperty("USDT_ETH")
    public void setUSDTETH(USDTETH uSDTETH) {
        this.uSDTETH = uSDTETH;
    }

    @JsonProperty("BTC_SC")
    public BTCSC getBTCSC() {
        return bTCSC;
    }

    @JsonProperty("BTC_SC")
    public void setBTCSC(BTCSC bTCSC) {
        this.bTCSC = bTCSC;
    }

    @JsonProperty("BTC_DCR")
    public BTCDCR getBTCDCR() {
        return bTCDCR;
    }

    @JsonProperty("BTC_DCR")
    public void setBTCDCR(BTCDCR bTCDCR) {
        this.bTCDCR = bTCDCR;
    }

    @JsonProperty("BTC_LSK")
    public BTCLSK getBTCLSK() {
        return bTCLSK;
    }

    @JsonProperty("BTC_LSK")
    public void setBTCLSK(BTCLSK bTCLSK) {
        this.bTCLSK = bTCLSK;
    }

    @JsonProperty("BTC_ETC")
    public BTCETC getBTCETC() {
        return bTCETC;
    }

    @JsonProperty("BTC_ETC")
    public void setBTCETC(BTCETC bTCETC) {
        this.bTCETC = bTCETC;
    }

    @JsonProperty("ETH_ETC")
    public ETHETC getETHETC() {
        return eTHETC;
    }

    @JsonProperty("ETH_ETC")
    public void setETHETC(ETHETC eTHETC) {
        this.eTHETC = eTHETC;
    }

    @JsonProperty("USDT_ETC")
    public USDTETC getUSDTETC() {
        return uSDTETC;
    }

    @JsonProperty("USDT_ETC")
    public void setUSDTETC(USDTETC uSDTETC) {
        this.uSDTETC = uSDTETC;
    }

    @JsonProperty("BTC_REP")
    public BTCREP getBTCREP() {
        return bTCREP;
    }

    @JsonProperty("BTC_REP")
    public void setBTCREP(BTCREP bTCREP) {
        this.bTCREP = bTCREP;
    }

    @JsonProperty("USDT_REP")
    public USDTREP getUSDTREP() {
        return uSDTREP;
    }

    @JsonProperty("USDT_REP")
    public void setUSDTREP(USDTREP uSDTREP) {
        this.uSDTREP = uSDTREP;
    }

    @JsonProperty("ETH_REP")
    public ETHREP getETHREP() {
        return eTHREP;
    }

    @JsonProperty("ETH_REP")
    public void setETHREP(ETHREP eTHREP) {
        this.eTHREP = eTHREP;
    }

    @JsonProperty("BTC_ARDR")
    public BTCARDR getBTCARDR() {
        return bTCARDR;
    }

    @JsonProperty("BTC_ARDR")
    public void setBTCARDR(BTCARDR bTCARDR) {
        this.bTCARDR = bTCARDR;
    }

    @JsonProperty("BTC_ZEC")
    public BTCZEC getBTCZEC() {
        return bTCZEC;
    }

    @JsonProperty("BTC_ZEC")
    public void setBTCZEC(BTCZEC bTCZEC) {
        this.bTCZEC = bTCZEC;
    }

    @JsonProperty("ETH_ZEC")
    public ETHZEC getETHZEC() {
        return eTHZEC;
    }

    @JsonProperty("ETH_ZEC")
    public void setETHZEC(ETHZEC eTHZEC) {
        this.eTHZEC = eTHZEC;
    }

    @JsonProperty("USDT_ZEC")
    public USDTZEC getUSDTZEC() {
        return uSDTZEC;
    }

    @JsonProperty("USDT_ZEC")
    public void setUSDTZEC(USDTZEC uSDTZEC) {
        this.uSDTZEC = uSDTZEC;
    }

    @JsonProperty("BTC_STRAT")
    public BTCSTRAT getBTCSTRAT() {
        return bTCSTRAT;
    }

    @JsonProperty("BTC_STRAT")
    public void setBTCSTRAT(BTCSTRAT bTCSTRAT) {
        this.bTCSTRAT = bTCSTRAT;
    }

    @JsonProperty("BTC_GNT")
    public BTCGNT getBTCGNT() {
        return bTCGNT;
    }

    @JsonProperty("BTC_GNT")
    public void setBTCGNT(BTCGNT bTCGNT) {
        this.bTCGNT = bTCGNT;
    }

    @JsonProperty("BTC_ZRX")
    public BTCZRX getBTCZRX() {
        return bTCZRX;
    }

    @JsonProperty("BTC_ZRX")
    public void setBTCZRX(BTCZRX bTCZRX) {
        this.bTCZRX = bTCZRX;
    }

    @JsonProperty("ETH_ZRX")
    public ETHZRX getETHZRX() {
        return eTHZRX;
    }

    @JsonProperty("ETH_ZRX")
    public void setETHZRX(ETHZRX eTHZRX) {
        this.eTHZRX = eTHZRX;
    }

    @JsonProperty("BTC_CVC")
    public BTCCVC getBTCCVC() {
        return bTCCVC;
    }

    @JsonProperty("BTC_CVC")
    public void setBTCCVC(BTCCVC bTCCVC) {
        this.bTCCVC = bTCCVC;
    }

    @JsonProperty("BTC_OMG")
    public BTCOMG getBTCOMG() {
        return bTCOMG;
    }

    @JsonProperty("BTC_OMG")
    public void setBTCOMG(BTCOMG bTCOMG) {
        this.bTCOMG = bTCOMG;
    }

    @JsonProperty("BTC_GAS")
    public BTCGAS getBTCGAS() {
        return bTCGAS;
    }

    @JsonProperty("BTC_GAS")
    public void setBTCGAS(BTCGAS bTCGAS) {
        this.bTCGAS = bTCGAS;
    }

    @JsonProperty("BTC_STORJ")
    public BTCSTORJ getBTCSTORJ() {
        return bTCSTORJ;
    }

    @JsonProperty("BTC_STORJ")
    public void setBTCSTORJ(BTCSTORJ bTCSTORJ) {
        this.bTCSTORJ = bTCSTORJ;
    }

    @JsonProperty("BTC_EOS")
    public BTCEOS getBTCEOS() {
        return bTCEOS;
    }

    @JsonProperty("BTC_EOS")
    public void setBTCEOS(BTCEOS bTCEOS) {
        this.bTCEOS = bTCEOS;
    }

    @JsonProperty("ETH_EOS")
    public ETHEOS getETHEOS() {
        return eTHEOS;
    }

    @JsonProperty("ETH_EOS")
    public void setETHEOS(ETHEOS eTHEOS) {
        this.eTHEOS = eTHEOS;
    }

    @JsonProperty("USDT_EOS")
    public USDTEOS getUSDTEOS() {
        return uSDTEOS;
    }

    @JsonProperty("USDT_EOS")
    public void setUSDTEOS(USDTEOS uSDTEOS) {
        this.uSDTEOS = uSDTEOS;
    }

    @JsonProperty("BTC_SNT")
    public BTCSNT getBTCSNT() {
        return bTCSNT;
    }

    @JsonProperty("BTC_SNT")
    public void setBTCSNT(BTCSNT bTCSNT) {
        this.bTCSNT = bTCSNT;
    }

    @JsonProperty("BTC_KNC")
    public BTCKNC getBTCKNC() {
        return bTCKNC;
    }

    @JsonProperty("BTC_KNC")
    public void setBTCKNC(BTCKNC bTCKNC) {
        this.bTCKNC = bTCKNC;
    }

    @JsonProperty("BTC_BAT")
    public BTCBAT getBTCBAT() {
        return bTCBAT;
    }

    @JsonProperty("BTC_BAT")
    public void setBTCBAT(BTCBAT bTCBAT) {
        this.bTCBAT = bTCBAT;
    }

    @JsonProperty("ETH_BAT")
    public ETHBAT getETHBAT() {
        return eTHBAT;
    }

    @JsonProperty("ETH_BAT")
    public void setETHBAT(ETHBAT eTHBAT) {
        this.eTHBAT = eTHBAT;
    }

    @JsonProperty("USDT_BAT")
    public USDTBAT getUSDTBAT() {
        return uSDTBAT;
    }

    @JsonProperty("USDT_BAT")
    public void setUSDTBAT(USDTBAT uSDTBAT) {
        this.uSDTBAT = uSDTBAT;
    }

    @JsonProperty("BTC_LOOM")
    public BTCLOOM getBTCLOOM() {
        return bTCLOOM;
    }

    @JsonProperty("BTC_LOOM")
    public void setBTCLOOM(BTCLOOM bTCLOOM) {
        this.bTCLOOM = bTCLOOM;
    }

    @JsonProperty("USDT_DOGE")
    public USDTDOGE getUSDTDOGE() {
        return uSDTDOGE;
    }

    @JsonProperty("USDT_DOGE")
    public void setUSDTDOGE(USDTDOGE uSDTDOGE) {
        this.uSDTDOGE = uSDTDOGE;
    }

    @JsonProperty("USDT_GNT")
    public USDTGNT getUSDTGNT() {
        return uSDTGNT;
    }

    @JsonProperty("USDT_GNT")
    public void setUSDTGNT(USDTGNT uSDTGNT) {
        this.uSDTGNT = uSDTGNT;
    }

    @JsonProperty("USDT_LSK")
    public USDTLSK getUSDTLSK() {
        return uSDTLSK;
    }

    @JsonProperty("USDT_LSK")
    public void setUSDTLSK(USDTLSK uSDTLSK) {
        this.uSDTLSK = uSDTLSK;
    }

    @JsonProperty("USDT_SC")
    public USDTSC getUSDTSC() {
        return uSDTSC;
    }

    @JsonProperty("USDT_SC")
    public void setUSDTSC(USDTSC uSDTSC) {
        this.uSDTSC = uSDTSC;
    }

    @JsonProperty("USDT_ZRX")
    public USDTZRX getUSDTZRX() {
        return uSDTZRX;
    }

    @JsonProperty("USDT_ZRX")
    public void setUSDTZRX(USDTZRX uSDTZRX) {
        this.uSDTZRX = uSDTZRX;
    }

    @JsonProperty("BTC_QTUM")
    public BTCQTUM getBTCQTUM() {
        return bTCQTUM;
    }

    @JsonProperty("BTC_QTUM")
    public void setBTCQTUM(BTCQTUM bTCQTUM) {
        this.bTCQTUM = bTCQTUM;
    }

    @JsonProperty("USDT_QTUM")
    public USDTQTUM getUSDTQTUM() {
        return uSDTQTUM;
    }

    @JsonProperty("USDT_QTUM")
    public void setUSDTQTUM(USDTQTUM uSDTQTUM) {
        this.uSDTQTUM = uSDTQTUM;
    }

    @JsonProperty("USDC_BTC")
    public USDCBTC getUSDCBTC() {
        return uSDCBTC;
    }

    @JsonProperty("USDC_BTC")
    public void setUSDCBTC(USDCBTC uSDCBTC) {
        this.uSDCBTC = uSDCBTC;
    }

    @JsonProperty("USDC_ETH")
    public USDCETH getUSDCETH() {
        return uSDCETH;
    }

    @JsonProperty("USDC_ETH")
    public void setUSDCETH(USDCETH uSDCETH) {
        this.uSDCETH = uSDCETH;
    }

    @JsonProperty("USDC_USDT")
    public USDCUSDT getUSDCUSDT() {
        return uSDCUSDT;
    }

    @JsonProperty("USDC_USDT")
    public void setUSDCUSDT(USDCUSDT uSDCUSDT) {
        this.uSDCUSDT = uSDCUSDT;
    }

    @JsonProperty("BTC_MANA")
    public BTCMANA getBTCMANA() {
        return bTCMANA;
    }

    @JsonProperty("BTC_MANA")
    public void setBTCMANA(BTCMANA bTCMANA) {
        this.bTCMANA = bTCMANA;
    }

    @JsonProperty("USDT_MANA")
    public USDTMANA getUSDTMANA() {
        return uSDTMANA;
    }

    @JsonProperty("USDT_MANA")
    public void setUSDTMANA(USDTMANA uSDTMANA) {
        this.uSDTMANA = uSDTMANA;
    }

    @JsonProperty("BTC_BNT")
    public BTCBNT getBTCBNT() {
        return bTCBNT;
    }

    @JsonProperty("BTC_BNT")
    public void setBTCBNT(BTCBNT bTCBNT) {
        this.bTCBNT = bTCBNT;
    }

    @JsonProperty("BTC_BCHABC")
    public BTCBCHABC getBTCBCHABC() {
        return bTCBCHABC;
    }

    @JsonProperty("BTC_BCHABC")
    public void setBTCBCHABC(BTCBCHABC bTCBCHABC) {
        this.bTCBCHABC = bTCBCHABC;
    }

    @JsonProperty("USDC_BCHABC")
    public USDCBCHABC getUSDCBCHABC() {
        return uSDCBCHABC;
    }

    @JsonProperty("USDC_BCHABC")
    public void setUSDCBCHABC(USDCBCHABC uSDCBCHABC) {
        this.uSDCBCHABC = uSDCBCHABC;
    }

    @JsonProperty("BTC_BCHSV")
    public BTCBCHSV getBTCBCHSV() {
        return bTCBCHSV;
    }

    @JsonProperty("BTC_BCHSV")
    public void setBTCBCHSV(BTCBCHSV bTCBCHSV) {
        this.bTCBCHSV = bTCBCHSV;
    }

    @JsonProperty("USDC_BCHSV")
    public USDCBCHSV getUSDCBCHSV() {
        return uSDCBCHSV;
    }

    @JsonProperty("USDC_BCHSV")
    public void setUSDCBCHSV(USDCBCHSV uSDCBCHSV) {
        this.uSDCBCHSV = uSDCBCHSV;
    }

    @JsonProperty("USDC_XRP")
    public USDCXRP getUSDCXRP() {
        return uSDCXRP;
    }

    @JsonProperty("USDC_XRP")
    public void setUSDCXRP(USDCXRP uSDCXRP) {
        this.uSDCXRP = uSDCXRP;
    }

    @JsonProperty("USDC_XMR")
    public USDCXMR getUSDCXMR() {
        return uSDCXMR;
    }

    @JsonProperty("USDC_XMR")
    public void setUSDCXMR(USDCXMR uSDCXMR) {
        this.uSDCXMR = uSDCXMR;
    }

    @JsonProperty("USDC_STR")
    public USDCSTR getUSDCSTR() {
        return uSDCSTR;
    }

    @JsonProperty("USDC_STR")
    public void setUSDCSTR(USDCSTR uSDCSTR) {
        this.uSDCSTR = uSDCSTR;
    }

    @JsonProperty("USDC_DOGE")
    public USDCDOGE getUSDCDOGE() {
        return uSDCDOGE;
    }

    @JsonProperty("USDC_DOGE")
    public void setUSDCDOGE(USDCDOGE uSDCDOGE) {
        this.uSDCDOGE = uSDCDOGE;
    }

    @JsonProperty("USDC_LTC")
    public USDCLTC getUSDCLTC() {
        return uSDCLTC;
    }

    @JsonProperty("USDC_LTC")
    public void setUSDCLTC(USDCLTC uSDCLTC) {
        this.uSDCLTC = uSDCLTC;
    }

    @JsonProperty("USDC_ZEC")
    public USDCZEC getUSDCZEC() {
        return uSDCZEC;
    }

    @JsonProperty("USDC_ZEC")
    public void setUSDCZEC(USDCZEC uSDCZEC) {
        this.uSDCZEC = uSDCZEC;
    }

    @JsonProperty("BTC_FOAM")
    public BTCFOAM getBTCFOAM() {
        return bTCFOAM;
    }

    @JsonProperty("BTC_FOAM")
    public void setBTCFOAM(BTCFOAM bTCFOAM) {
        this.bTCFOAM = bTCFOAM;
    }

    @JsonProperty("BTC_NMR")
    public BTCNMR getBTCNMR() {
        return bTCNMR;
    }

    @JsonProperty("BTC_NMR")
    public void setBTCNMR(BTCNMR bTCNMR) {
        this.bTCNMR = bTCNMR;
    }

    @JsonProperty("BTC_POLY")
    public BTCPOLY getBTCPOLY() {
        return bTCPOLY;
    }

    @JsonProperty("BTC_POLY")
    public void setBTCPOLY(BTCPOLY bTCPOLY) {
        this.bTCPOLY = bTCPOLY;
    }

    @JsonProperty("BTC_LPT")
    public BTCLPT getBTCLPT() {
        return bTCLPT;
    }

    @JsonProperty("BTC_LPT")
    public void setBTCLPT(BTCLPT bTCLPT) {
        this.bTCLPT = bTCLPT;
    }

    @JsonProperty("BTC_GRIN")
    public BTCGRIN getBTCGRIN() {
        return bTCGRIN;
    }

    @JsonProperty("BTC_GRIN")
    public void setBTCGRIN(BTCGRIN bTCGRIN) {
        this.bTCGRIN = bTCGRIN;
    }

    @JsonProperty("USDC_GRIN")
    public USDCGRIN getUSDCGRIN() {
        return uSDCGRIN;
    }

    @JsonProperty("USDC_GRIN")
    public void setUSDCGRIN(USDCGRIN uSDCGRIN) {
        this.uSDCGRIN = uSDCGRIN;
    }

    @JsonProperty("BTC_ATOM")
    public BTCATOM getBTCATOM() {
        return bTCATOM;
    }

    @JsonProperty("BTC_ATOM")
    public void setBTCATOM(BTCATOM bTCATOM) {
        this.bTCATOM = bTCATOM;
    }

    @JsonProperty("USDC_ATOM")
    public USDCATOM getUSDCATOM() {
        return uSDCATOM;
    }

    @JsonProperty("USDC_ATOM")
    public void setUSDCATOM(USDCATOM uSDCATOM) {
        this.uSDCATOM = uSDCATOM;
    }

    @JsonProperty("USDT_ATOM")
    public USDTATOM getUSDTATOM() {
        return uSDTATOM;
    }

    @JsonProperty("USDT_ATOM")
    public void setUSDTATOM(USDTATOM uSDTATOM) {
        this.uSDTATOM = uSDTATOM;
    }

    @JsonProperty("USDC_DASH")
    public USDCDASH getUSDCDASH() {
        return uSDCDASH;
    }

    @JsonProperty("USDC_DASH")
    public void setUSDCDASH(USDCDASH uSDCDASH) {
        this.uSDCDASH = uSDCDASH;
    }

    @JsonProperty("USDC_EOS")
    public USDCEOS getUSDCEOS() {
        return uSDCEOS;
    }

    @JsonProperty("USDC_EOS")
    public void setUSDCEOS(USDCEOS uSDCEOS) {
        this.uSDCEOS = uSDCEOS;
    }

    @JsonProperty("USDC_ETC")
    public USDCETC getUSDCETC() {
        return uSDCETC;
    }

    @JsonProperty("USDC_ETC")
    public void setUSDCETC(USDCETC uSDCETC) {
        this.uSDCETC = uSDCETC;
    }

    @JsonProperty("USDT_BCHSV")
    public USDTBCHSV getUSDTBCHSV() {
        return uSDTBCHSV;
    }

    @JsonProperty("USDT_BCHSV")
    public void setUSDTBCHSV(USDTBCHSV uSDTBCHSV) {
        this.uSDTBCHSV = uSDTBCHSV;
    }

    @JsonProperty("USDT_BCHABC")
    public USDTBCHABC getUSDTBCHABC() {
        return uSDTBCHABC;
    }

    @JsonProperty("USDT_BCHABC")
    public void setUSDTBCHABC(USDTBCHABC uSDTBCHABC) {
        this.uSDTBCHABC = uSDTBCHABC;
    }

    @JsonProperty("USDT_GRIN")
    public USDTGRIN getUSDTGRIN() {
        return uSDTGRIN;
    }

    @JsonProperty("USDT_GRIN")
    public void setUSDTGRIN(USDTGRIN uSDTGRIN) {
        this.uSDTGRIN = uSDTGRIN;
    }

    @JsonProperty("BTC_TRX")
    public BTCTRX getBTCTRX() {
        return bTCTRX;
    }

    @JsonProperty("BTC_TRX")
    public void setBTCTRX(BTCTRX bTCTRX) {
        this.bTCTRX = bTCTRX;
    }

    @JsonProperty("USDC_TRX")
    public USDCTRX getUSDCTRX() {
        return uSDCTRX;
    }

    @JsonProperty("USDC_TRX")
    public void setUSDCTRX(USDCTRX uSDCTRX) {
        this.uSDCTRX = uSDCTRX;
    }

    @JsonProperty("USDT_TRX")
    public USDTTRX getUSDTTRX() {
        return uSDTTRX;
    }

    @JsonProperty("USDT_TRX")
    public void setUSDTTRX(USDTTRX uSDTTRX) {
        this.uSDTTRX = uSDTTRX;
    }

    @JsonProperty("BTC_ETHBNT")
    public BTCETHBNT getBTCETHBNT() {
        return bTCETHBNT;
    }

    @JsonProperty("BTC_ETHBNT")
    public void setBTCETHBNT(BTCETHBNT bTCETHBNT) {
        this.bTCETHBNT = bTCETHBNT;
    }

    @JsonProperty("TRX_ETH")
    public TRXETH getTRXETH() {
        return tRXETH;
    }

    @JsonProperty("TRX_ETH")
    public void setTRXETH(TRXETH tRXETH) {
        this.tRXETH = tRXETH;
    }

    @JsonProperty("TRX_XRP")
    public TRXXRP getTRXXRP() {
        return tRXXRP;
    }

    @JsonProperty("TRX_XRP")
    public void setTRXXRP(TRXXRP tRXXRP) {
        this.tRXXRP = tRXXRP;
    }

    @JsonProperty("BTC_BTT")
    public BTCBTT getBTCBTT() {
        return bTCBTT;
    }

    @JsonProperty("BTC_BTT")
    public void setBTCBTT(BTCBTT bTCBTT) {
        this.bTCBTT = bTCBTT;
    }

    @JsonProperty("USDT_BTT")
    public USDTBTT getUSDTBTT() {
        return uSDTBTT;
    }

    @JsonProperty("USDT_BTT")
    public void setUSDTBTT(USDTBTT uSDTBTT) {
        this.uSDTBTT = uSDTBTT;
    }

    @JsonProperty("TRX_BTT")
    public TRXBTT getTRXBTT() {
        return tRXBTT;
    }

    @JsonProperty("TRX_BTT")
    public void setTRXBTT(TRXBTT tRXBTT) {
        this.tRXBTT = tRXBTT;
    }

    @JsonProperty("USDT_WIN")
    public USDTWIN getUSDTWIN() {
        return uSDTWIN;
    }

    @JsonProperty("USDT_WIN")
    public void setUSDTWIN(USDTWIN uSDTWIN) {
        this.uSDTWIN = uSDTWIN;
    }

    @JsonProperty("TRX_WIN")
    public TRXWIN getTRXWIN() {
        return tRXWIN;
    }

    @JsonProperty("TRX_WIN")
    public void setTRXWIN(TRXWIN tRXWIN) {
        this.tRXWIN = tRXWIN;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
