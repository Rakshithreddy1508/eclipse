package Collections;


	public class Vehicle {

	    private String engineCode;
	    private String name;
	    private String modelNo;



	    public Vehicle(String engineCode, String name, String modelNo) {

	        this.engineCode = engineCode;
	        this.name = name;
	        this.modelNo = modelNo;

	    }
	    public String getEngineCode() {
	        return engineCode;

	    }

	    public void setEngineCode(String engineCode) {
	        this.engineCode = engineCode;

	    }

	    public String getName() {
	       return name;

	    }

	    public void setName(String name) {
	        this.name = name;

	    }

	    public String getModelNo() {
	        return modelNo;

	    }

	    public void setModelNo(String modelNo) {
	       this.modelNo = modelNo;

	    }

	}