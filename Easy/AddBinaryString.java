package Easy;

public class AddBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String addBinary(String a, String b) {
	    StringBuilder str = new StringBuilder();
        int flag = 0;
        if(b.length() != a.length()){
            flag = a.length() > b.length() ? 1 : 0;
            if(flag == 1){
                b = "0".repeat(a.length() - b.length()) + b;
                
            }
            else{
                a = "0".repeat(b.length() - a.length()) + a;
            }
        }            
        String rem = "";
        for(int i = a.length() - 1;i >= 0 ;i--){
            if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(rem == ""){
                    str.append("0");
                }
                else if(rem == "1"){
                    str.append("1");
                    rem = "1";
                }
                else{
                    str.append("0");
                }
                rem = "1";
            }
            else if((a.charAt(i) == '1' && b.charAt(i) == '0') || (a.charAt(i) == '0' && b.charAt(i) == '1')){
                if(rem == "1"){
                    str.append("0");
                    rem = "1";
                }
                else{
                    str.append("1");
                    rem = "";
                }
            }
            else{
                 if(rem == "1"){
                    str.append("1");
                    rem = "0";
                }
                else{
                    str.append("0");
                }
            }
        }
        
        if(rem == "1")
            str.append("1");
            
        return str.reverse().toString();
    }

}
