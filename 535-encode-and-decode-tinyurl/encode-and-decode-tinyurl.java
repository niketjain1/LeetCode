public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < longUrl.length()) {
            int c = (int)longUrl.charAt(i);
            c += 10;
            char newChar = (char)c;
            sb.append(newChar);
            i++;
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < shortUrl.length()) {
            int c = (int)shortUrl.charAt(i);
            c -= 10;
            char newChar = (char)c;
            sb.append(newChar);
            i++;
        }
        return sb.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));