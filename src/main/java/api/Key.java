package api;

public class Key {

    static final String key = "d8552a32de0f891803fb84dba8aed5b7";

    /**
     * This method in real life application will do a get call to get a token
     * from the backend. This token will change every few hours. for the sake of this
     * exercise, I will use a static key that will never change that I got when I signed up
     * for the weather api at https://openweathermap.org/
     *
     * @param  N/A
     * @return String representing the key to append to the URL to authenticate the user.
     */
    static String getKey() {
        return key;
    }
}
