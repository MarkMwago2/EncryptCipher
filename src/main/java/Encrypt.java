public class Encrypt {
    private String mName;
    private int mKey;

    public int getmKey() {
        return mKey;
    }

    public String getmName() {
        return mName;
    }

    public Encrypt(String name, int key){
        mName = name;
        mKey = key;
    }
    public String Encrypt(){
        String result = "";
        for (int i= 0; i<mName.length(); i++) {
            char ch = mName.charAt(i);
            char shifted = (char) (ch + mKey);
            result += shifted;
        }
        return result;
        }
    }

