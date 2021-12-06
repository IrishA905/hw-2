public class NameEncoderDecoder {
    public String encode(String name) {
      String encodeName = name.replace("e", "1");
          String nameD1 = encodeName.replace("u", "2");
         String nameD2 = nameD1.replace("i", "3");
          String nameD3  = nameD2.replace("o", "4");
          String nameD4 = nameD3.replace("a", "5");
              return "NOTFORYOU" + nameD4 + "YESNOTFORYOU";    
    }
  
  public String decode(String name){
      String nameDecode1 = name.replace("NOTFORYOU", "");
      String nameDecode2 = nameDecode1.replace("YES", "");
      String nameD1 = nameDecode2.replace("1", "e");
          String nameD2 = nameD1.replace("2", "u");
          String nameD3 = nameD2.replace("3", "i");
         String nameD4 = nameD3.replace("4", "o");
          String nameD5 = nameD4.replace("5", "a");
              return nameD5;
  }
}
