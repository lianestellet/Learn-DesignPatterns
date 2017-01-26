package beverage;

public abstract class Beverage {
	
	public String description = "Unknow Beverage";
	public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    
	public String getDescription(){
		return description;	
	}
	
	public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
	
	public abstract double cost();	
	
}
