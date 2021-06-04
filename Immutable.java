
public class Immutable {
	final String foodName;
	final String drinkName;
	final String desserts;
	
public Immutable(String foodName,String drinkName,String desserts) {
	this.foodName = foodName;
	this.drinkName=drinkName;
	this.desserts=desserts;
}	
public String getFoodName() {
	return foodName;

}
public String getdrinkName() {
	return drinkName;

}
public String getdesserts() {
	return desserts;
}
}
