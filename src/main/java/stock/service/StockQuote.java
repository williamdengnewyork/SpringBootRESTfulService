package stock.service;

public class StockQuote {

    private long id;
    private String t;  //ticker
    private String e; //exchange
    private double l;  //last price
	private double l_fix;  //fix price
    private double l_cur;  //cur price
    private String s; 
    private String ltt;  //short time
    private String lt;   // long time
    private String lt_dts;   // dts time
    private String c;
    private String c_fix;
    private String cp;
    private String cp_fix;
    private String ccol;
    private String pcls_fix;
    /*
    {
    	"id": "358464"
    	,"t" : "MSFT"
    	,"e" : "NASDAQ"
    	,"l" : "65.86"
    	,"l_fix" : "65.86"
    	,"l_cur" : "65.86"
    	,"s": "0"
    	,"ltt":"4:00PM EDT"
    	,"lt" : "Mar 31, 4:00PM EDT"
    	,"lt_dts" : "2017-03-31T16:00:03Z"
    	,"c" : "+0.15"
    	,"c_fix" : "0.15"
    	,"cp" : "0.23"
    	,"cp_fix" : "0.23"
    	,"ccol" : "chg"
    	,"pcls_fix" : "65.71"
    	} 
    */
    
    public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public double getL_fix() {
		return l_fix;
	}

	public void setL_fix(double l_fix) {
		this.l_fix = l_fix;
	}

	public double getL_cur() {
		return l_cur;
	}

	public void setL_cur(double l_cur) {
		this.l_cur = l_cur;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getLtt() {
		return ltt;
	}

	public void setLtt(String ltt) {
		this.ltt = ltt;
	}

	public String getLt() {
		return lt;
	}

	public void setLt(String lt) {
		this.lt = lt;
	}

	public String getLt_dts() {
		return lt_dts;
	}

	public void setLt_dts(String lt_dts) {
		this.lt_dts = lt_dts;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getC_fix() {
		return c_fix;
	}

	public void setC_fix(String c_fix) {
		this.c_fix = c_fix;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCp_fix() {
		return cp_fix;
	}

	public void setCp_fix(String cp_fix) {
		this.cp_fix = cp_fix;
	}

	public String getCcol() {
		return ccol;
	}

	public void setCcol(String ccol) {
		this.ccol = ccol;
	}

	public String getPcls_fix() {
		return pcls_fix;
	}

	public void setPcls_fix(String pcls_fix) {
		this.pcls_fix = pcls_fix;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setT(String t) {
		this.t = t;
	}

	public void setL(double l) {
		this.l = l;
	}

	// dummy default constructor to avoid Jackson com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of stock.service.StockQuote: no suitable constructor found, can not deserialize from Object value
    public StockQuote(){
    }


	// getxxx() send the field to REST response object
    public long getId() {
        return id;
    }

	public String getT() {
		return t;
	}

	public double getL() {
		return l;
	}

	@Override
	public String toString() {
		return "StockQuote [id=" + id + ", t=" + t + ", l=" + l + "]";
	}
    
}
