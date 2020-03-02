
package ru.bukreev.cryptoprototype.model.poloniex;

import com.fasterxml.jackson.annotation.*;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    @Ignore @JsonProperty("BTC_BCN")
    private BTCBCN bTCBCN;
    @Ignore @JsonProperty("BTC_BTS")
    private BTCBTS bTCBTS;
    @Ignore @JsonProperty("BTC_DASH")
    private BTCDASH bTCDASH;
    @Ignore
    @JsonProperty("BTC_DOGE")
    private BTCDOGE bTCDOGE;
    @Ignore @JsonProperty("BTC_LTC")
    private BTCLTC bTCLTC;
    @Ignore @JsonProperty("BTC_NXT")
    private BTCNXT bTCNXT;
    @Ignore @JsonProperty("BTC_STR")
    private BTCSTR bTCSTR;
    @Ignore @JsonProperty("BTC_XEM")
    private BTCXEM bTCXEM;
    @Ignore @JsonProperty("BTC_XMR")
    private BTCXMR bTCXMR;
    @Ignore @JsonProperty("BTC_XRP")
    private BTCXRP bTCXRP;
    @Ignore @JsonProperty("USDT_BTC")
    private USDTBTC uSDTBTC;
    @Ignore @JsonProperty("USDT_DASH")
    private USDTDASH uSDTDASH;
    @Ignore @JsonProperty("USDT_LTC")
    private USDTLTC uSDTLTC;
    @Ignore @JsonProperty("USDT_NXT")
    private USDTNXT uSDTNXT;
    @Ignore @JsonProperty("USDT_STR")
    private USDTSTR uSDTSTR;
    @Ignore @JsonProperty("USDT_XMR")
    private USDTXMR uSDTXMR;
    @Ignore @JsonProperty("USDT_XRP")
    private USDTXRP uSDTXRP;
    @Ignore @JsonProperty("BTC_ETH")
    private BTCETH bTCETH;
    @Ignore @JsonProperty("USDT_ETH")
    private USDTETH uSDTETH;
    @Ignore @JsonProperty("BTC_SC")
    private BTCSC bTCSC;
    @Ignore @JsonProperty("BTC_DCR")
    private BTCDCR bTCDCR;
    @Ignore @JsonProperty("BTC_LSK")
    private BTCLSK bTCLSK;
    @Ignore @JsonProperty("BTC_ETC")
    private BTCETC bTCETC;
    @Ignore @JsonProperty("ETH_ETC")
    private ETHETC eTHETC;
    @Ignore @JsonProperty("USDT_ETC")
    private USDTETC uSDTETC;
    @Ignore @JsonProperty("BTC_REP")
    private BTCREP bTCREP;
    @Ignore @JsonProperty("USDT_REP")
    private USDTREP uSDTREP;
    @Ignore @JsonProperty("ETH_REP")
    private ETHREP eTHREP;
    @Ignore @JsonProperty("BTC_ARDR")
    private BTCARDR bTCARDR;
    @Ignore @JsonProperty("BTC_ZEC")
    private BTCZEC bTCZEC;
    @Ignore @JsonProperty("ETH_ZEC")
    private ETHZEC eTHZEC;
    @Ignore @JsonProperty("USDT_ZEC")
    private USDTZEC uSDTZEC;
    @Ignore @JsonProperty("BTC_STRAT")
    private BTCSTRAT bTCSTRAT;
    @Ignore @JsonProperty("BTC_GNT")
    private BTCGNT bTCGNT;
    @Ignore @JsonProperty("BTC_ZRX")
    private BTCZRX bTCZRX;
    @Ignore @JsonProperty("ETH_ZRX")
    private ETHZRX eTHZRX;
    @Ignore @JsonProperty("BTC_CVC")
    private BTCCVC bTCCVC;
    @Ignore @JsonProperty("BTC_OMG")
    private BTCOMG bTCOMG;
    @Ignore @JsonProperty("BTC_GAS")
    private BTCGAS bTCGAS;
    @Ignore @JsonProperty("BTC_STORJ")
    private BTCSTORJ bTCSTORJ;
    @Ignore @JsonProperty("BTC_EOS")
    private BTCEOS bTCEOS;
    @Ignore @JsonProperty("ETH_EOS")
    private ETHEOS eTHEOS;
    @Ignore @JsonProperty("USDT_EOS")
    private USDTEOS uSDTEOS;
    @Ignore @JsonProperty("BTC_SNT")
    private BTCSNT bTCSNT;
    @Ignore @JsonProperty("BTC_KNC")
    private BTCKNC bTCKNC;
    @Ignore @JsonProperty("BTC_BAT")
    private BTCBAT bTCBAT;
    @Ignore @JsonProperty("ETH_BAT")
    private ETHBAT eTHBAT;
    @Ignore @JsonProperty("USDT_BAT")
    private USDTBAT uSDTBAT;
    @Ignore @JsonProperty("BTC_LOOM")
    private BTCLOOM bTCLOOM;
    @Ignore @JsonProperty("USDT_DOGE")
    private USDTDOGE uSDTDOGE;
    @Ignore @JsonProperty("USDT_GNT")
    private USDTGNT uSDTGNT;
    @Ignore @JsonProperty("USDT_LSK")
    private USDTLSK uSDTLSK;
    @Ignore @JsonProperty("USDT_SC")
    private USDTSC uSDTSC;
    @Ignore @JsonProperty("USDT_ZRX")
    private USDTZRX uSDTZRX;
    @Ignore @JsonProperty("BTC_QTUM")
    private BTCQTUM bTCQTUM;
    @Ignore @JsonProperty("USDT_QTUM")
    private USDTQTUM uSDTQTUM;
    @Ignore @JsonProperty("USDC_BTC")
    private USDCBTC uSDCBTC;
    @Ignore @JsonProperty("USDC_ETH")
    private USDCETH uSDCETH;
    @Ignore @JsonProperty("USDC_USDT")
    private USDCUSDT uSDCUSDT;
    @Ignore @JsonProperty("BTC_MANA")
    private BTCMANA bTCMANA;
    @Ignore @JsonProperty("USDT_MANA")
    private USDTMANA uSDTMANA;
    @Ignore @JsonProperty("BTC_BNT")
    private BTCBNT bTCBNT;
    @Ignore @JsonProperty("BTC_BCHABC")
    private BTCBCHABC bTCBCHABC;
    @Ignore @JsonProperty("USDC_BCHABC")
    private USDCBCHABC uSDCBCHABC;
    @Ignore @JsonProperty("BTC_BCHSV")
    private BTCBCHSV bTCBCHSV;
    @Ignore @JsonProperty("USDC_BCHSV")
    private USDCBCHSV uSDCBCHSV;
    @Ignore @JsonProperty("USDC_XRP")
    private USDCXRP uSDCXRP;
    @Ignore @JsonProperty("USDC_XMR")
    private USDCXMR uSDCXMR;
    @Ignore @JsonProperty("USDC_STR")
    private USDCSTR uSDCSTR;
    @Ignore @JsonProperty("USDC_DOGE")
    private USDCDOGE uSDCDOGE;
    @Ignore @JsonProperty("USDC_LTC")
    private USDCLTC uSDCLTC;
    @Ignore @JsonProperty("USDC_ZEC")
    private USDCZEC uSDCZEC;
    @Ignore @JsonProperty("BTC_FOAM")
    private BTCFOAM bTCFOAM;
    @Ignore @JsonProperty("BTC_NMR")
    private BTCNMR bTCNMR;
    @Ignore @JsonProperty("BTC_POLY")
    private BTCPOLY bTCPOLY;
    @Ignore @JsonProperty("BTC_LPT")
    private BTCLPT bTCLPT;
    @Ignore @JsonProperty("BTC_GRIN")
    private BTCGRIN bTCGRIN;
    @Ignore @JsonProperty("USDC_GRIN")
    private USDCGRIN uSDCGRIN;
    @Ignore @JsonProperty("BTC_ATOM")
    private BTCATOM bTCATOM;
    @Ignore @JsonProperty("USDC_ATOM")
    private USDCATOM uSDCATOM;
    @Ignore @JsonProperty("USDT_ATOM")
    private USDTATOM uSDTATOM;
    @Ignore @JsonProperty("USDC_DASH")
    private USDCDASH uSDCDASH;
    @Ignore @JsonProperty("USDC_EOS")
    private USDCEOS uSDCEOS;
    @Ignore @JsonProperty("USDC_ETC")
    private USDCETC uSDCETC;
    @Ignore @JsonProperty("USDT_BCHSV")
    private USDTBCHSV uSDTBCHSV;
    @Ignore @JsonProperty("USDT_BCHABC")
    private USDTBCHABC uSDTBCHABC;
    @Ignore @JsonProperty("USDT_GRIN")
    private USDTGRIN uSDTGRIN;
    @Ignore @JsonProperty("BTC_TRX")
    private BTCTRX bTCTRX;
    @Ignore @JsonProperty("USDC_TRX")
    private USDCTRX uSDCTRX;
    @Ignore @JsonProperty("USDT_TRX")
    private USDTTRX uSDTTRX;
    @Ignore @JsonProperty("BTC_ETHBNT")
    private BTCETHBNT bTCETHBNT;
    @Ignore @JsonProperty("TRX_ETH")
    private TRXETH tRXETH;
    @Ignore @JsonProperty("TRX_XRP")
    private TRXXRP tRXXRP;
    @Ignore @JsonProperty("BTC_BTT")
    private BTCBTT bTCBTT;
    @Ignore @JsonProperty("USDT_BTT")
    private USDTBTT uSDTBTT;
    @Ignore @JsonProperty("TRX_BTT")
    private TRXBTT tRXBTT;
    @Ignore @JsonProperty("USDT_WIN")
    private USDTWIN uSDTWIN;
    @Ignore @JsonProperty("TRX_WIN")
    private TRXWIN tRXWIN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Ignore
    @JsonProperty("BTC_BCN")
    public BTCBCN getBTCBCN() {
        return bTCBCN;
    }

    @Ignore @JsonProperty("BTC_BCN")
    public void setBTCBCN(BTCBCN bTCBCN) {
        this.bTCBCN = bTCBCN;
    }

    @Ignore @JsonProperty("BTC_BTS")
    public BTCBTS getBTCBTS() {
        return bTCBTS;
    }

    @Ignore @JsonProperty("BTC_BTS")
    public void setBTCBTS(BTCBTS bTCBTS) {
        this.bTCBTS = bTCBTS;
    }

    @Ignore @JsonProperty("BTC_DASH")
    public BTCDASH getBTCDASH() {
        return bTCDASH;
    }

    @Ignore @JsonProperty("BTC_DASH")
    public void setBTCDASH(BTCDASH bTCDASH) {
        this.bTCDASH = bTCDASH;
    }

    @Ignore @JsonProperty("BTC_DOGE")
    public BTCDOGE getBTCDOGE() {
        return bTCDOGE;
    }

    @Ignore @JsonProperty("BTC_DOGE")
    public void setBTCDOGE(BTCDOGE bTCDOGE) {
        this.bTCDOGE = bTCDOGE;
    }

    @Ignore @JsonProperty("BTC_LTC")
    public BTCLTC getBTCLTC() {
        return bTCLTC;
    }

    @Ignore @JsonProperty("BTC_LTC")
    public void setBTCLTC(BTCLTC bTCLTC) {
        this.bTCLTC = bTCLTC;
    }

    @Ignore @JsonProperty("BTC_NXT")
    public BTCNXT getBTCNXT() {
        return bTCNXT;
    }

    @Ignore @JsonProperty("BTC_NXT")
    public void setBTCNXT(BTCNXT bTCNXT) {
        this.bTCNXT = bTCNXT;
    }

    @Ignore @JsonProperty("BTC_STR")
    public BTCSTR getBTCSTR() {
        return bTCSTR;
    }

    @Ignore @JsonProperty("BTC_STR")
    public void setBTCSTR(BTCSTR bTCSTR) {
        this.bTCSTR = bTCSTR;
    }

    @Ignore @JsonProperty("BTC_XEM")
    public BTCXEM getBTCXEM() {
        return bTCXEM;
    }

    @Ignore @JsonProperty("BTC_XEM")
    public void setBTCXEM(BTCXEM bTCXEM) {
        this.bTCXEM = bTCXEM;
    }

    @Ignore @JsonProperty("BTC_XMR")
    public BTCXMR getBTCXMR() {
        return bTCXMR;
    }

    @Ignore @JsonProperty("BTC_XMR")
    public void setBTCXMR(BTCXMR bTCXMR) {
        this.bTCXMR = bTCXMR;
    }

    @Ignore @JsonProperty("BTC_XRP")
    public BTCXRP getBTCXRP() {
        return bTCXRP;
    }

    @Ignore @JsonProperty("BTC_XRP")
    public void setBTCXRP(BTCXRP bTCXRP) {
        this.bTCXRP = bTCXRP;
    }

    @Ignore @JsonProperty("USDT_BTC")
    public USDTBTC getUSDTBTC() {
        return uSDTBTC;
    }

    @Ignore @JsonProperty("USDT_BTC")
    public void setUSDTBTC(USDTBTC uSDTBTC) {
        this.uSDTBTC = uSDTBTC;
    }

    @Ignore @JsonProperty("USDT_DASH")
    public USDTDASH getUSDTDASH() {
        return uSDTDASH;
    }

    @Ignore @JsonProperty("USDT_DASH")
    public void setUSDTDASH(USDTDASH uSDTDASH) {
        this.uSDTDASH = uSDTDASH;
    }

    @Ignore @JsonProperty("USDT_LTC")
    public USDTLTC getUSDTLTC() {
        return uSDTLTC;
    }

    @Ignore @JsonProperty("USDT_LTC")
    public void setUSDTLTC(USDTLTC uSDTLTC) {
        this.uSDTLTC = uSDTLTC;
    }

    @Ignore @JsonProperty("USDT_NXT")
    public USDTNXT getUSDTNXT() {
        return uSDTNXT;
    }

    @Ignore @JsonProperty("USDT_NXT")
    public void setUSDTNXT(USDTNXT uSDTNXT) {
        this.uSDTNXT = uSDTNXT;
    }

    @Ignore @JsonProperty("USDT_STR")
    public USDTSTR getUSDTSTR() {
        return uSDTSTR;
    }

    @Ignore @JsonProperty("USDT_STR")
    public void setUSDTSTR(USDTSTR uSDTSTR) {
        this.uSDTSTR = uSDTSTR;
    }

    @Ignore @JsonProperty("USDT_XMR")
    public USDTXMR getUSDTXMR() {
        return uSDTXMR;
    }

    @Ignore @JsonProperty("USDT_XMR")
    public void setUSDTXMR(USDTXMR uSDTXMR) {
        this.uSDTXMR = uSDTXMR;
    }

    @Ignore @JsonProperty("USDT_XRP")
    public USDTXRP getUSDTXRP() {
        return uSDTXRP;
    }

    @Ignore @JsonProperty("USDT_XRP")
    public void setUSDTXRP(USDTXRP uSDTXRP) {
        this.uSDTXRP = uSDTXRP;
    }

    @Ignore @JsonProperty("BTC_ETH")
    public BTCETH getBTCETH() {
        return bTCETH;
    }

    @Ignore @JsonProperty("BTC_ETH")
    public void setBTCETH(BTCETH bTCETH) {
        this.bTCETH = bTCETH;
    }

    @Ignore @JsonProperty("USDT_ETH")
    public USDTETH getUSDTETH() {
        return uSDTETH;
    }

    @Ignore @JsonProperty("USDT_ETH")
    public void setUSDTETH(USDTETH uSDTETH) {
        this.uSDTETH = uSDTETH;
    }

    @Ignore @JsonProperty("BTC_SC")
    public BTCSC getBTCSC() {
        return bTCSC;
    }

    @Ignore @JsonProperty("BTC_SC")
    public void setBTCSC(BTCSC bTCSC) {
        this.bTCSC = bTCSC;
    }

    @Ignore @JsonProperty("BTC_DCR")
    public BTCDCR getBTCDCR() {
        return bTCDCR;
    }

    @Ignore @JsonProperty("BTC_DCR")
    public void setBTCDCR(BTCDCR bTCDCR) {
        this.bTCDCR = bTCDCR;
    }

    @Ignore @JsonProperty("BTC_LSK")
    public BTCLSK getBTCLSK() {
        return bTCLSK;
    }

    @Ignore @JsonProperty("BTC_LSK")
    public void setBTCLSK(BTCLSK bTCLSK) {
        this.bTCLSK = bTCLSK;
    }

    @Ignore @JsonProperty("BTC_ETC")
    public BTCETC getBTCETC() {
        return bTCETC;
    }

    @Ignore @JsonProperty("BTC_ETC")
    public void setBTCETC(BTCETC bTCETC) {
        this.bTCETC = bTCETC;
    }

    @Ignore @JsonProperty("ETH_ETC")
    public ETHETC getETHETC() {
        return eTHETC;
    }

    @Ignore @JsonProperty("ETH_ETC")
    public void setETHETC(ETHETC eTHETC) {
        this.eTHETC = eTHETC;
    }

    @Ignore @JsonProperty("USDT_ETC")
    public USDTETC getUSDTETC() {
        return uSDTETC;
    }

    @Ignore @JsonProperty("USDT_ETC")
    public void setUSDTETC(USDTETC uSDTETC) {
        this.uSDTETC = uSDTETC;
    }

    @Ignore @JsonProperty("BTC_REP")
    public BTCREP getBTCREP() {
        return bTCREP;
    }

    @Ignore @JsonProperty("BTC_REP")
    public void setBTCREP(BTCREP bTCREP) {
        this.bTCREP = bTCREP;
    }

    @Ignore @JsonProperty("USDT_REP")
    public USDTREP getUSDTREP() {
        return uSDTREP;
    }

    @Ignore @JsonProperty("USDT_REP")
    public void setUSDTREP(USDTREP uSDTREP) {
        this.uSDTREP = uSDTREP;
    }

    @Ignore @JsonProperty("ETH_REP")
    public ETHREP getETHREP() {
        return eTHREP;
    }

    @Ignore @JsonProperty("ETH_REP")
    public void setETHREP(ETHREP eTHREP) {
        this.eTHREP = eTHREP;
    }

    @Ignore @JsonProperty("BTC_ARDR")
    public BTCARDR getBTCARDR() {
        return bTCARDR;
    }

    @Ignore @JsonProperty("BTC_ARDR")
    public void setBTCARDR(BTCARDR bTCARDR) {
        this.bTCARDR = bTCARDR;
    }

    @Ignore @JsonProperty("BTC_ZEC")
    public BTCZEC getBTCZEC() {
        return bTCZEC;
    }

    @Ignore @JsonProperty("BTC_ZEC")
    public void setBTCZEC(BTCZEC bTCZEC) {
        this.bTCZEC = bTCZEC;
    }

    @Ignore @JsonProperty("ETH_ZEC")
    public ETHZEC getETHZEC() {
        return eTHZEC;
    }

    @Ignore @JsonProperty("ETH_ZEC")
    public void setETHZEC(ETHZEC eTHZEC) {
        this.eTHZEC = eTHZEC;
    }

    @Ignore @JsonProperty("USDT_ZEC")
    public USDTZEC getUSDTZEC() {
        return uSDTZEC;
    }

    @Ignore @JsonProperty("USDT_ZEC")
    public void setUSDTZEC(USDTZEC uSDTZEC) {
        this.uSDTZEC = uSDTZEC;
    }

    @Ignore @JsonProperty("BTC_STRAT")
    public BTCSTRAT getBTCSTRAT() {
        return bTCSTRAT;
    }

    @Ignore @JsonProperty("BTC_STRAT")
    public void setBTCSTRAT(BTCSTRAT bTCSTRAT) {
        this.bTCSTRAT = bTCSTRAT;
    }

    @Ignore @JsonProperty("BTC_GNT")
    public BTCGNT getBTCGNT() {
        return bTCGNT;
    }

    @Ignore @JsonProperty("BTC_GNT")
    public void setBTCGNT(BTCGNT bTCGNT) {
        this.bTCGNT = bTCGNT;
    }

    @Ignore @JsonProperty("BTC_ZRX")
    public BTCZRX getBTCZRX() {
        return bTCZRX;
    }

    @Ignore @JsonProperty("BTC_ZRX")
    public void setBTCZRX(BTCZRX bTCZRX) {
        this.bTCZRX = bTCZRX;
    }

    @Ignore @JsonProperty("ETH_ZRX")
    public ETHZRX getETHZRX() {
        return eTHZRX;
    }

    @Ignore @JsonProperty("ETH_ZRX")
    public void setETHZRX(ETHZRX eTHZRX) {
        this.eTHZRX = eTHZRX;
    }

    @Ignore @JsonProperty("BTC_CVC")
    public BTCCVC getBTCCVC() {
        return bTCCVC;
    }

    @Ignore @JsonProperty("BTC_CVC")
    public void setBTCCVC(BTCCVC bTCCVC) {
        this.bTCCVC = bTCCVC;
    }

    @Ignore @JsonProperty("BTC_OMG")
    public BTCOMG getBTCOMG() {
        return bTCOMG;
    }

    @Ignore @JsonProperty("BTC_OMG")
    public void setBTCOMG(BTCOMG bTCOMG) {
        this.bTCOMG = bTCOMG;
    }

    @Ignore @JsonProperty("BTC_GAS")
    public BTCGAS getBTCGAS() {
        return bTCGAS;
    }

    @Ignore @JsonProperty("BTC_GAS")
    public void setBTCGAS(BTCGAS bTCGAS) {
        this.bTCGAS = bTCGAS;
    }

    @Ignore @JsonProperty("BTC_STORJ")
    public BTCSTORJ getBTCSTORJ() {
        return bTCSTORJ;
    }

    @Ignore @JsonProperty("BTC_STORJ")
    public void setBTCSTORJ(BTCSTORJ bTCSTORJ) {
        this.bTCSTORJ = bTCSTORJ;
    }

    @Ignore @JsonProperty("BTC_EOS")
    public BTCEOS getBTCEOS() {
        return bTCEOS;
    }

    @Ignore @JsonProperty("BTC_EOS")
    public void setBTCEOS(BTCEOS bTCEOS) {
        this.bTCEOS = bTCEOS;
    }

    @Ignore @JsonProperty("ETH_EOS")
    public ETHEOS getETHEOS() {
        return eTHEOS;
    }

    @Ignore @JsonProperty("ETH_EOS")
    public void setETHEOS(ETHEOS eTHEOS) {
        this.eTHEOS = eTHEOS;
    }

    @Ignore @JsonProperty("USDT_EOS")
    public USDTEOS getUSDTEOS() {
        return uSDTEOS;
    }

    @Ignore @JsonProperty("USDT_EOS")
    public void setUSDTEOS(USDTEOS uSDTEOS) {
        this.uSDTEOS = uSDTEOS;
    }

    @Ignore @JsonProperty("BTC_SNT")
    public BTCSNT getBTCSNT() {
        return bTCSNT;
    }

    @Ignore @JsonProperty("BTC_SNT")
    public void setBTCSNT(BTCSNT bTCSNT) {
        this.bTCSNT = bTCSNT;
    }

    @Ignore @JsonProperty("BTC_KNC")
    public BTCKNC getBTCKNC() {
        return bTCKNC;
    }

    @Ignore @JsonProperty("BTC_KNC")
    public void setBTCKNC(BTCKNC bTCKNC) {
        this.bTCKNC = bTCKNC;
    }

    @Ignore @JsonProperty("BTC_BAT")
    public BTCBAT getBTCBAT() {
        return bTCBAT;
    }

    @Ignore @JsonProperty("BTC_BAT")
    public void setBTCBAT(BTCBAT bTCBAT) {
        this.bTCBAT = bTCBAT;
    }

    @Ignore @JsonProperty("ETH_BAT")
    public ETHBAT getETHBAT() {
        return eTHBAT;
    }

    @Ignore @JsonProperty("ETH_BAT")
    public void setETHBAT(ETHBAT eTHBAT) {
        this.eTHBAT = eTHBAT;
    }

    @Ignore @JsonProperty("USDT_BAT")
    public USDTBAT getUSDTBAT() {
        return uSDTBAT;
    }

    @Ignore @JsonProperty("USDT_BAT")
    public void setUSDTBAT(USDTBAT uSDTBAT) {
        this.uSDTBAT = uSDTBAT;
    }

    @Ignore @JsonProperty("BTC_LOOM")
    public BTCLOOM getBTCLOOM() {
        return bTCLOOM;
    }

    @Ignore @JsonProperty("BTC_LOOM")
    public void setBTCLOOM(BTCLOOM bTCLOOM) {
        this.bTCLOOM = bTCLOOM;
    }

    @Ignore @JsonProperty("USDT_DOGE")
    public USDTDOGE getUSDTDOGE() {
        return uSDTDOGE;
    }

    @Ignore @JsonProperty("USDT_DOGE")
    public void setUSDTDOGE(USDTDOGE uSDTDOGE) {
        this.uSDTDOGE = uSDTDOGE;
    }

    @Ignore @JsonProperty("USDT_GNT")
    public USDTGNT getUSDTGNT() {
        return uSDTGNT;
    }

    @Ignore @JsonProperty("USDT_GNT")
    public void setUSDTGNT(USDTGNT uSDTGNT) {
        this.uSDTGNT = uSDTGNT;
    }

    @Ignore @JsonProperty("USDT_LSK")
    public USDTLSK getUSDTLSK() {
        return uSDTLSK;
    }

    @Ignore @JsonProperty("USDT_LSK")
    public void setUSDTLSK(USDTLSK uSDTLSK) {
        this.uSDTLSK = uSDTLSK;
    }

    @Ignore @JsonProperty("USDT_SC")
    public USDTSC getUSDTSC() {
        return uSDTSC;
    }

    @Ignore @JsonProperty("USDT_SC")
    public void setUSDTSC(USDTSC uSDTSC) {
        this.uSDTSC = uSDTSC;
    }

    @Ignore @JsonProperty("USDT_ZRX")
    public USDTZRX getUSDTZRX() {
        return uSDTZRX;
    }

    @Ignore @JsonProperty("USDT_ZRX")
    public void setUSDTZRX(USDTZRX uSDTZRX) {
        this.uSDTZRX = uSDTZRX;
    }

    @Ignore @JsonProperty("BTC_QTUM")
    public BTCQTUM getBTCQTUM() {
        return bTCQTUM;
    }

    @Ignore @JsonProperty("BTC_QTUM")
    public void setBTCQTUM(BTCQTUM bTCQTUM) {
        this.bTCQTUM = bTCQTUM;
    }

    @Ignore @JsonProperty("USDT_QTUM")
    public USDTQTUM getUSDTQTUM() {
        return uSDTQTUM;
    }

    @Ignore @JsonProperty("USDT_QTUM")
    public void setUSDTQTUM(USDTQTUM uSDTQTUM) {
        this.uSDTQTUM = uSDTQTUM;
    }

    @Ignore @JsonProperty("USDC_BTC")
    public USDCBTC getUSDCBTC() {
        return uSDCBTC;
    }

    @Ignore @JsonProperty("USDC_BTC")
    public void setUSDCBTC(USDCBTC uSDCBTC) {
        this.uSDCBTC = uSDCBTC;
    }

    @Ignore @JsonProperty("USDC_ETH")
    public USDCETH getUSDCETH() {
        return uSDCETH;
    }

    @Ignore @JsonProperty("USDC_ETH")
    public void setUSDCETH(USDCETH uSDCETH) {
        this.uSDCETH = uSDCETH;
    }

    @Ignore @JsonProperty("USDC_USDT")
    public USDCUSDT getUSDCUSDT() {
        return uSDCUSDT;
    }

    @Ignore @JsonProperty("USDC_USDT")
    public void setUSDCUSDT(USDCUSDT uSDCUSDT) {
        this.uSDCUSDT = uSDCUSDT;
    }

    @Ignore @JsonProperty("BTC_MANA")
    public BTCMANA getBTCMANA() {
        return bTCMANA;
    }

    @Ignore @JsonProperty("BTC_MANA")
    public void setBTCMANA(BTCMANA bTCMANA) {
        this.bTCMANA = bTCMANA;
    }

    @Ignore @JsonProperty("USDT_MANA")
    public USDTMANA getUSDTMANA() {
        return uSDTMANA;
    }

    @Ignore @JsonProperty("USDT_MANA")
    public void setUSDTMANA(USDTMANA uSDTMANA) {
        this.uSDTMANA = uSDTMANA;
    }

    @Ignore @JsonProperty("BTC_BNT")
    public BTCBNT getBTCBNT() {
        return bTCBNT;
    }

    @Ignore @JsonProperty("BTC_BNT")
    public void setBTCBNT(BTCBNT bTCBNT) {
        this.bTCBNT = bTCBNT;
    }

    @Ignore @JsonProperty("BTC_BCHABC")
    public BTCBCHABC getBTCBCHABC() {
        return bTCBCHABC;
    }

    @Ignore @JsonProperty("BTC_BCHABC")
    public void setBTCBCHABC(BTCBCHABC bTCBCHABC) {
        this.bTCBCHABC = bTCBCHABC;
    }

    @Ignore @JsonProperty("USDC_BCHABC")
    public USDCBCHABC getUSDCBCHABC() {
        return uSDCBCHABC;
    }

    @Ignore @JsonProperty("USDC_BCHABC")
    public void setUSDCBCHABC(USDCBCHABC uSDCBCHABC) {
        this.uSDCBCHABC = uSDCBCHABC;
    }

    @Ignore @JsonProperty("BTC_BCHSV")
    public BTCBCHSV getBTCBCHSV() {
        return bTCBCHSV;
    }

    @Ignore @JsonProperty("BTC_BCHSV")
    public void setBTCBCHSV(BTCBCHSV bTCBCHSV) {
        this.bTCBCHSV = bTCBCHSV;
    }

    @Ignore @JsonProperty("USDC_BCHSV")
    public USDCBCHSV getUSDCBCHSV() {
        return uSDCBCHSV;
    }

    @Ignore @JsonProperty("USDC_BCHSV")
    public void setUSDCBCHSV(USDCBCHSV uSDCBCHSV) {
        this.uSDCBCHSV = uSDCBCHSV;
    }

    @Ignore @JsonProperty("USDC_XRP")
    public USDCXRP getUSDCXRP() {
        return uSDCXRP;
    }

    @Ignore @JsonProperty("USDC_XRP")
    public void setUSDCXRP(USDCXRP uSDCXRP) {
        this.uSDCXRP = uSDCXRP;
    }

    @Ignore @JsonProperty("USDC_XMR")
    public USDCXMR getUSDCXMR() {
        return uSDCXMR;
    }

    @Ignore @JsonProperty("USDC_XMR")
    public void setUSDCXMR(USDCXMR uSDCXMR) {
        this.uSDCXMR = uSDCXMR;
    }

    @Ignore @JsonProperty("USDC_STR")
    public USDCSTR getUSDCSTR() {
        return uSDCSTR;
    }

    @Ignore @JsonProperty("USDC_STR")
    public void setUSDCSTR(USDCSTR uSDCSTR) {
        this.uSDCSTR = uSDCSTR;
    }

    @Ignore @JsonProperty("USDC_DOGE")
    public USDCDOGE getUSDCDOGE() {
        return uSDCDOGE;
    }

    @Ignore @JsonProperty("USDC_DOGE")
    public void setUSDCDOGE(USDCDOGE uSDCDOGE) {
        this.uSDCDOGE = uSDCDOGE;
    }

    @Ignore @JsonProperty("USDC_LTC")
    public USDCLTC getUSDCLTC() {
        return uSDCLTC;
    }

    @Ignore @JsonProperty("USDC_LTC")
    public void setUSDCLTC(USDCLTC uSDCLTC) {
        this.uSDCLTC = uSDCLTC;
    }

    @Ignore @JsonProperty("USDC_ZEC")
    public USDCZEC getUSDCZEC() {
        return uSDCZEC;
    }

    @Ignore @JsonProperty("USDC_ZEC")
    public void setUSDCZEC(USDCZEC uSDCZEC) {
        this.uSDCZEC = uSDCZEC;
    }

    @Ignore @JsonProperty("BTC_FOAM")
    public BTCFOAM getBTCFOAM() {
        return bTCFOAM;
    }

    @Ignore @JsonProperty("BTC_FOAM")
    public void setBTCFOAM(BTCFOAM bTCFOAM) {
        this.bTCFOAM = bTCFOAM;
    }

    @Ignore @JsonProperty("BTC_NMR")
    public BTCNMR getBTCNMR() {
        return bTCNMR;
    }

    @Ignore @JsonProperty("BTC_NMR")
    public void setBTCNMR(BTCNMR bTCNMR) {
        this.bTCNMR = bTCNMR;
    }

    @Ignore @JsonProperty("BTC_POLY")
    public BTCPOLY getBTCPOLY() {
        return bTCPOLY;
    }

    @Ignore @JsonProperty("BTC_POLY")
    public void setBTCPOLY(BTCPOLY bTCPOLY) {
        this.bTCPOLY = bTCPOLY;
    }

    @Ignore @JsonProperty("BTC_LPT")
    public BTCLPT getBTCLPT() {
        return bTCLPT;
    }

    @Ignore @JsonProperty("BTC_LPT")
    public void setBTCLPT(BTCLPT bTCLPT) {
        this.bTCLPT = bTCLPT;
    }

    @Ignore @JsonProperty("BTC_GRIN")
    public BTCGRIN getBTCGRIN() {
        return bTCGRIN;
    }

    @Ignore @JsonProperty("BTC_GRIN")
    public void setBTCGRIN(BTCGRIN bTCGRIN) {
        this.bTCGRIN = bTCGRIN;
    }

    @Ignore @JsonProperty("USDC_GRIN")
    public USDCGRIN getUSDCGRIN() {
        return uSDCGRIN;
    }

    @Ignore @JsonProperty("USDC_GRIN")
    public void setUSDCGRIN(USDCGRIN uSDCGRIN) {
        this.uSDCGRIN = uSDCGRIN;
    }

    @Ignore @JsonProperty("BTC_ATOM")
    public BTCATOM getBTCATOM() {
        return bTCATOM;
    }

    @Ignore @JsonProperty("BTC_ATOM")
    public void setBTCATOM(BTCATOM bTCATOM) {
        this.bTCATOM = bTCATOM;
    }

    @Ignore @JsonProperty("USDC_ATOM")
    public USDCATOM getUSDCATOM() {
        return uSDCATOM;
    }

    @Ignore @JsonProperty("USDC_ATOM")
    public void setUSDCATOM(USDCATOM uSDCATOM) {
        this.uSDCATOM = uSDCATOM;
    }

    @Ignore @JsonProperty("USDT_ATOM")
    public USDTATOM getUSDTATOM() {
        return uSDTATOM;
    }

    @Ignore @JsonProperty("USDT_ATOM")
    public void setUSDTATOM(USDTATOM uSDTATOM) {
        this.uSDTATOM = uSDTATOM;
    }

    @Ignore @JsonProperty("USDC_DASH")
    public USDCDASH getUSDCDASH() {
        return uSDCDASH;
    }

    @Ignore @JsonProperty("USDC_DASH")
    public void setUSDCDASH(USDCDASH uSDCDASH) {
        this.uSDCDASH = uSDCDASH;
    }

    @Ignore @JsonProperty("USDC_EOS")
    public USDCEOS getUSDCEOS() {
        return uSDCEOS;
    }

    @Ignore @JsonProperty("USDC_EOS")
    public void setUSDCEOS(USDCEOS uSDCEOS) {
        this.uSDCEOS = uSDCEOS;
    }

    @Ignore @JsonProperty("USDC_ETC")
    public USDCETC getUSDCETC() {
        return uSDCETC;
    }

    @Ignore @JsonProperty("USDC_ETC")
    public void setUSDCETC(USDCETC uSDCETC) {
        this.uSDCETC = uSDCETC;
    }

    @Ignore @JsonProperty("USDT_BCHSV")
    public USDTBCHSV getUSDTBCHSV() {
        return uSDTBCHSV;
    }

    @Ignore @JsonProperty("USDT_BCHSV")
    public void setUSDTBCHSV(USDTBCHSV uSDTBCHSV) {
        this.uSDTBCHSV = uSDTBCHSV;
    }

    @Ignore @JsonProperty("USDT_BCHABC")
    public USDTBCHABC getUSDTBCHABC() {
        return uSDTBCHABC;
    }

    @Ignore @JsonProperty("USDT_BCHABC")
    public void setUSDTBCHABC(USDTBCHABC uSDTBCHABC) {
        this.uSDTBCHABC = uSDTBCHABC;
    }

    @Ignore @JsonProperty("USDT_GRIN")
    public USDTGRIN getUSDTGRIN() {
        return uSDTGRIN;
    }

    @Ignore @JsonProperty("USDT_GRIN")
    public void setUSDTGRIN(USDTGRIN uSDTGRIN) {
        this.uSDTGRIN = uSDTGRIN;
    }

    @Ignore @JsonProperty("BTC_TRX")
    public BTCTRX getBTCTRX() {
        return bTCTRX;
    }

    @Ignore @JsonProperty("BTC_TRX")
    public void setBTCTRX(BTCTRX bTCTRX) {
        this.bTCTRX = bTCTRX;
    }

    @Ignore @JsonProperty("USDC_TRX")
    public USDCTRX getUSDCTRX() {
        return uSDCTRX;
    }

    @Ignore @JsonProperty("USDC_TRX")
    public void setUSDCTRX(USDCTRX uSDCTRX) {
        this.uSDCTRX = uSDCTRX;
    }

    @Ignore @JsonProperty("USDT_TRX")
    public USDTTRX getUSDTTRX() {
        return uSDTTRX;
    }

    @Ignore @JsonProperty("USDT_TRX")
    public void setUSDTTRX(USDTTRX uSDTTRX) {
        this.uSDTTRX = uSDTTRX;
    }

    @Ignore @JsonProperty("BTC_ETHBNT")
    public BTCETHBNT getBTCETHBNT() {
        return bTCETHBNT;
    }

    @Ignore @JsonProperty("BTC_ETHBNT")
    public void setBTCETHBNT(BTCETHBNT bTCETHBNT) {
        this.bTCETHBNT = bTCETHBNT;
    }

    @Ignore @JsonProperty("TRX_ETH")
    public TRXETH getTRXETH() {
        return tRXETH;
    }

    @Ignore @JsonProperty("TRX_ETH")
    public void setTRXETH(TRXETH tRXETH) {
        this.tRXETH = tRXETH;
    }

    @Ignore @JsonProperty("TRX_XRP")
    public TRXXRP getTRXXRP() {
        return tRXXRP;
    }

    @Ignore @JsonProperty("TRX_XRP")
    public void setTRXXRP(TRXXRP tRXXRP) {
        this.tRXXRP = tRXXRP;
    }

    @Ignore @JsonProperty("BTC_BTT")
    public BTCBTT getBTCBTT() {
        return bTCBTT;
    }

    @Ignore @JsonProperty("BTC_BTT")
    public void setBTCBTT(BTCBTT bTCBTT) {
        this.bTCBTT = bTCBTT;
    }

    @Ignore @JsonProperty("USDT_BTT")
    public USDTBTT getUSDTBTT() {
        return uSDTBTT;
    }

    @Ignore @JsonProperty("USDT_BTT")
    public void setUSDTBTT(USDTBTT uSDTBTT) {
        this.uSDTBTT = uSDTBTT;
    }

    @Ignore @JsonProperty("TRX_BTT")
    public TRXBTT getTRXBTT() {
        return tRXBTT;
    }

    @Ignore @JsonProperty("TRX_BTT")
    public void setTRXBTT(TRXBTT tRXBTT) {
        this.tRXBTT = tRXBTT;
    }

    @Ignore @JsonProperty("USDT_WIN")
    public USDTWIN getUSDTWIN() {
        return uSDTWIN;
    }

    @Ignore @JsonProperty("USDT_WIN")
    public void setUSDTWIN(USDTWIN uSDTWIN) {
        this.uSDTWIN = uSDTWIN;
    }

    @Ignore @JsonProperty("TRX_WIN")
    public TRXWIN getTRXWIN() {
        return tRXWIN;
    }

    @Ignore @JsonProperty("TRX_WIN")
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
