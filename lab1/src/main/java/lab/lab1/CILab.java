package lab.lab1;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }
    
    @Override
    public boolean detectCapitalUse() {
    	int upperCase=0;
    	int lowerCase=0;
        for (int i=0; i<myString.length(); i++) {
        	char c=myString.charAt(i);
        	if (c>='A' && c<='Z') {
        		upperCase+=1;
        	}
        	else if(c>='a' && c<='z') {
        		lowerCase+=1;
        	}
        }
        if(upperCase==myString.length() || lowerCase==myString.length()) {
        	return true;
        }
        char a=myString.charAt(0);
        if (a>='A' && a<='Z') {
        	if(lowerCase==myString.length()-1) {
        		return true;
        	}
        }
        return false;
    }

}