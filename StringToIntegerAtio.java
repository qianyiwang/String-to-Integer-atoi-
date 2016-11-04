public class StringToIntegerAtio {
    public int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }
        
        String valueStr = parseInteger(str);
        String sign = valueStr.charAt(0) + "";
        if(valueStr.length()==0){
            return 0;
        }
        String res = "";
   //      if(sign.equals("-")){
   //      	res = "-"+valueStr;
   //          System.out.println("nagtive:"+res);
   //      }
   //      else{
			// res = valueStr;
   //      }
        try{
            return Integer.parseInt(valueStr);
        }catch(NumberFormatException e){
            return 0;
        }
        
    }

    public String parseInteger(String s){
    	String standardStr = "1234567890";
        String sign = "";
    	StringBuilder sb = new StringBuilder();
    	for (int i=0; i<s.length(); i++){
    		String c = s.charAt(i) + "";
    		if(standardStr.contains(c)){
    			sb.append(c);
    		}
            else if(sign.length()==0 && (c.equals("+") || c.equals("-"))){
                sign = c;
            }
            else if((c.equals(" ")&&sb.length()==0)||(c.equals("0")&&sb.length()==0)){
                continue;
            }
            else{
                sb = new StringBuilder();
                sb.append(0);
                break;
            }
    	}

    	if(sign.length()==0)
        {
            return sb.toString();
        }
        else{
            return sign+sb.toString();
        }
    }

    public static void main(String args[]){
        StringToIntegerAtio si = new StringToIntegerAtio();
        System.out.println(si.myAtoi("-1"));
    }
}