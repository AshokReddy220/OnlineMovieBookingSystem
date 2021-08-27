
public class ValidateTheCardDeatils {
	String Str;
	public String validateCardNumber(String cardname) throws Exception{
		
		if( cardname.length()<=15){
			throw new Exception();
		}
		else if(cardname.length()>=15){
			throw new Exception();
		}
		if( cardname.length()==15){
			Str = " card number is correct";
		}
		return Str;
	}
	public String validateCVV(String Str) throws Exception{
		if( Str.length()== 3){
			Str ="cvv is correct";
		}
		return Str;
		}
		}

