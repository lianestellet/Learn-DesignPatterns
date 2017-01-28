package beverage;

public abstract class Beverage {
	
	public String description = "Unknow Beverage";
	public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    
	public String getDescription(){
		return sizeCaseFormat() + description;	
	}
	
	public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
    
    public String sizeCaseFormat(){
    	String result = size.name() + " ";    	
    	result = result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();
    	return result;
    }
	
	public abstract double cost();	
	
}
