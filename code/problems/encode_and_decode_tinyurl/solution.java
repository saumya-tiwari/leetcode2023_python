public class Codec {
    
    String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    HashMap<String, String> map = new HashMap<>();
    Random rand = new Random();
    String key = getRandom();
    
    
    public String getRandom(){
        StringBuilder sb = new StringBuilder();
        
        for(int i  =0 ; i < 6 ; i++){
            sb.append(alphabet.charAt(rand.nextInt(62)));
        }
        
        return sb.toString();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        while(map.containsKey(key))
            key = getRandom();
        
        map.put(key, longUrl);
        return "https://tinyurl.com/" + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        return map.get(shortUrl.replace("https://tinyurl.com/",""));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));